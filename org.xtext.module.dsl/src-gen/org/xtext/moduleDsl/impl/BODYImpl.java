/**
 */
package org.xtext.moduleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.moduleDsl.BODY;
import org.xtext.moduleDsl.INSTRUCTION;
import org.xtext.moduleDsl.ModuleDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BODY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.BODYImpl#getInstr <em>Instr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BODYImpl extends MinimalEObjectImpl.Container implements BODY
{
  /**
   * The cached value of the '{@link #getInstr() <em>Instr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstr()
   * @generated
   * @ordered
   */
  protected EList<INSTRUCTION> instr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BODYImpl()
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
    return ModuleDslPackage.Literals.BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<INSTRUCTION> getInstr()
  {
    if (instr == null)
    {
      instr = new EObjectContainmentEList<INSTRUCTION>(INSTRUCTION.class, this, ModuleDslPackage.BODY__INSTR);
    }
    return instr;
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
      case ModuleDslPackage.BODY__INSTR:
        return ((InternalEList<?>)getInstr()).basicRemove(otherEnd, msgs);
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
      case ModuleDslPackage.BODY__INSTR:
        return getInstr();
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
      case ModuleDslPackage.BODY__INSTR:
        getInstr().clear();
        getInstr().addAll((Collection<? extends INSTRUCTION>)newValue);
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
      case ModuleDslPackage.BODY__INSTR:
        getInstr().clear();
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
      case ModuleDslPackage.BODY__INSTR:
        return instr != null && !instr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BODYImpl
