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

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deployment exists in the software lifecycle to bridge the gap between what a software developer could know about the execution environment and what the environment's developer could know about the deployable software.\footnote{C. Szyperski, Foreword to Proceedings of Component Deployment, IFIP/ACM Working Conference, Berlin 2002}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices <em>Quality Of Link Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Communication Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Deployment contains CommunicationLinks which are used to connect HardwarePorts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Links</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getDeployment_CommunicationLinks()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink#getDeployment
	 * @model opposite="deployment" containment="true"
	 * @generated
	 */
	EList<CommunicationLink> getCommunicationLinks();

	/**
	 * Returns the value of the '<em><b>Hardware Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Deployment contains HardwareNodes which represents hardware resources like computational, communication, sensor, or actor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Nodes</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getDeployment_HardwareNodes()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode#getDeployment
	 * @model opposite="deployment" containment="true" required="true"
	 * @generated
	 */
	EList<HardwareNode> getHardwareNodes();

	/**
	 * Returns the value of the '<em><b>Component Instance Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The componentInstanceConfiguration which contains the component instances which should be deployed to hardware nodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instance Configuration</em>' reference.
	 * @see #setComponentInstanceConfiguration(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getDeployment_ComponentInstanceConfiguration()
	 * @model
	 * @generated
	 */
	ComponentInstanceConfiguration getComponentInstanceConfiguration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance Configuration</em>' reference.
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	void setComponentInstanceConfiguration(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Quality Of Link Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Of Link Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to all contained quality of services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality Of Link Services</em>' containment reference.
	 * @see #setQualityOfLinkServices(LinkQualityOfService)
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getDeployment_QualityOfLinkServices()
	 * @see de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService#getDeployment
	 * @model opposite="deployment" containment="true"
	 * @generated
	 */
	LinkQualityOfService getQualityOfLinkServices();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getQualityOfLinkServices <em>Quality Of Link Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Of Link Services</em>' containment reference.
	 * @see #getQualityOfLinkServices()
	 * @generated
	 */
	void setQualityOfLinkServices(LinkQualityOfService value);

} // Deployment
