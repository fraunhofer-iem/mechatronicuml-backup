/**
 */
package org.muml.pm.hardware.hwresourceinstance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pm.hardware.hwresourceinstance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwresourceinstanceFactoryImpl extends EFactoryImpl implements HwresourceinstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwresourceinstanceFactory init() {
		try {
			HwresourceinstanceFactory theHwresourceinstanceFactory = (HwresourceinstanceFactory)EPackage.Registry.INSTANCE.getEFactory(HwresourceinstancePackage.eNS_URI);
			if (theHwresourceinstanceFactory != null) {
				return theHwresourceinstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwresourceinstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceinstanceFactoryImpl() {
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
			case HwresourceinstancePackage.STORAGE_MEMORY_INSTANCE: return createStorageMemoryInstance();
			case HwresourceinstancePackage.PROCESSING_MEMORY_INSTANCE: return createProcessingMemoryInstance();
			case HwresourceinstancePackage.CACHE_INSTANCE: return createCacheInstance();
			case HwresourceinstancePackage.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE: return createProgrammableLogicDeviceInstance();
			case HwresourceinstancePackage.PROCESSOR_INSTANCE: return createProcessorInstance();
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE: return createStructuredResourceInstance();
			case HwresourceinstancePackage.SENSOR_INSTANCE: return createSensorInstance();
			case HwresourceinstancePackage.ACTUATOR_INSTANCE: return createActuatorInstance();
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY: return createResourceInstanceRepository();
			case HwresourceinstancePackage.HW_PORT: return createHWPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public ResourceInstanceRepository createResourceInstanceRepository() {
		ResourceInstanceRepositoryImpl resourceInstanceRepository = new ResourceInstanceRepositoryImpl();
		return resourceInstanceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPort createHWPort() {
		HWPortImpl hwPort = new HWPortImpl();
		return hwPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceinstancePackage getHwresourceinstancePackage() {
		return (HwresourceinstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HwresourceinstancePackage getPackage() {
		return HwresourceinstancePackage.eINSTANCE;
	}

} //HwresourceinstanceFactoryImpl
