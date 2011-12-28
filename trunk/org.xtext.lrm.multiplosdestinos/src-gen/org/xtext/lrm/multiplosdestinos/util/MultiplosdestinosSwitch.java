/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.xtext.lrm.multiplosdestinos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage
 * @generated
 */
public class MultiplosdestinosSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MultiplosdestinosPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplosdestinosSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MultiplosdestinosPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MultiplosdestinosPackage.MODELO_ROBO:
      {
        ModeloRobo modeloRobo = (ModeloRobo)theEObject;
        T result = caseModeloRobo(modeloRobo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.PLATAFORMA:
      {
        Plataforma plataforma = (Plataforma)theEObject;
        T result = casePlataforma(plataforma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.NOME_DA_PLATAFORMA:
      {
        nomeDaPlataforma nomeDaPlataforma = (nomeDaPlataforma)theEObject;
        T result = casenomeDaPlataforma(nomeDaPlataforma);
        if (result == null) result = casePlataforma(nomeDaPlataforma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.CABECALHO:
      {
        Cabecalho cabecalho = (Cabecalho)theEObject;
        T result = caseCabecalho(cabecalho);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.PACOTE:
      {
        Pacote pacote = (Pacote)theEObject;
        T result = casePacote(pacote);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.SENSOR:
      {
        Sensor sensor = (Sensor)theEObject;
        T result = caseSensor(sensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.MAIN:
      {
        Main main = (Main)theEObject;
        T result = caseMain(main);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.LOOP:
      {
        loop loop = (loop)theEObject;
        T result = caseloop(loop);
        if (result == null) result = caseMain(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.INICIALIZACAO_SENSOR:
      {
        inicializacaoSensor inicializacaoSensor = (inicializacaoSensor)theEObject;
        T result = caseinicializacaoSensor(inicializacaoSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.ENTRADA:
      {
        entrada entrada = (entrada)theEObject;
        T result = caseentrada(entrada);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.PROCESSAMENTO:
      {
        processamento processamento = (processamento)theEObject;
        T result = caseprocessamento(processamento);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.ACAO:
      {
        acao acao = (acao)theEObject;
        T result = caseacao(acao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.COMPORTAMENTO:
      {
        comportamento comportamento = (comportamento)theEObject;
        T result = casecomportamento(comportamento);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MultiplosdestinosPackage.ANDAR:
      {
        andar andar = (andar)theEObject;
        T result = caseandar(andar);
        if (result == null) result = caseacao(andar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modelo Robo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modelo Robo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModeloRobo(ModeloRobo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plataforma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plataforma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlataforma(Plataforma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nome Da Plataforma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nome Da Plataforma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenomeDaPlataforma(nomeDaPlataforma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cabecalho</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cabecalho</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCabecalho(Cabecalho object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pacote</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pacote</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePacote(Pacote object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensor(Sensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMain(Main object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseloop(loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>inicializacao Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>inicializacao Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinicializacaoSensor(inicializacaoSensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>entrada</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>entrada</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseentrada(entrada object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>processamento</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>processamento</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprocessamento(processamento object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>acao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>acao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseacao(acao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>comportamento</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>comportamento</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomportamento(comportamento object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>andar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>andar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseandar(andar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MultiplosdestinosSwitch
