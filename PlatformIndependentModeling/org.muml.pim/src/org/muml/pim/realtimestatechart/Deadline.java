/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a deadline consisting of an upper and a lower bound.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.Deadline#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Deadline#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getDeadline()
 * @model abstract="true"
 * @generated
 */
public interface Deadline extends EObject {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of a deadline is a natural number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(TimeValue)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getDeadline_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getUpperBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Deadline#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound of a deadline is a natural number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(TimeValue)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getDeadline_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getLowerBound();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Deadline#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(TimeValue value);

} // Deadline
