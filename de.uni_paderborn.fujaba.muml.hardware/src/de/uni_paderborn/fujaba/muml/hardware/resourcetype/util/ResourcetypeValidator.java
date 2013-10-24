/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage
 * @generated
 */
public class ResourcetypeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ResourcetypeValidator INSTANCE = new ResourcetypeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.hardware.resourcetype";

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
	public ResourcetypeValidator() {
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
	  return ResourcetypePackage.eINSTANCE;
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
			case ResourcetypePackage.RESOURCE_TYPE:
				return validateResourceType((ResourceType)value, diagnostics, context);
			case ResourcetypePackage.COMPUTING_RESOURCE:
				return validateComputingResource((ComputingResource)value, diagnostics, context);
			case ResourcetypePackage.MEMORY_RESOURCE:
				return validateMemoryResource((MemoryResource)value, diagnostics, context);
			case ResourcetypePackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case ResourcetypePackage.CACHE:
				return validateCache((Cache)value, diagnostics, context);
			case ResourcetypePackage.PROGRAMMABLE_LOGIC_DEVICE:
				return validateProgrammableLogicDevice((ProgrammableLogicDevice)value, diagnostics, context);
			case ResourcetypePackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case ResourcetypePackage.ATOMIC_RESOURCE:
				return validateAtomicResource((AtomicResource)value, diagnostics, context);
			case ResourcetypePackage.STRUCTURED_RESOURCE:
				return validateStructuredResource((StructuredResource)value, diagnostics, context);
			case ResourcetypePackage.HW_PORT:
				return validateHWPort((HWPort)value, diagnostics, context);
			case ResourcetypePackage.RESOURCE_TYPE_REPOSITORY:
				return validateResourceTypeRepository((ResourceTypeRepository)value, diagnostics, context);
			case ResourcetypePackage.COMMUNICATION_PROTOCOL:
				return validateCommunicationProtocol((CommunicationProtocol)value, diagnostics, context);
			case ResourcetypePackage.BUS_PROTOCOL:
				return validateBusProtocol((BusProtocol)value, diagnostics, context);
			case ResourcetypePackage.LINK_PROTOCOL:
				return validateLinkProtocol((LinkProtocol)value, diagnostics, context);
			case ResourcetypePackage.DEVICE_KIND:
				return validateDeviceKind((DeviceKind)value, diagnostics, context);
			case ResourcetypePackage.PROCESSOR_ARCHITECTURE:
				return validateProcessorArchitecture((ProcessorArchitecture)value, diagnostics, context);
			case ResourcetypePackage.MEMORY_ACCESS_KIND:
				return validateMemoryAccessKind((MemoryAccessKind)value, diagnostics, context);
			case ResourcetypePackage.MEMORY_KIND:
				return validateMemoryKind((MemoryKind)value, diagnostics, context);
			case ResourcetypePackage.REPLACEMENT_POLICY:
				return validateReplacementPolicy((ReplacementPolicy)value, diagnostics, context);
			case ResourcetypePackage.WRITE_POLICY:
				return validateWritePolicy((WritePolicy)value, diagnostics, context);
			case ResourcetypePackage.HW_PORT_KIND:
				return validateHWPortKind((HWPortKind)value, diagnostics, context);
			case ResourcetypePackage.BUS_PROTOCOL_KIND:
				return validateBusProtocolKind((BusProtocolKind)value, diagnostics, context);
			case ResourcetypePackage.LINK_PROTOCOL_KIND:
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
	public boolean validateResourceType(ResourceType resourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceType, diagnostics, context);
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
	protected static final String MEMORY_RESOURCE__RA_MIMPLIES_RW__EEXPRESSION = "self.memoryType = MemoryKind::RAM implies self.memoryAccess=MemoryAccessKind::READ_WRITE";

	/**
	 * Validates the RAMimpliesRW constraint of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResource_RAMimpliesRW(MemoryResource memoryResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ResourcetypePackage.Literals.MEMORY_RESOURCE,
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
	protected static final String MEMORY_RESOURCE__RO_MIMPLIES_READ_ONLY__EEXPRESSION = "self.memoryType = MemoryKind::ROM implies self.memoryAccess = MemoryAccessKind::READ_ONLY";

	/**
	 * Validates the ROMimpliesReadOnly constraint of '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryResource_ROMimpliesReadOnly(MemoryResource memoryResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ResourcetypePackage.Literals.MEMORY_RESOURCE,
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
	protected static final String PROCESSOR__OWNED_CACHE_IN_SAME_STRUCTURED_RESOURCE__EEXPRESSION = "if not self.ownedCache.oclIsUndefined() then\n" +
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
				(ResourcetypePackage.Literals.PROCESSOR,
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
	public boolean validateHWPort(HWPort hwPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPort_BusProtocolImpliesBusType(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateHWPort_LinkProtocolImpliesLinkType(hwPort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the BusProtocolImpliesBusType constraint of '<em>HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT__BUS_PROTOCOL_IMPLIES_BUS_TYPE__EEXPRESSION = "self.protocol.oclIsTypeOf(resourcetype::BusProtocol) implies self.portType=resourcetype::HWPortKind::BUS";

	/**
	 * Validates the BusProtocolImpliesBusType constraint of '<em>HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPort_BusProtocolImpliesBusType(HWPort hwPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ResourcetypePackage.Literals.HW_PORT,
				 hwPort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "BusProtocolImpliesBusType",
				 HW_PORT__BUS_PROTOCOL_IMPLIES_BUS_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LinkProtocolImpliesLinkType constraint of '<em>HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HW_PORT__LINK_PROTOCOL_IMPLIES_LINK_TYPE__EEXPRESSION = "self.protocol.oclIsTypeOf(resourcetype::LinkProtocol) implies self.portType=resourcetype::HWPortKind::LINK\n" +
		"";

	/**
	 * Validates the LinkProtocolImpliesLinkType constraint of '<em>HW Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWPort_LinkProtocolImpliesLinkType(HWPort hwPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ResourcetypePackage.Literals.HW_PORT,
				 hwPort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LinkProtocolImpliesLinkType",
				 HW_PORT__LINK_PROTOCOL_IMPLIES_LINK_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTypeRepository(ResourceTypeRepository resourceTypeRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceTypeRepository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceTypeRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceTypeRepository_UniqueProtocolName(resourceTypeRepository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueProtocolName constraint of '<em>Resource Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_TYPE_REPOSITORY__UNIQUE_PROTOCOL_NAME__EEXPRESSION = "self.protocols->isUnique(name)";

	/**
	 * Validates the UniqueProtocolName constraint of '<em>Resource Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTypeRepository_UniqueProtocolName(ResourceTypeRepository resourceTypeRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ResourcetypePackage.Literals.RESOURCE_TYPE_REPOSITORY,
				 resourceTypeRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniqueProtocolName",
				 RESOURCE_TYPE_REPOSITORY__UNIQUE_PROTOCOL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	public boolean validateHWPortKind(HWPortKind hwPortKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ResourcetypeValidator
