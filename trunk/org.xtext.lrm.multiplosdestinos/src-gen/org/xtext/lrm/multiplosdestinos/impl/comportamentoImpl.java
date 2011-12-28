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
import org.xtext.lrm.multiplosdestinos.comportamento;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comportamento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl#getDefineRegra <em>Define Regra</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl#getDefineRegraSeguir <em>Define Regra Seguir</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl#getDefineRegraNaoBater <em>Define Regra Nao Bater</em>}</li>
 *   <li>{@link org.xtext.lrm.multiplosdestinos.impl.comportamentoImpl#getDefineRegraSeguirMultiplasCoordenadas <em>Define Regra Seguir Multiplas Coordenadas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class comportamentoImpl extends MinimalEObjectImpl.Container implements comportamento
{
  /**
   * The default value of the '{@link #getDefineRegra() <em>Define Regra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegra()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_REGRA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineRegra() <em>Define Regra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegra()
   * @generated
   * @ordered
   */
  protected String defineRegra = DEFINE_REGRA_EDEFAULT;

  /**
   * The default value of the '{@link #getDefineRegraSeguir() <em>Define Regra Seguir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegraSeguir()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_REGRA_SEGUIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineRegraSeguir() <em>Define Regra Seguir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegraSeguir()
   * @generated
   * @ordered
   */
  protected String defineRegraSeguir = DEFINE_REGRA_SEGUIR_EDEFAULT;

  /**
   * The default value of the '{@link #getDefineRegraNaoBater() <em>Define Regra Nao Bater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegraNaoBater()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_REGRA_NAO_BATER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineRegraNaoBater() <em>Define Regra Nao Bater</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegraNaoBater()
   * @generated
   * @ordered
   */
  protected String defineRegraNaoBater = DEFINE_REGRA_NAO_BATER_EDEFAULT;

  /**
   * The default value of the '{@link #getDefineRegraSeguirMultiplasCoordenadas() <em>Define Regra Seguir Multiplas Coordenadas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegraSeguirMultiplasCoordenadas()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineRegraSeguirMultiplasCoordenadas() <em>Define Regra Seguir Multiplas Coordenadas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRegraSeguirMultiplasCoordenadas()
   * @generated
   * @ordered
   */
  protected String defineRegraSeguirMultiplasCoordenadas = DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected comportamentoImpl()
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
    return MultiplosdestinosPackage.Literals.COMPORTAMENTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineRegra()
  {
    return defineRegra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineRegra(String newDefineRegra)
  {
    String oldDefineRegra = defineRegra;
    defineRegra = newDefineRegra;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA, oldDefineRegra, defineRegra));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineRegraSeguir()
  {
    return defineRegraSeguir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineRegraSeguir(String newDefineRegraSeguir)
  {
    String oldDefineRegraSeguir = defineRegraSeguir;
    defineRegraSeguir = newDefineRegraSeguir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR, oldDefineRegraSeguir, defineRegraSeguir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineRegraNaoBater()
  {
    return defineRegraNaoBater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineRegraNaoBater(String newDefineRegraNaoBater)
  {
    String oldDefineRegraNaoBater = defineRegraNaoBater;
    defineRegraNaoBater = newDefineRegraNaoBater;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_NAO_BATER, oldDefineRegraNaoBater, defineRegraNaoBater));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineRegraSeguirMultiplasCoordenadas()
  {
    return defineRegraSeguirMultiplasCoordenadas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineRegraSeguirMultiplasCoordenadas(String newDefineRegraSeguirMultiplasCoordenadas)
  {
    String oldDefineRegraSeguirMultiplasCoordenadas = defineRegraSeguirMultiplasCoordenadas;
    defineRegraSeguirMultiplasCoordenadas = newDefineRegraSeguirMultiplasCoordenadas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS, oldDefineRegraSeguirMultiplasCoordenadas, defineRegraSeguirMultiplasCoordenadas));
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
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA:
        return getDefineRegra();
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR:
        return getDefineRegraSeguir();
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_NAO_BATER:
        return getDefineRegraNaoBater();
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS:
        return getDefineRegraSeguirMultiplasCoordenadas();
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
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA:
        setDefineRegra((String)newValue);
        return;
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR:
        setDefineRegraSeguir((String)newValue);
        return;
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_NAO_BATER:
        setDefineRegraNaoBater((String)newValue);
        return;
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS:
        setDefineRegraSeguirMultiplasCoordenadas((String)newValue);
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
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA:
        setDefineRegra(DEFINE_REGRA_EDEFAULT);
        return;
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR:
        setDefineRegraSeguir(DEFINE_REGRA_SEGUIR_EDEFAULT);
        return;
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_NAO_BATER:
        setDefineRegraNaoBater(DEFINE_REGRA_NAO_BATER_EDEFAULT);
        return;
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS:
        setDefineRegraSeguirMultiplasCoordenadas(DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS_EDEFAULT);
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
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA:
        return DEFINE_REGRA_EDEFAULT == null ? defineRegra != null : !DEFINE_REGRA_EDEFAULT.equals(defineRegra);
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR:
        return DEFINE_REGRA_SEGUIR_EDEFAULT == null ? defineRegraSeguir != null : !DEFINE_REGRA_SEGUIR_EDEFAULT.equals(defineRegraSeguir);
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_NAO_BATER:
        return DEFINE_REGRA_NAO_BATER_EDEFAULT == null ? defineRegraNaoBater != null : !DEFINE_REGRA_NAO_BATER_EDEFAULT.equals(defineRegraNaoBater);
      case MultiplosdestinosPackage.COMPORTAMENTO__DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS:
        return DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS_EDEFAULT == null ? defineRegraSeguirMultiplasCoordenadas != null : !DEFINE_REGRA_SEGUIR_MULTIPLAS_COORDENADAS_EDEFAULT.equals(defineRegraSeguirMultiplasCoordenadas);
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
    result.append(" (defineRegra: ");
    result.append(defineRegra);
    result.append(", defineRegraSeguir: ");
    result.append(defineRegraSeguir);
    result.append(", defineRegraNaoBater: ");
    result.append(defineRegraNaoBater);
    result.append(", defineRegraSeguirMultiplasCoordenadas: ");
    result.append(defineRegraSeguirMultiplasCoordenadas);
    result.append(')');
    return result.toString();
  }

} //comportamentoImpl
