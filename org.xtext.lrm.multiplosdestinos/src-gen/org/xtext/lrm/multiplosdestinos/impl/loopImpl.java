/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;
import org.xtext.lrm.multiplosdestinos.acao;
import org.xtext.lrm.multiplosdestinos.comportamento;
import org.xtext.lrm.multiplosdestinos.entrada;
import org.xtext.lrm.multiplosdestinos.inicializacaoSensor;
import org.xtext.lrm.multiplosdestinos.loop;
import org.xtext.lrm.multiplosdestinos.processamento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl#getIniSensor <em>Ini Sensor</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl#getEn <em>En</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl#getProc <em>Proc</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl#getAc <em>Ac</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class loopImpl extends MainImpl implements loop
{
  /**
   * The cached value of the '{@link #getIniSensor() <em>Ini Sensor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIniSensor()
   * @generated
   * @ordered
   */
  protected EList<inicializacaoSensor> iniSensor;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected EList<String> w;

  /**
   * The cached value of the '{@link #getEn() <em>En</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEn()
   * @generated
   * @ordered
   */
  protected EList<entrada> en;

  /**
   * The cached value of the '{@link #getProc() <em>Proc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProc()
   * @generated
   * @ordered
   */
  protected EList<processamento> proc;

  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected EList<comportamento> comp;

  /**
   * The cached value of the '{@link #getAc() <em>Ac</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAc()
   * @generated
   * @ordered
   */
  protected EList<acao> ac;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected loopImpl()
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
    return MultiplosdestinosPackage.Literals.LOOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<inicializacaoSensor> getIniSensor()
  {
    if (iniSensor == null)
    {
      iniSensor = new EObjectContainmentEList<inicializacaoSensor>(inicializacaoSensor.class, this, MultiplosdestinosPackage.LOOP__INI_SENSOR);
    }
    return iniSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getW()
  {
    if (w == null)
    {
      w = new EDataTypeEList<String>(String.class, this, MultiplosdestinosPackage.LOOP__W);
    }
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<entrada> getEn()
  {
    if (en == null)
    {
      en = new EObjectContainmentEList<entrada>(entrada.class, this, MultiplosdestinosPackage.LOOP__EN);
    }
    return en;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<processamento> getProc()
  {
    if (proc == null)
    {
      proc = new EObjectContainmentEList<processamento>(processamento.class, this, MultiplosdestinosPackage.LOOP__PROC);
    }
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<comportamento> getComp()
  {
    if (comp == null)
    {
      comp = new EObjectContainmentEList<comportamento>(comportamento.class, this, MultiplosdestinosPackage.LOOP__COMP);
    }
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<acao> getAc()
  {
    if (ac == null)
    {
      ac = new EObjectContainmentEList<acao>(acao.class, this, MultiplosdestinosPackage.LOOP__AC);
    }
    return ac;
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
      case MultiplosdestinosPackage.LOOP__INI_SENSOR:
        return ((InternalEList<?>)getIniSensor()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.LOOP__EN:
        return ((InternalEList<?>)getEn()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.LOOP__PROC:
        return ((InternalEList<?>)getProc()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.LOOP__COMP:
        return ((InternalEList<?>)getComp()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.LOOP__AC:
        return ((InternalEList<?>)getAc()).basicRemove(otherEnd, msgs);
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
      case MultiplosdestinosPackage.LOOP__INI_SENSOR:
        return getIniSensor();
      case MultiplosdestinosPackage.LOOP__W:
        return getW();
      case MultiplosdestinosPackage.LOOP__EN:
        return getEn();
      case MultiplosdestinosPackage.LOOP__PROC:
        return getProc();
      case MultiplosdestinosPackage.LOOP__COMP:
        return getComp();
      case MultiplosdestinosPackage.LOOP__AC:
        return getAc();
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
      case MultiplosdestinosPackage.LOOP__INI_SENSOR:
        getIniSensor().clear();
        getIniSensor().addAll((Collection<? extends inicializacaoSensor>)newValue);
        return;
      case MultiplosdestinosPackage.LOOP__W:
        getW().clear();
        getW().addAll((Collection<? extends String>)newValue);
        return;
      case MultiplosdestinosPackage.LOOP__EN:
        getEn().clear();
        getEn().addAll((Collection<? extends entrada>)newValue);
        return;
      case MultiplosdestinosPackage.LOOP__PROC:
        getProc().clear();
        getProc().addAll((Collection<? extends processamento>)newValue);
        return;
      case MultiplosdestinosPackage.LOOP__COMP:
        getComp().clear();
        getComp().addAll((Collection<? extends comportamento>)newValue);
        return;
      case MultiplosdestinosPackage.LOOP__AC:
        getAc().clear();
        getAc().addAll((Collection<? extends acao>)newValue);
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
      case MultiplosdestinosPackage.LOOP__INI_SENSOR:
        getIniSensor().clear();
        return;
      case MultiplosdestinosPackage.LOOP__W:
        getW().clear();
        return;
      case MultiplosdestinosPackage.LOOP__EN:
        getEn().clear();
        return;
      case MultiplosdestinosPackage.LOOP__PROC:
        getProc().clear();
        return;
      case MultiplosdestinosPackage.LOOP__COMP:
        getComp().clear();
        return;
      case MultiplosdestinosPackage.LOOP__AC:
        getAc().clear();
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
      case MultiplosdestinosPackage.LOOP__INI_SENSOR:
        return iniSensor != null && !iniSensor.isEmpty();
      case MultiplosdestinosPackage.LOOP__W:
        return w != null && !w.isEmpty();
      case MultiplosdestinosPackage.LOOP__EN:
        return en != null && !en.isEmpty();
      case MultiplosdestinosPackage.LOOP__PROC:
        return proc != null && !proc.isEmpty();
      case MultiplosdestinosPackage.LOOP__COMP:
        return comp != null && !comp.isEmpty();
      case MultiplosdestinosPackage.LOOP__AC:
        return ac != null && !ac.isEmpty();
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
    result.append(" (w: ");
    result.append(w);
    result.append(')');
    return result.toString();
  }

} //loopImpl
