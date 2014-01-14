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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.moduleDsl.CRITERION_DECL;
import org.xtext.moduleDsl.DATASEL_DECL;
import org.xtext.moduleDsl.EXPRESSION;
import org.xtext.moduleDsl.INSTRUCTION;
import org.xtext.moduleDsl.MODULE_DECL;
import org.xtext.moduleDsl.ModuleDslPackage;
import org.xtext.moduleDsl.VAR_CST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MODULE DECL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.moduleDsl.impl.MODULE_DECLImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.MODULE_DECLImpl#getCritdecl <em>Critdecl</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.MODULE_DECLImpl#getDataseldecl <em>Dataseldecl</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.MODULE_DECLImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.MODULE_DECLImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.moduleDsl.impl.MODULE_DECLImpl#getInstr <em>Instr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MODULE_DECLImpl extends MinimalEObjectImpl.Container implements MODULE_DECL
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
   * The cached value of the '{@link #getCritdecl() <em>Critdecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCritdecl()
   * @generated
   * @ordered
   */
  protected CRITERION_DECL critdecl;

  /**
   * The cached value of the '{@link #getDataseldecl() <em>Dataseldecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataseldecl()
   * @generated
   * @ordered
   */
  protected DATASEL_DECL dataseldecl;

  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected EList<VAR_CST> declaration;

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
  protected MODULE_DECLImpl()
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
    return ModuleDslPackage.Literals.MODULE_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CRITERION_DECL getCritdecl()
  {
    return critdecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCritdecl(CRITERION_DECL newCritdecl, NotificationChain msgs)
  {
    CRITERION_DECL oldCritdecl = critdecl;
    critdecl = newCritdecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__CRITDECL, oldCritdecl, newCritdecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCritdecl(CRITERION_DECL newCritdecl)
  {
    if (newCritdecl != critdecl)
    {
      NotificationChain msgs = null;
      if (critdecl != null)
        msgs = ((InternalEObject)critdecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.MODULE_DECL__CRITDECL, null, msgs);
      if (newCritdecl != null)
        msgs = ((InternalEObject)newCritdecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.MODULE_DECL__CRITDECL, null, msgs);
      msgs = basicSetCritdecl(newCritdecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__CRITDECL, newCritdecl, newCritdecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATASEL_DECL getDataseldecl()
  {
    return dataseldecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataseldecl(DATASEL_DECL newDataseldecl, NotificationChain msgs)
  {
    DATASEL_DECL oldDataseldecl = dataseldecl;
    dataseldecl = newDataseldecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__DATASELDECL, oldDataseldecl, newDataseldecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataseldecl(DATASEL_DECL newDataseldecl)
  {
    if (newDataseldecl != dataseldecl)
    {
      NotificationChain msgs = null;
      if (dataseldecl != null)
        msgs = ((InternalEObject)dataseldecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.MODULE_DECL__DATASELDECL, null, msgs);
      if (newDataseldecl != null)
        msgs = ((InternalEObject)newDataseldecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.MODULE_DECL__DATASELDECL, null, msgs);
      msgs = basicSetDataseldecl(newDataseldecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__DATASELDECL, newDataseldecl, newDataseldecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VAR_CST> getDeclaration()
  {
    if (declaration == null)
    {
      declaration = new EObjectContainmentEList<VAR_CST>(VAR_CST.class, this, ModuleDslPackage.MODULE_DECL__DECLARATION);
    }
    return declaration;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__EXP, oldExp, newExp);
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
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.MODULE_DECL__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModuleDslPackage.MODULE_DECL__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModuleDslPackage.MODULE_DECL__EXP, newExp, newExp));
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
      instr = new EObjectContainmentEList<INSTRUCTION>(INSTRUCTION.class, this, ModuleDslPackage.MODULE_DECL__INSTR);
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
      case ModuleDslPackage.MODULE_DECL__CRITDECL:
        return basicSetCritdecl(null, msgs);
      case ModuleDslPackage.MODULE_DECL__DATASELDECL:
        return basicSetDataseldecl(null, msgs);
      case ModuleDslPackage.MODULE_DECL__DECLARATION:
        return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
      case ModuleDslPackage.MODULE_DECL__EXP:
        return basicSetExp(null, msgs);
      case ModuleDslPackage.MODULE_DECL__INSTR:
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
      case ModuleDslPackage.MODULE_DECL__NAME:
        return getName();
      case ModuleDslPackage.MODULE_DECL__CRITDECL:
        return getCritdecl();
      case ModuleDslPackage.MODULE_DECL__DATASELDECL:
        return getDataseldecl();
      case ModuleDslPackage.MODULE_DECL__DECLARATION:
        return getDeclaration();
      case ModuleDslPackage.MODULE_DECL__EXP:
        return getExp();
      case ModuleDslPackage.MODULE_DECL__INSTR:
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
      case ModuleDslPackage.MODULE_DECL__NAME:
        setName((String)newValue);
        return;
      case ModuleDslPackage.MODULE_DECL__CRITDECL:
        setCritdecl((CRITERION_DECL)newValue);
        return;
      case ModuleDslPackage.MODULE_DECL__DATASELDECL:
        setDataseldecl((DATASEL_DECL)newValue);
        return;
      case ModuleDslPackage.MODULE_DECL__DECLARATION:
        getDeclaration().clear();
        getDeclaration().addAll((Collection<? extends VAR_CST>)newValue);
        return;
      case ModuleDslPackage.MODULE_DECL__EXP:
        setExp((EXPRESSION)newValue);
        return;
      case ModuleDslPackage.MODULE_DECL__INSTR:
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
      case ModuleDslPackage.MODULE_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModuleDslPackage.MODULE_DECL__CRITDECL:
        setCritdecl((CRITERION_DECL)null);
        return;
      case ModuleDslPackage.MODULE_DECL__DATASELDECL:
        setDataseldecl((DATASEL_DECL)null);
        return;
      case ModuleDslPackage.MODULE_DECL__DECLARATION:
        getDeclaration().clear();
        return;
      case ModuleDslPackage.MODULE_DECL__EXP:
        setExp((EXPRESSION)null);
        return;
      case ModuleDslPackage.MODULE_DECL__INSTR:
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
      case ModuleDslPackage.MODULE_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModuleDslPackage.MODULE_DECL__CRITDECL:
        return critdecl != null;
      case ModuleDslPackage.MODULE_DECL__DATASELDECL:
        return dataseldecl != null;
      case ModuleDslPackage.MODULE_DECL__DECLARATION:
        return declaration != null && !declaration.isEmpty();
      case ModuleDslPackage.MODULE_DECL__EXP:
        return exp != null;
      case ModuleDslPackage.MODULE_DECL__INSTR:
        return instr != null && !instr.isEmpty();
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

} //MODULE_DECLImpl
