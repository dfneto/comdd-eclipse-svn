/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;
import org.xtext.lrm.multiplosdestinos.entrada;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>entrada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl#getGpsLer <em>Gps Ler</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl#getBussolaLer <em>Bussola Ler</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl#getCameraLer <em>Camera Ler</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl#getReceberCoordenada <em>Receber Coordenada</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl#getCarregarListaCoordenadas <em>Carregar Lista Coordenadas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class entradaImpl extends MinimalEObjectImpl.Container implements entrada
{
  /**
   * The default value of the '{@link #getGpsLer() <em>Gps Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGpsLer()
   * @generated
   * @ordered
   */
  protected static final String GPS_LER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGpsLer() <em>Gps Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGpsLer()
   * @generated
   * @ordered
   */
  protected String gpsLer = GPS_LER_EDEFAULT;

  /**
   * The default value of the '{@link #getBussolaLer() <em>Bussola Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBussolaLer()
   * @generated
   * @ordered
   */
  protected static final String BUSSOLA_LER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBussolaLer() <em>Bussola Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBussolaLer()
   * @generated
   * @ordered
   */
  protected String bussolaLer = BUSSOLA_LER_EDEFAULT;

  /**
   * The default value of the '{@link #getCameraLer() <em>Camera Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCameraLer()
   * @generated
   * @ordered
   */
  protected static final String CAMERA_LER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCameraLer() <em>Camera Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCameraLer()
   * @generated
   * @ordered
   */
  protected String cameraLer = CAMERA_LER_EDEFAULT;

  /**
   * The default value of the '{@link #getReceberCoordenada() <em>Receber Coordenada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceberCoordenada()
   * @generated
   * @ordered
   */
  protected static final String RECEBER_COORDENADA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReceberCoordenada() <em>Receber Coordenada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceberCoordenada()
   * @generated
   * @ordered
   */
  protected String receberCoordenada = RECEBER_COORDENADA_EDEFAULT;

  /**
   * The default value of the '{@link #getCarregarListaCoordenadas() <em>Carregar Lista Coordenadas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarregarListaCoordenadas()
   * @generated
   * @ordered
   */
  protected static final String CARREGAR_LISTA_COORDENADAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarregarListaCoordenadas() <em>Carregar Lista Coordenadas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarregarListaCoordenadas()
   * @generated
   * @ordered
   */
  protected String carregarListaCoordenadas = CARREGAR_LISTA_COORDENADAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected entradaImpl()
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
    return MultiplosdestinosPackage.Literals.ENTRADA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGpsLer()
  {
    return gpsLer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGpsLer(String newGpsLer)
  {
    String oldGpsLer = gpsLer;
    gpsLer = newGpsLer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.ENTRADA__GPS_LER, oldGpsLer, gpsLer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBussolaLer()
  {
    return bussolaLer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBussolaLer(String newBussolaLer)
  {
    String oldBussolaLer = bussolaLer;
    bussolaLer = newBussolaLer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.ENTRADA__BUSSOLA_LER, oldBussolaLer, bussolaLer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCameraLer()
  {
    return cameraLer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCameraLer(String newCameraLer)
  {
    String oldCameraLer = cameraLer;
    cameraLer = newCameraLer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.ENTRADA__CAMERA_LER, oldCameraLer, cameraLer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReceberCoordenada()
  {
    return receberCoordenada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceberCoordenada(String newReceberCoordenada)
  {
    String oldReceberCoordenada = receberCoordenada;
    receberCoordenada = newReceberCoordenada;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.ENTRADA__RECEBER_COORDENADA, oldReceberCoordenada, receberCoordenada));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCarregarListaCoordenadas()
  {
    return carregarListaCoordenadas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCarregarListaCoordenadas(String newCarregarListaCoordenadas)
  {
    String oldCarregarListaCoordenadas = carregarListaCoordenadas;
    carregarListaCoordenadas = newCarregarListaCoordenadas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.ENTRADA__CARREGAR_LISTA_COORDENADAS, oldCarregarListaCoordenadas, carregarListaCoordenadas));
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
      case MultiplosdestinosPackage.ENTRADA__GPS_LER:
        return getGpsLer();
      case MultiplosdestinosPackage.ENTRADA__BUSSOLA_LER:
        return getBussolaLer();
      case MultiplosdestinosPackage.ENTRADA__CAMERA_LER:
        return getCameraLer();
      case MultiplosdestinosPackage.ENTRADA__RECEBER_COORDENADA:
        return getReceberCoordenada();
      case MultiplosdestinosPackage.ENTRADA__CARREGAR_LISTA_COORDENADAS:
        return getCarregarListaCoordenadas();
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
      case MultiplosdestinosPackage.ENTRADA__GPS_LER:
        setGpsLer((String)newValue);
        return;
      case MultiplosdestinosPackage.ENTRADA__BUSSOLA_LER:
        setBussolaLer((String)newValue);
        return;
      case MultiplosdestinosPackage.ENTRADA__CAMERA_LER:
        setCameraLer((String)newValue);
        return;
      case MultiplosdestinosPackage.ENTRADA__RECEBER_COORDENADA:
        setReceberCoordenada((String)newValue);
        return;
      case MultiplosdestinosPackage.ENTRADA__CARREGAR_LISTA_COORDENADAS:
        setCarregarListaCoordenadas((String)newValue);
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
      case MultiplosdestinosPackage.ENTRADA__GPS_LER:
        setGpsLer(GPS_LER_EDEFAULT);
        return;
      case MultiplosdestinosPackage.ENTRADA__BUSSOLA_LER:
        setBussolaLer(BUSSOLA_LER_EDEFAULT);
        return;
      case MultiplosdestinosPackage.ENTRADA__CAMERA_LER:
        setCameraLer(CAMERA_LER_EDEFAULT);
        return;
      case MultiplosdestinosPackage.ENTRADA__RECEBER_COORDENADA:
        setReceberCoordenada(RECEBER_COORDENADA_EDEFAULT);
        return;
      case MultiplosdestinosPackage.ENTRADA__CARREGAR_LISTA_COORDENADAS:
        setCarregarListaCoordenadas(CARREGAR_LISTA_COORDENADAS_EDEFAULT);
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
      case MultiplosdestinosPackage.ENTRADA__GPS_LER:
        return GPS_LER_EDEFAULT == null ? gpsLer != null : !GPS_LER_EDEFAULT.equals(gpsLer);
      case MultiplosdestinosPackage.ENTRADA__BUSSOLA_LER:
        return BUSSOLA_LER_EDEFAULT == null ? bussolaLer != null : !BUSSOLA_LER_EDEFAULT.equals(bussolaLer);
      case MultiplosdestinosPackage.ENTRADA__CAMERA_LER:
        return CAMERA_LER_EDEFAULT == null ? cameraLer != null : !CAMERA_LER_EDEFAULT.equals(cameraLer);
      case MultiplosdestinosPackage.ENTRADA__RECEBER_COORDENADA:
        return RECEBER_COORDENADA_EDEFAULT == null ? receberCoordenada != null : !RECEBER_COORDENADA_EDEFAULT.equals(receberCoordenada);
      case MultiplosdestinosPackage.ENTRADA__CARREGAR_LISTA_COORDENADAS:
        return CARREGAR_LISTA_COORDENADAS_EDEFAULT == null ? carregarListaCoordenadas != null : !CARREGAR_LISTA_COORDENADAS_EDEFAULT.equals(carregarListaCoordenadas);
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
    result.append(" (gpsLer: ");
    result.append(gpsLer);
    result.append(", bussolaLer: ");
    result.append(bussolaLer);
    result.append(", cameraLer: ");
    result.append(cameraLer);
    result.append(", receberCoordenada: ");
    result.append(receberCoordenada);
    result.append(", carregarListaCoordenadas: ");
    result.append(carregarListaCoordenadas);
    result.append(')');
    return result.toString();
  }

} //entradaImpl
