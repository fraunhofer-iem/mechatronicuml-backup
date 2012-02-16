/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hardware ports  are used to communicate
 * with other hardware nodes and with component instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getOutgoingCommunicationLink <em>Outgoing Communication Link</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getIncomingCommunicationLink <em>Incoming Communication Link</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getDeployedPortInstance <em>Deployed Port Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort()
 * @model
 * @generated
 */
public interface HardwarePort extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Node</em>' container reference.
	 * @see #setHardwareNode(HardwareNode)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_HardwareNode()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwarePorts
	 * @model opposite="hardwarePorts" required="true" transient="false"
	 * @generated
	 */
	HardwareNode getHardwareNode();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Node</em>' container reference.
	 * @see #getHardwareNode()
	 * @generated
	 */
	void setHardwareNode(HardwareNode value);

	/**
	 * Returns the value of the '<em><b>Outgoing Communication Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Communication Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Communication Link</em>' reference.
	 * @see #setOutgoingCommunicationLink(CommunicationLink)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_OutgoingCommunicationLink()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	CommunicationLink getOutgoingCommunicationLink();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getOutgoingCommunicationLink <em>Outgoing Communication Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Communication Link</em>' reference.
	 * @see #getOutgoingCommunicationLink()
	 * @generated
	 */
	void setOutgoingCommunicationLink(CommunicationLink value);

	/**
	 * Returns the value of the '<em><b>Incoming Communication Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Communication Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Communication Link</em>' reference.
	 * @see #setIncomingCommunicationLink(CommunicationLink)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_IncomingCommunicationLink()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	CommunicationLink getIncomingCommunicationLink();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getIncomingCommunicationLink <em>Incoming Communication Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Communication Link</em>' reference.
	 * @see #getIncomingCommunicationLink()
	 * @generated
	 */
	void setIncomingCommunicationLink(CommunicationLink value);

	/**
	 * Returns the value of the '<em><b>Deployed Port Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Port Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Port Instance</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_DeployedPortInstance()
	 * @model
	 * @generated
	 */
	EList<PortInstance> getDeployedPortInstance();

} // HardwarePort
