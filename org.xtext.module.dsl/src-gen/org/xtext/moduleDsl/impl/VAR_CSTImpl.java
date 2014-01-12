/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.moduleDsl.END;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.TYPE;
import org.xtext.moduleDsl.VAR_CST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VAR CST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.VAR_CSTImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.VAR_CSTImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.VAR_CSTImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VAR_CSTImpl extends MinimalEObjectImpl.Container implements VAR_CST
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TYPE type;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected END end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VAR_CSTImpl()
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
    return ModuleDslPackage.Literals.VAR_CST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.VAR_CST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TYPE newType, NotificationChain msgs)
  {
    TYPE oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.VAR_CST__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TYPE newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.VAR_CST__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.VAR_CST__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.VAR_CST__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public END getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(END newEnd, NotificationChain msgs)
  {
    END oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.VAR_CST__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(END newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.VAR_CST__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.VAR_CST__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.VAR_CST__END, newEnd, newEnd));
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
      case ModuleDslPackage.VAR_CST__TYPE:
        return basicSetType(null, msgs);
      case ModuleDslPackage.VAR_CST__END:
        return basicSetEnd(null, msgs);
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
      case ModuleDslPackage.VAR_CST__NAME:
        return getName();
      case ModuleDslPackage.VAR_CST__TYPE:
        return getType();
      case ModuleDslPackage.VAR_CST__END:
        return getEnd();
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
      case ModuleDslPackage.VAR_CST__NAME:
        setName((String)newValue);
        return;
      case ModuleDslPackage.VAR_CST__TYPE:
        setType((TYPE)newValue);
        return;
      case ModuleDslPackage.VAR_CST__END:
        setEnd((END)newValue);
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
      case ModuleDslPackage.VAR_CST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModuleDslPackage.VAR_CST__TYPE:
        setType((TYPE)null);
        return;
      case ModuleDslPackage.VAR_CST__END:
        setEnd((END)null);
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
      case ModuleDslPackage.VAR_CST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModuleDslPackage.VAR_CST__TYPE:
        return type != null;
      case ModuleDslPackage.VAR_CST__END:
        return end != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VAR_CSTImpl
