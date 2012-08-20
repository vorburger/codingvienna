/**
 */
package org.codingvienna.dc6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.codingvienna.dc6.Square#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.codingvienna.dc6.Square#getSquares <em>Squares</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.codingvienna.dc6.Dc6Package#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.codingvienna.dc6.Properties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.codingvienna.dc6.Dc6Package#getSquare_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Properties> getProperties();

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
   * @see org.codingvienna.dc6.Dc6Package#getSquare_Squares()
   * @model containment="true"
   * @generated
   */
  EList<Square> getSquares();

} // Square
