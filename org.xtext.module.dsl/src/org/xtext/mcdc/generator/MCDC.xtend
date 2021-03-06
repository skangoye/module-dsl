package org.xtext.mcdc.generator
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.moduleDsl.*
import java.util.List
import java.util.ArrayList
import org.xtext.helper.Triple
import java.util.Arrays
import org.xtext.helper.Couple

class MCDC {
	
	var notCount = 0
	var firstOperator = ""
	
	def int notCount(){
		return notCount
	}
	
	def String firstOperator(){
		return firstOperator
	}
	
	def void mcdcList(EXPRESSION exp, List<List<Triple>> resultList){
		
		if(exp instanceof AND){
			var leftList = new ArrayList<Triple>
		    var rightList = new ArrayList<Triple>
			firstOperator = "and"
			
			//Add T1, T2 and F3 to lesftList
			leftList.add(new Triple('T', "1", "1"))
			leftList.add(new Triple('T', "2", "1"))
			leftList.add(new Triple('F', "3", "1"))
			
			//Add T1, F2 and T3 to righttList
			rightList.add(new Triple('T', "1", "0"))
			rightList.add(new Triple('F', "2", "0"))
			rightList.add(new Triple('T', "3", "0"))
			
			val andExp = (exp as AND)
			
			//call recursively on enumMcdc method
			enumMcdc(andExp.left, leftList, resultList)
			enumMcdc(andExp.right, rightList, resultList)
			
		}
		else{
			if(exp instanceof OR){
				var leftList = new ArrayList<Triple>
				var rightList = new ArrayList<Triple>
				firstOperator = "or"
				
				//Add T1, T2 and F3 to lesftList
				leftList.add(new Triple('T', "1", "1"))
				leftList.add(new Triple('F', "2", "1"))
				leftList.add(new Triple('F', "3", "1"))
				
				//Add T1, F2 and T3 to righttList
				rightList.add(new Triple('F', "1", "0"))
				rightList.add(new Triple('T', "2", "0"))
				rightList.add(new Triple('F', "3", "0"))
				
				val orExp = (exp as OR)
				
				//call recursively on enumMcdc method
				enumMcdc(orExp.left, leftList, resultList)
				enumMcdc(orExp.right, rightList, resultList)
			}
			else{
				if( exp instanceof NOT){
					val notExp = (exp as NOT)
					notCount = notCount + 1
					//No need to define values for the first "not" expression
					mcdcList(notExp.exp, resultList)
				}
				else{ 
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						
						var list = new ArrayList<Triple>
						list.add(new Triple('T', "1", "-1"))
						list.add(new Triple('F', "2", "-1"))
						
						resultList.add(list)
					}
					else{
						//throw new Exception("Illegal boolean expression")
					}
				}
			}
		}
			
		//return resultList
	}
	
	def void enumMcdc(EXPRESSION exp, List<Triple> list, List<List<Triple>> result){
		if (exp instanceof AND){
			var leftList = new ArrayList<Triple>
			var rightList = new ArrayList<Triple>
			
			doAndEval(list, leftList, rightList)
			
			enumMcdc( (exp as AND).left , leftList, result )
			enumMcdc( (exp as AND).right , rightList, result )
			
		}
		else{
			if (exp instanceof OR){
				var leftList = new ArrayList<Triple>
				var rightList = new ArrayList<Triple>
				
				doOrEval(list, leftList, rightList)
				
				enumMcdc( (exp as OR).left , leftList, result )
				enumMcdc( (exp as OR).right , rightList, result )
			
			}
			else{
				if (exp instanceof NOT){
					var notList = new ArrayList<Triple>
					doNotEval(list, notList)
					enumMcdc((exp as NOT).exp , notList, result)
				}
				else {
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						doEqCompVarEval(list , result)
					}
					else{
						throw new Exception()
					}
				}
			}
		}
	}
	
	
	def void doAndEval(List<Triple> triples, List<Triple> left, List<Triple> right) {
		
		//for each couple of the list do the following tests
		for (t:triples){
			if (t.value.toString == "T"){
				left.add(new Triple('T', t.index + "1", t.position + "1" ))
				right.add(new Triple('T', t.index + "1", t.position + "0"))
			}
			else {
				if(t.value.toString == "F"){
					left.add(new Triple('T', t.index + "1", t.position + "1" ))
					right.add(new Triple('F', t.index + "1", t.position + "0"))
					left.add(new Triple('F', t.index + "2", t.position + "1"))
					right.add(new Triple('T', t.index + "2", t.position + "0"))
				}
				else{
					throw new Exception("Illegal argument")
				}
			}
		}
	}
	
	def void doOrEval(List<Triple> triples, List<Triple> left, List<Triple> right) {
		
		//for each couple of the list do the following tests
		for (t:triples){
			if (t.value.toString == "F"){
				left.add(new Triple('F', t.index + "1", t.position + "1"))
				right.add(new Triple('F', t.index + "1", t.position + "0" ))
			}
			else {
				if(t.value.toString == "T"){
					left.add(new Triple('T', t.index + "1", t.position + "1"))
					right.add(new Triple('F', t.index + "1", t.position + "0" ))
					left.add(new Triple('F', t.index + "2", t.position + "1"))
					right.add(new Triple('T', t.index + "2", t.position + "0" ))
				}
				else{
					throw new Exception("Illegal argument")
				}
			} 
		}
	}
	
	def void doNotEval(List<Triple> triples, List<Triple> notlist) {
		for (t:triples){
			if (t.value.toString == "F"){
				notlist.add(new Triple('T', t.index, t.position))
			}
			else {
				if(t.value.toString == "T"){
					notlist.add(new Triple('F', t.index, t.position))
				}
				else{
					throw new Exception("Illegal argument")
				}
			}
		}
	}
	
	def void doEqCompVarEval(List<Triple> triples, List<List<Triple>>result) {
		result.add(triples)
	}
	
	def addIndepVector(Couple<String,Integer> cp1, Couple<String,Integer> cp2, List<List<Couple<String,String>>> list){
		
		val a1 = cp1.first.toCharArray
		val a2 = cp2.first.toCharArray
		val size = cp1.first.length
		val val1 = cp1.second.intValue
		val val2 = cp2.second.intValue
		var a =  ""
		var compatible = false
		var index = -1
		if( cp1.first.length !=  cp2.first.length ||  cp1.first ==  cp2.first){
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
				
				cp1.setSecond(val1 + 1)
				cp2.setSecond(val2 + 1)
			
				//System.out.println(index)
				list.get(index).add(new Couple<String, String>(cp1.first, cp2.first))////
			}
	
		}//else
	}
	
	
	def String deleteLast(String str){
		val strSize = str.length
		var myStr = ""
		if(strSize > 0){
			myStr = str.substring(0, strSize-1)
		}
		return myStr
	}
	
	def String deleteIfSup1(String str){
		val strSize = str.length
		if(strSize == 1 || strSize == 0){
			return str
		}
		else{
			val myStr = str.substring(0, strSize-1)
			return myStr
		}
	}
	
	def String lastChar(String str){
		val strSize = str.length
		var myStr = ""
		if (strSize > 0){
		 	 myStr = str.charAt(strSize-1).toString
		}
		return myStr
	}
	
	def List<Triple> merge(List<Triple> left, List<Triple> right){
		val list = new ArrayList<Triple>
		
		for(t1: left){
			var index = t1.index
			var position = t1.position
			for(t2:right){
				if(index == t2.index){
					list.add(new Triple(t1.value + t2.value, index.deleteIfSup1, position.deleteLast) )
				}
			}//for
		}
		
		return list
	}
	
	
	
	def List<Triple> linkValues(List<List<Triple>> resultList){
		var myList = resultList
		if (myList.size == 0){
			throw new Exception("List is empty") 
		}
		
		var i = 0
		do{
			if(myList.size == 1){
				return myList.get(0)
			}
			val tmpList = myList.get(i)
			val delPosition = tmpList.get(0).position.deleteLast
			val n1 = Integer.parseInt(tmpList.get(0).position.lastChar)
			val cmp = myList.findFirst
			[ it != tmpList && ((it.get(0).position.deleteLast)==(delPosition)) && (n1-Integer.parseInt(it.get(0).position.lastChar)) ==1 ]
			if(cmp != null){
				myList.set(i, merge(tmpList, cmp))
				myList.remove(cmp)
			}
			//System.out.println(myList.size)////
		} while ( (i=i+1) < myList.size )
		
		linkValues(myList)	
	}
	
	def printList( List<Triple> list){
		System.out.print("[ ")
		 for (t: list){
			System.out.println( "(" + t.value + ", " + t.index + ", " 
					            + t.position + ") ");
		 }
		 System.out.println("] ")
	}
	
	def printListofList( List<List<Triple>> listOfList){
		System.out.print("[ ")
		 for (t: listOfList){
			t.printList
		 }
		 System.out.println("] ")
	}
	
	def String evalOperation(Triple t){
		
		var eval = ""
		if(notCount % 2 == 0 ){
		 	if(firstOperator == "and"){
	 			if( t.index == "1"){
	 				eval = "T"
	 			}
	 			else {
	 				if (t.index == "2" || t.index == "3"){
	 					eval = "F"
	 				}
	 			}
		 	}
	 		else{
	 			if(firstOperator == "or"){
	 				if( t.index == "3"){
	 					eval = "F"
	 				}
	 				else {
	 					if (t.index == "1" || t.index == "2"){
	 						eval = "T"
	 					}
	 				}
	 			}
	 			else{
	 				eval = t.value///
	 			}
	 		}
		 }//if notCount == 0
		 
	 	else{
	 		//if(notCount %2 == 1)
 			if(firstOperator == "and"){
	 			if( t.index == "1"){
	 				eval = "F"
	 			}
	 			else {
	 				if (t.index == "2" || t.index == "3"){
	 					eval = "T"
	 				}
	 			}
 			}
	 		else{
	 			if(firstOperator == "or"){
	 				if( t.index == "3"){
	 					eval = "T"
	 				}
	 				else {
	 					if (t.index == "1" || t.index == "2"){
	 						eval = "F"
	 					}
	 				}
	 			}// if first Operator
	 			else{
	 				if(t.value == "F"){
	 					 eval = "T"
	 				}
	 				else{
	 					eval = "F"
	 				}  
	 			}
	 	   }
	 	}//else
	}//evalOperation
	
}//class