/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Type</em>'.
	 * @generated
	 */
	DateType createDateType();

	/**
	 * Returns a new object of class '<em>Bit String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit String Type</em>'.
	 * @generated
	 */
	BitStringType createBitStringType();

	/**
	 * Returns a new object of class '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Type</em>'.
	 * @generated
	 */
	TimeType createTimeType();

	/**
	 * Returns a new object of class '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Type</em>'.
	 * @generated
	 */
	RealType createRealType();

	/**
	 * Returns a new object of class '<em>Signed Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signed Integer Type</em>'.
	 * @generated
	 */
	SignedIntegerType createSignedIntegerType();

	/**
	 * Returns a new object of class '<em>Unsigned Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Integer Type</em>'.
	 * @generated
	 */
	UnsignedIntegerType createUnsignedIntegerType();

	/**
	 * Returns a new object of class '<em>Elementary String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary String Type</em>'.
	 * @generated
	 */
	ElementaryStringType createElementaryStringType();

	/**
	 * Returns a new object of class '<em>Array Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Declaration</em>'.
	 * @generated
	 */
	ArrayTypeDeclaration createArrayTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Structure Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Type Declaration</em>'.
	 * @generated
	 */
	StructureTypeDeclaration createStructureTypeDeclaration();

	/**
	 * Returns a new object of class '<em>String Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type Declaration</em>'.
	 * @generated
	 */
	StringTypeDeclaration createStringTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Simple Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type Declaration</em>'.
	 * @generated
	 */
	SimpleTypeDeclaration createSimpleTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Subrange Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange Type Declaration</em>'.
	 * @generated
	 */
	SubrangeTypeDeclaration createSubrangeTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Enumerated Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Type Declaration</em>'.
	 * @generated
	 */
	EnumeratedTypeDeclaration createEnumeratedTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Simple Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Spec Init</em>'.
	 * @generated
	 */
	SimpleSpecInit createSimpleSpecInit();

	/**
	 * Returns a new object of class '<em>Subrange Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange Spec Init</em>'.
	 * @generated
	 */
	SubrangeSpecInit createSubrangeSpecInit();

	/**
	 * Returns a new object of class '<em>Subrange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange</em>'.
	 * @generated
	 */
	Subrange createSubrange();

	/**
	 * Returns a new object of class '<em>Subrange Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange Type Specification</em>'.
	 * @generated
	 */
	SubrangeTypeSpecification createSubrangeTypeSpecification();

	/**
	 * Returns a new object of class '<em>Enumerated Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Spec Init</em>'.
	 * @generated
	 */
	EnumeratedSpecInit createEnumeratedSpecInit();

	/**
	 * Returns a new object of class '<em>Enumerated Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Value</em>'.
	 * @generated
	 */
	EnumeratedValue createEnumeratedValue();

	/**
	 * Returns a new object of class '<em>Enumerated Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Type Specification</em>'.
	 * @generated
	 */
	EnumeratedTypeSpecification createEnumeratedTypeSpecification();

	/**
	 * Returns a new object of class '<em>Array Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Spec Init</em>'.
	 * @generated
	 */
	ArraySpecInit createArraySpecInit();

	/**
	 * Returns a new object of class '<em>Array Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Init</em>'.
	 * @generated
	 */
	ArrayInit createArrayInit();

	/**
	 * Returns a new object of class '<em>Array Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Specification</em>'.
	 * @generated
	 */
	ArrayTypeSpecification createArrayTypeSpecification();

	/**
	 * Returns a new object of class '<em>Structure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Declaration</em>'.
	 * @generated
	 */
	StructureDeclaration createStructureDeclaration();

	/**
	 * Returns a new object of class '<em>Initialized Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialized Structure</em>'.
	 * @generated
	 */
	InitializedStructure createInitializedStructure();

	/**
	 * Returns a new object of class '<em>Structure Element Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Element Declaration</em>'.
	 * @generated
	 */
	StructureElementDeclaration createStructureElementDeclaration();

	/**
	 * Returns a new object of class '<em>Structure Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Init</em>'.
	 * @generated
	 */
	StructureInit createStructureInit();

	/**
	 * Returns a new object of class '<em>Structure Element Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Element Init</em>'.
	 * @generated
	 */
	StructureElementInit createStructureElementInit();

	/**
	 * Returns a new object of class '<em>Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Type</em>'.
	 * @generated
	 */
	GenericType createGenericType();

	/**
	 * Returns a new object of class '<em>Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Reference</em>'.
	 * @generated
	 */
	ArrayTypeReference createArrayTypeReference();

	/**
	 * Returns a new object of class '<em>Simple Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type Reference</em>'.
	 * @generated
	 */
	SimpleTypeReference createSimpleTypeReference();

	/**
	 * Returns a new object of class '<em>Subrange Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange Type Reference</em>'.
	 * @generated
	 */
	SubrangeTypeReference createSubrangeTypeReference();

	/**
	 * Returns a new object of class '<em>Enumerated Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Type Reference</em>'.
	 * @generated
	 */
	EnumeratedTypeReference createEnumeratedTypeReference();

	/**
	 * Returns a new object of class '<em>Structure Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Pointer</em>'.
	 * @generated
	 */
	StructurePointer createStructurePointer();

	/**
	 * Returns a new object of class '<em>Enumerated Value Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Value Pointer</em>'.
	 * @generated
	 */
	EnumeratedValuePointer createEnumeratedValuePointer();

	/**
	 * Returns a new object of class '<em>Hardware Resource Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Resource Type Name</em>'.
	 * @generated
	 */
	HardwareResourceTypeName createHardwareResourceTypeName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
