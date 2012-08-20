/**
 */
package org.codingvienna.dc6.impl;

import java.util.Collection;

import org.codingvienna.dc6.Dc6Package;
import org.codingvienna.dc6.Properties;
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
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.impl.SquareImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.codingvienna.dc6.impl.SquareImpl#getSquares <em>Squares</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Properties> properties;

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
  protected SquareImpl()
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
    return Dc6Package.Literals.SQUARE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Properties> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Properties>(Properties.class, this, Dc6Package.SQUARE__PROPERTIES);
    }
    return properties;
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
      squares = new EObjectContainmentEList<Square>(Square.class, this, Dc6Package.SQUARE__SQUARES);
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
      case Dc6Package.SQUARE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case Dc6Package.SQUARE__SQUARES:
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
      case Dc6Package.SQUARE__PROPERTIES:
        return getProperties();
      case Dc6Package.SQUARE__SQUARES:
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
      case Dc6Package.SQUARE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Properties>)newValue);
        return;
      case Dc6Package.SQUARE__SQUARES:
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
      case Dc6Package.SQUARE__PROPERTIES:
        getProperties().clear();
        return;
      case Dc6Package.SQUARE__SQUARES:
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
      case Dc6Package.SQUARE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case Dc6Package.SQUARE__SQUARES:
        return squares != null && !squares.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SquareImpl
