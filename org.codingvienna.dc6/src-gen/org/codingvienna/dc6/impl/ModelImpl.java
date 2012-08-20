/**
 */
package org.codingvienna.dc6.impl;

import org.codingvienna.dc6.Canvas;
import org.codingvienna.dc6.Dc6Package;
import org.codingvienna.dc6.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.impl.ModelImpl#getCanvas <em>Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getCanvas() <em>Canvas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCanvas()
   * @generated
   * @ordered
   */
  protected Canvas canvas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return Dc6Package.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Canvas getCanvas()
  {
    return canvas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCanvas(Canvas newCanvas, NotificationChain msgs)
  {
    Canvas oldCanvas = canvas;
    canvas = newCanvas;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dc6Package.MODEL__CANVAS, oldCanvas, newCanvas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCanvas(Canvas newCanvas)
  {
    if (newCanvas != canvas)
    {
      NotificationChain msgs = null;
      if (canvas != null)
        msgs = ((InternalEObject)canvas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Dc6Package.MODEL__CANVAS, null, msgs);
      if (newCanvas != null)
        msgs = ((InternalEObject)newCanvas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Dc6Package.MODEL__CANVAS, null, msgs);
      msgs = basicSetCanvas(newCanvas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Dc6Package.MODEL__CANVAS, newCanvas, newCanvas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Dc6Package.MODEL__CANVAS:
        return basicSetCanvas(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Dc6Package.MODEL__CANVAS:
        return getCanvas();
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
      case Dc6Package.MODEL__CANVAS:
        setCanvas((Canvas)newValue);
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
      case Dc6Package.MODEL__CANVAS:
        setCanvas((Canvas)null);
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
      case Dc6Package.MODEL__CANVAS:
        return canvas != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
