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
import org.xtext.lrm.multiplosdestinos.andar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>andar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.andarImpl#getAndar <em>Andar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class andarImpl extends acaoImpl implements andar
{
  /**
   * The default value of the '{@link #getAndar() <em>Andar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndar()
   * @generated
   * @ordered
   */
  protected static final String ANDAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAndar() <em>Andar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndar()
   * @generated
   * @ordered
   */
  protected String andar = ANDAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected andarImpl()
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
    return MultiplosdestinosPackage.Literals.ANDAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAndar()
  {
    return andar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAndar(String newAndar)
  {
    String oldAndar = andar;
    andar = newAndar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.ANDAR__ANDAR, oldAndar, andar));
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
      case MultiplosdestinosPackage.ANDAR__ANDAR:
        return getAndar();
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
      case MultiplosdestinosPackage.ANDAR__ANDAR:
        setAndar((String)newValue);
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
      case MultiplosdestinosPackage.ANDAR__ANDAR:
        setAndar(ANDAR_EDEFAULT);
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
      case MultiplosdestinosPackage.ANDAR__ANDAR:
        return ANDAR_EDEFAULT == null ? andar != null : !ANDAR_EDEFAULT.equals(andar);
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
    result.append(" (andar: ");
    result.append(andar);
    result.append(')');
    return result.toString();
  }

} //andarImpl
