/**
 */
package org.muml.pm.hardware.hwresource.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pm.hardware.hwresource.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage
 * @generated
 */
public class HwresourceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HwresourceValidator INSTANCE = new HwresourceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pm.hardware.hwresource";

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
	public HwresourceValidator() {
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
	  return HwresourcePackage.eINSTANCE;
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
			case HwresourcePackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case HwresourcePackage.COMPUTING_RESOURCE:
				return validateComputingResource((ComputingResource)value, diagnostics, context);
			case HwresourcePackage.MEMORY_RESOURCE:
				return validateMemoryResource((MemoryResource)value, diagnostics, context);
			case HwresourcePackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case HwresourcePackage.CACHE:
				return validateCache((Cache)value, diagnostics, context);
			case HwresourcePackage.PROGRAMMABLE_LOGIC_DEVICE:
				return validateProgrammableLogicDevice((ProgrammableLogicDevice)value, diagnostics, context);
			case HwresourcePackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case HwresourcePackage.ATOMIC_RESOURCE:
				return validateAtomicResource((AtomicResource)value, diagnostics, context);
			case HwresourcePackage.STRUCTURED_RESOURCE:
				return validateStructuredResource((StructuredResource)value, diagnostics, context);
			case HwresourcePackage.RESOURCE_REPOSITORY:
				return validateResourceRepository((ResourceRepository)value, diagnostics, context);
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY:
				return validateCommunicationProtocolRepository((CommunicationProtocolRepository)value, diagnostics, context);
			case HwresourcePackage.COMMUNICATION_PROTOCOL:
				return validateCommunicationProtocol((CommunicationProtocol)value, diagnostics, context);
			case HwresourcePackage.BUS_PROTOCOL:
				return validateBusProtocol((BusProtocol)value, diagnostics, context);
			case HwresourcePackage.LINK_PROTOCOL:
				return validateLinkProtocol((LinkProtocol)value, diagnostics, context);
			case HwresourcePackage.COMMUNICATION_RESOURCE:
				return validateCommunicationResource((CommunicationResource)value, diagnostics, context);
			case HwresourcePackage.DEVICE_KIND:
				return validateDeviceKind((DeviceKind)value, diagnostics, context);
			case HwresourcePackage.PROCESSOR_ARCHITECTURE:
				return validateProcessorArchitecture((ProcessorArchitecture)value, diagnostics, context);
			case HwresourcePackage.MEMORY_ACCESS_KIND:
				return validateMemoryAccessKind((MemoryAccessKind)value, diagnostics, context);
			case HwresourcePackage.MEMORY_KIND:
				return validateMemoryKind((MemoryKind)value, diagnostics, context);
			case HwresourcePackage.REPLACEMENT_POLICY:
				return validateReplacementPolicy((ReplacementPolicy)value, diagnostics, context);
			case HwresourcePackage.WRITE_POLICY:
				return validateWritePolicy((WritePolicy)value, diagnostics, context);
			case HwresourcePackage.COMMUNICATION_KIND:
				return validateCommunicationKind((CommunicationKind)value, diagnostics, context);
			case HwresourcePackage.BUS_PROTOCOL_KIND:
				return validateBusProtocolKind((BusProtocolKind)value, diagnostics, context);
			case HwresourcePackage.LINK_PROTOCOL_KIND:
				return validateLinkProtocolKind((LinkProtocolKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingResource(ComputingResource computingResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computingResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResource(MemoryResource memoryResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResource_RAMimpliesRW(memoryResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResource_ROMimpliesReadOnly(memoryResource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RAMimpliesRW constraint of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMORY_RESOURCE__RA_MIMPLIES_RW__EEXPRESSION = "-- A RAM implies R/W Access\n" +
		"self.memoryType = MemoryKind::RAM implies self.memoryAccess=MemoryAccessKind::READ_WRITE";

	/**
	 * Validates the RAMimpliesRW constraint of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResource_RAMimpliesRW(MemoryResource memoryResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourcePackage.Literals.MEMORY_RESOURCE,
				 memoryResource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "RAMimpliesRW",
				 MEMORY_RESOURCE__RA_MIMPLIES_RW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ROMimpliesReadOnly constraint of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMORY_RESOURCE__RO_MIMPLIES_READ_ONLY__EEXPRESSION = "-- A ROM implies Read-Only Access\n" +
		"self.memoryType = MemoryKind::ROM implies self.memoryAccess = MemoryAccessKind::READ_ONLY";

	/**
	 * Validates the ROMimpliesReadOnly constraint of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResource_ROMimpliesReadOnly(MemoryResource memoryResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourcePackage.Literals.MEMORY_RESOURCE,
				 memoryResource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ROMimpliesReadOnly",
				 MEMORY_RESOURCE__RO_MIMPLIES_READ_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCache(Cache cache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cache, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResource_RAMimpliesRW(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryResource_ROMimpliesReadOnly(cache, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammableLogicDevice(ProgrammableLogicDevice programmableLogicDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmableLogicDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessor_ownedCacheInSameStructuredResource(processor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ownedCacheInSameStructuredResource constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR__OWNED_CACHE_IN_SAME_STRUCTURED_RESOURCE__EEXPRESSION = "-- The used Cache must be containted in the same parent Resource\n" +
		"if not self.ownedCache.oclIsUndefined() then\n" +
		"\tself.parentStructuredResource=self.ownedCache.parentStructuredResource\n" +
		"else\n" +
		"\t true\n" +
		"endif\n" +
		"";

	/**
	 * Validates the ownedCacheInSameStructuredResource constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor_ownedCacheInSameStructuredResource(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourcePackage.Literals.PROCESSOR,
				 processor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ownedCacheInSameStructuredResource",
				 PROCESSOR__OWNED_CACHE_IN_SAME_STRUCTURED_RESOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicResource(AtomicResource atomicResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atomicResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredResource(StructuredResource structuredResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRepository(ResourceRepository resourceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceRepository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRepository_UniqueProtocolName(resourceRepository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueProtocolName constraint of '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_REPOSITORY__UNIQUE_PROTOCOL_NAME__EEXPRESSION = "-- A Protocol must have an unique name\n" +
		"self.protocols->isUnique(name)";

	/**
	 * Validates the UniqueProtocolName constraint of '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRepository_UniqueProtocolName(ResourceRepository resourceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY,
				 resourceRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueProtocolName",
				 RESOURCE_REPOSITORY__UNIQUE_PROTOCOL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationProtocolRepository(CommunicationProtocolRepository communicationProtocolRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationProtocolRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationProtocol(CommunicationProtocol communicationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusProtocol(BusProtocol busProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(busProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkProtocol(LinkProtocol linkProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkProtocol, diagnostics, context);
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
	public boolean validateDeviceKind(DeviceKind deviceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessorArchitecture(ProcessorArchitecture processorArchitecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryAccessKind(MemoryAccessKind memoryAccessKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryKind(MemoryKind memoryKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplacementPolicy(ReplacementPolicy replacementPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWritePolicy(WritePolicy writePolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationKind(CommunicationKind communicationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusProtocolKind(BusProtocolKind busProtocolKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkProtocolKind(LinkProtocolKind linkProtocolKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //HwresourceValidator
