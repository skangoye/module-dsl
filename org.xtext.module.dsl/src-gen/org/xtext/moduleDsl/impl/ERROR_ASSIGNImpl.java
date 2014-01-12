/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.moduleDsl.END;
import org.xtext.moduleDsl.ERROR_ASSIGN;
import org.xtext.moduleDsl.ModuleDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERROR ASSIGN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.ERROR_ASSIGNImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERROR_ASSIGNImpl extends ERROR_INSTRImpl implements ERROR_ASSIGN
{
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
  protected ERROR_ASSIGNImpl()
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
    return ModuleDslPackage.Literals.ERROR_ASSIGN;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.ERROR_ASSIGN__END, oldEnd, newEnd);
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
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.ERROR_ASSIGN__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.ERROR_ASSIGN__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.ERROR_ASSIGN__END, newEnd, newEnd));
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
      case ModuleDslPackage.ERROR_ASSIGN__END:
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
      case ModuleDslPackage.ERROR_ASSIGN__END:
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
      case ModuleDslPackage.ERROR_ASSIGN__END:
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
      case ModuleDslPackage.ERROR_ASSIGN__END:
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
      case ModuleDslPackage.ERROR_ASSIGN__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ERROR_ASSIGNImpl
