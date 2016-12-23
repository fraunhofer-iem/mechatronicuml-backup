/**
 */
package org.muml.graphviz.plain;

import org.eclipse.emf.common.util.EList;
import org.muml.graphviz.common.Edge;
import org.muml.graphviz.util.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.plain.PlainEdge#getSplinePoints <em>Spline Points</em>}</li>
 * </ul>
 *
 * @see org.muml.graphviz.plain.PlainPackage#getPlainEdge()
 * @model
 * @generated
 */
public interface PlainEdge extends Edge<PlainNode> {
	/**
	 * Returns the value of the '<em><b>Spline Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.graphviz.util.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline Points</em>' containment reference list.
	 * @see org.muml.graphviz.plain.PlainPackage#getPlainEdge_SplinePoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getSplinePoints();

} // PlainEdge
