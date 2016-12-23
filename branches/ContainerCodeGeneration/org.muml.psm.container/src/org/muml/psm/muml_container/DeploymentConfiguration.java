/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.muml.psm.allocation.SystemAllocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.DeploymentConfiguration#getSystemAllocation <em>System Allocation</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.DeploymentConfiguration#getEcuConfigurations <em>Ecu Configurations</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getDeploymentConfiguration()
 * @model
 * @generated
 */
public interface DeploymentConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>System Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Allocation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Allocation</em>' reference.
	 * @see #setSystemAllocation(SystemAllocation)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getDeploymentConfiguration_SystemAllocation()
	 * @model ordered="false"
	 * @generated
	 */
	SystemAllocation getSystemAllocation();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.DeploymentConfiguration#getSystemAllocation <em>System Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Allocation</em>' reference.
	 * @see #getSystemAllocation()
	 * @generated
	 */
	void setSystemAllocation(SystemAllocation value);

	/**
	 * Returns the value of the '<em><b>Ecu Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.muml_container.ECUConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecu Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecu Configurations</em>' containment reference list.
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getDeploymentConfiguration_EcuConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ECUConfiguration> getEcuConfigurations();

} // DeploymentConfiguration
