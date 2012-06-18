/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
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
 *   <li>{@link deployment.Deployment#getHardwareNodes <em>Hardware Nodes</em>}</li>
 *   <li>{@link deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link deployment.Deployment#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link deployment.Deployment#getComponentInstance <em>Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see deployment.DeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.HardwareNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Nodes</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getDeployment_HardwareNodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HardwareNode> getHardwareNodes();

	/**
	 * Returns the value of the '<em><b>Component Instance Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance Configuration</em>' containment reference.
	 * @see #setComponentInstanceConfiguration(ComponentInstanceConfiguration)
	 * @see deployment.DeploymentPackage#getDeployment_ComponentInstanceConfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getComponentInstanceConfiguration();

	/**
	 * Sets the value of the '{@link deployment.Deployment#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance Configuration</em>' containment reference.
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	void setComponentInstanceConfiguration(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Communication Links</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.CommunicationLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Links</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getDeployment_CommunicationLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationLink> getCommunicationLinks();

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' containment reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see deployment.DeploymentPackage#getDeployment_ComponentInstance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link deployment.Deployment#getComponentInstance <em>Component Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' containment reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

} // Deployment
