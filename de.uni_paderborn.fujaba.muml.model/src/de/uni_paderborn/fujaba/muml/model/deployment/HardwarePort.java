/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort()
 * @model
 * @generated
 */
public interface HardwarePort extends NamedElement, CommentableElement {
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
	 * Returns the value of the '<em><b>Outgoing Communication Link</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Communication Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Communication Link</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_OutgoingCommunicationLink()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<CommunicationLink> getOutgoingCommunicationLink();

	/**
	 * Returns the value of the '<em><b>Incoming Communication Link</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Communication Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Communication Link</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_IncomingCommunicationLink()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<CommunicationLink> getIncomingCommunicationLink();

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

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind
	 * @see #setKind(HardwarePortDirectionKind)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwarePort_Kind()
	 * @model default=""
	 * @generated
	 */
	HardwarePortDirectionKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(HardwarePortDirectionKind value);

} // HardwarePort
