/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.ResourcePart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.util.HwplatformValidator;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl;
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
public class HwplatformPackageImpl extends EPackageImpl implements HwplatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPlatformConfigurationEClass = null;

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
	private EClass delegationEClass = null;

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
	private EClass busConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMediaPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkingHardwarePartEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#eNS_URI
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
	public EClass getHWPlatformConfiguration() {
		return hwPlatformConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformConfiguration_Hwplatforms() {
		return (EReference)hwPlatformConfigurationEClass.getEStructuralFeatures().get(0);
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
	public EReference getHWPlatform_NetworkingHardwareParts() {
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
	public EClass getDelegation() {
		return delegationEClass;
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
	public EReference getHWPortPart_CommunicationResource() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_ConnectedMediaPart() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_Protocol() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_Cardinality() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPortPart_MultiHWPort() {
		return (EAttribute)hwPortPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPortPart_PortKind() {
		return (EAttribute)hwPortPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_QueuingTime() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_PayloadDataSize() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_ParentResourcePart() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusConnector() {
		return busConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnector_ConnectedBusPart() {
		return (EReference)busConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusConnector_ConnectedHWPortParts() {
		return (EReference)busConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusPart() {
		return busPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusPart_ConnectedHWPortParts() {
		return (EReference)busPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPart() {
		return linkPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPart_ConnectedHWPortParts() {
		return (EReference)linkPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMediaPart() {
		return communicationMediaPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaPart_CommunicationMedia() {
		return (EReference)communicationMediaPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaPart_Protocol() {
		return (EReference)communicationMediaPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMediaPart_Bandwidth() {
		return (EReference)communicationMediaPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgePart() {
		return bridgePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridgePart_ConnectedCommunicationMediaPart() {
		return (EReference)bridgePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridgePart_Delay() {
		return (EReference)bridgePartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkingHardwarePart() {
		return networkingHardwarePartEClass;
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
		hwPlatformConfigurationEClass = createEClass(HW_PLATFORM_CONFIGURATION);
		createEReference(hwPlatformConfigurationEClass, HW_PLATFORM_CONFIGURATION__HWPLATFORMS);

		hwPlatformEClass = createEClass(HW_PLATFORM);
		createEReference(hwPlatformEClass, HW_PLATFORM__EMBEDDED_PLATFORM_PARTS);
		createEReference(hwPlatformEClass, HW_PLATFORM__NETWORKING_HARDWARE_PARTS);
		createEReference(hwPlatformEClass, HW_PLATFORM__DELEGATION_PORTS);

		platformPartEClass = createEClass(PLATFORM_PART);
		createEReference(platformPartEClass, PLATFORM_PART__PARENT_HW_PLATFORM);
		createEReference(platformPartEClass, PLATFORM_PART__CARDINALITY);
		createEReference(platformPartEClass, PLATFORM_PART__HW_PORT_PARTS);

		hwPlatformPartEClass = createEClass(HW_PLATFORM_PART);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__HWPLATFORM_TYPE);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__EMBEDDED_BRIDGES);

		resourcePartEClass = createEClass(RESOURCE_PART);
		createEReference(resourcePartEClass, RESOURCE_PART__RESOURCE_TYPE);

		delegationEClass = createEClass(DELEGATION);

		delegationHWPortEClass = createEClass(DELEGATION_HW_PORT);

		hwPortPartEClass = createEClass(HW_PORT_PART);
		createEReference(hwPortPartEClass, HW_PORT_PART__COMMUNICATION_RESOURCE);
		createEReference(hwPortPartEClass, HW_PORT_PART__CONNECTED_MEDIA_PART);
		createEReference(hwPortPartEClass, HW_PORT_PART__PROTOCOL);
		createEReference(hwPortPartEClass, HW_PORT_PART__CARDINALITY);
		createEAttribute(hwPortPartEClass, HW_PORT_PART__MULTI_HW_PORT);
		createEAttribute(hwPortPartEClass, HW_PORT_PART__PORT_KIND);
		createEReference(hwPortPartEClass, HW_PORT_PART__QUEUING_TIME);
		createEReference(hwPortPartEClass, HW_PORT_PART__PAYLOAD_DATA_SIZE);
		createEReference(hwPortPartEClass, HW_PORT_PART__PARENT_RESOURCE_PART);

		busConnectorEClass = createEClass(BUS_CONNECTOR);
		createEReference(busConnectorEClass, BUS_CONNECTOR__CONNECTED_BUS_PART);
		createEReference(busConnectorEClass, BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS);

		busPartEClass = createEClass(BUS_PART);
		createEReference(busPartEClass, BUS_PART__CONNECTED_HW_PORT_PARTS);

		linkPartEClass = createEClass(LINK_PART);
		createEReference(linkPartEClass, LINK_PART__CONNECTED_HW_PORT_PARTS);

		communicationMediaPartEClass = createEClass(COMMUNICATION_MEDIA_PART);
		createEReference(communicationMediaPartEClass, COMMUNICATION_MEDIA_PART__COMMUNICATION_MEDIA);
		createEReference(communicationMediaPartEClass, COMMUNICATION_MEDIA_PART__PROTOCOL);
		createEReference(communicationMediaPartEClass, COMMUNICATION_MEDIA_PART__BANDWIDTH);

		bridgePartEClass = createEClass(BRIDGE_PART);
		createEReference(bridgePartEClass, BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART);
		createEReference(bridgePartEClass, BRIDGE_PART__DELAY);

		networkingHardwarePartEClass = createEClass(NETWORKING_HARDWARE_PART);
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
		HwresourcePackage theHwresourcePackage = (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwPlatformConfigurationEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		hwPlatformEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		platformPartEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformPartEClass.getESuperTypes().add(this.getPlatformPart());
		resourcePartEClass.getESuperTypes().add(this.getPlatformPart());
		delegationEClass.getESuperTypes().add(this.getNetworkingHardwarePart());
		delegationEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		delegationHWPortEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		delegationHWPortEClass.getESuperTypes().add(theHwresourcePackage.getCommunicationResource());
		hwPortPartEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		busConnectorEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		busConnectorEClass.getESuperTypes().add(this.getNetworkingHardwarePart());
		busPartEClass.getESuperTypes().add(this.getCommunicationMediaPart());
		busPartEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		linkPartEClass.getESuperTypes().add(this.getCommunicationMediaPart());
		linkPartEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		communicationMediaPartEClass.getESuperTypes().add(this.getNetworkingHardwarePart());
		bridgePartEClass.getESuperTypes().add(this.getNetworkingHardwarePart());
		bridgePartEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		networkingHardwarePartEClass.getESuperTypes().add(theCorePackage.getExtendableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(hwPlatformConfigurationEClass, HWPlatformConfiguration.class, "HWPlatformConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformConfiguration_Hwplatforms(), this.getHWPlatform(), null, "hwplatforms", null, 0, -1, HWPlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformEClass, HWPlatform.class, "HWPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatform_EmbeddedPlatformParts(), this.getPlatformPart(), this.getPlatformPart_ParentHWPlatform(), "embeddedPlatformParts", null, 1, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_NetworkingHardwareParts(), this.getNetworkingHardwarePart(), null, "networkingHardwareParts", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_DelegationPorts(), this.getDelegationHWPort(), null, "delegationPorts", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformPartEClass, PlatformPart.class, "PlatformPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformPart_ParentHWPlatform(), this.getHWPlatform(), this.getHWPlatform_EmbeddedPlatformParts(), "parentHWPlatform", null, 1, 1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformPart_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformPart_HwPortParts(), this.getHWPortPart(), this.getHWPortPart_ParentResourcePart(), "hwPortParts", null, 0, -1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformPartEClass, HWPlatformPart.class, "HWPlatformPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformPart_HwplatformType(), this.getHWPlatform(), null, "hwplatformType", null, 1, 1, HWPlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformPart_EmbeddedBridges(), this.getBridgePart(), null, "embeddedBridges", null, 0, -1, HWPlatformPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourcePartEClass, ResourcePart.class, "ResourcePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePart_ResourceType(), theHwresourceinstancePackage.getResourceInstance(), null, "resourceType", null, 1, 1, ResourcePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delegationHWPortEClass, DelegationHWPort.class, "DelegationHWPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwPortPartEClass, HWPortPart.class, "HWPortPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPortPart_CommunicationResource(), theHwresourcePackage.getCommunicationResource(), null, "communicationResource", null, 1, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_ConnectedMediaPart(), this.getCommunicationMediaPart(), null, "connectedMediaPart", null, 0, -1, HWPortPart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 0, 1, HWPortPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, HWPortPart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPortPart_MultiHWPort(), ecorePackage.getEBoolean(), "multiHWPort", null, 1, 1, HWPortPart.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPortPart_PortKind(), theHwresourcePackage.getHWPortKind(), "portKind", null, 0, 1, HWPortPart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_QueuingTime(), theHwvaluetypePackage.getTimeInterval(), null, "queuingTime", null, 0, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_PayloadDataSize(), theHwvaluetypePackage.getDataSize(), null, "payloadDataSize", null, 0, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_ParentResourcePart(), this.getPlatformPart(), this.getPlatformPart_HwPortParts(), "parentResourcePart", null, 1, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busConnectorEClass, BusConnector.class, "BusConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusConnector_ConnectedBusPart(), this.getBusPart(), null, "connectedBusPart", null, 0, -1, BusConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBusConnector_ConnectedHWPortParts(), this.getHWPortPart(), null, "connectedHWPortParts", null, 0, -1, BusConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(busPartEClass, BusPart.class, "BusPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusPart_ConnectedHWPortParts(), this.getHWPortPart(), null, "connectedHWPortParts", null, 0, -1, BusPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkPartEClass, LinkPart.class, "LinkPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkPart_ConnectedHWPortParts(), this.getHWPortPart(), null, "connectedHWPortParts", null, 0, -1, LinkPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(communicationMediaPartEClass, CommunicationMediaPart.class, "CommunicationMediaPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMediaPart_CommunicationMedia(), theHwresourcePackage.getCommunicationMedia(), null, "communicationMedia", null, 1, 1, CommunicationMediaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMediaPart_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, CommunicationMediaPart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMediaPart_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 1, 1, CommunicationMediaPart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bridgePartEClass, BridgePart.class, "BridgePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBridgePart_ConnectedCommunicationMediaPart(), this.getCommunicationMediaPart(), null, "connectedCommunicationMediaPart", null, 2, -1, BridgePart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBridgePart_Delay(), theHwvaluetypePackage.getTimeInterval(), null, "delay", null, 0, 1, BridgePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkingHardwarePartEClass, NetworkingHardwarePart.class, "NetworkingHardwarePart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (delegationEClass, 
		   source, 
		   new String[] {
			 "constraints", "HWPortPartToDelegationHWPort"
		   });			
		addAnnotation
		  (hwPortPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameProtocol LinkPort2Link"
		   });																					
		addAnnotation
		  (linkPartEClass, 
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
		  (platformPartEClass, 
		   source, 
		   new String[] {
			 "CardinalityLowerBoundSet", "self.cardinality.lowerBound->notEmpty()",
			 "CardinalityUpperBoundSet", "self.cardinality.upperBound->notEmpty()"
		   });							
		addAnnotation
		  (hwPlatformPartEClass, 
		   source, 
		   new String[] {
			 "NoLoop", "self.hwplatformType<>self.parentHWPlatform"
		   });				
		addAnnotation
		  (getHWPlatformPart_EmbeddedBridges(), 
		   source, 
		   new String[] {
			 "derivation", "if hwplatformType.oclIsUndefined() then\n\tOrderedSet { }\nelse\n\tself.hwplatformType.networkingHardwareParts->select(c| c.oclIsTypeOf(hwplatform::BridgePart)).oclAsType(hwplatform::BridgePart)->asOrderedSet()\nendif"
		   });							
		addAnnotation
		  (delegationEClass, 
		   source, 
		   new String[] {
			 "HWPortPartToDelegationHWPort", "self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::HWPortPart)) and ( self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::DelegationHWPort)) or self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::BusPart)))"
		   });			
		addAnnotation
		  (hwPortPartEClass, 
		   source, 
		   new String[] {
			 "SameProtocol", "if (self.connectedMediaPart->size()>0 and (not self.connectedMediaPart->first().oclIsKindOf(hwplatform::Delegation))) then\n\tself.connectedMediaPart->first().protocol=self.protocol\nelse true\nendif",
			 "LinkPort2Link", "if (self.portKind.oclIsUndefined() and  self.connectedMediaPart->size()<1) then\n\ttrue\nelse \n\tif (self.portKind = hwresource::HWPortKind::BUS) then\n\t\tself.connectedMediaPart->forAll(c|c.oclIsKindOf(hwplatform::BusPart)) or self.connectors->forAll(c|c.oclIsKindOf(hwplatform::BusConnector) or c.oclIsKindOf(hwplatform::Delegation))\n\telse if (self.portKind = hwresource::HWPortKind::LINK) then\n\t\tself.connectedMediaPart->forAll(c|c.oclIsKindOf(hwplatform::LinkPart)) or self.connectors->forAll(c|c.oclIsKindOf(hwplatform::Delegation))\n\telse true\nendif endif endif\n"
		   });				
		addAnnotation
		  (getHWPortPart_ConnectedMediaPart(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\tself.connectors.oclAsType(hwplatform::BusConnector).connectedBusPart.oclAsType(hwplatform::CommunicationMediaPart)->asOrderedSet()\nelse \n\tself.connectors.oclAsType(hwplatform::CommunicationMediaPart)->asOrderedSet()\nendif"
		   });		
		addAnnotation
		  (getHWPortPart_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.communicationResource.oclIsUndefined()) then\n\tnull \nelse\n self.communicationResource.protocol\n endif"
		   });				
		addAnnotation
		  (getHWPortPart_Cardinality(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.communicationResource.oclIsUndefined()) then\n\t null\n\telse\n\t \tself.communicationResource.cardinality\n\t endif"
		   });		
		addAnnotation
		  (getHWPortPart_MultiHWPort(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationResource.oclIsUndefined()) then\n\tfalse\nelse \n   self.communicationResource.multiHWPort\n  endif"
		   });				
		addAnnotation
		  (getHWPortPart_PortKind(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationResource.oclIsUndefined()) then\n\tnull\nelse \n   self.communicationResource.portKind\n  endif"
		   });				
		addAnnotation
		  (getBusConnector_ConnectedBusPart(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(e|e.oclIsKindOf(hwplatform::BusPart)).oclAsType(hwplatform::BusPart)->asOrderedSet()"
		   });		
		addAnnotation
		  (getBusConnector_ConnectedHWPortParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(e|e.oclIsKindOf(hwplatform::HWPortPart)).oclAsType(hwplatform::HWPortPart)->asOrderedSet()"
		   });			
		addAnnotation
		  (getBusPart_ConnectedHWPortParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c|c.oclIsKindOf(BusConnector))->collect(connectedHWPortParts)->asOrderedSet()"
		   });				
		addAnnotation
		  (linkPartEClass, 
		   source, 
		   new String[] {
			 "Only2Connections", "self.connectorEndpoints->size()<=2"
		   });			
		addAnnotation
		  (getLinkPart_ConnectedHWPortParts(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(e|e.oclIsKindOf(HWPortPart)).oclAsType(HWPortPart)->asOrderedSet()\n"
		   });					
		addAnnotation
		  (getCommunicationMediaPart_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.protocol\nendif"
		   });			
		addAnnotation
		  (getCommunicationMediaPart_Bandwidth(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationMedia.oclIsUndefined()) then\n\tnull\nelse \n\tself.communicationMedia.bandwidth\nendif"
		   });				
		addAnnotation
		  (getBridgePart_ConnectedCommunicationMediaPart(), 
		   source, 
		   new String[] {
			 "derivation", "let links:Set(CommunicationMediaPart) = self.connectors->select(c|c.oclIsKindOf(LinkPart)).oclAsType(CommunicationMediaPart)->asOrderedSet() in\nlet buses: Set(CommunicationMediaPart) = self.connectors->select(c|c.oclIsKindOf(BusConnector)).oclAsType(BusConnector)->collect(connectedBusPart).oclAsType(CommunicationMediaPart)->asOrderedSet() in\nlinks->union(buses)->asOrderedSet()"
		   });	
	}

} //HwplatformPackageImpl
