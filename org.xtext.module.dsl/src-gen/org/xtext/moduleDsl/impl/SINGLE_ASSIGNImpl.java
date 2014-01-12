/**
 */
package org.xtext.moduleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.SINGLE_ASSIGN;
import org.xtext.moduleDsl.VAR_CST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SINGLE ASSIGN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.SINGLE_ASSIGNImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.SINGLE_ASSIGNImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SINGLE_ASSIGNImpl extends MinimalEObjectImpl.Container implements SINGLE_ASSIGN
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected VAR_CST var;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EXPRESSION exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SINGLE_ASSIGNImpl()
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
    return ModuleDslPackage.Literals.SINGLE_ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAR_CST getVar()
  {
    if (var != null && var.eIsProxy())
    {
      InternalEObject oldVar = (InternalEObject)var;
      var = (VAR_CST)eResolveProxy(oldVar);
      if (var != oldVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModuleDslPackage.SINGLE_ASSIGN__VAR, oldVar, var));
      }
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAR_CST basicGetVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(VAR_CST newVar)
  {
    VAR_CST oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.SINGLE_ASSIGN__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(EXPRESSION newExp, NotificationChain msgs)
  {
    EXPRESSION oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.SINGLE_ASSIGN__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(EXPRESSION newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.SINGLE_ASSIGN__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.SINGLE_ASSIGN__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.SINGLE_ASSIGN__EXP, newExp, newExp));
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
      case ModuleDslPackage.SINGLE_ASSIGN__EXP:
        return basicSetExp(null, msgs);
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
      case ModuleDslPackage.SINGLE_ASSIGN__VAR:
        if (resolve) return getVar();
        return basicGetVar();
      case ModuleDslPackage.SINGLE_ASSIGN__EXP:
        return getExp();
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
      case ModuleDslPackage.SINGLE_ASSIGN__VAR:
        setVar((VAR_CST)newValue);
        return;
      case ModuleDslPackage.SINGLE_ASSIGN__EXP:
        setExp((EXPRESSION)newValue);
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
      case ModuleDslPackage.SINGLE_ASSIGN__VAR:
        setVar((VAR_CST)null);
        return;
      case ModuleDslPackage.SINGLE_ASSIGN__EXP:
        setExp((EXPRESSION)null);
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
      case ModuleDslPackage.SINGLE_ASSIGN__VAR:
        return var != null;
      case ModuleDslPackage.SINGLE_ASSIGN__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //SINGLE_ASSIGNImpl
