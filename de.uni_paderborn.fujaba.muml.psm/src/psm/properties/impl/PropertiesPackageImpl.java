/**
 */
package psm.properties.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import psm.allocation.AllocationPackage;
import psm.allocation.impl.AllocationPackageImpl;
import psm.properties.ComponentInstanceExecutionProperties;
import psm.properties.MemoryPair;
import psm.properties.PropertiesFactory;
import psm.properties.PropertiesPackage;
import psm.properties.WCETpair;

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
	 * @see psm.properties.PropertiesPackage#eNS_URI
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
		ResourcetypePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		PlatforminstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);

		// Create package meta-data objects
		thePropertiesPackage.createPackageContents();
		theAllocationPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();

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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);
		HwvaluetypePackage theHwvaluetypePackage = (HwvaluetypePackage)EPackage.Registry.INSTANCE.getEPackage(HwvaluetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInstanceExecutionPropertiesEClass, ComponentInstanceExecutionProperties.class, "ComponentInstanceExecutionProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceExecutionProperties_ComponentInstance(), theInstancePackage.getComponentInstance(), null, "componentInstance", null, 1, 1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceExecutionProperties_Wcet(), this.getWCETpair(), null, "wcet", null, 0, -1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceExecutionProperties_CodeMem(), this.getMemoryPair(), null, "codeMem", null, 0, -1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstanceExecutionProperties_RamMem(), this.getMemoryPair(), null, "ramMem", null, 0, -1, ComponentInstanceExecutionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wceTpairEClass, WCETpair.class, "WCETpair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWCETpair_Amount(), theValuetypePackage.getTimeValue(), null, "amount", null, 1, 1, WCETpair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWCETpair_Resource(), thePlatformPackage.getResourceInstance(), null, "resource", null, 1, 1, WCETpair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryPairEClass, MemoryPair.class, "MemoryPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryPair_Amount(), theHwvaluetypePackage.getDataSize(), null, "amount", null, 1, 1, MemoryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryPair_Resource(), thePlatformPackage.getResourceInstance(), null, "resource", null, 1, 1, MemoryPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PropertiesPackageImpl
