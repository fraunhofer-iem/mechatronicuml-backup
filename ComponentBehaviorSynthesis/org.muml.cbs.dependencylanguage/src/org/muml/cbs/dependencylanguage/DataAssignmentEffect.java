/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.pim.actionlanguage.Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Assignment Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies which Assignments that should be applied, when the Condition or Event happens.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.DataAssignmentEffect#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getDataAssignmentEffect()
 * @model
 * @generated
 */
public interface DataAssignmentEffect extends Effect, Assignment {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.cbs.dependencylanguage.AssignmentDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direction of the dependency (see AssignmentDirection).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.AssignmentDirection
	 * @see #setDirection(AssignmentDirection)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getDataAssignmentEffect_Direction()
	 * @model required="true" derived="true"
	 * @generated
	 */
	AssignmentDirection getDirection();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.DataAssignmentEffect#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.AssignmentDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AssignmentDirection value);

} // DataAssignmentEffect
