/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.calls.expressions.MethodCallExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an event. Events are associated with transitions. They are instances of certain message types. Events are used to model asynchronous communication between realtime statecharts. Events can be required for a transition to be activated. In this case the event is considered to be a trigger event. Events can also be sent when a transition is activated. Those events are considered as raised events.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRealtimeEvent()
 * @model
 * @generated
 */
public interface RealtimeEvent extends MethodCallExpression {
	/**
	 * Returns the value of the '<em><b>Triggered UML Realtime Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTriggerEvents <em>Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this events belongs to as trigger event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggered UML Realtime Transition</em>' container reference.
	 * @see #setTriggeredUMLRealtimeTransition(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRealtimeEvent_TriggeredUMLRealtimeTransition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getTriggerEvents
	 * @model opposite="triggerEvents" transient="false"
	 * @generated
	 */
	Transition getTriggeredUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered UML Realtime Transition</em>' container reference.
	 * @see #getTriggeredUMLRealtimeTransition()
	 * @generated
	 */
	void setTriggeredUMLRealtimeTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Raised UML Realtime Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRaisedEvents <em>Raised Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this event belongs to as raised event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised UML Realtime Transition</em>' container reference.
	 * @see #setRaisedUMLRealtimeTransition(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRealtimeEvent_RaisedUMLRealtimeTransition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRaisedEvents
	 * @model opposite="raisedEvents" transient="false"
	 * @generated
	 */
	Transition getRaisedUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised UML Realtime Transition</em>' container reference.
	 * @see #getRaisedUMLRealtimeTransition()
	 * @generated
	 */
	void setRaisedUMLRealtimeTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name is to be derived from the corresponding message type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRealtimeEvent_Name()
	 * @model derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Full Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full event name is to be derived by the corresponding message type prefixed with the name of the message interface that defines the message type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Event Name</em>' attribute.
	 * @see #setFullEventName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRealtimeEvent_FullEventName()
	 * @model
	 * @generated
	 */
	String getFullEventName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent#getFullEventName <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Event Name</em>' attribute.
	 * @see #getFullEventName()
	 * @generated
	 */
	void setFullEventName(String value);

} // RealtimeEvent
