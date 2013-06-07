/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeBehavioralElement()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeBehavioralElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart Instance</em>' reference.
	 * @see #setStatechartInstance(RealtimeStatechartInstance)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeBehavioralElement_StatechartInstance()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement
	 * @model opposite="runtimeBehavioralElement"
	 * @generated
	 */
	RealtimeStatechartInstance getStatechartInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart Instance</em>' reference.
	 * @see #getStatechartInstance()
	 * @generated
	 */
	void setStatechartInstance(RealtimeStatechartInstance value);

	/**
	 * Returns the value of the '<em><b>Message Buffer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Buffer</em>' containment reference.
	 * @see #setMessageBuffer(RuntimeMessageBuffer)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeBehavioralElement_MessageBuffer()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement
	 * @model opposite="runtimeBehavioralElement" containment="true"
	 * @generated
	 */
	RuntimeMessageBuffer getMessageBuffer();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Buffer</em>' containment reference.
	 * @see #getMessageBuffer()
	 * @generated
	 */
	void setMessageBuffer(RuntimeMessageBuffer value);

} // RuntimeBehavioralElement
