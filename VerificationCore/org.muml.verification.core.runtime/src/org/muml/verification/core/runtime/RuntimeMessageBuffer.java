/**
 */
package org.muml.verification.core.runtime;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.ExtendableElement;
import org.muml.pim.connector.MessageBuffer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessageBuffer <em>Message Buffer</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessageBuffer()
 * @model
 * @generated
 */
public interface RuntimeMessageBuffer extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.verification.core.runtime.RuntimeMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessageBuffer_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeMessage> getMessages();

	/**
	 * Returns the value of the '<em><b>Runtime Behavioral Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Behavioral Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Behavioral Element</em>' container reference.
	 * @see #setRuntimeBehavioralElement(RuntimeBehavioralElement)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessageBuffer_RuntimeBehavioralElement()
	 * @see org.muml.verification.core.runtime.RuntimeBehavioralElement#getMessageBuffer
	 * @model opposite="messageBuffer" required="true" transient="false"
	 * @generated
	 */
	RuntimeBehavioralElement getRuntimeBehavioralElement();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Behavioral Element</em>' container reference.
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	void setRuntimeBehavioralElement(RuntimeBehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Message Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Buffer</em>' reference.
	 * @see #setMessageBuffer(MessageBuffer)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessageBuffer_MessageBuffer()
	 * @model required="true"
	 * @generated
	 */
	MessageBuffer getMessageBuffer();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeMessageBuffer#getMessageBuffer <em>Message Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Buffer</em>' reference.
	 * @see #getMessageBuffer()
	 * @generated
	 */
	void setMessageBuffer(MessageBuffer value);

} // RuntimeMessageBuffer
