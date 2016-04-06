/**
 */
package org.muml.cbs.dependencylanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counted Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This event counts the occurences of its subevent. Its own occurence is triggered when the threshold defined in counter is reached.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.CountedEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.CountedEvent#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCountedEvent()
 * @model
 * @generated
 */
public interface CountedEvent extends Event {
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
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCountedEvent_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CountedEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getCountedEvent_Counter()
	 * @model
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.CountedEvent#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // CountedEvent
