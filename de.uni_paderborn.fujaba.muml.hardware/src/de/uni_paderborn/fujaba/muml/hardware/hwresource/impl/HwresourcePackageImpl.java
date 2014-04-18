/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.HwplatformPackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HwplatforminstancePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.AtomicResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Bus;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ComputingResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Device;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.DeviceKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Link;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.LinkProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.LinkProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.MemoryAccessKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.MemoryKind;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.MemoryResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Processor;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ProcessorArchitecture;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ProgrammableLogicDevice;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ReplacementPolicy;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ResourceRepository;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.WritePolicy;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.util.HwresourceValidator;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.impl.HwresourceinstancePackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.types.TypesPackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwresourcePackageImpl extends EPackageImpl implements HwresourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmableLogicDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationProtocolRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkProtocolEClass = null;

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
	private EClass hwPortEClass = null;

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
	private EEnum deviceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorArchitectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryAccessKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum replacementPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writePolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hwPortKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busProtocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkProtocolKindEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwresourcePackageImpl() {
		super(eNS_URI, HwresourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwresourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwresourcePackage init() {
		if (isInited) return (HwresourcePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourcePackage.eNS_URI);

		// Obtain or create and register package
		HwresourcePackageImpl theHwresourcePackage = (HwresourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwresourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwresourcePackageImpl());

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
		HwplatformPackageImpl theHwplatformPackage = (HwplatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) instanceof HwplatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatformPackage.eNS_URI) : HwplatformPackage.eINSTANCE);
		HwvaluetypePackageImpl theHwvaluetypePackage = (HwvaluetypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) instanceof HwvaluetypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI) : HwvaluetypePackage.eINSTANCE);
		HwplatforminstancePackageImpl theHwplatforminstancePackage = (HwplatforminstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) instanceof HwplatforminstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwplatforminstancePackage.eNS_URI) : HwplatforminstancePackage.eINSTANCE);
		HwresourceinstancePackageImpl theHwresourceinstancePackage = (HwresourceinstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) instanceof HwresourceinstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI) : HwresourceinstancePackage.eINSTANCE);

		// Create package meta-data objects
		theHwresourcePackage.createPackageContents();
		theHwplatformPackage.createPackageContents();
		theHwvaluetypePackage.createPackageContents();
		theHwplatforminstancePackage.createPackageContents();
		theHwresourceinstancePackage.createPackageContents();

		// Initialize created meta-data
		theHwresourcePackage.initializePackageContents();
		theHwplatformPackage.initializePackageContents();
		theHwvaluetypePackage.initializePackageContents();
		theHwplatforminstancePackage.initializePackageContents();
		theHwresourceinstancePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHwresourcePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HwresourceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHwresourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwresourcePackage.eNS_URI, theHwresourcePackage);
		return theHwresourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Hwports() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingResource() {
		return computingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryResource() {
		return memoryResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_MemoryAccess() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_IsVolatile() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryResource_MemoryType() {
		return (EAttribute)memoryResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceType() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_WritePolicy() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_ReplacementPolicy() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_NbSets() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Associativity() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCache_UsedByProcessor() {
		return (EReference)cacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammableLogicDevice() {
		return programmableLogicDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_OwnedCache() {
		return (EReference)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Architecture() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_NbCores() {
		return (EReference)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Family() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_NbPipelineStages() {
		return (EReference)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicResource() {
		return atomicResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicResource_ParentStructuredResource() {
		return (EReference)atomicResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredResource() {
		return structuredResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredResource_EmbeddedAtomicResources() {
		return (EReference)structuredResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRepository() {
		return resourceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRepository_Resources() {
		return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRepository_Protocols() {
		return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRepository_CommunicationMedia() {
		return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationProtocolRepository() {
		return communicationProtocolRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationProtocolRepository_CommunicationProtocols() {
		return (EReference)communicationProtocolRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationProtocol() {
		return communicationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_IsTimeTriggered() {
		return (EAttribute)communicationProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_IsEventTriggered() {
		return (EAttribute)communicationProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_FurtherInformation() {
		return (EAttribute)communicationProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusProtocol() {
		return busProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusProtocol_BusProtocol() {
		return (EAttribute)busProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusProtocol__ToString() {
		return busProtocolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkProtocol() {
		return linkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkProtocol_LinkProtocol() {
		return (EAttribute)linkProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkProtocol__ToString() {
		return linkProtocolEClass.getEOperations().get(0);
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
	public EAttribute getCommunicationResource_PortKind() {
		return (EAttribute)communicationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationResource_Protocol() {
		return (EReference)communicationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationResource_Cardinality() {
		return (EReference)communicationResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationResource_MultiHWPort() {
		return (EAttribute)communicationResourceEClass.getEStructuralFeatures().get(3);
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
	public EReference getHWPort_ParentResource() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(0);
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
	public EClass getLink() {
		return linkEClass;
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
	public EReference getCommunicationMedia_Bandwidth() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedia_Protocol() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedia_IsSerial() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceKind() {
		return deviceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorArchitecture() {
		return processorArchitectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryAccessKind() {
		return memoryAccessKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryKind() {
		return memoryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReplacementPolicy() {
		return replacementPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWritePolicy() {
		return writePolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHWPortKind() {
		return hwPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusProtocolKind() {
		return busProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkProtocolKind() {
		return linkProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceFactory getHwresourceFactory() {
		return (HwresourceFactory)getEFactoryInstance();
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
		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__HWPORTS);

		computingResourceEClass = createEClass(COMPUTING_RESOURCE);

		memoryResourceEClass = createEClass(MEMORY_RESOURCE);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__MEMORY_ACCESS);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__IS_VOLATILE);
		createEAttribute(memoryResourceEClass, MEMORY_RESOURCE__MEMORY_TYPE);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_TYPE);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__WRITE_POLICY);
		createEAttribute(cacheEClass, CACHE__REPLACEMENT_POLICY);
		createEAttribute(cacheEClass, CACHE__NB_SETS);
		createEAttribute(cacheEClass, CACHE__ASSOCIATIVITY);
		createEReference(cacheEClass, CACHE__USED_BY_PROCESSOR);

		programmableLogicDeviceEClass = createEClass(PROGRAMMABLE_LOGIC_DEVICE);

		processorEClass = createEClass(PROCESSOR);
		createEReference(processorEClass, PROCESSOR__OWNED_CACHE);
		createEAttribute(processorEClass, PROCESSOR__ARCHITECTURE);
		createEReference(processorEClass, PROCESSOR__NB_CORES);
		createEAttribute(processorEClass, PROCESSOR__FAMILY);
		createEReference(processorEClass, PROCESSOR__NB_PIPELINE_STAGES);

		atomicResourceEClass = createEClass(ATOMIC_RESOURCE);
		createEReference(atomicResourceEClass, ATOMIC_RESOURCE__PARENT_STRUCTURED_RESOURCE);

		structuredResourceEClass = createEClass(STRUCTURED_RESOURCE);
		createEReference(structuredResourceEClass, STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES);

		resourceRepositoryEClass = createEClass(RESOURCE_REPOSITORY);
		createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__RESOURCES);
		createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__PROTOCOLS);
		createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__COMMUNICATION_MEDIA);

		communicationProtocolRepositoryEClass = createEClass(COMMUNICATION_PROTOCOL_REPOSITORY);
		createEReference(communicationProtocolRepositoryEClass, COMMUNICATION_PROTOCOL_REPOSITORY__COMMUNICATION_PROTOCOLS);

		communicationProtocolEClass = createEClass(COMMUNICATION_PROTOCOL);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__IS_TIME_TRIGGERED);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__IS_EVENT_TRIGGERED);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__FURTHER_INFORMATION);

		busProtocolEClass = createEClass(BUS_PROTOCOL);
		createEAttribute(busProtocolEClass, BUS_PROTOCOL__BUS_PROTOCOL);
		createEOperation(busProtocolEClass, BUS_PROTOCOL___TO_STRING);

		linkProtocolEClass = createEClass(LINK_PROTOCOL);
		createEAttribute(linkProtocolEClass, LINK_PROTOCOL__LINK_PROTOCOL);
		createEOperation(linkProtocolEClass, LINK_PROTOCOL___TO_STRING);

		communicationResourceEClass = createEClass(COMMUNICATION_RESOURCE);
		createEAttribute(communicationResourceEClass, COMMUNICATION_RESOURCE__PORT_KIND);
		createEReference(communicationResourceEClass, COMMUNICATION_RESOURCE__PROTOCOL);
		createEReference(communicationResourceEClass, COMMUNICATION_RESOURCE__CARDINALITY);
		createEAttribute(communicationResourceEClass, COMMUNICATION_RESOURCE__MULTI_HW_PORT);

		hwPortEClass = createEClass(HW_PORT);
		createEReference(hwPortEClass, HW_PORT__PARENT_RESOURCE);

		busEClass = createEClass(BUS);

		linkEClass = createEClass(LINK);

		communicationMediaEClass = createEClass(COMMUNICATION_MEDIA);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__DATA_FRAME_SIZE);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__BANDWIDTH);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__PROTOCOL);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__IS_SERIAL);

		// Create enums
		deviceKindEEnum = createEEnum(DEVICE_KIND);
		processorArchitectureEEnum = createEEnum(PROCESSOR_ARCHITECTURE);
		memoryAccessKindEEnum = createEEnum(MEMORY_ACCESS_KIND);
		memoryKindEEnum = createEEnum(MEMORY_KIND);
		replacementPolicyEEnum = createEEnum(REPLACEMENT_POLICY);
		writePolicyEEnum = createEEnum(WRITE_POLICY);
		hwPortKindEEnum = createEEnum(HW_PORT_KIND);
		busProtocolKindEEnum = createEEnum(BUS_PROTOCOL_KIND);
		linkProtocolKindEEnum = createEEnum(LINK_PROTOCOL_KIND);
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
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		computingResourceEClass.getESuperTypes().add(this.getAtomicResource());
		memoryResourceEClass.getESuperTypes().add(this.getAtomicResource());
		deviceEClass.getESuperTypes().add(this.getResource());
		cacheEClass.getESuperTypes().add(this.getMemoryResource());
		programmableLogicDeviceEClass.getESuperTypes().add(this.getComputingResource());
		processorEClass.getESuperTypes().add(this.getComputingResource());
		atomicResourceEClass.getESuperTypes().add(this.getResource());
		structuredResourceEClass.getESuperTypes().add(this.getResource());
		resourceRepositoryEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		communicationProtocolEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		busProtocolEClass.getESuperTypes().add(this.getCommunicationProtocol());
		linkProtocolEClass.getESuperTypes().add(this.getCommunicationProtocol());
		communicationResourceEClass.getESuperTypes().add(this.getHWPort());
		hwPortEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		busEClass.getESuperTypes().add(this.getCommunicationMedia());
		linkEClass.getESuperTypes().add(this.getCommunicationMedia());
		communicationMediaEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Hwports(), this.getHWPort(), this.getHWPort_ParentResource(), "hwports", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingResourceEClass, ComputingResource.class, "ComputingResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryResourceEClass, MemoryResource.class, "MemoryResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryResource_MemoryAccess(), this.getMemoryAccessKind(), "memoryAccess", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryResource_IsVolatile(), ecorePackage.getEBoolean(), "isVolatile", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryResource_MemoryType(), this.getMemoryKind(), "memoryType", null, 0, 1, MemoryResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceType(), this.getDeviceKind(), "deviceType", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_WritePolicy(), this.getWritePolicy(), "writePolicy", "WRITE_THROUGH", 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_ReplacementPolicy(), this.getReplacementPolicy(), "replacementPolicy", "FIFO", 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_NbSets(), ecorePackage.getEInt(), "nbSets", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Associativity(), ecorePackage.getEInt(), "associativity", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_UsedByProcessor(), this.getProcessor(), this.getProcessor_OwnedCache(), "usedByProcessor", null, 0, -1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmableLogicDeviceEClass, ProgrammableLogicDevice.class, "ProgrammableLogicDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessor_OwnedCache(), this.getCache(), this.getCache_UsedByProcessor(), "ownedCache", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Architecture(), this.getProcessorArchitecture(), "architecture", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_NbCores(), theValuetypePackage.getNaturalNumber(), null, "nbCores", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Family(), ecorePackage.getEString(), "family", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_NbPipelineStages(), theValuetypePackage.getNaturalNumber(), null, "nbPipelineStages", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicResourceEClass, AtomicResource.class, "AtomicResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicResource_ParentStructuredResource(), this.getStructuredResource(), this.getStructuredResource_EmbeddedAtomicResources(), "parentStructuredResource", null, 1, 1, AtomicResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredResourceEClass, StructuredResource.class, "StructuredResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredResource_EmbeddedAtomicResources(), this.getAtomicResource(), this.getAtomicResource_ParentStructuredResource(), "embeddedAtomicResources", null, 1, -1, StructuredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRepositoryEClass, ResourceRepository.class, "ResourceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRepository_Resources(), this.getResource(), null, "resources", null, 1, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRepository_Protocols(), this.getCommunicationProtocol(), null, "protocols", null, 1, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRepository_CommunicationMedia(), this.getCommunicationMedia(), null, "communicationMedia", null, 0, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationProtocolRepositoryEClass, CommunicationProtocolRepository.class, "CommunicationProtocolRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationProtocolRepository_CommunicationProtocols(), this.getCommunicationProtocol(), null, "communicationProtocols", null, 0, -1, CommunicationProtocolRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationProtocolEClass, CommunicationProtocol.class, "CommunicationProtocol", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationProtocol_IsTimeTriggered(), ecorePackage.getEBoolean(), "isTimeTriggered", "false", 1, 1, CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationProtocol_IsEventTriggered(), ecorePackage.getEBoolean(), "isEventTriggered", "false", 1, 1, CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationProtocol_FurtherInformation(), ecorePackage.getEString(), "furtherInformation", null, 0, 1, CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busProtocolEClass, BusProtocol.class, "BusProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusProtocol_BusProtocol(), this.getBusProtocolKind(), "busProtocol", null, 1, 1, BusProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBusProtocol__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkProtocolEClass, LinkProtocol.class, "LinkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkProtocol_LinkProtocol(), this.getLinkProtocolKind(), "linkProtocol", null, 1, 1, LinkProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLinkProtocol__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(communicationResourceEClass, CommunicationResource.class, "CommunicationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationResource_PortKind(), this.getHWPortKind(), "portKind", null, 1, 1, CommunicationResource.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationResource_Protocol(), this.getCommunicationProtocol(), null, "protocol", null, 1, 1, CommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationResource_Cardinality(), theValuetypePackage.getCardinality(), null, "cardinality", null, 1, 1, CommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationResource_MultiHWPort(), ecorePackage.getEBoolean(), "multiHWPort", null, 1, 1, CommunicationResource.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hwPortEClass, HWPort.class, "HWPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWPort_ParentResource(), this.getResource(), this.getResource_Hwports(), "parentResource", null, 1, 1, HWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationMediaEClass, CommunicationMedia.class, "CommunicationMedia", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMedia_DataFrameSize(), theHwvaluetypePackage.getDataSize(), null, "dataFrameSize", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMedia_Bandwidth(), theHwvaluetypePackage.getDataRate(), null, "bandwidth", null, 1, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMedia_Protocol(), this.getCommunicationProtocol(), null, "protocol", null, 1, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationMedia_IsSerial(), ecorePackage.getEBoolean(), "isSerial", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deviceKindEEnum, DeviceKind.class, "DeviceKind");
		addEEnumLiteral(deviceKindEEnum, DeviceKind.SENSOR);
		addEEnumLiteral(deviceKindEEnum, DeviceKind.ACTUATOR);

		initEEnum(processorArchitectureEEnum, ProcessorArchitecture.class, "ProcessorArchitecture");
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.RISC);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.CISC);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.VLIW);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.SIMD);
		addEEnumLiteral(processorArchitectureEEnum, ProcessorArchitecture.OTHER);

		initEEnum(memoryAccessKindEEnum, MemoryAccessKind.class, "MemoryAccessKind");
		addEEnumLiteral(memoryAccessKindEEnum, MemoryAccessKind.READ_WRITE);
		addEEnumLiteral(memoryAccessKindEEnum, MemoryAccessKind.READ_ONLY);

		initEEnum(memoryKindEEnum, MemoryKind.class, "MemoryKind");
		addEEnumLiteral(memoryKindEEnum, MemoryKind.RAM);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.ROM);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.DISK);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.FLASH);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.OTHER);

		initEEnum(replacementPolicyEEnum, ReplacementPolicy.class, "ReplacementPolicy");
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.LRU);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.FIFO);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.NFU);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.NRU);
		addEEnumLiteral(replacementPolicyEEnum, ReplacementPolicy.OTHER);

		initEEnum(writePolicyEEnum, WritePolicy.class, "WritePolicy");
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_BACK);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_THROUGH);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.OTHER);

		initEEnum(hwPortKindEEnum, HWPortKind.class, "HWPortKind");
		addEEnumLiteral(hwPortKindEEnum, HWPortKind.BUS);
		addEEnumLiteral(hwPortKindEEnum, HWPortKind.LINK);

		initEEnum(busProtocolKindEEnum, BusProtocolKind.class, "BusProtocolKind");
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.CAN);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.FLEXRAY);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.LIN);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.BYTEFLIGHT);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.TTP);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.MOST);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.I2C);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.USB);
		addEEnumLiteral(busProtocolKindEEnum, BusProtocolKind.OTHER);

		initEEnum(linkProtocolKindEEnum, LinkProtocolKind.class, "LinkProtocolKind");
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.ETHERNET);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.ETHERCAT);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.ANALOG);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.OTHER);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.BLUETOOTH);
		addEEnumLiteral(linkProtocolKindEEnum, LinkProtocolKind.WIFI);

		// Create resource
		createResource(eNS_URI);

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
		  (memoryResourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "RAMimpliesRW"
		   });																		
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "constraints", "ownedCacheInSameStructuredResource"
		   });																				
		addAnnotation
		  (resourceRepositoryEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueProtocolName"
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
			 "constraints", "LinkProtocol"
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
		  (memoryResourceEClass, 
		   source, 
		   new String[] {
			 "RAMimpliesRW", "self.memoryType = MemoryKind::RAM implies self.memoryAccess=MemoryAccessKind::READ_WRITE",
			 "ROMimpliesReadOnly", "self.memoryType = MemoryKind::ROM implies self.memoryAccess = MemoryAccessKind::READ_ONLY"
		   });																
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "ownedCacheInSameStructuredResource", "if not self.ownedCache.oclIsUndefined() then\n\tself.parentStructuredResource=self.ownedCache.parentStructuredResource\nelse\n\t true\nendif\n"
		   });																				
		addAnnotation
		  (resourceRepositoryEClass, 
		   source, 
		   new String[] {
			 "UniqueProtocolName", "self.protocols->isUnique(name)"
		   });																					
		addAnnotation
		  (getCommunicationResource_PortKind(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.protocol.oclIsUndefined()) then\n\tnull\nelse if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\t\thwresource::HWPortKind::BUS\nelse\n\t\thwresource::HWPortKind::LINK\nendif endif"
		   });				
		addAnnotation
		  (getCommunicationResource_MultiHWPort(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.cardinality.oclIsUndefined()) then false else self.cardinality.upperBound.value>1 endif\n"
		   });						
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "BusProtocol", "self.protocol.oclIsTypeOf(hwresource::BusProtocol)"
		   });			
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "LinkProtocol", "self.protocol.oclIsTypeOf(hwresource::LinkProtocol)"
		   });						
	}

} //HwresourcePackageImpl
