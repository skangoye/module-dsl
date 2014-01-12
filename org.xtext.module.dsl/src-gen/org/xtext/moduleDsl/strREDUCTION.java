/**
 */
package org.xtext.moduleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>str REDUCTION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.strREDUCTION#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.strREDUCTION#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.strREDUCTION#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.moduleDsl.ModuleDslPackage#getstrREDUCTION()
 * @model
 * @generated
 */
public interface strREDUCTION extends EXPRESSION
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(EXPRESSION)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getstrREDUCTION_Left()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getLeft();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.strREDUCTION#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EXPRESSION value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getstrREDUCTION_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.strREDUCTION#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos</em>' containment reference.
   * @see #setPos(EXPRESSION)
   * @see org.xtext.moduleDsl.ModuleDslPackage#getstrREDUCTION_Pos()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getPos();

  /**
   * Sets the value of the '{@link org.xtext.moduleDsl.strREDUCTION#getPos <em>Pos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos</em>' containment reference.
   * @see #getPos()
   * @generated
   */
  void setPos(EXPRESSION value);

} // strREDUCTION
