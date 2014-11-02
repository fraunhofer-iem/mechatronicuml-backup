/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.psm.deployment;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getDeployedPortInstance <em>Deployed Port Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getCommunicationLinks <em>Communication Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwarePort()
 * @model
 * @generated
 */
public interface HardwarePort extends NamedElement, CommentableElement, ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Hardware Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hardware nodes are hardware elements on which port instances could be deployed if they are not a sensor or an actor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Node</em>' container reference.
	 * @see #setHardwareNode(HardwareNode)
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwarePort_HardwareNode()
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getHardwarePorts
	 * @model opposite="hardwarePorts" required="true" transient="false"
	 * @generated
	 */
	HardwareNode getHardwareNode();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Node</em>' container reference.
	 * @see #getHardwareNode()
	 * @generated
	 */
	void setHardwareNode(HardwareNode value);

	/**
	 * Returns the value of the '<em><b>Deployed Port Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Port Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PortInstances which are deployed to the HardwarePort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Port Instance</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwarePort_DeployedPortInstance()
	 * @model
	 * @generated
	 */
	EList<PortInstance> getDeployedPortInstance();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"IN_OUT"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePortDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A HardwarePort is of kind in, out, or in/out. 
	 * Depending on its kind it can receive, send, or receive and send messages. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePortDirectionKind
	 * @see #setKind(HardwarePortDirectionKind)
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwarePort_Kind()
	 * @model default="IN_OUT"
	 * @generated
	 */
	HardwarePortDirectionKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePortDirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(HardwarePortDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Communication Links</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationLinks which have the HardwarePort as connector endpoints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Links</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwarePort_CommunicationLinks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c | c.oclIsTypeOf(CommunicationLink)).oclAsType(CommunicationLink)->asOrderedSet()'"
	 * @generated
	 */
	EList<CommunicationLink> getCommunicationLinks();

} // HardwarePort
