/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
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
			case TypesPackage.DATE_TYPE: return createDateType();
			case TypesPackage.BIT_STRING_TYPE: return createBitStringType();
			case TypesPackage.TIME_TYPE: return createTimeType();
			case TypesPackage.REAL_TYPE: return createRealType();
			case TypesPackage.SIGNED_INTEGER_TYPE: return createSignedIntegerType();
			case TypesPackage.UNSIGNED_INTEGER_TYPE: return createUnsignedIntegerType();
			case TypesPackage.ELEMENTARY_STRING_TYPE: return createElementaryStringType();
			case TypesPackage.ARRAY_TYPE_DECLARATION: return createArrayTypeDeclaration();
			case TypesPackage.STRUCTURE_TYPE_DECLARATION: return createStructureTypeDeclaration();
			case TypesPackage.STRING_TYPE_DECLARATION: return createStringTypeDeclaration();
			case TypesPackage.SIMPLE_TYPE_DECLARATION: return createSimpleTypeDeclaration();
			case TypesPackage.SUBRANGE_TYPE_DECLARATION: return createSubrangeTypeDeclaration();
			case TypesPackage.ENUMERATED_TYPE_DECLARATION: return createEnumeratedTypeDeclaration();
			case TypesPackage.SIMPLE_SPEC_INIT: return createSimpleSpecInit();
			case TypesPackage.SUBRANGE_SPEC_INIT: return createSubrangeSpecInit();
			case TypesPackage.SUBRANGE: return createSubrange();
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION: return createSubrangeTypeSpecification();
			case TypesPackage.ENUMERATED_SPEC_INIT: return createEnumeratedSpecInit();
			case TypesPackage.ENUMERATED_VALUE: return createEnumeratedValue();
			case TypesPackage.ENUMERATED_TYPE_SPECIFICATION: return createEnumeratedTypeSpecification();
			case TypesPackage.ARRAY_SPEC_INIT: return createArraySpecInit();
			case TypesPackage.ARRAY_INIT: return createArrayInit();
			case TypesPackage.ARRAY_TYPE_SPECIFICATION: return createArrayTypeSpecification();
			case TypesPackage.STRUCTURE_DECLARATION: return createStructureDeclaration();
			case TypesPackage.INITIALIZED_STRUCTURE: return createInitializedStructure();
			case TypesPackage.STRUCTURE_ELEMENT_DECLARATION: return createStructureElementDeclaration();
			case TypesPackage.STRUCTURE_INIT: return createStructureInit();
			case TypesPackage.STRUCTURE_ELEMENT_INIT: return createStructureElementInit();
			case TypesPackage.GENERIC_TYPE: return createGenericType();
			case TypesPackage.ARRAY_TYPE_REFERENCE: return createArrayTypeReference();
			case TypesPackage.SIMPLE_TYPE_REFERENCE: return createSimpleTypeReference();
			case TypesPackage.SUBRANGE_TYPE_REFERENCE: return createSubrangeTypeReference();
			case TypesPackage.ENUMERATED_TYPE_REFERENCE: return createEnumeratedTypeReference();
			case TypesPackage.STRUCTURE_POINTER: return createStructurePointer();
			case TypesPackage.ENUMERATED_VALUE_POINTER: return createEnumeratedValuePointer();
			case TypesPackage.HARDWARE_RESOURCE_TYPE_NAME: return createHardwareResourceTypeName();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.EDATE_TYPE:
				return createEDateTypeFromString(eDataType, initialValue);
			case TypesPackage.EELEMENTARY_STRING_TYPE:
				return createEElementaryStringTypeFromString(eDataType, initialValue);
			case TypesPackage.EBIT_STRING_TYPE:
				return createEBitStringTypeFromString(eDataType, initialValue);
			case TypesPackage.ESIGNED_INTEGER_TYPE:
				return createESignedIntegerTypeFromString(eDataType, initialValue);
			case TypesPackage.EUNSIGNED_INTEGER_TYPE:
				return createEUnsignedIntegerTypeFromString(eDataType, initialValue);
			case TypesPackage.EREAL_TYPE:
				return createERealTypeFromString(eDataType, initialValue);
			case TypesPackage.EGENERIC_TYPE:
				return createEGenericTypeFromString(eDataType, initialValue);
			case TypesPackage.ETIME_TYPE:
				return createETimeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.EDATE_TYPE:
				return convertEDateTypeToString(eDataType, instanceValue);
			case TypesPackage.EELEMENTARY_STRING_TYPE:
				return convertEElementaryStringTypeToString(eDataType, instanceValue);
			case TypesPackage.EBIT_STRING_TYPE:
				return convertEBitStringTypeToString(eDataType, instanceValue);
			case TypesPackage.ESIGNED_INTEGER_TYPE:
				return convertESignedIntegerTypeToString(eDataType, instanceValue);
			case TypesPackage.EUNSIGNED_INTEGER_TYPE:
				return convertEUnsignedIntegerTypeToString(eDataType, instanceValue);
			case TypesPackage.EREAL_TYPE:
				return convertERealTypeToString(eDataType, instanceValue);
			case TypesPackage.EGENERIC_TYPE:
				return convertEGenericTypeToString(eDataType, instanceValue);
			case TypesPackage.ETIME_TYPE:
				return convertETimeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitStringType createBitStringType() {
		BitStringTypeImpl bitStringType = new BitStringTypeImpl();
		return bitStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedIntegerType createSignedIntegerType() {
		SignedIntegerTypeImpl signedIntegerType = new SignedIntegerTypeImpl();
		return signedIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedIntegerType createUnsignedIntegerType() {
		UnsignedIntegerTypeImpl unsignedIntegerType = new UnsignedIntegerTypeImpl();
		return unsignedIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryStringType createElementaryStringType() {
		ElementaryStringTypeImpl elementaryStringType = new ElementaryStringTypeImpl();
		return elementaryStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeDeclaration createArrayTypeDeclaration() {
		ArrayTypeDeclarationImpl arrayTypeDeclaration = new ArrayTypeDeclarationImpl();
		return arrayTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeDeclaration createStructureTypeDeclaration() {
		StructureTypeDeclarationImpl structureTypeDeclaration = new StructureTypeDeclarationImpl();
		return structureTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTypeDeclaration createStringTypeDeclaration() {
		StringTypeDeclarationImpl stringTypeDeclaration = new StringTypeDeclarationImpl();
		return stringTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeDeclaration createSimpleTypeDeclaration() {
		SimpleTypeDeclarationImpl simpleTypeDeclaration = new SimpleTypeDeclarationImpl();
		return simpleTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTypeDeclaration createSubrangeTypeDeclaration() {
		SubrangeTypeDeclarationImpl subrangeTypeDeclaration = new SubrangeTypeDeclarationImpl();
		return subrangeTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedTypeDeclaration createEnumeratedTypeDeclaration() {
		EnumeratedTypeDeclarationImpl enumeratedTypeDeclaration = new EnumeratedTypeDeclarationImpl();
		return enumeratedTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSpecInit createSimpleSpecInit() {
		SimpleSpecInitImpl simpleSpecInit = new SimpleSpecInitImpl();
		return simpleSpecInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeSpecInit createSubrangeSpecInit() {
		SubrangeSpecInitImpl subrangeSpecInit = new SubrangeSpecInitImpl();
		return subrangeSpecInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subrange createSubrange() {
		SubrangeImpl subrange = new SubrangeImpl();
		return subrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTypeSpecification createSubrangeTypeSpecification() {
		SubrangeTypeSpecificationImpl subrangeTypeSpecification = new SubrangeTypeSpecificationImpl();
		return subrangeTypeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedSpecInit createEnumeratedSpecInit() {
		EnumeratedSpecInitImpl enumeratedSpecInit = new EnumeratedSpecInitImpl();
		return enumeratedSpecInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue createEnumeratedValue() {
		EnumeratedValueImpl enumeratedValue = new EnumeratedValueImpl();
		return enumeratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedTypeSpecification createEnumeratedTypeSpecification() {
		EnumeratedTypeSpecificationImpl enumeratedTypeSpecification = new EnumeratedTypeSpecificationImpl();
		return enumeratedTypeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySpecInit createArraySpecInit() {
		ArraySpecInitImpl arraySpecInit = new ArraySpecInitImpl();
		return arraySpecInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInit createArrayInit() {
		ArrayInitImpl arrayInit = new ArrayInitImpl();
		return arrayInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeSpecification createArrayTypeSpecification() {
		ArrayTypeSpecificationImpl arrayTypeSpecification = new ArrayTypeSpecificationImpl();
		return arrayTypeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDeclaration createStructureDeclaration() {
		StructureDeclarationImpl structureDeclaration = new StructureDeclarationImpl();
		return structureDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializedStructure createInitializedStructure() {
		InitializedStructureImpl initializedStructure = new InitializedStructureImpl();
		return initializedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElementDeclaration createStructureElementDeclaration() {
		StructureElementDeclarationImpl structureElementDeclaration = new StructureElementDeclarationImpl();
		return structureElementDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInit createStructureInit() {
		StructureInitImpl structureInit = new StructureInitImpl();
		return structureInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElementInit createStructureElementInit() {
		StructureElementInitImpl structureElementInit = new StructureElementInitImpl();
		return structureElementInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType createGenericType() {
		GenericTypeImpl genericType = new GenericTypeImpl();
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeReference createArrayTypeReference() {
		ArrayTypeReferenceImpl arrayTypeReference = new ArrayTypeReferenceImpl();
		return arrayTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeReference createSimpleTypeReference() {
		SimpleTypeReferenceImpl simpleTypeReference = new SimpleTypeReferenceImpl();
		return simpleTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTypeReference createSubrangeTypeReference() {
		SubrangeTypeReferenceImpl subrangeTypeReference = new SubrangeTypeReferenceImpl();
		return subrangeTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedTypeReference createEnumeratedTypeReference() {
		EnumeratedTypeReferenceImpl enumeratedTypeReference = new EnumeratedTypeReferenceImpl();
		return enumeratedTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurePointer createStructurePointer() {
		StructurePointerImpl structurePointer = new StructurePointerImpl();
		return structurePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValuePointer createEnumeratedValuePointer() {
		EnumeratedValuePointerImpl enumeratedValuePointer = new EnumeratedValuePointerImpl();
		return enumeratedValuePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareResourceTypeName createHardwareResourceTypeName() {
		HardwareResourceTypeNameImpl hardwareResourceTypeName = new HardwareResourceTypeNameImpl();
		return hardwareResourceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDateType createEDateTypeFromString(EDataType eDataType, String initialValue) {
		EDateType result = EDateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EElementaryStringType createEElementaryStringTypeFromString(EDataType eDataType, String initialValue) {
		EElementaryStringType result = EElementaryStringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEElementaryStringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBitStringType createEBitStringTypeFromString(EDataType eDataType, String initialValue) {
		EBitStringType result = EBitStringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBitStringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESignedIntegerType createESignedIntegerTypeFromString(EDataType eDataType, String initialValue) {
		ESignedIntegerType result = ESignedIntegerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESignedIntegerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUnsignedIntegerType createEUnsignedIntegerTypeFromString(EDataType eDataType, String initialValue) {
		EUnsignedIntegerType result = EUnsignedIntegerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEUnsignedIntegerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERealType createERealTypeFromString(EDataType eDataType, String initialValue) {
		ERealType result = ERealType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERealTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType createEGenericTypeFromString(EDataType eDataType, String initialValue) {
		EGenericType result = EGenericType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGenericTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETimeType createETimeTypeFromString(EDataType eDataType, String initialValue) {
		ETimeType result = ETimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
