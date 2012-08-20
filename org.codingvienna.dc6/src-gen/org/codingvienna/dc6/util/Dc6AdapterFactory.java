/**
 */
package org.codingvienna.dc6.util;

import org.codingvienna.dc6.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.codingvienna.dc6.Dc6Package
 * @generated
 */
public class Dc6AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Dc6Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dc6AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Dc6Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dc6Switch<Adapter> modelSwitch =
    new Dc6Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCanvas(Canvas object)
      {
        return createCanvasAdapter();
      }
      @Override
      public Adapter caseSquare(Square object)
      {
        return createSquareAdapter();
      }
      @Override
      public Adapter caseProperties(Properties object)
      {
        return createPropertiesAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseCorner(Corner object)
      {
        return createCornerAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseCaption(Caption object)
      {
        return createCaptionAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Canvas <em>Canvas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Canvas
   * @generated
   */
  public Adapter createCanvasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Square <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Square
   * @generated
   */
  public Adapter createSquareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Properties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Properties
   * @generated
   */
  public Adapter createPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Corner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Corner
   * @generated
   */
  public Adapter createCornerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Caption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Caption
   * @generated
   */
  public Adapter createCaptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.codingvienna.dc6.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.codingvienna.dc6.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Dc6AdapterFactory
