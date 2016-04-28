/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sychronization Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It is required to specify selector expressions for single events that are referenced in Synchronization.
 * It is only allowed to be used if a selector type is specified.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.SynchronizationEvent#getSelectorExpression <em>Selector Expression</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.SynchronizationEvent#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronizationEvent()
 * @model
 * @generated
 */
public interface SynchronizationEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector Expression</em>' containment reference.
	 * @see #setSelectorExpression(Expression)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronizationEvent_SelectorExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSelectorExpression();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.SynchronizationEvent#getSelectorExpression <em>Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Expression</em>' containment reference.
	 * @see #getSelectorExpression()
	 * @generated
	 */
	void setSelectorExpression(Expression value);

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
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynchronizationEvent_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.SynchronizationEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // SynchronizationEvent
