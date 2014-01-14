/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.IF_INSTR;
import org.xtext.moduleDsl.INSTRUCTION;
import org.xtext.moduleDsl.ModuleDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IF INSTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.IF_INSTRImpl#getIfcond <em>Ifcond</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.IF_INSTRImpl#getIfst <em>Ifst</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.IF_INSTRImpl#getElst <em>Elst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IF_INSTRImpl extends INSTRUCTIONImpl implements IF_INSTR
{
  /**
   * The cached value of the '{@link #getIfcond() <em>Ifcond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfcond()
   * @generated
   * @ordered
   */
  protected EXPRESSION ifcond;

  /**
   * The cached value of the '{@link #getIfst() <em>Ifst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfst()
   * @generated
   * @ordered
   */
  protected INSTRUCTION ifst;

  /**
   * The cached value of the '{@link #getElst() <em>Elst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElst()
   * @generated
   * @ordered
   */
  protected INSTRUCTION elst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IF_INSTRImpl()
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
    return ModuleDslPackage.Literals.IF_INSTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getIfcond()
  {
    return ifcond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfcond(EXPRESSION newIfcond, NotificationChain msgs)
  {
    EXPRESSION oldIfcond = ifcond;
    ifcond = newIfcond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.IF_INSTR__IFCOND, oldIfcond, newIfcond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfcond(EXPRESSION newIfcond)
  {
    if (newIfcond != ifcond)
    {
      NotificationChain msgs = null;
      if (ifcond != null)
        msgs = ((InternalEObject)ifcond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.IF_INSTR__IFCOND, null, msgs);
      if (newIfcond != null)
        msgs = ((InternalEObject)newIfcond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.IF_INSTR__IFCOND, null, msgs);
      msgs = basicSetIfcond(newIfcond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.IF_INSTR__IFCOND, newIfcond, newIfcond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INSTRUCTION getIfst()
  {
    return ifst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfst(INSTRUCTION newIfst, NotificationChain msgs)
  {
    INSTRUCTION oldIfst = ifst;
    ifst = newIfst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.IF_INSTR__IFST, oldIfst, newIfst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfst(INSTRUCTION newIfst)
  {
    if (newIfst != ifst)
    {
      NotificationChain msgs = null;
      if (ifst != null)
        msgs = ((InternalEObject)ifst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.IF_INSTR__IFST, null, msgs);
      if (newIfst != null)
        msgs = ((InternalEObject)newIfst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.IF_INSTR__IFST, null, msgs);
      msgs = basicSetIfst(newIfst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.IF_INSTR__IFST, newIfst, newIfst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INSTRUCTION getElst()
  {
    return elst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElst(INSTRUCTION newElst, NotificationChain msgs)
  {
    INSTRUCTION oldElst = elst;
    elst = newElst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.IF_INSTR__ELST, oldElst, newElst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElst(INSTRUCTION newElst)
  {
    if (newElst != elst)
    {
      NotificationChain msgs = null;
      if (elst != null)
        msgs = ((InternalEObject)elst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.IF_INSTR__ELST, null, msgs);
      if (newElst != null)
        msgs = ((InternalEObject)newElst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.IF_INSTR__ELST, null, msgs);
      msgs = basicSetElst(newElst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.IF_INSTR__ELST, newElst, newElst));
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
      case ModuleDslPackage.IF_INSTR__IFCOND:
        return basicSetIfcond(null, msgs);
      case ModuleDslPackage.IF_INSTR__IFST:
        return basicSetIfst(null, msgs);
      case ModuleDslPackage.IF_INSTR__ELST:
        return basicSetElst(null, msgs);
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
      case ModuleDslPackage.IF_INSTR__IFCOND:
        return getIfcond();
      case ModuleDslPackage.IF_INSTR__IFST:
        return getIfst();
      case ModuleDslPackage.IF_INSTR__ELST:
        return getElst();
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
      case ModuleDslPackage.IF_INSTR__IFCOND:
        setIfcond((EXPRESSION)newValue);
        return;
      case ModuleDslPackage.IF_INSTR__IFST:
        setIfst((INSTRUCTION)newValue);
        return;
      case ModuleDslPackage.IF_INSTR__ELST:
        setElst((INSTRUCTION)newValue);
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
      case ModuleDslPackage.IF_INSTR__IFCOND:
        setIfcond((EXPRESSION)null);
        return;
      case ModuleDslPackage.IF_INSTR__IFST:
        setIfst((INSTRUCTION)null);
        return;
      case ModuleDslPackage.IF_INSTR__ELST:
        setElst((INSTRUCTION)null);
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
      case ModuleDslPackage.IF_INSTR__IFCOND:
        return ifcond != null;
      case ModuleDslPackage.IF_INSTR__IFST:
        return ifst != null;
      case ModuleDslPackage.IF_INSTR__ELST:
        return elst != null;
    }
    return super.eIsSet(featureID);
  }

} //IF_INSTRImpl
