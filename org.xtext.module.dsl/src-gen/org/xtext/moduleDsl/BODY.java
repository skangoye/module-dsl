/**
 */
package org.xtext.moduleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BODY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.BODY#getInstr <em>Instr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getBODY()
 * @model
 * @generated
 */
public interface BODY extends EObject
{
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
   * @see org.xtext.moduleDsl.ModuleDslPackage#getBODY_Instr()
   * @model containment="true"
   * @generated
   */
  EList<INSTRUCTION> getInstr();

} // BODY
