/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.moduleDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleDslFactoryImpl extends EFactoryImpl implements ModuleDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModuleDslFactory init()
  {
    try
    {
      ModuleDslFactory theModuleDslFactory = (ModuleDslFactory)EPackage.Registry.INSTANCE.getEFactory(ModuleDslPackage.eNS_URI);
      if (theModuleDslFactory != null)
      {
        return theModuleDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModuleDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModuleDslPackage.LANGUAGE: return createLANGUAGE();
      case ModuleDslPackage.MODULE_DECL: return createMODULE_DECL();
      case ModuleDslPackage.CRITERION_DECL: return createCRITERION_DECL();
      case ModuleDslPackage.DATASEL_DECL: return createDATASEL_DECL();
      case ModuleDslPackage.END: return createEND();
      case ModuleDslPackage.CRITERION: return createCRITERION();
      case ModuleDslPackage.DATASEL: return createDATASEL();
      case ModuleDslPackage.VAR_CST: return createVAR_CST();
      case ModuleDslPackage.VAR: return createVAR();
      case ModuleDslPackage.FLOW: return createFlow();
      case ModuleDslPackage.CST: return createCST();
      case ModuleDslPackage.TYPE: return createTYPE();
      case ModuleDslPackage.RANGE: return createRANGE();
      case ModuleDslPackage.INTERVAL: return createINTERVAL();
      case ModuleDslPackage.LSET: return createLSET();
      case ModuleDslPackage.LITERAL: return createLiteral();
      case ModuleDslPackage.INSTRUCTION: return createINSTRUCTION();
      case ModuleDslPackage.IF_INSTR: return createIF_INSTR();
      case ModuleDslPackage.LOOP_INSTR: return createLOOP_INSTR();
      case ModuleDslPackage.ERROR_INSTR: return createERROR_INSTR();
      case ModuleDslPackage.NULL_INSTR: return createNULL_INSTR();
      case ModuleDslPackage.ASSIGN_INSTR: return createASSIGN_INSTR();
      case ModuleDslPackage.SINGLE_ASSIGN: return createSINGLE_ASSIGN();
      case ModuleDslPackage.EXPRESSION: return createEXPRESSION();
      case ModuleDslPackage.INT_LITERAL: return createintLITERAL();
      case ModuleDslPackage.REAL_LITERAL: return createrealLITERAL();
      case ModuleDslPackage.BOOL_LITERAL: return createboolLITERAL();
      case ModuleDslPackage.STR_LITERAL: return createstrLITERAL();
      case ModuleDslPackage.ENUM_LITERAL: return createenumLITERAL();
      case ModuleDslPackage.BIT_LITERAL: return createbitLITERAL();
      case ModuleDslPackage.HEX_LITERAL: return createhexLITERAL();
      case ModuleDslPackage.IDENT_LITERAL: return createidentLITERAL();
      case ModuleDslPackage.UNKNOW_LITERAL: return createunknowLITERAL();
      case ModuleDslPackage.ERROR_ASSIGN: return createERROR_ASSIGN();
      case ModuleDslPackage.NULL_ASSIGN: return createNULL_ASSIGN();
      case ModuleDslPackage.OR: return createOR();
      case ModuleDslPackage.AND: return createAND();
      case ModuleDslPackage.EQUAL_DIFF: return createEQUAL_DIFF();
      case ModuleDslPackage.COMPARISON: return createCOMPARISON();
      case ModuleDslPackage.PLUS: return createPlus();
      case ModuleDslPackage.SUB: return createSub();
      case ModuleDslPackage.MULTI: return createMulti();
      case ModuleDslPackage.DIV: return createDiv();
      case ModuleDslPackage.STR_REDUCTION: return createstrREDUCTION();
      case ModuleDslPackage.NOT: return createNOT();
      case ModuleDslPackage.INT_CONSTANT: return createintConstant();
      case ModuleDslPackage.REAL_CONSTANT: return createrealConstant();
      case ModuleDslPackage.STR_CONSTANT: return createstrConstant();
      case ModuleDslPackage.ENUM_CONSTANT: return createenumConstant();
      case ModuleDslPackage.BOOL_CONSTANT: return createboolConstant();
      case ModuleDslPackage.VAR_EXP_REF: return createVarExpRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LANGUAGE createLANGUAGE()
  {
    LANGUAGEImpl language = new LANGUAGEImpl();
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODULE_DECL createMODULE_DECL()
  {
    MODULE_DECLImpl modulE_DECL = new MODULE_DECLImpl();
    return modulE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CRITERION_DECL createCRITERION_DECL()
  {
    CRITERION_DECLImpl criterioN_DECL = new CRITERION_DECLImpl();
    return criterioN_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATASEL_DECL createDATASEL_DECL()
  {
    DATASEL_DECLImpl dataseL_DECL = new DATASEL_DECLImpl();
    return dataseL_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public END createEND()
  {
    ENDImpl end = new ENDImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CRITERION createCRITERION()
  {
    CRITERIONImpl criterion = new CRITERIONImpl();
    return criterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATASEL createDATASEL()
  {
    DATASELImpl datasel = new DATASELImpl();
    return datasel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAR_CST createVAR_CST()
  {
    VAR_CSTImpl vaR_CST = new VAR_CSTImpl();
    return vaR_CST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAR createVAR()
  {
    VARImpl var = new VARImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CST createCST()
  {
    CSTImpl cst = new CSTImpl();
    return cst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE createTYPE()
  {
    TYPEImpl type = new TYPEImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RANGE createRANGE()
  {
    RANGEImpl range = new RANGEImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INTERVAL createINTERVAL()
  {
    INTERVALImpl interval = new INTERVALImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSET createLSET()
  {
    LSETImpl lset = new LSETImpl();
    return lset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INSTRUCTION createINSTRUCTION()
  {
    INSTRUCTIONImpl instruction = new INSTRUCTIONImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IF_INSTR createIF_INSTR()
  {
    IF_INSTRImpl iF_INSTR = new IF_INSTRImpl();
    return iF_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LOOP_INSTR createLOOP_INSTR()
  {
    LOOP_INSTRImpl looP_INSTR = new LOOP_INSTRImpl();
    return looP_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ERROR_INSTR createERROR_INSTR()
  {
    ERROR_INSTRImpl erroR_INSTR = new ERROR_INSTRImpl();
    return erroR_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NULL_INSTR createNULL_INSTR()
  {
    NULL_INSTRImpl nulL_INSTR = new NULL_INSTRImpl();
    return nulL_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASSIGN_INSTR createASSIGN_INSTR()
  {
    ASSIGN_INSTRImpl assigN_INSTR = new ASSIGN_INSTRImpl();
    return assigN_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SINGLE_ASSIGN createSINGLE_ASSIGN()
  {
    SINGLE_ASSIGNImpl singlE_ASSIGN = new SINGLE_ASSIGNImpl();
    return singlE_ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION createEXPRESSION()
  {
    EXPRESSIONImpl expression = new EXPRESSIONImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public intLITERAL createintLITERAL()
  {
    intLITERALImpl intLITERAL = new intLITERALImpl();
    return intLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public realLITERAL createrealLITERAL()
  {
    realLITERALImpl realLITERAL = new realLITERALImpl();
    return realLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolLITERAL createboolLITERAL()
  {
    boolLITERALImpl boolLITERAL = new boolLITERALImpl();
    return boolLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public strLITERAL createstrLITERAL()
  {
    strLITERALImpl strLITERAL = new strLITERALImpl();
    return strLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumLITERAL createenumLITERAL()
  {
    enumLITERALImpl enumLITERAL = new enumLITERALImpl();
    return enumLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bitLITERAL createbitLITERAL()
  {
    bitLITERALImpl bitLITERAL = new bitLITERALImpl();
    return bitLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public hexLITERAL createhexLITERAL()
  {
    hexLITERALImpl hexLITERAL = new hexLITERALImpl();
    return hexLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identLITERAL createidentLITERAL()
  {
    identLITERALImpl identLITERAL = new identLITERALImpl();
    return identLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unknowLITERAL createunknowLITERAL()
  {
    unknowLITERALImpl unknowLITERAL = new unknowLITERALImpl();
    return unknowLITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ERROR_ASSIGN createERROR_ASSIGN()
  {
    ERROR_ASSIGNImpl erroR_ASSIGN = new ERROR_ASSIGNImpl();
    return erroR_ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NULL_ASSIGN createNULL_ASSIGN()
  {
    NULL_ASSIGNImpl nulL_ASSIGN = new NULL_ASSIGNImpl();
    return nulL_ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OR createOR()
  {
    ORImpl or = new ORImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AND createAND()
  {
    ANDImpl and = new ANDImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQUAL_DIFF createEQUAL_DIFF()
  {
    EQUAL_DIFFImpl equaL_DIFF = new EQUAL_DIFFImpl();
    return equaL_DIFF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COMPARISON createCOMPARISON()
  {
    COMPARISONImpl comparison = new COMPARISONImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public strREDUCTION createstrREDUCTION()
  {
    strREDUCTIONImpl strREDUCTION = new strREDUCTIONImpl();
    return strREDUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NOT createNOT()
  {
    NOTImpl not = new NOTImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public intConstant createintConstant()
  {
    intConstantImpl intConstant = new intConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public realConstant createrealConstant()
  {
    realConstantImpl realConstant = new realConstantImpl();
    return realConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public strConstant createstrConstant()
  {
    strConstantImpl strConstant = new strConstantImpl();
    return strConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumConstant createenumConstant()
  {
    enumConstantImpl enumConstant = new enumConstantImpl();
    return enumConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolConstant createboolConstant()
  {
    boolConstantImpl boolConstant = new boolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpRef createVarExpRef()
  {
    VarExpRefImpl varExpRef = new VarExpRefImpl();
    return varExpRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDslPackage getModuleDslPackage()
  {
    return (ModuleDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModuleDslPackage getPackage()
  {
    return ModuleDslPackage.eINSTANCE;
  }

} //ModuleDslFactoryImpl
