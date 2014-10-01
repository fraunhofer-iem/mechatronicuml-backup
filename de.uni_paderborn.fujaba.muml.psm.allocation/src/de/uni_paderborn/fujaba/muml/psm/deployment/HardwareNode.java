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

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A run-time computational resource which generally has at least memory and processing capabilities. 
 * Component instances may reside on hardware nodes if they are not a sensor or an actor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getDeployedInstances <em>Deployed Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getHardwareNodeKind <em>Hardware Node Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwareNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoDeploymentOnActorOrSensor='(self.hardwareNodeKind <> deployment::HardwareNodeKind::COMPUTATIONAL_RESOURCE) implies self.deployedInstances->isEmpty()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoDeploymentOnActorOrSensor'"
 * @generated
 */
public interface HardwareNode extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deployment which contains the HardwareNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwareNode_Deployment()
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.Deployment#getHardwareNodes
	 * @model opposite="hardwareNodes" required="true" transient="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Hardware Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A HardwareNode contains HardwarePorts to communicate with other HardwarePorts via a CommunicationLink.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwareNode_HardwarePorts()
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort#getHardwareNode
	 * @model opposite="hardwareNode" containment="true"
	 * @generated
	 */
	EList<HardwarePort> getHardwarePorts();

	/**
	 * Returns the value of the '<em><b>Deployed Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ComponentInstances which are deployed to the HardwareNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwareNode_DeployedInstances()
	 * @model
	 * @generated
	 */
	EList<ComponentInstance> getDeployedInstances();

	/**
	 * Returns the value of the '<em><b>Hardware Node Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNodeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Node Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A HardwareNode is kind of a computational resource, a sensor, an actor, or a communication device like a router.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Node Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNodeKind
	 * @see #setHardwareNodeKind(HardwareNodeKind)
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwareNode_HardwareNodeKind()
	 * @model
	 * @generated
	 */
	HardwareNodeKind getHardwareNodeKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode#getHardwareNodeKind <em>Hardware Node Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Node Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNodeKind
	 * @see #getHardwareNodeKind()
	 * @generated
	 */
	void setHardwareNodeKind(HardwareNodeKind value);

} // HardwareNode
