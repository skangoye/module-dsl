/**
 */
package org.xtext.moduleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.moduleDsl.ASSIGN_INSTR;
import org.xtext.moduleDsl.END;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.SINGLE_ASSIGN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ASSIGN INSTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.ASSIGN_INSTRImpl#getSa <em>Sa</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.ASSIGN_INSTRImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ASSIGN_INSTRImpl extends INSTRUCTIONImpl implements ASSIGN_INSTR
{
  /**
   * The cached value of the '{@link #getSa() <em>Sa</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSa()
   * @generated
   * @ordered
   */
  protected EList<SINGLE_ASSIGN> sa;

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
  protected ASSIGN_INSTRImpl()
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
    return ModuleDslPackage.Literals.ASSIGN_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SINGLE_ASSIGN> getSa()
  {
    if (sa == null)
    {
      sa = new EObjectContainmentEList<SINGLE_ASSIGN>(SINGLE_ASSIGN.class, this, ModuleDslPackage.ASSIGN_INSTR__SA);
    }
    return sa;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.ASSIGN_INSTR__END, oldEnd, newEnd);
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
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.ASSIGN_INSTR__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.ASSIGN_INSTR__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.ASSIGN_INSTR__END, newEnd, newEnd));
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
      case ModuleDslPackage.ASSIGN_INSTR__SA:
        return ((InternalEList<?>)getSa()).basicRemove(otherEnd, msgs);
      case ModuleDslPackage.ASSIGN_INSTR__END:
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
      case ModuleDslPackage.ASSIGN_INSTR__SA:
        return getSa();
      case ModuleDslPackage.ASSIGN_INSTR__END:
        return getEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModuleDslPackage.ASSIGN_INSTR__SA:
        getSa().clear();
        getSa().addAll((Collection<? extends SINGLE_ASSIGN>)newValue);
        return;
      case ModuleDslPackage.ASSIGN_INSTR__END:
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
      case ModuleDslPackage.ASSIGN_INSTR__SA:
        getSa().clear();
        return;
      case ModuleDslPackage.ASSIGN_INSTR__END:
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
      case ModuleDslPackage.ASSIGN_INSTR__SA:
        return sa != null && !sa.isEmpty();
      case ModuleDslPackage.ASSIGN_INSTR__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ASSIGN_INSTRImpl
