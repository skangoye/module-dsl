/*
 * generated by Xtext
 */
 
package org.xtext.validation

import org.xtext.types.*
import org.eclipse.xtext.validation.Check
import org.xtext.moduleDsl.*
import java.lang.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import java.util.List
import java.util.ArrayList
import org.xtext.mcdc.generator.MCDC
import org.xtext.helper.Couple
import org.xtext.mcdc.generator.MCDC_GEN
import org.xtext.helper.Triplet

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ModuleDslValidator extends AbstractModuleDslValidator {
	
public static val INVALID_NAME = 'invalidName'  
public static val INVALID_INPUT = 'invalidInput'  
	
	/**
	 * Verify that module name is unique
	 */
	
	@Check
	def checkModuleNameIsUnique (MODULE_DECL module) {
		val lang = module.getContainerOfType(LANGUAGE)
		val dup = lang.modules.findFirst[it != module && it.name == module.name]
			if (dup != null) {	
				error("Duplicate module name " + module.name + "!", 
					ModuleDslPackage.Literals.MODULE_DECL__NAME, INVALID_NAME )
			}	
	}
	
	@Check
	def checkCriterionDecl(CRITERION_DECL decl){
		val criterion = decl.crit
		if (criterion == null ){
			error("Test criterion is not defined", null)
		}
		else {  val end = decl.end.end
				if ( end == null) {
				error("Syntax error,insert ';' to complete field declaration", ModuleDslPackage.Literals.CRITERION_DECL__CRIT)
			   }
		}
	}
	
	@Check
	def checkDataSelDecl(DATASEL_DECL decl){
		val data1 = decl.data1
		val data2 = decl.data2
		if (data1 == null && data2 == null ){
			error("Test data selection policy is not defined", null)
		}
		else {  val end = decl.end.end
				if ( end == null ) {
			     if (data2 == null){
					error("Syntax error,insert ';' to complete field declaration", ModuleDslPackage.Literals.DATASEL_DECL__DATA1)
			   	 }
			   	 else {
			   	 	error("Syntax error,insert ';' to complete field declaration", ModuleDslPackage.Literals.DATASEL_DECL__DATA2)
			   	 }
			   }
		}
	}
	
	//Check that data selection criteria are distinct
	@Check
	def checkDataSelectElementsAreDif(DATASEL data) {
		val strat = data.getContainerOfType(STRATEGY)
		val data1 = strat.dataseldecl.data1
		val data2 = strat.dataseldecl.data2
			 if  (data1.sel == data2?.sel)  {
				error("Test data selection criteria must be distinct!", 
					ModuleDslPackage.Literals.DATASEL__SEL, INVALID_INPUT )
			 }		
	}
	
	@Check
	def checkVarDecl(VAR v){
		val flow = v.flow?.flow

		if (flow != null){
			val name = v.name
			if (name == null){
				error("Variable name is expected", null)
			}
			else{ 
				if (v.type == null){ ///////////////
					error("Variable type must be declared", ModuleDslPackage.Literals.VAR_CST__NAME)
				}
				else {
					if (v.type.type == 'enum' && v.range == null) {
						error("An Enumeration variable must declare a set of values!", 
						ModuleDslPackage.Literals.VAR_CST__TYPE)
					}
					else {
						if (v.end.end==null) {
							error("Syntax error,insert ';' to complete field declaration", ModuleDslPackage.Literals.VAR_CST__TYPE)
						}
					}
				}
			}
		}
	}
	
	@Check
 	def checkVarRange(RANGE range){
 		range.checkRange
 	}
 	
	def dispatch checkRange(INTERVAL interval){
		
		val vartype = interval.getContainerOfType(VAR).type
		
		if (vartype == null){
			return //no check
		}
		else{
			val typeVal = vartype.type
			if (typeVal == 'bool') {
				error("Interval is not allowed for Boolean types", null)
			}
			else {
				if (typeVal == 'str') {
					error("Interval is not allowed for String types", null)
				}
				else {
					if (typeVal == 'enum') {
						error("Interval is not allowed for Enumeration types", null)
					}
					else{ // vartype supports interval
						 // TODO: check interval conformance
						 
						val min = interval.min?.typeProvider
						val max = interval.max?.typeProvider
						
						if(min == null || max==null){
							error("Incorrect interval type declaration",null)
						}
						else{
							if (min != typeVal && min != 'neutral'){
								error("The value must be of type " + typeVal, ModuleDslPackage.Literals.INTERVAL__MIN)
							}
							if (max != typeVal && max != 'neutral'){
								error("The value must be of type " + typeVal, ModuleDslPackage.Literals.INTERVAL__MAX)
							}
						}
								
					}//else vartype supports interval
				} 
			}
			
		}
		/////////////check min and max values of the interval if interval values are conform to the vartype 
		checkIntervalminMaxValues(interval)
	}
	
	def checkIntervalminMaxValues(INTERVAL interval){
		
		val mintype = interval?.min?.typeProvider
		val maxtype = interval?.max?.typeProvider
		
		if ( mintype == maxtype && mintype !=null){
			
			val commonType = mintype
			
			if (commonType == 'int'){
				val minval = interval?.min as intLITERAL
				val maxval = interval?.max as intLITERAL
				if (minval.value >= maxval.value) {
					error("Incorrect interval type declaration: lower bound value must be less than upper bound value",
						 ModuleDslPackage.Literals.INTERVAL__MIN)
				}
			}
			else{
				if (commonType == 'real'){
					val minval = interval?.min as realLITERAL
					val maxval = interval?.max as realLITERAL
					if (minval.value >= maxval.value) {
						error("Incorrect interval type declaration: lower bound value must be less than upper bound value",
						 ModuleDslPackage.Literals.INTERVAL__MIN)
					}
				}
			}
			
			////TODO Add other variables that allow Intervals: bit, hex	
		}
	}
	
	def dispatch checkRange(LSET set){
		
		val vartype = set.getContainerOfType(VAR).type
		if(vartype == null){
			return //no check
		}
		else{
			if (vartype.type == 'bool'){
				error("Set is not allowed for Boolean types", null)
			}
			else{//set supported by variable type
				if(set.value.size == 0){
					error("Incorrect set type declaration" + "",null)
				}
			}
		}
	}

	@Check
	def checkLiteralTypeInSET(Literal literal){
		val variable = literal.getContainerOfType(VAR)
		val literalSet = literal.getContainerOfType(LSET)
		if(variable != null && literalSet != null){
			//literal is contained in a variable and a set
			val vartype = variable.type?.type
			val literaltype = literal.typeProvider
			if(vartype != null && vartype != 'bool' && vartype != literaltype){
				//case literaltype == 'unknow is also handled here
				error("The value must be of type " + vartype, null)
			}
			else{
				//No error i.e literal type is conform to the variable type
				//literal is contained in a set
				if( (vartype != null) && (vartype==literaltype) && (vartype != 'bool') ){
					//call this method only if litreal type is conform i.e w.r.t to variable type
					checkNoDupliteralInSet(literal, literalSet)
				}
			}
			
		}
	}
	
	def private checkNoDupliteralInSet(Literal literal, LSET set){
		val listLiteral = set.value
		val dup = listLiteral.findFirst[ (it != literal) && (it.valueProvider == literal.valueProvider) 
														 && (it.typeProvider == literal.typeProvider) ]
		//the add of condition (it.typeProvider == literal.typeProvider) ensures that 
		//two literals are equal if they "toString" methods on theirs values match as well as they types
		if (dup != null) {	
			error("set's elements must be distinct", null)
		}
	}
	
	def private String valueProvider(Literal literal) {
		switch (literal){
			intLITERAL    : literal.value.toString
			realLITERAL   : literal.value.toString
			boolLITERAL   : literal.value.toString
			strLITERAL    : literal.value.toString
			enumLITERAL   : literal.value.toString
			bitLITERAL    : literal.value.toString
			hexLITERAL    : literal.value.toString
			unknowLITERAL : literal.value.toString
		}
	}
	

	def String typeProvider(Literal literal) {
		switch (literal){
			intLITERAL    : 'int'
			realLITERAL   : 'real'
			boolLITERAL   : 'bool'
			strLITERAL    : 'str'
			enumLITERAL   : 'enum'
			bitLITERAL    : 'bit'
			hexLITERAL    : 'hex'
			unknowLITERAL : 'neutral'
		}
	}
	
	
	/**
	 * verify that variable or constant declaration name is unique among
	 * all those declared variables and constants
	 */
	 
	@Check
	def checkVarOrConstNameIsUnique(VAR_CST v) {
		val varcst = v.getContainerOfType(MODULE_DECL).interface.declaration
		val dup = varcst.findFirst[ (it != v && it.name == v.name) ]
		if (dup != null){
			error("Variable or constant name should be unique", 
					ModuleDslPackage.Literals.VAR_CST__NAME, INVALID_NAME )
		}
	}
	
	 
	 @Check
	 def checkConstDecl(CST const){
	 	val flow = const.flow
	 	if (flow != null){
	 		val name = const.name
			if (name == null){
				error("Incomplete constant declaration, constant name is expected", null)
			}
			else{  
				if (const.type == null){ ///////////////
					error("constant type must be declared", ModuleDslPackage.Literals.VAR_CST__NAME)
				}
				else {
					if ( const.value == null) {
						error("Constant Value is expected", ModuleDslPackage.Literals.VAR_CST__TYPE)
					}
					else {
						val type = const.type.type
						if (type != const.value.typeProvider){
							error("The value must be of type " + type, ModuleDslPackage.Literals.CST__VALUE)
						}
						else { if(const.end.end==null) {
									error("Syntax error,insert ';' to complete field declaration", ModuleDslPackage.Literals.VAR_CST__TYPE)
							   }
						}
					}
				}
			}
		}
	 }
	 
	 
	/**
	 * Type checker methods
	 * Check that an expression (boolean, arithmetic, string, enumeration) is well typed
	 */
	 
	 @Inject extension ExpressionsTypeProvider
	 
	 
	 def private String getNonNullType(EXPRESSION exp, EReference ref){
	 	var type = exp?.typeFor
	 	if(type == null){
	 		error("null type", ref)
	 	}
	 	return type
	 }
	 
	 def private checkExpectedBoolean(EXPRESSION exp, EReference ref){
	 	checkExpectedType(exp, ExpressionsTypeProvider::boolType,ref)
	 }
	 
	 def private checkNotBoolean(String type, EReference ref){
	 	if (type == ExpressionsTypeProvider::boolType){
	 		error("cannot be boolean", ref)
	 	}
	 }
	 
	 def private checkNotString(String type, EReference ref){
	 	if (type == ExpressionsTypeProvider::strType){
	 		error("cannot be string", ref)
	 	}
	 }
	 
	 def private checkNotEnum(String type, EReference ref){
	 	if (type == ExpressionsTypeProvider::enumType){
	 		error("cannot be enumeration", ref)
	 	}
	 }
	 
	 def private checkNotIntandNotReal(String type, EReference ref){
	 	if (type != ExpressionsTypeProvider::intType && type != ExpressionsTypeProvider::realType ){
	 		error("expected intType or realType, but was "+ type, ref)
	 	}
	 }
	 
	 def private checkExpectedType(EXPRESSION exp, String expectedType,EReference ref){
	 	val actualType = getNonNullType(exp,ref)
	 	if(actualType != expectedType){
	 		error("expected " + expectedType + " type, but was "+ actualType, ref)
	 	}
	 }
	 
	 def private checkExpectedSame(String leftType, String rightType){
	 	if(leftType != null && rightType!= null && leftType != rightType){
	 		error("expected the same type, but was " + leftType+ ", " + rightType, null)
	 	}
	 }
	 
	 @Check
	 def checkType(NOT not){
	 	checkExpectedBoolean(not.exp, ModuleDslPackage.Literals.NOT__EXP)
	 }
	 
	 @Check
	 def checkType(AND and){
	 	checkExpectedBoolean(and.left, ModuleDslPackage.Literals.AND__LEFT)
	 	checkExpectedBoolean(and.right, ModuleDslPackage.Literals.AND__RIGHT)
	 }
	 
	 @Check
	 def checkType(OR or){
	 	checkExpectedBoolean(or.left, ModuleDslPackage.Literals.OR__LEFT)
	 	checkExpectedBoolean(or.right, ModuleDslPackage.Literals.OR__RIGHT)
	 }
	 
	 @Check
	 def checkType(MULT mult){
	 	val leftType = getNonNullType(mult.left, ModuleDslPackage.Literals.MULT__LEFT)
	 	val rightType = getNonNullType(mult.right, ModuleDslPackage.Literals.MULT__RIGHT)
	 	
	 	checkNotIntandNotReal(leftType, ModuleDslPackage.Literals.MULT__LEFT)
	 	checkNotIntandNotReal(rightType, ModuleDslPackage.Literals.MULT__RIGHT)
	 }
	 
	 @Check
	 def checkType(DIV div){
	 	val leftType = getNonNullType(div.left, ModuleDslPackage.Literals.DIV__LEFT)
	 	val rightType = getNonNullType(div.right, ModuleDslPackage.Literals.DIV__RIGHT)
	 	
	 	checkNotIntandNotReal(leftType, ModuleDslPackage.Literals.DIV__LEFT)
	 	checkNotIntandNotReal(rightType, ModuleDslPackage.Literals.DIV__RIGHT)
	 }
	 
	 @Check
	 def checkType(SUB sub){
	 	val leftType = getNonNullType(sub.left, ModuleDslPackage.Literals.SUB__LEFT)
	 	val rightType = getNonNullType(sub.right, ModuleDslPackage.Literals.SUB__RIGHT)
	 	
 		checkNotIntandNotReal(leftType, ModuleDslPackage.Literals.SUB__LEFT)
	 	checkNotIntandNotReal(rightType, ModuleDslPackage.Literals.SUB__RIGHT)
	 }
	 
	 @Check
	 def checkType(COMPARISON comp){
	 	val leftType = getNonNullType(comp.left, ModuleDslPackage.Literals.COMPARISON__LEFT)
	 	val rightType = getNonNullType(comp.right, ModuleDslPackage.Literals.COMPARISON__RIGHT)
	 	
	 	checkExpectedSame(leftType, rightType)
	 	
	 	checkNotBoolean(leftType, ModuleDslPackage.Literals.COMPARISON__LEFT)
	 	checkNotBoolean(rightType, ModuleDslPackage.Literals.COMPARISON__RIGHT)
	 	
	 	checkNotString(leftType, ModuleDslPackage.Literals.COMPARISON__LEFT)
	 	checkNotString(rightType, ModuleDslPackage.Literals.COMPARISON__RIGHT)
	 	
	 	checkNotEnum(leftType, ModuleDslPackage.Literals.COMPARISON__LEFT)
	 	checkNotEnum(rightType, ModuleDslPackage.Literals.COMPARISON__RIGHT)
	 }
	 
	 @Check
	 def checkType(EQUAL_DIFF eqdif){
	 	val leftType = getNonNullType(eqdif.left, ModuleDslPackage.Literals.EQUAL_DIFF__LEFT)
	 	val rightType = getNonNullType(eqdif.right, ModuleDslPackage.Literals.EQUAL_DIFF__RIGHT)
	 	
	 	checkExpectedSame(leftType, rightType)
	 } 
	 
	 @Check
	 def checkType(ADD add){
	 	val leftType = getNonNullType(add.left, ModuleDslPackage.Literals.ADD__LEFT)
	 	val rightType = getNonNullType(add.right, ModuleDslPackage.Literals.ADD__RIGHT)
	 	
	 	if ( (leftType == ExpressionsTypeProvider::intType || leftType == ExpressionsTypeProvider::realType)
	 		&& (rightType == ExpressionsTypeProvider::intType || rightType == ExpressionsTypeProvider::realType) ) {
	 		return
	 	}
	 	else {
	 		checkNotBoolean(leftType, ModuleDslPackage.Literals.ADD__LEFT)
	 		checkNotBoolean(rightType, ModuleDslPackage.Literals.ADD__RIGHT)
	 		
	 		checkNotEnum(leftType, ModuleDslPackage.Literals.ADD__LEFT)
	 		checkNotEnum(rightType, ModuleDslPackage.Literals.ADD__RIGHT)
	 		
	 		checkExpectedSame(leftType, rightType)
	 	}
	 	
	 }
	 
	 /**
	  * Check instructions declaration
	  */
	 @Check
	 def checkNoErrorInstrOutOfIFandLoop (ERROR_INSTR err){
	 	val outif = err.getContainerOfType(IF_INSTR)
	 	val outloop = err.getContainerOfType(LOOP_INSTR)
	 	if(outif==null && outloop==null){
	 		error("error statement is only allowed within If/Loop declaration", null)
	 	} 	
	 }
	 
	 @Check
	 def checkNoNullInstrOutOfIFandLoop (NULL_INSTR nul){
	 	val outif = nul.getContainerOfType(IF_INSTR)
	 	val outloop = nul.getContainerOfType(LOOP_INSTR)
	 	if(outif==null && outloop==null){
	 		error("null statement is only allowed within If/Loop declaration", null)
	 	} 	
	 }
	 
	 @Check
	 def checkIfConditionIsBoolean(IF_INSTR ifinstr){
	 	val type = ifinstr.ifcond?.typeFor
	 	if(type != ExpressionsTypeProvider::boolType){
			error("expected boolean type, but was "+ type,  ModuleDslPackage.Literals.IF_INSTR__IFCOND)
	 	} 	
	 }
	 
	 def private checkExpIsVarAndNotInput(SINGLE_ASSIGN sa, EReference ref){
	 	val exp = sa.left 
	 	if (exp instanceof VarExpRef) {
	 		val varexp = (exp as VarExpRef).vref
	 		if(varexp instanceof VAR){
	 			val myflow = (varexp as VAR).flow.flow
	 			if(myflow == 'in'){
	 				error("An input variable cannot be used as assignment's left-hand side",ref)
	 			}
	 			else{
	 				if (myflow == 'out' || myflow == 'inout' || myflow == 'tmp' ){
	 					sa.checkSameType
	 					checkNoDupLeftExp( (exp as VarExpRef), ref )
	 				}
	 			}
	 		}
	 		else{
	 			error ("The left-hand side of an assignment must be a variable", ref)
	 		}
	 	}
	 	else{
	 		if (exp == null){
	 			error ("The left-hand side of an assignment must be a variable", null)
	 		}
	 		else{
	 			System.out.println(sa.left)
	 			error ("The left-hand side of an assignment must be a variable", ref)
	 		}
	 	}
	 }
	 
	 def private checkSameType(SINGLE_ASSIGN sa){
	 	val leftType = sa.left?.typeFor
	 	val rightType = sa.right?.typeFor
	 	if(leftType != null  && leftType != rightType){
	 		if (rightType != null){
	 			error("connot assign "+ rightType + " to " + leftType + ", expected " + leftType, ModuleDslPackage.Literals.SINGLE_ASSIGN__RIGHT)
	 		}
	 		else{
	 			error("connot assign "+ rightType + " to " + leftType + ", expected " + leftType, ModuleDslPackage.Literals.SINGLE_ASSIGN__LEFT)
	 		}	
	 	}
	 }
	 
	 def private checkNoDupLeftExp(VarExpRef vref, EReference ref) {
	 	val filt_list_assign = vref.getContainerOfType(ASSIGN_INSTR).sa.filter[ it.left instanceof VarExpRef ]
	 	val assign = vref.getContainerOfType(SINGLE_ASSIGN)
	 	val dup = filt_list_assign.findFirst[ it != assign && (it.left as VarExpRef).vref  == vref.vref]
	 	if(dup != null){
	 		error("multiple assignment of the same variable is not allowed in a statement",ref)
	 	}
	 }
	 
	 @Check
	 def checkAssignLeftHand(SINGLE_ASSIGN sa){
	 	checkExpIsVarAndNotInput(sa, ModuleDslPackage.Literals.SINGLE_ASSIGN__LEFT)
	 }
	 
	 @Check
	 def checkNoOutVarInAssignRightHand(VarExpRef vref){
	 	val ref = vref.vref
	 	if (ref instanceof VAR){
	 		val flow = (ref as VAR).flow.flow
		 	val sa = vref.getContainerOfType(SINGLE_ASSIGN)
		 	if (sa != null && flow=='out'){
		 		if( !(sa.left instanceof VarExpRef) ){
		 			return
		 		}
		 		else{
		 			if(sa.left as VarExpRef == vref){ 
		 				return
		 			}
		 			else{
		 				if (sa.right != null){
				 			val list = new ArrayList<VAR>
				 			varInExpression(sa.right, list)
				 			System.out.println(list)
				 			if (list.contains(ref as VAR)){
				 				error("An output variable cannot take part into right-hand side of an assignment", null)
				 			}
						}
		 			}
		 		}		 		
		 	}
	 	}
	 }
	  
	 def private void varInExpression(EXPRESSION exp, List<VAR> list){
	 	
	 	if (exp instanceof OR){
	 		val or = (exp as OR)
	 		varInExpression(or.left , list) varInExpression(or.right , list)
	 	}
	 	else{
	 		if (exp instanceof AND){
	 			val and = (exp as AND)
	 			varInExpression(and.left, list) varInExpression(and.right, list)
	 		}
	 		else{
	 			if (exp instanceof EQUAL_DIFF){
	 				val eq = (exp as EQUAL_DIFF)
	 				varInExpression(eq.left , list) varInExpression(eq.right , list)
	 		 	}
	 		 	else{
	 		 		if (exp instanceof COMPARISON){
	 					val cmp = (exp as COMPARISON)
	 					varInExpression(cmp.left , list) varInExpression(cmp.right , list)
	 		 		}
	 		 		else{
	 		 			if (exp instanceof ADD){
	 						val add = (exp as ADD)
	 						varInExpression(add.left , list) varInExpression(add.right , list)
	 		 			}
	 		 			else{
	 		 				if (exp instanceof SUB){
	 							val sub = (exp as SUB)
	 							varInExpression(sub.left , list) varInExpression(sub.right , list)
	 		 			 	}
	 		 			 	else{
	 		 			 		if (exp instanceof MULT){
	 								val mul = (exp as MULT)
	 								varInExpression(mul.left , list) varInExpression(mul.right , list)
	 		 			 		}
	 		 			 		else{
	 		 			 			if (exp instanceof DIV){
	 									val div = (exp as DIV)
	 									varInExpression(div.left , list) varInExpression(div.right , list)
	 		 			 			}
	 		 			 			else{
	 		 			 				if (exp instanceof VarExpRef){
	 										val ref = (exp as VarExpRef).vref
	 										if(ref instanceof VAR){
										 		val flow = (ref as VAR).flow.flow
										 		if(flow == 'out'){
										 			list.add(ref as VAR)
										 		}
										 	}
	 		 			 				}
	 		 			 				else{
	 		 			 				
	 		 			 				}
	 		 			 			}
	 		 			 		}
	 		 			 	}
	 		 			}
	 		 		}
	 		 	}
	 		}
	 	}
	 }//method
	 
	 @Check
	 def checkEnumValue(SINGLE_ASSIGN sa){
	 	val leftType = sa.left?.typeFor
	 	val rightType = sa.right?.typeFor
	 	if(leftType != null && rightType != null && leftType==rightType ){
	 		if(leftType==ExpressionsTypeProvider::enumType){
	 			if(sa.left instanceof VarExpRef && sa.right instanceof enumConstant){
	 				val leftvar = (sa.left as VarExpRef).vref
	 				val rightvar = (sa.right as enumConstant).value
	 				if (leftvar instanceof VAR){
	 					val range = (leftvar as VAR).range
	 					if(range instanceof LSET){
	 						val listVal = (range as LSET).value
	 						val existVar = (listVal.filter[it instanceof enumLITERAL]).exists[(it as enumLITERAL).value == rightvar]
	 						if(!existVar){
	 							error("This value is not part of variable "+ (leftvar as VAR).name + " enumeration values" , ModuleDslPackage.Literals.SINGLE_ASSIGN__RIGHT)
	 						}
	 					}
	 				}
	 			}
	 		}
	 	}
	 }
	
	 ////////////////////////////////////////////////////////////////
	 @Check
	 def checkMcdc(IF_INSTR inst){ 
	 	var i = 0
	 	//val mcdc = new MCDC()
	 	val mcdc2 = new MCDC_GEN()
	 	
//	 	System.out.println("resultat: ")
	 	//var result = new ArrayList<List<Triple>>
	 	var result2 = new ArrayList<List<Couple<Couple<String, String>, Couple<String, String> >>>
	 	
	 	
	 	
	 	val strList = new ArrayList<String>
	  	mcdc2.stringReprOfVar(inst.ifcond, strList)
	   
	 	//System.out.println("ddddddddddddd")
	 	System.out.println()
	 	//mcdc2.mcdcGen(inst.ifcond, result2)
	 	
	 	/*for (list: result2) {
	 		System.out.print("[")
	 		for (couple: list){
	 			i = i + 1
	 			System.out.print("("+ couple.first.first +", "+ couple.first.second + ", " + couple.second.first + ", " + couple.second.second + ")")
	 			if (list.size != i){
	 				System.out.print(", ")
	 			}
	 		}
	 		i = 0
	 		System.out.print("]")
	 		System.out.println
	 	}*/
	 	
	 	
	 	//System.out.println("xxxxxxxxxxxxx")
	 	val link = mcdc2.mcdcOfBooleanExp(inst.ifcond)
	 	
	 	//val listOfString = new ArrayList<String>
	 	//val listOfMcdcCond = new ArrayList < Couple<String, String> >
	 	val listToto =  new ArrayList< Triplet < List<Couple<String,String>>, List<String>, String > >
	 	val shouldBeCov =  new ArrayList< Triplet< List<String>, List<String>, String >>
	 	val resultat = new ArrayList< List < Triplet < List<Couple<String,String>>, List<String>,  String  > > >
	 	
	 	val shouldBeCov2 =  new ArrayList< Couple< List<String>, List<String> >>
	 	val condList = new ArrayList<EXPRESSION>
	 	val result = new ArrayList< Triplet< List<Couple<String,String>>, List<String>, Couple<String,String>> >
	 	
	 	mcdc2.mcdcOfInstruction(inst, condList, listToto, shouldBeCov, resultat)
	 	
	 	System.out.println
	 	
	 	for(ii:result){
	 		val listOfVal = ii.first
	 		val varInExp = ii.second
	 		val position = ii.third.first
	 		val kind = ii.third.second
	 		
			for(jj : listOfVal){
				System.out.print("[" + "("+ jj.first +", "+ jj.second + ")" + "]")
			}
			System.out.print("=> ")
	 		System.out.print(varInExp.toString)
	 		
	 		System.out.print(" => ")
	 		System.out.println(position + ", " + kind)
			System.out.println
	 	}
	 	
	 	val resfinal = new ArrayList<  Triplet < List<Couple<String,String>>, List<String>, String > >
	    mcdc2.composeMcdcWithinIstruction(resultat, resfinal)
	 	
	 	/*for (c: link) {
	 		System.out.print("[")
	 		
	 			System.out.print("("+ c.first +", "+ c.second + ")")
	 		
	 		System.out.print("]")
	 		System.out.println
	 	}*/
	 	
	 	
	 	val falseEval = link.filter[it.second == "F"]
	 	val trueEval = link.filter[it.second == "T"]
	 	val indepCouple = new ArrayList<Couple<String,String>>
	 	
	 	 for(f:falseEval){
		 	val fSeq = f.first
		 	
		 	for(t:trueEval){
		 		val tSeq = t.first
		 		 if (mcdc2.independantPairs(fSeq, tSeq)){
		 		 	indepCouple.add(new Couple(fSeq,tSeq))
		 		 }
		 	}
	
		 }
		 
		/*  System.out.println
	
		 System.out.println("Independent pairs")
		
		 for (elem:indepCouple){
		 		System.out.println("(" + elem.first + ", " + elem.second + ")")
		 }
		 
		 System.out.println*/
	 	
	 for (r:resultat){
	 	
	 	System.out.println("{")
	 	
	 	for(rr: r){
	 		val listOfValues = rr.first
	 		val varInExp = rr.third
	 		val id = rr.second
	 		
	 		System.out.print("[")
	 		for (c:listOfValues){
	 			System.out.print("("+ c.first +", "+ c.second +  ")" + ", ")
	 		}
	 		System.out.print("=> ") System.out.print(id) System.out.print(" => ")
	 		System.out.print(varInExp.toString)
	 	
	 		System.out.println("]")
	 	}
	 	
	 	System.out.println("}")
	 	System.out.println
	 }
	 
	 System.out.println("should be covered list")
	
	 for(ss:shouldBeCov){
	 	System.out.println( ss.first.toString + " => "+ ss.second.toString + " => " + ss.third.toString )	
	 }
	 
	 System.out.println
	  
	 System.out.println("resultat Final")
	 
	 for(tt: resfinal){
	 	val v1 = tt.first
	 	val v2 = tt. second
	 	System.out.print("[")
	 		for (c:v1){
	 			System.out.print("("+ c.first +", "+ c.second + ")" + ", ")
	 		}
	 		System.out.print("=> ")
	 		System.out.print(v2.toString)
	 		System.out.print(" => ")
	 		System.out.print(tt.third)
	 		System.out.println("]")
	 		System.out.println
	 }
	 
	 
	 mcdc2.mcdcCoverageVerdict(resfinal,shouldBeCov,resultat)
	 //	mcdc.mcdcList(inst.ifcond, result)
	 	
	 }//method
	 
	 
	 	 
}
