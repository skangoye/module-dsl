package org.xtext.mcdc.generator

import org.xtext.moduleDsl.*;
import java.util.ArrayList
import org.xtext.helper.Triple
import java.util.List
import org.xtext.helper.Couple
import org.xtext.moduleDsl.EXPRESSION

class MCDC_GEN {
	
	var notCount = 0
	var firstOperator = ""
	
	def int notCount(){
		return notCount
	}
	
	def String firstOperator(){
		return firstOperator
	}
	
	/**
	 * 
	 */
	def void mcdcGen(EXPRESSION exp, List<List<Couple< Couple<String, String>, Couple<String, String> >>> resultList){
		
		if(exp instanceof AND){
			
			var leftCouple =  new Couple(new Couple("",""), new Couple("1","a")) 
		    var rightCouple = new Couple(new Couple("",""), new Couple("0","a")) 
			
			firstOperator = "and"
			
			val andExp = (exp as AND)
			
			//call recursively on enumMcdc method
			enumMcdc(andExp.left, leftCouple, resultList)
			enumMcdc(andExp.right, rightCouple, resultList)
			
		}
		else{
			if(exp instanceof OR){
				
				var leftCouple =  new Couple(new Couple("",""), new Couple("1","o")) 
		    	var rightCouple = new Couple(new Couple("",""), new Couple("0","o")) 
				
				firstOperator = "or"
				
				val orExp = (exp as OR)
				
				//call recursively on enumMcdc method
				enumMcdc(orExp.left, leftCouple, resultList)
				enumMcdc(orExp.right, rightCouple, resultList)
			}
			else{
				if( exp instanceof NOT){
					val notExp = (exp as NOT)
					notCount = notCount + 1
					//No need to define values for the first "not" expression
					mcdcGen(notExp.exp, resultList)
				}
				else{ 
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						
						var list = new ArrayList< Couple< Couple<String, String>, Couple<String, String> > >
						
						if (notCount % 2 == 0){
							list.add(new Couple(new Couple("F","F"), new Couple("","")))
							list.add(new Couple(new Couple("T","F"), new Couple("","")))
						}
						else{//notCount % 2 == 1
							list.add(new Couple(new Couple("F","T"), new Couple("","")))
							list.add(new Couple(new Couple("T","T"), new Couple("","")))
						}
						
						resultList.add(list)
					}
					else{
						//throw new Exception("Illegal boolean expression")
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
			
			var leftCouple =  new Couple( new Couple ("",""),  new Couple(position + "1", "a" + parent) )
		    var rightCouple = new Couple( new Couple ("",""),  new Couple(position + "0", "a" + parent) )
		    
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
				
					var notCouple =  new Couple( new Couple ("",""),  new Couple(position , "n" + parent) )
			
					enumMcdc((exp as NOT).exp , notCouple, result)
					
				}
				else {
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						
						val position = couple.second.first
						val parent = couple.second.second
						
						var list = new ArrayList< Couple< Couple<String, String>, Couple<String, String> > >
						
						list.add( new Couple( new Couple ("F","F"),  new Couple(position , parent)) ) 
						list.add( new Couple( new Couple ("T","T"),  new Couple(position , parent)) )
						
						result.add(list)
					}
					else{
						throw new Exception()
					}
				}
			}
			
		}
	}//enumMcdc
	
	/**
	 * 
	 */
	def List<Couple< Couple<String, String>, Couple<String, String> >> linkValues (List<List<Couple< Couple<String, String>, Couple<String, String> >>> resultList){
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
			val position = tmpList.get(0).second.first
			val parentPosition = position.deleteLastChar
			val toInt = Integer.parseInt(position.getLastChar)
			
			val cmp = myList.findFirst
			[ it != tmpList && ((it.get(0).second.first.deleteLastChar)==(parentPosition)) 
			 && (toInt - Integer.parseInt(it.get(0).second.first.getLastChar)) ==1]
			
			if(cmp != null){
				//they are siblings
				myList.set(i, mergeResults(tmpList, cmp))
				myList.remove(cmp)
				System.out.println(myList.size)
			}	
			
		} while ((i=i+1) < myList.size)
		
		linkValues(myList)
	}
	
	/**
	 * 
	 */
	def List<Couple<Couple<String,String>,Couple<String,String>>> mergeResults(List<Couple<Couple<String,String>,Couple<String,String>>> left, List<Couple<Couple<String,String>,Couple<String,String>>> right) {
		
		var list1 = left
		var list2 = right
		val list = new ArrayList< Couple< Couple<String, String>, Couple<String, String> > >
		
		var list1NextParent = list1.get(0).second.second.charAt(0)
		
		while(list1NextParent.toString == "n"){
			list1 = invertValues(list1)
			list1NextParent = list1.get(0).second.second.charAt(0)
			System.out.println("I am stuck here, left")
		}
		
		var list2NextParent = list2.get(0).second.second.charAt(0)
		while(list2NextParent.toString == "n"){
			list2 = invertValues(list2)
			list2NextParent = list2.get(0).second.second.charAt(0)
			System.out.println("I am stuck here, right")
		}
		
		for(c1: list1){
			
			var nextParent1 = c1.second.second.charAt(0).toString
			
			for(c2:list2){
				
				var nextParent2 = c2.second.second.charAt(0).toString
				
				System.out.println("par1 " + nextParent1)
				System.out.println("par2 " + nextParent2)
				
				if(nextParent1 == nextParent2){
					if(nextParent1 == "a"){
						andPolicy(c1,c2,list)
					}
					else{
						if(nextParent1 == "o"){
							orPolycy(c1,c2,list)
						}
						else{
							throw new Exception("Unknown Parent")
						}
					}
				}
				else {
					throw new Exception("Parent mismatch") 	
				}
			
			}//for
		
		}//for
		
		return list
	}
	
	/**
	 * This method
	 */
	def void andPolicy(Couple<Couple<String,String>,Couple<String,String>> c1, Couple<Couple<String,String>,Couple<String,String>> c2, ArrayList<Couple<Couple<String,String>,Couple<String,String>>> list) {
		val res1 = c1.first.second
		val res2 = c2.first.second
		if( (res1 == "T" && res2 == "F") || (res1 == "F" && res2 == "T") ){
			list.add( new Couple( new Couple(c1.first.first + c2.first.first,"F"), 
								  new Couple(c1.second.first.deleteLastChar,c1.second.second.deleteFisrtChar)) )
		}
		else{
			if(res1 == "T" && res2 == "T"){
				list.add(new Couple( new Couple(c1.first.first + c2.first.first,"T"), 
						new Couple(c1.second.first.deleteLastChar,c1.second.second.deleteFisrtChar)))
			}
		}
	}
	
	/**
	 * 
	 */
	def void orPolycy(Couple<Couple<String,String>,Couple<String,String>> c1, Couple<Couple<String,String>,Couple<String,String>> c2, ArrayList<Couple<Couple<String,String>,Couple<String,String>>> list) {
		val res1 = c1.first.second
		val res2 = c2.first.second
		if( (res1 == "T" && res2 == "F") || (res1 == "F" && res2 == "T") ){
			list.add( new Couple( new Couple(c1.first.first + c2.first.first,"T"), 
								  new Couple(c1.second.first.deleteLastChar,c1.second.second.deleteFisrtChar)) )
		}
		else{
			if(res1 == "F" && res2 == "F"){
				list.add(new Couple( new Couple(c1.first.first + c2.first.first,"F"), 
						new Couple(c1.second.first.deleteLastChar,c1.second.second.deleteFisrtChar)))
			}
		}
	}
	
	/**
	 * 
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
	 * delete the last string's character and returns a new string 
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