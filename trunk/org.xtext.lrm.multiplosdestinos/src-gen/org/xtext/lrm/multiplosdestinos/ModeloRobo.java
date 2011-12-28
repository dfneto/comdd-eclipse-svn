/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelo Robo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getPlataforma <em>Plataforma</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getCabecalho <em>Cabecalho</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getPacote <em>Pacote</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getSensor <em>Sensor</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo()
 * @model
 * @generated
 */
public interface ModeloRobo extends EObject
{
  /**
   * Returns the value of the '<em><b>Plataforma</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.Plataforma}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plataforma</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plataforma</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo_Plataforma()
   * @model containment="true"
   * @generated
   */
  EList<Plataforma> getPlataforma();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.lrm.multiplosdestinos.ModeloRobo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cabecalho</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.Cabecalho}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cabecalho</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cabecalho</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo_Cabecalho()
   * @model containment="true"
   * @generated
   */
  EList<Cabecalho> getCabecalho();

  /**
   * Returns the value of the '<em><b>Pacote</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.Pacote}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pacote</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pacote</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo_Pacote()
   * @model containment="true"
   * @generated
   */
  EList<Pacote> getPacote();

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.Sensor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo_Sensor()
   * @model containment="true"
   * @generated
   */
  EList<Sensor> getSensor();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.Main}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getModeloRobo_Main()
   * @model containment="true"
   * @generated
   */
  EList<Main> getMain();

} // ModeloRobo
