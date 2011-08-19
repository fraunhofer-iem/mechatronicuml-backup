/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Message Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AsynchronousMessageEvent is a TransitionEvent that corresponds to 
 * receiving or sending a message. They are used to model asynchronous 
 * communication between realtime statecharts. A trigger events specifies
 * that the corresponding message has to be received for the transition to be
 * enabled, a raised event specifies that the corresponding message will be 
 * sent upon execution of the transition. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getAsynchronousMessageEvent()
 * @model
 * @generated
 */
public interface AsynchronousMessageEvent extends TransitionEvent {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message associated with this event. The message is either requested to be
	 * received (trigger event) or it will be sent (raise event).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getAsynchronousMessageEvent_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // AsynchronousMessageEvent
