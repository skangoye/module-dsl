/**
 */
package org.xtext.moduleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NULL INSTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.NULL_INSTR#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getNULL_INSTR()
 * @model
 * @generated
 */
public interface NULL_INSTR extends INSTRUCTION
{
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
   * @see org.xtext.moduleDsl.ModuleDslPackage#getNULL_INSTR_End()
   * @model containment="true"
   * @generated
   */
  END getEnd();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.NULL_INSTR#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(END value);

} // NULL_INSTR
