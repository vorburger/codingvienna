/**
 */
package org.codingvienna.dc6;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.Corner#getCorner <em>Corner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.codingvienna.dc6.Dc6Package#getCorner()
 * @model
 * @generated
 */
public interface Corner extends Properties
{
  /**
   * Returns the value of the '<em><b>Corner</b></em>' attribute.
   * The literals are from the enumeration {@link org.codingvienna.dc6.CornerEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corner</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corner</em>' attribute.
   * @see org.codingvienna.dc6.CornerEnum
   * @see #setCorner(CornerEnum)
   * @see org.codingvienna.dc6.Dc6Package#getCorner_Corner()
   * @model
   * @generated
   */
  CornerEnum getCorner();

  /**
   * Sets the value of the '{@link org.codingvienna.dc6.Corner#getCorner <em>Corner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corner</em>' attribute.
   * @see org.codingvienna.dc6.CornerEnum
   * @see #getCorner()
   * @generated
   */
  void setCorner(CornerEnum value);

} // Corner
