/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.realtimestatechart.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Active State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It can specify invariants for states. Those invariants must include references of elements from other regions.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.BoundedActiveState#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.BoundedActiveState#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getBoundedActiveState()
 * @model
 * @generated
 */
public interface BoundedActiveState extends Dependency {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getBoundedActiveState_States()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is currently only allowed to specify UpperBoundClockConditions, because invariants only support UpperBoundClockConstraints.
	 * However, it might be possible to drop the restriction, because also other Conditions might be simulatable through UpperBoundClockConstraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(ClockCondition)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getBoundedActiveState_Constraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClockCondition getConstraint();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.BoundedActiveState#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ClockCondition value);

} // BoundedActiveState
