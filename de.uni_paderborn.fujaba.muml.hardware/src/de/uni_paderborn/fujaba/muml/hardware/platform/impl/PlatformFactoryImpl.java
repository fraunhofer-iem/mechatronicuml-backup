/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.hardware.platform.ActuatorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.CacheInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformConfiguration;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.Link;
import de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessingMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProcessorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;
import de.uni_paderborn.fujaba.muml.hardware.platform.SensorInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory(PlatformPackage.eNS_URI);
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
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
			case PlatformPackage.HW_PLATFORM_CONFIGURATION: return createHWPlatformConfiguration();
			case PlatformPackage.STORAGE_MEMORY_INSTANCE: return createStorageMemoryInstance();
			case PlatformPackage.PROCESSING_MEMORY_INSTANCE: return createProcessingMemoryInstance();
			case PlatformPackage.CACHE_INSTANCE: return createCacheInstance();
			case PlatformPackage.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE: return createProgrammableLogicDeviceInstance();
			case PlatformPackage.PROCESSOR_INSTANCE: return createProcessorInstance();
			case PlatformPackage.STRUCTURED_RESOURCE_INSTANCE: return createStructuredResourceInstance();
			case PlatformPackage.BUS: return createBus();
			case PlatformPackage.LINK: return createLink();
			case PlatformPackage.HW_PLATFORM: return createHWPlatform();
			case PlatformPackage.HW_PLATFORM_PART: return createHWPlatformPart();
			case PlatformPackage.SENSOR_INSTANCE: return createSensorInstance();
			case PlatformPackage.ACTUATOR_INSTANCE: return createActuatorInstance();
			case PlatformPackage.BRIDGE: return createBridge();
			case PlatformPackage.BUS_PORT_INSTANCE: return createBusPortInstance();
			case PlatformPackage.LINK_PORT_INSTANCE: return createLinkPortInstance();
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY: return createResourceInstanceRepository();
			case PlatformPackage.RESOURCE_INSTANCE_PART: return createResourceInstancePart();
			case PlatformPackage.DELEGATION: return createDelegation();
			case PlatformPackage.HW_PORT_PART: return createHWPortPart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformConfiguration createHWPlatformConfiguration() {
		HWPlatformConfigurationImpl hwPlatformConfiguration = new HWPlatformConfigurationImpl();
		return hwPlatformConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageMemoryInstance createStorageMemoryInstance() {
		StorageMemoryInstanceImpl storageMemoryInstance = new StorageMemoryInstanceImpl();
		return storageMemoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingMemoryInstance createProcessingMemoryInstance() {
		ProcessingMemoryInstanceImpl processingMemoryInstance = new ProcessingMemoryInstanceImpl();
		return processingMemoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheInstance createCacheInstance() {
		CacheInstanceImpl cacheInstance = new CacheInstanceImpl();
		return cacheInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammableLogicDeviceInstance createProgrammableLogicDeviceInstance() {
		ProgrammableLogicDeviceInstanceImpl programmableLogicDeviceInstance = new ProgrammableLogicDeviceInstanceImpl();
		return programmableLogicDeviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorInstance createProcessorInstance() {
		ProcessorInstanceImpl processorInstance = new ProcessorInstanceImpl();
		return processorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance createStructuredResourceInstance() {
		StructuredResourceInstanceImpl structuredResourceInstance = new StructuredResourceInstanceImpl();
		return structuredResourceInstance;
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
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
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
	public SensorInstance createSensorInstance() {
		SensorInstanceImpl sensorInstance = new SensorInstanceImpl();
		return sensorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorInstance createActuatorInstance() {
		ActuatorInstanceImpl actuatorInstance = new ActuatorInstanceImpl();
		return actuatorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bridge createBridge() {
		BridgeImpl bridge = new BridgeImpl();
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusPortInstance createBusPortInstance() {
		BusPortInstanceImpl busPortInstance = new BusPortInstanceImpl();
		return busPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPortInstance createLinkPortInstance() {
		LinkPortInstanceImpl linkPortInstance = new LinkPortInstanceImpl();
		return linkPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstanceRepository createResourceInstanceRepository() {
		ResourceInstanceRepositoryImpl resourceInstanceRepository = new ResourceInstanceRepositoryImpl();
		return resourceInstanceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstancePart createResourceInstancePart() {
		ResourceInstancePartImpl resourceInstancePart = new ResourceInstancePartImpl();
		return resourceInstancePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation createDelegation() {
		DelegationImpl delegation = new DelegationImpl();
		return delegation;
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
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
