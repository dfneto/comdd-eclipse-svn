/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

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

import org.xtext.lrm.multiplosdestinos.Cabecalho;
import org.xtext.lrm.multiplosdestinos.Main;
import org.xtext.lrm.multiplosdestinos.ModeloRobo;
import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;
import org.xtext.lrm.multiplosdestinos.Pacote;
import org.xtext.lrm.multiplosdestinos.Plataforma;
import org.xtext.lrm.multiplosdestinos.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelo Robo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl#getPlataforma <em>Plataforma</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl#getCabecalho <em>Cabecalho</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl#getPacote <em>Pacote</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeloRoboImpl extends MinimalEObjectImpl.Container implements ModeloRobo
{
  /**
   * The cached value of the '{@link #getPlataforma() <em>Plataforma</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlataforma()
   * @generated
   * @ordered
   */
  protected EList<Plataforma> plataforma;

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
   * The cached value of the '{@link #getCabecalho() <em>Cabecalho</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCabecalho()
   * @generated
   * @ordered
   */
  protected EList<Cabecalho> cabecalho;

  /**
   * The cached value of the '{@link #getPacote() <em>Pacote</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacote()
   * @generated
   * @ordered
   */
  protected EList<Pacote> pacote;

  /**
   * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensor()
   * @generated
   * @ordered
   */
  protected EList<Sensor> sensor;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected EList<Main> main;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeloRoboImpl()
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
    return MultiplosdestinosPackage.Literals.MODELO_ROBO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plataforma> getPlataforma()
  {
    if (plataforma == null)
    {
      plataforma = new EObjectContainmentEList<Plataforma>(Plataforma.class, this, MultiplosdestinosPackage.MODELO_ROBO__PLATAFORMA);
    }
    return plataforma;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.MODELO_ROBO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Cabecalho> getCabecalho()
  {
    if (cabecalho == null)
    {
      cabecalho = new EObjectContainmentEList<Cabecalho>(Cabecalho.class, this, MultiplosdestinosPackage.MODELO_ROBO__CABECALHO);
    }
    return cabecalho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pacote> getPacote()
  {
    if (pacote == null)
    {
      pacote = new EObjectContainmentEList<Pacote>(Pacote.class, this, MultiplosdestinosPackage.MODELO_ROBO__PACOTE);
    }
    return pacote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sensor> getSensor()
  {
    if (sensor == null)
    {
      sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, MultiplosdestinosPackage.MODELO_ROBO__SENSOR);
    }
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Main> getMain()
  {
    if (main == null)
    {
      main = new EObjectContainmentEList<Main>(Main.class, this, MultiplosdestinosPackage.MODELO_ROBO__MAIN);
    }
    return main;
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
      case MultiplosdestinosPackage.MODELO_ROBO__PLATAFORMA:
        return ((InternalEList<?>)getPlataforma()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.MODELO_ROBO__CABECALHO:
        return ((InternalEList<?>)getCabecalho()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.MODELO_ROBO__PACOTE:
        return ((InternalEList<?>)getPacote()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.MODELO_ROBO__SENSOR:
        return ((InternalEList<?>)getSensor()).basicRemove(otherEnd, msgs);
      case MultiplosdestinosPackage.MODELO_ROBO__MAIN:
        return ((InternalEList<?>)getMain()).basicRemove(otherEnd, msgs);
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
      case MultiplosdestinosPackage.MODELO_ROBO__PLATAFORMA:
        return getPlataforma();
      case MultiplosdestinosPackage.MODELO_ROBO__NAME:
        return getName();
      case MultiplosdestinosPackage.MODELO_ROBO__CABECALHO:
        return getCabecalho();
      case MultiplosdestinosPackage.MODELO_ROBO__PACOTE:
        return getPacote();
      case MultiplosdestinosPackage.MODELO_ROBO__SENSOR:
        return getSensor();
      case MultiplosdestinosPackage.MODELO_ROBO__MAIN:
        return getMain();
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
      case MultiplosdestinosPackage.MODELO_ROBO__PLATAFORMA:
        getPlataforma().clear();
        getPlataforma().addAll((Collection<? extends Plataforma>)newValue);
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__NAME:
        setName((String)newValue);
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__CABECALHO:
        getCabecalho().clear();
        getCabecalho().addAll((Collection<? extends Cabecalho>)newValue);
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__PACOTE:
        getPacote().clear();
        getPacote().addAll((Collection<? extends Pacote>)newValue);
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__SENSOR:
        getSensor().clear();
        getSensor().addAll((Collection<? extends Sensor>)newValue);
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__MAIN:
        getMain().clear();
        getMain().addAll((Collection<? extends Main>)newValue);
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
      case MultiplosdestinosPackage.MODELO_ROBO__PLATAFORMA:
        getPlataforma().clear();
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__CABECALHO:
        getCabecalho().clear();
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__PACOTE:
        getPacote().clear();
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__SENSOR:
        getSensor().clear();
        return;
      case MultiplosdestinosPackage.MODELO_ROBO__MAIN:
        getMain().clear();
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
      case MultiplosdestinosPackage.MODELO_ROBO__PLATAFORMA:
        return plataforma != null && !plataforma.isEmpty();
      case MultiplosdestinosPackage.MODELO_ROBO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MultiplosdestinosPackage.MODELO_ROBO__CABECALHO:
        return cabecalho != null && !cabecalho.isEmpty();
      case MultiplosdestinosPackage.MODELO_ROBO__PACOTE:
        return pacote != null && !pacote.isEmpty();
      case MultiplosdestinosPackage.MODELO_ROBO__SENSOR:
        return sensor != null && !sensor.isEmpty();
      case MultiplosdestinosPackage.MODELO_ROBO__MAIN:
        return main != null && !main.isEmpty();
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

} //ModeloRoboImpl
