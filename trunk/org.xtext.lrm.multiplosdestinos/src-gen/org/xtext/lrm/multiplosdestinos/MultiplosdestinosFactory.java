/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage
 * @generated
 */
public interface MultiplosdestinosFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MultiplosdestinosFactory eINSTANCE = org.xtext.lrm.multiplosdestinos.impl.MultiplosdestinosFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Modelo Robo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modelo Robo</em>'.
   * @generated
   */
  ModeloRobo createModeloRobo();

  /**
   * Returns a new object of class '<em>Plataforma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plataforma</em>'.
   * @generated
   */
  Plataforma createPlataforma();

  /**
   * Returns a new object of class '<em>nome Da Plataforma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nome Da Plataforma</em>'.
   * @generated
   */
  nomeDaPlataforma createnomeDaPlataforma();

  /**
   * Returns a new object of class '<em>Cabecalho</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cabecalho</em>'.
   * @generated
   */
  Cabecalho createCabecalho();

  /**
   * Returns a new object of class '<em>Pacote</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pacote</em>'.
   * @generated
   */
  Pacote createPacote();

  /**
   * Returns a new object of class '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor</em>'.
   * @generated
   */
  Sensor createSensor();

  /**
   * Returns a new object of class '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main</em>'.
   * @generated
   */
  Main createMain();

  /**
   * Returns a new object of class '<em>loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>loop</em>'.
   * @generated
   */
  loop createloop();

  /**
   * Returns a new object of class '<em>inicializacao Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>inicializacao Sensor</em>'.
   * @generated
   */
  inicializacaoSensor createinicializacaoSensor();

  /**
   * Returns a new object of class '<em>entrada</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>entrada</em>'.
   * @generated
   */
  entrada createentrada();

  /**
   * Returns a new object of class '<em>processamento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>processamento</em>'.
   * @generated
   */
  processamento createprocessamento();

  /**
   * Returns a new object of class '<em>acao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>acao</em>'.
   * @generated
   */
  acao createacao();

  /**
   * Returns a new object of class '<em>comportamento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>comportamento</em>'.
   * @generated
   */
  comportamento createcomportamento();

  /**
   * Returns a new object of class '<em>andar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>andar</em>'.
   * @generated
   */
  andar createandar();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MultiplosdestinosPackage getMultiplosdestinosPackage();

} //MultiplosdestinosFactory
