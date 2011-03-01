/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.calls.expressions.MethodCallExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Realtime Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an event. Events are associated with transitions. They are instances of certain message types. Events are used to model asynchronous communication between realtime statecharts. Events can be required for a transition to be activated. In this case the event is considered to be a trigger event. Events can also be sent when a transition is activated. Those events are considered as raised events.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getFullEventName <em>Full Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeEvent()
 * @model
 * @generated
 */
public interface UMLRealtimeEvent extends MethodCallExpression {
	/**
	 * Returns the value of the '<em><b>Triggered UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this events belongs to as trigger event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggered UML Realtime Transition</em>' reference.
	 * @see #setTriggeredUMLRealtimeTransition(UMLRealtimeTransition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeEvent_TriggeredUMLRealtimeTransition()
	 * @model
	 * @generated
	 */
	UMLRealtimeTransition getTriggeredUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getTriggeredUMLRealtimeTransition <em>Triggered UML Realtime Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered UML Realtime Transition</em>' reference.
	 * @see #getTriggeredUMLRealtimeTransition()
	 * @generated
	 */
	void setTriggeredUMLRealtimeTransition(UMLRealtimeTransition value);

	/**
	 * Returns the value of the '<em><b>Raised UML Realtime Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this event belongs to as raised event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised UML Realtime Transition</em>' reference.
	 * @see #setRaisedUMLRealtimeTransition(UMLRealtimeTransition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeEvent_RaisedUMLRealtimeTransition()
	 * @model
	 * @generated
	 */
	UMLRealtimeTransition getRaisedUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getRaisedUMLRealtimeTransition <em>Raised UML Realtime Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raised UML Realtime Transition</em>' reference.
	 * @see #getRaisedUMLRealtimeTransition()
	 * @generated
	 */
	void setRaisedUMLRealtimeTransition(UMLRealtimeTransition value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: What's this good for?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeEvent_Instance()
	 * @model
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name is to be derived from the corresponding message type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeEvent_Name()
	 * @model derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getName <em>Name</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeEvent_FullEventName()
	 * @model
	 * @generated
	 */
	String getFullEventName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent#getFullEventName <em>Full Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Event Name</em>' attribute.
	 * @see #getFullEventName()
	 * @generated
	 */
	void setFullEventName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeEvent newEvent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // UMLRealtimeEvent
