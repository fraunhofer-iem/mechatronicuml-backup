/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case HwplatforminstancePackage.DELEGATION_INSTANCE: return createDelegationInstance();
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE: return createBusConnectorInstance();
			case HwplatforminstancePackage.BUS_INSTANCE: return createBusInstance();
			case HwplatforminstancePackage.LINK_INSTANCE: return createLinkInstance();
			case HwplatforminstancePackage.BRIDGE_INSTANCE: return createBridgeInstance();
			case HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE: return createDelegationHWPortInstance();
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
	public DelegationInstance createDelegationInstance() {
		DelegationInstanceImpl delegationInstance = new DelegationInstanceImpl();
		return delegationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusConnectorInstance createBusConnectorInstance() {
		BusConnectorInstanceImpl busConnectorInstance = new BusConnectorInstanceImpl();
		return busConnectorInstance;
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
	public LinkInstance createLinkInstance() {
		LinkInstanceImpl linkInstance = new LinkInstanceImpl();
		return linkInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeInstance createBridgeInstance() {
		BridgeInstanceImpl bridgeInstance = new BridgeInstanceImpl();
		return bridgeInstance;
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
