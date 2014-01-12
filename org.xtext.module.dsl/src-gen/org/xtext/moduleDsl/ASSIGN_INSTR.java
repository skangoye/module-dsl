/**
 */
package org.xtext.moduleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASSIGN INSTR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.ASSIGN_INSTR#getSa <em>Sa</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.ASSIGN_INSTR#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getASSIGN_INSTR()
 * @model
 * @generated
 */
public interface ASSIGN_INSTR extends INSTRUCTION
{
  /**
   * Returns the value of the '<em><b>Sa</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.moduleDsl.SINGLE_ASSIGN}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sa</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sa</em>' containment reference list.
   * @see org.xtext.moduleDsl.ModuleDslPackage#getASSIGN_INSTR_Sa()
   * @model containment="true"
   * @generated
   */
  EList<SINGLE_ASSIGN> getSa();

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
   * @see org.xtext.moduleDsl.ModuleDslPackage#getASSIGN_INSTR_End()
   * @model containment="true"
   * @generated
   */
  END getEnd();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.ASSIGN_INSTR#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(END value);

} // ASSIGN_INSTR
