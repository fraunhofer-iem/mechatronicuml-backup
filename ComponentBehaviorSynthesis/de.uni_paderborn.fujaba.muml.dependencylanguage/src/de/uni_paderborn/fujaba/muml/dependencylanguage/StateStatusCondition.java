/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.realtimestatechart.State;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Status Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This condition specifies the interval that a state (combination) is active or inactive.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateStatusCondition#getStates <em>States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateStatusCondition#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getStateStatusCondition()
 * @model
 * @generated
 */
public interface StateStatusCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getStateStatusCondition_States()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * see StateStatusKind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.StateStatusKind
	 * @see #setKind(StateStatusKind)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getStateStatusCondition_Kind()
	 * @model required="true"
	 * @generated
	 */
	StateStatusKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateStatusCondition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.StateStatusKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StateStatusKind value);

} // StateStatusCondition
