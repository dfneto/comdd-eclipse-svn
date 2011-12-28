/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>processamento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.processamento#getProcessaInfo <em>Processa Info</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.processamento#getProcessaImagem <em>Processa Imagem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getprocessamento()
 * @model
 * @generated
 */
public interface processamento extends EObject
{
  /**
   * Returns the value of the '<em><b>Processa Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processa Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processa Info</em>' attribute.
   * @see #setProcessaInfo(String)
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getprocessamento_ProcessaInfo()
   * @model
   * @generated
   */
  String getProcessaInfo();

  /**
   * Sets the value of the '{@link org.xtext.lrm.multiplosdestinos.processamento#getProcessaInfo <em>Processa Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processa Info</em>' attribute.
   * @see #getProcessaInfo()
   * @generated
   */
  void setProcessaInfo(String value);

  /**
   * Returns the value of the '<em><b>Processa Imagem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processa Imagem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processa Imagem</em>' attribute.
   * @see #setProcessaImagem(String)
   * @see org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage#getprocessamento_ProcessaImagem()
   * @model
   * @generated
   */
  String getProcessaImagem();

  /**
   * Sets the value of the '{@link org.xtext.lrm.multiplosdestinos.processamento#getProcessaImagem <em>Processa Imagem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processa Imagem</em>' attribute.
   * @see #getProcessaImagem()
   * @generated
   */
  void setProcessaImagem(String value);

} // processamento
