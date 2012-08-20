/**
 */
package org.codingvienna.dc6.impl;

import java.util.Collection;

import org.codingvienna.dc6.Canvas;
import org.codingvienna.dc6.Dc6Package;
import org.codingvienna.dc6.Square;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.impl.CanvasImpl#getSquares <em>Squares</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasImpl extends MinimalEObjectImpl.Container implements Canvas
{
  /**
   * The cached value of the '{@link #getSquares() <em>Squares</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquares()
   * @generated
   * @ordered
   */
  protected EList<Square> squares;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CanvasImpl()
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
    return Dc6Package.Literals.CANVAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Square> getSquares()
  {
    if (squares == null)
    {
      squares = new EObjectContainmentEList<Square>(Square.class, this, Dc6Package.CANVAS__SQUARES);
    }
    return squares;
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
      case Dc6Package.CANVAS__SQUARES:
        return ((InternalEList<?>)getSquares()).basicRemove(otherEnd, msgs);
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
      case Dc6Package.CANVAS__SQUARES:
        return getSquares();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Dc6Package.CANVAS__SQUARES:
        getSquares().clear();
        getSquares().addAll((Collection<? extends Square>)newValue);
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
      case Dc6Package.CANVAS__SQUARES:
        getSquares().clear();
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
      case Dc6Package.CANVAS__SQUARES:
        return squares != null && !squares.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CanvasImpl
