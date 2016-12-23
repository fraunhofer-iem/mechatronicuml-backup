/**
 */
package org.muml.pm.hardware.hwresourceinstance.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pm.hardware.hwresourceinstance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage
 * @generated
 */
public class HwresourceinstanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HwresourceinstanceValidator INSTANCE = new HwresourceinstanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pm.hardware.hwresourceinstance";

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
	public HwresourceinstanceValidator() {
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
	  return HwresourceinstancePackage.eINSTANCE;
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
			case HwresourceinstancePackage.RESOURCE_INSTANCE:
				return validateResourceInstance((ResourceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.COMPUTING_RESOURCE_INSTANCE:
				return validateComputingResourceInstance((ComputingResourceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE:
				return validateMemoryResourceInstance((MemoryResourceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.DEVICE_INSTANCE:
				return validateDeviceInstance((DeviceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.STORAGE_MEMORY_INSTANCE:
				return validateStorageMemoryInstance((StorageMemoryInstance)value, diagnostics, context);
			case HwresourceinstancePackage.PROCESSING_MEMORY_INSTANCE:
				return validateProcessingMemoryInstance((ProcessingMemoryInstance)value, diagnostics, context);
			case HwresourceinstancePackage.CACHE_INSTANCE:
				return validateCacheInstance((CacheInstance)value, diagnostics, context);
			case HwresourceinstancePackage.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE:
				return validateProgrammableLogicDeviceInstance((ProgrammableLogicDeviceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.PROCESSOR_INSTANCE:
				return validateProcessorInstance((ProcessorInstance)value, diagnostics, context);
			case HwresourceinstancePackage.ATOMIC_RESOURCE_INSTANCE:
				return validateAtomicResourceInstance((AtomicResourceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.STRUCTURED_RESOURCE_INSTANCE:
				return validateStructuredResourceInstance((StructuredResourceInstance)value, diagnostics, context);
			case HwresourceinstancePackage.SENSOR_INSTANCE:
				return validateSensorInstance((SensorInstance)value, diagnostics, context);
			case HwresourceinstancePackage.ACTUATOR_INSTANCE:
				return validateActuatorInstance((ActuatorInstance)value, diagnostics, context);
			case HwresourceinstancePackage.RESOURCE_INSTANCE_REPOSITORY:
				return validateResourceInstanceRepository((ResourceInstanceRepository)value, diagnostics, context);
			case HwresourceinstancePackage.HW_PORT:
				return validateHWPort((HWPort)value, diagnostics, context);
			default:
				return true;
		}
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
	protected static final String MEMORY_RESOURCE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "-- The ResourceType must be of Kind MemoryResource\n" +
		"self.resourceType.oclIsKindOf(hwresource::MemoryResource)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Memory Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResourceInstance_CheckResourceType(MemoryResourceInstance memoryResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE,
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
	protected static final String STORAGE_MEMORY_INSTANCE__CHECK_MEMORY_NON_VOLATILE__EEXPRESSION = "-- The ResourceType must be of Kind non-volatile MemoryResource\n" +
		"-- The ResourceType must be of Kind volatile MemoryResource\n" +
		"if self.resourceType.oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"self.resourceType.oclAsType(hwresource::MemoryResource).isVolatile=false\r\n" +
		"endif\n" +
		"\n" +
		"";

	/**
	 * Validates the CheckMemoryNonVolatile constraint of '<em>Storage Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageMemoryInstance_CheckMemoryNonVolatile(StorageMemoryInstance storageMemoryInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.STORAGE_MEMORY_INSTANCE,
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
	protected static final String PROCESSING_MEMORY_INSTANCE__CHECK_MEMORY_VOLATILE__EEXPRESSION = "-- The ResourceType must be of Kind volatile MemoryResource\n" +
		"if self.resourceType.oclIsUndefined() then\r\n" +
		"false\r\n" +
		"else\r\n" +
		"self.resourceType.oclAsType(hwresource::MemoryResource).isVolatile=true\r\n" +
		"endif\n" +
		"\n" +
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
				(HwresourceinstancePackage.Literals.PROCESSING_MEMORY_INSTANCE,
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
	protected static final String PROGRAMMABLE_LOGIC_DEVICE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "-- ResourceType must be of Kind PLD\n" +
		"self.resourceType.oclIsKindOf(hwresource::ProgrammableLogicDevice)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Programmable Logic Device Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammableLogicDeviceInstance_CheckResourceType(ProgrammableLogicDeviceInstance programmableLogicDeviceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.PROGRAMMABLE_LOGIC_DEVICE_INSTANCE,
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
	protected static final String PROCESSOR_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "-- ResourceType must be of Kind Processor\n" +
		"self.resourceType.oclIsKindOf(hwresource::Processor)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Processor Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorInstance_CheckResourceType(ProcessorInstance processorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.PROCESSOR_INSTANCE,
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
		if (result || diagnostics != null) result &= validateStructuredResourceInstance_UniquePortNames(structuredResourceInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CheckResourceType constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_RESOURCE_INSTANCE__CHECK_RESOURCE_TYPE__EEXPRESSION = "-- ResourceType must be of Kind StructuredResource\n" +
		"self.resourceType.oclIsKindOf(hwresource::StructuredResource)";

	/**
	 * Validates the CheckResourceType constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance_CheckResourceType(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
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
	protected static final String STRUCTURED_RESOURCE_INSTANCE__ALL_ATOMIC_RESOURCE_TYPES_ARE_INITIALIZED__EEXPRESSION = "-- All Atomic Resources must be initialized\n" +
		"if(self.resourceType.oclIsUndefined()) then\n" +
		"\ttrue\n" +
		"else \n" +
		"\tself.resourceType.oclAsType(hwresource::StructuredResource).embeddedAtomicResources->forAll(atomicResourceType | self.embeddedAtomicResourceInstances->exists(atomicResourceInstance | atomicResourceInstance.oclAsType(hwresourceinstance::AtomicResourceInstance).resourceType = atomicResourceType))\n" +
		"endif";

	/**
	 * Validates the AllAtomicResourceTypesAreInitialized constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance_AllAtomicResourceTypesAreInitialized(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
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
	 * The cached validation expression for the UniquePortNames constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_RESOURCE_INSTANCE__UNIQUE_PORT_NAMES__EEXPRESSION = "-- The Ports must have an unique name\n" +
		"self.hwports->isUnique(name)";

	/**
	 * Validates the UniquePortNames constraint of '<em>Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResourceInstance_UniquePortNames(StructuredResourceInstance structuredResourceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourceinstancePackage.Literals.STRUCTURED_RESOURCE_INSTANCE,
				 structuredResourceInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniquePortNames",
				 STRUCTURED_RESOURCE_INSTANCE__UNIQUE_PORT_NAMES__EEXPRESSION,
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
	public boolean validateResourceInstanceRepository(ResourceInstanceRepository resourceInstanceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInstanceRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPort(HWPort hwPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPort, diagnostics, context);
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

} //HwresourceinstanceValidator
