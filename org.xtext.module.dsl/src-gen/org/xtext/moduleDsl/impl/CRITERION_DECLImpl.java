/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.moduleDsl.CRITERION;
import org.xtext.moduleDsl.CRITERION_DECL;
import org.xtext.moduleDsl.END;
import org.xtext.moduleDsl.ModuleDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRITERION DECL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.CRITERION_DECLImpl#getCrit <em>Crit</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.CRITERION_DECLImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRITERION_DECLImpl extends MinimalEObjectImpl.Container implements CRITERION_DECL
{
  /**
   * The cached value of the '{@link #getCrit() <em>Crit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrit()
   * @generated
   * @ordered
   */
  protected CRITERION crit;

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
  protected CRITERION_DECLImpl()
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
    return ModuleDslPackage.Literals.CRITERION_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CRITERION getCrit()
  {
    return crit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCrit(CRITERION newCrit, NotificationChain msgs)
  {
    CRITERION oldCrit = crit;
    crit = newCrit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.CRITERION_DECL__CRIT, oldCrit, newCrit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCrit(CRITERION newCrit)
  {
    if (newCrit != crit)
    {
      NotificationChain msgs = null;
      if (crit != null)
        msgs = ((InternalEObject)crit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.CRITERION_DECL__CRIT, null, msgs);
      if (newCrit != null)
        msgs = ((InternalEObject)newCrit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.CRITERION_DECL__CRIT, null, msgs);
      msgs = basicSetCrit(newCrit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.CRITERION_DECL__CRIT, newCrit, newCrit));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.CRITERION_DECL__END, oldEnd, newEnd);
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
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.CRITERION_DECL__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.CRITERION_DECL__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.CRITERION_DECL__END, newEnd, newEnd));
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
      case ModuleDslPackage.CRITERION_DECL__CRIT:
        return basicSetCrit(null, msgs);
      case ModuleDslPackage.CRITERION_DECL__END:
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
      case ModuleDslPackage.CRITERION_DECL__CRIT:
        return getCrit();
      case ModuleDslPackage.CRITERION_DECL__END:
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
      case ModuleDslPackage.CRITERION_DECL__CRIT:
        setCrit((CRITERION)newValue);
        return;
      case ModuleDslPackage.CRITERION_DECL__END:
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
      case ModuleDslPackage.CRITERION_DECL__CRIT:
        setCrit((CRITERION)null);
        return;
      case ModuleDslPackage.CRITERION_DECL__END:
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
      case ModuleDslPackage.CRITERION_DECL__CRIT:
        return crit != null;
      case ModuleDslPackage.CRITERION_DECL__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //CRITERION_DECLImpl
