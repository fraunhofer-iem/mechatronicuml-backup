/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getHardwarePorts <em>Hardware Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployedInstances <em>Deployed Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwareNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameConfiguration='self.deployedInstance.componentInstanceConfiguration=self.deployment.componentInstanceConfiguration'"
 * @generated
 */
public interface HardwareNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwareNode_Deployment()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getHardwareNodes
	 * @model opposite="hardwareNodes" required="true" transient="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Hardware Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getHardwareNode <em>Hardware Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwareNode_HardwarePorts()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getHardwareNode
	 * @model opposite="hardwareNode" containment="true"
	 * @generated
	 */
	EList<HardwarePort> getHardwarePorts();

	/**
	 * Returns the value of the '<em><b>Deployed Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getHardwareNode_DeployedInstances()
	 * @model
	 * @generated
	 */
	EList<ComponentInstance> getDeployedInstances();

} // HardwareNode
