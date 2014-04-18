/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage
 * @generated
 */
public interface HwplatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwplatformFactory eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HW Platform Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Configuration</em>'.
	 * @generated
	 */
	HWPlatformConfiguration createHWPlatformConfiguration();

	/**
	 * Returns a new object of class '<em>HW Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform</em>'.
	 * @generated
	 */
	HWPlatform createHWPlatform();

	/**
	 * Returns a new object of class '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Part</em>'.
	 * @generated
	 */
	HWPlatformPart createHWPlatformPart();

	/**
	 * Returns a new object of class '<em>Resource Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Part</em>'.
	 * @generated
	 */
	ResourcePart createResourcePart();

	/**
	 * Returns a new object of class '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation</em>'.
	 * @generated
	 */
	Delegation createDelegation();

	/**
	 * Returns a new object of class '<em>Delegation HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation HW Port</em>'.
	 * @generated
	 */
	DelegationHWPort createDelegationHWPort();

	/**
	 * Returns a new object of class '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Port Part</em>'.
	 * @generated
	 */
	HWPortPart createHWPortPart();

	/**
	 * Returns a new object of class '<em>Bus Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Connector</em>'.
	 * @generated
	 */
	BusConnector createBusConnector();

	/**
	 * Returns a new object of class '<em>Bus Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Part</em>'.
	 * @generated
	 */
	BusPart createBusPart();

	/**
	 * Returns a new object of class '<em>Link Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Part</em>'.
	 * @generated
	 */
	LinkPart createLinkPart();

	/**
	 * Returns a new object of class '<em>Bridge Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bridge Part</em>'.
	 * @generated
	 */
	BridgePart createBridgePart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwplatformPackage getHwplatformPackage();

} //HwplatformFactory
