/**
 */
package org.muml.psm.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.software.SoftwarePackage;
import org.muml.psm.PsmPackage;
import org.muml.psm.allocation.AllocationPackage;
import org.muml.psm.allocation.impl.AllocationPackageImpl;
import org.muml.psm.apiexpressions.ApiexpressionsPackage;
import org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl;
import org.muml.psm.impl.PsmPackageImpl;
import org.muml.psm.portapimapping.PortapimappingPackage;
import org.muml.psm.portapimapping.impl.PortapimappingPackageImpl;
import org.muml.psm.properties.CANMessageFrame;
import org.muml.psm.properties.MessageFrame;
import org.muml.psm.properties.PropertiesFactory;
import org.muml.psm.properties.PropertiesPackage;
import org.muml.psm.properties.RequiredMemory;
import org.muml.psm.properties.Scheduling;
import org.muml.psm.psm_instance.Psm_instancePackage;
import org.muml.psm.psm_instance.impl.Psm_instancePackageImpl;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;
import org.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesPackageImpl extends EPackageImpl implements PropertiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canMessageFrameEClass = null;

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
	 * @see org.muml.psm.properties.PropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertiesPackageImpl() {
		super(eNS_URI, PropertiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertiesPackage init() {
		if (isInited) return (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

		// Obtain or create and register package
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
		SoftwarePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		Psm_realtimestatechartPackageImpl thePsm_realtimestatechartPackage = (Psm_realtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) instanceof Psm_realtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) : Psm_realtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) : RealtimestatechartparameterPackage.eINSTANCE);
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) : RealtimestatechartparameterbindingPackage.eINSTANCE);
		Psm_instancePackageImpl thePsm_instancePackage = (Psm_instancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) instanceof Psm_instancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) : Psm_instancePackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) : ApiexpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		thePropertiesPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePsm_realtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterPackage.createPackageContents();
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		thePsm_instancePackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();
		theApiexpressionsPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePsm_realtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterPackage.initializePackageContents();
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		thePsm_instancePackage.initializePackageContents();
		thePortapimappingPackage.initializePackageContents();
		theApiexpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertiesPackage.eNS_URI, thePropertiesPackage);
		return thePropertiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWCET() {
		return wcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWCET_Wcet() {
		return (EReference)wcetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWCET_ResourceInstance() {
		return (EReference)wcetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredMemory() {
		return requiredMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredMemory_RequiredMemory() {
		return (EReference)requiredMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredMemory_ResourceInstance() {
		return (EReference)requiredMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduling() {
		return schedulingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduling_Deadline() {
		return (EReference)schedulingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduling_Period() {
		return (EReference)schedulingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduling_Priority() {
		return (EReference)schedulingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageFrame() {
		return messageFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFrame_Size() {
		return (EReference)messageFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFrame_Period() {
		return (EReference)messageFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCANMessageFrame() {
		return canMessageFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCANMessageFrame_Priority() {
		return (EReference)canMessageFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCANMessageFrame_Deadline() {
		return (EReference)canMessageFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactory getPropertiesFactory() {
		return (PropertiesFactory)getEFactoryInstance();
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
		wcetEClass = createEClass(WCET);
		createEReference(wcetEClass, WCET__WCET);
		createEReference(wcetEClass, WCET__RESOURCE_INSTANCE);

		requiredMemoryEClass = createEClass(REQUIRED_MEMORY);
		createEReference(requiredMemoryEClass, REQUIRED_MEMORY__REQUIRED_MEMORY);
		createEReference(requiredMemoryEClass, REQUIRED_MEMORY__RESOURCE_INSTANCE);

		schedulingEClass = createEClass(SCHEDULING);
		createEReference(schedulingEClass, SCHEDULING__DEADLINE);
		createEReference(schedulingEClass, SCHEDULING__PERIOD);
		createEReference(schedulingEClass, SCHEDULING__PRIORITY);

		messageFrameEClass = createEClass(MESSAGE_FRAME);
		createEReference(messageFrameEClass, MESSAGE_FRAME__SIZE);
		createEReference(messageFrameEClass, MESSAGE_FRAME__PERIOD);

		canMessageFrameEClass = createEClass(CAN_MESSAGE_FRAME);
		createEReference(canMessageFrameEClass, CAN_MESSAGE_FRAME__PRIORITY);
		createEReference(canMessageFrameEClass, CAN_MESSAGE_FRAME__DEADLINE);
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
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wcetEClass.getESuperTypes().add(theCorePackage.getExtension());
		requiredMemoryEClass.getESuperTypes().add(theCorePackage.getExtension());
		schedulingEClass.getESuperTypes().add(theCorePackage.getExtension());
		messageFrameEClass.getESuperTypes().add(theCorePackage.getExtension());
		canMessageFrameEClass.getESuperTypes().add(this.getMessageFrame());

		// Initialize classes, features, and operations; add parameters
		initEClass(wcetEClass, org.muml.psm.properties.WCET.class, "WCET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWCET_Wcet(), theValuetypePackage.getTimeValue(), null, "wcet", null, 1, 1, org.muml.psm.properties.WCET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWCET_ResourceInstance(), theHwresourceinstancePackage.getStructuredResourceInstance(), null, "resourceInstance", null, 0, 1, org.muml.psm.properties.WCET.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredMemoryEClass, RequiredMemory.class, "RequiredMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredMemory_RequiredMemory(), theHwvaluetypePackage.getDataSize(), null, "requiredMemory", null, 1, 1, RequiredMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredMemory_ResourceInstance(), theHwresourceinstancePackage.getStructuredResourceInstance(), null, "resourceInstance", null, 0, 1, RequiredMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingEClass, Scheduling.class, "Scheduling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduling_Deadline(), theValuetypePackage.getTimeValue(), null, "deadline", null, 1, 1, Scheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduling_Period(), theValuetypePackage.getTimeValue(), null, "period", null, 1, 1, Scheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduling_Priority(), theValuetypePackage.getNaturalNumber(), null, "priority", null, 0, 1, Scheduling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageFrameEClass, MessageFrame.class, "MessageFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageFrame_Size(), theHwvaluetypePackage.getDataSize(), null, "size", null, 1, 1, MessageFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageFrame_Period(), theValuetypePackage.getTimeValue(), null, "period", null, 1, 1, MessageFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canMessageFrameEClass, CANMessageFrame.class, "CANMessageFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCANMessageFrame_Priority(), theValuetypePackage.getNaturalNumber(), null, "priority", null, 1, 1, CANMessageFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCANMessageFrame_Deadline(), theValuetypePackage.getTimeValue(), null, "deadline", null, 1, 1, CANMessageFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PropertiesPackageImpl
