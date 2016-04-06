/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.pim.realtimestatechart.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resolves to the single Transition it references.
 * It is the simplest Event.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.TransitionEvent#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getTransitionEvent()
 * @model
 * @generated
 */
public interface TransitionEvent extends SimpleEvent {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getTransitionEvent_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.TransitionEvent#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // TransitionEvent
