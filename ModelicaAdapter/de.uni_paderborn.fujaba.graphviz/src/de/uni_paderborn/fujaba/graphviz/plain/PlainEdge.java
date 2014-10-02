/**
 */
package de.uni_paderborn.fujaba.graphviz.plain;

import de.uni_paderborn.fujaba.graphviz.common.Edge;

import de.uni_paderborn.fujaba.graphviz.util.Point;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.plain.PlainEdge#getSplinePoints <em>Spline Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainPackage#getPlainEdge()
 * @model
 * @generated
 */
public interface PlainEdge extends Edge<PlainNode> {
	/**
	 * Returns the value of the '<em><b>Spline Points</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.util.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline Points</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainPackage#getPlainEdge_SplinePoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getSplinePoints();

} // PlainEdge
