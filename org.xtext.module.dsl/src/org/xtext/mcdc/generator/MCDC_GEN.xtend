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
	}

}//class