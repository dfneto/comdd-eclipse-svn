/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.loop#getIniSensor <em>Ini Sensor</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.loop#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.loop#getEn <em>En</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.loop#getProc <em>Proc</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.loop#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.loop#getAc <em>Ac</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop()
 * @model
 * @generated
 */
public interface loop extends Main
{
  /**
   * Returns the value of the '<em><b>Ini Sensor</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.inicializacaoSensor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ini Sensor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ini Sensor</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop_IniSensor()
   * @model containment="true"
   * @generated
   */
  EList<inicializacaoSensor> getIniSensor();

  /**
   * Returns the value of the '<em><b>W</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' attribute list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop_W()
   * @model unique="false"
   * @generated
   */
  EList<String> getW();

  /**
   * Returns the value of the '<em><b>En</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.entrada}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>En</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>En</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop_En()
   * @model containment="true"
   * @generated
   */
  EList<entrada> getEn();

  /**
   * Returns the value of the '<em><b>Proc</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.processamento}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop_Proc()
   * @model containment="true"
   * @generated
   */
  EList<processamento> getProc();

  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.comportamento}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop_Comp()
   * @model containment="true"
   * @generated
   */
  EList<comportamento> getComp();

  /**
   * Returns the value of the '<em><b>Ac</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lrm.multiplosdestinos.acao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ac</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ac</em>' containment reference list.
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getloop_Ac()
   * @model containment="true"
   * @generated
   */
  EList<acao> getAc();

} // loop
