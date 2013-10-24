/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache;
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
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.WritePolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcetypeFactoryImpl extends EFactoryImpl implements ResourcetypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcetypeFactory init() {
		try {
			ResourcetypeFactory theResourcetypeFactory = (ResourcetypeFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcetypePackage.eNS_URI);
			if (theResourcetypeFactory != null) {
				return theResourcetypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcetypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypeFactoryImpl() {
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
			case ResourcetypePackage.MEMORY_RESOURCE: return createMemoryResource();
			case ResourcetypePackage.DEVICE: return createDevice();
			case ResourcetypePackage.CACHE: return createCache();
			case ResourcetypePackage.PROGRAMMABLE_LOGIC_DEVICE: return createProgrammableLogicDevice();
			case ResourcetypePackage.PROCESSOR: return createProcessor();
			case ResourcetypePackage.STRUCTURED_RESOURCE: return createStructuredResource();
			case ResourcetypePackage.HW_PORT: return createHWPort();
			case ResourcetypePackage.RESOURCE_TYPE_REPOSITORY: return createResourceTypeRepository();
			case ResourcetypePackage.BUS_PROTOCOL: return createBusProtocol();
			case ResourcetypePackage.LINK_PROTOCOL: return createLinkProtocol();
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
			case ResourcetypePackage.DEVICE_KIND:
				return createDeviceKindFromString(eDataType, initialValue);
			case ResourcetypePackage.PROCESSOR_ARCHITECTURE:
				return createProcessorArchitectureFromString(eDataType, initialValue);
			case ResourcetypePackage.MEMORY_ACCESS_KIND:
				return createMemoryAccessKindFromString(eDataType, initialValue);
			case ResourcetypePackage.MEMORY_KIND:
				return createMemoryKindFromString(eDataType, initialValue);
			case ResourcetypePackage.REPLACEMENT_POLICY:
				return createReplacementPolicyFromString(eDataType, initialValue);
			case ResourcetypePackage.WRITE_POLICY:
				return createWritePolicyFromString(eDataType, initialValue);
			case ResourcetypePackage.HW_PORT_KIND:
				return createHWPortKindFromString(eDataType, initialValue);
			case ResourcetypePackage.BUS_PROTOCOL_KIND:
				return createBusProtocolKindFromString(eDataType, initialValue);
			case ResourcetypePackage.LINK_PROTOCOL_KIND:
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
			case ResourcetypePackage.DEVICE_KIND:
				return convertDeviceKindToString(eDataType, instanceValue);
			case ResourcetypePackage.PROCESSOR_ARCHITECTURE:
				return convertProcessorArchitectureToString(eDataType, instanceValue);
			case ResourcetypePackage.MEMORY_ACCESS_KIND:
				return convertMemoryAccessKindToString(eDataType, instanceValue);
			case ResourcetypePackage.MEMORY_KIND:
				return convertMemoryKindToString(eDataType, instanceValue);
			case ResourcetypePackage.REPLACEMENT_POLICY:
				return convertReplacementPolicyToString(eDataType, instanceValue);
			case ResourcetypePackage.WRITE_POLICY:
				return convertWritePolicyToString(eDataType, instanceValue);
			case ResourcetypePackage.HW_PORT_KIND:
				return convertHWPortKindToString(eDataType, instanceValue);
			case ResourcetypePackage.BUS_PROTOCOL_KIND:
				return convertBusProtocolKindToString(eDataType, instanceValue);
			case ResourcetypePackage.LINK_PROTOCOL_KIND:
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
	public HWPort createHWPort() {
		HWPortImpl hwPort = new HWPortImpl();
		return hwPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeRepository createResourceTypeRepository() {
		ResourceTypeRepositoryImpl resourceTypeRepository = new ResourceTypeRepositoryImpl();
		return resourceTypeRepository;
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
	public HWPortKind createHWPortKindFromString(EDataType eDataType, String initialValue) {
		HWPortKind result = HWPortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHWPortKindToString(EDataType eDataType, Object instanceValue) {
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
	public ResourcetypePackage getResourcetypePackage() {
		return (ResourcetypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcetypePackage getPackage() {
		return ResourcetypePackage.eINSTANCE;
	}

} //ResourcetypeFactoryImpl
