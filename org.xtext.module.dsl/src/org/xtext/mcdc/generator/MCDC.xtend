package org.xtext.mcdc.generator
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.moduleDsl.*
import java.util.List
import java.util.ArrayList
import org.xtext.helper.Triple

class MCDC {
	
	def List<List<Triple>>mcdcList(EXPRESSION exp){
		
		var resultList = new ArrayList<List<Triple>>
		
		if(exp instanceof AND){
			var leftList = new ArrayList<Triple>
		    var rightList = new ArrayList<Triple>
		
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
					//No need to define values for the first "not" expression
					mcdcList(notExp.exp)
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
			
		return resultList
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
	
	
}//class