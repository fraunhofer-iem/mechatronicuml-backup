/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.psm.deployment;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A communication link between hardware nodes and a target used for the deployment of connectors between component instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink#getQualityOfService <em>Quality Of Service</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink#getDeployedAssemblyInstances <em>Deployed Assembly Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink#getHardwarePorts <em>Hardware Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getCommunicationLink()
 * @model
 * @generated
 */
public interface CommunicationLink extends ExtendableElement, Connector {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment to which the link belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getCommunicationLink_Deployment()
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.Deployment#getCommunicationLinks
	 * @model opposite="communicationLinks" required="true" transient="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Quality Of Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Of Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quality of service which the link fullfills. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality Of Service</em>' reference.
	 * @see #setQualityOfService(LinkQualityOfService)
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getCommunicationLink_QualityOfService()
	 * @model
	 * @generated
	 */
	LinkQualityOfService getQualityOfService();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink#getQualityOfService <em>Quality Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Of Service</em>' reference.
	 * @see #getQualityOfService()
	 * @generated
	 */
	void setQualityOfService(LinkQualityOfService value);

	/**
	 * Returns the value of the '<em><b>Deployed Assembly Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for the deployment of connectors between component instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Assembly Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getCommunicationLink_DeployedAssemblyInstances()
	 * @model
	 * @generated
	 */
	EList<AssemblyConnectorInstance> getDeployedAssemblyInstances();

	/**
	 * Returns the value of the '<em><b>Hardware Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.deployment.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derives all hardware ports which are endpoints of the communication link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getCommunicationLink_HardwarePorts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsTypeOf(HardwarePort)).oclAsType(HardwarePort)->asOrderedSet()'"
	 * @generated
	 */
	EList<HardwarePort> getHardwarePorts();

} // CommunicationLink
