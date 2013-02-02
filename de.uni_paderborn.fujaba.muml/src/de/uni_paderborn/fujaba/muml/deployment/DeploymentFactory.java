/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.deployment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage
 * @generated
 */
public interface DeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentFactory eINSTANCE = de.uni_paderborn.fujaba.muml.deployment.impl.DeploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Hardware Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Node</em>'.
	 * @generated
	 */
	HardwareNode createHardwareNode();

	/**
	 * Returns a new object of class '<em>Hardware Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port</em>'.
	 * @generated
	 */
	HardwarePort createHardwarePort();

	/**
	 * Returns a new object of class '<em>Communication Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link</em>'.
	 * @generated
	 */
	CommunicationLink createCommunicationLink();

	/**
	 * Returns a new object of class '<em>Link Quality Of Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Quality Of Service</em>'.
	 * @generated
	 */
	LinkQualityOfService createLinkQualityOfService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentPackage getDeploymentPackage();

} //DeploymentFactory
