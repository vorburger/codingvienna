/**
 */
package org.codingvienna.dc6.impl;

import org.codingvienna.dc6.Caption;
import org.codingvienna.dc6.Dc6Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.impl.CaptionImpl#getCaption <em>Caption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaptionImpl extends PropertiesImpl implements Caption
{
  /**
   * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected static final String CAPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected String caption = CAPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaptionImpl()
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
    return Dc6Package.Literals.CAPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCaption()
  {
    return caption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaption(String newCaption)
  {
    String oldCaption = caption;
    caption = newCaption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Dc6Package.CAPTION__CAPTION, oldCaption, caption));
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
      case Dc6Package.CAPTION__CAPTION:
        return getCaption();
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
      case Dc6Package.CAPTION__CAPTION:
        setCaption((String)newValue);
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
      case Dc6Package.CAPTION__CAPTION:
        setCaption(CAPTION_EDEFAULT);
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
      case Dc6Package.CAPTION__CAPTION:
        return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
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
    result.append(" (caption: ");
    result.append(caption);
    result.append(')');
    return result.toString();
  }

} //CaptionImpl
