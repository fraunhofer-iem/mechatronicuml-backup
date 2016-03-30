/**
 */
package org.muml.pm.hardware.hwresource.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pm.hardware.hwresource.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwresourceFactoryImpl extends EFactoryImpl implements HwresourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwresourceFactory init() {
		try {
			HwresourceFactory theHwresourceFactory = (HwresourceFactory)EPackage.Registry.INSTANCE.getEFactory(HwresourcePackage.eNS_URI);
			if (theHwresourceFactory != null) {
				return theHwresourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwresourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceFactoryImpl() {
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
			case HwresourcePackage.MEMORY_RESOURCE: return createMemoryResource();
			case HwresourcePackage.DEVICE: return createDevice();
			case HwresourcePackage.CACHE: return createCache();
			case HwresourcePackage.PROGRAMMABLE_LOGIC_DEVICE: return createProgrammableLogicDevice();
			case HwresourcePackage.PROCESSOR: return createProcessor();
			case HwresourcePackage.STRUCTURED_RESOURCE: return createStructuredResource();
			case HwresourcePackage.RESOURCE_REPOSITORY: return createResourceRepository();
			case HwresourcePackage.COMMUNICATION_PROTOCOL_REPOSITORY: return createCommunicationProtocolRepository();
			case HwresourcePackage.BUS_PROTOCOL: return createBusProtocol();
			case HwresourcePackage.LINK_PROTOCOL: return createLinkProtocol();
			case HwresourcePackage.COMMUNICATION_RESOURCE: return createCommunicationResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HwresourcePackage.DEVICE_KIND:
				return createDeviceKindFromString(eDataType, initialValue);
			case HwresourcePackage.PROCESSOR_ARCHITECTURE:
				return createProcessorArchitectureFromString(eDataType, initialValue);
			case HwresourcePackage.MEMORY_ACCESS_KIND:
				return createMemoryAccessKindFromString(eDataType, initialValue);
			case HwresourcePackage.MEMORY_KIND:
				return createMemoryKindFromString(eDataType, initialValue);
			case HwresourcePackage.REPLACEMENT_POLICY:
				return createReplacementPolicyFromString(eDataType, initialValue);
			case HwresourcePackage.WRITE_POLICY:
				return createWritePolicyFromString(eDataType, initialValue);
			case HwresourcePackage.COMMUNICATION_KIND:
				return createCommunicationKindFromString(eDataType, initialValue);
			case HwresourcePackage.BUS_PROTOCOL_KIND:
				return createBusProtocolKindFromString(eDataType, initialValue);
			case HwresourcePackage.LINK_PROTOCOL_KIND:
				return createLinkProtocolKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HwresourcePackage.DEVICE_KIND:
				return convertDeviceKindToString(eDataType, instanceValue);
			case HwresourcePackage.PROCESSOR_ARCHITECTURE:
				return convertProcessorArchitectureToString(eDataType, instanceValue);
			case HwresourcePackage.MEMORY_ACCESS_KIND:
				return convertMemoryAccessKindToString(eDataType, instanceValue);
			case HwresourcePackage.MEMORY_KIND:
				return convertMemoryKindToString(eDataType, instanceValue);
			case HwresourcePackage.REPLACEMENT_POLICY:
				return convertReplacementPolicyToString(eDataType, instanceValue);
			case HwresourcePackage.WRITE_POLICY:
				return convertWritePolicyToString(eDataType, instanceValue);
			case HwresourcePackage.COMMUNICATION_KIND:
				return convertCommunicationKindToString(eDataType, instanceValue);
			case HwresourcePackage.BUS_PROTOCOL_KIND:
				return convertBusProtocolKindToString(eDataType, instanceValue);
			case HwresourcePackage.LINK_PROTOCOL_KIND:
				return convertLinkProtocolKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryResource createMemoryResource() {
		MemoryResourceImpl memoryResource = new MemoryResourceImpl();
		return memoryResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammableLogicDevice createProgrammableLogicDevice() {
		ProgrammableLogicDeviceImpl programmableLogicDevice = new ProgrammableLogicDeviceImpl();
		return programmableLogicDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResource createStructuredResource() {
		StructuredResourceImpl structuredResource = new StructuredResourceImpl();
		return structuredResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRepository createResourceRepository() {
		ResourceRepositoryImpl resourceRepository = new ResourceRepositoryImpl();
		return resourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocolRepository createCommunicationProtocolRepository() {
		CommunicationProtocolRepositoryImpl communicationProtocolRepository = new CommunicationProtocolRepositoryImpl();
		return communicationProtocolRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusProtocol createBusProtocol() {
		BusProtocolImpl busProtocol = new BusProtocolImpl();
		return busProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProtocol createLinkProtocol() {
		LinkProtocolImpl linkProtocol = new LinkProtocolImpl();
		return linkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource createCommunicationResource() {
		CommunicationResourceImpl communicationResource = new CommunicationResourceImpl();
		return communicationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceKind createDeviceKindFromString(EDataType eDataType, String initialValue) {
		DeviceKind result = DeviceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorArchitecture createProcessorArchitectureFromString(EDataType eDataType, String initialValue) {
		ProcessorArchitecture result = ProcessorArchitecture.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorArchitectureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAccessKind createMemoryAccessKindFromString(EDataType eDataType, String initialValue) {
		MemoryAccessKind result = MemoryAccessKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryAccessKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryKind createMemoryKindFromString(EDataType eDataType, String initialValue) {
		MemoryKind result = MemoryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacementPolicy createReplacementPolicyFromString(EDataType eDataType, String initialValue) {
		ReplacementPolicy result = ReplacementPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReplacementPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePolicy createWritePolicyFromString(EDataType eDataType, String initialValue) {
		WritePolicy result = WritePolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWritePolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationKind createCommunicationKindFromString(EDataType eDataType, String initialValue) {
		CommunicationKind result = CommunicationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusProtocolKind createBusProtocolKindFromString(EDataType eDataType, String initialValue) {
		BusProtocolKind result = BusProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProtocolKind createLinkProtocolKindFromString(EDataType eDataType, String initialValue) {
		LinkProtocolKind result = LinkProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourcePackage getHwresourcePackage() {
		return (HwresourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HwresourcePackage getPackage() {
		return HwresourcePackage.eINSTANCE;
	}

} //HwresourceFactoryImpl
