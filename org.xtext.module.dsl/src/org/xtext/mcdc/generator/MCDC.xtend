package org.xtext.mcdc.generator
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.helper.*;
import org.xtext.moduleDsl.*
import java.util.List
import java.util.ArrayList
import org.xtext.helper.Couple

class MCDC {
	
	def List<List<Couple>>mcdcList(EXPRESSION exp){
		
		var resultList = new ArrayList<List<Couple>>
		
		if(exp instanceof AND){
			System.out.println("AND")
			var leftList = new ArrayList<Couple>
		    var rightList = new ArrayList<Couple>
		
			//Add T1, T2 and F3 to lesftList
			leftList.add(new Couple('T',"1"))
			leftList.add(new Couple('T',"2"))
			leftList.add(new Couple('F',"3"))
			
			//Add T1, F2 and T3 to righttList
			leftList.add(new Couple('T',"1"))
			leftList.add(new Couple('F',"2"))
			leftList.add(new Couple('T',"3"))
			
			val andExp = (exp as AND)
			
			//call recursively on enumMcdc method
			enumMcdc(andExp.left, leftList, resultList)
			enumMcdc(andExp.right, rightList, resultList)
			
		
		}
		else{
			if(exp instanceof OR){
				System.out.println("OR")
				var leftList = new ArrayList<Couple>
				var rightList = new ArrayList<Couple>
				
				//Add T1, T2 and F3 to lesftList
				leftList.add(new Couple('T',"1"))
				leftList.add(new Couple('F',"2"))
				leftList.add(new Couple('F',"3"))
				
				//Add T1, F2 and T3 to righttList
				leftList.add(new Couple('F',"1"))
				leftList.add(new Couple('T',"2"))
				leftList.add(new Couple('F',"3"))
				
				val orExp = (exp as OR)
				
				//call recursively on enumMcdc method
				enumMcdc(orExp.left, leftList, resultList)
				enumMcdc(orExp.right, rightList, resultList)
			}
			else{
				if( exp instanceof NOT){
					val notExp = (exp as NOT)
					//No need to define values for the first "not" exprression
					mcdcList(notExp.exp)
				}
				else{ 
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						
						var list = new ArrayList<Couple>
						System.out.println("VAR: ")
						list.add(new Couple('T',"1"))
						list.add(new Couple('F',"2"))
						
						resultList.add(list)
					}
					else{
						//throw new Exception("Illegal boolean expression")
					}
				}
			}
		}
			
		return resultList
	}
	
	def void enumMcdc(EXPRESSION exp, List<Couple> list, List<List<Couple>> result){
		if (exp instanceof AND){
			System.out.println("AND ")
			var leftList = new ArrayList<Couple>
			var rightList = new ArrayList<Couple>
			
			System.out.println(list.toString)
			doAndEval(list, leftList, rightList)
			
			enumMcdc( (exp as AND).left , leftList, result )
			enumMcdc( (exp as AND).right , rightList, result )
			
		}
		else{
			if (exp instanceof OR){
				System.out.println("OR")
				var leftList = new ArrayList<Couple>
				var rightList = new ArrayList<Couple>
				
				System.out.println(list.toString)
				doOrEval(list, leftList, rightList)
				
				enumMcdc( (exp as OR).left , leftList, result )
				enumMcdc( (exp as OR).right , rightList, result )
			
			}
			else{
				if (exp instanceof NOT){
					var notList = new ArrayList<Couple>
					doNotEval(list, notList)
					enumMcdc((exp as NOT).exp , notList, result)
				}
				else {
					if (exp instanceof EQUAL_DIFF || exp instanceof COMPARISON || exp instanceof VarExpRef){
						System.out.println(list.toString)
						doEqCompVarEval(list , result)
					}
					else{
						throw new Exception()
					}
				}
			}
		}
	}
	
	
	def void doAndEval(List<Couple> couples, List<Couple> left, List<Couple> right) {
		
		//for each couple of the list do the following tests
		for (c:couples){
			if (c.value == 'T'){
				left.add(new Couple('T', c.index + "1"))
				right.add(new Couple('T', c.index + "1"))
			}
			else {
				if(c.value == 'F'){
					left.add(new Couple('T', c.index + "1"))
					right.add(new Couple('F', c.index + "1"))
					left.add(new Couple('F', c.index + "2"))
					right.add(new Couple('T', c.index + "2"))
				}
				else{
					//throw new Exception("Illegal argument")
				}
			}
		}
		
	}
	
	def void doOrEval(List<Couple> couples, List<Couple> left, List<Couple> right) {
		
		//for each couple of the list do the following tests
		for (c:couples){
			if (c.value == 'F'){
				left.add(new Couple('F', c.index + "1"))
				right.add(new Couple('F', c.index + "1"))
			}
			else {
				if(c.value == 'T'){
					left.add(new Couple('T', c.index + "1"))
					right.add(new Couple('F', c.index + "1"))
					left.add(new Couple('F', c.index + "2"))
					right.add(new Couple('T', c.index + "2"))
				}
				else{
					//throw new Exception("Illegal argument")
				}
			}
		}
	}
	
	def void doNotEval(List<Couple> couples, List<Couple> notlist) {
		for (c:couples){
			if (c.value == 'F'){
				notlist.add(new Couple('T', c.index))
			}
			else {
				if(c.value == 'T'){
					notlist.add(new Couple('F', c.index))
				}
				else{
					//throw new Exception("Illegal argument")
				}
			}
		}
	}
	
	def void doEqCompVarEval(List<Couple> couples, List<List<Couple>>result) {
		result.add(couples)
		System.out.println("VAR")
	}
	
	
}//class