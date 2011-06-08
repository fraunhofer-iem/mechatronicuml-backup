/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.component.Port;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A port instance is a port of a component at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getIncomingConnectorInstances <em>Incoming Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getOutgoingConnectorInstances <em>Outgoing Connector Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance()
 * @model
 * @generated
 */
public interface PortInstance extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port type of which this port instance is built from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(Port)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance_PortType()
	 * @model required="true"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(Port value);

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instance this port instance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instance</em>' container reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance_ComponentInstance()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getPortInstances
	 * @model opposite="portInstances" required="true" transient="false"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getComponentInstance <em>Component Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' container reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Sender Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required message interface derived from the port type of this port instance.
	 * \todosd{Uwe and my oponion: rename to senderMessageInterface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Interface</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance_SenderMessageInterface()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() then\n\tnull\nelse\n\tportType.requiredMessageInterface\nendif'"
	 * @generated
	 */
	MessageInterface getSenderMessageInterface();

	/**
	 * Returns the value of the '<em><b>Receiver Message Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provided message interface derived from the port type of this port instance.
	 * \todosd{Uwe and my oponion: rename to receiverMessageInterface}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Interface</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance_ReceiverMessageInterface()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if portType.oclIsUndefined() then\n\tnull\nelse\n\tportType.providedMessageInterface\nendif'"
	 * @generated
	 */
	MessageInterface getReceiverMessageInterface();

	/**
	 * Returns the value of the '<em><b>Incoming Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector instances that lead into this port instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Connector Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance_IncomingConnectorInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ConnectorInstance> getIncomingConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Outgoing Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector instances that origin from this port instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Connector Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortInstance_OutgoingConnectorInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ConnectorInstance> getOutgoingConnectorInstances();

} // PortInstance
