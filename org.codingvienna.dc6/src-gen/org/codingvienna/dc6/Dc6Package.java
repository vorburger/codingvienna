/**
 */
package org.codingvienna.dc6;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.codingvienna.dc6.Dc6Factory
 * @model kind="package"
 * @generated
 */
public interface Dc6Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dc6";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.codingvienna.org/Dc6";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dc6";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Dc6Package eINSTANCE = org.codingvienna.dc6.impl.Dc6PackageImpl.init();

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.ModelImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Canvas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CANVAS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.CanvasImpl <em>Canvas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.CanvasImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCanvas()
   * @generated
   */
  int CANVAS = 1;

  /**
   * The feature id for the '<em><b>Squares</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS__SQUARES = 0;

  /**
   * The number of structural features of the '<em>Canvas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.SquareImpl <em>Square</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.SquareImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getSquare()
   * @generated
   */
  int SQUARE = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Squares</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE__SQUARES = 1;

  /**
   * The number of structural features of the '<em>Square</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQUARE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.PropertiesImpl <em>Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.PropertiesImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getProperties()
   * @generated
   */
  int PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.ColorImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getColor()
   * @generated
   */
  int COLOR = 4;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__COLOR = PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.CornerImpl <em>Corner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.CornerImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCorner()
   * @generated
   */
  int CORNER = 5;

  /**
   * The feature id for the '<em><b>Corner</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__CORNER = PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Corner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.LocationImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 6;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__X = PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__Y = PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.CaptionImpl <em>Caption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.CaptionImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCaption()
   * @generated
   */
  int CAPTION = 7;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTION__CAPTION = PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Caption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTION_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.impl.SizeImpl
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getSize()
   * @generated
   */
  int SIZE = 8;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__WIDTH = PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__HEIGHT = PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = PROPERTIES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.ColorEnum <em>Color Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.ColorEnum
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getColorEnum()
   * @generated
   */
  int COLOR_ENUM = 9;

  /**
   * The meta object id for the '{@link org.codingvienna.dc6.CornerEnum <em>Corner Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingvienna.dc6.CornerEnum
   * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCornerEnum()
   * @generated
   */
  int CORNER_ENUM = 10;


  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.codingvienna.dc6.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.codingvienna.dc6.Model#getCanvas <em>Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Canvas</em>'.
   * @see org.codingvienna.dc6.Model#getCanvas()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Canvas();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Canvas <em>Canvas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Canvas</em>'.
   * @see org.codingvienna.dc6.Canvas
   * @generated
   */
  EClass getCanvas();

  /**
   * Returns the meta object for the containment reference list '{@link org.codingvienna.dc6.Canvas#getSquares <em>Squares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Squares</em>'.
   * @see org.codingvienna.dc6.Canvas#getSquares()
   * @see #getCanvas()
   * @generated
   */
  EReference getCanvas_Squares();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Square <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Square</em>'.
   * @see org.codingvienna.dc6.Square
   * @generated
   */
  EClass getSquare();

  /**
   * Returns the meta object for the containment reference list '{@link org.codingvienna.dc6.Square#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.codingvienna.dc6.Square#getProperties()
   * @see #getSquare()
   * @generated
   */
  EReference getSquare_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.codingvienna.dc6.Square#getSquares <em>Squares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Squares</em>'.
   * @see org.codingvienna.dc6.Square#getSquares()
   * @see #getSquare()
   * @generated
   */
  EReference getSquare_Squares();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Properties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties</em>'.
   * @see org.codingvienna.dc6.Properties
   * @generated
   */
  EClass getProperties();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.codingvienna.dc6.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Color#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.codingvienna.dc6.Color#getColor()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Color();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Corner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corner</em>'.
   * @see org.codingvienna.dc6.Corner
   * @generated
   */
  EClass getCorner();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Corner#getCorner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Corner</em>'.
   * @see org.codingvienna.dc6.Corner#getCorner()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Corner();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see org.codingvienna.dc6.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Location#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.codingvienna.dc6.Location#getX()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_X();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Location#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.codingvienna.dc6.Location#getY()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Y();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Caption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Caption</em>'.
   * @see org.codingvienna.dc6.Caption
   * @generated
   */
  EClass getCaption();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Caption#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see org.codingvienna.dc6.Caption#getCaption()
   * @see #getCaption()
   * @generated
   */
  EAttribute getCaption_Caption();

  /**
   * Returns the meta object for class '{@link org.codingvienna.dc6.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see org.codingvienna.dc6.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.codingvienna.dc6.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Width();

  /**
   * Returns the meta object for the attribute '{@link org.codingvienna.dc6.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.codingvienna.dc6.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Height();

  /**
   * Returns the meta object for enum '{@link org.codingvienna.dc6.ColorEnum <em>Color Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color Enum</em>'.
   * @see org.codingvienna.dc6.ColorEnum
   * @generated
   */
  EEnum getColorEnum();

  /**
   * Returns the meta object for enum '{@link org.codingvienna.dc6.CornerEnum <em>Corner Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Corner Enum</em>'.
   * @see org.codingvienna.dc6.CornerEnum
   * @generated
   */
  EEnum getCornerEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Dc6Factory getDc6Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.ModelImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Canvas</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CANVAS = eINSTANCE.getModel_Canvas();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.CanvasImpl <em>Canvas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.CanvasImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCanvas()
     * @generated
     */
    EClass CANVAS = eINSTANCE.getCanvas();

    /**
     * The meta object literal for the '<em><b>Squares</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CANVAS__SQUARES = eINSTANCE.getCanvas_Squares();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.SquareImpl <em>Square</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.SquareImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getSquare()
     * @generated
     */
    EClass SQUARE = eINSTANCE.getSquare();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQUARE__PROPERTIES = eINSTANCE.getSquare_Properties();

    /**
     * The meta object literal for the '<em><b>Squares</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQUARE__SQUARES = eINSTANCE.getSquare_Squares();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.PropertiesImpl <em>Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.PropertiesImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getProperties()
     * @generated
     */
    EClass PROPERTIES = eINSTANCE.getProperties();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.ColorImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__COLOR = eINSTANCE.getColor_Color();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.CornerImpl <em>Corner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.CornerImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCorner()
     * @generated
     */
    EClass CORNER = eINSTANCE.getCorner();

    /**
     * The meta object literal for the '<em><b>Corner</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__CORNER = eINSTANCE.getCorner_Corner();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.LocationImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__X = eINSTANCE.getLocation_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__Y = eINSTANCE.getLocation_Y();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.CaptionImpl <em>Caption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.CaptionImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCaption()
     * @generated
     */
    EClass CAPTION = eINSTANCE.getCaption();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPTION__CAPTION = eINSTANCE.getCaption_Caption();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.impl.SizeImpl
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.ColorEnum <em>Color Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.ColorEnum
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getColorEnum()
     * @generated
     */
    EEnum COLOR_ENUM = eINSTANCE.getColorEnum();

    /**
     * The meta object literal for the '{@link org.codingvienna.dc6.CornerEnum <em>Corner Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingvienna.dc6.CornerEnum
     * @see org.codingvienna.dc6.impl.Dc6PackageImpl#getCornerEnum()
     * @generated
     */
    EEnum CORNER_ENUM = eINSTANCE.getCornerEnum();

  }

} //Dc6Package
