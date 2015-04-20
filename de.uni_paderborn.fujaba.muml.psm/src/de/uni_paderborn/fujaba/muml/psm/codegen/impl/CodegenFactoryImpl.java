/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.psm.codegen.*;

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
public class CodegenFactoryImpl extends EFactoryImpl implements CodegenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodegenFactory init() {
		try {
			CodegenFactory theCodegenFactory = (CodegenFactory)EPackage.Registry.INSTANCE.getEFactory(CodegenPackage.eNS_URI);
			if (theCodegenFactory != null) {
				return theCodegenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodegenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenFactoryImpl() {
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE: return createRefinedAtomicComponentInstance();
			case CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE: return createRefinedStructuredResourceInstance();
			case CodegenPackage.CODE_GEN_ALLOCATION: return createCodeGenAllocation();
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
	public RefinedStructuredResourceInstance createRefinedStructuredResourceInstance() {
		RefinedStructuredResourceInstanceImpl refinedStructuredResourceInstance = new RefinedStructuredResourceInstanceImpl();
		return refinedStructuredResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGenAllocation createCodeGenAllocation() {
		CodeGenAllocationImpl codeGenAllocation = new CodeGenAllocationImpl();
		return codeGenAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenPackage getCodegenPackage() {
		return (CodegenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodegenPackage getPackage() {
		return CodegenPackage.eINSTANCE;
	}

} //CodegenFactoryImpl
