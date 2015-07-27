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
			case CodegenPackage.GEN_COMPONENT_INSTANCE: return createGenComponentInstance();
			case CodegenPackage.GEN_PORT_INSTANCE: return createGenPortInstance();
			case CodegenPackage.GEN_ECU: return createGenECU();
			case CodegenPackage.GEN_TASK: return createGenTask();
			case CodegenPackage.GEN_SYSTEM: return createGenSystem();
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
	public GenComponentInstance createGenComponentInstance() {
		GenComponentInstanceImpl genComponentInstance = new GenComponentInstanceImpl();
		return genComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPortInstance createGenPortInstance() {
		GenPortInstanceImpl genPortInstance = new GenPortInstanceImpl();
		return genPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenECU createGenECU() {
		GenECUImpl genECU = new GenECUImpl();
		return genECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTask createGenTask() {
		GenTaskImpl genTask = new GenTaskImpl();
		return genTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSystem createGenSystem() {
		GenSystemImpl genSystem = new GenSystemImpl();
		return genSystem;
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
