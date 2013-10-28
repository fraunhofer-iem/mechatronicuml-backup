/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.impl.PlatformPackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.AtomicResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ComputingResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Device;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.DeviceKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryAccessKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.MemoryResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProgrammableLogicDevice;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ReplacementPolicy;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.util.ResourcetypeValidator;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcetypePackageImpl extends EPackageImpl implements ResourcetypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmableLogicDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorArchitectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryAccessKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum replacementPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writePolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hwPortKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busProtocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkProtocolKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcetypePackageImpl() {
		super(eNS_URI, ResourcetypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourcetypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcetypePackage init() {
		if (isInited) return (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);

		// Obtain or create and register package
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourcetypePackageImpl());

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
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		PlatforminstancePackageImpl thePlatforminstancePackage = (PlatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI) instanceof PlatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI) : PlatforminstancePackage.eINSTANCE);

		// Create package meta-data objects
		theResourcetypePackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		thePlatforminstancePackage.createPackageContents();

		// Initialize created meta-data
		theResourcetypePackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		thePlatforminstancePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theResourcetypePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ResourcetypeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theResourcetypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcetypePackage.eNS_URI, theResourcetypePackage);
		return theResourcetypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_Hwports() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingResource() {
		return computingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryResource() {
		return memoryResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_MemoryAccess() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_IsVolatile() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_MemoryType() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceType() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_WritePolicy() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_ReplacementPolicy() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_NbSets() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Associativity() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCache_UsedByProcessor() {
		return (EReference)cacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammableLogicDevice() {
		return programmableLogicDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_OwnedCache() {
		return (EReference)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Architecture() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_NbCores() {
		return (EReference)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Family() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_NbPipelineStages() {
		return (EReference)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicResource() {
		return atomicResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicResource_ParentStructuredResource() {
		return (EReference)atomicResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredResource() {
		return structuredResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredResource_EmbeddedAtomicResources() {
		return (EReference)structuredResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPort() {
		return hwPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPort_ParentResource() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPort_PortType() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPort_Protocol() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceTypeRepository() {
		return resourceTypeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeRepository_ResourceTypes() {
		return (EReference)resourceTypeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTypeRepository_Protocols() {
		return (EReference)resourceTypeRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationProtocol() {
		return communicationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_IsTimeTriggered() {
		return (EAttribute)communicationProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_IsEventTriggered() {
		return (EAttribute)communicationProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_FurtherInformation() {
		return (EAttribute)communicationProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusProtocol() {
		return busProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusProtocol_BusProtocol() {
		return (EAttribute)busProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkProtocol() {
		return linkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkProtocol_LinkProtocol() {
		return (EAttribute)linkProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceKind() {
		return deviceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorArchitecture() {
		return processorArchitectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryAccessKind() {
		return memoryAccessKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryKind() {
		return memoryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReplacementPolicy() {
		return replacementPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWritePolicy() {
		return writePolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHWPortKind() {
		return hwPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusProtocolKind() {
		return busProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkProtocolKind() {
		return linkProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypeFactory getResourcetypeFactory() {
		return (ResourcetypeFactory)getEFactoryInstance();
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
		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__HWPORTS);

		computingResourceEClass = createEClass(COMPUTING_RESOURCE);

		memoryResourceEClass = createEClass(MEMORY_RESOURCE);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__MEMORY_ACCESS);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__IS_VOLATILE);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__MEMORY_TYPE);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_TYPE);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__WRITE_POLICY);
		createEAttribute(cacheEClass, CACHE__REPLACEMENT_POLICY);
		createEAttribute(cacheEClass, CACHE__NB_SETS);
		createEAttribute(cacheEClass, CACHE__ASSOCIATIVITY);
		createEReference(cacheEClass, CACHE__USED_BY_PROCESSOR);

		programmableLogicDeviceEClass = createEClass(PROGRAMMABLE_LOGIC_DEVICE);

		processorEClass = createEClass(PROCESSOR);
		createEReference(processorEClass, PROCESSOR__OWNED_CACHE);
		createEAttribute(processorEClass, PROCESSOR__ARCHITECTURE);
		createEReference(processorEClass, PROCESSOR__NB_CORES);
		createEAttribute(processorEClass, PROCESSOR__FAMILY);
		createEReference(processorEClass, PROCESSOR__NB_PIPELINE_STAGES);

		atomicResourceEClass = createEClass(ATOMIC_RESOURCE);
		createEReference(atomicResourceEClass, ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE);

		structuredResourceEClass = createEClass(STRUCTURED_RESOURCE);
		createEReference(structuredResourceEClass, STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES);

		hwPortEClass = createEClass(HW_PORT);
		createEReference(hwPortEClass, HW_PORT__PARENT_RESOURCE);
		createEAttribute(hwPortEClass, HW_PORT__PORT_TYPE);
		createEReference(hwPortEClass, HW_PORT__PROTOCOL);

		resourceTypeRepositoryEClass = createEClass(RESOURCE_TYPE_REPOSITORY);
		createEReference(resourceTypeRepositoryEClass, RESOURCE_TYPE_REPOSITORY__RESOURCE_TYPES);
		createEReference(resourceTypeRepositoryEClass, RESOURCE_TYPE_REPOSITORY__PROTOCOLS);

		communicationProtocolEClass = createEClass(COMMUNICATION_PROTOCOL);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__FURTHER_INFORMATION);

		busProtocolEClass = createEClass(BUS_PROTOCOL);
		createEAttribute(busProtocolEClass, BUS_PROTOCOL__BUS_PROTOCOL);

		linkProtocolEClass = createEClass(LINK_PROTOCOL);
		createEAttribute(linkProtocolEClass, LINK_PROTOCOL__LINK_PROTOCOL);

		// Create enums
		deviceKindEEnum = createEEnum(DEVICE_KIND);
		processorArchitectureEEnum = createEEnum(PROCESSOR_ARCHITECTURE);
		memoryAccessKindEEnum = createEEnum(MEMORY_ACCESS_KIND);
		memoryKindEEnum = createEEnum(MEMORY_KIND);
		replacementPolicyEEnum = createEEnum(REPLACEMENT_POLICY);
		writePolicyEEnum = createEEnum(WRITE_POLICY);
		hwPortKindEEnum = createEEnum(HW_PORT_KIND);
		busProtocolKindEEnum = createEEnum(BUS_PROTOCOL_KIND);
		linkProtocolKindEEnum = createEEnum(LINK_PROTOCOL_KIND);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceTypeEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		resourceTypeEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		resourceTypeEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		computingResourceEClass.getESuperTypes().add(this.getAtomicResource());
		memoryResourceEClass.getESuperTypes().add(this.getAtomicResource());
		deviceEClass.getESuperTypes().add(this.getResourceType());
		cacheEClass.getESuperTypes().add(this.getMemoryResource());
		programmableLogicDeviceEClass.getESuperTypes().add(this.getComputingResource());
		processorEClass.getESuperTypes().add(this.getComputingResource());
		atomicResourceEClass.getESuperTypes().add(this.getResourceType());
		structuredResourceEClass.getESuperTypes().add(this.getResourceType());
		hwPortEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		resourceTypeRepositoryEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		communicationProtocolEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		busProtocolEClass.getESuperTypes().add(this.getCommunicationProtocol());
		linkProtocolEClass.getESuperTypes().add(this.getCommunicationProtocol());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceType_Hwports(), this.getHWPort(), this.getHWPort_ParentResource(), "hwports", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceEClass, ComputingResource.class, "ComputingResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryResourceEClass, MemoryResource.class, "MemoryResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryResource_MemoryAccess(), this.getMemoryAccessKind(), "memoryAccess", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryResource_IsVolatile(), theEcorePackage.getEBoolean(), "isVolatile", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryResource_MemoryType(), this.getMemoryKind(), "memoryType", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceType(), this.getDeviceKind(), "deviceType", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_WritePolicy(), this.getWritePolicy(), "writePolicy", "WRITE_THROUGH", 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_ReplacementPolicy(), this.getReplacementPolicy(), "replacementPolicy", "FIFO", 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_NbSets(), theEcorePackage.getEInt(), "nbSets", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Associativity(), theEcorePackage.getEInt(), "associativity", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_UsedByProcessor(), this.getProcessor(), this.getProcessor_OwnedCache(), "usedByProcessor", null, 0, -1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmableLogicDeviceEClass, ProgrammableLogicDevice.class, "ProgrammableLogicDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessor_OwnedCache(), this.getCache(), this.getCache_UsedByProcessor(), "ownedCache", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Architecture(), this.getProcessorArchitecture(), "architecture", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_NbCores(), theValuetypePackage.getNaturalNumber(), null, "nbCores", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Family(), theEcorePackage.getEString(), "family", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_NbPipelineStages(), theValuetypePackage.getNaturalNumber(), null, "nbPipelineStages", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicResourceEClass, AtomicResource.class, "AtomicResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicResource_ParentStructuredResource(), this.getStructuredResource(), this.getStructuredResource_EmbeddedAtomicResources(), "parentStructuredResource", null, 1, 1, AtomicResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredResourceEClass, StructuredResource.class, "StructuredResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredResource_EmbeddedAtomicResources(), this.getAtomicResource(), this.getAtomicResource_ParentStructuredResource(), "embeddedAtomicResources", null, 1, -1, StructuredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortEClass, HWPort.class, "HWPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPort_ParentResource(), this.getResourceType(), this.getResourceType_Hwports(), "parentResource", null, 1, 1, HWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPort_PortType(), this.getHWPortKind(), "portType", null, 1, 1, HWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPort_Protocol(), this.getCommunicationProtocol(), null, "protocol", null, 1, 1, HWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeRepositoryEClass, ResourceTypeRepository.class, "ResourceTypeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceTypeRepository_ResourceTypes(), this.getResourceType(), null, "resourceTypes", null, 1, -1, ResourceTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceTypeRepository_Protocols(), this.getCommunicationProtocol(), null, "protocols", null, 1, -1, ResourceTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationProtocolEClass, CommunicationProtocol.class, "CommunicationProtocol", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationProtocol_IsTimeTriggered(), theEcorePackage.getEBoolean(), "isTimeTriggered", "", 1, 1, CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationProtocol_IsEventTriggered(), theEcorePackage.getEBoolean(), "isEventTriggered", null, 1, 1, CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationProtocol_FurtherInformation(), theEcorePackage.getEString(), "furtherInformation", null, 0, 1, CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busProtocolEClass, BusProtocol.class, "BusProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusProtocol_BusProtocol(), this.getBusProtocolKind(), "busProtocol", null, 1, 1, BusProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkProtocolEClass, LinkProtocol.class, "LinkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkProtocol_LinkProtocol(), this.getLinkProtocolKind(), "linkProtocol", null, 1, 1, LinkProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deviceKindEEnum, DeviceKind.class, "DeviceKind");
		addEEnumLiteral(deviceKindEEnum, DeviceKind.SENSOR);
		addEEnumLiteral(deviceKindEEnum, DeviceKind.ACTUATOR);

		initEEnum(processorArchitectureEEnum, ProcessorArchitecture.class, "ProcessorArchitecture");
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.RISC);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.CISC);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.VLIW);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.SIMD);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.OTHER);

		initEEnum(memoryAccessKindEEnum, MemoryAccessKind.class, "MemoryAccessKind");
		addEEnumLiteral(memoryAccessKindEEnum, MemoryAccessKind.READ_WRITE);
		addEEnumLiteral(memoryAccessKindEEnum, MemoryAccessKind.READ_ONLY);

		initEEnum(memoryKindEEnum, MemoryKind.class, "MemoryKind");
		addEEnumLiteral(memoryKindEEnum, MemoryKind.RAM);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.ROM);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.DISK);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.FLASH);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.OTHER);

		initEEnum(replacementPolicyEEnum, ReplacementPolicy.class, "ReplacementPolicy");
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.LRU);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.FIFO);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.NFU);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.NRU);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.OTHER);

		initEEnum(writePolicyEEnum, WritePolicy.class, "WritePolicy");
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_BACK);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_THROUGH);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.OTHER);

		initEEnum(hwPortKindEEnum, HWPortKind.class, "HWPortKind");
		addEEnumLiteral(hwPortKindEEnum, HWPortKind.BUS);
		addEEnumLiteral(hwPortKindEEnum, HWPortKind.LINK);

		initEEnum(busProtocolKindEEnum, BusProtocolKind.class, "BusProtocolKind");
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.CAN);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.FLEXRAY);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.LIN);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.BYTEFLIGHT);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.TTP);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.MOST);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.I2C);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.USB);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.OTHER);

		initEEnum(linkProtocolKindEEnum, LinkProtocolKind.class, "LinkProtocolKind");
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.ETHERNET);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.ETHERCAT);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.ANALOG);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.OTHER);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.BLUETOOTH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "The package resourcetype contains all classes for modeling atomic and structured resource types in the Resource Type Viewpoint.\n"
		   });			
		addAnnotation
		  (resourceTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class is the super class of all resource types."
		   });		
		addAnnotation
		  (getResourceType_Hwports(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPort of this ResourceType.\n\n"
		   });		
		addAnnotation
		  (computingResourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represent all resources which are able to execute code."
		   });				
		addAnnotation
		  (memoryResourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an AtomicResource that is capable of storing data. \n"
		   });		
		addAnnotation
		  (getMemoryResource_MemoryAccess(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies what kind of access is allowed for this MemoryResource."
		   });		
		addAnnotation
		  (getMemoryResource_IsVolatile(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies if this MemoryResource is volatile or non-volatile. \nNon-volatile Memory (i.e. ROM) could be used to store the binary code.\nVolatile Memory (i.e SRAM) is used during execution of code."
		   });		
		addAnnotation
		  (getMemoryResource_MemoryType(), 
		   source, 
		   new String[] {
			 "documentation", "The type of this MemoryResource."
		   });		
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a device.\nDevices are resources that interact with the environment (i.e. sensors, actuators)."
		   });		
		addAnnotation
		  (getDevice_DeviceType(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the type of the Device: Sensor or Actuator."
		   });		
		addAnnotation
		  (cacheEClass, 
		   source, 
		   new String[] {
			 "documentation", "The class Cache represents a Cache used by a Processor."
		   });		
		addAnnotation
		  (getCache_WritePolicy(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the write policy of the Cache."
		   });		
		addAnnotation
		  (getCache_ReplacementPolicy(), 
		   source, 
		   new String[] {
			 "documentation", "Determines the replacement policy for this Cache."
		   });		
		addAnnotation
		  (getCache_NbSets(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the number of sets.\n If the nbSets are one, the cache is full-associative."
		   });		
		addAnnotation
		  (getCache_Associativity(), 
		   source, 
		   new String[] {
			 "documentation", "The associativity of this cache. It represents the number of blocks in one set. An associativity of 1 represents a direct mapped cache."
		   });		
		addAnnotation
		  (programmableLogicDeviceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class  represents a hardware component to build reconfigurable digital circuits (i.e. FPGA)."
		   });		
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "documentation", "The class Processor is a ComputingResource. It represents different kind of a processor specified by its family and architecture."
		   });				
		addAnnotation
		  (getProcessor_OwnedCache(), 
		   source, 
		   new String[] {
			 "documentation", "The Cache which belongs to this Processor."
		   });		
		addAnnotation
		  (getProcessor_Architecture(), 
		   source, 
		   new String[] {
			 "documentation", "The architecture of this Processor (i.e. RISC,CISC,..)."
		   });		
		addAnnotation
		  (getProcessor_NbCores(), 
		   source, 
		   new String[] {
			 "documentation", "The number of cores of this Processor."
		   });		
		addAnnotation
		  (getProcessor_Family(), 
		   source, 
		   new String[] {
			 "documentation", "The family of this Processor (i.e. x86, ARM, MIPS,..)."
		   });		
		addAnnotation
		  (getProcessor_NbPipelineStages(), 
		   source, 
		   new String[] {
			 "documentation", "The number of pipelines for this processor."
		   });		
		addAnnotation
		  (atomicResourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class is the super class of all atomic resource types.\nAtomicResources  can not be further sub-divided."
		   });		
		addAnnotation
		  (getAtomicResource_ParentStructuredResource(), 
		   source, 
		   new String[] {
			 "documentation", "The StructuredResource, this AtomicResource belongs to."
		   });		
		addAnnotation
		  (structuredResourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents all StructuredResource (i.e. ECUs, Server,etc.). A StructuredResource consists of several AtomicResources."
		   });		
		addAnnotation
		  (getStructuredResource_EmbeddedAtomicResources(), 
		   source, 
		   new String[] {
			 "documentation", "All AtomicResources which are contained in this StructuredResource."
		   });		
		addAnnotation
		  (hwPortEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a hardware port of a resource.\nHardware ports are external interfaces which are used to connect resources via CommunicationMedia."
		   });				
		addAnnotation
		  (getHWPort_ParentResource(), 
		   source, 
		   new String[] {
			 "documentation", "The Resource, this HWPort belongs to."
		   });		
		addAnnotation
		  (getHWPort_PortType(), 
		   source, 
		   new String[] {
			 "documentation", "Determines if this HWPort is  a bus or a link port."
		   });		
		addAnnotation
		  (getHWPort_Protocol(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationProtocol this HWPort uses to transmit data."
		   });		
		addAnnotation
		  (deviceKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Specifies the kind of the device."
		   });		
		addAnnotation
		  (processorArchitectureEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Determines the architecture of a Processor."
		   });		
		addAnnotation
		  (memoryAccessKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Decides what kind of access is allowed for a MemoryResource."
		   });		
		addAnnotation
		  (memoryKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Decides the type of a MemoryResource."
		   });		
		addAnnotation
		  (replacementPolicyEEnum, 
		   source, 
		   new String[] {
			 "documentation", "The entries of the enumeration represent different kinds of replacement policies for a Cache."
		   });		
		addAnnotation
		  (writePolicyEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Determines the write policy of a cache."
		   });		
		addAnnotation
		  (hwPortKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Determines the kind of a HWPort."
		   });		
		addAnnotation
		  (resourceTypeRepositoryEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a repository containing several resource types."
		   });				
		addAnnotation
		  (getResourceTypeRepository_ResourceTypes(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceTypes that are contained in this ResourceTypeRepository."
		   });		
		addAnnotation
		  (getResourceTypeRepository_Protocols(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationProtocols that belong to this ResourceTypeRepository.\nCommunicationProtocols are used to specify the protocol used by HWPort and CommunicationMedia."
		   });		
		addAnnotation
		  (communicationProtocolEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represents the CommunicationProtocol used by the HWPorts and CommunicationMedia.\nIt is used to match Ports and CommunicationMedia."
		   });		
		addAnnotation
		  (getCommunicationProtocol_IsTimeTriggered(), 
		   source, 
		   new String[] {
			 "documentation", "Determines if the protocol is time triggered. "
		   });		
		addAnnotation
		  (getCommunicationProtocol_IsEventTriggered(), 
		   source, 
		   new String[] {
			 "documentation", "Determines if this protocol is event triggered."
		   });		
		addAnnotation
		  (getCommunicationProtocol_FurtherInformation(), 
		   source, 
		   new String[] {
			 "documentation", "Further information for this protocol (i.e. Version, or another Protocol)."
		   });		
		addAnnotation
		  (busProtocolKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Decides the used protocol for a BusProtocol."
		   });		
		addAnnotation
		  (busProtocolEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a bus protocol used by bus media and bus ports."
		   });		
		addAnnotation
		  (getBusProtocol_BusProtocol(), 
		   source, 
		   new String[] {
			 "documentation", "The bus protocol type."
		   });		
		addAnnotation
		  (linkProtocolEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a link protocol used by link media and link ports."
		   });		
		addAnnotation
		  (getLinkProtocol_LinkProtocol(), 
		   source, 
		   new String[] {
			 "documentation", "The link protocol type."
		   });		
		addAnnotation
		  (linkProtocolKindEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Decides the used protocol for a LinkProtocol."
		   });
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
		  (memoryResourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "RAMimpliesRW ROMimpliesReadOnly"
		   });																	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ownedCacheInSameStructuredResource"
		   });												
		addAnnotation
		  (hwPortEClass, 
		   source, 
		   new String[] {
			 "constraints", "BusProtocolImpliesBusType LinkProtocolImpliesLinkType"
		   });															
		addAnnotation
		  (resourceTypeRepositoryEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueProtocolName"
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
		  (memoryResourceEClass, 
		   source, 
		   new String[] {
			 "RAMimpliesRW", "self.memoryType = MemoryKind::RAM implies self.memoryAccess=MemoryAccessKind::READ_WRITE",
			 "ROMimpliesReadOnly", "self.memoryType = MemoryKind::ROM implies self.memoryAccess = MemoryAccessKind::READ_ONLY"
		   });															
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "ownedCacheInSameStructuredResource", "if not self.ownedCache.oclIsUndefined() then\n\tself.parentStructuredResource=self.ownedCache.parentStructuredResource\nelse\n\t true\nendif\n"
		   });														
		addAnnotation
		  (hwPortEClass, 
		   source, 
		   new String[] {
			 "BusProtocolImpliesBusType", "self.protocol.oclIsTypeOf(resourcetype::BusProtocol) implies self.portType=resourcetype::HWPortKind::BUS",
			 "LinkProtocolImpliesLinkType", "self.protocol.oclIsTypeOf(resourcetype::LinkProtocol) implies self.portType=resourcetype::HWPortKind::LINK\n"
		   });													
		addAnnotation
		  (resourceTypeRepositoryEClass, 
		   source, 
		   new String[] {
			 "UniqueProtocolName", "self.protocols->isUnique(name)"
		   });													
	}

} //ResourcetypePackageImpl
