/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.pim.realtimestatechart.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be resolved either to a Set of Transitions or to an EntryOrExitEvent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.StateEvent#getState <em>State</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.StateEvent#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getStateEvent()
 * @model
 * @generated
 */
public interface StateEvent extends SimpleEvent {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getStateEvent_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.StateEvent#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.cbs.dependencylanguage.StateEventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * see StateEventKind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.StateEventKind
	 * @see #setKind(StateEventKind)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getStateEvent_Kind()
	 * @model required="true"
	 * @generated
	 */
	StateEventKind getKind();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.StateEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.StateEventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StateEventKind value);

} // StateEvent
