/**
 */
package org.xtext.moduleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAR CST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.VAR_CST#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.VAR_CST#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.VAR_CST#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR_CST()
 * @model
 * @generated
 */
public interface VAR_CST extends EObject
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
   * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR_CST_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.VAR_CST#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TYPE)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR_CST_Type()
   * @model containment="true"
   * @generated
   */
  TYPE getType();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.VAR_CST#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TYPE value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(END)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR_CST_End()
   * @model containment="true"
   * @generated
   */
  END getEnd();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.VAR_CST#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(END value);

} // VAR_CST
