/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage
 * @generated
 */
public interface SpecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	SpecificationFactory eINSTANCE = de.uni_paderborn.fujaba.muml.testlanguage.specification.impl.SpecificationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Port Specification</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Port Specification</em>'.
	 * @generated
	 */
	PortSpecification createPortSpecification();

	/**
	 * Returns a new object of class '<em>Default</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Default</em>'.
	 * @generated
	 */
	Default createDefault();

	/**
	 * Returns a new object of class '<em>Load Model</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Load Model</em>'.
	 * @generated
	 */
	LoadModel createLoadModel();

	/**
	 * Returns a new object of class '<em>Compare Models</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Compare Models</em>'.
	 * @generated
	 */
	CompareModels createCompareModels();

	/**
	 * Returns a new object of class '<em>Validate Model</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Validate Model</em>'.
	 * @generated
	 */
	ValidateModel createValidateModel();

	/**
	 * Returns a new object of class '<em>Save Model</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Save Model</em>'.
	 * @generated
	 */
	SaveModel createSaveModel();

	/**
	 * Returns a new object of class '<em>Transformation</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Execute UPPAAL</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Execute UPPAAL</em>'.
	 * @generated
	 */
	ExecuteUPPAAL createExecuteUPPAAL();

	/**
	 * Returns a new object of class '<em>Primitive String</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Primitive String</em>'.
	 * @generated
	 */
	PrimitiveString createPrimitiveString();

	/**
	 * Returns a new object of class '<em>Assert Bool</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assert Bool</em>'.
	 * @generated
	 */
	AssertBool createAssertBool();

	/**
	 * Returns a new object of class '<em>Assert Diagnostic Trace</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assert Diagnostic Trace</em>'.
	 * @generated
	 */
	AssertDiagnosticTrace createAssertDiagnosticTrace();

	/**
	 * Returns a new object of class '<em>Assert Result</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assert Result</em>'.
	 * @generated
	 */
	AssertResult createAssertResult();

	/**
	 * Returns a new object of class '<em>Check MTCTL</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Check MTCTL</em>'.
	 * @generated
	 */
	CheckMTCTL createCheckMTCTL();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecificationPackage getSpecificationPackage();

} // SpecificationFactory
