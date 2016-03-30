/**
 */
package org.muml.pm.hardware.hwplatform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pm.hardware.hwplatform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwplatformFactoryImpl extends EFactoryImpl implements HwplatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwplatformFactory init() {
		try {
			HwplatformFactory theHwplatformFactory = (HwplatformFactory)EPackage.Registry.INSTANCE.getEFactory(HwplatformPackage.eNS_URI);
			if (theHwplatformFactory != null) {
				return theHwplatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwplatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatformFactoryImpl() {
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
			case HwplatformPackage.HW_PLATFORM: return createHWPlatform();
			case HwplatformPackage.HW_PLATFORM_PART: return createHWPlatformPart();
			case HwplatformPackage.RESOURCE_PART: return createResourcePart();
			case HwplatformPackage.DELEGATION_HW_PORT: return createDelegationHWPort();
			case HwplatformPackage.HW_PORT_PART: return createHWPortPart();
			case HwplatformPackage.BUS: return createBus();
			case HwplatformPackage.NETWORK_BRIDGE: return createNetworkBridge();
			case HwplatformPackage.NETWORK_CONNECTOR: return createNetworkConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform createHWPlatform() {
		HWPlatformImpl hwPlatform = new HWPlatformImpl();
		return hwPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformPart createHWPlatformPart() {
		HWPlatformPartImpl hwPlatformPart = new HWPlatformPartImpl();
		return hwPlatformPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePart createResourcePart() {
		ResourcePartImpl resourcePart = new ResourcePartImpl();
		return resourcePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationHWPort createDelegationHWPort() {
		DelegationHWPortImpl delegationHWPort = new DelegationHWPortImpl();
		return delegationHWPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortPart createHWPortPart() {
		HWPortPartImpl hwPortPart = new HWPortPartImpl();
		return hwPortPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkBridge createNetworkBridge() {
		NetworkBridgeImpl networkBridge = new NetworkBridgeImpl();
		return networkBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnector createNetworkConnector() {
		NetworkConnectorImpl networkConnector = new NetworkConnectorImpl();
		return networkConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatformPackage getHwplatformPackage() {
		return (HwplatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HwplatformPackage getPackage() {
		return HwplatformPackage.eINSTANCE;
	}

} //HwplatformFactoryImpl
