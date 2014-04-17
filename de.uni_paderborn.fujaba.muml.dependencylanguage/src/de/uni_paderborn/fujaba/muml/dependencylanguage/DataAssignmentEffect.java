/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage;

import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.DataAssignmentEffect#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getDataAssignmentEffect()
 * @model
 * @generated
 */
public interface DataAssignmentEffect extends Effect, Assignment {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.dependencylanguage.AssignmentDirection}.
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
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.AssignmentDirection
	 * @see #setDirection(AssignmentDirection)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getDataAssignmentEffect_Direction()
	 * @model required="true" derived="true"
	 * @generated
	 */
	AssignmentDirection getDirection();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.DataAssignmentEffect#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.AssignmentDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AssignmentDirection value);

} // DataAssignmentEffect
