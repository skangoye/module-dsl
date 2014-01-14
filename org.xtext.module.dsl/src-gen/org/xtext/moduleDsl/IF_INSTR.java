/**
 */
package org.xtext.moduleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IF INSTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.IF_INSTR#getIfcond <em>Ifcond</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.IF_INSTR#getIfst <em>Ifst</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.IF_INSTR#getElst <em>Elst</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getIF_INSTR()
 * @model
 * @generated
 */
public interface IF_INSTR extends INSTRUCTION
{
  /**
   * Returns the value of the '<em><b>Ifcond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifcond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifcond</em>' containment reference.
   * @see #setIfcond(EXPRESSION)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getIF_INSTR_Ifcond()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getIfcond();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.IF_INSTR#getIfcond <em>Ifcond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifcond</em>' containment reference.
   * @see #getIfcond()
   * @generated
   */
  void setIfcond(EXPRESSION value);

  /**
   * Returns the value of the '<em><b>Ifst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifst</em>' containment reference.
   * @see #setIfst(INSTRUCTION)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getIF_INSTR_Ifst()
   * @model containment="true"
   * @generated
   */
  INSTRUCTION getIfst();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.IF_INSTR#getIfst <em>Ifst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifst</em>' containment reference.
   * @see #getIfst()
   * @generated
   */
  void setIfst(INSTRUCTION value);

  /**
   * Returns the value of the '<em><b>Elst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elst</em>' containment reference.
   * @see #setElst(INSTRUCTION)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getIF_INSTR_Elst()
   * @model containment="true"
   * @generated
   */
  INSTRUCTION getElst();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.IF_INSTR#getElst <em>Elst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elst</em>' containment reference.
   * @see #getElst()
   * @generated
   */
  void setElst(INSTRUCTION value);

} // IF_INSTR
