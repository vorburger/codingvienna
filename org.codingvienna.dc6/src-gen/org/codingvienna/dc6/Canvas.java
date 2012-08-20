/**
 */
package org.codingvienna.dc6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.Canvas#getSquares <em>Squares</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.codingvienna.dc6.Dc6Package#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends EObject
{
  /**
   * Returns the value of the '<em><b>Squares</b></em>' containment reference list.
   * The list contents are of type {@link org.codingvienna.dc6.Square}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Squares</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Squares</em>' containment reference list.
   * @see org.codingvienna.dc6.Dc6Package#getCanvas_Squares()
   * @model containment="true"
   * @generated
   */
  EList<Square> getSquares();

} // Canvas
