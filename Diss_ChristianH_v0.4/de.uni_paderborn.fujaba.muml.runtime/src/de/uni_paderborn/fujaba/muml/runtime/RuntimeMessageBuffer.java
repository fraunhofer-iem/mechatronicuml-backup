/**
 */
package de.uni_paderborn.fujaba.muml.runtime;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessageBuffer()
 * @model
 * @generated
 */
public interface RuntimeMessageBuffer extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(int)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessageBuffer_BufferSize()
	 * @model
	 * @generated
	 */
	int getBufferSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessageBuffer_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeMessage> getMessages();

	/**
	 * Returns the value of the '<em><b>Runtime Behavioral Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getMessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Behavioral Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Behavioral Element</em>' container reference.
	 * @see #setRuntimeBehavioralElement(RuntimeBehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRuntimeMessageBuffer_RuntimeBehavioralElement()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getMessageBuffer
	 * @model opposite="messageBuffer" required="true" transient="false"
	 * @generated
	 */
	RuntimeBehavioralElement getRuntimeBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Behavioral Element</em>' container reference.
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	void setRuntimeBehavioralElement(RuntimeBehavioralElement value);

} // RuntimeMessageBuffer
