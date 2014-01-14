/**
 */
package org.xtext.moduleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODULE DECL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.MODULE_DECL#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.MODULE_DECL#getCritdecl <em>Critdecl</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.MODULE_DECL#getDataseldecl <em>Dataseldecl</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.MODULE_DECL#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.MODULE_DECL#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.MODULE_DECL#getInstr <em>Instr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL()
 * @model
 * @generated
 */
public interface MODULE_DECL extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.MODULE_DECL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Critdecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Critdecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Critdecl</em>' containment reference.
   * @see #setCritdecl(CRITERION_DECL)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL_Critdecl()
   * @model containment="true"
   * @generated
   */
  CRITERION_DECL getCritdecl();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.MODULE_DECL#getCritdecl <em>Critdecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Critdecl</em>' containment reference.
   * @see #getCritdecl()
   * @generated
   */
  void setCritdecl(CRITERION_DECL value);

  /**
   * Returns the value of the '<em><b>Dataseldecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataseldecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataseldecl</em>' containment reference.
   * @see #setDataseldecl(DATASEL_DECL)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL_Dataseldecl()
   * @model containment="true"
   * @generated
   */
  DATASEL_DECL getDataseldecl();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.MODULE_DECL#getDataseldecl <em>Dataseldecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataseldecl</em>' containment reference.
   * @see #getDataseldecl()
   * @generated
   */
  void setDataseldecl(DATASEL_DECL value);

  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.moduleDsl.VAR_CST}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference list.
   * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL_Declaration()
   * @model containment="true"
   * @generated
   */
  EList<VAR_CST> getDeclaration();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(EXPRESSION)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL_Exp()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getExp();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.MODULE_DECL#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(EXPRESSION value);

  /**
   * Returns the value of the '<em><b>Instr</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.moduleDsl.INSTRUCTION}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instr</em>' containment reference list.
   * @see org.xtext.moduleDsl.ModuleDslPackage#getMODULE_DECL_Instr()
   * @model containment="true"
   * @generated
   */
  EList<INSTRUCTION> getInstr();

} // MODULE_DECL
