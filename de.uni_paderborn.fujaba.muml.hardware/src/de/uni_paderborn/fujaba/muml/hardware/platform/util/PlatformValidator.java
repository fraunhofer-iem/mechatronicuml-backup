/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.util;

import de.uni_paderborn.fujaba.muml.hardware.platform.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage
 * @generated
 */
public class PlatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PlatformValidator INSTANCE = new PlatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.hardware.platform";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PlatformPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PlatformPackage.HW_PLATFORM_CONFIGURATION:
				return validateHWPlatformConfiguration((HWPlatformConfiguration)value, diagnostics, context);
			case PlatformPackage.RESOURCE_INSTANCE:
				return validateResourceInstance((ResourceInstance)value, diagnostics, context);
			case PlatformPackage.COMPUTING_RESOURCE_INSTANCE:
				return validateComputingResourceInstance((ComputingResourceInstance)value, diagnostics, context);
			case PlatformPackage.MEMORY_RESOURCE_INSTANCE:
				return validateMemoryResourceInstance((MemoryResourceInstance)value, diagnostics, context);
			case PlatformPackage.DEVICE_INSTANCE:
				return validateDeviceInstance((DeviceInstance)value, diagnostics, context);
			case PlatformPackage.STORAGE_MEMORY_INSTANCE:
				return validateStorageMemoryInstance((StorageMemoryInstance)value, diagnostics, context);
			case PlatformPackage.PROCESSING_MEMORY_INSTANCE:
				return validateProcessingMemoryInstance((ProcessingMemoryInstance)value, diagnostics, context);
			case PlatformPackage.CACHE_INSTANCE:
				return validateCacheInstance((CacheInstance)value, diagnostics, context);
			case PlatformPackage.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE:
				return validateProgrammableLogicDeviceInstance((ProgrammableLogicDeviceInstance)value, diagnostics, context);
			case PlatformPackage.PROCESSOR_INSTANCE:
				return validateProcessorInstance((ProcessorInstance)value, diagnostics, context);
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE:
				return validateAtomicResourceInstance((AtomicResourceInstance)value, diagnostics, context);
			case PlatformPackage.STRUCTURED_RESOURCE_INSTANCE:
				return validateStructuredResourceInstance((StructuredResourceInstance)value, diagnostics, context);
			case PlatformPackage.COMMUNICATION_RESOURCE:
				return validateCommunicationResource((CommunicationResource)value, diagnostics, context);
			case PlatformPackage.BUS:
				return validateBus((Bus)value, diagnostics, context);
			case PlatformPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case PlatformPackage.COMMUNICATION_MEDIA:
				return validateCommunicationMedia((CommunicationMedia)value, diagnostics, context);
			case PlatformPackage.HW_PLATFORM:
				return validateHWPlatform((HWPlatform)value, diagnostics, context);
			case PlatformPackage.PLATFORM_PART:
				return validatePlatformPart((PlatformPart)value, diagnostics, context);
			case PlatformPackage.HW_PLATFORM_PART:
				return validateHWPlatformPart((HWPlatformPart)value, diagnostics, context);
			case PlatformPackage.SENSOR_INSTANCE:
				return validateSensorInstance((SensorInstance)value, diagnostics, context);
			case PlatformPackage.ACTUATOR_INSTANCE:
				return validateActuatorInstance((ActuatorInstance)value, diagnostics, context);
			case PlatformPackage.BRIDGE:
				return validateBridge((Bridge)value, diagnostics, context);
			case PlatformPackage.HW_PORT_INSTANCE:
				return validateHWPortInstance((HWPortInstance)value, diagnostics, context);
			case PlatformPackage.BUS_PORT_INSTANCE:
				return validateBusPortInstance((BusPortInstance)value, diagnostics, context);
			case PlatformPackage.LINK_PORT_INSTANCE:
				return validateLinkPortInstance((LinkPortInstance)value, diagnostics, context);
			case PlatformPackage.RESOURCE_INSTANCE_REPOSITORY:
				return validateResourceInstanceRepository((ResourceInstanceRepository)value, diagnostics, context);
			case PlatformPackage.RESOURCE_INSTANCE_PART:
				return validateResourceInstancePart((ResourceInstancePart)value, diagnostics, context);
			case PlatformPackage.DELEGATION:
				return validateDelegation((Delegation)value, diagnostics, context);
			case PlatformPackage.HW_PORT_PART:
				return validateHWPortPart((HWPortPart)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformConfiguration(HWPlatformConfiguration hwPlatformConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPlatformConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInstance(ResourceInstance resourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingResourceInstance(ComputingResourceInstance computingResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computingResourceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResourceInstance(MemoryResourceInstance memoryResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryResourceInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResourceInstance_CheckResourceType(memoryResourceInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckResourceType constraint of '<em>Memory Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMORY_RESOURCE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "self.resourceType.oclIsKindOf(resourcetype::MemoryResource)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Memory Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResourceInstance_CheckResourceType(MemoryResourceInstance memoryResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.MEMORY_RESOURCE_INSTANCE,
				 memoryResourceInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CheckResourceType",
				 MEMORY_RESOURCE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceInstance(DeviceInstance deviceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageMemoryInstance(StorageMemoryInstance storageMemoryInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storageMemoryInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResourceInstance_CheckResourceType(storageMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorageMemoryInstance_CheckMemoryNonVolatile(storageMemoryInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckMemoryNonVolatile constraint of '<em>Storage Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORAGE_MEMORY_INSTANCE__CHECK_MEMORY_NON_VOLATILE__EEXPRESSION = "self.resourceType.oclAsType(resourcetype::MemoryResource).isVolatile=false";

	/**
	 * Validates the CheckMemoryNonVolatile constraint of '<em>Storage Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageMemoryInstance_CheckMemoryNonVolatile(StorageMemoryInstance storageMemoryInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.STORAGE_MEMORY_INSTANCE,
				 storageMemoryInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CheckMemoryNonVolatile",
				 STORAGE_MEMORY_INSTANCE__CHECK_MEMORY_NON_VOLATILE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingMemoryInstance(ProcessingMemoryInstance processingMemoryInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processingMemoryInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResourceInstance_CheckResourceType(processingMemoryInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessingMemoryInstance_CheckMemoryVolatile(processingMemoryInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckMemoryVolatile constraint of '<em>Processing Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSING_MEMORY_INSTANCE__CHECK_MEMORY_VOLATILE__EEXPRESSION = "self.resourceType.oclAsType(resourcetype::MemoryResource).isVolatile=true\n" +
		"";

	/**
	 * Validates the CheckMemoryVolatile constraint of '<em>Processing Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingMemoryInstance_CheckMemoryVolatile(ProcessingMemoryInstance processingMemoryInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.PROCESSING_MEMORY_INSTANCE,
				 processingMemoryInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CheckMemoryVolatile",
				 PROCESSING_MEMORY_INSTANCE__CHECK_MEMORY_VOLATILE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheInstance(CacheInstance cacheInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cacheInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cacheInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResourceInstance_CheckResourceType(cacheInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammableLogicDeviceInstance(ProgrammableLogicDeviceInstance programmableLogicDeviceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programmableLogicDeviceInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programmableLogicDeviceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgrammableLogicDeviceInstance_CheckResourceType(programmableLogicDeviceInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckResourceType constraint of '<em>Programmable Logic Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "self.resourceType.oclIsKindOf(resourcetype::ProgrammableLogicDevice)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Programmable Logic Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammableLogicDeviceInstance_CheckResourceType(ProgrammableLogicDeviceInstance programmableLogicDeviceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE,
				 programmableLogicDeviceInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CheckResourceType",
				 PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorInstance(ProcessorInstance processorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processorInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processorInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessorInstance_CheckResourceType(processorInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckResourceType constraint of '<em>Processor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "self.resourceType.oclIsKindOf(resourcetype::Processor)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Processor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorInstance_CheckResourceType(ProcessorInstance processorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.PROCESSOR_INSTANCE,
				 processorInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CheckResourceType",
				 PROCESSOR_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicResourceInstance(AtomicResourceInstance atomicResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atomicResourceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredResourceInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredResourceInstance_CheckResourceType(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredResourceInstance_AllAtomicResourceTypesAreInitialized(structuredResourceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredResourceInstance_AllHWPortsAreInitialized(structuredResourceInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckResourceType constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_RESOURCE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "self.resourceType.oclIsKindOf(resourcetype::StructuredResource)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance_CheckResourceType(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
				 structuredResourceInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CheckResourceType",
				 STRUCTURED_RESOURCE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllAtomicResourceTypesAreInitialized constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_RESOURCE_INSTANCE__ALL_ATOMIC_RESOURCE_TYPES_ARE_INITIALIZED__EEXPRESSION = "self.resourceType.oclAsType(resourcetype::StructuredResource).embeddedAtomicResources->forAll(atomicResourceType | self.embeddedAtomicResourceInstances->exists(atomicResourceInstance | atomicResourceInstance.oclAsType(platform::AtomicResourceInstance).resourceType = atomicResourceType))\n" +
		"";

	/**
	 * Validates the AllAtomicResourceTypesAreInitialized constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance_AllAtomicResourceTypesAreInitialized(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
				 structuredResourceInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AllAtomicResourceTypesAreInitialized",
				 STRUCTURED_RESOURCE_INSTANCE__ALL_ATOMIC_RESOURCE_TYPES_ARE_INITIALIZED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllHWPortsAreInitialized constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_RESOURCE_INSTANCE__ALL_HW_PORTS_ARE_INITIALIZED__EEXPRESSION = "self.resourceType.oclAsType(resourcetype::StructuredResource).hwports->forAll(hwport | self.hwportInstances->exists(hwportInstance | hwportInstance.oclAsType(platform::HWPortInstance).hwportType = hwport))\n" +
		"";

	/**
	 * Validates the AllHWPortsAreInitialized constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance_AllHWPortsAreInitialized(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
				 structuredResourceInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "AllHWPortsAreInitialized",
				 STRUCTURED_RESOURCE_INSTANCE__ALL_HW_PORTS_ARE_INITIALIZED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationResource(CommunicationResource communicationResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateBus_BusProtocol(bus, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the BusProtocol constraint of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUS__BUS_PROTOCOL__EEXPRESSION = "self.protocol.oclIsTypeOf(resourcetype::BusProtocol)";

	/**
	 * Validates the BusProtocol constraint of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus_BusProtocol(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.BUS,
				 bus,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "BusProtocol",
				 BUS__BUS_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(link, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_Only2Connections(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkProtocol(link, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Only2Connections constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK__ONLY2_CONNECTIONS__EEXPRESSION = "self.connectedHWPortParts->size()+self.connectedBridges->size()<=2";

	/**
	 * Validates the Only2Connections constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_Only2Connections(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.LINK,
				 link,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "Only2Connections",
				 LINK__ONLY2_CONNECTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LinkProtocol constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK__LINK_PROTOCOL__EEXPRESSION = "self.protocol.oclIsTypeOf(resourcetype::LinkProtocol)";

	/**
	 * Validates the LinkProtocol constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkProtocol(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.LINK,
				 link,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LinkProtocol",
				 LINK__LINK_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMedia(CommunicationMedia communicationMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationMedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatform(HWPlatform hwPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPlatform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformPart(PlatformPart platformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(platformPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityLowerBoundSet(platformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityUpperBoundSet(platformPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CardinalityLowerBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLATFORM_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION = "self.cardinality.lowerBound->notEmpty()";

	/**
	 * Validates the CardinalityLowerBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformPart_CardinalityLowerBoundSet(PlatformPart platformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.PLATFORM_PART,
				 platformPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CardinalityLowerBoundSet",
				 PLATFORM_PART__CARDINALITY_LOWER_BOUND_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CardinalityUpperBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLATFORM_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION = "self.cardinality.upperBound->notEmpty()";

	/**
	 * Validates the CardinalityUpperBoundSet constraint of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformPart_CardinalityUpperBoundSet(PlatformPart platformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.PLATFORM_PART,
				 platformPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "CardinalityUpperBoundSet",
				 PLATFORM_PART__CARDINALITY_UPPER_BOUND_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformPart(HWPlatformPart hwPlatformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPlatformPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityLowerBoundSet(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityUpperBoundSet(hwPlatformPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPlatformPart_NoLoop(hwPlatformPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoLoop constraint of '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PLATFORM_PART__NO_LOOP__EEXPRESSION = "self.hwplatformType<>self.parentHWPlatform";

	/**
	 * Validates the NoLoop constraint of '<em>HW Platform Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPlatformPart_NoLoop(HWPlatformPart hwPlatformPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.HW_PLATFORM_PART,
				 hwPlatformPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoLoop",
				 HW_PLATFORM_PART__NO_LOOP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorInstance(SensorInstance sensorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorInstance(ActuatorInstance actuatorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuatorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridge(Bridge bridge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bridge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortInstance(HWPortInstance hwPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortInstance_SameProtocol(hwPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameProtocol constraint of '<em>HW Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT_INSTANCE__SAME_PROTOCOL__EEXPRESSION = "if (self.connectedMedia->size()>0) then\n" +
		"\tself.connectedMedia->forAll(m|m.oclAsType(platform::CommunicationMedia).protocol=self.protocol)\n" +
		"else true\n" +
		"endif";

	/**
	 * Validates the SameProtocol constraint of '<em>HW Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortInstance_SameProtocol(HWPortInstance hwPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.HW_PORT_INSTANCE,
				 hwPortInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameProtocol",
				 HW_PORT_INSTANCE__SAME_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusPortInstance(BusPortInstance busPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(busPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(busPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortInstance_SameProtocol(busPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkPortInstance(LinkPortInstance linkPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortInstance_SameProtocol(linkPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInstanceRepository(ResourceInstanceRepository resourceInstanceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInstanceRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInstancePart(ResourceInstancePart resourceInstancePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceInstancePart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityLowerBoundSet(resourceInstancePart, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformPart_CardinalityUpperBoundSet(resourceInstancePart, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelegation_HWPortInstanceToDelegationPort(delegation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HWPortInstanceToDelegationPort constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION__HW_PORT_INSTANCE_TO_DELEGATION_PORT__EEXPRESSION = "self.hwPortInstance.isDelegationPort";

	/**
	 * Validates the HWPortInstanceToDelegationPort constraint of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation_HWPortInstanceToDelegationPort(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.DELEGATION,
				 delegation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "HWPortInstanceToDelegationPort",
				 DELEGATION__HW_PORT_INSTANCE_TO_DELEGATION_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPortPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortPart_SameProtocol(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortPart_BusPort2Bus(hwPortPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPortPart_LinkPort2Link(hwPortPart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SameProtocol constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT_PART__SAME_PROTOCOL__EEXPRESSION = "if (self.connectedMedia->size()>0) then\n" +
		"\tself.connectedMedia.protocol=self.protocol\n" +
		"else true\n" +
		"endif";

	/**
	 * Validates the SameProtocol constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart_SameProtocol(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.HW_PORT_PART,
				 hwPortPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SameProtocol",
				 HW_PORT_PART__SAME_PROTOCOL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BusPort2Bus constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT_PART__BUS_PORT2_BUS__EEXPRESSION = "if (self.hwPortInstance.oclIsTypeOf(platform::BusPortInstance) and not self.connectedMedia.oclIsUndefined()) then\n" +
		"\tself.connectedMedia.oclIsTypeOf(platform::Bus)\n" +
		"else true\n" +
		"endif";

	/**
	 * Validates the BusPort2Bus constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart_BusPort2Bus(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.HW_PORT_PART,
				 hwPortPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "BusPort2Bus",
				 HW_PORT_PART__BUS_PORT2_BUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LinkPort2Link constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT_PART__LINK_PORT2_LINK__EEXPRESSION = "if (self.hwPortInstance.oclIsTypeOf(platform::LinkPortInstance) and not self.connectedMedia.oclIsUndefined()) then\n" +
		"\tself.connectedMedia.oclIsTypeOf(platform::Link)\n" +
		"else true\n" +
		"endif";

	/**
	 * Validates the LinkPort2Link constraint of '<em>HW Port Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPortPart_LinkPort2Link(HWPortPart hwPortPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PlatformPackage.Literals.HW_PORT_PART,
				 hwPortPart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LinkPort2Link",
				 HW_PORT_PART__LINK_PORT2_LINK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PlatformValidator
