/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getSize <em>Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageBuffer()
 * @model
 * @generated
 */
public interface MessageBuffer extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageBuffer_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageBuffer_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeMessage> getMessages();

	/**
	 * Returns the value of the '<em><b>Runtime Behavioral Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Behavioral Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Behavioral Element</em>' container reference.
	 * @see #setRuntimeBehavioralElement(RuntimeBehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageBuffer_RuntimeBehavioralElement()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement#getMessageBuffer
	 * @model opposite="messageBuffer" required="true" transient="false"
	 * @generated
	 */
	RuntimeBehavioralElement getRuntimeBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Behavioral Element</em>' container reference.
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	void setRuntimeBehavioralElement(RuntimeBehavioralElement value);

} // MessageBuffer
