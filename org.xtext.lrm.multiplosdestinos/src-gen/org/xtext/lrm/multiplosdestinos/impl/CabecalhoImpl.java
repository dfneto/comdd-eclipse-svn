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

import org.xtext.lrm.multiplosdestinos.Cabecalho;
import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabecalho</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.CabecalhoImpl#getItensCabecalho <em>Itens Cabecalho</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CabecalhoImpl extends MinimalEObjectImpl.Container implements Cabecalho
{
  /**
   * The default value of the '{@link #getItensCabecalho() <em>Itens Cabecalho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItensCabecalho()
   * @generated
   * @ordered
   */
  protected static final String ITENS_CABECALHO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItensCabecalho() <em>Itens Cabecalho</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItensCabecalho()
   * @generated
   * @ordered
   */
  protected String itensCabecalho = ITENS_CABECALHO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CabecalhoImpl()
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
    return MultiplosdestinosPackage.Literals.CABECALHO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getItensCabecalho()
  {
    return itensCabecalho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItensCabecalho(String newItensCabecalho)
  {
    String oldItensCabecalho = itensCabecalho;
    itensCabecalho = newItensCabecalho;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.CABECALHO__ITENS_CABECALHO, oldItensCabecalho, itensCabecalho));
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
      case MultiplosdestinosPackage.CABECALHO__ITENS_CABECALHO:
        return getItensCabecalho();
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
      case MultiplosdestinosPackage.CABECALHO__ITENS_CABECALHO:
        setItensCabecalho((String)newValue);
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
      case MultiplosdestinosPackage.CABECALHO__ITENS_CABECALHO:
        setItensCabecalho(ITENS_CABECALHO_EDEFAULT);
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
      case MultiplosdestinosPackage.CABECALHO__ITENS_CABECALHO:
        return ITENS_CABECALHO_EDEFAULT == null ? itensCabecalho != null : !ITENS_CABECALHO_EDEFAULT.equals(itensCabecalho);
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
    result.append(" (itensCabecalho: ");
    result.append(itensCabecalho);
    result.append(')');
    return result.toString();
  }

} //CabecalhoImpl
