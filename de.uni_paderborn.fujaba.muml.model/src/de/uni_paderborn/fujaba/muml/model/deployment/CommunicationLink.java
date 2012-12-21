/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getQualityOfService <em>Quality Of Service</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployedAssemblyInstances <em>Deployed Assembly Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getCommunicationLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameConfiguration='self.deployedAssemblyInstances.componentInstanceConfiguration=self.deployment.componentInstanceConfiguration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 * @generated
 */
public interface CommunicationLink extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}'.
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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getCommunicationLink_Deployment()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getCommunicationLinks
	 * @model opposite="communicationLinks" required="true" transient="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getOutgoingCommunicationLink <em>Outgoing Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source HardwarePort of the link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(HardwarePort)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getCommunicationLink_Source()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getOutgoingCommunicationLink
	 * @model opposite="outgoingCommunicationLink" required="true"
	 * @generated
	 */
	HardwarePort getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(HardwarePort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getIncomingCommunicationLink <em>Incoming Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target HardwarePort of the link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(HardwarePort)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getCommunicationLink_Target()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort#getIncomingCommunicationLink
	 * @model opposite="incomingCommunicationLink" required="true"
	 * @generated
	 */
	HardwarePort getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(HardwarePort value);

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
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getCommunicationLink_QualityOfService()
	 * @model
	 * @generated
	 */
	LinkQualityOfService getQualityOfService();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getQualityOfService <em>Quality Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Of Service</em>' reference.
	 * @see #getQualityOfService()
	 * @generated
	 */
	void setQualityOfService(LinkQualityOfService value);

	/**
	 * Returns the value of the '<em><b>Deployed Assembly Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for the deployment of connectors between component instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Assembly Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getCommunicationLink_DeployedAssemblyInstances()
	 * @model
	 * @generated
	 */
	EList<AssemblyConnectorInstance> getDeployedAssemblyInstances();

} // CommunicationLink
