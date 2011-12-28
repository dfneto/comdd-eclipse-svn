/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.Sensor#getTipoSensor <em>Tipo Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject
{
  /**
   * Returns the value of the '<em><b>Tipo Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Sensor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Sensor</em>' attribute.
   * @see #setTipoSensor(String)
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getSensor_TipoSensor()
   * @model
   * @generated
   */
  String getTipoSensor();

  /**
   * Sets the value of the '{@link org.xtext.lrm.multiplosdestinos.Sensor#getTipoSensor <em>Tipo Sensor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Sensor</em>' attribute.
   * @see #getTipoSensor()
   * @generated
   */
  void setTipoSensor(String value);

} // Sensor
