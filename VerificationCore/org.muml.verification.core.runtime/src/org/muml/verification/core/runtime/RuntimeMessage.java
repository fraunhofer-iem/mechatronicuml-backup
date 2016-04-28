/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeMessage#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.RuntimeMessage#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessage()
 * @model
 * @generated
 */
public interface RuntimeMessage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.verification.core.runtime.RuntimeParameter}.
	 * It is bidirectional and its opposite is '{@link org.muml.verification.core.runtime.RuntimeParameter#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessage_Parameters()
	 * @see org.muml.verification.core.runtime.RuntimeParameter#getMessage
	 * @model opposite="message" containment="true"
	 * @generated
	 */
	EList<RuntimeParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MessageType)
	 * @see org.muml.verification.core.runtime.RuntimePackage#getRuntimeMessage_Type()
	 * @model
	 * @generated
	 */
	MessageType getType();

	/**
	 * Sets the value of the '{@link org.muml.verification.core.runtime.RuntimeMessage#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageType value);

} // RuntimeMessage
