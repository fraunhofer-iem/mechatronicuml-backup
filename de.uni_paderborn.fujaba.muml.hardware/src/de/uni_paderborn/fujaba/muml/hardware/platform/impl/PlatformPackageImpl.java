/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.platform.ComputingResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.DeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.MemoryResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.util.PlatformValidator;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.impl.PlatforminstancePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourcetypePackageImpl;
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
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
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
	private EClass communicationResourceEClass = null;

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
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMediaEClass = null;

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
	private EClass bridgeEClass = null;

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
	private EClass busPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPortInstanceEClass = null;

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
	private EClass resourceInstancePartEClass = null;

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
	private EClass hwPortPartEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlatformPackageImpl());

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
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) instanceof ResourcetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI) : ResourcetypePackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		PlatforminstancePackageImpl thePlatforminstancePackage = (PlatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI) instanceof PlatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatforminstancePackage.eNS_URI) : PlatforminstancePackage.eINSTANCE);

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		thePlatforminstancePackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		thePlatforminstancePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePlatformPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PlatformValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatformPackage.eNS_URI, thePlatformPackage);
		return thePlatformPackage;
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
	public EReference getHWPlatformConfiguration_Repositories() {
		return (EReference)hwPlatformConfigurationEClass.getEStructuralFeatures().get(1);
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
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_HwportInstances() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(1);
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
	public EClass getCommunicationResource() {
		return communicationResourceEClass;
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
	public EReference getBus_ConnectedBusPortInstances() {
		return (EReference)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_ConnectedLinkPortInstances() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMedia() {
		return communicationMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedia_DataFrameSize() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_IsSerial() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedia_Bandwidth() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedia_Protocol() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedia_ConnectedHWPortParts() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedia_ConnectedBridges() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(5);
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
	public EReference getHWPlatform_EmbeddedCommunicationResources() {
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
	public EReference getHWPlatform_Delegations() {
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
	public EReference getHWPlatformPart_DerivedBridges() {
		return (EReference)hwPlatformPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPlatformPart_DelegationPorts() {
		return (EReference)hwPlatformPartEClass.getEStructuralFeatures().get(2);
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
	public EClass getBridge() {
		return bridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridge_ConnectedCommunicationMedia() {
		return (EReference)bridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBridge_Delay() {
		return (EReference)bridgeEClass.getEStructuralFeatures().get(1);
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
	public EReference getHWPortInstance_HwportType() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_ParentResourceInstance() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_QueuingTime() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_Protocol() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_ConnectedMedia() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_PayloadDataSize() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWPortInstance_IsDelegationPort() {
		return (EAttribute)hwPortInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortInstance_Delegation() {
		return (EReference)hwPortInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusPortInstance() {
		return busPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusPortInstance_ConnectedBus() {
		return (EReference)busPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPortInstance() {
		return linkPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPortInstance_ConnectedLink() {
		return (EReference)linkPortInstanceEClass.getEStructuralFeatures().get(0);
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
	public EReference getResourceInstanceRepository_ResourceTypeRepository() {
		return (EReference)resourceInstanceRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstancePart() {
		return resourceInstancePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstancePart_ResourceInstanceType() {
		return (EReference)resourceInstancePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstancePart_HwportParts() {
		return (EReference)resourceInstancePartEClass.getEStructuralFeatures().get(1);
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
	public EReference getDelegation_HwPortInstance() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_HwPortPart() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(1);
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
	public EReference getHWPortPart_HwPortInstanceType() {
		return (EReference)hwPortPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWPortPart_ConnectedMedia() {
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
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
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
		createEReference(hwPlatformConfigurationEClass, HW_PLATFORM_CONFIGURATION__REPOSITORIES);

		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__RESOURCE_TYPE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__HWPORT_INSTANCES);

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

		communicationResourceEClass = createEClass(COMMUNICATION_RESOURCE);

		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__CONNECTED_BUS_PORT_INSTANCES);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__CONNECTED_LINK_PORT_INSTANCES);

		communicationMediaEClass = createEClass(COMMUNICATION_MEDIA);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__DATA_FRAME_SIZE);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__IS_SERIAL);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__BANDWIDTH);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__PROTOCOL);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__CONNECTED_HW_PORT_PARTS);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__CONNECTED_BRIDGES);

		hwPlatformEClass = createEClass(HW_PLATFORM);
		createEReference(hwPlatformEClass, HW_PLATFORM__EMBEDDED_PLATFORM_PARTS);
		createEReference(hwPlatformEClass, HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES);
		createEReference(hwPlatformEClass, HW_PLATFORM__DELEGATION_PORTS);
		createEReference(hwPlatformEClass, HW_PLATFORM__DELEGATIONS);

		platformPartEClass = createEClass(PLATFORM_PART);
		createEReference(platformPartEClass, PLATFORM_PART__PARENT_HW_PLATFORM);
		createEReference(platformPartEClass, PLATFORM_PART__CARDINALITY);

		hwPlatformPartEClass = createEClass(HW_PLATFORM_PART);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__HWPLATFORM_TYPE);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__DERIVED_BRIDGES);
		createEReference(hwPlatformPartEClass, HW_PLATFORM_PART__DELEGATION_PORTS);

		sensorInstanceEClass = createEClass(SENSOR_INSTANCE);

		actuatorInstanceEClass = createEClass(ACTUATOR_INSTANCE);

		bridgeEClass = createEClass(BRIDGE);
		createEReference(bridgeEClass, BRIDGE__CONNECTED_COMMUNICATION_MEDIA);
		createEReference(bridgeEClass, BRIDGE__DELAY);

		hwPortInstanceEClass = createEClass(HW_PORT_INSTANCE);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__HWPORT_TYPE);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__PARENT_RESOURCE_INSTANCE);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__QUEUING_TIME);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__PROTOCOL);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__CONNECTED_MEDIA);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__PAYLOAD_DATA_SIZE);
		createEAttribute(hwPortInstanceEClass, HW_PORT_INSTANCE__IS_DELEGATION_PORT);
		createEReference(hwPortInstanceEClass, HW_PORT_INSTANCE__DELEGATION);

		busPortInstanceEClass = createEClass(BUS_PORT_INSTANCE);
		createEReference(busPortInstanceEClass, BUS_PORT_INSTANCE__CONNECTED_BUS);

		linkPortInstanceEClass = createEClass(LINK_PORT_INSTANCE);
		createEReference(linkPortInstanceEClass, LINK_PORT_INSTANCE__CONNECTED_LINK);

		resourceInstanceRepositoryEClass = createEClass(RESOURCE_INSTANCE_REPOSITORY);
		createEReference(resourceInstanceRepositoryEClass, RESOURCE_INSTANCE_REPOSITORY__RESOURCE_INSTANCES);
		createEReference(resourceInstanceRepositoryEClass, RESOURCE_INSTANCE_REPOSITORY__RESOURCE_TYPE_REPOSITORY);

		resourceInstancePartEClass = createEClass(RESOURCE_INSTANCE_PART);
		createEReference(resourceInstancePartEClass, RESOURCE_INSTANCE_PART__RESOURCE_INSTANCE_TYPE);
		createEReference(resourceInstancePartEClass, RESOURCE_INSTANCE_PART__HWPORT_PARTS);

		delegationEClass = createEClass(DELEGATION);
		createEReference(delegationEClass, DELEGATION__HW_PORT_INSTANCE);
		createEReference(delegationEClass, DELEGATION__HW_PORT_PART);

		hwPortPartEClass = createEClass(HW_PORT_PART);
		createEReference(hwPortPartEClass, HW_PORT_PART__HW_PORT_INSTANCE_TYPE);
		createEReference(hwPortPartEClass, HW_PORT_PART__CONNECTED_MEDIA);
		createEReference(hwPortPartEClass, HW_PORT_PART__PROTOCOL);
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
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hwPlatformConfigurationEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		resourceInstanceEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
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
		communicationResourceEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		busEClass.getESuperTypes().add(this.getCommunicationMedia());
		linkEClass.getESuperTypes().add(this.getCommunicationMedia());
		communicationMediaEClass.getESuperTypes().add(this.getCommunicationResource());
		hwPlatformEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		platformPartEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		hwPlatformPartEClass.getESuperTypes().add(this.getPlatformPart());
		sensorInstanceEClass.getESuperTypes().add(this.getDeviceInstance());
		actuatorInstanceEClass.getESuperTypes().add(this.getDeviceInstance());
		bridgeEClass.getESuperTypes().add(this.getCommunicationResource());
		hwPortInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		busPortInstanceEClass.getESuperTypes().add(this.getHWPortInstance());
		linkPortInstanceEClass.getESuperTypes().add(this.getHWPortInstance());
		resourceInstanceRepositoryEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		resourceInstancePartEClass.getESuperTypes().add(this.getPlatformPart());
		delegationEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		hwPortPartEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(hwPlatformConfigurationEClass, HWPlatformConfiguration.class, "HWPlatformConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformConfiguration_Hwplatforms(), this.getHWPlatform(), null, "hwplatforms", null, 0, -1, HWPlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformConfiguration_Repositories(), this.getResourceInstanceRepository(), null, "repositories", null, 1, -1, HWPlatformConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstance_ResourceType(), theResourcetypePackage.getResourceType(), null, "resourceType", null, 1, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_HwportInstances(), this.getHWPortInstance(), this.getHWPortInstance_ParentResourceInstance(), "hwportInstances", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceInstanceEClass, ComputingResourceInstance.class, "ComputingResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingResourceInstance_Frequency(), theHwvaluetypePackage.getFrequency(), null, "frequency", null, 1, 1, ComputingResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryResourceInstanceEClass, MemoryResourceInstance.class, "MemoryResourceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryResourceInstance_MemorySize(), theHwvaluetypePackage.getDataSize(), null, "memorySize", null, 1, 1, MemoryResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryResourceInstance_Throughput(), theHwvaluetypePackage.getDataRate(), null, "throughput", null, 0, 1, MemoryResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryResourceInstance_MemoryType(), theResourcetypePackage.getMemoryKind(), "memoryType", null, 1, 1, MemoryResourceInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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

		initEClass(communicationResourceEClass, CommunicationResource.class, "CommunicationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_ConnectedBusPortInstances(), this.getHWPortPart(), null, "connectedBusPortInstances", null, 0, -1, Bus.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_ConnectedLinkPortInstances(), this.getHWPortPart(), null, "connectedLinkPortInstances", null, 0, -1, Link.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(communicationMediaEClass, CommunicationMedia.class, "CommunicationMedia", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMedia_DataFrameSize(), theHwvaluetypePackage.getDataSize(), null, "dataFrameSize", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationMedia_IsSerial(), ecorePackage.getEBoolean(), "isSerial", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMedia_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 1, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMedia_Protocol(), theResourcetypePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMedia_ConnectedHWPortParts(), this.getHWPortPart(), this.getHWPortPart_ConnectedMedia(), "connectedHWPortParts", null, 0, -1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMedia_ConnectedBridges(), this.getBridge(), this.getBridge_ConnectedCommunicationMedia(), "connectedBridges", null, 0, -1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformEClass, HWPlatform.class, "HWPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatform_EmbeddedPlatformParts(), this.getPlatformPart(), this.getPlatformPart_ParentHWPlatform(), "embeddedPlatformParts", null, 1, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_EmbeddedCommunicationResources(), this.getCommunicationResource(), null, "embeddedCommunicationResources", null, 1, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_DelegationPorts(), this.getHWPortInstance(), null, "delegationPorts", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatform_Delegations(), this.getDelegation(), null, "delegations", null, 0, -1, HWPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformPartEClass, PlatformPart.class, "PlatformPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformPart_ParentHWPlatform(), this.getHWPlatform(), this.getHWPlatform_EmbeddedPlatformParts(), "parentHWPlatform", null, 1, 1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformPart_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, PlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPlatformPartEClass, HWPlatformPart.class, "HWPlatformPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPlatformPart_HwplatformType(), this.getHWPlatform(), null, "hwplatformType", null, 1, 1, HWPlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformPart_DerivedBridges(), this.getBridge(), null, "derivedBridges", null, 0, -1, HWPlatformPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPlatformPart_DelegationPorts(), this.getHWPortPart(), null, "delegationPorts", null, 0, -1, HWPlatformPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorInstanceEClass, SensorInstance.class, "SensorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorInstanceEClass, ActuatorInstance.class, "ActuatorInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bridgeEClass, Bridge.class, "Bridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBridge_ConnectedCommunicationMedia(), this.getCommunicationMedia(), this.getCommunicationMedia_ConnectedBridges(), "connectedCommunicationMedia", null, 2, -1, Bridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBridge_Delay(), theHwvaluetypePackage.getTimeInterval(), null, "delay", null, 0, 1, Bridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortInstanceEClass, HWPortInstance.class, "HWPortInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPortInstance_HwportType(), theResourcetypePackage.getHWPort(), null, "hwportType", null, 1, 1, HWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_ParentResourceInstance(), this.getResourceInstance(), this.getResourceInstance_HwportInstances(), "parentResourceInstance", null, 0, 1, HWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_QueuingTime(), theHwvaluetypePackage.getTimeInterval(), null, "queuingTime", null, 0, 1, HWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_Protocol(), theResourcetypePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, HWPortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_ConnectedMedia(), this.getCommunicationMedia(), null, "connectedMedia", null, 0, -1, HWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_PayloadDataSize(), theHwvaluetypePackage.getDataSize(), null, "payloadDataSize", null, 0, 1, HWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHWPortInstance_IsDelegationPort(), ecorePackage.getEBoolean(), "isDelegationPort", "false", 1, 1, HWPortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortInstance_Delegation(), this.getDelegation(), this.getDelegation_HwPortInstance(), "delegation", null, 0, -1, HWPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busPortInstanceEClass, BusPortInstance.class, "BusPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusPortInstance_ConnectedBus(), this.getBus(), null, "connectedBus", null, 0, -1, BusPortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkPortInstanceEClass, LinkPortInstance.class, "LinkPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkPortInstance_ConnectedLink(), this.getLink(), null, "connectedLink", null, 0, -1, LinkPortInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resourceInstanceRepositoryEClass, ResourceInstanceRepository.class, "ResourceInstanceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstanceRepository_ResourceInstances(), this.getResourceInstance(), null, "resourceInstances", null, 1, -1, ResourceInstanceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstanceRepository_ResourceTypeRepository(), theResourcetypePackage.getResourceTypeRepository(), null, "resourceTypeRepository", null, 1, 1, ResourceInstanceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceInstancePartEClass, ResourceInstancePart.class, "ResourceInstancePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInstancePart_ResourceInstanceType(), this.getResourceInstance(), null, "resourceInstanceType", null, 1, 1, ResourceInstancePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstancePart_HwportParts(), this.getHWPortPart(), null, "hwportParts", null, 0, -1, ResourceInstancePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegation_HwPortInstance(), this.getHWPortInstance(), this.getHWPortInstance_Delegation(), "hwPortInstance", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_HwPortPart(), this.getHWPortPart(), null, "hwPortPart", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortPartEClass, HWPortPart.class, "HWPortPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPortPart_HwPortInstanceType(), this.getHWPortInstance(), null, "hwPortInstanceType", null, 1, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_ConnectedMedia(), this.getCommunicationMedia(), this.getCommunicationMedia_ConnectedHWPortParts(), "connectedMedia", null, 0, 1, HWPortPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWPortPart_Protocol(), theResourcetypePackage.getCommunicationProtocol(), null, "protocol", null, 1, 1, HWPortPart.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
			 "documentation", "The package platform contains all classes of the Platform Type Viewpoint.\nHardware platforms are defined at the type level and may be instantiated in a HWPlatformInstanceConfiguration at the Platform Instance Viewpoint.\n"
		   });			
		addAnnotation
		  (hwPlatformConfigurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a hardware platform configuration at type level.\n A hardware platform configuration consists of several HWPlatforms and ResourceInstanceRepositories that contain all ResourceInstances to build a HWPlatform."
		   });		
		addAnnotation
		  (getHWPlatformConfiguration_Hwplatforms(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPlatforms that are contained in this HWPlatformConfiguration."
		   });		
		addAnnotation
		  (getHWPlatformConfiguration_Repositories(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceInstanceRepositories that belong to this HWPlatformConfiguration."
		   });		
		addAnnotation
		  (resourceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class is the super class of all resource instances.\nThe associated HWPortInstances are determined by its resource type."
		   });		
		addAnnotation
		  (getResourceInstance_ResourceType(), 
		   source, 
		   new String[] {
			 "documentation", "The resource type of which this ResourceInstance is derived."
		   });		
		addAnnotation
		  (getResourceInstance_HwportInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPortInstances which belong to this ResourceInstance. They are derived by the resourceType."
		   });		
		addAnnotation
		  (computingResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an instance of a ComputingResource.\nComputingResources are resources that are able to execute code."
		   });		
		addAnnotation
		  (getComputingResourceInstance_Frequency(), 
		   source, 
		   new String[] {
			 "documentation", "The frequency or clock rate of this ComputingResource."
		   });				
		addAnnotation
		  (memoryResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class is the super class for all memory instances."
		   });		
		addAnnotation
		  (getMemoryResourceInstance_MemorySize(), 
		   source, 
		   new String[] {
			 "documentation", "The total size of  memory this instances provides."
		   });		
		addAnnotation
		  (getMemoryResourceInstance_Throughput(), 
		   source, 
		   new String[] {
			 "documentation", "The maximum speed at which the memory can be read."
		   });			
		addAnnotation
		  (getMemoryResourceInstance_MemoryType(), 
		   source, 
		   new String[] {
			 "documentation", "The type of this MemoryInstance. It is derived from its resourceType."
		   });		
		addAnnotation
		  (deviceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class is the super class of all sensors and actuators at instance level."
		   });				
		addAnnotation
		  (storageMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an instance of non-volatile memory which is capable of storing data."
		   });				
		addAnnotation
		  (processingMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents fast and volatile processing memory (i.e. SRAM)."
		   });		
		addAnnotation
		  (cacheInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a cache at instance level."
		   });				
		addAnnotation
		  (programmableLogicDeviceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a PLD at instance level."
		   });				
		addAnnotation
		  (processorInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "A processor at instance level."
		   });		
		addAnnotation
		  (getProcessorInstance_MIPS(), 
		   source, 
		   new String[] {
			 "documentation", "The MIPS-Rate (Million instructions per second) of this ProcessorInstance."
		   });		
		addAnnotation
		  (getProcessorInstance_CPI(), 
		   source, 
		   new String[] {
			 "documentation", "The average count of cycles per instruction (CPI) of this ProcessorInstance."
		   });		
		addAnnotation
		  (getProcessorInstance_OwnedCacheInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The CacheInstance this ProcessorInstance uses."
		   });		
		addAnnotation
		  (atomicResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "The abstract class AtomicResourceInstance is the super class for all atomic resource instances."
		   });		
		addAnnotation
		  (getAtomicResourceInstance_ParentStructuredResourceInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The StructuredResourceInstance, this AtomicResourceInstance belongs to."
		   });				
		addAnnotation
		  (structuredResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a structured resource at instance level.\nA StructuredResourceInstance is  derived from its resourcetype.\nThe embedded AtomicResourceInstances of this StructuredResourceInstance are derived from its type."
		   });		
		addAnnotation
		  (getStructuredResourceInstance_EmbeddedAtomicResourceInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The AtomicResourceInstances which are contained in this StructuredResourceInstance.\nThe AtomicResourceInstances are determined by the AtomicResources which are embedded in the StructuredResource type."
		   });		
		addAnnotation
		  (communicationResourceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents all resources which are able to transmit data."
		   });		
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a bus. A bus is used to connect several BusPortInstances."
		   });					
		addAnnotation
		  (getBus_ConnectedBusPortInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The connected BusPortInstances. \n They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia."
		   });				
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a link connection. A link can only be connected to two LinkPortInstances or to one LinkPortInstance and one Bridge."
		   });			
		addAnnotation
		  (getLink_ConnectedLinkPortInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The connected LinkPortInstances.\n They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia."
		   });		
		addAnnotation
		  (communicationMediaEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represents CommuniationMedia.\nCommunicationMedia are used to connect HWPortInstances."
		   });		
		addAnnotation
		  (getCommunicationMedia_DataFrameSize(), 
		   source, 
		   new String[] {
			 "documentation", "The size of a data frame."
		   });		
		addAnnotation
		  (getCommunicationMedia_IsSerial(), 
		   source, 
		   new String[] {
			 "documentation", "Determines if this CommunicationMedia uses a serial communication."
		   });		
		addAnnotation
		  (getCommunicationMedia_Bandwidth(), 
		   source, 
		   new String[] {
			 "documentation", "The bandwidth of this CommunicationMedia."
		   });		
		addAnnotation
		  (getCommunicationMedia_Protocol(), 
		   source, 
		   new String[] {
			 "documentation", "The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol."
		   });		
		addAnnotation
		  (getCommunicationMedia_ConnectedHWPortParts(), 
		   source, 
		   new String[] {
			 "documentation", "The connected HWPortInstances."
		   });		
		addAnnotation
		  (getCommunicationMedia_ConnectedBridges(), 
		   source, 
		   new String[] {
			 "documentation", "The Bridges this CommunicationMedia is connected to."
		   });		
		addAnnotation
		  (hwPlatformEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a hardware platform at the type level. \nA HWPlatform consists of several embedded PlatformParts and several CommunicationResources to connect the embedded PlatformParts."
		   });		
		addAnnotation
		  (getHWPlatform_EmbeddedPlatformParts(), 
		   source, 
		   new String[] {
			 "documentation", "The PlatformParts which are embedded in this HWPlatform. \nA PlatformPart is either a  HWPlatformPart or a ResourceInstancePart."
		   });		
		addAnnotation
		  (getHWPlatform_EmbeddedCommunicationResources(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationResources this HWPlatform contains."
		   });		
		addAnnotation
		  (getHWPlatform_DelegationPorts(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPortInstances of this HWPlatform that are used as delegation ports."
		   });		
		addAnnotation
		  (getHWPlatform_Delegations(), 
		   source, 
		   new String[] {
			 "documentation", "The port delegations which are used in the HWPlatform."
		   });				
		addAnnotation
		  (platformPartEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represents a PlatformPart. \nPlatformParts are used to specify the inner structure of a HWPlatform.\r\nA PlatformPart can be a HWPlatformPart or a ResourceInstancePart."
		   });		
		addAnnotation
		  (getPlatformPart_ParentHWPlatform(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPlatform, this PlatformPart belongs to."
		   });		
		addAnnotation
		  (getPlatformPart_Cardinality(), 
		   source, 
		   new String[] {
			 "documentation", "The cardinality of a PlatformPart determines how many instances are allowed to exist in the associated HWPlatformInstance at instance level."
		   });				
		addAnnotation
		  (hwPlatformPartEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a HWPlatformPart. \nHWPlatformParts are used to specify the structure of a HWPlatform. \nA HWPlatformPart is embedded in a HWPlatform and it is typed over a HWPlatform."
		   });		
		addAnnotation
		  (getHWPlatformPart_HwplatformType(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPlatform type of this HWPlatformPart."
		   });			
		addAnnotation
		  (getHWPlatformPart_DerivedBridges(), 
		   source, 
		   new String[] {
			 "documentation", "The Bridges of this HWPlatform. \nThey are derived from the reference embeddedCommunicationResource of the hwplatformType."
		   });		
		addAnnotation
		  (sensorInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a sensor device at instance level."
		   });		
		addAnnotation
		  (actuatorInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an actuator device at instance level."
		   });		
		addAnnotation
		  (bridgeEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a bridge or a gateway. Bridges are used to connect two or more CommunicationMedia."
		   });		
		addAnnotation
		  (getBridge_ConnectedCommunicationMedia(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationMedia which are connected to this Bridge."
		   });		
		addAnnotation
		  (getBridge_Delay(), 
		   source, 
		   new String[] {
			 "documentation", "The time variation this Bridge needs to transmit data between different CommunicationMedia."
		   });				
		addAnnotation
		  (hwPortInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "A HWPortInstance is a HWPort of a ResourceInstance at instance level.\nHardware ports are interaction points that can be used to connect ResourceInstances via CommunicationMedia.\n"
		   });		
		addAnnotation
		  (getHWPortInstance_HwportType(), 
		   source, 
		   new String[] {
			 "documentation", "The port type of this HWPortInstance."
		   });		
		addAnnotation
		  (getHWPortInstance_ParentResourceInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceInstance, this HWPortInstance belongs to."
		   });		
		addAnnotation
		  (getHWPortInstance_QueuingTime(), 
		   source, 
		   new String[] {
			 "documentation", "The queuing time of this HWPortInstance."
		   });			
		addAnnotation
		  (getHWPortInstance_Protocol(), 
		   source, 
		   new String[] {
			 "documentation", "The used protocol of this HWPortInstance."
		   });		
		addAnnotation
		  (getHWPortInstance_ConnectedMedia(), 
		   source, 
		   new String[] {
			 "documentation", "The CommunicationMedia that is connected to this HWPortInstance."
		   });		
		addAnnotation
		  (getHWPortInstance_PayloadDataSize(), 
		   source, 
		   new String[] {
			 "documentation", "The average size of the payload data that is transmitted over this HWPortInstance."
		   });			
		addAnnotation
		  (getHWPortInstance_IsDelegationPort(), 
		   source, 
		   new String[] {
			 "documentation", "Determines if this HWPortInstance is used as a delegation port."
		   });		
		addAnnotation
		  (getHWPortInstance_Delegation(), 
		   source, 
		   new String[] {
			 "documentation", "The delegation this HWPortInstance is connected to."
		   });		
		addAnnotation
		  (busPortInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a hardware bus port at instance level."
		   });			
		addAnnotation
		  (getBusPortInstance_ConnectedBus(), 
		   source, 
		   new String[] {
			 "documentation", "The Bus which is connected to this BusPortInstance.\nIt is derived from the reference connectedMedia of the super class HWPortInstance."
		   });		
		addAnnotation
		  (linkPortInstanceEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a link port at instance level."
		   });			
		addAnnotation
		  (getLinkPortInstance_ConnectedLink(), 
		   source, 
		   new String[] {
			 "documentation", "The Link that is connected to this LinkPortInstance.\nIt is derived from the reference connectedMedia of the super class HWPortInstance."
		   });		
		addAnnotation
		  (resourceInstanceRepositoryEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a ResourceInstanceRepository. \nA ResourceInstanceRepository contains all ResourceInstances to build a HWPlatform. The ResourceInstances are derived from a ResourceTypeRepository."
		   });		
		addAnnotation
		  (getResourceInstanceRepository_ResourceInstances(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceInstances that are contained in this ResourceInstanceRepository. They are derived from a ResourceTypeRepository."
		   });		
		addAnnotation
		  (getResourceInstanceRepository_ResourceTypeRepository(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceTypeRepository which contains the ResourceTypes that are instantiated in this ResourceInstanceRepository."
		   });		
		addAnnotation
		  (resourceInstancePartEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a ResourceInstancePart. \nResourceInstanceParts are used to specify the structure of a HWPlatform. \nA ResourceInstancePart is embedded in a HWPlatform and it is typed over a ResourceInstance."
		   });		
		addAnnotation
		  (getResourceInstancePart_ResourceInstanceType(), 
		   source, 
		   new String[] {
			 "documentation", "The ResourceInstance type of this ResourceInstancePart."
		   });		
		addAnnotation
		  (getResourceInstancePart_HwportParts(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPortInstances of this ResourceInstance. \nThey are derived from the reference hwportInstances of the resourceInstanceType."
		   });		
		addAnnotation
		  (delegationEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a delegation.\n A delegation connects a hwport of a StructuredResourceInstance and a port of \r\nHWPlatform that contains the StructuredResourceInstance.\r\nA delegation has no behavior.\nAt runtime level, the port of the HWPlatform and the port of the StructuredResourceInstance will be the same. \nIt is used as a technique for encapsulation of a HWPlatform."
		   });				
		addAnnotation
		  (getDelegation_HwPortInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The HWPortInstances that are connected via this delegation."
		   });					
		addAnnotation
		  (getHWPortPart_Protocol(), 
		   source, 
		   new String[] {
			 "documentation", "The used protocol of this HWPortInstance."
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
			 "constraints", "CheckResourceType AllAtomicResourceTypesAreInitialized AllHWPortsAreInitialized"
		   });							
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "constraints", "BusProtocol"
		   });					
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "constraints", "Only2Connections LinkProtocol"
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
		  (hwPortInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameProtocol"
		   });																											
		addAnnotation
		  (delegationEClass, 
		   source, 
		   new String[] {
			 "constraints", "HWPortInstanceToDelegationPort"
		   });				
		addAnnotation
		  (hwPortPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameProtocol BusPort2Bus LinkPort2Link"
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
			 "CheckResourceType", "self.resourceType.oclIsKindOf(resourcetype::MemoryResource)"
		   });					
		addAnnotation
		  (getMemoryResourceInstance_MemoryType(), 
		   source, 
		   new String[] {
			 "derivation", "self.resourceType.oclAsType(resourcetype::MemoryResource).memoryType"
		   });					
		addAnnotation
		  (storageMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckMemoryNonVolatile", "self.resourceType.oclAsType(resourcetype::MemoryResource).isVolatile=false"
		   });				
		addAnnotation
		  (processingMemoryInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckMemoryVolatile", "self.resourceType.oclAsType(resourcetype::MemoryResource).isVolatile=true\n"
		   });					
		addAnnotation
		  (programmableLogicDeviceInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckResourceType", "self.resourceType.oclIsKindOf(resourcetype::ProgrammableLogicDevice)"
		   });				
		addAnnotation
		  (processorInstanceEClass, 
		   source, 
		   new String[] {
			 "CheckResourceType", "self.resourceType.oclIsKindOf(resourcetype::Processor)"
		   });									
		addAnnotation
		  (structuredResourceInstanceEClass, 
		   source, 
		   new String[] {
			 "AllAtomicResourceTypesAreInitialized", "self.resourceType.oclAsType(resourcetype::StructuredResource).embeddedAtomicResources->forAll(atomicResourceType | self.embeddedAtomicResourceInstances->exists(atomicResourceInstance | atomicResourceInstance.oclAsType(platform::AtomicResourceInstance).resourceType = atomicResourceType))\n",
			 "CheckResourceType", "self.resourceType.oclIsKindOf(resourcetype::StructuredResource)",
			 "AllHWPortsAreInitialized", "self.resourceType.oclAsType(resourcetype::StructuredResource).hwports->forAll(hwport | self.hwportInstances->exists(hwportInstance | hwportInstance.oclAsType(platform::HWPortInstance).hwportType = hwport))\n"
		   });							
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "BusProtocol", "self.protocol.oclIsTypeOf(resourcetype::BusProtocol)"
		   });		
		addAnnotation
		  (getBus_ConnectedBusPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectedHWPortParts->select(p|p.oclAsType(platform::HWPortPart).hwPortInstanceType.oclIsTypeOf(platform::BusPortInstance))->asOrderedSet()\n"
		   });				
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "Only2Connections", "self.connectedHWPortParts->size()+self.connectedBridges->size()<=2",
			 "LinkProtocol", "self.protocol.oclIsTypeOf(resourcetype::LinkProtocol)"
		   });			
		addAnnotation
		  (getLink_ConnectedLinkPortInstances(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectedHWPortParts->select(p|p.oclAsType(platform::HWPortPart).hwPortInstanceType.oclIsTypeOf(platform::LinkPortInstance))->asOrderedSet()"
		   });																
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
		  (getHWPlatformPart_DerivedBridges(), 
		   source, 
		   new String[] {
			 "derivation", "if hwplatformType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tself.hwplatformType.embeddedCommunicationResources->select(c| c.oclIsTypeOf(platform::Bridge)).oclAsType(platform::Bridge)->asOrderedSet()\nendif"
		   });									
		addAnnotation
		  (hwPortInstanceEClass, 
		   source, 
		   new String[] {
			 "SameProtocol", "if (self.connectedMedia->size()>0) then\n\tself.connectedMedia->forAll(m|m.oclAsType(platform::CommunicationMedia).protocol=self.protocol)\nelse true\nendif"
		   });						
		addAnnotation
		  (getHWPortInstance_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "if not self.hwportType.oclIsUndefined()\n\tthen\n\t\tself.hwportType.protocol\nelse null\nendif"
		   });					
		addAnnotation
		  (getHWPortInstance_IsDelegationPort(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.parentResourceInstance.oclIsUndefined()) \nthen true\n\telse false\nendif"
		   });					
		addAnnotation
		  (getBusPortInstance_ConnectedBus(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectedMedia->select(m|m.oclIsTypeOf(platform::Bus)).oclAsType(platform::Bus)->asOrderedSet()"
		   });				
		addAnnotation
		  (getLinkPortInstance_ConnectedLink(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectedMedia->select(m|m.oclIsTypeOf(platform::Link)).oclAsType(platform::Link)->asOrderedSet()"
		   });											
		addAnnotation
		  (delegationEClass, 
		   source, 
		   new String[] {
			 "HWPortInstanceToDelegationPort", "self.hwPortInstance.isDelegationPort"
		   });				
		addAnnotation
		  (hwPortPartEClass, 
		   source, 
		   new String[] {
			 "SameProtocol", "if (self.connectedMedia->size()>0) then\n\tself.connectedMedia.protocol=self.protocol\nelse true\nendif",
			 "BusPort2Bus", "if (self.hwPortInstanceType.oclIsTypeOf(platform::BusPortInstance) and not self.connectedMedia.oclIsUndefined()) then\n\tself.connectedMedia.oclIsTypeOf(platform::Bus)\nelse true\nendif",
			 "LinkPort2Link", "if (self.hwPortInstanceType.oclIsTypeOf(platform::LinkPortInstance) and not self.connectedMedia.oclIsUndefined()) then\n\tself.connectedMedia.oclIsTypeOf(platform::Link)\nelse true\nendif"
		   });		
		addAnnotation
		  (getHWPortPart_Protocol(), 
		   source, 
		   new String[] {
			 "derivation", "self.hwPortInstanceType.protocol"
		   });	
	}

} //PlatformPackageImpl
