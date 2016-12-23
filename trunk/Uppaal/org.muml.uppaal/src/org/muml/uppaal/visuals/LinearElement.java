/**
 */
package org.muml.uppaal.visuals;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A linear model element that has a set of bend points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.visuals.LinearElement#getBendPoint <em>Bend Point</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.visuals.VisualsPackage#getLinearElement()
 * @model abstract="true"
 * @generated
 */
public interface LinearElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Bend Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.visuals.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bend points of the linear model element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bend Point</em>' containment reference list.
	 * @see org.muml.uppaal.visuals.VisualsPackage#getLinearElement_BendPoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getBendPoint();

} // LinearElement
