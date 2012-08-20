/**
 */
package org.codingvienna.dc6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.Color#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.codingvienna.dc6.Dc6Package#getColor()
 * @model
 * @generated
 */
public interface Color extends Properties
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.codingvienna.dc6.ColorEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.codingvienna.dc6.ColorEnum
   * @see #setColor(ColorEnum)
   * @see org.codingvienna.dc6.Dc6Package#getColor_Color()
   * @model
   * @generated
   */
  ColorEnum getColor();

  /**
   * Sets the value of the '{@link org.codingvienna.dc6.Color#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.codingvienna.dc6.ColorEnum
   * @see #getColor()
   * @generated
   */
  void setColor(ColorEnum value);

} // Color
