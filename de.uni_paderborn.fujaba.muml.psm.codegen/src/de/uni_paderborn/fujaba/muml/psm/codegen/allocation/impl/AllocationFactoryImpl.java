/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.allocation.impl;

import de.uni_paderborn.fujaba.muml.psm.codegen.allocation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationFactoryImpl extends EFactoryImpl implements AllocationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllocationFactory init() {
		try {
			AllocationFactory theAllocationFactory = (AllocationFactory)EPackage.Registry.INSTANCE.getEFactory(AllocationPackage.eNS_URI);
			if (theAllocationFactory != null) {
				return theAllocationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AllocationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationFactoryImpl() {
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
			case AllocationPackage.REFINED_ATOMIC_COMPONENT_INSTANCE: return createRefinedAtomicComponentInstance();
			case AllocationPackage.REFINDED_STRUCTURED_RESOURCE_INSTANCE: return createRefindedStructuredResourceInstance();
			case AllocationPackage.COD_GEN_ALLOCATION: return createCodGenAllocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedAtomicComponentInstance createRefinedAtomicComponentInstance() {
		RefinedAtomicComponentInstanceImpl refinedAtomicComponentInstance = new RefinedAtomicComponentInstanceImpl();
		return refinedAtomicComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefindedStructuredResourceInstance createRefindedStructuredResourceInstance() {
		RefindedStructuredResourceInstanceImpl refindedStructuredResourceInstance = new RefindedStructuredResourceInstanceImpl();
		return refindedStructuredResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodGenAllocation createCodGenAllocation() {
		CodGenAllocationImpl codGenAllocation = new CodGenAllocationImpl();
		return codGenAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationPackage getAllocationPackage() {
		return (AllocationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AllocationPackage getPackage() {
		return AllocationPackage.eINSTANCE;
	}

} //AllocationFactoryImpl
