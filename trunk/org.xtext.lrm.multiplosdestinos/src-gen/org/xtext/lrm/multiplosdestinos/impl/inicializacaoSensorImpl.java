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
import org.xtext.lrm.multiplosdestinos.inicializacaoSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>inicializacao Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl#getGpsLigar <em>Gps Ligar</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl#getBussolaLigar <em>Bussola Ligar</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl#getCameraLigar <em>Camera Ligar</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl#getCarregarListaCoordenadas <em>Carregar Lista Coordenadas</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl#getInicializarPlayer <em>Inicializar Player</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class inicializacaoSensorImpl extends MinimalEObjectImpl.Container implements inicializacaoSensor
{
  /**
   * The default value of the '{@link #getGpsLigar() <em>Gps Ligar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGpsLigar()
   * @generated
   * @ordered
   */
  protected static final String GPS_LIGAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGpsLigar() <em>Gps Ligar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGpsLigar()
   * @generated
   * @ordered
   */
  protected String gpsLigar = GPS_LIGAR_EDEFAULT;

  /**
   * The default value of the '{@link #getBussolaLigar() <em>Bussola Ligar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBussolaLigar()
   * @generated
   * @ordered
   */
  protected static final String BUSSOLA_LIGAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBussolaLigar() <em>Bussola Ligar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBussolaLigar()
   * @generated
   * @ordered
   */
  protected String bussolaLigar = BUSSOLA_LIGAR_EDEFAULT;

  /**
   * The default value of the '{@link #getCameraLigar() <em>Camera Ligar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCameraLigar()
   * @generated
   * @ordered
   */
  protected static final String CAMERA_LIGAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCameraLigar() <em>Camera Ligar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCameraLigar()
   * @generated
   * @ordered
   */
  protected String cameraLigar = CAMERA_LIGAR_EDEFAULT;

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
   * The default value of the '{@link #getInicializarPlayer() <em>Inicializar Player</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInicializarPlayer()
   * @generated
   * @ordered
   */
  protected static final String INICIALIZAR_PLAYER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInicializarPlayer() <em>Inicializar Player</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInicializarPlayer()
   * @generated
   * @ordered
   */
  protected String inicializarPlayer = INICIALIZAR_PLAYER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected inicializacaoSensorImpl()
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
    return MultiplosdestinosPackage.Literals.INICIALIZACAO_SENSOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGpsLigar()
  {
    return gpsLigar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGpsLigar(String newGpsLigar)
  {
    String oldGpsLigar = gpsLigar;
    gpsLigar = newGpsLigar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.INICIALIZACAO_SENSOR__GPS_LIGAR, oldGpsLigar, gpsLigar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBussolaLigar()
  {
    return bussolaLigar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBussolaLigar(String newBussolaLigar)
  {
    String oldBussolaLigar = bussolaLigar;
    bussolaLigar = newBussolaLigar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.INICIALIZACAO_SENSOR__BUSSOLA_LIGAR, oldBussolaLigar, bussolaLigar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCameraLigar()
  {
    return cameraLigar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCameraLigar(String newCameraLigar)
  {
    String oldCameraLigar = cameraLigar;
    cameraLigar = newCameraLigar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CAMERA_LIGAR, oldCameraLigar, cameraLigar));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS, oldCarregarListaCoordenadas, carregarListaCoordenadas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInicializarPlayer()
  {
    return inicializarPlayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInicializarPlayer(String newInicializarPlayer)
  {
    String oldInicializarPlayer = inicializarPlayer;
    inicializarPlayer = newInicializarPlayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER, oldInicializarPlayer, inicializarPlayer));
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
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__GPS_LIGAR:
        return getGpsLigar();
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__BUSSOLA_LIGAR:
        return getBussolaLigar();
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CAMERA_LIGAR:
        return getCameraLigar();
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS:
        return getCarregarListaCoordenadas();
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER:
        return getInicializarPlayer();
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
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__GPS_LIGAR:
        setGpsLigar((String)newValue);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__BUSSOLA_LIGAR:
        setBussolaLigar((String)newValue);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CAMERA_LIGAR:
        setCameraLigar((String)newValue);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS:
        setCarregarListaCoordenadas((String)newValue);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER:
        setInicializarPlayer((String)newValue);
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
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__GPS_LIGAR:
        setGpsLigar(GPS_LIGAR_EDEFAULT);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__BUSSOLA_LIGAR:
        setBussolaLigar(BUSSOLA_LIGAR_EDEFAULT);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CAMERA_LIGAR:
        setCameraLigar(CAMERA_LIGAR_EDEFAULT);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS:
        setCarregarListaCoordenadas(CARREGAR_LISTA_COORDENADAS_EDEFAULT);
        return;
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER:
        setInicializarPlayer(INICIALIZAR_PLAYER_EDEFAULT);
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
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__GPS_LIGAR:
        return GPS_LIGAR_EDEFAULT == null ? gpsLigar != null : !GPS_LIGAR_EDEFAULT.equals(gpsLigar);
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__BUSSOLA_LIGAR:
        return BUSSOLA_LIGAR_EDEFAULT == null ? bussolaLigar != null : !BUSSOLA_LIGAR_EDEFAULT.equals(bussolaLigar);
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CAMERA_LIGAR:
        return CAMERA_LIGAR_EDEFAULT == null ? cameraLigar != null : !CAMERA_LIGAR_EDEFAULT.equals(cameraLigar);
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS:
        return CARREGAR_LISTA_COORDENADAS_EDEFAULT == null ? carregarListaCoordenadas != null : !CARREGAR_LISTA_COORDENADAS_EDEFAULT.equals(carregarListaCoordenadas);
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER:
        return INICIALIZAR_PLAYER_EDEFAULT == null ? inicializarPlayer != null : !INICIALIZAR_PLAYER_EDEFAULT.equals(inicializarPlayer);
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
    result.append(" (gpsLigar: ");
    result.append(gpsLigar);
    result.append(", bussolaLigar: ");
    result.append(bussolaLigar);
    result.append(", cameraLigar: ");
    result.append(cameraLigar);
    result.append(", carregarListaCoordenadas: ");
    result.append(carregarListaCoordenadas);
    result.append(", inicializarPlayer: ");
    result.append(inicializarPlayer);
    result.append(')');
    return result.toString();
  }

} //inicializacaoSensorImpl
