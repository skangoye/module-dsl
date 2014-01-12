/**
 */
package org.xtext.moduleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SINGLE ASSIGN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.SINGLE_ASSIGN#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.SINGLE_ASSIGN#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getSINGLE_ASSIGN()
 * @model
 * @generated
 */
public interface SINGLE_ASSIGN extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VAR_CST)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getSINGLE_ASSIGN_Var()
   * @model
   * @generated
   */
  VAR_CST getVar();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.SINGLE_ASSIGN#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VAR_CST value);

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
   * @see org.xtext.moduleDsl.ModuleDslPackage#getSINGLE_ASSIGN_Exp()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getExp();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.SINGLE_ASSIGN#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(EXPRESSION value);

} // SINGLE_ASSIGN
