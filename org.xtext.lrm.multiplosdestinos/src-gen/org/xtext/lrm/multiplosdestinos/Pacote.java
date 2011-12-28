/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.Pacote#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getPacote()
 * @model
 * @generated
 */
public interface Pacote extends EObject
{
  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see #setTipo(String)
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getPacote_Tipo()
   * @model
   * @generated
   */
  String getTipo();

  /**
   * Sets the value of the '{@link org.xtext.lrm.multiplosdestinos.Pacote#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see #getTipo()
   * @generated
   */
  void setTipo(String value);

} // Pacote
