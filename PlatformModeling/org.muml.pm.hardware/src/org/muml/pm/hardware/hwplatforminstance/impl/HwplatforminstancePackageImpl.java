/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.impl.HwplatformPackageImpl;
import org.muml.pm.hardware.hwplatforminstance.BusInstance;
import org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstanceFactory;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.NetworkBridgeInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkingHardwareInstance;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import org.muml.pm.hardware.impl.HardwarePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwplatforminstancePackageImpl extends EPackageImpl implements HwplatforminstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformInstanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkBridgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkingHardwareInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationHWPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectorInstanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwplatforminstancePackageImpl() {
		super(eNS_URI, HwplatforminstanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HwplatforminstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwplatforminstancePackage init() {
		if (isInited) return (HwplatforminstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI);

		// Obtain or create and register package
		HwplatforminstancePackageImpl theHwplatforminstancePackage = (HwplatforminstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwplatforminstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwplatforminstancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		ComponentPackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		HwplatformPackageImpl theHwplatformPackage = (HwplatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) instanceof HwplatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) : HwplatformPackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		HwresourcePackageImpl theHwresourcePackage = (HwresourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) instanceof HwresourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) : HwresourcePackage.eINSTANCE);
		HwresourceinstancePackageImpl theHwresourceinstancePackage = (HwresourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) instanceof HwresourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) : HwresourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theHwplatforminstancePackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theHwplatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		theHwresourcePackage.createPackageContents();
		theHwresourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theHwplatforminstancePackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theHwplatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		theHwresourcePackage.initializePackageContents();
		theHwresourceinstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHwplatforminstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwplatforminstancePackage.eNS_URI, theHwplatforminstancePackage);
		return theHwplatforminstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPlatformInstance() {
		return hwPlatformInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_HwplatformType() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_DelegationPorts() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_EmbeddedHPIC() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_ParentHPIC() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPlatformInstanceConfiguration() {
		return hwPlatformInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_HwplatformInstances() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_NetworkingHardwareInstances() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_Resources() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_ParentHWPlatformInstance() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstanceConfiguration_NetworkConnectorInstances() {
		return (EReference)hwPlatformInstanceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPortInstance() {
		return hwPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_ConnectedNetworkConnectorInstances() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPortInstance_IsNetworkInterface() {
		return (EAttribute)hwPortInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusInstance() {
		return busInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInstance_ConnectedHWPortInstances() {
		return (EReference)busInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInstance_BusType() {
		return (EReference)busInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInstance_Protocol() {
		return (EReference)busInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInstance_Bandwidth() {
		return (EReference)busInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkBridgeInstance() {
		return networkBridgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkBridgeInstance_ConnectedNetworkConnectorInstances() {
		return (EReference)networkBridgeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkBridgeInstance_NetworkBridgeType() {
		return (EReference)networkBridgeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkingHardwareInstance() {
		return networkingHardwareInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationHWPortInstance() {
		return delegationHWPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationHWPortInstance_ParentHWPlatformInstance() {
		return (EReference)delegationHWPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkConnectorInstance() {
		return networkConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnectorInstance_ConnectedHWPortInstances() {
		return (EReference)networkConnectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnectorInstance_Protocol() {
		return (EReference)networkConnectorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnectorInstance_Bandwidth() {
		return (EReference)networkConnectorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkConnectorInstance_ConnectorKind() {
		return (EAttribute)networkConnectorInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnectorInstance_NetworkConnectorType() {
		return (EReference)networkConnectorInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatforminstanceFactory getHwplatforminstanceFactory() {
		return (HwplatforminstanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hwPlatformInstanceEClass = createEClass(HW_PLATFORM_INSTANCE);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__DELEGATION_PORTS);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__EMBEDDED_HPIC);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__PARENT_HPIC);

		hwPlatformInstanceConfigurationEClass = createEClass(HW_PLATFORM_INSTANCE_CONFIGURATION);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__RESOURCES);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORK_CONNECTOR_INSTANCES);

		hwPortInstanceEClass = createEClass(HW_PORT_INSTANCE);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES);
		createEAttribute(hwPortInstanceEClass, HW_PORT_INSTANCE__IS_NETWORK_INTERFACE);

		busInstanceEClass = createEClass(BUS_INSTANCE);
		createEReference(busInstanceEClass, BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES);
		createEReference(busInstanceEClass, BUS_INSTANCE__BUS_TYPE);
		createEReference(busInstanceEClass, BUS_INSTANCE__PROTOCOL);
		createEReference(busInstanceEClass, BUS_INSTANCE__BANDWIDTH);

		networkBridgeInstanceEClass = createEClass(NETWORK_BRIDGE_INSTANCE);
		createEReference(networkBridgeInstanceEClass, NETWORK_BRIDGE_INSTANCE__CONNECTED_NETWORK_CONNECTOR_INSTANCES);
		createEReference(networkBridgeInstanceEClass, NETWORK_BRIDGE_INSTANCE__NETWORK_BRIDGE_TYPE);

		networkingHardwareInstanceEClass = createEClass(NETWORKING_HARDWARE_INSTANCE);

		delegationHWPortInstanceEClass = createEClass(DELEGATION_HW_PORT_INSTANCE);
		createEReference(delegationHWPortInstanceEClass, DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE);

		networkConnectorInstanceEClass = createEClass(NETWORK_CONNECTOR_INSTANCE);
		createEReference(networkConnectorInstanceEClass, NETWORK_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES);
		createEReference(networkConnectorInstanceEClass, NETWORK_CONNECTOR_INSTANCE__PROTOCOL);
		createEReference(networkConnectorInstanceEClass, NETWORK_CONNECTOR_INSTANCE__BANDWIDTH);
		createEAttribute(networkConnectorInstanceEClass, NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND);
		createEReference(networkConnectorInstanceEClass, NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		HwplatformPackage theHwplatformPackage = (HwplatformPackage)EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI);
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		HwresourcePackage theHwresourcePackage = (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwPlatformInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformInstanceConfigurationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		hwPortInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		hwPortInstanceEClass.getESuperTypes().add(theHwresourceinstancePackage.getHWPort());
		busInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		busInstanceEClass.getESuperTypes().add(this.getNetworkingHardwareInstance());
		networkBridgeInstanceEClass.getESuperTypes().add(this.getNetworkingHardwareInstance());
		networkBridgeInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		networkingHardwareInstanceEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		delegationHWPortInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		networkConnectorInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(hwPlatformInstanceEClass, HWPlatformInstance.class, "HWPlatformInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformInstance_HwplatformType(), theHwplatformPackage.getHWPlatform(), null, "hwplatformType", null, 1, 1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_DelegationPorts(), this.getDelegationHWPortInstance(), this.getDelegationHWPortInstance_ParentHWPlatformInstance(), "delegationPorts", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_EmbeddedHPIC(), this.getHWPlatformInstanceConfiguration(), this.getHWPlatformInstanceConfiguration_ParentHWPlatformInstance(), "embeddedHPIC", null, 1, 1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_ParentHPIC(), this.getHWPlatformInstanceConfiguration(), this.getHWPlatformInstanceConfiguration_HwplatformInstances(), "parentHPIC", null, 1, 1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformInstanceConfigurationEClass, HWPlatformInstanceConfiguration.class, "HWPlatformInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformInstanceConfiguration_HwplatformInstances(), this.getHWPlatformInstance(), this.getHWPlatformInstance_ParentHPIC(), "hwplatformInstances", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstanceConfiguration_NetworkingHardwareInstances(), this.getNetworkingHardwareInstance(), null, "networkingHardwareInstances", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstanceConfiguration_Resources(), theHwresourceinstancePackage.getResourceInstance(), null, "resources", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstanceConfiguration_ParentHWPlatformInstance(), this.getHWPlatformInstance(), this.getHWPlatformInstance_EmbeddedHPIC(), "parentHWPlatformInstance", null, 0, 1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstanceConfiguration_NetworkConnectorInstances(), this.getNetworkConnectorInstance(), null, "networkConnectorInstances", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortInstanceEClass, HWPortInstance.class, "HWPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPortInstance_ConnectedNetworkConnectorInstances(), this.getNetworkConnectorInstance(), null, "connectedNetworkConnectorInstances", null, 0, -1, HWPortInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPortInstance_IsNetworkInterface(), ecorePackage.getEBoolean(), "isNetworkInterface", null, 1, 1, HWPortInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(busInstanceEClass, BusInstance.class, "BusInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusInstance_ConnectedHWPortInstances(), this.getHWPortInstance(), null, "connectedHWPortInstances", null, 0, -1, BusInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBusInstance_BusType(), theHwplatformPackage.getBus(), null, "busType", null, 1, 1, BusInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBusInstance_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, BusInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBusInstance_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 1, 1, BusInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkBridgeInstanceEClass, NetworkBridgeInstance.class, "NetworkBridgeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkBridgeInstance_ConnectedNetworkConnectorInstances(), this.getNetworkConnectorInstance(), null, "connectedNetworkConnectorInstances", null, 2, -1, NetworkBridgeInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkBridgeInstance_NetworkBridgeType(), theHwplatformPackage.getNetworkBridge(), null, "networkBridgeType", null, 1, 1, NetworkBridgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkingHardwareInstanceEClass, NetworkingHardwareInstance.class, "NetworkingHardwareInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delegationHWPortInstanceEClass, DelegationHWPortInstance.class, "DelegationHWPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationHWPortInstance_ParentHWPlatformInstance(), this.getHWPlatformInstance(), this.getHWPlatformInstance_DelegationPorts(), "parentHWPlatformInstance", null, 1, 1, DelegationHWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkConnectorInstanceEClass, NetworkConnectorInstance.class, "NetworkConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkConnectorInstance_ConnectedHWPortInstances(), this.getHWPortInstance(), null, "connectedHWPortInstances", null, 0, -1, NetworkConnectorInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnectorInstance_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 0, 1, NetworkConnectorInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnectorInstance_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 0, 1, NetworkConnectorInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkConnectorInstance_ConnectorKind(), theHwresourcePackage.getCommunicationKind(), "connectorKind", null, 0, 1, NetworkConnectorInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnectorInstance_NetworkConnectorType(), theHwplatformPackage.getNetworkConnector(), null, "networkConnectorType", null, 0, 1, NetworkConnectorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (getHWPortInstance_ConnectedNetworkConnectorInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorInstances->select(c|c.oclIsKindOf(NetworkConnectorInstance)).oclAsType(NetworkConnectorInstance)->asOrderedSet()"
		   });	
		addAnnotation
		  (getHWPortInstance_IsNetworkInterface(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsUndefined()) then\n\tfalse\nelse self.protocol.isNetworkingProtocol\nendif"
		   });	
		addAnnotation
		  (getBusInstance_ConnectedHWPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorInstances->select(c|c.oclIsKindOf(hwplatforminstance::NetworkConnectorInstance))->collect(connectedHWPortInstances)->asOrderedSet()"
		   });	
		addAnnotation
		  (getBusInstance_BusType(), 
		   source, 
		   new String[] {
			 "derivation", "if  self.type.oclIsKindOf(hwplatform::Bus) then\r\n\tself.type.oclAsType(hwplatform::Bus)\r\nelse\r\n\tnull\r\nendif"
		   });	
		addAnnotation
		  (getBusInstance_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.busType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.busType.protocol\r\nendif\r\n"
		   });	
		addAnnotation
		  (getBusInstance_Bandwidth(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.busType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.busType.bandwidth\r\nendif"
		   });	
		addAnnotation
		  (getNetworkBridgeInstance_ConnectedNetworkConnectorInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorInstances->select(c|c.oclIsKindOf(hwplatforminstance::NetworkConnectorInstance)).oclAsType(hwplatforminstance::NetworkConnectorInstance)->asOrderedSet()"
		   });	
		addAnnotation
		  (getNetworkBridgeInstance_NetworkBridgeType(), 
		   source, 
		   new String[] {
			 "derivation", "if  self.type.oclIsKindOf(hwplatform::NetworkBridge) then\r\n\tself.type.oclAsType(hwplatform::NetworkBridge)\r\nelse\r\n\tnull\r\nendif"
		   });	
		addAnnotation
		  (getNetworkConnectorInstance_ConnectedHWPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpointInstances->select(e|e.oclIsKindOf(HWPortInstance)).oclAsType(HWPortInstance)->asOrderedSet()\n"
		   });	
		addAnnotation
		  (getNetworkConnectorInstance_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.networkConnectorType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.networkConnectorType.protocol\r\nendif"
		   });	
		addAnnotation
		  (getNetworkConnectorInstance_Bandwidth(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.networkConnectorType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.networkConnectorType.bandwidth\r\nendif"
		   });	
		addAnnotation
		  (getNetworkConnectorInstance_ConnectorKind(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.networkConnectorType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n  self.networkConnectorType.connectorKind\r\nendif"
		   });	
		addAnnotation
		  (getNetworkConnectorInstance_NetworkConnectorType(), 
		   source, 
		   new String[] {
			 "derivation", "if  self.type.oclIsKindOf(hwplatform::NetworkConnector) then\r\n\tself.type.oclAsType(hwplatform::NetworkConnector)\r\nelse\r\n\tnull\r\nendif"
		   });
	}

} //HwplatforminstancePackageImpl
