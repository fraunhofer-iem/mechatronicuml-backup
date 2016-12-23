/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conditional dependency can be used to restrict Transition by Constraints, which have to be specified as Conditions.
 * Through enable and disable the resolved Constraint will be attached to transitions.
 * Also clock resets and data assignments can be specified.
 * Those are applied for the specified event or when the Condition changes from false to true.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getEvent <em>Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getConditionalDependency()
 * @model
 * @generated
 */
public interface ConditionalDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either event or condition can be used.
	 * Event cannot be combined with EnableDisableEffect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getConditionalDependency_Event()
	 * @model containment="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * see Condition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getConditionalDependency_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.ConditionalDependency#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.cbs.dependencylanguage.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * see Effect
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getConditionalDependency_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effect> getEffects();

} // ConditionalDependency
