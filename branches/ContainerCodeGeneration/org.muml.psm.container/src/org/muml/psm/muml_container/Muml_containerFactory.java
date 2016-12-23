/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.muml_container.Muml_containerPackage
 * @generated
 */
public interface Muml_containerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Muml_containerFactory eINSTANCE = org.muml.psm.muml_container.impl.Muml_containerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Container</em>'.
	 * @generated
	 */
	ComponentContainer createComponentContainer();

	/**
	 * Returns a new object of class '<em>Container Component Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Component Instance Configuration</em>'.
	 * @generated
	 */
	ContainerComponentInstanceConfiguration createContainerComponentInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>Port Instance Configuration Local</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance Configuration Local</em>'.
	 * @generated
	 */
	PortInstanceConfiguration_Local createPortInstanceConfiguration_Local();

	/**
	 * Returns a new object of class '<em>Port Instance Configuration DDS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance Configuration DDS</em>'.
	 * @generated
	 */
	PortInstanceConfiguration_DDS createPortInstanceConfiguration_DDS();

	/**
	 * Returns a new object of class '<em>ECU Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECU Configuration</em>'.
	 * @generated
	 */
	ECUConfiguration createECUConfiguration();

	/**
	 * Returns a new object of class '<em>Multi Port Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Port Instance Configuration</em>'.
	 * @generated
	 */
	MultiPortInstanceConfiguration createMultiPortInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>Deployment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Configuration</em>'.
	 * @generated
	 */
	DeploymentConfiguration createDeploymentConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Muml_containerPackage getMuml_containerPackage();

} //Muml_containerFactory
