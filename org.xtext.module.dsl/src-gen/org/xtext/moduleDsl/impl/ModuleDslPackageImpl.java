/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.moduleDsl.Flow;
import org.xtext.moduleDsl.Literal;
import org.xtext.moduleDsl.ModuleDslFactory;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.VarExpRef;
import org.xtext.moduleDsl.bitConstant;
import org.xtext.moduleDsl.bitLITERAL;
import org.xtext.moduleDsl.boolConstant;
import org.xtext.moduleDsl.boolLITERAL;
import org.xtext.moduleDsl.enumConstant;
import org.xtext.moduleDsl.enumLITERAL;
import org.xtext.moduleDsl.hexConstant;
import org.xtext.moduleDsl.hexLITERAL;
import org.xtext.moduleDsl.identLITERAL;
import org.xtext.moduleDsl.intConstant;
import org.xtext.moduleDsl.intLITERAL;
import org.xtext.moduleDsl.realConstant;
import org.xtext.moduleDsl.realLITERAL;
import org.xtext.moduleDsl.strConstant;
import org.xtext.moduleDsl.strLITERAL;
import org.xtext.moduleDsl.unknowLITERAL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleDslPackageImpl extends EPackageImpl implements ModuleDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulE_DECLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass criterioN_DECLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataseL_DECLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass criterionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataselEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vaR_CSTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cstEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iF_INSTREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass looP_INSTREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass erroR_INSTREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nulL_INSTREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assigN_INSTREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singlE_ASSIGNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknowLITERALEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass erroR_ASSIGNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nulL_ASSIGNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equaL_DIFFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varExpRefEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.moduleDsl.ModuleDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModuleDslPackageImpl()
  {
    super(eNS_URI, ModuleDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ModuleDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ModuleDslPackage init()
  {
    if (isInited) return (ModuleDslPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleDslPackage.eNS_URI);

    // Obtain or create and register package
    ModuleDslPackageImpl theModuleDslPackage = (ModuleDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModuleDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModuleDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theModuleDslPackage.createPackageContents();

    // Initialize created meta-data
    theModuleDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theModuleDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModuleDslPackage.eNS_URI, theModuleDslPackage);
    return theModuleDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLANGUAGE()
  {
    return languageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLANGUAGE_Modules()
  {
    return (EReference)languageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMODULE_DECL()
  {
    return modulE_DECLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMODULE_DECL_Name()
  {
    return (EAttribute)modulE_DECLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMODULE_DECL_Critdecl()
  {
    return (EReference)modulE_DECLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMODULE_DECL_Dataseldecl()
  {
    return (EReference)modulE_DECLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMODULE_DECL_Declaration()
  {
    return (EReference)modulE_DECLEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMODULE_DECL_Instr()
  {
    return (EReference)modulE_DECLEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCRITERION_DECL()
  {
    return criterioN_DECLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCRITERION_DECL_Crit()
  {
    return (EReference)criterioN_DECLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCRITERION_DECL_End()
  {
    return (EReference)criterioN_DECLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDATASEL_DECL()
  {
    return dataseL_DECLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDATASEL_DECL_Data1()
  {
    return (EReference)dataseL_DECLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDATASEL_DECL_Data2()
  {
    return (EReference)dataseL_DECLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDATASEL_DECL_End()
  {
    return (EReference)dataseL_DECLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEND()
  {
    return endEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEND_End()
  {
    return (EAttribute)endEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCRITERION()
  {
    return criterionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCRITERION_Crit()
  {
    return (EAttribute)criterionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDATASEL()
  {
    return dataselEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDATASEL_Sel()
  {
    return (EAttribute)dataselEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVAR_CST()
  {
    return vaR_CSTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVAR_CST_Name()
  {
    return (EAttribute)vaR_CSTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVAR_CST_Type()
  {
    return (EReference)vaR_CSTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVAR_CST_End()
  {
    return (EReference)vaR_CSTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVAR()
  {
    return varEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVAR_Flow()
  {
    return (EReference)varEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVAR_Range()
  {
    return (EReference)varEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlow()
  {
    return flowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlow_Flow()
  {
    return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCST()
  {
    return cstEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCST_Flow()
  {
    return (EAttribute)cstEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCST_Value()
  {
    return (EReference)cstEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTYPE()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTYPE_Type()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRANGE()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINTERVAL()
  {
    return intervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getINTERVAL_Lsqbr()
  {
    return (EAttribute)intervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getINTERVAL_Min()
  {
    return (EReference)intervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getINTERVAL_Max()
  {
    return (EReference)intervalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getINTERVAL_Rsqbr()
  {
    return (EAttribute)intervalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLSET()
  {
    return lsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLSET_Value()
  {
    return (EReference)lsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINSTRUCTION()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIF_INSTR()
  {
    return iF_INSTREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_INSTR_Ifcond()
  {
    return (EReference)iF_INSTREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_INSTR_Ifst()
  {
    return (EReference)iF_INSTREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_INSTR_Elst()
  {
    return (EReference)iF_INSTREClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLOOP_INSTR()
  {
    return looP_INSTREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLOOP_INSTR_Val()
  {
    return (EAttribute)looP_INSTREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getERROR_INSTR()
  {
    return erroR_INSTREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNULL_INSTR()
  {
    return nulL_INSTREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASSIGN_INSTR()
  {
    return assigN_INSTREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getASSIGN_INSTR_Sa()
  {
    return (EReference)assigN_INSTREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getASSIGN_INSTR_End()
  {
    return (EReference)assigN_INSTREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSINGLE_ASSIGN()
  {
    return singlE_ASSIGNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSINGLE_ASSIGN_Var()
  {
    return (EReference)singlE_ASSIGNEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSINGLE_ASSIGN_Exp()
  {
    return (EReference)singlE_ASSIGNEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEXPRESSION()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getintLITERAL()
  {
    return intLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getintLITERAL_Value()
  {
    return (EAttribute)intLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrealLITERAL()
  {
    return realLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrealLITERAL_Value()
  {
    return (EAttribute)realLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getboolLITERAL()
  {
    return boolLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getboolLITERAL_Value()
  {
    return (EAttribute)boolLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstrLITERAL()
  {
    return strLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstrLITERAL_Value()
  {
    return (EAttribute)strLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenumLITERAL()
  {
    return enumLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getenumLITERAL_Value()
  {
    return (EAttribute)enumLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbitLITERAL()
  {
    return bitLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbitLITERAL_Value()
  {
    return (EAttribute)bitLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gethexLITERAL()
  {
    return hexLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gethexLITERAL_Value()
  {
    return (EAttribute)hexLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getidentLITERAL()
  {
    return identLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getidentLITERAL_Value()
  {
    return (EAttribute)identLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunknowLITERAL()
  {
    return unknowLITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getunknowLITERAL_Value()
  {
    return (EAttribute)unknowLITERALEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getERROR_ASSIGN()
  {
    return erroR_ASSIGNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getERROR_ASSIGN_End()
  {
    return (EReference)erroR_ASSIGNEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNULL_ASSIGN()
  {
    return nulL_ASSIGNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNULL_ASSIGN_End()
  {
    return (EReference)nulL_ASSIGNEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOR()
  {
    return orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOR_Left()
  {
    return (EReference)orEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOR_Right()
  {
    return (EReference)orEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAND()
  {
    return andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAND_Left()
  {
    return (EReference)andEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAND_Right()
  {
    return (EReference)andEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEQUAL_DIFF()
  {
    return equaL_DIFFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEQUAL_DIFF_Left()
  {
    return (EReference)equaL_DIFFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQUAL_DIFF_Op()
  {
    return (EAttribute)equaL_DIFFEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEQUAL_DIFF_Right()
  {
    return (EReference)equaL_DIFFEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCOMPARISON()
  {
    return comparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOMPARISON_Left()
  {
    return (EReference)comparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCOMPARISON_Op()
  {
    return (EAttribute)comparisonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOMPARISON_Right()
  {
    return (EReference)comparisonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADD()
  {
    return addEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getADD_Left()
  {
    return (EReference)addEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getADD_Right()
  {
    return (EReference)addEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSUB()
  {
    return subEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSUB_Left()
  {
    return (EReference)subEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSUB_Right()
  {
    return (EReference)subEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMULT()
  {
    return multEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMULT_Left()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMULT_Right()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDIV()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDIV_Left()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDIV_Right()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNOT()
  {
    return notEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNOT_Exp()
  {
    return (EReference)notEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getintConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getintConstant_Value()
  {
    return (EAttribute)intConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrealConstant()
  {
    return realConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrealConstant_Value()
  {
    return (EAttribute)realConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstrConstant()
  {
    return strConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstrConstant_Value()
  {
    return (EAttribute)strConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenumConstant()
  {
    return enumConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getenumConstant_Value()
  {
    return (EAttribute)enumConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getboolConstant()
  {
    return boolConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getboolConstant_Value()
  {
    return (EAttribute)boolConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbitConstant()
  {
    return bitConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbitConstant_Value()
  {
    return (EAttribute)bitConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gethexConstant()
  {
    return hexConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gethexConstant_Value()
  {
    return (EAttribute)hexConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarExpRef()
  {
    return varExpRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarExpRef_Vref()
  {
    return (EReference)varExpRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDslFactory getModuleDslFactory()
  {
    return (ModuleDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    languageEClass = createEClass(LANGUAGE);
    createEReference(languageEClass, LANGUAGE__MODULES);

    modulE_DECLEClass = createEClass(MODULE_DECL);
    createEAttribute(modulE_DECLEClass, MODULE_DECL__NAME);
    createEReference(modulE_DECLEClass, MODULE_DECL__CRITDECL);
    createEReference(modulE_DECLEClass, MODULE_DECL__DATASELDECL);
    createEReference(modulE_DECLEClass, MODULE_DECL__DECLARATION);
    createEReference(modulE_DECLEClass, MODULE_DECL__INSTR);

    criterioN_DECLEClass = createEClass(CRITERION_DECL);
    createEReference(criterioN_DECLEClass, CRITERION_DECL__CRIT);
    createEReference(criterioN_DECLEClass, CRITERION_DECL__END);

    dataseL_DECLEClass = createEClass(DATASEL_DECL);
    createEReference(dataseL_DECLEClass, DATASEL_DECL__DATA1);
    createEReference(dataseL_DECLEClass, DATASEL_DECL__DATA2);
    createEReference(dataseL_DECLEClass, DATASEL_DECL__END);

    endEClass = createEClass(END);
    createEAttribute(endEClass, END__END);

    criterionEClass = createEClass(CRITERION);
    createEAttribute(criterionEClass, CRITERION__CRIT);

    dataselEClass = createEClass(DATASEL);
    createEAttribute(dataselEClass, DATASEL__SEL);

    vaR_CSTEClass = createEClass(VAR_CST);
    createEAttribute(vaR_CSTEClass, VAR_CST__NAME);
    createEReference(vaR_CSTEClass, VAR_CST__TYPE);
    createEReference(vaR_CSTEClass, VAR_CST__END);

    varEClass = createEClass(VAR);
    createEReference(varEClass, VAR__FLOW);
    createEReference(varEClass, VAR__RANGE);

    flowEClass = createEClass(FLOW);
    createEAttribute(flowEClass, FLOW__FLOW);

    cstEClass = createEClass(CST);
    createEAttribute(cstEClass, CST__FLOW);
    createEReference(cstEClass, CST__VALUE);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__TYPE);

    rangeEClass = createEClass(RANGE);

    intervalEClass = createEClass(INTERVAL);
    createEAttribute(intervalEClass, INTERVAL__LSQBR);
    createEReference(intervalEClass, INTERVAL__MIN);
    createEReference(intervalEClass, INTERVAL__MAX);
    createEAttribute(intervalEClass, INTERVAL__RSQBR);

    lsetEClass = createEClass(LSET);
    createEReference(lsetEClass, LSET__VALUE);

    literalEClass = createEClass(LITERAL);

    instructionEClass = createEClass(INSTRUCTION);

    iF_INSTREClass = createEClass(IF_INSTR);
    createEReference(iF_INSTREClass, IF_INSTR__IFCOND);
    createEReference(iF_INSTREClass, IF_INSTR__IFST);
    createEReference(iF_INSTREClass, IF_INSTR__ELST);

    looP_INSTREClass = createEClass(LOOP_INSTR);
    createEAttribute(looP_INSTREClass, LOOP_INSTR__VAL);

    erroR_INSTREClass = createEClass(ERROR_INSTR);

    nulL_INSTREClass = createEClass(NULL_INSTR);

    assigN_INSTREClass = createEClass(ASSIGN_INSTR);
    createEReference(assigN_INSTREClass, ASSIGN_INSTR__SA);
    createEReference(assigN_INSTREClass, ASSIGN_INSTR__END);

    singlE_ASSIGNEClass = createEClass(SINGLE_ASSIGN);
    createEReference(singlE_ASSIGNEClass, SINGLE_ASSIGN__VAR);
    createEReference(singlE_ASSIGNEClass, SINGLE_ASSIGN__EXP);

    expressionEClass = createEClass(EXPRESSION);

    intLITERALEClass = createEClass(INT_LITERAL);
    createEAttribute(intLITERALEClass, INT_LITERAL__VALUE);

    realLITERALEClass = createEClass(REAL_LITERAL);
    createEAttribute(realLITERALEClass, REAL_LITERAL__VALUE);

    boolLITERALEClass = createEClass(BOOL_LITERAL);
    createEAttribute(boolLITERALEClass, BOOL_LITERAL__VALUE);

    strLITERALEClass = createEClass(STR_LITERAL);
    createEAttribute(strLITERALEClass, STR_LITERAL__VALUE);

    enumLITERALEClass = createEClass(ENUM_LITERAL);
    createEAttribute(enumLITERALEClass, ENUM_LITERAL__VALUE);

    bitLITERALEClass = createEClass(BIT_LITERAL);
    createEAttribute(bitLITERALEClass, BIT_LITERAL__VALUE);

    hexLITERALEClass = createEClass(HEX_LITERAL);
    createEAttribute(hexLITERALEClass, HEX_LITERAL__VALUE);

    identLITERALEClass = createEClass(IDENT_LITERAL);
    createEAttribute(identLITERALEClass, IDENT_LITERAL__VALUE);

    unknowLITERALEClass = createEClass(UNKNOW_LITERAL);
    createEAttribute(unknowLITERALEClass, UNKNOW_LITERAL__VALUE);

    erroR_ASSIGNEClass = createEClass(ERROR_ASSIGN);
    createEReference(erroR_ASSIGNEClass, ERROR_ASSIGN__END);

    nulL_ASSIGNEClass = createEClass(NULL_ASSIGN);
    createEReference(nulL_ASSIGNEClass, NULL_ASSIGN__END);

    orEClass = createEClass(OR);
    createEReference(orEClass, OR__LEFT);
    createEReference(orEClass, OR__RIGHT);

    andEClass = createEClass(AND);
    createEReference(andEClass, AND__LEFT);
    createEReference(andEClass, AND__RIGHT);

    equaL_DIFFEClass = createEClass(EQUAL_DIFF);
    createEReference(equaL_DIFFEClass, EQUAL_DIFF__LEFT);
    createEAttribute(equaL_DIFFEClass, EQUAL_DIFF__OP);
    createEReference(equaL_DIFFEClass, EQUAL_DIFF__RIGHT);

    comparisonEClass = createEClass(COMPARISON);
    createEReference(comparisonEClass, COMPARISON__LEFT);
    createEAttribute(comparisonEClass, COMPARISON__OP);
    createEReference(comparisonEClass, COMPARISON__RIGHT);

    addEClass = createEClass(ADD);
    createEReference(addEClass, ADD__LEFT);
    createEReference(addEClass, ADD__RIGHT);

    subEClass = createEClass(SUB);
    createEReference(subEClass, SUB__LEFT);
    createEReference(subEClass, SUB__RIGHT);

    multEClass = createEClass(MULT);
    createEReference(multEClass, MULT__LEFT);
    createEReference(multEClass, MULT__RIGHT);

    divEClass = createEClass(DIV);
    createEReference(divEClass, DIV__LEFT);
    createEReference(divEClass, DIV__RIGHT);

    notEClass = createEClass(NOT);
    createEReference(notEClass, NOT__EXP);

    intConstantEClass = createEClass(INT_CONSTANT);
    createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

    realConstantEClass = createEClass(REAL_CONSTANT);
    createEAttribute(realConstantEClass, REAL_CONSTANT__VALUE);

    strConstantEClass = createEClass(STR_CONSTANT);
    createEAttribute(strConstantEClass, STR_CONSTANT__VALUE);

    enumConstantEClass = createEClass(ENUM_CONSTANT);
    createEAttribute(enumConstantEClass, ENUM_CONSTANT__VALUE);

    boolConstantEClass = createEClass(BOOL_CONSTANT);
    createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

    bitConstantEClass = createEClass(BIT_CONSTANT);
    createEAttribute(bitConstantEClass, BIT_CONSTANT__VALUE);

    hexConstantEClass = createEClass(HEX_CONSTANT);
    createEAttribute(hexConstantEClass, HEX_CONSTANT__VALUE);

    varExpRefEClass = createEClass(VAR_EXP_REF);
    createEReference(varExpRefEClass, VAR_EXP_REF__VREF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    varEClass.getESuperTypes().add(this.getVAR_CST());
    cstEClass.getESuperTypes().add(this.getVAR_CST());
    intervalEClass.getESuperTypes().add(this.getRANGE());
    lsetEClass.getESuperTypes().add(this.getRANGE());
    iF_INSTREClass.getESuperTypes().add(this.getINSTRUCTION());
    looP_INSTREClass.getESuperTypes().add(this.getINSTRUCTION());
    erroR_INSTREClass.getESuperTypes().add(this.getINSTRUCTION());
    nulL_INSTREClass.getESuperTypes().add(this.getINSTRUCTION());
    assigN_INSTREClass.getESuperTypes().add(this.getINSTRUCTION());
    intLITERALEClass.getESuperTypes().add(this.getLiteral());
    realLITERALEClass.getESuperTypes().add(this.getLiteral());
    boolLITERALEClass.getESuperTypes().add(this.getLiteral());
    strLITERALEClass.getESuperTypes().add(this.getLiteral());
    enumLITERALEClass.getESuperTypes().add(this.getLiteral());
    bitLITERALEClass.getESuperTypes().add(this.getLiteral());
    hexLITERALEClass.getESuperTypes().add(this.getLiteral());
    identLITERALEClass.getESuperTypes().add(this.getLiteral());
    unknowLITERALEClass.getESuperTypes().add(this.getLiteral());
    erroR_ASSIGNEClass.getESuperTypes().add(this.getERROR_INSTR());
    nulL_ASSIGNEClass.getESuperTypes().add(this.getNULL_INSTR());
    orEClass.getESuperTypes().add(this.getEXPRESSION());
    andEClass.getESuperTypes().add(this.getEXPRESSION());
    equaL_DIFFEClass.getESuperTypes().add(this.getEXPRESSION());
    comparisonEClass.getESuperTypes().add(this.getEXPRESSION());
    addEClass.getESuperTypes().add(this.getEXPRESSION());
    subEClass.getESuperTypes().add(this.getEXPRESSION());
    multEClass.getESuperTypes().add(this.getEXPRESSION());
    divEClass.getESuperTypes().add(this.getEXPRESSION());
    notEClass.getESuperTypes().add(this.getEXPRESSION());
    intConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    realConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    strConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    enumConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    boolConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    bitConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    hexConstantEClass.getESuperTypes().add(this.getEXPRESSION());
    varExpRefEClass.getESuperTypes().add(this.getEXPRESSION());

    // Initialize classes and features; add operations and parameters
    initEClass(languageEClass, org.xtext.moduleDsl.LANGUAGE.class, "LANGUAGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLANGUAGE_Modules(), this.getMODULE_DECL(), null, "modules", null, 0, -1, org.xtext.moduleDsl.LANGUAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modulE_DECLEClass, org.xtext.moduleDsl.MODULE_DECL.class, "MODULE_DECL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMODULE_DECL_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.moduleDsl.MODULE_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMODULE_DECL_Critdecl(), this.getCRITERION_DECL(), null, "critdecl", null, 0, 1, org.xtext.moduleDsl.MODULE_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMODULE_DECL_Dataseldecl(), this.getDATASEL_DECL(), null, "dataseldecl", null, 0, 1, org.xtext.moduleDsl.MODULE_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMODULE_DECL_Declaration(), this.getVAR_CST(), null, "declaration", null, 0, -1, org.xtext.moduleDsl.MODULE_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMODULE_DECL_Instr(), this.getINSTRUCTION(), null, "instr", null, 0, -1, org.xtext.moduleDsl.MODULE_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(criterioN_DECLEClass, org.xtext.moduleDsl.CRITERION_DECL.class, "CRITERION_DECL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCRITERION_DECL_Crit(), this.getCRITERION(), null, "crit", null, 0, 1, org.xtext.moduleDsl.CRITERION_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCRITERION_DECL_End(), this.getEND(), null, "end", null, 0, 1, org.xtext.moduleDsl.CRITERION_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataseL_DECLEClass, org.xtext.moduleDsl.DATASEL_DECL.class, "DATASEL_DECL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDATASEL_DECL_Data1(), this.getDATASEL(), null, "data1", null, 0, 1, org.xtext.moduleDsl.DATASEL_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDATASEL_DECL_Data2(), this.getDATASEL(), null, "data2", null, 0, 1, org.xtext.moduleDsl.DATASEL_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDATASEL_DECL_End(), this.getEND(), null, "end", null, 0, 1, org.xtext.moduleDsl.DATASEL_DECL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endEClass, org.xtext.moduleDsl.END.class, "END", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEND_End(), ecorePackage.getEString(), "end", null, 0, 1, org.xtext.moduleDsl.END.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(criterionEClass, org.xtext.moduleDsl.CRITERION.class, "CRITERION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCRITERION_Crit(), ecorePackage.getEString(), "crit", null, 0, 1, org.xtext.moduleDsl.CRITERION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataselEClass, org.xtext.moduleDsl.DATASEL.class, "DATASEL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDATASEL_Sel(), ecorePackage.getEString(), "sel", null, 0, 1, org.xtext.moduleDsl.DATASEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vaR_CSTEClass, org.xtext.moduleDsl.VAR_CST.class, "VAR_CST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVAR_CST_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.moduleDsl.VAR_CST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVAR_CST_Type(), this.getTYPE(), null, "type", null, 0, 1, org.xtext.moduleDsl.VAR_CST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVAR_CST_End(), this.getEND(), null, "end", null, 0, 1, org.xtext.moduleDsl.VAR_CST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varEClass, org.xtext.moduleDsl.VAR.class, "VAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVAR_Flow(), this.getFlow(), null, "flow", null, 0, 1, org.xtext.moduleDsl.VAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVAR_Range(), this.getRANGE(), null, "range", null, 0, 1, org.xtext.moduleDsl.VAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlow_Flow(), ecorePackage.getEString(), "flow", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cstEClass, org.xtext.moduleDsl.CST.class, "CST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCST_Flow(), ecorePackage.getEString(), "flow", null, 0, 1, org.xtext.moduleDsl.CST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCST_Value(), this.getLiteral(), null, "value", null, 0, 1, org.xtext.moduleDsl.CST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, org.xtext.moduleDsl.TYPE.class, "TYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTYPE_Type(), ecorePackage.getEString(), "type", null, 0, 1, org.xtext.moduleDsl.TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeEClass, org.xtext.moduleDsl.RANGE.class, "RANGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intervalEClass, org.xtext.moduleDsl.INTERVAL.class, "INTERVAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getINTERVAL_Lsqbr(), ecorePackage.getEString(), "lsqbr", null, 0, 1, org.xtext.moduleDsl.INTERVAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getINTERVAL_Min(), this.getLiteral(), null, "min", null, 0, 1, org.xtext.moduleDsl.INTERVAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getINTERVAL_Max(), this.getLiteral(), null, "max", null, 0, 1, org.xtext.moduleDsl.INTERVAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getINTERVAL_Rsqbr(), ecorePackage.getEString(), "rsqbr", null, 0, 1, org.xtext.moduleDsl.INTERVAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lsetEClass, org.xtext.moduleDsl.LSET.class, "LSET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLSET_Value(), this.getLiteral(), null, "value", null, 0, -1, org.xtext.moduleDsl.LSET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionEClass, org.xtext.moduleDsl.INSTRUCTION.class, "INSTRUCTION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iF_INSTREClass, org.xtext.moduleDsl.IF_INSTR.class, "IF_INSTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIF_INSTR_Ifcond(), this.getEXPRESSION(), null, "ifcond", null, 0, 1, org.xtext.moduleDsl.IF_INSTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_INSTR_Ifst(), this.getINSTRUCTION(), null, "ifst", null, 0, 1, org.xtext.moduleDsl.IF_INSTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIF_INSTR_Elst(), this.getINSTRUCTION(), null, "elst", null, 0, 1, org.xtext.moduleDsl.IF_INSTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(looP_INSTREClass, org.xtext.moduleDsl.LOOP_INSTR.class, "LOOP_INSTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLOOP_INSTR_Val(), ecorePackage.getEInt(), "val", null, 0, 1, org.xtext.moduleDsl.LOOP_INSTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(erroR_INSTREClass, org.xtext.moduleDsl.ERROR_INSTR.class, "ERROR_INSTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nulL_INSTREClass, org.xtext.moduleDsl.NULL_INSTR.class, "NULL_INSTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assigN_INSTREClass, org.xtext.moduleDsl.ASSIGN_INSTR.class, "ASSIGN_INSTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getASSIGN_INSTR_Sa(), this.getSINGLE_ASSIGN(), null, "sa", null, 0, -1, org.xtext.moduleDsl.ASSIGN_INSTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getASSIGN_INSTR_End(), this.getEND(), null, "end", null, 0, 1, org.xtext.moduleDsl.ASSIGN_INSTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singlE_ASSIGNEClass, org.xtext.moduleDsl.SINGLE_ASSIGN.class, "SINGLE_ASSIGN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSINGLE_ASSIGN_Var(), this.getVAR_CST(), null, "var", null, 0, 1, org.xtext.moduleDsl.SINGLE_ASSIGN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSINGLE_ASSIGN_Exp(), this.getEXPRESSION(), null, "exp", null, 0, 1, org.xtext.moduleDsl.SINGLE_ASSIGN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, org.xtext.moduleDsl.EXPRESSION.class, "EXPRESSION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intLITERALEClass, intLITERAL.class, "intLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getintLITERAL_Value(), ecorePackage.getEInt(), "value", null, 0, 1, intLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realLITERALEClass, realLITERAL.class, "realLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrealLITERAL_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, realLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolLITERALEClass, boolLITERAL.class, "boolLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getboolLITERAL_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, boolLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strLITERALEClass, strLITERAL.class, "strLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstrLITERAL_Value(), ecorePackage.getEString(), "value", null, 0, 1, strLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumLITERALEClass, enumLITERAL.class, "enumLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getenumLITERAL_Value(), ecorePackage.getEString(), "value", null, 0, 1, enumLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitLITERALEClass, bitLITERAL.class, "bitLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbitLITERAL_Value(), ecorePackage.getEString(), "value", null, 0, 1, bitLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hexLITERALEClass, hexLITERAL.class, "hexLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gethexLITERAL_Value(), ecorePackage.getEString(), "value", null, 0, 1, hexLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identLITERALEClass, identLITERAL.class, "identLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getidentLITERAL_Value(), ecorePackage.getEString(), "value", null, 0, 1, identLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknowLITERALEClass, unknowLITERAL.class, "unknowLITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getunknowLITERAL_Value(), ecorePackage.getEString(), "value", null, 0, 1, unknowLITERAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(erroR_ASSIGNEClass, org.xtext.moduleDsl.ERROR_ASSIGN.class, "ERROR_ASSIGN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getERROR_ASSIGN_End(), this.getEND(), null, "end", null, 0, 1, org.xtext.moduleDsl.ERROR_ASSIGN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nulL_ASSIGNEClass, org.xtext.moduleDsl.NULL_ASSIGN.class, "NULL_ASSIGN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNULL_ASSIGN_End(), this.getEND(), null, "end", null, 0, 1, org.xtext.moduleDsl.NULL_ASSIGN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orEClass, org.xtext.moduleDsl.OR.class, "OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOR_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOR_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andEClass, org.xtext.moduleDsl.AND.class, "AND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAND_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.AND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAND_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.AND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equaL_DIFFEClass, org.xtext.moduleDsl.EQUAL_DIFF.class, "EQUAL_DIFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEQUAL_DIFF_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.EQUAL_DIFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEQUAL_DIFF_Op(), ecorePackage.getEString(), "op", null, 0, 1, org.xtext.moduleDsl.EQUAL_DIFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEQUAL_DIFF_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.EQUAL_DIFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonEClass, org.xtext.moduleDsl.COMPARISON.class, "COMPARISON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCOMPARISON_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.COMPARISON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCOMPARISON_Op(), ecorePackage.getEString(), "op", null, 0, 1, org.xtext.moduleDsl.COMPARISON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCOMPARISON_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.COMPARISON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addEClass, org.xtext.moduleDsl.ADD.class, "ADD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getADD_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getADD_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subEClass, org.xtext.moduleDsl.SUB.class, "SUB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSUB_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.SUB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSUB_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.SUB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multEClass, org.xtext.moduleDsl.MULT.class, "MULT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMULT_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.MULT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMULT_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.MULT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, org.xtext.moduleDsl.DIV.class, "DIV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDIV_Left(), this.getEXPRESSION(), null, "left", null, 0, 1, org.xtext.moduleDsl.DIV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDIV_Right(), this.getEXPRESSION(), null, "right", null, 0, 1, org.xtext.moduleDsl.DIV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notEClass, org.xtext.moduleDsl.NOT.class, "NOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNOT_Exp(), this.getEXPRESSION(), null, "exp", null, 0, 1, org.xtext.moduleDsl.NOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, intConstant.class, "intConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getintConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, intConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realConstantEClass, realConstant.class, "realConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrealConstant_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, realConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strConstantEClass, strConstant.class, "strConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstrConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, strConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumConstantEClass, enumConstant.class, "enumConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getenumConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, enumConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolConstantEClass, boolConstant.class, "boolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getboolConstant_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, boolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitConstantEClass, bitConstant.class, "bitConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getbitConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, bitConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hexConstantEClass, hexConstant.class, "hexConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gethexConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, hexConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varExpRefEClass, VarExpRef.class, "VarExpRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarExpRef_Vref(), this.getVAR_CST(), null, "vref", null, 0, 1, VarExpRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ModuleDslPackageImpl
