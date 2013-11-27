/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.msgtype;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message type defines the signature of one event. That includes the name
 * of the event as well as the ordered list of parameters. In addition, a message
 * type is contained in a message type repository.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.msgtype.MessageType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.msgtype.MessageType#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage#getMessageType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueParameterNames='self.parameters->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames'"
 * @generated
 */
public interface MessageType extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference defines the set of parameters of this message type. A parameter defines a unique name and a DataType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage#getMessageType_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message type repository that contains this message type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(MessageTypeRepository)
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage#getMessageType_Repository()
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository#getMessageTypes
	 * @model opposite="messageTypes" required="true" transient="false"
	 * @generated
	 */
	MessageTypeRepository getRepository();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.msgtype.MessageType#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(MessageTypeRepository value);

} // MessageType
