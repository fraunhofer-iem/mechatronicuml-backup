/**
 */
package org.muml.pm.hardware.hwresourceinstance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
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
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.impl.HwresourcePackageImpl;
import org.muml.pm.hardware.hwresourceinstance.ActuatorInstance;
import org.muml.pm.hardware.hwresourceinstance.AtomicResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.CacheInstance;
import org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.DeviceInstance;
import org.muml.pm.hardware.hwresourceinstance.HWPort;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstanceFactory;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.ProcessingMemoryInstance;
import org.muml.pm.hardware.hwresourceinstance.ProcessorInstance;
import org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository;
import org.muml.pm.hardware.hwresourceinstance.SensorInstance;
import org.muml.pm.hardware.hwresourceinstance.StorageMemoryInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.hwresourceinstance.util.HwresourceinstanceValidator;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import org.muml.pm.hardware.impl.HardwarePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwresourceinstancePackageImpl extends EPackageImpl implements HwresourceinstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryResourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageMemoryInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingMemoryInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmableLogicDeviceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicResourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredResourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPortEClass = null;

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
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwresourceinstancePackageImpl() {
		super(eNS_URI, HwresourceinstanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwresourceinstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwresourceinstancePackage init() {
		if (isInited) return (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);

		// Obtain or create and register package
		HwresourceinstancePackageImpl theHwresourceinstancePackage = (HwresourceinstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwresourceinstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwresourceinstancePackageImpl());

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
		HwplatforminstancePackageImpl theHwplatforminstancePackage = (HwplatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) instanceof HwplatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) : HwplatforminstancePackage.eINSTANCE);
		HwresourcePackageImpl theHwresourcePackage = (HwresourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) instanceof HwresourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI) : HwresourcePackage.eINSTANCE);

		// Create package meta-data objects
		theHwresourceinstancePackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theHwplatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		theHwplatforminstancePackage.createPackageContents();
		theHwresourcePackage.createPackageContents();

		// Initialize created meta-data
		theHwresourceinstancePackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theHwplatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		theHwplatforminstancePackage.initializePackageContents();
		theHwresourcePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHwresourceinstancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HwresourceinstanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHwresourceinstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwresourceinstancePackage.eNS_URI, theHwresourceinstancePackage);
		return theHwresourceinstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstance() {
		return resourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_ResourceType() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Hwports() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingResourceInstance() {
		return computingResourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingResourceInstance_Frequency() {
		return (EReference)computingResourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryResourceInstance() {
		return memoryResourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryResourceInstance_MemorySize() {
		return (EReference)memoryResourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryResourceInstance_Throughput() {
		return (EReference)memoryResourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResourceInstance_MemoryType() {
		return (EAttribute)memoryResourceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceInstance() {
		return deviceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageMemoryInstance() {
		return storageMemoryInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingMemoryInstance() {
		return processingMemoryInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCacheInstance() {
		return cacheInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammableLogicDeviceInstance() {
		return programmableLogicDeviceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorInstance() {
		return processorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorInstance_MIPS() {
		return (EAttribute)processorInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorInstance_CPI() {
		return (EAttribute)processorInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessorInstance_OwnedCacheInstance() {
		return (EReference)processorInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicResourceInstance() {
		return atomicResourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicResourceInstance_ParentStructuredResourceInstance() {
		return (EReference)atomicResourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredResourceInstance() {
		return structuredResourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredResourceInstance_EmbeddedAtomicResourceInstances() {
		return (EReference)structuredResourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorInstance() {
		return sensorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorInstance() {
		return actuatorInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstanceRepository() {
		return resourceInstanceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstanceRepository_ResourceInstances() {
		return (EReference)resourceInstanceRepositoryEClass.getEStructuralFeatures().get(0);
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
	public EReference getHWPort_ParentResourceInstance() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPort_CommunicationResource() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(1);
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
	public EReference getHWPort_Cardinality() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPort_MultiHWPort() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPort_PortKind() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceinstanceFactory getHwresourceinstanceFactory() {
		return (HwresourceinstanceFactory)getEFactoryInstance();
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
		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__HWPORTS);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__RESOURCE_TYPE);

		computingResourceInstanceEClass = createEClass(COMPUTING_RESOURCE_INSTANCE);
		createEReference(computingResourceInstanceEClass, COMPUTING_RESOURCE_INSTANCE__FREQUENCY);

		memoryResourceInstanceEClass = createEClass(MEMORY_RESOURCE_INSTANCE);
		createEReference(memoryResourceInstanceEClass, MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE);
		createEReference(memoryResourceInstanceEClass, MEMORY_RESOURCE_INSTANCE__THROUGHPUT);
		createEAttribute(memoryResourceInstanceEClass, MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE);

		deviceInstanceEClass = createEClass(DEVICE_INSTANCE);

		storageMemoryInstanceEClass = createEClass(STORAGE_MEMORY_INSTANCE);

		processingMemoryInstanceEClass = createEClass(PROCESSING_MEMORY_INSTANCE);

		cacheInstanceEClass = createEClass(CACHE_INSTANCE);

		programmableLogicDeviceInstanceEClass = createEClass(PROGRAMMABLE_LOGIC_DEVICE_INSTANCE);

		processorInstanceEClass = createEClass(PROCESSOR_INSTANCE);
		createEAttribute(processorInstanceEClass, PROCESSOR_INSTANCE__MIPS);
		createEAttribute(processorInstanceEClass, PROCESSOR_INSTANCE__CPI);
		createEReference(processorInstanceEClass, PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE);

		atomicResourceInstanceEClass = createEClass(ATOMIC_RESOURCE_INSTANCE);
		createEReference(atomicResourceInstanceEClass, ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE);

		structuredResourceInstanceEClass = createEClass(STRUCTURED_RESOURCE_INSTANCE);
		createEReference(structuredResourceInstanceEClass, STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES);

		sensorInstanceEClass = createEClass(SENSOR_INSTANCE);

		actuatorInstanceEClass = createEClass(ACTUATOR_INSTANCE);

		resourceInstanceRepositoryEClass = createEClass(RESOURCE_INSTANCE_REPOSITORY);
		createEReference(resourceInstanceRepositoryEClass, RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES);

		hwPortEClass = createEClass(HW_PORT);
		createEReference(hwPortEClass, HW_PORT__PARENT_RESOURCE_INSTANCE);
		createEReference(hwPortEClass, HW_PORT__COMMUNICATION_RESOURCE);
		createEReference(hwPortEClass, HW_PORT__PROTOCOL);
		createEReference(hwPortEClass, HW_PORT__CARDINALITY);
		createEAttribute(hwPortEClass, HW_PORT__MULTI_HW_PORT);
		createEAttribute(hwPortEClass, HW_PORT__PORT_KIND);
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
		HwresourcePackage theHwresourcePackage = (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		computingResourceInstanceEClass.getESuperTypes().add(this.getAtomicResourceInstance());
		memoryResourceInstanceEClass.getESuperTypes().add(this.getAtomicResourceInstance());
		deviceInstanceEClass.getESuperTypes().add(this.getResourceInstance());
		storageMemoryInstanceEClass.getESuperTypes().add(this.getMemoryResourceInstance());
		processingMemoryInstanceEClass.getESuperTypes().add(this.getMemoryResourceInstance());
		cacheInstanceEClass.getESuperTypes().add(this.getMemoryResourceInstance());
		programmableLogicDeviceInstanceEClass.getESuperTypes().add(this.getComputingResourceInstance());
		processorInstanceEClass.getESuperTypes().add(this.getComputingResourceInstance());
		atomicResourceInstanceEClass.getESuperTypes().add(this.getResourceInstance());
		structuredResourceInstanceEClass.getESuperTypes().add(this.getResourceInstance());
		sensorInstanceEClass.getESuperTypes().add(this.getDeviceInstance());
		actuatorInstanceEClass.getESuperTypes().add(this.getDeviceInstance());
		resourceInstanceRepositoryEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		hwPortEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstance_Hwports(), this.getHWPort(), this.getHWPort_ParentResourceInstance(), "hwports", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_ResourceType(), theHwresourcePackage.getResource(), null, "resourceType", null, 1, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceInstanceEClass, ComputingResourceInstance.class, "ComputingResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingResourceInstance_Frequency(), theHwvaluetypePackage.getFrequency(), null, "frequency", null, 1, 1, ComputingResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryResourceInstanceEClass, MemoryResourceInstance.class, "MemoryResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryResourceInstance_MemorySize(), theHwvaluetypePackage.getDataSize(), null, "memorySize", null, 1, 1, MemoryResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryResourceInstance_Throughput(), theHwvaluetypePackage.getDataRate(), null, "throughput", null, 0, 1, MemoryResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryResourceInstance_MemoryType(), theHwresourcePackage.getMemoryKind(), "memoryType", null, 1, 1, MemoryResourceInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(deviceInstanceEClass, DeviceInstance.class, "DeviceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageMemoryInstanceEClass, StorageMemoryInstance.class, "StorageMemoryInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingMemoryInstanceEClass, ProcessingMemoryInstance.class, "ProcessingMemoryInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cacheInstanceEClass, CacheInstance.class, "CacheInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programmableLogicDeviceInstanceEClass, ProgrammableLogicDeviceInstance.class, "ProgrammableLogicDeviceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorInstanceEClass, ProcessorInstance.class, "ProcessorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessorInstance_MIPS(), ecorePackage.getEFloat(), "MIPS", null, 0, 1, ProcessorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessorInstance_CPI(), ecorePackage.getEFloat(), "CPI", null, 0, 1, ProcessorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessorInstance_OwnedCacheInstance(), this.getCacheInstance(), null, "ownedCacheInstance", null, 0, 1, ProcessorInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicResourceInstanceEClass, AtomicResourceInstance.class, "AtomicResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicResourceInstance_ParentStructuredResourceInstance(), this.getStructuredResourceInstance(), this.getStructuredResourceInstance_EmbeddedAtomicResourceInstances(), "parentStructuredResourceInstance", null, 1, 1, AtomicResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredResourceInstanceEClass, StructuredResourceInstance.class, "StructuredResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredResourceInstance_EmbeddedAtomicResourceInstances(), this.getAtomicResourceInstance(), this.getAtomicResourceInstance_ParentStructuredResourceInstance(), "embeddedAtomicResourceInstances", null, 1, -1, StructuredResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorInstanceEClass, SensorInstance.class, "SensorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorInstanceEClass, ActuatorInstance.class, "ActuatorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceInstanceRepositoryEClass, ResourceInstanceRepository.class, "ResourceInstanceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstanceRepository_ResourceInstances(), this.getResourceInstance(), null, "resourceInstances", null, 1, -1, ResourceInstanceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortEClass, HWPort.class, "HWPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPort_ParentResourceInstance(), this.getResourceInstance(), this.getResourceInstance_Hwports(), "parentResourceInstance", null, 0, 1, HWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPort_CommunicationResource(), theHwresourcePackage.getCommunicationResource(), null, "communicationResource", null, 0, 1, HWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPort_Protocol(), theHwresourcePackage.getCommunicationProtocol(), null, "protocol", null, 0, 1, HWPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPort_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 0, 1, HWPort.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPort_MultiHWPort(), ecorePackage.getEBoolean(), "multiHWPort", null, 0, 1, HWPort.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPort_PortKind(), theHwresourcePackage.getCommunicationKind(), "portKind", null, 1, 1, HWPort.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (memoryResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "CheckResourceType"
		   });	
		addAnnotation
		  (storageMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "CheckMemoryNonVolatile"
		   });	
		addAnnotation
		  (processingMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "CheckMemoryVolatile"
		   });	
		addAnnotation
		  (programmableLogicDeviceInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "CheckResourceType"
		   });	
		addAnnotation
		  (processorInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "CheckResourceType"
		   });	
		addAnnotation
		  (structuredResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "CheckResourceType AllAtomicResourceTypesAreInitialized UniquePortNames"
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
		  (memoryResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckResourceType", "-- The ResourceType must be of Kind MemoryResource\nself.resourceType.oclIsKindOf(hwresource::MemoryResource)"
		   });	
		addAnnotation
		  (getMemoryResourceInstance_MemoryType(), 
		   source, 
		   new String[] {
			 "derivation", "self.resourceType.oclAsType(hwresource::MemoryResource).memoryType"
		   });	
		addAnnotation
		  (storageMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckMemoryNonVolatile", "-- The ResourceType must be of Kind non-volatile MemoryResource\n-- The ResourceType must be of Kind volatile MemoryResource\nif self.resourceType.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.resourceType.oclAsType(hwresource::MemoryResource).isVolatile=false\r\nendif\n\n"
		   });	
		addAnnotation
		  (processingMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckMemoryVolatile", "-- The ResourceType must be of Kind volatile MemoryResource\nif self.resourceType.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.resourceType.oclAsType(hwresource::MemoryResource).isVolatile=true\r\nendif\n\n"
		   });	
		addAnnotation
		  (programmableLogicDeviceInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckResourceType", "-- ResourceType must be of Kind PLD\nself.resourceType.oclIsKindOf(hwresource::ProgrammableLogicDevice)"
		   });	
		addAnnotation
		  (processorInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckResourceType", "-- ResourceType must be of Kind Processor\nself.resourceType.oclIsKindOf(hwresource::Processor)"
		   });	
		addAnnotation
		  (structuredResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "AllAtomicResourceTypesAreInitialized", "-- All Atomic Resources must be initialized\nif(self.resourceType.oclIsUndefined()) then\n\ttrue\nelse \n\tself.resourceType.oclAsType(hwresource::StructuredResource).embeddedAtomicResources->forAll(atomicResourceType | self.embeddedAtomicResourceInstances->exists(atomicResourceInstance | atomicResourceInstance.oclAsType(hwresourceinstance::AtomicResourceInstance).resourceType = atomicResourceType))\nendif",
			 "CheckResourceType", "-- ResourceType must be of Kind StructuredResource\nself.resourceType.oclIsKindOf(hwresource::StructuredResource)",
			 "UniquePortNames", "-- The Ports must have an unique name\nself.hwports->isUnique(name)"
		   });	
		addAnnotation
		  (getHWPort_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.communicationResource.oclIsUndefined()) then\n\tif self.oclIsKindOf(hwplatform::DelegationHWPort) then\n   \t\t let endpoints : Set(connector::ConnectorEndpoint) = self.oclAsType(connector::ConnectorEndpoint)->closure(c| c.oclAsType(connector::ConnectorEndpoint).connectors.connectorEndpoints)->asOrderedSet() in\n   \t\t let buses : Bag (hwplatform::Bus) = endpoints->select(e|e.oclIsKindOf(hwplatform::Bus) and not e.oclAsType(hwplatform::Bus).protocol.oclIsUndefined()).oclAsType(hwplatform::Bus) in\n   \t\t let ports : Bag (hwplatform::HWPortPart) = endpoints->select(e|e.oclIsKindOf(hwplatform::HWPortPart) and not e.oclAsType(hwplatform::HWPortPart).hwport.protocol.oclIsUndefined()).oclAsType(hwplatform::HWPortPart) in\n  \t\tlet usedprotocols : Bag(hwresource::CommunicationProtocol) = buses.protocol->union(ports.hwport.protocol) in\n  \t\tusedprotocols->any(true)\n \telse null\n\tendif\nelse\n \tself.communicationResource.protocol\n endif"
		   });	
		addAnnotation
		  (getHWPort_Cardinality(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.communicationResource.oclIsUndefined()) then\n\t null\n\telse\n\t \tself.communicationResource.cardinality\n\t endif"
		   });	
		addAnnotation
		  (getHWPort_MultiHWPort(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationResource.oclIsUndefined()) then\n\tfalse\nelse \n   self.communicationResource.multiHWPort\n  endif"
		   });	
		addAnnotation
		  (getHWPort_PortKind(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.communicationResource.oclIsUndefined()) then\n\thwresource::CommunicationKind::DELEGATION\nelse \n   self.communicationResource.portKind\n endif"
		   });
	}

} //HwresourceinstancePackageImpl
