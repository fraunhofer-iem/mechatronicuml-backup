/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
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

} // Deployment
