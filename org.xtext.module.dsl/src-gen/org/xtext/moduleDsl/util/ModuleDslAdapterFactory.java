/**
 */
package org.xtext.moduleDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.moduleDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.moduleDsl.ModuleDslPackage
 * @generated
 */
public class ModuleDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModuleDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ModuleDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleDslSwitch<Adapter> modelSwitch =
    new ModuleDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseLANGUAGE(LANGUAGE object)
      {
        return createLANGUAGEAdapter();
      }
      @Override
      public Adapter caseMODULE_DECL(MODULE_DECL object)
      {
        return createMODULE_DECLAdapter();
      }
      @Override
      public Adapter caseSTRATEGY(STRATEGY object)
      {
        return createSTRATEGYAdapter();
      }
      @Override
      public Adapter caseINTERFACE(INTERFACE object)
      {
        return createINTERFACEAdapter();
      }
      @Override
      public Adapter caseBODY(BODY object)
      {
        return createBODYAdapter();
      }
      @Override
      public Adapter caseCRITERION_DECL(CRITERION_DECL object)
      {
        return createCRITERION_DECLAdapter();
      }
      @Override
      public Adapter caseDATASEL_DECL(DATASEL_DECL object)
      {
        return createDATASEL_DECLAdapter();
      }
      @Override
      public Adapter caseEND(END object)
      {
        return createENDAdapter();
      }
      @Override
      public Adapter caseCRITERION(CRITERION object)
      {
        return createCRITERIONAdapter();
      }
      @Override
      public Adapter caseDATASEL(DATASEL object)
      {
        return createDATASELAdapter();
      }
      @Override
      public Adapter caseVAR_CST(VAR_CST object)
      {
        return createVAR_CSTAdapter();
      }
      @Override
      public Adapter caseVAR(VAR object)
      {
        return createVARAdapter();
      }
      @Override
      public Adapter caseFlow(Flow object)
      {
        return createFlowAdapter();
      }
      @Override
      public Adapter caseCST(CST object)
      {
        return createCSTAdapter();
      }
      @Override
      public Adapter caseTYPE(TYPE object)
      {
        return createTYPEAdapter();
      }
      @Override
      public Adapter caseRANGE(RANGE object)
      {
        return createRANGEAdapter();
      }
      @Override
      public Adapter caseINTERVAL(INTERVAL object)
      {
        return createINTERVALAdapter();
      }
      @Override
      public Adapter caseLSET(LSET object)
      {
        return createLSETAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseINSTRUCTION(INSTRUCTION object)
      {
        return createINSTRUCTIONAdapter();
      }
      @Override
      public Adapter caseIF_INSTR(IF_INSTR object)
      {
        return createIF_INSTRAdapter();
      }
      @Override
      public Adapter caseLOOP_INSTR(LOOP_INSTR object)
      {
        return createLOOP_INSTRAdapter();
      }
      @Override
      public Adapter caseERROR_INSTR(ERROR_INSTR object)
      {
        return createERROR_INSTRAdapter();
      }
      @Override
      public Adapter caseNULL_INSTR(NULL_INSTR object)
      {
        return createNULL_INSTRAdapter();
      }
      @Override
      public Adapter caseASSIGN_INSTR(ASSIGN_INSTR object)
      {
        return createASSIGN_INSTRAdapter();
      }
      @Override
      public Adapter caseSINGLE_ASSIGN(SINGLE_ASSIGN object)
      {
        return createSINGLE_ASSIGNAdapter();
      }
      @Override
      public Adapter caseEXPRESSION(EXPRESSION object)
      {
        return createEXPRESSIONAdapter();
      }
      @Override
      public Adapter caseintLITERAL(intLITERAL object)
      {
        return createintLITERALAdapter();
      }
      @Override
      public Adapter caserealLITERAL(realLITERAL object)
      {
        return createrealLITERALAdapter();
      }
      @Override
      public Adapter caseboolLITERAL(boolLITERAL object)
      {
        return createboolLITERALAdapter();
      }
      @Override
      public Adapter casestrLITERAL(strLITERAL object)
      {
        return createstrLITERALAdapter();
      }
      @Override
      public Adapter caseenumLITERAL(enumLITERAL object)
      {
        return createenumLITERALAdapter();
      }
      @Override
      public Adapter casebitLITERAL(bitLITERAL object)
      {
        return createbitLITERALAdapter();
      }
      @Override
      public Adapter casehexLITERAL(hexLITERAL object)
      {
        return createhexLITERALAdapter();
      }
      @Override
      public Adapter caseidentLITERAL(identLITERAL object)
      {
        return createidentLITERALAdapter();
      }
      @Override
      public Adapter caseunknowLITERAL(unknowLITERAL object)
      {
        return createunknowLITERALAdapter();
      }
      @Override
      public Adapter caseOR(OR object)
      {
        return createORAdapter();
      }
      @Override
      public Adapter caseAND(AND object)
      {
        return createANDAdapter();
      }
      @Override
      public Adapter caseEQUAL_DIFF(EQUAL_DIFF object)
      {
        return createEQUAL_DIFFAdapter();
      }
      @Override
      public Adapter caseCOMPARISON(COMPARISON object)
      {
        return createCOMPARISONAdapter();
      }
      @Override
      public Adapter caseADD(ADD object)
      {
        return createADDAdapter();
      }
      @Override
      public Adapter caseSUB(SUB object)
      {
        return createSUBAdapter();
      }
      @Override
      public Adapter caseMULT(MULT object)
      {
        return createMULTAdapter();
      }
      @Override
      public Adapter caseDIV(DIV object)
      {
        return createDIVAdapter();
      }
      @Override
      public Adapter caseNOT(NOT object)
      {
        return createNOTAdapter();
      }
      @Override
      public Adapter caseintConstant(intConstant object)
      {
        return createintConstantAdapter();
      }
      @Override
      public Adapter caserealConstant(realConstant object)
      {
        return createrealConstantAdapter();
      }
      @Override
      public Adapter casestrConstant(strConstant object)
      {
        return createstrConstantAdapter();
      }
      @Override
      public Adapter caseenumConstant(enumConstant object)
      {
        return createenumConstantAdapter();
      }
      @Override
      public Adapter caseboolConstant(boolConstant object)
      {
        return createboolConstantAdapter();
      }
      @Override
      public Adapter casebitConstant(bitConstant object)
      {
        return createbitConstantAdapter();
      }
      @Override
      public Adapter casehexConstant(hexConstant object)
      {
        return createhexConstantAdapter();
      }
      @Override
      public Adapter caseVarExpRef(VarExpRef object)
      {
        return createVarExpRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.LANGUAGE <em>LANGUAGE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.LANGUAGE
   * @generated
   */
  public Adapter createLANGUAGEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.MODULE_DECL <em>MODULE DECL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.MODULE_DECL
   * @generated
   */
  public Adapter createMODULE_DECLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.STRATEGY <em>STRATEGY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.STRATEGY
   * @generated
   */
  public Adapter createSTRATEGYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.INTERFACE <em>INTERFACE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.INTERFACE
   * @generated
   */
  public Adapter createINTERFACEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.BODY <em>BODY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.BODY
   * @generated
   */
  public Adapter createBODYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.CRITERION_DECL <em>CRITERION DECL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.CRITERION_DECL
   * @generated
   */
  public Adapter createCRITERION_DECLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.DATASEL_DECL <em>DATASEL DECL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.DATASEL_DECL
   * @generated
   */
  public Adapter createDATASEL_DECLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.END <em>END</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.END
   * @generated
   */
  public Adapter createENDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.CRITERION <em>CRITERION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.CRITERION
   * @generated
   */
  public Adapter createCRITERIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.DATASEL <em>DATASEL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.DATASEL
   * @generated
   */
  public Adapter createDATASELAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.VAR_CST <em>VAR CST</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.VAR_CST
   * @generated
   */
  public Adapter createVAR_CSTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.VAR <em>VAR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.VAR
   * @generated
   */
  public Adapter createVARAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.Flow
   * @generated
   */
  public Adapter createFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.CST <em>CST</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.CST
   * @generated
   */
  public Adapter createCSTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.TYPE <em>TYPE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.TYPE
   * @generated
   */
  public Adapter createTYPEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.RANGE <em>RANGE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.RANGE
   * @generated
   */
  public Adapter createRANGEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.INTERVAL <em>INTERVAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.INTERVAL
   * @generated
   */
  public Adapter createINTERVALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.LSET <em>LSET</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.LSET
   * @generated
   */
  public Adapter createLSETAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.INSTRUCTION <em>INSTRUCTION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.INSTRUCTION
   * @generated
   */
  public Adapter createINSTRUCTIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.IF_INSTR <em>IF INSTR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.IF_INSTR
   * @generated
   */
  public Adapter createIF_INSTRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.LOOP_INSTR <em>LOOP INSTR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.LOOP_INSTR
   * @generated
   */
  public Adapter createLOOP_INSTRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.ERROR_INSTR <em>ERROR INSTR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.ERROR_INSTR
   * @generated
   */
  public Adapter createERROR_INSTRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.NULL_INSTR <em>NULL INSTR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.NULL_INSTR
   * @generated
   */
  public Adapter createNULL_INSTRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.ASSIGN_INSTR <em>ASSIGN INSTR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.ASSIGN_INSTR
   * @generated
   */
  public Adapter createASSIGN_INSTRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.SINGLE_ASSIGN <em>SINGLE ASSIGN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.SINGLE_ASSIGN
   * @generated
   */
  public Adapter createSINGLE_ASSIGNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.EXPRESSION <em>EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.EXPRESSION
   * @generated
   */
  public Adapter createEXPRESSIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.intLITERAL <em>int LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.intLITERAL
   * @generated
   */
  public Adapter createintLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.realLITERAL <em>real LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.realLITERAL
   * @generated
   */
  public Adapter createrealLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.boolLITERAL <em>bool LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.boolLITERAL
   * @generated
   */
  public Adapter createboolLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.strLITERAL <em>str LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.strLITERAL
   * @generated
   */
  public Adapter createstrLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.enumLITERAL <em>enum LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.enumLITERAL
   * @generated
   */
  public Adapter createenumLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.bitLITERAL <em>bit LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.bitLITERAL
   * @generated
   */
  public Adapter createbitLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.hexLITERAL <em>hex LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.hexLITERAL
   * @generated
   */
  public Adapter createhexLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.identLITERAL <em>ident LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.identLITERAL
   * @generated
   */
  public Adapter createidentLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.unknowLITERAL <em>unknow LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.unknowLITERAL
   * @generated
   */
  public Adapter createunknowLITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.OR <em>OR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.OR
   * @generated
   */
  public Adapter createORAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.AND <em>AND</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.AND
   * @generated
   */
  public Adapter createANDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.EQUAL_DIFF <em>EQUAL DIFF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.EQUAL_DIFF
   * @generated
   */
  public Adapter createEQUAL_DIFFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.COMPARISON <em>COMPARISON</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.COMPARISON
   * @generated
   */
  public Adapter createCOMPARISONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.ADD <em>ADD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.ADD
   * @generated
   */
  public Adapter createADDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.SUB <em>SUB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.SUB
   * @generated
   */
  public Adapter createSUBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.MULT <em>MULT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.MULT
   * @generated
   */
  public Adapter createMULTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.DIV <em>DIV</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.DIV
   * @generated
   */
  public Adapter createDIVAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.NOT <em>NOT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.NOT
   * @generated
   */
  public Adapter createNOTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.intConstant <em>int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.intConstant
   * @generated
   */
  public Adapter createintConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.realConstant <em>real Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.realConstant
   * @generated
   */
  public Adapter createrealConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.strConstant <em>str Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.strConstant
   * @generated
   */
  public Adapter createstrConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.enumConstant <em>enum Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.enumConstant
   * @generated
   */
  public Adapter createenumConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.boolConstant <em>bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.boolConstant
   * @generated
   */
  public Adapter createboolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.bitConstant <em>bit Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.bitConstant
   * @generated
   */
  public Adapter createbitConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.hexConstant <em>hex Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.hexConstant
   * @generated
   */
  public Adapter createhexConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.moduleDsl.VarExpRef <em>Var Exp Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.moduleDsl.VarExpRef
   * @generated
   */
  public Adapter createVarExpRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ModuleDslAdapterFactory
