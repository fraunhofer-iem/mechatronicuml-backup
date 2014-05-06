/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.allocation.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;

import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.AllocationFactory;
import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.AllocationPackage;
import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.CodGenAllocation;
import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.RefindedStructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.RefinedAtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.RefinedComponentInstance;

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
public class AllocationPackageImpl extends EPackageImpl implements AllocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedAtomicComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refindedStructuredResourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codGenAllocationEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.allocation.AllocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationPackageImpl() {
		super(eNS_URI, AllocationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AllocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationPackage init() {
		if (isInited) return (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Obtain or create and register package
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AllocationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HwplatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		HwplatforminstancePackage.eINSTANCE.eClass();
		HwresourcePackage.eINSTANCE.eClass();
		HwresourceinstancePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theAllocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAllocationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, theAllocationPackage);
		return theAllocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedComponentInstance() {
		return refinedComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedAtomicComponentInstance() {
		return refinedAtomicComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedAtomicComponentInstance_AllocatedResourceInstance() {
		return (EReference)refinedAtomicComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefindedStructuredResourceInstance() {
		return refindedStructuredResourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefindedStructuredResourceInstance_AllocatedAtomicComponentInstances() {
		return (EReference)refindedStructuredResourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefindedStructuredResourceInstance_AllocatedStructuredResourceInstance() {
		return (EReference)refindedStructuredResourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodGenAllocation() {
		return codGenAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodGenAllocation_AllResourceInstances() {
		return (EReference)codGenAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodGenAllocation_Cic() {
		return (EReference)codGenAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationFactory getAllocationFactory() {
		return (AllocationFactory)getEFactoryInstance();
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
		refinedComponentInstanceEClass = createEClass(REFINED_COMPONENT_INSTANCE);

		refinedAtomicComponentInstanceEClass = createEClass(REFINED_ATOMIC_COMPONENT_INSTANCE);
		createEReference(refinedAtomicComponentInstanceEClass, REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE);

		refindedStructuredResourceInstanceEClass = createEClass(REFINDED_STRUCTURED_RESOURCE_INSTANCE);
		createEReference(refindedStructuredResourceInstanceEClass, REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES);
		createEReference(refindedStructuredResourceInstanceEClass, REFINDED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_STRUCTURED_RESOURCE_INSTANCE);

		codGenAllocationEClass = createEClass(COD_GEN_ALLOCATION);
		createEReference(codGenAllocationEClass, COD_GEN_ALLOCATION__ALL_RESOURCE_INSTANCES);
		createEReference(codGenAllocationEClass, COD_GEN_ALLOCATION__CIC);
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
		HwresourceinstancePackage theHwresourceinstancePackage = (HwresourceinstancePackage)EPackage.Registry.INSTANCE.getEPackage(HwresourceinstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		refinedComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getComponentInstance());
		refinedAtomicComponentInstanceEClass.getESuperTypes().add(theInstancePackage.getAtomicComponentInstance());
		refindedStructuredResourceInstanceEClass.getESuperTypes().add(theHwresourceinstancePackage.getStructuredResourceInstance());

		// Initialize classes, features, and operations; add parameters
		initEClass(refinedComponentInstanceEClass, RefinedComponentInstance.class, "RefinedComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinedAtomicComponentInstanceEClass, RefinedAtomicComponentInstance.class, "RefinedAtomicComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinedAtomicComponentInstance_AllocatedResourceInstance(), this.getRefindedStructuredResourceInstance(), this.getRefindedStructuredResourceInstance_AllocatedAtomicComponentInstances(), "allocatedResourceInstance", null, 1, 1, RefinedAtomicComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refindedStructuredResourceInstanceEClass, RefindedStructuredResourceInstance.class, "RefindedStructuredResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefindedStructuredResourceInstance_AllocatedAtomicComponentInstances(), this.getRefinedAtomicComponentInstance(), this.getRefinedAtomicComponentInstance_AllocatedResourceInstance(), "allocatedAtomicComponentInstances", null, 0, -1, RefindedStructuredResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefindedStructuredResourceInstance_AllocatedStructuredResourceInstance(), theHwresourceinstancePackage.getStructuredResourceInstance(), null, "allocatedStructuredResourceInstance", null, 1, 1, RefindedStructuredResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codGenAllocationEClass, CodGenAllocation.class, "CodGenAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodGenAllocation_AllResourceInstances(), this.getRefindedStructuredResourceInstance(), null, "allResourceInstances", null, 0, -1, CodGenAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodGenAllocation_Cic(), theInstancePackage.getComponentInstanceConfiguration(), null, "cic", null, 1, 1, CodGenAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AllocationPackageImpl
