/**
 */
package org.xtext.moduleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.VAR#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.VAR#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR()
 * @model
 * @generated
 */
public interface VAR extends VAR_CST
{
  /**
   * Returns the value of the '<em><b>Flow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flow</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow</em>' containment reference.
   * @see #setFlow(Flow)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR_Flow()
   * @model containment="true"
   * @generated
   */
  Flow getFlow();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.VAR#getFlow <em>Flow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flow</em>' containment reference.
   * @see #getFlow()
   * @generated
   */
  void setFlow(Flow value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RANGE)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getVAR_Range()
   * @model containment="true"
   * @generated
   */
  RANGE getRange();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.VAR#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RANGE value);

} // VAR
