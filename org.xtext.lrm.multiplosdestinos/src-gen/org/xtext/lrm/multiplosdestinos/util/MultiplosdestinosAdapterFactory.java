/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.lrm.multiplosdestinos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage
 * @generated
 */
public class MultiplosdestinosAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MultiplosdestinosPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplosdestinosAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MultiplosdestinosPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplosdestinosSwitch<Adapter> modelSwitch =
    new MultiplosdestinosSwitch<Adapter>()
    {
      @Override
      public Adapter caseModeloRobo(ModeloRobo object)
      {
        return createModeloRoboAdapter();
      }
      @Override
      public Adapter casePlataforma(Plataforma object)
      {
        return createPlataformaAdapter();
      }
      @Override
      public Adapter casenomeDaPlataforma(nomeDaPlataforma object)
      {
        return createnomeDaPlataformaAdapter();
      }
      @Override
      public Adapter caseCabecalho(Cabecalho object)
      {
        return createCabecalhoAdapter();
      }
      @Override
      public Adapter casePacote(Pacote object)
      {
        return createPacoteAdapter();
      }
      @Override
      public Adapter caseSensor(Sensor object)
      {
        return createSensorAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter caseloop(loop object)
      {
        return createloopAdapter();
      }
      @Override
      public Adapter caseinicializacaoSensor(inicializacaoSensor object)
      {
        return createinicializacaoSensorAdapter();
      }
      @Override
      public Adapter caseentrada(entrada object)
      {
        return createentradaAdapter();
      }
      @Override
      public Adapter caseprocessamento(processamento object)
      {
        return createprocessamentoAdapter();
      }
      @Override
      public Adapter caseacao(acao object)
      {
        return createacaoAdapter();
      }
      @Override
      public Adapter casecomportamento(comportamento object)
      {
        return createcomportamentoAdapter();
      }
      @Override
      public Adapter caseandar(andar object)
      {
        return createandarAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo <em>Modelo Robo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.ModeloRobo
   * @generated
   */
  public Adapter createModeloRoboAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.Plataforma <em>Plataforma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.Plataforma
   * @generated
   */
  public Adapter createPlataformaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.nomeDaPlataforma <em>nome Da Plataforma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.nomeDaPlataforma
   * @generated
   */
  public Adapter createnomeDaPlataformaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.Cabecalho <em>Cabecalho</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.Cabecalho
   * @generated
   */
  public Adapter createCabecalhoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.Pacote <em>Pacote</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.Pacote
   * @generated
   */
  public Adapter createPacoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.Sensor
   * @generated
   */
  public Adapter createSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.loop <em>loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.loop
   * @generated
   */
  public Adapter createloopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor <em>inicializacao Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.inicializacaoSensor
   * @generated
   */
  public Adapter createinicializacaoSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.entrada <em>entrada</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.entrada
   * @generated
   */
  public Adapter createentradaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.processamento <em>processamento</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.processamento
   * @generated
   */
  public Adapter createprocessamentoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.acao <em>acao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.acao
   * @generated
   */
  public Adapter createacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.comportamento <em>comportamento</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.comportamento
   * @generated
   */
  public Adapter createcomportamentoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.lrm.multiplosdestinos.andar <em>andar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.lrm.multiplosdestinos.andar
   * @generated
   */
  public Adapter createandarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MultiplosdestinosAdapterFactory
