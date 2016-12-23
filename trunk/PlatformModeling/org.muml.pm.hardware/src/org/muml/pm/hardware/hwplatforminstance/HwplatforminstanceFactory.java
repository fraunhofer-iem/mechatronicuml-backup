/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage
 * @generated
 */
public interface HwplatforminstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwplatforminstanceFactory eINSTANCE = org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HW Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Instance</em>'.
	 * @generated
	 */
	HWPlatformInstance createHWPlatformInstance();

	/**
	 * Returns a new object of class '<em>HW Platform Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Platform Instance Configuration</em>'.
	 * @generated
	 */
	HWPlatformInstanceConfiguration createHWPlatformInstanceConfiguration();

	/**
	 * Returns a new object of class '<em>HW Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Port Instance</em>'.
	 * @generated
	 */
	HWPortInstance createHWPortInstance();

	/**
	 * Returns a new object of class '<em>Bus Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Instance</em>'.
	 * @generated
	 */
	BusInstance createBusInstance();

	/**
	 * Returns a new object of class '<em>Network Bridge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Bridge Instance</em>'.
	 * @generated
	 */
	NetworkBridgeInstance createNetworkBridgeInstance();

	/**
	 * Returns a new object of class '<em>Delegation HW Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation HW Port Instance</em>'.
	 * @generated
	 */
	DelegationHWPortInstance createDelegationHWPortInstance();

	/**
	 * Returns a new object of class '<em>Network Connector Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Connector Instance</em>'.
	 * @generated
	 */
	NetworkConnectorInstance createNetworkConnectorInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwplatforminstancePackage getHwplatforminstancePackage();

} //HwplatforminstanceFactory
