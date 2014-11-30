/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties.impl;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;

import de.uni_paderborn.fujaba.muml.psm.PsmPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.impl.AllocationPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.ApiexpressionsPackage;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.impl.PsmPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.psm.instance.impl.InstancePackageImpl;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingPackage;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.impl.PortapimappingPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties;
import de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair;
import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesFactory;
import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.muml.psm.properties.WCETpair;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.impl.RealtimestatechartPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl;

import de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass componentInstanceExecutionPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wceTpairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryPairEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#eNS_URI
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
		HwplatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		HwplatforminstancePackage.eINSTANCE.eClass();
		HwresourcePackage.eINSTANCE.eClass();
		HwresourceinstancePackage.eINSTANCE.eClass();
		SwplatformPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		RealtimestatechartPackageImpl theRealtimestatechartPackage = (RealtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) instanceof RealtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI) : RealtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) : RealtimestatechartparameterPackage.eINSTANCE);
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) : RealtimestatechartparameterbindingPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) : ApiexpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		thePropertiesPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		theRealtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterPackage.createPackageContents();
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();
		theApiexpressionsPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		theRealtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterPackage.initializePackageContents();
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
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
	public EClass getComponentInstanceExecutionProperties() {
		return componentInstanceExecutionPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceExecutionProperties_ComponentInstance() {
		return (EReference)componentInstanceExecutionPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceExecutionProperties_Wcet() {
		return (EReference)componentInstanceExecutionPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceExecutionProperties_CodeMem() {
		return (EReference)componentInstanceExecutionPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceExecutionProperties_RamMem() {
		return (EReference)componentInstanceExecutionPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWCETpair() {
		return wceTpairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWCETpair_Amount() {
		return (EReference)wceTpairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWCETpair_Resource() {
		return (EReference)wceTpairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryPair() {
		return memoryPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryPair_Amount() {
		return (EReference)memoryPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryPair_Resource() {
		return (EReference)memoryPairEClass.getEStructuralFeatures().get(1);
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
		componentInstanceExecutionPropertiesEClass = createEClass(COMPONENT_INSTANCE_EXECUTION_PROPERTIES);
		createEReference(componentInstanceExecutionPropertiesEClass, COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE);
		createEReference(componentInstanceExecutionPropertiesEClass, COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET);
		createEReference(componentInstanceExecutionPropertiesEClass, COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM);
		createEReference(componentInstanceExecutionPropertiesEClass, COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM);

		wceTpairEClass = createEClass(WCE_TPAIR);
		createEReference(wceTpairEClass, WCE_TPAIR__AMOUNT);
		createEReference(wceTpairEClass, WCE_TPAIR__RESOURCE);

		memoryPairEClass = createEClass(MEMORY_PAIR);
		createEReference(memoryPairEClass, MEMORY_PAIR__AMOUNT);
		createEReference(memoryPairEClass, MEMORY_PAIR__RESOURCE);
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
		de.uni_paderborn.fujaba.muml.instance.InstancePackage theInstancePackage_1 = (de.uni_paderborn.fujaba.muml.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(de.uni_paderborn.fujaba.muml.instance.InstancePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInstanceExecutionPropertiesEClass, ComponentInstanceExecutionProperties.class, "ComponentInstanceExecutionProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceExecutionProperties_ComponentInstance(), theInstancePackage_1.getComponentInstance(), null, "componentInstance", null, 1, 1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceExecutionProperties_Wcet(), this.getWCETpair(), null, "wcet", null, 0, -1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceExecutionProperties_CodeMem(), this.getMemoryPair(), null, "codeMem", null, 0, -1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceExecutionProperties_RamMem(), this.getMemoryPair(), null, "ramMem", null, 0, -1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wceTpairEClass, WCETpair.class, "WCETpair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWCETpair_Amount(), theValuetypePackage.getTimeValue(), null, "amount", null, 1, 1, WCETpair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWCETpair_Resource(), theHwresourceinstancePackage.getStructuredResourceInstance(), null, "resource", null, 1, 1, WCETpair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryPairEClass, MemoryPair.class, "MemoryPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryPair_Amount(), theHwvaluetypePackage.getDataSize(), null, "amount", null, 1, 1, MemoryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryPair_Resource(), theHwresourceinstancePackage.getStructuredResourceInstance(), null, "resource", null, 1, 1, MemoryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PropertiesPackageImpl
