/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage
 * @generated
 */
public interface CodegenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodegenFactory eINSTANCE = de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Refined Atomic Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refined Atomic Component Instance</em>'.
	 * @generated
	 */
	RefinedAtomicComponentInstance createRefinedAtomicComponentInstance();

	/**
	 * Returns a new object of class '<em>Refinded Structured Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinded Structured Resource Instance</em>'.
	 * @generated
	 */
	RefindedStructuredResourceInstance createRefindedStructuredResourceInstance();

	/**
	 * Returns a new object of class '<em>Cod Gen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cod Gen</em>'.
	 * @generated
	 */
	CodGen createCodGen();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodegenPackage getCodegenPackage();

} //CodegenFactory
