/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lrm.multiplosdestinos.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lrm.multiplosdestinos.MultiplosdestinosPackage;
import org.xtext.lrm.multiplosdestinos.nomeDaPlataforma;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>nome Da Plataforma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.nomeDaPlataformaImpl#getPlat <em>Plat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class nomeDaPlataformaImpl extends PlataformaImpl implements nomeDaPlataforma
{
  /**
   * The default value of the '{@link #getPlat() <em>Plat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlat()
   * @generated
   * @ordered
   */
  protected static final String PLAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlat() <em>Plat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlat()
   * @generated
   * @ordered
   */
  protected String plat = PLAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected nomeDaPlataformaImpl()
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
    return MultiplosdestinosPackage.Literals.NOME_DA_PLATAFORMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlat()
  {
    return plat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlat(String newPlat)
  {
    String oldPlat = plat;
    plat = newPlat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.NOME_DA_PLATAFORMA__PLAT, oldPlat, plat));
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
      case MultiplosdestinosPackage.NOME_DA_PLATAFORMA__PLAT:
        return getPlat();
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
      case MultiplosdestinosPackage.NOME_DA_PLATAFORMA__PLAT:
        setPlat((String)newValue);
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
      case MultiplosdestinosPackage.NOME_DA_PLATAFORMA__PLAT:
        setPlat(PLAT_EDEFAULT);
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
      case MultiplosdestinosPackage.NOME_DA_PLATAFORMA__PLAT:
        return PLAT_EDEFAULT == null ? plat != null : !PLAT_EDEFAULT.equals(plat);
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
    result.append(" (plat: ");
    result.append(plat);
    result.append(')');
    return result.toString();
  }

} //nomeDaPlataformaImpl
