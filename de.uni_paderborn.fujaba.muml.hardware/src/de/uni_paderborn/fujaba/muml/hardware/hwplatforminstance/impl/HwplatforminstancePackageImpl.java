/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationHWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.LinkInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.NetworkingHardwareInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.util.HwplatforminstanceValidator;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.HwresourcePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

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
	private EClass delegationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busConnectorInstanceEClass = null;

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
	private EClass linkInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMediaInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeInstanceEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#eNS_URI
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
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HwplatformPackageImpl theHwplatformPackage = (HwplatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) instanceof HwplatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) : HwplatformPackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		HwresourcePackageImpl theHwresourcePackage = (HwresourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) instanceof HwresourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) : HwresourcePackage.eINSTANCE);
		HwresourceinstancePackageImpl theHwresourceinstancePackage = (HwresourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) instanceof HwresourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) : HwresourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theHwplatforminstancePackage.createPackageContents();
		theHwplatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		theHwresourcePackage.createPackageContents();
		theHwresourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theHwplatforminstancePackage.initializePackageContents();
		theHwplatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		theHwresourcePackage.initializePackageContents();
		theHwresourceinstancePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHwplatforminstancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HwplatforminstanceValidator.INSTANCE;
				 }
			 });

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
	public EReference getHWPlatformInstance_Resources() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_NetworkingHardwareInstances() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_HwplatformInstances() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformInstance_DelegationPorts() {
		return (EReference)hwPlatformInstanceEClass.getEStructuralFeatures().get(4);
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
	public EClass getHWPortInstance() {
		return hwPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_HwPortType() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_ConnectedMediaInstances() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_Protocol() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPortInstance_PortKind() {
		return (EAttribute)hwPortInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPortInstance_IsNetworkInterface() {
		return (EAttribute)hwPortInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationInstance() {
		return delegationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusConnectorInstance() {
		return busConnectorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnectorInstance_ConnectedBusInstance() {
		return (EReference)busConnectorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnectorInstance_ConnectedHWPortInstances() {
		return (EReference)busConnectorInstanceEClass.getEStructuralFeatures().get(1);
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
	public EReference getBusInstance_BusPart() {
		return (EReference)busInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkInstance() {
		return linkInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstance_ConnectedHWPortInstances() {
		return (EReference)linkInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstance_LinkPart() {
		return (EReference)linkInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMediaInstance() {
		return communicationMediaInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaInstance_Protocol() {
		return (EReference)communicationMediaInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaInstance_CommunicationMedia() {
		return (EReference)communicationMediaInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaInstance_CommunicationMediaPart() {
		return (EReference)communicationMediaInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaInstance_Bandwidth() {
		return (EReference)communicationMediaInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgeInstance() {
		return bridgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridgeInstance_ConnectedCommunicationMediaInstance() {
		return (EReference)bridgeInstanceEClass.getEStructuralFeatures().get(0);
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
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__RESOURCES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__NETWORKING_HARDWARE_INSTANCES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__HWPLATFORM_INSTANCES);
		createEReference(hwPlatformInstanceEClass, HW_PLATFORM_INSTANCE__DELEGATION_PORTS);

		hwPlatformInstanceConfigurationEClass = createEClass(HW_PLATFORM_INSTANCE_CONFIGURATION);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES);
		createEReference(hwPlatformInstanceConfigurationEClass, HW_PLATFORM_INSTANCE_CONFIGURATION__NETWORKING_HARDWARE_INSTANCES);

		hwPortInstanceEClass = createEClass(HW_PORT_INSTANCE);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__HW_PORT_TYPE);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__PROTOCOL);
		createEAttribute(hwPortInstanceEClass, HW_PORT_INSTANCE__PORT_KIND);
		createEAttribute(hwPortInstanceEClass, HW_PORT_INSTANCE__IS_NETWORK_INTERFACE);

		delegationInstanceEClass = createEClass(DELEGATION_INSTANCE);

		busConnectorInstanceEClass = createEClass(BUS_CONNECTOR_INSTANCE);
		createEReference(busConnectorInstanceEClass, BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE);
		createEReference(busConnectorInstanceEClass, BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES);

		busInstanceEClass = createEClass(BUS_INSTANCE);
		createEReference(busInstanceEClass, BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES);
		createEReference(busInstanceEClass, BUS_INSTANCE__BUS_PART);

		linkInstanceEClass = createEClass(LINK_INSTANCE);
		createEReference(linkInstanceEClass, LINK_INSTANCE__CONNECTED_HW_PORT_INSTANCES);
		createEReference(linkInstanceEClass, LINK_INSTANCE__LINK_PART);

		communicationMediaInstanceEClass = createEClass(COMMUNICATION_MEDIA_INSTANCE);
		createEReference(communicationMediaInstanceEClass, COMMUNICATION_MEDIA_INSTANCE__PROTOCOL);
		createEReference(communicationMediaInstanceEClass, COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA);
		createEReference(communicationMediaInstanceEClass, COMMUNICATION_MEDIA_INSTANCE__COMMUNICATION_MEDIA_PART);
		createEReference(communicationMediaInstanceEClass, COMMUNICATION_MEDIA_INSTANCE__BANDWIDTH);

		bridgeInstanceEClass = createEClass(BRIDGE_INSTANCE);
		createEReference(bridgeInstanceEClass, BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE);

		networkingHardwareInstanceEClass = createEClass(NETWORKING_HARDWARE_INSTANCE);

		delegationHWPortInstanceEClass = createEClass(DELEGATION_HW_PORT_INSTANCE);
		createEReference(delegationHWPortInstanceEClass, DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE);
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
		HwresourcePackage theHwresourcePackage = (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwPlatformInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformInstanceConfigurationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPortInstanceEClass.getESuperTypes().add(theHwresourcePackage.getHWPort());
		hwPortInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		delegationInstanceEClass.getESuperTypes().add(this.getNetworkingHardwareInstance());
		delegationInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorInstance());
		busConnectorInstanceEClass.getESuperTypes().add(this.getNetworkingHardwareInstance());
		busConnectorInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorInstance());
		busInstanceEClass.getESuperTypes().add(this.getCommunicationMediaInstance());
		busInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		linkInstanceEClass.getESuperTypes().add(this.getCommunicationMediaInstance());
		linkInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorInstance());
		communicationMediaInstanceEClass.getESuperTypes().add(this.getNetworkingHardwareInstance());
		bridgeInstanceEClass.getESuperTypes().add(this.getNetworkingHardwareInstance());
		bridgeInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());
		networkingHardwareInstanceEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		delegationHWPortInstanceEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpointInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(hwPlatformInstanceEClass, HWPlatformInstance.class, "HWPlatformInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformInstance_HwplatformType(), theHwplatformPackage.getHWPlatform(), null, "hwplatformType", null, 1, 1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_Resources(), theHwresourceinstancePackage.getResourceInstance(), null, "resources", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_NetworkingHardwareInstances(), this.getNetworkingHardwareInstance(), null, "networkingHardwareInstances", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_HwplatformInstances(), this.getHWPlatformInstance(), null, "hwplatformInstances", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstance_DelegationPorts(), this.getDelegationHWPortInstance(), this.getDelegationHWPortInstance_ParentHWPlatformInstance(), "delegationPorts", null, 0, -1, HWPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformInstanceConfigurationEClass, HWPlatformInstanceConfiguration.class, "HWPlatformInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformInstanceConfiguration_HwplatformInstances(), this.getHWPlatformInstance(), null, "hwplatformInstances", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformInstanceConfiguration_NetworkingHardwareInstances(), this.getNetworkingHardwareInstance(), null, "networkingHardwareInstances", null, 0, -1, HWPlatformInstanceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortInstanceEClass, HWPortInstance.class, "HWPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPortInstance_HwPortType(), theHwresourcePackage.getCommunicationResource(), null, "hwPortType", null, 1, 1, HWPortInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_ConnectedMediaInstances(), this.getCommunicationMediaInstance(), null, "connectedMediaInstances", null, 0, -1, HWPortInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, HWPortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPortInstance_PortKind(), theHwresourcePackage.getHWPortKind(), "portKind", null, 1, 1, HWPortInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPortInstance_IsNetworkInterface(), ecorePackage.getEBoolean(), "isNetworkInterface", null, 1, 1, HWPortInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationInstanceEClass, DelegationInstance.class, "DelegationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busConnectorInstanceEClass, BusConnectorInstance.class, "BusConnectorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusConnectorInstance_ConnectedBusInstance(), this.getBusInstance(), null, "connectedBusInstance", null, 0, -1, BusConnectorInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBusConnectorInstance_ConnectedHWPortInstances(), this.getHWPortInstance(), null, "connectedHWPortInstances", null, 0, -1, BusConnectorInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(busInstanceEClass, BusInstance.class, "BusInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusInstance_ConnectedHWPortInstances(), this.getHWPortInstance(), null, "connectedHWPortInstances", null, 0, -1, BusInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBusInstance_BusPart(), theHwplatformPackage.getBusPart(), null, "BusPart", null, 1, 1, BusInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkInstanceEClass, LinkInstance.class, "LinkInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkInstance_ConnectedHWPortInstances(), this.getHWPortInstance(), null, "connectedHWPortInstances", null, 0, -1, LinkInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLinkInstance_LinkPart(), theHwplatformPackage.getLinkPart(), null, "LinkPart", null, 1, 1, LinkInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(communicationMediaInstanceEClass, CommunicationMediaInstance.class, "CommunicationMediaInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMediaInstance_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, CommunicationMediaInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMediaInstance_CommunicationMedia(), theHwresourcePackage.getCommunicationMedia(), null, "communicationMedia", null, 1, 1, CommunicationMediaInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMediaInstance_CommunicationMediaPart(), theHwplatformPackage.getCommunicationMediaPart(), null, "communicationMediaPart", null, 1, 1, CommunicationMediaInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMediaInstance_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 1, 1, CommunicationMediaInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bridgeInstanceEClass, BridgeInstance.class, "BridgeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBridgeInstance_ConnectedCommunicationMediaInstance(), this.getCommunicationMediaInstance(), null, "connectedCommunicationMediaInstance", null, 2, -1, BridgeInstance.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkingHardwareInstanceEClass, NetworkingHardwareInstance.class, "NetworkingHardwareInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delegationHWPortInstanceEClass, DelegationHWPortInstance.class, "DelegationHWPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationHWPortInstance_ParentHWPlatformInstance(), this.getHWPlatformInstance(), this.getHWPlatformInstance_DelegationPorts(), "parentHWPlatformInstance", null, 1, 1, DelegationHWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (delegationInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "HWPortInstanceToDelegationPortInstance"
		   });									
		addAnnotation
		  (linkInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "Only2Connections"
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
		  (getHWPortInstance_HwPortType(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.type.oclIsUndefined()) then\n\tnull\nelse\n\tself.type.oclAsType(hwplatform::HWPortPart).communicationResource\nendif"
		   });			
		addAnnotation
		  (getHWPortInstance_ConnectedMediaInstances(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\tself.connectorInstances.oclAsType(BusConnectorInstance).connectedBusInstance.oclAsType(CommunicationMediaInstance)->asOrderedSet()\nelse \n\tself.connectorInstances.oclAsType(CommunicationMediaInstance)->asOrderedSet()\nendif"
		   });		
		addAnnotation
		  (getHWPortInstance_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.hwPortType.oclIsUndefined()) then\n\tnull \nelse\n self.hwPortType.protocol\n endif"
		   });				
		addAnnotation
		  (getHWPortInstance_PortKind(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.hwPortType.oclIsUndefined()) then\n hwresource::HWPortKind::BUS\nelse\n self.hwPortType.portKind\nendif\n"
		   });		
		addAnnotation
		  (getHWPortInstance_IsNetworkInterface(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsUndefined()) then\n\tfalse\nelse self.protocol.isNetworkingProtocol\nendif"
		   });				
		addAnnotation
		  (delegationInstanceEClass, 
		   source, 
		   new String[] {
			 "HWPortInstanceToDelegationPortInstance", "( self.connectorEndpointInstances->exists(c|c.oclIsKindOf(hwplatforminstance::DelegationHWPortInstance)) or self.connectorEndpointInstances->exists(c|c.oclIsKindOf(hwplatforminstance::BusInstance)))\n"
		   });		
		addAnnotation
		  (getBusConnectorInstance_ConnectedBusInstance(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpointInstances->select(e|e.oclIsKindOf(BusInstance)).oclAsType(BusInstance)->asOrderedSet()\n"
		   });		
		addAnnotation
		  (getBusConnectorInstance_ConnectedHWPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpointInstances->select(e|e.oclIsKindOf(HWPortInstance)).oclAsType(HWPortInstance)->asOrderedSet()"
		   });			
		addAnnotation
		  (getBusInstance_ConnectedHWPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorInstances->select(c|c.oclIsKindOf(BusConnectorInstance))->collect(connectedHWPortInstances)->asOrderedSet()"
		   });			
		addAnnotation
		  (getBusInstance_BusPart(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.type.oclIsUndefined()) then\n\tnull\nelse \n\tself.type.oclAsType(hwplatform::BusPart)\nendif"
		   });			
		addAnnotation
		  (linkInstanceEClass, 
		   source, 
		   new String[] {
			 "Only2Connections", "self.connectorEndpointInstances->size()<=2"
		   });			
		addAnnotation
		  (getLinkInstance_ConnectedHWPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpointInstances->select(e|e.oclIsKindOf(HWPortInstance)).oclAsType(HWPortInstance)->asOrderedSet()\n"
		   });			
		addAnnotation
		  (getLinkInstance_LinkPart(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.type.oclIsUndefined()) then\n\tnull\nelse \n\tself.type.oclAsType(hwplatform::LinkPart)\nendif\n"
		   });				
		addAnnotation
		  (getCommunicationMediaInstance_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.protocol\nendif"
		   });		
		addAnnotation
		  (getCommunicationMediaInstance_CommunicationMedia(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationMediaPart.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMediaPart.communicationMedia\nendif"
		   });			
		addAnnotation
		  (getCommunicationMediaInstance_Bandwidth(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.bandwidth\nendif"
		   });				
		addAnnotation
		  (getBridgeInstance_ConnectedCommunicationMediaInstance(), 
		   source, 
		   new String[] {
			 "derivation", "let links:Set(CommunicationMediaInstance) = self.connectorInstances->select(c|c.oclIsKindOf(LinkInstance)).oclAsType(CommunicationMediaInstance)->asOrderedSet() in\nlet buses: Set(CommunicationMediaInstance) = self.connectorInstances->select(c|c.oclIsKindOf(BusConnectorInstance)).oclAsType(BusConnectorInstance)->collect(connectedBusInstance).oclAsType(CommunicationMediaInstance)->asOrderedSet() in\nlinks->union(buses)->asOrderedSet()"
		   });
	}

} //HwplatforminstancePackageImpl
