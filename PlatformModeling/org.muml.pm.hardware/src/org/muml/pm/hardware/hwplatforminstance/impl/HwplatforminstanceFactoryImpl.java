/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pm.hardware.hwplatforminstance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwplatforminstanceFactoryImpl extends EFactoryImpl implements HwplatforminstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwplatforminstanceFactory init() {
		try {
			HwplatforminstanceFactory theHwplatforminstanceFactory = (HwplatforminstanceFactory)EPackage.Registry.INSTANCE.getEFactory(HwplatforminstancePackage.eNS_URI);
			if (theHwplatforminstanceFactory != null) {
				return theHwplatforminstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwplatforminstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatforminstanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE: return createHWPlatformInstance();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION: return createHWPlatformInstanceConfiguration();
			case HwplatforminstancePackage.HW_PORT_INSTANCE: return createHWPortInstance();
			case HwplatforminstancePackage.BUS_INSTANCE: return createBusInstance();
			case HwplatforminstancePackage.NETWORK_BRIDGE_INSTANCE: return createNetworkBridgeInstance();
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE: return createDelegationHWPortInstance();
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE: return createNetworkConnectorInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstance createHWPlatformInstance() {
		HWPlatformInstanceImpl hwPlatformInstance = new HWPlatformInstanceImpl();
		return hwPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration createHWPlatformInstanceConfiguration() {
		HWPlatformInstanceConfigurationImpl hwPlatformInstanceConfiguration = new HWPlatformInstanceConfigurationImpl();
		return hwPlatformInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance createHWPortInstance() {
		HWPortInstanceImpl hwPortInstance = new HWPortInstanceImpl();
		return hwPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInstance createBusInstance() {
		BusInstanceImpl busInstance = new BusInstanceImpl();
		return busInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkBridgeInstance createNetworkBridgeInstance() {
		NetworkBridgeInstanceImpl networkBridgeInstance = new NetworkBridgeInstanceImpl();
		return networkBridgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationHWPortInstance createDelegationHWPortInstance() {
		DelegationHWPortInstanceImpl delegationHWPortInstance = new DelegationHWPortInstanceImpl();
		return delegationHWPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnectorInstance createNetworkConnectorInstance() {
		NetworkConnectorInstanceImpl networkConnectorInstance = new NetworkConnectorInstanceImpl();
		return networkConnectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatforminstancePackage getHwplatforminstancePackage() {
		return (HwplatforminstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HwplatforminstancePackage getPackage() {
		return HwplatforminstancePackage.eINSTANCE;
	}

} //HwplatforminstanceFactoryImpl
