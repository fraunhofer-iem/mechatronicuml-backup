/**
 */
package org.muml.storydiagram.expressions.pathExpressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.expressions.pathExpressions.Path#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject
{
  /**
   * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.muml.storydiagram.expressions.pathExpressions.PathSegment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' containment reference list.
   * @see org.muml.storydiagram.expressions.pathExpressions.PathExpressionsPackage#getPath_Segments()
   * @model containment="true"
   * @generated
   */
  EList<PathSegment> getSegments();

} // Path
