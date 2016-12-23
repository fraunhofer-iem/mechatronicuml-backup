/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeBehavioralElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ElementMustNotContainMessageBuffers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ElementMustNotContainMessageBuffers='if(self.oclIsTypeOf(RuntimeComponentInstance) or self.oclIsTypeOf(MultiRoleInstance) or self.oclIsTypeOf(RuntimeDiscreteMultiPortInstance))\r\nthen messageBuffer->size() = 0\r\nelse true\r\nendif'"
 * @generated
 */
public interface RuntimeBehavioralElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart Instance</em>' reference.
	 * @see #setStatechartInstance(RealtimeStatechartInstance)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeBehavioralElement_StatechartInstance()
	 * @see org.muml.verification.core.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement
	 * @model opposite="runtimeBehavioralElement"
	 * @generated
	 */
	RealtimeStatechartInstance getStatechartInstance();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart Instance</em>' reference.
	 * @see #getStatechartInstance()
	 * @generated
	 */
	void setStatechartInstance(RealtimeStatechartInstance value);

	/**
	 * Returns the value of the '<em><b>Message Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.verification.core.runtime.RuntimeMessageBuffer}.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Buffer</em>' containment reference list.
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeBehavioralElement_MessageBuffer()
	 * @see org.muml.verification.core.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement
	 * @model opposite="runtimeBehavioralElement" containment="true"
	 * @generated
	 */
	EList<RuntimeMessageBuffer> getMessageBuffer();

} // RuntimeBehavioralElement
