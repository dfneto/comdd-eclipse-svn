/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.lrm.multiplosdestinos.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplosdestinosFactoryImpl extends EFactoryImpl implements MultiplosdestinosFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplosdestinosFactory init()
  {
    try
    {
      MultiplosdestinosFactory theMultiplosdestinosFactory = (MultiplosdestinosFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/lrm/Multiplosdestinos"); 
      if (theMultiplosdestinosFactory != null)
      {
        return theMultiplosdestinosFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MultiplosdestinosFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplosdestinosFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MultiplosdestinosPackage.MODELO_ROBO: return createModeloRobo();
      case MultiplosdestinosPackage.PLATAFORMA: return createPlataforma();
      case MultiplosdestinosPackage.NOME_DA_PLATAFORMA: return createnomeDaPlataforma();
      case MultiplosdestinosPackage.CABECALHO: return createCabecalho();
      case MultiplosdestinosPackage.PACOTE: return createPacote();
      case MultiplosdestinosPackage.SENSOR: return createSensor();
      case MultiplosdestinosPackage.MAIN: return createMain();
      case MultiplosdestinosPackage.LOOP: return createloop();
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR: return createinicializacaoSensor();
      case MultiplosdestinosPackage.ENTRADA: return createentrada();
      case MultiplosdestinosPackage.PROCESSAMENTO: return createprocessamento();
      case MultiplosdestinosPackage.ACAO: return createacao();
      case MultiplosdestinosPackage.COMPORTAMENTO: return createcomportamento();
      case MultiplosdestinosPackage.ANDAR: return createandar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeloRobo createModeloRobo()
  {
    ModeloRoboImpl modeloRobo = new ModeloRoboImpl();
    return modeloRobo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plataforma createPlataforma()
  {
    PlataformaImpl plataforma = new PlataformaImpl();
    return plataforma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nomeDaPlataforma createnomeDaPlataforma()
  {
    nomeDaPlataformaImpl nomeDaPlataforma = new nomeDaPlataformaImpl();
    return nomeDaPlataforma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cabecalho createCabecalho()
  {
    CabecalhoImpl cabecalho = new CabecalhoImpl();
    return cabecalho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pacote createPacote()
  {
    PacoteImpl pacote = new PacoteImpl();
    return pacote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public loop createloop()
  {
    loopImpl loop = new loopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inicializacaoSensor createinicializacaoSensor()
  {
    inicializacaoSensorImpl inicializacaoSensor = new inicializacaoSensorImpl();
    return inicializacaoSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public entrada createentrada()
  {
    entradaImpl entrada = new entradaImpl();
    return entrada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public processamento createprocessamento()
  {
    processamentoImpl processamento = new processamentoImpl();
    return processamento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public acao createacao()
  {
    acaoImpl acao = new acaoImpl();
    return acao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public comportamento createcomportamento()
  {
    comportamentoImpl comportamento = new comportamentoImpl();
    return comportamento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public andar createandar()
  {
    andarImpl andar = new andarImpl();
    return andar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplosdestinosPackage getMultiplosdestinosPackage()
  {
    return (MultiplosdestinosPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MultiplosdestinosPackage getPackage()
  {
    return MultiplosdestinosPackage.eINSTANCE;
  }

} //MultiplosdestinosFactoryImpl
