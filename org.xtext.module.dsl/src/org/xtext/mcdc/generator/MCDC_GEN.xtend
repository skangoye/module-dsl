package org.xtext.mcdc.generator

import org.xtext.moduleDsl.*;
import java.util.ArrayList
import org.xtext.helper.Triple
import java.util.List
import org.xtext.helper.Couple
import org.xtext.moduleDsl.EXPRESSION
import java.util.Set
import java.util.TreeSet
import org.xtext.types.*;
import org.xtext.moduleDsl.INSTRUCTION

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
		//Repeat the operation until the next parent is of type "and/or"
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
	 def void mcdcOfInstruction(INSTRUCTION instr, List< Couple< List< Couple<String,String>>, List<String> > > list, List< List< Couple< List<Couple<String,String>>, List<String> > > > result){
	 	
	 	if (instr instanceof IF_INSTR){
	 		val cond = (instr as IF_INSTR).ifcond
	 		val res = mcdcOfBooleanExp(cond)
	 		
	 		val falseEval = res.filter[it.second == "F"].toList
	 		val trueEval = res.filter[it.second == "T"].toList
	 		
	 		var List<String> varInExpList = new ArrayList<String> 
	 		stringReprOfVar(cond, varInExpList)
	 		
	 		var listT = new ArrayList< Couple < List<Couple<String,String>>, List<String> > > //merge(list, trueEval)
	 		var listF = new ArrayList< Couple < List<Couple<String,String>>, List<String> > >
	 		
	 		//Copy elements of the list "list" in listT and ListF 
	 		for(i: list){
	 			listT.add(i)
	 			listF.add(i)
	 		}
	 		
	 		listT.add( new Couple(trueEval, varInExpList) )
	 		listF.add( new Couple(falseEval,varInExpList) )
	 		
	 		mcdcOfInstruction((instr as IF_INSTR).ifst, listT, result)
	 		mcdcOfInstruction((instr as IF_INSTR).elst, listF, result)
	 	}
	 	else{
	 		if(instr instanceof ASSIGN_INSTR){
	 			//TO DO: implement mcdc of decisions within assign instruction
	 			//val rightAssign = (instr as ASSIGN_INSTR).s
	 			//val tt = merge (list, mcdcOfBooleanExp() )
	 				list.reverse
	 				result.add(list)
	 		}
	 		else{
	 			if(instr instanceof ERROR_INSTR || instr instanceof NULL_INSTR){
	 					list.reverse
	 					result.add(list)
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
	
	
	def List<Couple<Couple<String,String>,Couple<String,String>>> merge(List<Couple<Couple<String,String>,Couple<String,String>>> l1, List<Couple<Couple<String,String>,Couple<String,String>>> l2) {
		if (l1.size == 0){
			return l2
		}
		
		if (l2.size == 0){
			throw new Exception("List cannot be empty")
		}
		
		val size1 = l1.size
		val size2 = l2.size
		
		if(size1 < size2){
			
		}
		else{
			
		}
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
	  * This method returns strings that the two lists have in common
	  * @param list1: list of String
	  * @param list2: list of string
	  * @return list: new list that contains all strings that appear both in list1 and list2
	  */
	  def List<String> varInCommon(List<String> list1, List<String> list2){
	  	val commonList = new ArrayList<String>
	  	for (i:list1){
	  		for (j:list2){
	  			if ( i == j){
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