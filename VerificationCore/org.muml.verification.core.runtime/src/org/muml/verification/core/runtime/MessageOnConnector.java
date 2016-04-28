/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.muml.mumlcore.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message On Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.MessageOnConnector#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.MessageOnConnector#getMessage <em>Message</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.MessageOnConnector#getRuntimeConnectorInstance <em>Runtime Connector Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.runtime.RuntimePackage#getMessageOnConnector()
 * @model
 * @generated
 */
public interface MessageOnConnector extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(RuntimeBehavioralElement)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getMessageOnConnector_Receiver()
	 * @model required="true"
	 * @generated
	 */
	RuntimeBehavioralElement getReceiver();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.MessageOnConnector#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(RuntimeBehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(RuntimeMessage)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getMessageOnConnector_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuntimeMessage getMessage();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.MessageOnConnector#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(RuntimeMessage value);

	/**
	 * Returns the value of the '<em><b>Runtime Connector Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.RuntimeConnectorInstance#getTransientMessages <em>Transient Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Connector Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Connector Instance</em>' container reference.
	 * @see #setRuntimeConnectorInstance(RuntimeConnectorInstance)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getMessageOnConnector_RuntimeConnectorInstance()
	 * @see org.muml.verification.core.runtime.RuntimeConnectorInstance#getTransientMessages
	 * @model opposite="transientMessages" required="true" transient="false"
	 * @generated
	 */
	RuntimeConnectorInstance getRuntimeConnectorInstance();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.MessageOnConnector#getRuntimeConnectorInstance <em>Runtime Connector Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Connector Instance</em>' container reference.
	 * @see #getRuntimeConnectorInstance()
	 * @generated
	 */
	void setRuntimeConnectorInstance(RuntimeConnectorInstance value);

} // MessageOnConnector
