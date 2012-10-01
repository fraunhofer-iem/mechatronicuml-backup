/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getMessageQueue <em>Message Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeBehavioralElement()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeBehavioralElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart Instance</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart Instance</em>' containment reference.
	 * @see #setStatechartInstance(RealtimeStatechartInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeBehavioralElement_StatechartInstance()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement
	 * @model opposite="runtimeBehavioralElement" containment="true"
	 * @generated
	 */
	RealtimeStatechartInstance getStatechartInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart Instance</em>' containment reference.
	 * @see #getStatechartInstance()
	 * @generated
	 */
	void setStatechartInstance(RealtimeStatechartInstance value);

	/**
	 * Returns the value of the '<em><b>Message Queue</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue</em>' containment reference.
	 * @see #setMessageQueue(MessageBuffer)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeBehavioralElement_MessageQueue()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getRuntimeBehavioralElement
	 * @model opposite="runtimeBehavioralElement" containment="true"
	 * @generated
	 */
	MessageBuffer getMessageQueue();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getMessageQueue <em>Message Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Queue</em>' containment reference.
	 * @see #getMessageQueue()
	 * @generated
	 */
	void setMessageQueue(MessageBuffer value);

} // RuntimeBehavioralElement
