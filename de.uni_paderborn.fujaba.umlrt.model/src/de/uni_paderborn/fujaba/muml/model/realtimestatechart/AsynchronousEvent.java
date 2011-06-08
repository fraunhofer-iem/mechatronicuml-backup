/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.storydriven.modeling.NamedElement;

import org.storydriven.modeling.calls.expressions.MethodCallExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an event. Events are associated with transitions. They are instances of certain message types. Events are used to model asynchronous communication between realtime statecharts. Events can be required for a transition to be activated. In this case the event is considered to be a trigger event. Events can also be sent when a transition is activated. Those events are considered as raised events.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getTriggeredTransition <em>Triggered Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getRaisedTransition <em>Raised Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getAsynchronousEvent()
 * @model
 * @generated
 */
public interface AsynchronousEvent extends MethodCallExpression, NamedElement {
	/**
	 * Returns the value of the '<em><b>Triggered Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTriggerEvents <em>Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this events belongs to as trigger event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggered Transition</em>' container reference.
	 * @see #setTriggeredTransition(Transition)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getAsynchronousEvent_TriggeredTransition()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getTriggerEvents
	 * @model opposite="triggerEvents" transient="false"
	 * @generated
	 */
	Transition getTriggeredTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getTriggeredTransition <em>Triggered Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered Transition</em>' container reference.
	 * @see #getTriggeredTransition()
	 * @generated
	 */
	void setTriggeredTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Raised Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRaisedEvents <em>Raised Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this event belongs to as raised event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Transition</em>' container reference.
	 * @see #setRaisedTransition(Transition)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getAsynchronousEvent_RaisedTransition()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getRaisedEvents
	 * @model opposite="raisedEvents" transient="false"
	 * @generated
	 */
	Transition getRaisedTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getRaisedTransition <em>Raised Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised Transition</em>' container reference.
	 * @see #getRaisedTransition()
	 * @generated
	 */
	void setRaisedTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Full Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full event name is to be derived by the corresponding message type prefixed with the name of the message interface that defines the message type.
	 * \todosd{Delete, because this is a view information.}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Event Name</em>' attribute.
	 * @see #setFullEventName(String)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getAsynchronousEvent_FullEventName()
	 * @model derived="true"
	 * @generated
	 */
	String getFullEventName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent#getFullEventName <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Event Name</em>' attribute.
	 * @see #getFullEventName()
	 * @generated
	 */
	void setFullEventName(String value);

} // AsynchronousEvent
