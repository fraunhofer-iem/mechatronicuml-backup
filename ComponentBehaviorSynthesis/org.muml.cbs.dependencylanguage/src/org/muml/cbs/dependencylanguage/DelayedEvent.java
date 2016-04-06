/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delayed Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This event occurs with the specified delay after its subevent occured.
 * It requires an auxiliary elements such that event can happen without any other dependencies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.DelayedEvent#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.DelayedEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getDelayedEvent()
 * @model
 * @generated
 */
public interface DelayedEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(TimeValue)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getDelayedEvent_Delay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getDelay();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.DelayedEvent#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getDelayedEvent_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.DelayedEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // DelayedEvent
