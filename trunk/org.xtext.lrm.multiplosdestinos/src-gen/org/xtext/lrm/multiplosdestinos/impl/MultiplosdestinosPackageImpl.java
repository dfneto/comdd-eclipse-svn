/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.lrm.multiplosdestinos.Cabecalho;
import org.xtext.lrm.multiplosdestinos.Main;
import org.xtext.lrm.multiplosdestinos.ModeloRobo;
import org.xtext.lrm.multiplosdestinos.MultiplosdestinosFactory;
import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;
import org.xtext.lrm.multiplosdestinos.Pacote;
import org.xtext.lrm.multiplosdestinos.Plataforma;
import org.xtext.lrm.multiplosdestinos.Sensor;
import org.xtext.lrm.multiplosdestinos.acao;
import org.xtext.lrm.multiplosdestinos.andar;
import org.xtext.lrm.multiplosdestinos.comportamento;
import org.xtext.lrm.multiplosdestinos.entrada;
import org.xtext.lrm.multiplosdestinos.inicializacaoSensor;
import org.xtext.lrm.multiplosdestinos.loop;
import org.xtext.lrm.multiplosdestinos.nomeDaPlataforma;
import org.xtext.lrm.multiplosdestinos.processamento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplosdestinosPackageImpl extends EPackageImpl implements MultiplosdestinosPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeloRoboEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plataformaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nomeDaPlataformaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cabecalhoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pacoteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inicializacaoSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entradaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processamentoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comportamentoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andarEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MultiplosdestinosPackageImpl()
  {
    super(eNS_URI, MultiplosdestinosFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MultiplosdestinosPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MultiplosdestinosPackage init()
  {
    if (isInited) return (MultiplosdestinosPackage)EPackage.Registry.INSTANCE.getEPackage(MultiplosdestinosPackage.eNS_URI);

    // Obtain or create and register package
    MultiplosdestinosPackageImpl theMultiplosdestinosPackage = (MultiplosdestinosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MultiplosdestinosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MultiplosdestinosPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMultiplosdestinosPackage.createPackageContents();

    // Initialize created meta-data
    theMultiplosdestinosPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMultiplosdestinosPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MultiplosdestinosPackage.eNS_URI, theMultiplosdestinosPackage);
    return theMultiplosdestinosPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeloRobo()
  {
    return modeloRoboEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeloRobo_Plataforma()
  {
    return (EReference)modeloRoboEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModeloRobo_Name()
  {
    return (EAttribute)modeloRoboEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeloRobo_Cabecalho()
  {
    return (EReference)modeloRoboEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeloRobo_Pacote()
  {
    return (EReference)modeloRoboEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeloRobo_Sensor()
  {
    return (EReference)modeloRoboEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeloRobo_Main()
  {
    return (EReference)modeloRoboEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlataforma()
  {
    return plataformaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnomeDaPlataforma()
  {
    return nomeDaPlataformaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnomeDaPlataforma_Plat()
  {
    return (EAttribute)nomeDaPlataformaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCabecalho()
  {
    return cabecalhoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCabecalho_ItensCabecalho()
  {
    return (EAttribute)cabecalhoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPacote()
  {
    return pacoteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPacote_Tipo()
  {
    return (EAttribute)pacoteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensor()
  {
    return sensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensor_TipoSensor()
  {
    return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMain()
  {
    return mainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getloop()
  {
    return loopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloop_IniSensor()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getloop_W()
  {
    return (EAttribute)loopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloop_En()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloop_Proc()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloop_Comp()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloop_Ac()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinicializacaoSensor()
  {
    return inicializacaoSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinicializacaoSensor_GpsLigar()
  {
    return (EAttribute)inicializacaoSensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinicializacaoSensor_BussolaLigar()
  {
    return (EAttribute)inicializacaoSensorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinicializacaoSensor_CameraLigar()
  {
    return (EAttribute)inicializacaoSensorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinicializacaoSensor_CarregarListaCoordenadas()
  {
    return (EAttribute)inicializacaoSensorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinicializacaoSensor_InicializarPlayer()
  {
    return (EAttribute)inicializacaoSensorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getentrada()
  {
    return entradaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getentrada_GpsLer()
  {
    return (EAttribute)entradaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getentrada_BussolaLer()
  {
    return (EAttribute)entradaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getentrada_CameraLer()
  {
    return (EAttribute)entradaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getentrada_ReceberCoordenada()
  {
    return (EAttribute)entradaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getentrada_CarregarListaCoordenadas()
  {
    return (EAttribute)entradaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprocessamento()
  {
    return processamentoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprocessamento_ProcessaInfo()
  {
    return (EAttribute)processamentoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprocessamento_ProcessaImagem()
  {
    return (EAttribute)processamentoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getacao()
  {
    return acaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomportamento()
  {
    return comportamentoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomportamento_DefineRegra()
  {
    return (EAttribute)comportamentoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomportamento_DefineRegraSeguir()
  {
    return (EAttribute)comportamentoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomportamento_DefineRegraNaoBater()
  {
    return (EAttribute)comportamentoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomportamento_DefineRegraSeguirMultiplasCoordenadas()
  {
    return (EAttribute)comportamentoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getandar()
  {
    return andarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getandar_Andar()
  {
    return (EAttribute)andarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplosdestinosFactory getMultiplosdestinosFactory()
  {
    return (MultiplosdestinosFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modeloRoboEClass = createEClass(MODELO_ROBO);
    createEReference(modeloRoboEClass, MODELO_ROBO__PLATAFORMA);
    createEAttribute(modeloRoboEClass, MODELO_ROBO__NAME);
    createEReference(modeloRoboEClass, MODELO_ROBO__CABECALHO);
    createEReference(modeloRoboEClass, MODELO_ROBO__PACOTE);
    createEReference(modeloRoboEClass, MODELO_ROBO__SENSOR);
    createEReference(modeloRoboEClass, MODELO_ROBO__MAIN);

    plataformaEClass = createEClass(PLATAFORMA);

    nomeDaPlataformaEClass = createEClass(NOME_DA_PLATAFORMA);
    createEAttribute(nomeDaPlataformaEClass, NOME_DA_PLATAFORMA__PLAT);

    cabecalhoEClass = createEClass(CABECALHO);
    createEAttribute(cabecalhoEClass, CABECALHO__ITENS_CABECALHO);

    pacoteEClass = createEClass(PACOTE);
    createEAttribute(pacoteEClass, PACOTE__TIPO);

    sensorEClass = createEClass(SENSOR);
    createEAttribute(sensorEClass, SENSOR__TIPO_SENSOR);

    mainEClass = createEClass(MAIN);

    loopEClass = createEClass(LOOP);
    createEReference(loopEClass, LOOP__INI_SENSOR);
    createEAttribute(loopEClass, LOOP__W);
    createEReference(loopEClass, LOOP__EN);
    createEReference(loopEClass, LOOP__PROC);
    createEReference(loopEClass, LOOP__COMP);
    createEReference(loopEClass, LOOP__AC);

    inicializacaoSensorEClass = createEClass(INICIALIZACAO_SENSOR);
    createEAttribute(inicializacaoSensorEClass, INICIALIZACAO_SENSOR__GPS_LIGAR);
    createEAttribute(inicializacaoSensorEClass, INICIALIZACAO_SENSOR__BUSSOLA_LIGAR);
    createEAttribute(inicializacaoSensorEClass, INICIALIZACAO_SENSOR__CAMERA_LIGAR);
    createEAttribute(inicializacaoSensorEClass, INICIALIZACAO_SENSOR__CARREGAR_LISTA_COORDENADAS);
    createEAttribute(inicializacaoSensorEClass, INICIALIZACAO_SENSOR__INICIALIZAR_PLAYER);

    entradaEClass = createEClass(ENTRADA);
    createEAttribute(entradaEClass, ENTRADA__GPS_LER);
    createEAttribute(entradaEClass, ENTRADA__BUSSOLA_LER);
    createEAttribute(entradaEClass, ENTRADA__CAMERA_LER);
    createEAttribute(entradaEClass, ENTRADA__RECEBER_COORDENADA);
    createEAttribute(entradaEClass, ENTRADA__CARREGAR_LISTA_COORDENADAS);

    processamentoEClass = createEClass(PROCESSAMENTO);
    createEAttribute(processamentoEClass, PROCESSAMENTO__PROCESSA_INFO);
    createEAttribute(processamentoEClass, PROCESSAMENTO__PROCESSA_IMAGEM);

    acaoEClass = createEClass(ACAO);

    comportamentoEClass = createEClass(COMPORTAMENTO);
    createEAttribute(comportamentoEClass, COMPORTAMENTO__DEFINE_REGRA);
    createEAttribute(comportamentoEClass, COMPORTAMENTO__DEFINE_REGRA_SEGUIR);
    createEAttribute(comportamentoEClass, COMPORTAMENTO__DEFINE_REGRA_NAO_BATER);
    createEAttribute(comportamentoEClass, COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS);

    andarEClass = createEClass(ANDAR);
    createEAttribute(andarEClass, ANDAR__ANDAR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nomeDaPlataformaEClass.getESuperTypes().add(this.getPlataforma());
    loopEClass.getESuperTypes().add(this.getMain());
    andarEClass.getESuperTypes().add(this.getacao());

    // Initialize classes and features; add operations and parameters
    initEClass(modeloRoboEClass, ModeloRobo.class, "ModeloRobo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModeloRobo_Plataforma(), this.getPlataforma(), null, "plataforma", null, 0, -1, ModeloRobo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModeloRobo_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModeloRobo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeloRobo_Cabecalho(), this.getCabecalho(), null, "cabecalho", null, 0, -1, ModeloRobo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeloRobo_Pacote(), this.getPacote(), null, "pacote", null, 0, -1, ModeloRobo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeloRobo_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, ModeloRobo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeloRobo_Main(), this.getMain(), null, "main", null, 0, -1, ModeloRobo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plataformaEClass, Plataforma.class, "Plataforma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nomeDaPlataformaEClass, nomeDaPlataforma.class, "nomeDaPlataforma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnomeDaPlataforma_Plat(), ecorePackage.getEString(), "plat", null, 0, 1, nomeDaPlataforma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cabecalhoEClass, Cabecalho.class, "Cabecalho", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCabecalho_ItensCabecalho(), ecorePackage.getEString(), "itensCabecalho", null, 0, 1, Cabecalho.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pacoteEClass, Pacote.class, "Pacote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPacote_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Pacote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSensor_TipoSensor(), ecorePackage.getEString(), "tipoSensor", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loopEClass, loop.class, "loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getloop_IniSensor(), this.getinicializacaoSensor(), null, "iniSensor", null, 0, -1, loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getloop_W(), ecorePackage.getEString(), "w", null, 0, -1, loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getloop_En(), this.getentrada(), null, "en", null, 0, -1, loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getloop_Proc(), this.getprocessamento(), null, "proc", null, 0, -1, loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getloop_Comp(), this.getcomportamento(), null, "comp", null, 0, -1, loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getloop_Ac(), this.getacao(), null, "ac", null, 0, -1, loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inicializacaoSensorEClass, inicializacaoSensor.class, "inicializacaoSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinicializacaoSensor_GpsLigar(), ecorePackage.getEString(), "gpsLigar", null, 0, 1, inicializacaoSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinicializacaoSensor_BussolaLigar(), ecorePackage.getEString(), "bussolaLigar", null, 0, 1, inicializacaoSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinicializacaoSensor_CameraLigar(), ecorePackage.getEString(), "cameraLigar", null, 0, 1, inicializacaoSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinicializacaoSensor_CarregarListaCoordenadas(), ecorePackage.getEString(), "carregarListaCoordenadas", null, 0, 1, inicializacaoSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinicializacaoSensor_InicializarPlayer(), ecorePackage.getEString(), "inicializarPlayer", null, 0, 1, inicializacaoSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entradaEClass, entrada.class, "entrada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getentrada_GpsLer(), ecorePackage.getEString(), "gpsLer", null, 0, 1, entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getentrada_BussolaLer(), ecorePackage.getEString(), "bussolaLer", null, 0, 1, entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getentrada_CameraLer(), ecorePackage.getEString(), "cameraLer", null, 0, 1, entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getentrada_ReceberCoordenada(), ecorePackage.getEString(), "receberCoordenada", null, 0, 1, entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getentrada_CarregarListaCoordenadas(), ecorePackage.getEString(), "carregarListaCoordenadas", null, 0, 1, entrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processamentoEClass, processamento.class, "processamento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprocessamento_ProcessaInfo(), ecorePackage.getEString(), "processaInfo", null, 0, 1, processamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getprocessamento_ProcessaImagem(), ecorePackage.getEString(), "processaImagem", null, 0, 1, processamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acaoEClass, acao.class, "acao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comportamentoEClass, comportamento.class, "comportamento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcomportamento_DefineRegra(), ecorePackage.getEString(), "defineRegra", null, 0, 1, comportamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomportamento_DefineRegraSeguir(), ecorePackage.getEString(), "defineRegraSeguir", null, 0, 1, comportamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomportamento_DefineRegraNaoBater(), ecorePackage.getEString(), "defineRegraNaoBater", null, 0, 1, comportamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomportamento_DefineRegraSeguirMultiplasCoordenadas(), ecorePackage.getEString(), "defineRegraSeguirMultiplasCoordenadas", null, 0, 1, comportamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andarEClass, andar.class, "andar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getandar_Andar(), ecorePackage.getEString(), "andar", null, 0, 1, andar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MultiplosdestinosPackageImpl
