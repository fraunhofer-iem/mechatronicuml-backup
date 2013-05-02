/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessage()
 * @model
 * @generated
 */
public interface RuntimeMessage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessage_Parameters()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeParameter#getMessage
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
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessage_Type()
	 * @model
	 * @generated
	 */
	MessageType getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageType value);

} // RuntimeMessage
