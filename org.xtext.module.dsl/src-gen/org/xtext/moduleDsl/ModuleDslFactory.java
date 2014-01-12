/**
 */
package org.xtext.moduleDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.moduleDsl.ModuleDslPackage
 * @generated
 */
public interface ModuleDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModuleDslFactory eINSTANCE = org.xtext.moduleDsl.impl.ModuleDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>LANGUAGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LANGUAGE</em>'.
   * @generated
   */
  LANGUAGE createLANGUAGE();

  /**
   * Returns a new object of class '<em>MODULE DECL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MODULE DECL</em>'.
   * @generated
   */
  MODULE_DECL createMODULE_DECL();

  /**
   * Returns a new object of class '<em>CRITERION DECL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CRITERION DECL</em>'.
   * @generated
   */
  CRITERION_DECL createCRITERION_DECL();

  /**
   * Returns a new object of class '<em>DATASEL DECL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DATASEL DECL</em>'.
   * @generated
   */
  DATASEL_DECL createDATASEL_DECL();

  /**
   * Returns a new object of class '<em>END</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>END</em>'.
   * @generated
   */
  END createEND();

  /**
   * Returns a new object of class '<em>CRITERION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CRITERION</em>'.
   * @generated
   */
  CRITERION createCRITERION();

  /**
   * Returns a new object of class '<em>DATASEL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DATASEL</em>'.
   * @generated
   */
  DATASEL createDATASEL();

  /**
   * Returns a new object of class '<em>VAR CST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VAR CST</em>'.
   * @generated
   */
  VAR_CST createVAR_CST();

  /**
   * Returns a new object of class '<em>VAR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VAR</em>'.
   * @generated
   */
  VAR createVAR();

  /**
   * Returns a new object of class '<em>Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow</em>'.
   * @generated
   */
  Flow createFlow();

  /**
   * Returns a new object of class '<em>CST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CST</em>'.
   * @generated
   */
  CST createCST();

  /**
   * Returns a new object of class '<em>TYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TYPE</em>'.
   * @generated
   */
  TYPE createTYPE();

  /**
   * Returns a new object of class '<em>RANGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RANGE</em>'.
   * @generated
   */
  RANGE createRANGE();

  /**
   * Returns a new object of class '<em>INTERVAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INTERVAL</em>'.
   * @generated
   */
  INTERVAL createINTERVAL();

  /**
   * Returns a new object of class '<em>LSET</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LSET</em>'.
   * @generated
   */
  LSET createLSET();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>INSTRUCTION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INSTRUCTION</em>'.
   * @generated
   */
  INSTRUCTION createINSTRUCTION();

  /**
   * Returns a new object of class '<em>IF INSTR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IF INSTR</em>'.
   * @generated
   */
  IF_INSTR createIF_INSTR();

  /**
   * Returns a new object of class '<em>LOOP INSTR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LOOP INSTR</em>'.
   * @generated
   */
  LOOP_INSTR createLOOP_INSTR();

  /**
   * Returns a new object of class '<em>ERROR INSTR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ERROR INSTR</em>'.
   * @generated
   */
  ERROR_INSTR createERROR_INSTR();

  /**
   * Returns a new object of class '<em>NULL INSTR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NULL INSTR</em>'.
   * @generated
   */
  NULL_INSTR createNULL_INSTR();

  /**
   * Returns a new object of class '<em>ASSIGN INSTR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASSIGN INSTR</em>'.
   * @generated
   */
  ASSIGN_INSTR createASSIGN_INSTR();

  /**
   * Returns a new object of class '<em>SINGLE ASSIGN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SINGLE ASSIGN</em>'.
   * @generated
   */
  SINGLE_ASSIGN createSINGLE_ASSIGN();

  /**
   * Returns a new object of class '<em>EXPRESSION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EXPRESSION</em>'.
   * @generated
   */
  EXPRESSION createEXPRESSION();

  /**
   * Returns a new object of class '<em>int LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>int LITERAL</em>'.
   * @generated
   */
  intLITERAL createintLITERAL();

  /**
   * Returns a new object of class '<em>real LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>real LITERAL</em>'.
   * @generated
   */
  realLITERAL createrealLITERAL();

  /**
   * Returns a new object of class '<em>bool LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bool LITERAL</em>'.
   * @generated
   */
  boolLITERAL createboolLITERAL();

  /**
   * Returns a new object of class '<em>str LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>str LITERAL</em>'.
   * @generated
   */
  strLITERAL createstrLITERAL();

  /**
   * Returns a new object of class '<em>enum LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum LITERAL</em>'.
   * @generated
   */
  enumLITERAL createenumLITERAL();

  /**
   * Returns a new object of class '<em>bit LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bit LITERAL</em>'.
   * @generated
   */
  bitLITERAL createbitLITERAL();

  /**
   * Returns a new object of class '<em>hex LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>hex LITERAL</em>'.
   * @generated
   */
  hexLITERAL createhexLITERAL();

  /**
   * Returns a new object of class '<em>ident LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ident LITERAL</em>'.
   * @generated
   */
  identLITERAL createidentLITERAL();

  /**
   * Returns a new object of class '<em>unknow LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unknow LITERAL</em>'.
   * @generated
   */
  unknowLITERAL createunknowLITERAL();

  /**
   * Returns a new object of class '<em>ERROR ASSIGN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ERROR ASSIGN</em>'.
   * @generated
   */
  ERROR_ASSIGN createERROR_ASSIGN();

  /**
   * Returns a new object of class '<em>NULL ASSIGN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NULL ASSIGN</em>'.
   * @generated
   */
  NULL_ASSIGN createNULL_ASSIGN();

  /**
   * Returns a new object of class '<em>OR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OR</em>'.
   * @generated
   */
  OR createOR();

  /**
   * Returns a new object of class '<em>AND</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AND</em>'.
   * @generated
   */
  AND createAND();

  /**
   * Returns a new object of class '<em>EQUAL DIFF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EQUAL DIFF</em>'.
   * @generated
   */
  EQUAL_DIFF createEQUAL_DIFF();

  /**
   * Returns a new object of class '<em>COMPARISON</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COMPARISON</em>'.
   * @generated
   */
  COMPARISON createCOMPARISON();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub</em>'.
   * @generated
   */
  Sub createSub();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>str REDUCTION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>str REDUCTION</em>'.
   * @generated
   */
  strREDUCTION createstrREDUCTION();

  /**
   * Returns a new object of class '<em>NOT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NOT</em>'.
   * @generated
   */
  NOT createNOT();

  /**
   * Returns a new object of class '<em>int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>int Constant</em>'.
   * @generated
   */
  intConstant createintConstant();

  /**
   * Returns a new object of class '<em>real Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>real Constant</em>'.
   * @generated
   */
  realConstant createrealConstant();

  /**
   * Returns a new object of class '<em>str Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>str Constant</em>'.
   * @generated
   */
  strConstant createstrConstant();

  /**
   * Returns a new object of class '<em>enum Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum Constant</em>'.
   * @generated
   */
  enumConstant createenumConstant();

  /**
   * Returns a new object of class '<em>bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bool Constant</em>'.
   * @generated
   */
  boolConstant createboolConstant();

  /**
   * Returns a new object of class '<em>Var Exp Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Exp Ref</em>'.
   * @generated
   */
  VarExpRef createVarExpRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModuleDslPackage getModuleDslPackage();

} //ModuleDslFactory
