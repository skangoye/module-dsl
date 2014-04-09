package org.xtext.mcdc.generator

import org.xtext.moduleDsl.*;
import java.util.ArrayList
import java.util.List
import org.xtext.helper.Couple
import org.xtext.moduleDsl.EXPRESSION
import java.util.Set
import java.util.TreeSet
import org.xtext.types.*
import org.xtext.moduleDsl.INSTRUCTION
import org.xtext.helper.Triplet
import com.ibm.icu.impl.Assert
import com.google.inject.Inject

class MCDC_GEN {
	
	var notCount = 0
	var firstOperator = ""
	
	/**
	 * This method counts the the number of "not" operator crossed before getting a first operator of type "and/or" in the parse tree
	 * Ex: this expression <not (a and b)> returns notCount = 1 while < not a and not b> returns 0 as notCount value.
	 */
	def int notCount(){
		return notCount
	}
	
	/**
	 * This methods returns the first crossed operator of type "and/or" in the parse tree
	 */
	def String firstOperator(){
		return firstOperator
	}
	
	/**
	 * This method stores in the list "resultList" the parse tree's leaf values, as well as theirs corresponding sequences of crossed operator 
	 * and theirs different positions in the parse tree 
	 * It is a top down approach based on a depth-first-search
	 */
	def void mcdcGen(EXPRESSION exp, List<List<Couple< Couple<String, String>, Couple<String, String> >>> resultList){
		
		if(exp instanceof AND){
			//AND operator is crossed => Set position of its siblings (1 for left and 0 for right) and store "a" as their parent
			var leftCouple =  new Couple(new Couple("",""), new Couple("1","a")) 
		    var rightCouple = new Couple(new Couple("",""), new Couple("0","a")) 
			
			firstOperator = "and"
			
			//cast expression as AND
			val andExp = (exp as AND)
			
			//recursive call of enumMcdc method with its siblings
			enumMcdc(andExp.left, leftCouple, resultList)
			enumMcdc(andExp.right, rightCouple, resultList)
			
		}
		else{
			if(exp instanceof OR){
				//OR operator is crossed => Set position of its siblings (1 for left and 0 for right) and store "o" as their parent
				var leftCouple =  new Couple(new Couple("",""), new Couple("1","o")) 
		    	var rightCouple = new Couple(new Couple("",""), new Couple("0","o")) 
				
				firstOperator = "or"
				
				val orExp = (exp as OR)
				
				//recursive call of enumMcdc method with its siblings
				enumMcdc(orExp.left, leftCouple, resultList)
				enumMcdc(orExp.right, rightCouple, resultList)
			}
			else{
				//NOT operator is crossed before an "and/or" operator => increment "notCount"
				if( exp instanceof NOT){
					val notExp = (exp as NOT)
					notCount = notCount + 1
					//No need to define values for the first "not" expression
					//call recursively on mcdcGen
					mcdcGen(notExp.exp, resultList)
				}
				else{ 
					//The expression is a relational condition or a boolean atomic variable and are considered as leaves
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						
						var list = new ArrayList< Couple< Couple<String, String>, Couple<String, String> > >
							
							//Add False and True values to the result list
							list.add(new Couple(new Couple("F","F"), new Couple("","")))
							list.add(new Couple(new Couple("T","T"), new Couple("","")))
						
						resultList.add(list)
					}
					else{
						throw new Exception("Illegal boolean expression")
					}
				}
			}
		}
	}
	
	/**
	 * 
	 */
	def void enumMcdc(EXPRESSION exp, Couple<Couple<String,String>,Couple<String,String>> couple, List<List<Couple< Couple<String, String>, Couple<String, String> >>> result) {
			
		if (exp instanceof AND){
			
			val position = couple.second.first
			val parent = couple.second.second
			
			//the new positions of the operator siblings are its current position + (1 or 0)
			//parent sequences are "a" + the operator current parent sequence
			var leftCouple =  new Couple( new Couple ("",""),  new Couple(position + "1", "a" + parent) )
		    var rightCouple = new Couple( new Couple ("",""),  new Couple(position + "0", "a" + parent) )
		    
		    //recursive call of enumMcdc method with its siblings
			enumMcdc( (exp as AND).left , leftCouple, result )
			enumMcdc( (exp as AND).right , rightCouple, result )
			
		}
		else{
			if (exp instanceof OR){
				
				val position = couple.second.first
				val parent = couple.second.second
				
				var leftCouple =  new Couple( new Couple ("",""),  new Couple(position + "1", "o" + parent) )
			    var rightCouple = new Couple( new Couple ("",""),  new Couple(position + "0", "o" + parent) )
				
				enumMcdc( (exp as OR).left , leftCouple, result )
				enumMcdc( (exp as OR).right , rightCouple, result )
			
			}
			else{
				if (exp instanceof NOT){
					
					val position = couple.second.first
					val parent = couple.second.second
					
					//In case of not operator the position of its sibling is unchanged whereas
					//parent sequence is "n"+ the operator current parent
					var notCouple =  new Couple( new Couple ("",""),  new Couple(position , "n" + parent) )
					
					//recursive call of enumMcdc method with "not" sibling
					enumMcdc((exp as NOT).exp , notCouple, result)
					
				}
				else {
					
					//These expressions are considered as the parse tree leaves
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						
						val position = couple.second.first
						val parent = couple.second.second
						
						var list = new ArrayList< Couple< Couple<String, String>, Couple<String, String> > >
						
						//Add False and True values to the result list and stores theirs corresponding positions and parents sequence
						//in the resultList
						list.add( new Couple( new Couple ("F","F"),  new Couple(position , parent)) ) 
						list.add( new Couple( new Couple ("T","T"),  new Couple(position , parent)) )
						
						result.add(list)
					}
					else{
						throw new Exception("Illegal boolean expression")
					}
				}
			}
			
		}
	}//enumMcdc
	
	/**
	 * This method is a bottom up approach. It merges the parse tree siblings values until reaching its root.
	 * The merging policy is 
	 */
	def List<Couple< Couple<String, String>, Couple<String, String> >> linkValues (List<List<Couple< Couple<String, String>, Couple<String, String> >>> resultList){
		
		var myList = resultList
		
		//raise an exception if there is no values (leaves' values) in the list
		if (myList.size == 0){
			throw new Exception("List is empty") 
		}
		
		var i = 0
		do{
			if(myList.size == 1){
				//if the list size is 1 => return this as result
				//We use notCount here to determine the expressions' outcomes
				if (notCount % 2 == 0){
					//We have even number of "not" crossed before the first (and/or) operator in the parse tree
					return myList.get(0)		
				}
				else{
					//invert values (outcome) in case of odd number of "not" crossed before the first (and/or) operator in the parse tree
					return myList.get(0).invertValues()
				}
				
			}
			
			//Two sequences can be considered as siblings if they are the same parent position
			// e.g. S1 position is "1110" and S2 position is "1111", they are siblings because theirs parents has the same position
			//which is "111"
			val tmpList = myList.get(i)
			val position = tmpList.get(0).second.first
			val parentPosition = position.deleteLastChar
			val toInt = Integer.parseInt(position.getLastChar)
			
			val cmp = myList.findFirst
			[ it != tmpList && ((it.get(0).second.first.deleteLastChar)==(parentPosition)) 
			 && (toInt - Integer.parseInt(it.get(0).second.first.getLastChar)) ==1]
			
			if(cmp != null){
				//they are siblings => merge theirs results
				myList.set(i, mergeResults(tmpList, cmp))
				//delete siblings after their merging
				myList.remove(cmp)
				//System.out.println(myList.size)
			}	
			
		} while ((i=i+1) < myList.size)
		
		//recursive call of the link method with the new list
		linkValues(myList)
	}
	
	/**
	 * This method merge the results of two sequences (Typically two siblings'results) 
	 */
	def List<Couple<Couple<String,String>,Couple<String,String>>> mergeResults(List<Couple<Couple<String,String>,Couple<String,String>>> left, List<Couple<Couple<String,String>,Couple<String,String>>> right) {
		
		var listLeft = left
		var listRight = right
		
		//Next parent of the left sibling in the parent sequence
		var list1NextParent = listLeft.get(0).second.second.charAt(0)
		
		//if the next parent is "not" invert sequences outcome values and delete it in the sequence
		//Repeat the operation until the next parent will be of type "and/or"
		while(list1NextParent.toString == "n"){
			listLeft = invertValues(listLeft)
			list1NextParent = listLeft.get(0).second.second.charAt(0)
		}
		
		//Next parent of the right sibling in the parent sequence
		var list2NextParent = listRight.get(0).second.second.charAt(0)
		
		//if the next parent is "not" invert sequences outcome values and delete it in the sequence
		//Repeat the operation until the next parent is of type "and/or"
		while(list2NextParent.toString == "n"){
			listRight = invertValues(listRight)
			list2NextParent = listRight.get(0).second.second.charAt(0)
		}
		
		//position of the common parent
		//parent sequence of the common parent
		val position = listLeft.get(0).second.first.deleteLastChar
		val parent = listLeft.get(0).second.second.deleteFisrtChar
		
		//
		return optimMerge(listLeft, listRight, list1NextParent.toString , list2NextParent.toString, position, parent)

	}
	
	/**
	 * 
	 */
	def optimMerge(List<Couple<Couple<String,String>,Couple<String,String>>> l1, List<Couple<Couple<String,String>,Couple<String,String>>> l2, String p1, String p2, String position, String parent) {
		
		//Filter sequences in the left list whose outcome are True
		var leftTrue = l1.filter[it.first.second == "T"]
		
		//Filter sequences in the left list whose outcome are False
		var leftFalse = l1.filter[it.first.second == "F"]
		
		var leftCouple = new ArrayList<Couple<String, String>>
		val resultList = new ArrayList< Couple< Couple<String, String>, Couple<String, String> > >
		
		//compose mcdc independent pairs on left list
		for(i: leftFalse){
			for(j: leftTrue){
				if(independantPairs(i.first.first, j.first.first)){
					leftCouple.add(new Couple (i.first.first, j.first.first))
				}
			}
		}
		
		//Filter sequences in the right list whose outcome are True
		var rightTrue = l2.filter[it.first.second == "T"]
		
		//Filter sequences in the right list whose outcome are False
		var rightFalse = l2.filter[it.first.second == "F"]
		
		var rightCouple = new ArrayList<Couple<String, String>>
		
		//compose mcdc independent pairs on right list
		for(ii: rightFalse){
			for(jj: rightTrue){
				if(independantPairs(ii.first.first, jj.first.first)){
					rightCouple.add(new Couple (ii.first.first, jj.first.first))
				}
			}
		}
		
		//will be used to store merge results with True outcome
		val setWithTrue = new TreeSet<String>
		
		//will be used to store merge results with false outcome
		val setWithFalse = new TreeSet<String>
		
		if(p1 != p2){
			//raise an exception if the two siblings has not the same parent sequence
			throw new Exception("Parent mismatch")
		}
		else{
			//p1 = p2
			compute(leftCouple, rightCouple, setWithFalse, setWithTrue, p1)
			
			//return a new list that merged two siblings results with respect to mcdc independent pairs
			for(st: setWithTrue){
				resultList.add(new Couple (new Couple(st ,"T"), new Couple(position, parent)))
			}
			
			for(sf: setWithFalse){
				resultList.add(new Couple (new Couple(sf ,"F"), new Couple(position, parent)))
			}
			
		}//else
		
		return resultList
	}
	
	/**
	 * Compute the merging approach according to the next parent (and/or) and mcdc independent pairs
	 */
	def void compute(ArrayList<Couple<String,String>> list1, ArrayList<Couple<String,String>> list2, Set<String> setF, Set<String> setT, String nextParent) {
		
		if(nextParent == "a"){
			//common parent is an "and" operator
			
			//Pick one sequence whose outcome is True in the right sibling
			val  trueVal = list2.get(0).second 
			
			//merge left sibling values with sequence whose outcome is True in the right sibling results 
			for(i:list1){
				setF.add(i.first + trueVal)
				setT.add(i.second + trueVal)
			}
			 
			//Pick one sequence whose outcome is True in the left sibling
			val tValue = list1.get(0).second
			
			//merge left sibling value whose outcome is True with right sibling results
			for(j: list2){
				setF.add(tValue + j.first)
				setT.add(tValue + j.second)
			}
		}
		
		else{
			//common parent is an "or" operator
			if(nextParent == "o"){
				
				//Pick one sequence whose outcome is False in the right sibling
				val  falseVal = list2.get(0).first 
				
				//merge left sibling values with sequence whose outcome is False in the right sibling results 
				for(i:list1){
					setF.add(i.first + falseVal)
					setT.add(i.second + falseVal)
				}
				
				//Pick one sequence whose outcome is False in the left sibling
				val fVal = list1.get(0).first
				
				//merge left sibling value whose outcome is False with right sibling results 
				for(j: list2){
					setF.add(fVal + j.first)
					setT.add(fVal + j.second)
				}
			}
			else{
				throw new Exception("Invalid parent")
			}
		}
		
	}
	
	/**
	 * Checks whether or not, two string sequences form an independent pair
	 * returns True if two sequences form an independent pair
	 */
	def boolean independantPairs(String str1, String str2) {
		
		val a1 = str1.toCharArray
		val a2 = str2.toCharArray
		val size = str1.length
		
		var a =  ""
		var compatible = false
		var index = -1
		
		if(str1 == str2){
			throw new Exception("Illegal arguments")
		}
		else{
			
			var i =0
			do{	 
				if( a1.get(i) == a2.get(i) ){
					a = a + "0"
				}
				else{
					a = a + "1"
				}
				
			}while( (i=i+1) < size)
			
			var j =0
			var cnt = 0
			var asize = a.length
			//System.out.println(a)
		
			do{
				if(a.charAt(j).toString() == "1"){
					cnt = cnt + 1
					index = j
				}
			} while((j=j+1) < asize)
			
			if(cnt == 1){
				//str1 at cp1 first param compatible with str2 at cp2 first param
				compatible = true;
				//list.add(new Couple (str1,str2))
				
			}
	
		}//else
		return compatible
	}
	
	
	
	/**
	 * This method inverts the outcome value of a sequence and deletes the first character (typically "not") of its parent sequence 
	 */
	def List<Couple<Couple<String,String>,Couple<String,String>>> invertValues(List<Couple<Couple<String,String>,Couple<String,String>>> list) {
		var tmp = list
		for(c: tmp){
			var parent = c.second.second
			if( c.first.second == "F"){
				c.first.setSecond("T")
				c.second.setSecond(parent.deleteFisrtChar)
			}
			else{
				if( c.first.second == "T"){
					c.first.setSecond("F")
					c.second.setSecond(parent.deleteFisrtChar)
				}
				else{
					throw new Exception ("Illegal Boolean value")
				}
			}
		}//for
		
		return tmp
	}
	
	/**
	 * Compute the mcdc of a boolean expression
	 * @param boolExp: The boolean expression for the mcdc criterion generation
	 * @return list<Couple<String, String>> that contains test sequences w.r.t mcdc criterion 
	 */
	 def List<Couple<String, String> > mcdcOfBooleanExp(EXPRESSION boolExp){
	 	val genValues = new ArrayList<List<Couple<Couple<String, String>, Couple<String, String> >>>
	 	val result = new ArrayList<Couple<String, String>>
	 	mcdcGen(boolExp, genValues)
	 	val linkResult = linkValues(genValues)
	 	for(i:linkResult){
	 		result.add(i.first)
	 	}
	 	return result
	 }
	 
	/**
	 * 
	 */
	 var identifier = -1
	 
	 def void mcdcOfInstruction(INSTRUCTION instr, List<EXPRESSION> condList, List< Triplet< List< Couple<String,String>>, List<String>, String > > list, List< Triplet< List<String>, List<String>, String >> shouldBeCoveredList
	 	,List< List< Triplet< List<Couple<String,String>>, List<String>, String > > > resultList) {
	 	
	 	if (instr instanceof IF_INSTR){
	 		
	 		identifier = identifier + 1
	 		
	 		val myInstr = (instr as IF_INSTR)
	 		val cond = myInstr.ifcond
	 		condList.add(identifier, cond )
	 		val mcdcEvalOfCond = mcdcOfBooleanExp(cond)
	 		
	 		val List<String> listOfValues = new ArrayList<String>
	 		
	 		mcdcEvalOfCond.forEach[t| listOfValues.add(t.first)]
	 		
	 		val falseEvalOfMcdc = mcdcEvalOfCond.filter[it.second == "F"].toList
	 		val trueEvalOfMcdc = mcdcEvalOfCond.filter[it.second == "T"].toList
	 		
	 		var List<String> varInCond = new ArrayList<String> 
	 		stringReprOfVar(cond, varInCond)
	 		
	 		shouldBeCoveredList.add( new Triplet(varInCond, listOfValues, identifier.toString) )

	 		var listT = new ArrayList< Triplet < List<Couple<String,String>>, List<String>, String > > //merge(list, trueEval)
	 		var listF = new ArrayList< Triplet < List<Couple<String,String>>, List<String>, String > >
	 		
	 		//Copy elements of the list "list" in listT and ListF 
	 		for(i: list){
	 			listT.add(i)
	 			listF.add(i)
	 		}
	 		
	 		listT.add( new Triplet(trueEvalOfMcdc, varInCond, identifier.toString) )
	 		listF.add( new Triplet(falseEvalOfMcdc, varInCond, identifier.toString) )
	 		
	 		mcdcOfInstruction(myInstr.ifst, condList, listT, shouldBeCoveredList, resultList)
	 		mcdcOfInstruction(myInstr.elst, condList, listF, shouldBeCoveredList, resultList)
	 	}
	 	
	 	else{
	 		if(instr instanceof ASSIGN_INSTR){
	 			//TO DO: implement mcdc of decisions within assign instruction
	 			//val rightAssign = (instr as ASSIGN_INSTR).s
	 			//val tt = merge (list, mcdcOfBooleanExp() )
	 				list.reverse
	 				resultList.add(list)
	 		}
	 		else{
	 			if(instr instanceof ERROR_INSTR || instr instanceof NULL_INSTR){
	 					list.reverse
	 					resultList.add(list)
	 			}
	 			else{
	 				if (instr instanceof LOOP_INSTR){
	 					//nothing for the moment
	 				}
	 				else{
	 					throw new Exception("Illegal Instruction type")
	 				}
	 			}
	 		}
	 	}
	 }
	
	 
	/**
	 * 
	 */
	def composeMcdcWithinIstruction(List< List< Triplet< List<Couple<String,String>>, List<String>, String > > > srcList,  List< Triplet< List<Couple<String,String>>, List<String>, String > >  resultList){
		for (r: srcList){
			if(r.size == 0){
				throw new Exception("List cannot be empty")
			}
			
			if(r.size == 1){
				resultList.add(r.get(0))
			}
			else{//r.size > 1
					var v1 = r.get(1)
					var v2 = r.get(0)
					
					var list1 = v1.first
					var list2 = v2.first
					
					var ListOfVarInV1 = v1.second
					var ListOfVarInV2 = v2.second
					
					var identOfV1 = v1.third
					var identOfV2 = v2.third
					
					var inCommon = varInCommon(ListOfVarInV1, ListOfVarInV2)
					
					var index = indexOfCommonVar(ListOfVarInV1, ListOfVarInV2, inCommon)
					
					var List<String> varUnion = new ArrayList<String>
					varUnion.addAll(ListOfVarInV1)
					varUnion.add(">")
					varUnion.addAll(ListOfVarInV2)
					
				if (r.size == 2){
					if(inCommon.size == 0){
						val simpleCompo = simpleComposition(list1, list2)
						resultList.add(new Triplet(simpleCompo, varUnion, identOfV1 + ">" + identOfV2) )
					}
					else{
						val ConstraintCompo1 = ExhaustiveCompositionWithConstraints(list1, list2, index)
						resultList.add(new Triplet(ConstraintCompo1, varUnion, identOfV1 + ">" + identOfV2) )
					} 
				}
				else{//r.size > 2
					
					//Copy all elements of the list "r" in list "myList"
					var myList = new ArrayList<Triplet<List<Couple<String, String>>, List<String>, String>> 
					for (e: r){
						myList.add(e)
					}
					
					if (myList.noCommonVar){
						//There is no variable in common => simple composition algorithm
						while(myList.size != 1){
							var simple = simpleComposition(list1, list2)
							myList.set(0, new Triplet(simple, varUnion, identOfV1 + ">" + identOfV2))
							myList.remove(1)
							if(myList.size != 1){
								list1 = myList.get(1).first
								list2 = myList.get(0).first
		
								varUnion = new ArrayList<String>
								varUnion.addAll(myList.get(1).second)
								varUnion.add(">")
								varUnion.addAll(myList.get(0).second)
								
								identOfV1 =myList.get(1).third
								identOfV2 =myList.get(0).third
							}
						}//while
						
					}
					else{
						//there is at least one common variable
						while(myList.size != 1){
							
							if(myList.size == 0){
								throw new Exception("List cannot be empty")
							}
							
							var ConstraintCompo = ExhaustiveCompositionWithConstraints(list1, list2, index)
							myList.set(0, new Triplet(ConstraintCompo, varUnion, identOfV1 + ">" + identOfV2))
							myList.remove(1)
							
							if(myList.size != 1){
								list1 = myList.get(1).first
								list2 = myList.get(0).first
								
								ListOfVarInV1 = myList.get(1).second
							 	ListOfVarInV2 = myList.get(0).second
								
								inCommon = varInCommon(ListOfVarInV1, ListOfVarInV2)
								
								index = indexOfCommonVar(ListOfVarInV1, ListOfVarInV2, inCommon)
								
								varUnion = new ArrayList<String>
								varUnion.addAll(ListOfVarInV1)
								varUnion.add(">")
								varUnion.addAll(ListOfVarInV2)
								
								identOfV1 =myList.get(1).third
								identOfV2 =myList.get(0).third
							}
							
						} //while
					}//else
					
					resultList.add(myList.get(0))
				}
			}
		}
	}
	
	/**
	 * 
	 */
	def List< Couple<String, String>> simpleComposition(List< Couple<String, String>> l1, List< Couple<String, String>> l2 ){
		val result = new ArrayList<Couple<String,String>>
		
		val size1 = l1.size
		val size2 = l2.size
		
		if (size1 == 0 || size2 == 0){
			throw new Exception("List cannot be empty")
		}
		
		val minSize = Math.min(size1, size2)
		val maxSize = Math.max(size1, size2)
		
		var ii =0
		do{
			val v11 = l1.get(ii).first
			val v12 = l1.get(ii).second
			
			val v21 = l2.get(ii).first
			val v22 = l2.get(ii).second
			
			result.add(new Couple(v11 + ">" + v21, v12 + v22))
			
		} while ((ii=ii+1) < minSize)
		
		if (size1 < size2){//l2 is the biggest
			var jj = minSize
			do{
				val index= (Math.random()*minSize).intValue
				
				val v11 = l1.get(index).first
				val v12 = l1.get(index).second
				
				val v21 = l2.get(jj).first
				val v22 = l2.get(jj).second
				
				result.add(new Couple(v11 + ">" + v21, v12 + v22))
				
			} while ((jj=jj+1) < maxSize)
		}
		else{ 
			if (size1 > size2){
				var kk = minSize
				do{
					val index= (Math.random()*minSize).intValue
					
					val v11 = l1.get(kk).first
					val v12 = l1.get(kk).second
					
					val v21 = l2.get(index).first
					val v22 = l2.get(index).second
					
					result.add(new Couple(v11 + ">" + v21, v12 + v22))
				
				} while ((kk=kk+1) < maxSize)
			}//if
		}//else
		return result
	}
	
	
	/**
	 * 
	 */
	def List<Couple<String, String>> ExhaustiveCompositionWithConstraints(List<Couple<String,String>> list1, List<Couple<String,String>> list2, List<Couple<Integer,Integer>> indexOfCommonVar) {
		
		val List<Couple<String, String>> result = new ArrayList< Couple<String, String> >
		
		for(e1: list1){
			val v11 = e1.first
			val v12 = e1.second
			
			for(e2: list2){
				val v21 = e2.first
				val v22 = e2.second
				
				if( meetConstraints(v11, v21, indexOfCommonVar) ){
					result.add(new Couple( v11 + ">" + v21, v12 + v22 ) )
				}
			}
		}
		
		return result
	}
	
	/**
	 * 
	 */
	def mcdcCoverageVerdict(List<Triplet < List<Couple<String,String>>, List<String>, String > > actualCoverage, List< Triplet< List<String>, List<String>, String >> ExpectedCoverage, List< List< Triplet< List<Couple<String,String>>, List<String>, String > > > listOfList){
		
		//Transform actualCoverage List in the List< Couple< List<String>, List<String> >> format
		val listOfActualValAndVar = new ArrayList< Triplet< List<String>, List<String>, String >>
		actualCoverage.forEach[t| 
			val List<String> list = new ArrayList<String> 
			t.first.forEach[tt| list.add(tt.first)]
			listOfActualValAndVar.add( new Triplet(t.second, list, t.third))
		]
		
		val listOfCoverageResults = new ArrayList<Triplet< List<String>, Set<String>, String >>
		
		for(l: listOfActualValAndVar){
			
			var valIndexList = new ArrayList<Couple<Integer, Integer>>
			var identIndexList = new ArrayList<Couple<Integer, Integer>>
			
			val v1 = l.first
			var cptV1 = 0
			var indexV1 = 0
			
			val v3 = l.third.toCharArray.toList
			var indexV3 = 0
			var cptV3 = 0
			
			val sizeV1 = v1.size
		
			for(e: v1){
				if(e == ">"){
					valIndexList.add(new Couple(cptV1, indexV1 -1))
					cptV1 = indexV1 + 1
				}
		
				if(indexV1 == sizeV1-1){
					valIndexList.add(new Couple(cptV1, sizeV1 -1))
				}
				
				indexV1 = indexV1 + 1
				
			}// for(e: v1)
			
			val sizeV3 = v3.size
			
			//
			for(e:v3) {
				if(e.toString == ">"){
					identIndexList.add(new Couple(cptV3, indexV3 -1))
					cptV3 = indexV3 + 1
				}
				
				if(indexV3 == sizeV3-1){
					identIndexList.add(new Couple(cptV3, sizeV3 -1))
				}
				
				indexV3 = indexV3 + 1
				
			}
			
			if(valIndexList.size != identIndexList.size){
				throw new Exception("List size mismatch")
			}
			
			val v2 = l.second
			var iter =0
			for (j:valIndexList){	
			 	
			 	val val1 = j.first
			 	val val2 = j.second
				
				val id1 = identIndexList.get(iter).first
				val id2 = identIndexList.get(iter).second
				
			 	val List<String> subList = v1.subList(val1, val2+1)
			 	val Set<String> subStrList = new TreeSet<String>
			 	
			 	v2.forEach[t| subStrList.add(t.substring(val1, val2+1))]
			 	
			 	val ident = l.third.substring(id1, id2+1)
			 	
			 	listOfCoverageResults.add(new Triplet(subList, subStrList, ident ) )
			
				iter = iter + 1
			}
				
		}//for(l: listOfActualValAndVar)
		
		var cpt = 0
		do{
			val tmp = listOfCoverageResults.get(cpt)
			
			val dup = listOfCoverageResults.findFirst[ (it != tmp) && (it.first.equals(tmp.first)) && (it.third == tmp.third)]
			
			if (dup != null){
				tmp.second.addAll(dup.second)
				listOfCoverageResults.remove(dup)
				cpt = cpt - 1
			}
			
		}while ( (cpt=cpt+1) < listOfCoverageResults.size)
		
	 	//Comparison between coverage results (listOfCoverageResults) and Expected coverage results (ExpectedCoverage)
		val notCoveredValues = new ArrayList< Triplet< List<String>, List<String>, String >>
		for (e: ExpectedCoverage){
			val ident = e.third
			val listOfVAr = e.first
			
			val idem = listOfCoverageResults.findFirst[(it != e) && (it.third == ident) && it.first.equals(listOfVAr)]
			
			if (idem != null){
				val expValues = e.second
				val actValues = idem.second
				val List<String> tmpList= new ArrayList<String>
				
				for(exp: expValues){
					if(!actValues.contains(exp)){
						tmpList.add(exp)
					}
				}//for
				
				if(tmpList.size != 0){
					notCoveredValues.add(new Triplet(listOfVAr, tmpList, ident ))
				}
				
			}
		
		}//for
		
		
		System.out.println("Actual Coverage")
		for(ss:listOfCoverageResults){
	 		System.out.println( ss.first.toString + " => "+ ss.second.toString + " => " + ss.third)	
	 	}
	 	System.out.println
	 	
	 	System.out.println("Missing Coverage")
		for(jj:notCoveredValues){
	 		System.out.println( jj.first.toString + " => "+ jj.second.toString + " => " + jj.third)	
	 	}
	 	System.out.println
	 	
	 	//adding missing values process
		addMissingValues(notCoveredValues, listOfList)
		
	}
	
	/**
	 * 
	 */
	def addMissingValues(List<Triplet<List<String>,List<String>,String>> notCoveredValues, List<List<Triplet<List<Couple<String,String>>,List<String>,String>>> listOfList) {
		
		for (e: notCoveredValues){
			
			val listOfVar = e.first
			val values = e.second
			val ident = e.third
			
			for (v: values){
				listOfList.forEach[
					t | val elem = t.findFirst[ (it.third == ident) && (it.second.equals(listOfVar)) && (it.first.containThisValue(v)) ]
					if (elem != null){
						val List<Triplet <Couple<String,String>,List<String>,String>> list = new ArrayList<Triplet< Couple<String,String>,List<String>,String>>
						var indexOfTarget = -1
						for(i: t){
							val outcome = i.first.get(0).second // outcome of values
							val myVarList = i.second
							val myIdent = i.third
							if(ident != myIdent){
								list.add(new Triplet( new Couple(myVarList.size.unknownStringVector, outcome), myVarList, myIdent))
							}
							else{
								val target = new Triplet( new Couple(v, outcome), myVarList, myIdent)
								list.add(target)
								indexOfTarget = list.indexOf(target)
							}
						}
						
						if(indexOfTarget == -1){
							throw new Exception("Bad Index Value")
						}  
						
						var cpt = 0
						var size = list.size
						val targetTriplet = list.get(indexOfTarget)
						val targetListOfVar = targetTriplet.second
						val targetCouple = targetTriplet.first
						do{
							if(cpt != indexOfTarget){
								val currTriplet = list.get(cpt)
								val currListOfVar1 = currTriplet.second
								val varInCommon = varInCommon(targetListOfVar, currListOfVar1)
								if(varInCommon.size > 0){
									//they share some variables
									val indexOfCommonVar = indexOfCommonVar(targetListOfVar, currListOfVar1, varInCommon)
									val currCouple = currTriplet.first
									for(ii :indexOfCommonVar){
										//Set the values of common variables in current triplets with the values of target variables  
										val str = (currCouple.first).setCharAt(ii.second, targetCouple.first.charAt(ii.first))
										currCouple.setFirst(str)
									}
								}
							}
							
							
						} while( (cpt=cpt+1) < size)
						
						//call solve equation here
						
						System.out.println("To be tested")
						System.out.println("Index Of target: "+ indexOfTarget.toString)
						for (ll: list ){
							System.out.print("("+ ll.first.first +", "+ ll.first.second +  ")" )
							System.out.print( " => ")
							System.out.print(ll.second.toString)
							System.out.print( " => ")
							System.out.print(ll.third)
							System.out.println
						}
					}//if(elem != null)
				]//forEach
			}//for
			
		}//for
	} 

	 /**
	  * 
	  */
	 def solveEquation(List<EXPRESSION> condList, List<Triplet<Couple<String, String>, List<String>, String>> listOfEquations){
	 	
	 	val List< Couple<String,String> > listOfVarAndVal = new ArrayList<Couple<String,String> >
	 	val List < Couple<EXPRESSION, String> > listOfCondAndResults = new ArrayList<Couple<EXPRESSION, String> >
	 	
	 	for(t:listOfEquations){
	 		val couple = t.first
	 		val values = couple.first
	 		val variables= t.second
	 		val indexInteger = Integer.parseInt(t.third)
	 		
	 		listOfCondAndResults.add( new Couple( condList.get(indexInteger), couple.second) )
	 	
	 		var size = variables.size
	 		
	 		if(values.length != size){
	 			throw new Exception("size mismatch")
	 		}
	 		
	 		var cpt = 0
	 		do{
	 			val variable = variables.get(cpt) 
	 			if(!listOfVarAndVal.containThisValue(variable)){
	 				listOfVarAndVal.add( new Couple(variable , values.charAt(cpt).toString))
	 			}
	 		}while( (cpt=cpt+1) < size)
	 		
	 		//call new choco method to create variables from listOfVarAndVal
	 	}//for
	 	
	 	chocoRepr(listOfVarAndVal, listOfCondAndResults)
	 }
	
	/**
	 * 
	 */
	 def boolean containThisValue(List<Couple<String, String>> list, String str){
	 	for (e : list){
	 		if (e.first == str){
	 			return true
	 		}
	 	}//for
	 	
	 	return false
	 }
	 
	/**
	 * 
	 */
	def chocoRepr(List<Couple<String,String>> variables, List<Couple<EXPRESSION,String>> condAndRes) {
		
		'''
			//Choco model
			CPModel model = new CPModel();
			
			//Create variables and add them in the model	
			«FOR v : variables» 
				
				«IF v.second == "*"»
					IntegerVariable «v.first» = Choco.makeIntVar("«v.first»", 0, 1);
					model.addVariable(«v.first»); 
				«ENDIF»
				
				«IF v.second == "F"»
					IntegerVariable «v.first» = Choco.makeIntVar("«v.first»", 0, 0); 
					model.addVariable(«v.first»); 
				«ENDIF»
				
				«IF v.second == "T"»
					IntegerVariable «v.first» = Choco.makeIntVar("«v.first»", 1, 1); 
					model.addVariable(«v.first»); 
				«ENDIF»
			
			«ENDFOR»
			
			//Expressions and constraints
			«FOR c : condAndRes»
			
				IntegerExpressionVariable «"exp" + condAndRes.indexOf(c)» = «c.first.chocoStringReprOfCondition» ;
				«IF c.second == "F"»
					Constraint «"ctr" + condAndRes.indexOf(c)» = Choco.eq(«"exp" + condAndRes.indexOf(c)», 0); 
				«ENDIF»
				
				«IF c.second == "T"»
					Constraint «"ctr" + condAndRes.indexOf(c)» = Choco.geq(«"exp" + condAndRes.indexOf(c)», 1);
					Constraint «("ctr" + condAndRes.indexOf(c) + "_")» = Choco.leq(«"exp" + condAndRes.indexOf(c)», «c.first»);
				«ENDIF»
				
			«ENDFOR»
			
			//Constraints
		'''
	}
	 
	 
	 /**
	 * 
	 */
	 def private String chocoStringReprOfCondition(EXPRESSION exp){
 		switch(exp){
 			OR:''' Choco.plus( « exp.left.chocoStringReprOfCondition »,  « exp.right.chocoStringReprOfCondition ») '''
 			AND: ''' Choco.mult( « exp.left.chocoStringReprOfCondition »,  « exp.right.chocoStringReprOfCondition ») '''
 			NOT:''' Choco.minus( 1 ,  « exp.chocoStringReprOfCondition ») '''
 			COMPARISON:''' « exp.left.relBoolRepr » + « exp.op » + « exp.right.relBoolRepr » '''
 			EQUAL_DIFF: ''' « exp.left.relBoolRepr » + « exp.op » + « exp.right.relBoolRepr » '''
 			VarExpRef:''' « exp.vref.name » '''
 			default:''' '''
 		}
	 }
	
	/**
	 * 
	 */
	def boolean meetConstraints(String str1, String str2, List<Couple<Integer, Integer>> indexOfCommonVar){
		
		val str1ToArray = str1.toCharArray
		val str2ToArray = str2.toCharArray
		
		for(ic: indexOfCommonVar){
			if ( str1ToArray.get(ic.first.intValue).toString != str2ToArray.get(ic.second.intValue).toString){
				return false
			}
		}
		return true
	}
	 
	/**
	 * This method stores all variables that are involved in the expression
	 * Note: A relational condition (e.g (a<4)) is considered as a single variable
	 * @param exp The expression in which we want to extract all variables
	 * @param list All variables will be stored in this list
	 */
	 def void stringReprOfVar(EXPRESSION exp, List<String> list){
	 	switch(exp){
	 		AND: {stringReprOfVar(exp.left, list) stringReprOfVar(exp.right, list)}
	 		OR: {stringReprOfVar(exp.left, list) stringReprOfVar(exp.right, list)}
	 		EQUAL_DIFF: list.add(relBoolRepr(exp.left) + exp.op + relBoolRepr(exp.right)) 
	 		NOT: stringReprOfVar(exp.exp, list)
	 		COMPARISON: list.add(relBoolRepr(exp.left) + exp.op + relBoolRepr(exp.right)) 
	 		VarExpRef: list.add(exp.vref.name)
	 	}
	 }
	 
	 /**
	  * This method is a sub-method of the method "stringReprOfVar". It deals specially with relational
	  * conditions.
	  * @param exp Expression to be represented in string form
	  * @return String that represents the relational condition
	  */
	  def String relBoolRepr(EXPRESSION exp){
	  	switch(exp){
	  		ADD: "(" + relBoolRepr(exp.left)+ "+" +  relBoolRepr(exp.right) +")"
	  		SUB: "(" + relBoolRepr(exp.left)+ "-" +  relBoolRepr(exp.right) +")"
	  		MULT:"(" + relBoolRepr(exp.left)+ "*" +  relBoolRepr(exp.right) +")"
	  		DIV: "(" + relBoolRepr(exp.left)+ "/" +  relBoolRepr(exp.right) +")"
	  		intConstant: exp.value.toString
	  		realConstant:exp.value.toString
	  		strConstant: exp.value.toString
	  		enumConstant: exp.value.toString
	  		boolConstant: exp.value.toString
	  		bitConstant: exp.value.toString
	  		hexConstant: exp.value.toString
	  		VarExpRef: exp.vref.name.toString
	  		default:""
	  	}
	  }
	  
	 /**
	 * This method checks whether or not in the given path (of if instruct) there are no repeated variables
	 */
	def boolean noCommonVar(List<Triplet<List<Couple<String, String>>, List<String>, String>> myList){
		var union = new ArrayList<String>
		var List<String> intersection = new ArrayList<String>
		for(e: myList){
			intersection = varInCommon(union, e.second)
			if(intersection.size > 0){
				return false
			}
			union.add(">")
			union.addAll(e.second)
		}
		return true
	}
	
	
	/**
	 * 
	 */
	def List<Couple<Integer, Integer>> indexOfCommonVar(List<String> list1, List<String> list2, List<String> inCommon) {
	
		val listOfCommonVar = new ArrayList<Couple<Integer, Integer>>
		for(c: inCommon){
			val i = list1.indexOf(c)
			val j = list2.indexOf(c)
			listOfCommonVar.add( new Couple(i,j) )
		}
		
		/*System.out.print("CommonVar")
		System.out.print("[")
	 		for (c:listOfCommonVar){
	 			System.out.print("("+ c.first +", "+ c.second + ")" + ", ")
	 		}
	 		System.out.println("]")*/
		return listOfCommonVar
	}
	
	  /**
	   * 
	   */
	  def String setCharAt(String str, int index, char r){
	  		val size = str.length
	  		
	  		if(index >= size){
	  			throw new Exception("Index Out of range")
	  		}
	  		
	  		val toCharList = str.toCharArray
	  		toCharList.set(index, r)
	  		
	  		var newStr = ""
	  		
	  		for (e: toCharList){
	  			newStr = newStr + e.toString
	  		}

			return newStr	 		
	  }
	  
	  /**
	   * 
	   */
	  def unknownStringVector(int length){
	  	if(length < 1){
	  		throw new Exception("The length has to be greater than 0")
	  	}
	  	
	  	var i =0
	  	var tmpStr = ""
	  	do {
	  		tmpStr = tmpStr + "*"
	  	}while ( (i=i+1) < length)
	  	
	  	return tmpStr
	  }
	 
	 /**
	  * This method returns strings that the two lists have in common
	  * @param list1: list of String
	  * @param list2: list of string
	  * @return list: new list that contains all strings that appear both in list1 and list2
	  */
	  def List<String> varInCommon(List<String> list1, List<String> list2){
	  	val commonList = new ArrayList<String>
	  	
	  	if (list1.size == 0 || list2.size == 0 ){
	  		return commonList
	  	}
	  	
	  	for (i:list1){
	  		for (j:list2){
	  			if ( i == j && j != ">"){
	  				commonList.add(j)
	  			}
	  		}
	  	}
	  	return commonList
	  }
	  
	/**
	 * This method deletes the last character of a string and returns the new string
	 * @param str The subject string i.e the string we want to delete its last character
	 * @return substring of @param str without its last character
	 */
	def String deleteLastChar(String str){
		val strSize = str.length
		var myStr = ""
		if(strSize > 0){
			myStr = str.substring(0, strSize-1)
		}
		return myStr
	}
	
	/**
	 * delete the first string's character and returns a new string 
	 */
	def String deleteFisrtChar(String str){
		val strSize = str.length
		var myStr = ""
		if(strSize > 0){
			myStr = str.substring(1)
		}
		return myStr
	}
	
	/**
	 * returns the last character of the string
	 */
	def String getLastChar(String str){
		val strSize = str.length
		var myStr = ""
		if (strSize > 0){
		 	 myStr = str.charAt(strSize-1).toString
		}
		return myStr
	}
	
	
}//class