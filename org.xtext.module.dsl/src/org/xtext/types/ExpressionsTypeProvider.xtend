package org.xtext.types

import org.xtext.moduleDsl.*
import java.lang.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*


class ExpressionsTypeProvider {
	public static val intType = 'integer'
	public static val realType = 'real'
	public static val boolType = 'boolean'
	public static val strType = 'string'
	public static val enumType = 'enumeration'
	public static val hexType = 'hexadecimal'
	public static val bitType = 'bit'
	
	def dispatch String typeFor(EXPRESSION e){
		
		switch(e){
			intConstant :  intType
	 		realConstant:  realType
	 		strConstant :  strType
	 		enumConstant:  enumType
	 		boolConstant:  boolType
	 		bitConstant :  bitType
	 		hexConstant :  hexType
	 		AND         :  boolType
	 		OR          :  boolType
	 		NOT         :  boolType
	 		EQUAL_DIFF  :  boolType
	 		COMPARISON  :  boolType
		}	
	}
	
	def dispatch String typeFor(MULT e){
		val leftType = e.left?.typeFor
		val rightType = e.left?.typeFor
		if (leftType == intType && rightType == intType){
			return intType
		}
		else{
			if (leftType == realType && rightType == intType || leftType == intType && rightType == realType){
				return realType
			}
			else{
				return null
			}
		}
		
	}
	
	def dispatch String typeFor(DIV e){
		val leftType = e.left?.typeFor
		val rightType = e.left?.typeFor
		if (leftType == intType && rightType == intType){
			return intType
		}
		else{
			if (leftType == realType && rightType == intType || leftType == intType && rightType == realType){
				return realType
			}
			else{
				return null
			}
		}
		
	}
	
	def dispatch String typeFor(SUB e){
		val leftType = e.left?.typeFor
		val rightType = e.left?.typeFor
		if (leftType == intType && rightType == intType){
			return intType
		}
		else{
			if (leftType == realType && rightType == intType || leftType == intType && rightType == realType){
				return realType
			}
			else{
				return null
			}
		}
		
	}
	
	def dispatch String typeFor(ADD e){
		val leftType = e.left?.typeFor
		val rightType = e.left?.typeFor
		if (leftType == intType && rightType == intType){
			return intType
		}
		else{
			if (leftType == realType && rightType == intType || leftType == intType && rightType == realType){
				return realType
			}
			else{
				if (leftType == strType && rightType == strType){
					return strType
				}
				else{
					if (leftType == bitType && rightType == bitType){
						return bitType
					}
					else{
						if (leftType == hexType && rightType == hexType){
							return hexType
						}
						else{
							return null
						}
					}
				}
			}
		}
		
	}
	
	def dispatch String typeFor(VarExpRef e){
		if (e.vref == null	){
			return null
		}
		else{
			e.vref.VarTypeProvider
		}
		
		
	}
	
	def String VarTypeProvider(VAR_CST varcst) {
		val typ = varcst.type?.type
		switch typ {
			case typ=='int' : intType
			case typ=='real': realType
			case typ=='bool': boolType
			case typ=='enum': enumType
			case typ=='str' : strType
			case typ=='bit' : bitType
			case typ=='hex' : hexType
			default : null
			
		}
	}
	
	
	}