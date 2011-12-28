/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;
import org.xtext.lrm.multiplosdestinos.processamento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>processamento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.processamentoImpl#getProcessaInfo <em>Processa Info</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.processamentoImpl#getProcessaImagem <em>Processa Imagem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class processamentoImpl extends MinimalEObjectImpl.Container implements processamento
{
  /**
   * The default value of the '{@link #getProcessaInfo() <em>Processa Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessaInfo()
   * @generated
   * @ordered
   */
  protected static final String PROCESSA_INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessaInfo() <em>Processa Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessaInfo()
   * @generated
   * @ordered
   */
  protected String processaInfo = PROCESSA_INFO_EDEFAULT;

  /**
   * The default value of the '{@link #getProcessaImagem() <em>Processa Imagem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessaImagem()
   * @generated
   * @ordered
   */
  protected static final String PROCESSA_IMAGEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessaImagem() <em>Processa Imagem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessaImagem()
   * @generated
   * @ordered
   */
  protected String processaImagem = PROCESSA_IMAGEM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected processamentoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MultiplosdestinosPackage.Literals.PROCESSAMENTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessaInfo()
  {
    return processaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessaInfo(String newProcessaInfo)
  {
    String oldProcessaInfo = processaInfo;
    processaInfo = newProcessaInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_INFO, oldProcessaInfo, processaInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessaImagem()
  {
    return processaImagem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessaImagem(String newProcessaImagem)
  {
    String oldProcessaImagem = processaImagem;
    processaImagem = newProcessaImagem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_IMAGEM, oldProcessaImagem, processaImagem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_INFO:
        return getProcessaInfo();
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_IMAGEM:
        return getProcessaImagem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_INFO:
        setProcessaInfo((String)newValue);
        return;
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_IMAGEM:
        setProcessaImagem((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_INFO:
        setProcessaInfo(PROCESSA_INFO_EDEFAULT);
        return;
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_IMAGEM:
        setProcessaImagem(PROCESSA_IMAGEM_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_INFO:
        return PROCESSA_INFO_EDEFAULT == null ? processaInfo != null : !PROCESSA_INFO_EDEFAULT.equals(processaInfo);
      case MultiplosdestinosPackage.PROCESSAMENTO__PROCESSA_IMAGEM:
        return PROCESSA_IMAGEM_EDEFAULT == null ? processaImagem != null : !PROCESSA_IMAGEM_EDEFAULT.equals(processaImagem);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (processaInfo: ");
    result.append(processaInfo);
    result.append(", processaImagem: ");
    result.append(processaImagem);
    result.append(')');
    return result.toString();
  }

} //processamentoImpl
