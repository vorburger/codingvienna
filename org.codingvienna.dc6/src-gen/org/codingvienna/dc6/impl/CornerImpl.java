/**
 */
package org.codingvienna.dc6.impl;

import org.codingvienna.dc6.Corner;
import org.codingvienna.dc6.CornerEnum;
import org.codingvienna.dc6.Dc6Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.impl.CornerImpl#getCorner <em>Corner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CornerImpl extends PropertiesImpl implements Corner
{
  /**
   * The default value of the '{@link #getCorner() <em>Corner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorner()
   * @generated
   * @ordered
   */
  protected static final CornerEnum CORNER_EDEFAULT = CornerEnum.ROUNDED;

  /**
   * The cached value of the '{@link #getCorner() <em>Corner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorner()
   * @generated
   * @ordered
   */
  protected CornerEnum corner = CORNER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CornerImpl()
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
    return Dc6Package.Literals.CORNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CornerEnum getCorner()
  {
    return corner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorner(CornerEnum newCorner)
  {
    CornerEnum oldCorner = corner;
    corner = newCorner == null ? CORNER_EDEFAULT : newCorner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Dc6Package.CORNER__CORNER, oldCorner, corner));
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
      case Dc6Package.CORNER__CORNER:
        return getCorner();
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
      case Dc6Package.CORNER__CORNER:
        setCorner((CornerEnum)newValue);
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
      case Dc6Package.CORNER__CORNER:
        setCorner(CORNER_EDEFAULT);
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
      case Dc6Package.CORNER__CORNER:
        return corner != CORNER_EDEFAULT;
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
    result.append(" (corner: ");
    result.append(corner);
    result.append(')');
    return result.toString();
  }

} //CornerImpl
