/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosFactory
 * @model kind="package"
 * @generated
 */
public interface MultiplosdestinosPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "multiplosdestinos";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/lrm/Multiplosdestinos";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "multiplosdestinos";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MultiplosdestinosPackage eINSTANCE = org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl <em>Modelo Robo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getModeloRobo()
   * @generated
   */
  int MODELO_ROBO = 0;

  /**
   * The feature id for the '<em><b>Plataforma</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO__PLATAFORMA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO__NAME = 1;

  /**
   * The feature id for the '<em><b>Cabecalho</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO__CABECALHO = 2;

  /**
   * The feature id for the '<em><b>Pacote</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO__PACOTE = 3;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO__SENSOR = 4;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO__MAIN = 5;

  /**
   * The number of structural features of the '<em>Modelo Robo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_ROBO_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.PlataformaImpl <em>Plataforma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.PlataformaImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getPlataforma()
   * @generated
   */
  int PLATAFORMA = 1;

  /**
   * The number of structural features of the '<em>Plataforma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATAFORMA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.nomeDaPlataformaImpl <em>nome Da Plataforma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.nomeDaPlataformaImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getnomeDaPlataforma()
   * @generated
   */
  int NOME_DA_PLATAFORMA = 2;

  /**
   * The feature id for the '<em><b>Plat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOME_DA_PLATAFORMA__PLAT = PLATAFORMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>nome Da Plataforma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOME_DA_PLATAFORMA_FEATURE_COUNT = PLATAFORMA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.CabecalhoImpl <em>Cabecalho</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.CabecalhoImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getCabecalho()
   * @generated
   */
  int CABECALHO = 3;

  /**
   * The feature id for the '<em><b>Itens Cabecalho</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECALHO__ITENS_CABECALHO = 0;

  /**
   * The number of structural features of the '<em>Cabecalho</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECALHO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.PacoteImpl <em>Pacote</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.PacoteImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getPacote()
   * @generated
   */
  int PACOTE = 4;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACOTE__TIPO = 0;

  /**
   * The number of structural features of the '<em>Pacote</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACOTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.SensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.SensorImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 5;

  /**
   * The feature id for the '<em><b>Tipo Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__TIPO_SENSOR = 0;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.MainImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getMain()
   * @generated
   */
  int MAIN = 6;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl <em>loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.loopImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getloop()
   * @generated
   */
  int LOOP = 7;

  /**
   * The feature id for the '<em><b>Ini Sensor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__INI_SENSOR = MAIN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>W</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__W = MAIN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>En</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__EN = MAIN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Proc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__PROC = MAIN_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__COMP = MAIN_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ac</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__AC = MAIN_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = MAIN_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl <em>inicializacao Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getinicializacaoSensor()
   * @generated
   */
  int INICIALIZACAO_SENSOR = 8;

  /**
   * The feature id for the '<em><b>Gps Ligar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIALIZACAO_SENSOR__GPS_LIGAR = 0;

  /**
   * The feature id for the '<em><b>Bussola Ligar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIALIZACAO_SENSOR__BUSSOLA_LIGAR = 1;

  /**
   * The feature id for the '<em><b>Camera Ligar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIALIZACAO_SENSOR__CAMERA_LIGAR = 2;

  /**
   * The feature id for the '<em><b>Carregar Lista Coordenadas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS = 3;

  /**
   * The feature id for the '<em><b>Inicializar Player</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER = 4;

  /**
   * The number of structural features of the '<em>inicializacao Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIALIZACAO_SENSOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl <em>entrada</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.entradaImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getentrada()
   * @generated
   */
  int ENTRADA = 9;

  /**
   * The feature id for the '<em><b>Gps Ler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA__GPS_LER = 0;

  /**
   * The feature id for the '<em><b>Bussola Ler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA__BUSSOLA_LER = 1;

  /**
   * The feature id for the '<em><b>Camera Ler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA__CAMERA_LER = 2;

  /**
   * The feature id for the '<em><b>Receber Coordenada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA__RECEBER_COORDENADA = 3;

  /**
   * The feature id for the '<em><b>Carregar Lista Coordenadas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA__CARREGAR_LISTA_COORDENADAS = 4;

  /**
   * The number of structural features of the '<em>entrada</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRADA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.processamentoImpl <em>processamento</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.processamentoImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getprocessamento()
   * @generated
   */
  int PROCESSAMENTO = 10;

  /**
   * The feature id for the '<em><b>Processa Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSAMENTO__PROCESSA_INFO = 0;

  /**
   * The feature id for the '<em><b>Processa Imagem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSAMENTO__PROCESSA_IMAGEM = 1;

  /**
   * The number of structural features of the '<em>processamento</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSAMENTO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.acaoImpl <em>acao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.acaoImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getacao()
   * @generated
   */
  int ACAO = 11;

  /**
   * The number of structural features of the '<em>acao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACAO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl <em>comportamento</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getcomportamento()
   * @generated
   */
  int COMPORTAMENTO = 12;

  /**
   * The feature id for the '<em><b>Define Regra</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPORTAMENTO__DEFINE_REGRA = 0;

  /**
   * The feature id for the '<em><b>Define Regra Seguir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPORTAMENTO__DEFINE_REGRA_SEGUIR = 1;

  /**
   * The feature id for the '<em><b>Define Regra Nao Bater</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPORTAMENTO__DEFINE_REGRA_NAO_BATER = 2;

  /**
   * The feature id for the '<em><b>Define Regra Seguir Multiplas Coordenadas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS = 3;

  /**
   * The number of structural features of the '<em>comportamento</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPORTAMENTO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.lrm.multiplosdestinos.impl.andarImpl <em>andar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.lrm.multiplosdestinos.impl.andarImpl
   * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getandar()
   * @generated
   */
  int ANDAR = 13;

  /**
   * The feature id for the '<em><b>Andar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDAR__ANDAR = ACAO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>andar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDAR_FEATURE_COUNT = ACAO_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo <em>Modelo Robo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modelo Robo</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo
   * @generated
   */
  EClass getModeloRobo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getPlataforma <em>Plataforma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plataforma</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo#getPlataforma()
   * @see #getModeloRobo()
   * @generated
   */
  EReference getModeloRobo_Plataforma();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo#getName()
   * @see #getModeloRobo()
   * @generated
   */
  EAttribute getModeloRobo_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getCabecalho <em>Cabecalho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cabecalho</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo#getCabecalho()
   * @see #getModeloRobo()
   * @generated
   */
  EReference getModeloRobo_Cabecalho();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getPacote <em>Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pacote</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo#getPacote()
   * @see #getModeloRobo()
   * @generated
   */
  EReference getModeloRobo_Pacote();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sensor</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo#getSensor()
   * @see #getModeloRobo()
   * @generated
   */
  EReference getModeloRobo_Sensor();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main</em>'.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo#getMain()
   * @see #getModeloRobo()
   * @generated
   */
  EReference getModeloRobo_Main();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.Plataforma <em>Plataforma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plataforma</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Plataforma
   * @generated
   */
  EClass getPlataforma();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.nomeDaPlataforma <em>nome Da Plataforma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nome Da Plataforma</em>'.
   * @see org.xtext.lrm.multiplosdestinos.nomeDaPlataforma
   * @generated
   */
  EClass getnomeDaPlataforma();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.nomeDaPlataforma#getPlat <em>Plat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plat</em>'.
   * @see org.xtext.lrm.multiplosdestinos.nomeDaPlataforma#getPlat()
   * @see #getnomeDaPlataforma()
   * @generated
   */
  EAttribute getnomeDaPlataforma_Plat();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.Cabecalho <em>Cabecalho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cabecalho</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Cabecalho
   * @generated
   */
  EClass getCabecalho();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.Cabecalho#getItensCabecalho <em>Itens Cabecalho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Itens Cabecalho</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Cabecalho#getItensCabecalho()
   * @see #getCabecalho()
   * @generated
   */
  EAttribute getCabecalho_ItensCabecalho();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.Pacote <em>Pacote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pacote</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Pacote
   * @generated
   */
  EClass getPacote();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.Pacote#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Pacote#getTipo()
   * @see #getPacote()
   * @generated
   */
  EAttribute getPacote_Tipo();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Sensor
   * @generated
   */
  EClass getSensor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.Sensor#getTipoSensor <em>Tipo Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Sensor</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Sensor#getTipoSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_TipoSensor();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see org.xtext.lrm.multiplosdestinos.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.loop <em>loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>loop</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop
   * @generated
   */
  EClass getloop();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.loop#getIniSensor <em>Ini Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ini Sensor</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop#getIniSensor()
   * @see #getloop()
   * @generated
   */
  EReference getloop_IniSensor();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.lrm.multiplosdestinos.loop#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>W</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop#getW()
   * @see #getloop()
   * @generated
   */
  EAttribute getloop_W();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.loop#getEn <em>En</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>En</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop#getEn()
   * @see #getloop()
   * @generated
   */
  EReference getloop_En();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.loop#getProc <em>Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proc</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop#getProc()
   * @see #getloop()
   * @generated
   */
  EReference getloop_Proc();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.loop#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comp</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop#getComp()
   * @see #getloop()
   * @generated
   */
  EReference getloop_Comp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.lrm.multiplosdestinos.loop#getAc <em>Ac</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ac</em>'.
   * @see org.xtext.lrm.multiplosdestinos.loop#getAc()
   * @see #getloop()
   * @generated
   */
  EReference getloop_Ac();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor <em>inicializacao Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>inicializacao Sensor</em>'.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor
   * @generated
   */
  EClass getinicializacaoSensor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getGpsLigar <em>Gps Ligar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gps Ligar</em>'.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getGpsLigar()
   * @see #getinicializacaoSensor()
   * @generated
   */
  EAttribute getinicializacaoSensor_GpsLigar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getBussolaLigar <em>Bussola Ligar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bussola Ligar</em>'.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getBussolaLigar()
   * @see #getinicializacaoSensor()
   * @generated
   */
  EAttribute getinicializacaoSensor_BussolaLigar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getCameraLigar <em>Camera Ligar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Camera Ligar</em>'.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getCameraLigar()
   * @see #getinicializacaoSensor()
   * @generated
   */
  EAttribute getinicializacaoSensor_CameraLigar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getCarregarListaCoordenadas <em>Carregar Lista Coordenadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carregar Lista Coordenadas</em>'.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getCarregarListaCoordenadas()
   * @see #getinicializacaoSensor()
   * @generated
   */
  EAttribute getinicializacaoSensor_CarregarListaCoordenadas();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getInicializarPlayer <em>Inicializar Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inicializar Player</em>'.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor#getInicializarPlayer()
   * @see #getinicializacaoSensor()
   * @generated
   */
  EAttribute getinicializacaoSensor_InicializarPlayer();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.entrada <em>entrada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>entrada</em>'.
   * @see org.xtext.lrm.multiplosdestinos.entrada
   * @generated
   */
  EClass getentrada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.entrada#getGpsLer <em>Gps Ler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gps Ler</em>'.
   * @see org.xtext.lrm.multiplosdestinos.entrada#getGpsLer()
   * @see #getentrada()
   * @generated
   */
  EAttribute getentrada_GpsLer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.entrada#getBussolaLer <em>Bussola Ler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bussola Ler</em>'.
   * @see org.xtext.lrm.multiplosdestinos.entrada#getBussolaLer()
   * @see #getentrada()
   * @generated
   */
  EAttribute getentrada_BussolaLer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.entrada#getCameraLer <em>Camera Ler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Camera Ler</em>'.
   * @see org.xtext.lrm.multiplosdestinos.entrada#getCameraLer()
   * @see #getentrada()
   * @generated
   */
  EAttribute getentrada_CameraLer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.entrada#getReceberCoordenada <em>Receber Coordenada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receber Coordenada</em>'.
   * @see org.xtext.lrm.multiplosdestinos.entrada#getReceberCoordenada()
   * @see #getentrada()
   * @generated
   */
  EAttribute getentrada_ReceberCoordenada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.entrada#getCarregarListaCoordenadas <em>Carregar Lista Coordenadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carregar Lista Coordenadas</em>'.
   * @see org.xtext.lrm.multiplosdestinos.entrada#getCarregarListaCoordenadas()
   * @see #getentrada()
   * @generated
   */
  EAttribute getentrada_CarregarListaCoordenadas();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.processamento <em>processamento</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>processamento</em>'.
   * @see org.xtext.lrm.multiplosdestinos.processamento
   * @generated
   */
  EClass getprocessamento();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.processamento#getProcessaInfo <em>Processa Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processa Info</em>'.
   * @see org.xtext.lrm.multiplosdestinos.processamento#getProcessaInfo()
   * @see #getprocessamento()
   * @generated
   */
  EAttribute getprocessamento_ProcessaInfo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.processamento#getProcessaImagem <em>Processa Imagem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processa Imagem</em>'.
   * @see org.xtext.lrm.multiplosdestinos.processamento#getProcessaImagem()
   * @see #getprocessamento()
   * @generated
   */
  EAttribute getprocessamento_ProcessaImagem();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.acao <em>acao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>acao</em>'.
   * @see org.xtext.lrm.multiplosdestinos.acao
   * @generated
   */
  EClass getacao();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.comportamento <em>comportamento</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>comportamento</em>'.
   * @see org.xtext.lrm.multiplosdestinos.comportamento
   * @generated
   */
  EClass getcomportamento();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegra <em>Define Regra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Define Regra</em>'.
   * @see org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegra()
   * @see #getcomportamento()
   * @generated
   */
  EAttribute getcomportamento_DefineRegra();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegraSeguir <em>Define Regra Seguir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Define Regra Seguir</em>'.
   * @see org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegraSeguir()
   * @see #getcomportamento()
   * @generated
   */
  EAttribute getcomportamento_DefineRegraSeguir();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegraNaoBater <em>Define Regra Nao Bater</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Define Regra Nao Bater</em>'.
   * @see org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegraNaoBater()
   * @see #getcomportamento()
   * @generated
   */
  EAttribute getcomportamento_DefineRegraNaoBater();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegraSeguirMultiplasCoordenadas <em>Define Regra Seguir Multiplas Coordenadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Define Regra Seguir Multiplas Coordenadas</em>'.
   * @see org.xtext.lrm.multiplosdestinos.comportamento#getDefineRegraSeguirMultiplasCoordenadas()
   * @see #getcomportamento()
   * @generated
   */
  EAttribute getcomportamento_DefineRegraSeguirMultiplasCoordenadas();

  /**
   * Returns the meta object for class '{@link org.xtext.lrm.multiplosdestinos.andar <em>andar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>andar</em>'.
   * @see org.xtext.lrm.multiplosdestinos.andar
   * @generated
   */
  EClass getandar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.lrm.multiplosdestinos.andar#getAndar <em>Andar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Andar</em>'.
   * @see org.xtext.lrm.multiplosdestinos.andar#getAndar()
   * @see #getandar()
   * @generated
   */
  EAttribute getandar_Andar();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MultiplosdestinosFactory getMultiplosdestinosFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl <em>Modelo Robo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.ModeloRoboImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getModeloRobo()
     * @generated
     */
    EClass MODELO_ROBO = eINSTANCE.getModeloRobo();

    /**
     * The meta object literal for the '<em><b>Plataforma</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELO_ROBO__PLATAFORMA = eINSTANCE.getModeloRobo_Plataforma();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODELO_ROBO__NAME = eINSTANCE.getModeloRobo_Name();

    /**
     * The meta object literal for the '<em><b>Cabecalho</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELO_ROBO__CABECALHO = eINSTANCE.getModeloRobo_Cabecalho();

    /**
     * The meta object literal for the '<em><b>Pacote</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELO_ROBO__PACOTE = eINSTANCE.getModeloRobo_Pacote();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELO_ROBO__SENSOR = eINSTANCE.getModeloRobo_Sensor();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELO_ROBO__MAIN = eINSTANCE.getModeloRobo_Main();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.PlataformaImpl <em>Plataforma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.PlataformaImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getPlataforma()
     * @generated
     */
    EClass PLATAFORMA = eINSTANCE.getPlataforma();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.nomeDaPlataformaImpl <em>nome Da Plataforma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.nomeDaPlataformaImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getnomeDaPlataforma()
     * @generated
     */
    EClass NOME_DA_PLATAFORMA = eINSTANCE.getnomeDaPlataforma();

    /**
     * The meta object literal for the '<em><b>Plat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOME_DA_PLATAFORMA__PLAT = eINSTANCE.getnomeDaPlataforma_Plat();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.CabecalhoImpl <em>Cabecalho</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.CabecalhoImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getCabecalho()
     * @generated
     */
    EClass CABECALHO = eINSTANCE.getCabecalho();

    /**
     * The meta object literal for the '<em><b>Itens Cabecalho</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CABECALHO__ITENS_CABECALHO = eINSTANCE.getCabecalho_ItensCabecalho();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.PacoteImpl <em>Pacote</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.PacoteImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getPacote()
     * @generated
     */
    EClass PACOTE = eINSTANCE.getPacote();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACOTE__TIPO = eINSTANCE.getPacote_Tipo();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.SensorImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getSensor()
     * @generated
     */
    EClass SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '<em><b>Tipo Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__TIPO_SENSOR = eINSTANCE.getSensor_TipoSensor();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.MainImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.loopImpl <em>loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.loopImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getloop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getloop();

    /**
     * The meta object literal for the '<em><b>Ini Sensor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__INI_SENSOR = eINSTANCE.getloop_IniSensor();

    /**
     * The meta object literal for the '<em><b>W</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP__W = eINSTANCE.getloop_W();

    /**
     * The meta object literal for the '<em><b>En</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__EN = eINSTANCE.getloop_En();

    /**
     * The meta object literal for the '<em><b>Proc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__PROC = eINSTANCE.getloop_Proc();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__COMP = eINSTANCE.getloop_Comp();

    /**
     * The meta object literal for the '<em><b>Ac</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__AC = eINSTANCE.getloop_Ac();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl <em>inicializacao Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.inicializacaoSensorImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getinicializacaoSensor()
     * @generated
     */
    EClass INICIALIZACAO_SENSOR = eINSTANCE.getinicializacaoSensor();

    /**
     * The meta object literal for the '<em><b>Gps Ligar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIALIZACAO_SENSOR__GPS_LIGAR = eINSTANCE.getinicializacaoSensor_GpsLigar();

    /**
     * The meta object literal for the '<em><b>Bussola Ligar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIALIZACAO_SENSOR__BUSSOLA_LIGAR = eINSTANCE.getinicializacaoSensor_BussolaLigar();

    /**
     * The meta object literal for the '<em><b>Camera Ligar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIALIZACAO_SENSOR__CAMERA_LIGAR = eINSTANCE.getinicializacaoSensor_CameraLigar();

    /**
     * The meta object literal for the '<em><b>Carregar Lista Coordenadas</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS = eINSTANCE.getinicializacaoSensor_CarregarListaCoordenadas();

    /**
     * The meta object literal for the '<em><b>Inicializar Player</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER = eINSTANCE.getinicializacaoSensor_InicializarPlayer();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.entradaImpl <em>entrada</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.entradaImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getentrada()
     * @generated
     */
    EClass ENTRADA = eINSTANCE.getentrada();

    /**
     * The meta object literal for the '<em><b>Gps Ler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRADA__GPS_LER = eINSTANCE.getentrada_GpsLer();

    /**
     * The meta object literal for the '<em><b>Bussola Ler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRADA__BUSSOLA_LER = eINSTANCE.getentrada_BussolaLer();

    /**
     * The meta object literal for the '<em><b>Camera Ler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRADA__CAMERA_LER = eINSTANCE.getentrada_CameraLer();

    /**
     * The meta object literal for the '<em><b>Receber Coordenada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRADA__RECEBER_COORDENADA = eINSTANCE.getentrada_ReceberCoordenada();

    /**
     * The meta object literal for the '<em><b>Carregar Lista Coordenadas</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRADA__CARREGAR_LISTA_COORDENADAS = eINSTANCE.getentrada_CarregarListaCoordenadas();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.processamentoImpl <em>processamento</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.processamentoImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getprocessamento()
     * @generated
     */
    EClass PROCESSAMENTO = eINSTANCE.getprocessamento();

    /**
     * The meta object literal for the '<em><b>Processa Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSAMENTO__PROCESSA_INFO = eINSTANCE.getprocessamento_ProcessaInfo();

    /**
     * The meta object literal for the '<em><b>Processa Imagem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSAMENTO__PROCESSA_IMAGEM = eINSTANCE.getprocessamento_ProcessaImagem();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.acaoImpl <em>acao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.acaoImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getacao()
     * @generated
     */
    EClass ACAO = eINSTANCE.getacao();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl <em>comportamento</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getcomportamento()
     * @generated
     */
    EClass COMPORTAMENTO = eINSTANCE.getcomportamento();

    /**
     * The meta object literal for the '<em><b>Define Regra</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPORTAMENTO__DEFINE_REGRA = eINSTANCE.getcomportamento_DefineRegra();

    /**
     * The meta object literal for the '<em><b>Define Regra Seguir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPORTAMENTO__DEFINE_REGRA_SEGUIR = eINSTANCE.getcomportamento_DefineRegraSeguir();

    /**
     * The meta object literal for the '<em><b>Define Regra Nao Bater</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPORTAMENTO__DEFINE_REGRA_NAO_BATER = eINSTANCE.getcomportamento_DefineRegraNaoBater();

    /**
     * The meta object literal for the '<em><b>Define Regra Seguir Multiplas Coordenadas</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS = eINSTANCE.getcomportamento_DefineRegraSeguirMultiplasCoordenadas();

    /**
     * The meta object literal for the '{@link org.xtext.lrm.multiplosdestinos.impl.andarImpl <em>andar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.lrm.multiplosdestinos.impl.andarImpl
     * @see org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosPackageImpl#getandar()
     * @generated
     */
    EClass ANDAR = eINSTANCE.getandar();

    /**
     * The meta object literal for the '<em><b>Andar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANDAR__ANDAR = eINSTANCE.getandar_Andar();

  }

} //MultiplosdestinosPackage
