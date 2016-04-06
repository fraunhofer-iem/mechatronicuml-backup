/**
 */
package org.muml.pm.hardware.hwplatform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.hardware.hwplatform.Bus;
import org.muml.pm.hardware.hwplatform.DelegationHWPort;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.HWPortPart;
import org.muml.pm.hardware.hwplatform.HwplatformFactory;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.NetworkBridge;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwplatform.NetworkingHardware;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.hwplatform.util.HwplatformValidator;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwplatformPackageImpl extends EPackageImpl implements HwplatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationHWPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPortPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkBridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkingHardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectorEClass = null;

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
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwplatformPackageImpl() {
		super(eNS_URI, HwplatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwplatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwplatformPackage init() {
		if (isInited) return (HwplatformPackage)EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI);

		// Obtain or create and register package
		HwplatformPackageImpl theHwplatformPackage = (HwplatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwplatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwplatformPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		HwplatforminstancePackageImpl theHwplatforminstancePackage = (HwplatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) instanceof HwplatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) : HwplatforminstancePackage.eINSTANCE);
		HwresourcePackageImpl theHwresourcePackage = (HwresourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) instanceof HwresourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) : HwresourcePackage.eINSTANCE);
		HwresourceinstancePackageImpl theHwresourceinstancePackage = (HwresourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) instanceof HwresourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) : HwresourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theHwplatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		theHwplatforminstancePackage.createPackageContents();
		theHwresourcePackage.createPackageContents();
		theHwresourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theHwplatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		theHwplatforminstancePackage.initializePackageContents();
		theHwresourcePackage.initializePackageContents();
		theHwresourceinstancePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHwplatformPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HwplatformValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHwplatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwplatformPackage.eNS_URI, theHwplatformPackage);
		return theHwplatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPlatform() {
		return hwPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatform_EmbeddedPlatformParts() {
		return (EReference)hwPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatform_NetworkingHardware() {
		return (EReference)hwPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatform_DelegationPorts() {
		return (EReference)hwPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatform_NetworkConnectors() {
		return (EReference)hwPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformPart() {
		return platformPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformPart_ParentHWPlatform() {
		return (EReference)platformPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformPart_Cardinality() {
		return (EReference)platformPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformPart_HwPortParts() {
		return (EReference)platformPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPlatformPart() {
		return hwPlatformPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformPart_HwplatformType() {
		return (EReference)hwPlatformPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformPart_EmbeddedBridges() {
		return (EReference)hwPlatformPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePart() {
		return resourcePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePart_ResourceType() {
		return (EReference)resourcePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationHWPort() {
		return delegationHWPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPortPart() {
		return hwPortPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_ConnectedNetworkConnector() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_QueuingTime() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_PayloadDataSize() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_ParentPlatformPart() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_Hwport() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_ConnectedHWPortParts() {
		return (EReference)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Protocol() {
		return (EReference)busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Bandwidth() {
		return (EReference)busEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkBridge() {
		return networkBridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkBridge_ConnectedNetworkConnector() {
		return (EReference)networkBridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkBridge_Delay() {
		return (EReference)networkBridgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkingHardware() {
		return networkingHardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkConnector() {
		return networkConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnector_Protocol() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnector_Bandwidth() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnector_HwportParts() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkConnector_ConnectorKind() {
		return (EAttribute)networkConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkConnector_DelegationHWPorts() {
		return (EReference)networkConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatformFactory getHwplatformFactory() {
		return (HwplatformFactory)getEFactoryInstance();
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
		hwPlatformEClass = createEClass(HW_PLATFORM);
		createEReference(hwPlatformEClass, HW_PLATFORM__EMBEDDED_PLATFORM_PARTS);
		createEReference(hwPlatformEClass, HW_PLATFORM__NETWORKING_HARDWARE);
		createEReference(hwPlatformEClass, HW_PLATFORM__DELEGATION_PORTS);
		createEReference(hwPlatformEClass, HW_PLATFORM__NETWORK_CONNECTORS);

		platformPartEClass = createEClass(PLATFORM_PART);
		createEReference(platformPartEClass, PLATFORM_PART__PARENT_HW_PLATFORM);
		createEReference(platformPartEClass, PLATFORM_PART__CARDINALITY);
		createEReference(platformPartEClass, PLATFORM_PART__HW_PORT_PARTS);

		hwPlatformPartEClass = createEClass(HW_PLATFORM_PART);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__HWPLATFORM_TYPE);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__EMBEDDED_BRIDGES);

		resourcePartEClass = createEClass(RESOURCE_PART);
		createEReference(resourcePartEClass, RESOURCE_PART__RESOURCE_TYPE);

		delegationHWPortEClass = createEClass(DELEGATION_HW_PORT);

		hwPortPartEClass = createEClass(HW_PORT_PART);
		createEReference(hwPortPartEClass, HW_PORT_PART__CONNECTED_NETWORK_CONNECTOR);
		createEReference(hwPortPartEClass, HW_PORT_PART__QUEUING_TIME);
		createEReference(hwPortPartEClass, HW_PORT_PART__PAYLOAD_DATA_SIZE);
		createEReference(hwPortPartEClass, HW_PORT_PART__PARENT_PLATFORM_PART);
		createEReference(hwPortPartEClass, HW_PORT_PART__HWPORT);

		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__CONNECTED_HW_PORT_PARTS);
		createEReference(busEClass, BUS__PROTOCOL);
		createEReference(busEClass, BUS__BANDWIDTH);

		networkBridgeEClass = createEClass(NETWORK_BRIDGE);
		createEReference(networkBridgeEClass, NETWORK_BRIDGE__CONNECTED_NETWORK_CONNECTOR);
		createEReference(networkBridgeEClass, NETWORK_BRIDGE__DELAY);

		networkingHardwareEClass = createEClass(NETWORKING_HARDWARE);

		networkConnectorEClass = createEClass(NETWORK_CONNECTOR);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__PROTOCOL);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__BANDWIDTH);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__HWPORT_PARTS);
		createEAttribute(networkConnectorEClass, NETWORK_CONNECTOR__CONNECTOR_KIND);
		createEReference(networkConnectorEClass, NETWORK_CONNECTOR__DELEGATION_HW_PORTS);
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
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);
		HwresourcePackage theHwresourcePackage = (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwPlatformEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		platformPartEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformPartEClass.getESuperTypes().add(this.getPlatformPart());
		resourcePartEClass.getESuperTypes().add(this.getPlatformPart());
		delegationHWPortEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		delegationHWPortEClass.getESuperTypes().add(theHwresourceinstancePackage.getHWPort());
		hwPortPartEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		busEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		busEClass.getESuperTypes().add(this.getNetworkingHardware());
		networkBridgeEClass.getESuperTypes().add(this.getNetworkingHardware());
		networkBridgeEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		networkingHardwareEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		networkConnectorEClass.getESuperTypes().add(theConnectorPackage.getConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(hwPlatformEClass, HWPlatform.class, "HWPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatform_EmbeddedPlatformParts(), this.getPlatformPart(), this.getPlatformPart_ParentHWPlatform(), "embeddedPlatformParts", null, 1, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_NetworkingHardware(), this.getNetworkingHardware(), null, "networkingHardware", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_DelegationPorts(), this.getDelegationHWPort(), null, "delegationPorts", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_NetworkConnectors(), this.getNetworkConnector(), null, "networkConnectors", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformPartEClass, PlatformPart.class, "PlatformPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformPart_ParentHWPlatform(), this.getHWPlatform(), this.getHWPlatform_EmbeddedPlatformParts(), "parentHWPlatform", null, 1, 1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformPart_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformPart_HwPortParts(), this.getHWPortPart(), this.getHWPortPart_ParentPlatformPart(), "hwPortParts", null, 0, -1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformPartEClass, HWPlatformPart.class, "HWPlatformPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformPart_HwplatformType(), this.getHWPlatform(), null, "hwplatformType", null, 1, 1, HWPlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformPart_EmbeddedBridges(), this.getNetworkBridge(), null, "embeddedBridges", null, 0, -1, HWPlatformPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourcePartEClass, ResourcePart.class, "ResourcePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePart_ResourceType(), theHwresourceinstancePackage.getResourceInstance(), null, "resourceType", null, 1, 1, ResourcePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationHWPortEClass, DelegationHWPort.class, "DelegationHWPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwPortPartEClass, HWPortPart.class, "HWPortPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPortPart_ConnectedNetworkConnector(), this.getNetworkConnector(), null, "connectedNetworkConnector", null, 0, -1, HWPortPart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_QueuingTime(), theHwvaluetypePackage.getTimeInterval(), null, "queuingTime", null, 0, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_PayloadDataSize(), theHwvaluetypePackage.getDataSize(), null, "payloadDataSize", null, 0, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_ParentPlatformPart(), this.getPlatformPart(), this.getPlatformPart_HwPortParts(), "parentPlatformPart", null, 1, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_Hwport(), theHwresourceinstancePackage.getHWPort(), null, "hwport", null, 1, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_ConnectedHWPortParts(), this.getHWPortPart(), null, "connectedHWPortParts", null, 0, -1, Bus.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBus_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 1, 1, Bus.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkBridgeEClass, NetworkBridge.class, "NetworkBridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkBridge_ConnectedNetworkConnector(), this.getNetworkConnector(), null, "connectedNetworkConnector", null, 2, -1, NetworkBridge.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkBridge_Delay(), theHwvaluetypePackage.getTimeInterval(), null, "delay", null, 0, 1, NetworkBridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkingHardwareEClass, NetworkingHardware.class, "NetworkingHardware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkConnectorEClass, NetworkConnector.class, "NetworkConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkConnector_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 0, 1, NetworkConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnector_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 0, 1, NetworkConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnector_HwportParts(), this.getHWPortPart(), null, "hwportParts", null, 0, 2, NetworkConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkConnector_ConnectorKind(), theHwresourcePackage.getCommunicationKind(), "connectorKind", null, 1, 1, NetworkConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnector_DelegationHWPorts(), this.getDelegationHWPort(), null, "delegationHWPorts", null, 0, 2, NetworkConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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
		addAnnotation
		  (platformPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "CardinalityLowerBoundSet CardinalityUpperBoundSet"
		   });	
		addAnnotation
		  (hwPlatformPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoLoop"
		   });	
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameBusProtocol"
		   });	
		addAnnotation
		  (networkConnectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameProtocol"
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
		  (platformPartEClass, 
		   source, 
		   new String[] {
			 "CardinalityLowerBoundSet", "-- Lower Bound of Cardinality must be set\nif self.cardinality.lowerBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.lowerBound->notEmpty()\r\nendif",
			 "CardinalityUpperBoundSet", "-- Upper bound of cardinality must be set\r\nif self.cardinality.upperBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.upperBound->notEmpty()\r\nendif"
		   });	
		addAnnotation
		  (hwPlatformPartEClass, 
		   source, 
		   new String[] {
			 "NoLoop", "-- HWPlatformPart must NOT have the same type as its parent HWPlatform\nself.hwplatformType<>self.parentHWPlatform"
		   });	
		addAnnotation
		  (getHWPlatformPart_EmbeddedBridges(), 
		   source, 
		   new String[] {
			 "derivation", "if hwplatformType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tself.hwplatformType.networkingHardware->select(c| c.oclIsTypeOf(hwplatform::NetworkBridge)).oclAsType(hwplatform::NetworkBridge)->asOrderedSet()\r\nendif"
		   });	
		addAnnotation
		  (getHWPortPart_ConnectedNetworkConnector(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c|c.oclIsKindOf(hwplatform::NetworkConnector)).oclAsType(hwplatform::NetworkConnector)->asOrderedSet()"
		   });	
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "SameBusProtocol", "-- Connected Ports must use the same BusProtocol\r\nself.connectedHWPortParts.hwport->forAll(p  | p.protocol =self.protocol )"
		   });	
		addAnnotation
		  (getBus_ConnectedHWPortParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c|c.oclIsKindOf(NetworkConnector)).oclAsType(NetworkConnector)->collect(hwportParts)->asOrderedSet()"
		   });	
		addAnnotation
		  (getBus_Bandwidth(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.protocol.bandwidth\r\nendif"
		   });	
		addAnnotation
		  (getNetworkBridge_ConnectedNetworkConnector(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c|c.oclIsKindOf(hwplatform::NetworkConnector)).oclAsType(hwplatform::NetworkConnector)->asOrderedSet()"
		   });	
		addAnnotation
		  (networkConnectorEClass, 
		   source, 
		   new String[] {
			 "SameProtocol", "-- Connected Ports must use the same Protocol\r\nself.hwportParts.hwport->forAll(p1 , p2 | p1.protocol = p2.protocol)"
		   });	
		addAnnotation
		  (getNetworkConnector_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.hwportParts->notEmpty()) then \t\n\tself.hwportParts.hwport->select(p| not p.protocol.oclIsUndefined())->any(true).protocol \nelse      \n\tnull \nendif"
		   });	
		addAnnotation
		  (getNetworkConnector_Bandwidth(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.protocol.bandwidth\r\nendif"
		   });	
		addAnnotation
		  (getNetworkConnector_HwportParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(HWPortPart)).oclAsType(HWPortPart)->asOrderedSet()"
		   });	
		addAnnotation
		  (getNetworkConnector_ConnectorKind(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.delegationHWPorts->notEmpty()) then\r\n\thwresource::CommunicationKind::DELEGATION\r\nelse \r\n   self.hwportParts.hwport->any(true).portKind\r\n  endif"
		   });	
		addAnnotation
		  (getNetworkConnector_DelegationHWPorts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(c | c.oclIsKindOf(DelegationHWPort)).oclAsType(DelegationHWPort)->asOrderedSet()"
		   });
	}

} //HwplatformPackageImpl
