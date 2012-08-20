/**
 */
package org.codingvienna.dc6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.Model#getCanvas <em>Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.codingvienna.dc6.Dc6Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Canvas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Canvas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Canvas</em>' containment reference.
   * @see #setCanvas(Canvas)
   * @see org.codingvienna.dc6.Dc6Package#getModel_Canvas()
   * @model containment="true"
   * @generated
   */
  Canvas getCanvas();

  /**
   * Sets the value of the '{@link org.codingvienna.dc6.Model#getCanvas <em>Canvas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Canvas</em>' containment reference.
   * @see #getCanvas()
   * @generated
   */
  void setCanvas(Canvas value);

} // Model
