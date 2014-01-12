/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.strREDUCTION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>str REDUCTION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.strREDUCTIONImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.strREDUCTIONImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.strREDUCTIONImpl#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class strREDUCTIONImpl extends EXPRESSIONImpl implements strREDUCTION
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected EXPRESSION left;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected EXPRESSION pos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected strREDUCTIONImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModuleDslPackage.Literals.STR_REDUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(EXPRESSION newLeft, NotificationChain msgs)
  {
    EXPRESSION oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.STR_REDUCTION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(EXPRESSION newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.STR_REDUCTION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.STR_REDUCTION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.STR_REDUCTION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.STR_REDUCTION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getPos()
  {
    return pos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPos(EXPRESSION newPos, NotificationChain msgs)
  {
    EXPRESSION oldPos = pos;
    pos = newPos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.STR_REDUCTION__POS, oldPos, newPos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPos(EXPRESSION newPos)
  {
    if (newPos != pos)
    {
      NotificationChain msgs = null;
      if (pos != null)
        msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.STR_REDUCTION__POS, null, msgs);
      if (newPos != null)
        msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.STR_REDUCTION__POS, null, msgs);
      msgs = basicSetPos(newPos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.STR_REDUCTION__POS, newPos, newPos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModuleDslPackage.STR_REDUCTION__LEFT:
        return basicSetLeft(null, msgs);
      case ModuleDslPackage.STR_REDUCTION__POS:
        return basicSetPos(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModuleDslPackage.STR_REDUCTION__LEFT:
        return getLeft();
      case ModuleDslPackage.STR_REDUCTION__OP:
        return getOp();
      case ModuleDslPackage.STR_REDUCTION__POS:
        return getPos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModuleDslPackage.STR_REDUCTION__LEFT:
        setLeft((EXPRESSION)newValue);
        return;
      case ModuleDslPackage.STR_REDUCTION__OP:
        setOp((String)newValue);
        return;
      case ModuleDslPackage.STR_REDUCTION__POS:
        setPos((EXPRESSION)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModuleDslPackage.STR_REDUCTION__LEFT:
        setLeft((EXPRESSION)null);
        return;
      case ModuleDslPackage.STR_REDUCTION__OP:
        setOp(OP_EDEFAULT);
        return;
      case ModuleDslPackage.STR_REDUCTION__POS:
        setPos((EXPRESSION)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModuleDslPackage.STR_REDUCTION__LEFT:
        return left != null;
      case ModuleDslPackage.STR_REDUCTION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case ModuleDslPackage.STR_REDUCTION__POS:
        return pos != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //strREDUCTIONImpl
