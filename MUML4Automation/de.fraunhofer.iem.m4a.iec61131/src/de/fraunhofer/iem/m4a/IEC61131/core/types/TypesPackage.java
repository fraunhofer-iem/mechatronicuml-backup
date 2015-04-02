/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * contains standard types included in iec 61131. additionally individual defined data types called derived data types
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecificationImpl <em>Simple Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecificationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleSpecification()
	 * @generated
	 */
	int SIMPLE_SPECIFICATION = 19;

	/**
	 * The number of structural features of the '<em>Simple Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPECIFICATION_FEATURE_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPECIFICATION_OPERATION_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType <em>Elementary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getElementaryType()
	 * @generated
	 */
	int ELEMENTARY_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Elementary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TYPE_FEATURE_COUNT = SIMPLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elementary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TYPE_OPERATION_COUNT = SIMPLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = ELEMENTARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_OPERATION_COUNT = ELEMENTARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DateTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__NAME = ELEMENTARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = ELEMENTARY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = ELEMENTARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.BitStringTypeImpl <em>Bit String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.BitStringTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getBitStringType()
	 * @generated
	 */
	int BIT_STRING_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_TYPE__NAME = ELEMENTARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_TYPE_FEATURE_COUNT = ELEMENTARY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_TYPE_OPERATION_COUNT = ELEMENTARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TimeTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__NAME = ELEMENTARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_FEATURE_COUNT = ELEMENTARY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_OPERATION_COUNT = ELEMENTARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.RealTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__NAME = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SignedIntegerTypeImpl <em>Signed Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SignedIntegerTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSignedIntegerType()
	 * @generated
	 */
	int SIGNED_INTEGER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER_TYPE__NAME = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signed Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER_TYPE_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signed Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER_TYPE_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.UnsignedIntegerTypeImpl <em>Unsigned Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.UnsignedIntegerTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getUnsignedIntegerType()
	 * @generated
	 */
	int UNSIGNED_INTEGER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_TYPE__NAME = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unsigned Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_TYPE_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unsigned Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_TYPE_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ElementaryStringTypeImpl <em>Elementary String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ElementaryStringTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getElementaryStringType()
	 * @generated
	 */
	int ELEMENTARY_STRING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_STRING_TYPE__NAME = ELEMENTARY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elementary String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_STRING_TYPE_FEATURE_COUNT = ELEMENTARY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elementary String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_STRING_TYPE_OPERATION_COUNT = ELEMENTARY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DataTypeDeclarationImpl <em>Data Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DataTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getDataTypeDeclaration()
	 * @generated
	 */
	int DATA_TYPE_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECLARATION__IDENTIFIER = CorePackage.LIBRARY_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Data Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECLARATION_FEATURE_COUNT = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECLARATION_OPERATION_COUNT = CorePackage.LIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SingleElementTypeDeclarationImpl <em>Single Element Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SingleElementTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSingleElementTypeDeclaration()
	 * @generated
	 */
	int SINGLE_ELEMENT_TYPE_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_TYPE_DECLARATION__IDENTIFIER = DATA_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Single Element Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT = DATA_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Element Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_TYPE_DECLARATION_OPERATION_COUNT = DATA_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeDeclarationImpl <em>Array Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayTypeDeclaration()
	 * @generated
	 */
	int ARRAY_TYPE_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DECLARATION__IDENTIFIER = DATA_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DECLARATION__SPEC_INIT = DATA_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DECLARATION_FEATURE_COUNT = DATA_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DECLARATION_OPERATION_COUNT = DATA_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureTypeDeclarationImpl <em>Structure Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureTypeDeclaration()
	 * @generated
	 */
	int STRUCTURE_TYPE_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DECLARATION__IDENTIFIER = DATA_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DECLARATION__SPECIFICATION = DATA_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DECLARATION_FEATURE_COUNT = DATA_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DECLARATION_OPERATION_COUNT = DATA_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StringTypeDeclarationImpl <em>String Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StringTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStringTypeDeclaration()
	 * @generated
	 */
	int STRING_TYPE_DECLARATION = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_DECLARATION__IDENTIFIER = DATA_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_DECLARATION__LENGTH = DATA_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_DECLARATION__VALUE = DATA_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_DECLARATION__DOMAIN = DATA_TYPE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_DECLARATION_FEATURE_COUNT = DATA_TYPE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>String Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_DECLARATION_OPERATION_COUNT = DATA_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeDeclarationImpl <em>Simple Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleTypeDeclaration()
	 * @generated
	 */
	int SIMPLE_TYPE_DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_DECLARATION__IDENTIFIER = SINGLE_ELEMENT_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_DECLARATION__SPEC_INIT = SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_DECLARATION_FEATURE_COUNT = SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_DECLARATION_OPERATION_COUNT = SINGLE_ELEMENT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeDeclarationImpl <em>Subrange Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeTypeDeclaration()
	 * @generated
	 */
	int SUBRANGE_TYPE_DECLARATION = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DECLARATION__IDENTIFIER = SINGLE_ELEMENT_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DECLARATION__SPEC_INIT = SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subrange Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DECLARATION_FEATURE_COUNT = SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subrange Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_DECLARATION_OPERATION_COUNT = SINGLE_ELEMENT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeDeclarationImpl <em>Enumerated Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedTypeDeclaration()
	 * @generated
	 */
	int ENUMERATED_TYPE_DECLARATION = 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_DECLARATION__IDENTIFIER = SINGLE_ELEMENT_TYPE_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_DECLARATION__SPEC_INIT = SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_DECLARATION_FEATURE_COUNT = SINGLE_ELEMENT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_DECLARATION_OPERATION_COUNT = SINGLE_ELEMENT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain <em>Structure Element Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementDomain()
	 * @generated
	 */
	int STRUCTURE_ELEMENT_DOMAIN = 38;

	/**
	 * The number of structural features of the '<em>Structure Element Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Structure Element Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecInitImpl <em>Simple Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleSpecInit()
	 * @generated
	 */
	int SIMPLE_SPEC_INIT = 18;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPEC_INIT__SPECIFICATION = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPEC_INIT__VALUE = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPEC_INIT_FEATURE_COUNT = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SPEC_INIT_OPERATION_COUNT = STRUCTURE_ELEMENT_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeSpecInitImpl <em>Subrange Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeSpecInit()
	 * @generated
	 */
	int SUBRANGE_SPEC_INIT = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SPEC_INIT__VALUE = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SPEC_INIT__SPECIFICATION = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subrange Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SPEC_INIT_FEATURE_COUNT = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subrange Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SPEC_INIT_OPERATION_COUNT = STRUCTURE_ELEMENT_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeImpl <em>Subrange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrange()
	 * @generated
	 */
	int SUBRANGE = 21;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Subrange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subrange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification <em>Subrange Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeSpecification()
	 * @generated
	 */
	int SUBRANGE_SPECIFICATION = 22;

	/**
	 * The number of structural features of the '<em>Subrange Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SPECIFICATION_FEATURE_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subrange Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SPECIFICATION_OPERATION_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeSpecificationImpl <em>Subrange Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeSpecificationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeTypeSpecification()
	 * @generated
	 */
	int SUBRANGE_TYPE_SPECIFICATION = 23;

	/**
	 * The feature id for the '<em><b>Integer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE = SUBRANGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_SPECIFICATION__RANGE = SUBRANGE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subrange Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_SPECIFICATION_FEATURE_COUNT = SUBRANGE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subrange Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_SPECIFICATION_OPERATION_COUNT = SUBRANGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedSpecInitImpl <em>Enumerated Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedSpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedSpecInit()
	 * @generated
	 */
	int ENUMERATED_SPEC_INIT = 24;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_SPEC_INIT__SPECIFICATION = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_SPEC_INIT__INITIALIZATION = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerated Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_SPEC_INIT_FEATURE_COUNT = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumerated Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_SPEC_INIT_OPERATION_COUNT = STRUCTURE_ELEMENT_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification <em>Enumerated Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedSpecification()
	 * @generated
	 */
	int ENUMERATED_SPECIFICATION = 25;

	/**
	 * The number of structural features of the '<em>Enumerated Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_SPECIFICATION_FEATURE_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumerated Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_SPECIFICATION_OPERATION_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValueImpl <em>Enumerated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValueImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedValue()
	 * @generated
	 */
	int ENUMERATED_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE__SCOPE = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeSpecificationImpl <em>Enumerated Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeSpecificationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedTypeSpecification()
	 * @generated
	 */
	int ENUMERATED_TYPE_SPECIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Value List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST = ENUMERATED_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_SPECIFICATION_FEATURE_COUNT = ENUMERATED_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_SPECIFICATION_OPERATION_COUNT = ENUMERATED_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArraySpecInitImpl <em>Array Spec Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArraySpecInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArraySpecInit()
	 * @generated
	 */
	int ARRAY_SPEC_INIT = 28;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPEC_INIT__SPECIFICATION = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPEC_INIT__INITIALIZATION = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPEC_INIT_FEATURE_COUNT = STRUCTURE_ELEMENT_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Spec Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPEC_INIT_OPERATION_COUNT = STRUCTURE_ELEMENT_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification <em>Array Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArraySpecification()
	 * @generated
	 */
	int ARRAY_SPECIFICATION = 29;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPECIFICATION__VARIABLE_NAME = DeclarationsPackage.ARRAY_STRUCT_VAR_SPEC__VARIABLE_NAME;

	/**
	 * The number of structural features of the '<em>Array Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPECIFICATION_FEATURE_COUNT = DeclarationsPackage.ARRAY_STRUCT_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Array Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SPECIFICATION_OPERATION_COUNT = DeclarationsPackage.ARRAY_STRUCT_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement <em>Array Init Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayInitElement()
	 * @generated
	 */
	int ARRAY_INIT_ELEMENT = 32;

	/**
	 * The number of structural features of the '<em>Array Init Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INIT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Array Init Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INIT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayInitImpl <em>Array Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayInit()
	 * @generated
	 */
	int ARRAY_INIT = 30;

	/**
	 * The feature id for the '<em><b>Init Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INIT__INIT_ELEMENTS = ARRAY_INIT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INIT_FEATURE_COUNT = ARRAY_INIT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INIT_OPERATION_COUNT = ARRAY_INIT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeSpecificationImpl <em>Array Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeSpecificationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayTypeSpecification()
	 * @generated
	 */
	int ARRAY_TYPE_SPECIFICATION = 31;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFICATION__VARIABLE_NAME = ARRAY_SPECIFICATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFICATION__RANGES = ARRAY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Of Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFICATION__OF_TYPE = ARRAY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFICATION_FEATURE_COUNT = ARRAY_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_SPECIFICATION_OPERATION_COUNT = ARRAY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification <em>Structure Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureSpecification()
	 * @generated
	 */
	int STRUCTURE_SPECIFICATION = 33;

	/**
	 * The number of structural features of the '<em>Structure Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Structure Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureDeclarationImpl <em>Structure Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureDeclaration()
	 * @generated
	 */
	int STRUCTURE_DECLARATION = 34;

	/**
	 * The feature id for the '<em><b>Decl Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DECLARATION__DECL_ELEMENTS = STRUCTURE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DECLARATION_FEATURE_COUNT = STRUCTURE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DECLARATION_OPERATION_COUNT = STRUCTURE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.InitializedStructureImpl <em>Initialized Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.InitializedStructureImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getInitializedStructure()
	 * @generated
	 */
	int INITIALIZED_STRUCTURE = 35;

	/**
	 * The feature id for the '<em><b>Defined Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZED_STRUCTURE__DEFINED_STRUCTURE = STRUCTURE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZED_STRUCTURE__INIT = STRUCTURE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initialized Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZED_STRUCTURE_FEATURE_COUNT = STRUCTURE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Initialized Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZED_STRUCTURE_OPERATION_COUNT = STRUCTURE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementDeclarationImpl <em>Structure Element Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementDeclaration()
	 * @generated
	 */
	int STRUCTURE_ELEMENT_DECLARATION = 36;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_DECLARATION__IDENTIFIER = LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_DECLARATION__DOMAIN = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Element Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_DECLARATION_FEATURE_COUNT = LiteralsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Element Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_DECLARATION_OPERATION_COUNT = LiteralsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue <em>Structure Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementValue()
	 * @generated
	 */
	int STRUCTURE_ELEMENT_VALUE = 40;

	/**
	 * The number of structural features of the '<em>Structure Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Structure Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureInitImpl <em>Structure Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureInit()
	 * @generated
	 */
	int STRUCTURE_INIT = 37;

	/**
	 * The feature id for the '<em><b>Element Init</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INIT__ELEMENT_INIT = STRUCTURE_ELEMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INIT_FEATURE_COUNT = STRUCTURE_ELEMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INIT_OPERATION_COUNT = STRUCTURE_ELEMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementInitImpl <em>Structure Element Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementInitImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementInit()
	 * @generated
	 */
	int STRUCTURE_ELEMENT_INIT = 39;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_INIT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_INIT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Structure Element Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_INIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Structure Element Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DataType <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DataType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 41;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CorePackage.LIBRARY_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CorePackage.LIBRARY_ELEMENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType <em>Non Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getNonGenericType()
	 * @generated
	 */
	int NON_GENERIC_TYPE = 42;

	/**
	 * The number of structural features of the '<em>Non Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GENERIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_GENERIC_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.GenericTypeImpl <em>Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.GenericTypeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getGenericType()
	 * @generated
	 */
	int GENERIC_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeReferenceImpl <em>Array Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayTypeReference()
	 * @generated
	 */
	int ARRAY_TYPE_REFERENCE = 44;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__VARIABLE_NAME = ARRAY_SPECIFICATION__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Array Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE__ARRAY_TYPE = ARRAY_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE_FEATURE_COUNT = ARRAY_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REFERENCE_OPERATION_COUNT = ARRAY_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeReferenceImpl <em>Simple Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleTypeReference()
	 * @generated
	 */
	int SIMPLE_TYPE_REFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE = SIMPLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE_FEATURE_COUNT = SIMPLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_REFERENCE_OPERATION_COUNT = SIMPLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeReferenceImpl <em>Subrange Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeTypeReference()
	 * @generated
	 */
	int SUBRANGE_TYPE_REFERENCE = 46;

	/**
	 * The feature id for the '<em><b>Subrange Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE = SUBRANGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subrange Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_REFERENCE_FEATURE_COUNT = SUBRANGE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subrange Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_TYPE_REFERENCE_OPERATION_COUNT = SUBRANGE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeReferenceImpl <em>Enumerated Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeReferenceImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedTypeReference()
	 * @generated
	 */
	int ENUMERATED_TYPE_REFERENCE = 47;

	/**
	 * The feature id for the '<em><b>Enumerated Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE = ENUMERATED_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_REFERENCE_FEATURE_COUNT = ENUMERATED_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_TYPE_REFERENCE_OPERATION_COUNT = ENUMERATED_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructurePointerImpl <em>Structure Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructurePointerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructurePointer()
	 * @generated
	 */
	int STRUCTURE_POINTER = 48;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_POINTER__VARIABLE_NAME = DeclarationsPackage.SHARED_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_POINTER__STRUCTURE_TYPE = DeclarationsPackage.SHARED_VAR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_POINTER_FEATURE_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_POINTER_OPERATION_COUNT = DeclarationsPackage.SHARED_VAR_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValuePointerImpl <em>Enumerated Value Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValuePointerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedValuePointer()
	 * @generated
	 */
	int ENUMERATED_VALUE_POINTER = 49;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_POINTER__ENUM_VALUE = ARRAY_INIT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Value Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_POINTER_FEATURE_COUNT = ARRAY_INIT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Value Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_POINTER_OPERATION_COUNT = ARRAY_INIT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.HardwareResourceTypeNameImpl <em>Hardware Resource Type Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.HardwareResourceTypeNameImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getHardwareResourceTypeName()
	 * @generated
	 */
	int HARDWARE_RESOURCE_TYPE_NAME = 50;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_TYPE_NAME__IDENTIFIER = CorePackage.LIBRARY_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Resource Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_TYPE_NAME_FEATURE_COUNT = CorePackage.LIBRARY_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Resource Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_RESOURCE_TYPE_NAME_OPERATION_COUNT = CorePackage.LIBRARY_ELEMENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType <em>EDate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEDateType()
	 * @generated
	 */
	int EDATE_TYPE = 51;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType <em>EElementary String Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEElementaryStringType()
	 * @generated
	 */
	int EELEMENTARY_STRING_TYPE = 52;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType <em>EBit String Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEBitStringType()
	 * @generated
	 */
	int EBIT_STRING_TYPE = 53;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType <em>ESigned Integer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getESignedIntegerType()
	 * @generated
	 */
	int ESIGNED_INTEGER_TYPE = 54;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType <em>EUnsigned Integer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEUnsignedIntegerType()
	 * @generated
	 */
	int EUNSIGNED_INTEGER_TYPE = 55;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType <em>EReal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getERealType()
	 * @generated
	 */
	int EREAL_TYPE = 56;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType <em>EGeneric Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEGenericType()
	 * @generated
	 */
	int EGENERIC_TYPE = 57;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType <em>ETime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getETimeType()
	 * @generated
	 */
	int ETIME_TYPE = 58;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType <em>Elementary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType
	 * @generated
	 */
	EClass getElementaryType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DateType#getName()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType <em>Bit String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit String Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType
	 * @generated
	 */
	EClass getBitStringType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.BitStringType#getName()
	 * @see #getBitStringType()
	 * @generated
	 */
	EAttribute getBitStringType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType
	 * @generated
	 */
	EClass getTimeType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TimeType#getName()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.RealType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.RealType#getName()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType <em>Signed Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Integer Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType
	 * @generated
	 */
	EClass getSignedIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SignedIntegerType#getName()
	 * @see #getSignedIntegerType()
	 * @generated
	 */
	EAttribute getSignedIntegerType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType <em>Unsigned Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Integer Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType
	 * @generated
	 */
	EClass getUnsignedIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.UnsignedIntegerType#getName()
	 * @see #getUnsignedIntegerType()
	 * @generated
	 */
	EAttribute getUnsignedIntegerType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType <em>Elementary String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary String Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType
	 * @generated
	 */
	EClass getElementaryStringType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryStringType#getName()
	 * @see #getElementaryStringType()
	 * @generated
	 */
	EAttribute getElementaryStringType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DataTypeDeclaration <em>Data Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DataTypeDeclaration
	 * @generated
	 */
	EClass getDataTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SingleElementTypeDeclaration <em>Single Element Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SingleElementTypeDeclaration
	 * @generated
	 */
	EClass getSingleElementTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration <em>Array Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration
	 * @generated
	 */
	EClass getArrayTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration#getSpecInit()
	 * @see #getArrayTypeDeclaration()
	 * @generated
	 */
	EReference getArrayTypeDeclaration_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration <em>Structure Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration
	 * @generated
	 */
	EClass getStructureTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration#getSpecification()
	 * @see #getStructureTypeDeclaration()
	 * @generated
	 */
	EReference getStructureTypeDeclaration_Specification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration <em>String Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration
	 * @generated
	 */
	EClass getStringTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getLength()
	 * @see #getStringTypeDeclaration()
	 * @generated
	 */
	EReference getStringTypeDeclaration_Length();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getValue()
	 * @see #getStringTypeDeclaration()
	 * @generated
	 */
	EReference getStringTypeDeclaration_Value();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StringTypeDeclaration#getDomain()
	 * @see #getStringTypeDeclaration()
	 * @generated
	 */
	EReference getStringTypeDeclaration_Domain();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration <em>Simple Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration
	 * @generated
	 */
	EClass getSimpleTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration#getSpecInit()
	 * @see #getSimpleTypeDeclaration()
	 * @generated
	 */
	EReference getSimpleTypeDeclaration_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration <em>Subrange Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration
	 * @generated
	 */
	EClass getSubrangeTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration#getSpecInit()
	 * @see #getSubrangeTypeDeclaration()
	 * @generated
	 */
	EReference getSubrangeTypeDeclaration_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration <em>Enumerated Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Type Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration
	 * @generated
	 */
	EClass getEnumeratedTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration#getSpecInit <em>Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration#getSpecInit()
	 * @see #getEnumeratedTypeDeclaration()
	 * @generated
	 */
	EReference getEnumeratedTypeDeclaration_SpecInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit <em>Simple Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit
	 * @generated
	 */
	EClass getSimpleSpecInit();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getSpecification()
	 * @see #getSimpleSpecInit()
	 * @generated
	 */
	EReference getSimpleSpecInit_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecInit#getValue()
	 * @see #getSimpleSpecInit()
	 * @generated
	 */
	EReference getSimpleSpecInit_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecification <em>Simple Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleSpecification
	 * @generated
	 */
	EClass getSimpleSpecification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit <em>Subrange Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit
	 * @generated
	 */
	EClass getSubrangeSpecInit();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getValue()
	 * @see #getSubrangeSpecInit()
	 * @generated
	 */
	EReference getSubrangeSpecInit_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecInit#getSpecification()
	 * @see #getSubrangeSpecInit()
	 * @generated
	 */
	EReference getSubrangeSpecInit_Specification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange
	 * @generated
	 */
	EClass getSubrange();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getLowerBound()
	 * @see #getSubrange()
	 * @generated
	 */
	EReference getSubrange_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange#getUpperBound()
	 * @see #getSubrange()
	 * @generated
	 */
	EReference getSubrange_UpperBound();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification <em>Subrange Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification
	 * @generated
	 */
	EClass getSubrangeSpecification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification <em>Subrange Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Type Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification
	 * @generated
	 */
	EClass getSubrangeTypeSpecification();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getIntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Integer Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getIntegerType()
	 * @see #getSubrangeTypeSpecification()
	 * @generated
	 */
	EReference getSubrangeTypeSpecification_IntegerType();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getRange()
	 * @see #getSubrangeTypeSpecification()
	 * @generated
	 */
	EReference getSubrangeTypeSpecification_Range();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit <em>Enumerated Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit
	 * @generated
	 */
	EClass getEnumeratedSpecInit();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getSpecification()
	 * @see #getEnumeratedSpecInit()
	 * @generated
	 */
	EReference getEnumeratedSpecInit_Specification();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialization</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit#getInitialization()
	 * @see #getEnumeratedSpecInit()
	 * @generated
	 */
	EReference getEnumeratedSpecInit_Initialization();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification <em>Enumerated Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification
	 * @generated
	 */
	EClass getEnumeratedSpecification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue <em>Enumerated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue
	 * @generated
	 */
	EClass getEnumeratedValue();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue#getScope()
	 * @see #getEnumeratedValue()
	 * @generated
	 */
	EReference getEnumeratedValue_Scope();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification <em>Enumerated Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Type Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification
	 * @generated
	 */
	EClass getEnumeratedTypeSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification#getValueList <em>Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value List</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeSpecification#getValueList()
	 * @see #getEnumeratedTypeSpecification()
	 * @generated
	 */
	EReference getEnumeratedTypeSpecification_ValueList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit <em>Array Spec Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Spec Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit
	 * @generated
	 */
	EClass getArraySpecInit();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getSpecification()
	 * @see #getArraySpecInit()
	 * @generated
	 */
	EReference getArraySpecInit_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecInit#getInitialization()
	 * @see #getArraySpecInit()
	 * @generated
	 */
	EReference getArraySpecInit_Initialization();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification <em>Array Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification
	 * @generated
	 */
	EClass getArraySpecification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit <em>Array Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit
	 * @generated
	 */
	EClass getArrayInit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit#getInitElements <em>Init Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Elements</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit#getInitElements()
	 * @see #getArrayInit()
	 * @generated
	 */
	EReference getArrayInit_InitElements();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification <em>Array Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification
	 * @generated
	 */
	EClass getArrayTypeSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ranges</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getRanges()
	 * @see #getArrayTypeSpecification()
	 * @generated
	 */
	EReference getArrayTypeSpecification_Ranges();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getOfType <em>Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification#getOfType()
	 * @see #getArrayTypeSpecification()
	 * @generated
	 */
	EReference getArrayTypeSpecification_OfType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement <em>Array Init Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Init Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement
	 * @generated
	 */
	EClass getArrayInitElement();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification <em>Structure Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Specification</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification
	 * @generated
	 */
	EClass getStructureSpecification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration <em>Structure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration
	 * @generated
	 */
	EClass getStructureDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration#getDeclElements <em>Decl Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decl Elements</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration#getDeclElements()
	 * @see #getStructureDeclaration()
	 * @generated
	 */
	EReference getStructureDeclaration_DeclElements();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure <em>Initialized Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialized Structure</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure
	 * @generated
	 */
	EClass getInitializedStructure();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getDefinedStructure <em>Defined Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined Structure</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getDefinedStructure()
	 * @see #getInitializedStructure()
	 * @generated
	 */
	EReference getInitializedStructure_DefinedStructure();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure#getInit()
	 * @see #getInitializedStructure()
	 * @generated
	 */
	EReference getInitializedStructure_Init();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration <em>Structure Element Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration
	 * @generated
	 */
	EClass getStructureElementDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration#getDomain()
	 * @see #getStructureElementDeclaration()
	 * @generated
	 */
	EReference getStructureElementDeclaration_Domain();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit <em>Structure Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit
	 * @generated
	 */
	EClass getStructureInit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit#getElementInit <em>Element Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit#getElementInit()
	 * @see #getStructureInit()
	 * @generated
	 */
	EReference getStructureInit_ElementInit();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain <em>Structure Element Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element Domain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain
	 * @generated
	 */
	EClass getStructureElementDomain();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit <em>Structure Element Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element Init</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit
	 * @generated
	 */
	EClass getStructureElementInit();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getElement()
	 * @see #getStructureElementInit()
	 * @generated
	 */
	EReference getStructureElementInit_Element();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getValue()
	 * @see #getStructureElementInit()
	 * @generated
	 */
	EReference getStructureElementInit_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue <em>Structure Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue
	 * @generated
	 */
	EClass getStructureElementValue();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType <em>Non Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Generic Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType
	 * @generated
	 */
	EClass getNonGenericType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType
	 * @generated
	 */
	EClass getGenericType();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.GenericType#getName()
	 * @see #getGenericType()
	 * @generated
	 */
	EAttribute getGenericType_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference <em>Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference
	 * @generated
	 */
	EClass getArrayTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference#getArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference#getArrayType()
	 * @see #getArrayTypeReference()
	 * @generated
	 */
	EReference getArrayTypeReference_ArrayType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference <em>Simple Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference
	 * @generated
	 */
	EClass getSimpleTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference#getSimpleType()
	 * @see #getSimpleTypeReference()
	 * @generated
	 */
	EReference getSimpleTypeReference_SimpleType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference <em>Subrange Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Type Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference
	 * @generated
	 */
	EClass getSubrangeTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference#getSubrangeType <em>Subrange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subrange Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference#getSubrangeType()
	 * @see #getSubrangeTypeReference()
	 * @generated
	 */
	EReference getSubrangeTypeReference_SubrangeType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference <em>Enumerated Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Type Reference</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference
	 * @generated
	 */
	EClass getEnumeratedTypeReference();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference#getEnumeratedType <em>Enumerated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumerated Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference#getEnumeratedType()
	 * @see #getEnumeratedTypeReference()
	 * @generated
	 */
	EReference getEnumeratedTypeReference_EnumeratedType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer <em>Structure Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Pointer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer
	 * @generated
	 */
	EClass getStructurePointer();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer#getStructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructurePointer#getStructureType()
	 * @see #getStructurePointer()
	 * @generated
	 */
	EReference getStructurePointer_StructureType();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer <em>Enumerated Value Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Value Pointer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer
	 * @generated
	 */
	EClass getEnumeratedValuePointer();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer#getEnumValue()
	 * @see #getEnumeratedValuePointer()
	 * @generated
	 */
	EReference getEnumeratedValuePointer_EnumValue();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.HardwareResourceTypeName <em>Hardware Resource Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Resource Type Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.HardwareResourceTypeName
	 * @generated
	 */
	EClass getHardwareResourceTypeName();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType <em>EDate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDate Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType
	 * @generated
	 */
	EEnum getEDateType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType <em>EElementary String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EElementary String Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType
	 * @generated
	 */
	EEnum getEElementaryStringType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType <em>EBit String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EBit String Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType
	 * @generated
	 */
	EEnum getEBitStringType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType <em>ESigned Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESigned Integer Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType
	 * @generated
	 */
	EEnum getESignedIntegerType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType <em>EUnsigned Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EUnsigned Integer Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType
	 * @generated
	 */
	EEnum getEUnsignedIntegerType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType <em>EReal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EReal Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType
	 * @generated
	 */
	EEnum getERealType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGeneric Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType
	 * @generated
	 */
	EEnum getEGenericType();

	/**
	 * Returns the meta object for enum '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType <em>ETime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETime Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType
	 * @generated
	 */
	EEnum getETimeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType <em>Elementary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ElementaryType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getElementaryType()
		 * @generated
		 */
		EClass ELEMENTARY_TYPE = eINSTANCE.getElementaryType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NumericType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DateTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TYPE__NAME = eINSTANCE.getDateType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.BitStringTypeImpl <em>Bit String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.BitStringTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getBitStringType()
		 * @generated
		 */
		EClass BIT_STRING_TYPE = eINSTANCE.getBitStringType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_STRING_TYPE__NAME = eINSTANCE.getBitStringType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TimeTypeImpl <em>Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TimeTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getTimeType()
		 * @generated
		 */
		EClass TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TYPE__NAME = eINSTANCE.getTimeType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.RealTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__NAME = eINSTANCE.getRealType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SignedIntegerTypeImpl <em>Signed Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SignedIntegerTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSignedIntegerType()
		 * @generated
		 */
		EClass SIGNED_INTEGER_TYPE = eINSTANCE.getSignedIntegerType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNED_INTEGER_TYPE__NAME = eINSTANCE.getSignedIntegerType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.UnsignedIntegerTypeImpl <em>Unsigned Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.UnsignedIntegerTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getUnsignedIntegerType()
		 * @generated
		 */
		EClass UNSIGNED_INTEGER_TYPE = eINSTANCE.getUnsignedIntegerType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSIGNED_INTEGER_TYPE__NAME = eINSTANCE.getUnsignedIntegerType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ElementaryStringTypeImpl <em>Elementary String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ElementaryStringTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getElementaryStringType()
		 * @generated
		 */
		EClass ELEMENTARY_STRING_TYPE = eINSTANCE.getElementaryStringType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_STRING_TYPE__NAME = eINSTANCE.getElementaryStringType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DataTypeDeclarationImpl <em>Data Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.DataTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getDataTypeDeclaration()
		 * @generated
		 */
		EClass DATA_TYPE_DECLARATION = eINSTANCE.getDataTypeDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SingleElementTypeDeclarationImpl <em>Single Element Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SingleElementTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSingleElementTypeDeclaration()
		 * @generated
		 */
		EClass SINGLE_ELEMENT_TYPE_DECLARATION = eINSTANCE.getSingleElementTypeDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeDeclarationImpl <em>Array Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayTypeDeclaration()
		 * @generated
		 */
		EClass ARRAY_TYPE_DECLARATION = eINSTANCE.getArrayTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_DECLARATION__SPEC_INIT = eINSTANCE.getArrayTypeDeclaration_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureTypeDeclarationImpl <em>Structure Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureTypeDeclaration()
		 * @generated
		 */
		EClass STRUCTURE_TYPE_DECLARATION = eINSTANCE.getStructureTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_TYPE_DECLARATION__SPECIFICATION = eINSTANCE.getStructureTypeDeclaration_Specification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StringTypeDeclarationImpl <em>String Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StringTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStringTypeDeclaration()
		 * @generated
		 */
		EClass STRING_TYPE_DECLARATION = eINSTANCE.getStringTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TYPE_DECLARATION__LENGTH = eINSTANCE.getStringTypeDeclaration_Length();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TYPE_DECLARATION__VALUE = eINSTANCE.getStringTypeDeclaration_Value();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TYPE_DECLARATION__DOMAIN = eINSTANCE.getStringTypeDeclaration_Domain();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeDeclarationImpl <em>Simple Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleTypeDeclaration()
		 * @generated
		 */
		EClass SIMPLE_TYPE_DECLARATION = eINSTANCE.getSimpleTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TYPE_DECLARATION__SPEC_INIT = eINSTANCE.getSimpleTypeDeclaration_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeDeclarationImpl <em>Subrange Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeTypeDeclaration()
		 * @generated
		 */
		EClass SUBRANGE_TYPE_DECLARATION = eINSTANCE.getSubrangeTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_TYPE_DECLARATION__SPEC_INIT = eINSTANCE.getSubrangeTypeDeclaration_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeDeclarationImpl <em>Enumerated Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedTypeDeclaration()
		 * @generated
		 */
		EClass ENUMERATED_TYPE_DECLARATION = eINSTANCE.getEnumeratedTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Spec Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE_DECLARATION__SPEC_INIT = eINSTANCE.getEnumeratedTypeDeclaration_SpecInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecInitImpl <em>Simple Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleSpecInit()
		 * @generated
		 */
		EClass SIMPLE_SPEC_INIT = eINSTANCE.getSimpleSpecInit();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SPEC_INIT__SPECIFICATION = eINSTANCE.getSimpleSpecInit_Specification();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SPEC_INIT__VALUE = eINSTANCE.getSimpleSpecInit_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecificationImpl <em>Simple Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleSpecificationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleSpecification()
		 * @generated
		 */
		EClass SIMPLE_SPECIFICATION = eINSTANCE.getSimpleSpecification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeSpecInitImpl <em>Subrange Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeSpecInit()
		 * @generated
		 */
		EClass SUBRANGE_SPEC_INIT = eINSTANCE.getSubrangeSpecInit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_SPEC_INIT__VALUE = eINSTANCE.getSubrangeSpecInit_Value();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_SPEC_INIT__SPECIFICATION = eINSTANCE.getSubrangeSpecInit_Specification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeImpl <em>Subrange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrange()
		 * @generated
		 */
		EClass SUBRANGE = eINSTANCE.getSubrange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE__LOWER_BOUND = eINSTANCE.getSubrange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE__UPPER_BOUND = eINSTANCE.getSubrange_UpperBound();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification <em>Subrange Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeSpecification
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeSpecification()
		 * @generated
		 */
		EClass SUBRANGE_SPECIFICATION = eINSTANCE.getSubrangeSpecification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeSpecificationImpl <em>Subrange Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeSpecificationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeTypeSpecification()
		 * @generated
		 */
		EClass SUBRANGE_TYPE_SPECIFICATION = eINSTANCE.getSubrangeTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Integer Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE = eINSTANCE.getSubrangeTypeSpecification_IntegerType();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_TYPE_SPECIFICATION__RANGE = eINSTANCE.getSubrangeTypeSpecification_Range();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedSpecInitImpl <em>Enumerated Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedSpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedSpecInit()
		 * @generated
		 */
		EClass ENUMERATED_SPEC_INIT = eINSTANCE.getEnumeratedSpecInit();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_SPEC_INIT__SPECIFICATION = eINSTANCE.getEnumeratedSpecInit_Specification();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_SPEC_INIT__INITIALIZATION = eINSTANCE.getEnumeratedSpecInit_Initialization();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification <em>Enumerated Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedSpecification()
		 * @generated
		 */
		EClass ENUMERATED_SPECIFICATION = eINSTANCE.getEnumeratedSpecification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValueImpl <em>Enumerated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValueImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedValue()
		 * @generated
		 */
		EClass ENUMERATED_VALUE = eINSTANCE.getEnumeratedValue();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_VALUE__SCOPE = eINSTANCE.getEnumeratedValue_Scope();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeSpecificationImpl <em>Enumerated Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeSpecificationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedTypeSpecification()
		 * @generated
		 */
		EClass ENUMERATED_TYPE_SPECIFICATION = eINSTANCE.getEnumeratedTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Value List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE_SPECIFICATION__VALUE_LIST = eINSTANCE.getEnumeratedTypeSpecification_ValueList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArraySpecInitImpl <em>Array Spec Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArraySpecInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArraySpecInit()
		 * @generated
		 */
		EClass ARRAY_SPEC_INIT = eINSTANCE.getArraySpecInit();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SPEC_INIT__SPECIFICATION = eINSTANCE.getArraySpecInit_Specification();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SPEC_INIT__INITIALIZATION = eINSTANCE.getArraySpecInit_Initialization();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification <em>Array Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArraySpecification
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArraySpecification()
		 * @generated
		 */
		EClass ARRAY_SPECIFICATION = eINSTANCE.getArraySpecification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayInitImpl <em>Array Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayInit()
		 * @generated
		 */
		EClass ARRAY_INIT = eINSTANCE.getArrayInit();

		/**
		 * The meta object literal for the '<em><b>Init Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INIT__INIT_ELEMENTS = eINSTANCE.getArrayInit_InitElements();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeSpecificationImpl <em>Array Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeSpecificationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayTypeSpecification()
		 * @generated
		 */
		EClass ARRAY_TYPE_SPECIFICATION = eINSTANCE.getArrayTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_SPECIFICATION__RANGES = eINSTANCE.getArrayTypeSpecification_Ranges();

		/**
		 * The meta object literal for the '<em><b>Of Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_SPECIFICATION__OF_TYPE = eINSTANCE.getArrayTypeSpecification_OfType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement <em>Array Init Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayInitElement()
		 * @generated
		 */
		EClass ARRAY_INIT_ELEMENT = eINSTANCE.getArrayInitElement();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification <em>Structure Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureSpecification
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureSpecification()
		 * @generated
		 */
		EClass STRUCTURE_SPECIFICATION = eINSTANCE.getStructureSpecification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureDeclarationImpl <em>Structure Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureDeclaration()
		 * @generated
		 */
		EClass STRUCTURE_DECLARATION = eINSTANCE.getStructureDeclaration();

		/**
		 * The meta object literal for the '<em><b>Decl Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DECLARATION__DECL_ELEMENTS = eINSTANCE.getStructureDeclaration_DeclElements();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.InitializedStructureImpl <em>Initialized Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.InitializedStructureImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getInitializedStructure()
		 * @generated
		 */
		EClass INITIALIZED_STRUCTURE = eINSTANCE.getInitializedStructure();

		/**
		 * The meta object literal for the '<em><b>Defined Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZED_STRUCTURE__DEFINED_STRUCTURE = eINSTANCE.getInitializedStructure_DefinedStructure();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZED_STRUCTURE__INIT = eINSTANCE.getInitializedStructure_Init();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementDeclarationImpl <em>Structure Element Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementDeclaration()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT_DECLARATION = eINSTANCE.getStructureElementDeclaration();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ELEMENT_DECLARATION__DOMAIN = eINSTANCE.getStructureElementDeclaration_Domain();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureInitImpl <em>Structure Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureInit()
		 * @generated
		 */
		EClass STRUCTURE_INIT = eINSTANCE.getStructureInit();

		/**
		 * The meta object literal for the '<em><b>Element Init</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_INIT__ELEMENT_INIT = eINSTANCE.getStructureInit_ElementInit();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain <em>Structure Element Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDomain
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementDomain()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT_DOMAIN = eINSTANCE.getStructureElementDomain();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementInitImpl <em>Structure Element Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureElementInitImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementInit()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT_INIT = eINSTANCE.getStructureElementInit();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ELEMENT_INIT__ELEMENT = eINSTANCE.getStructureElementInit_Element();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ELEMENT_INIT__VALUE = eINSTANCE.getStructureElementInit_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue <em>Structure Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructureElementValue()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT_VALUE = eINSTANCE.getStructureElementValue();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.DataType <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.DataType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType <em>Non Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getNonGenericType()
		 * @generated
		 */
		EClass NON_GENERIC_TYPE = eINSTANCE.getNonGenericType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.GenericTypeImpl <em>Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.GenericTypeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getGenericType()
		 * @generated
		 */
		EClass GENERIC_TYPE = eINSTANCE.getGenericType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_TYPE__NAME = eINSTANCE.getGenericType_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeReferenceImpl <em>Array Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getArrayTypeReference()
		 * @generated
		 */
		EClass ARRAY_TYPE_REFERENCE = eINSTANCE.getArrayTypeReference();

		/**
		 * The meta object literal for the '<em><b>Array Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_REFERENCE__ARRAY_TYPE = eINSTANCE.getArrayTypeReference_ArrayType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeReferenceImpl <em>Simple Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSimpleTypeReference()
		 * @generated
		 */
		EClass SIMPLE_TYPE_REFERENCE = eINSTANCE.getSimpleTypeReference();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE = eINSTANCE.getSimpleTypeReference_SimpleType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeReferenceImpl <em>Subrange Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getSubrangeTypeReference()
		 * @generated
		 */
		EClass SUBRANGE_TYPE_REFERENCE = eINSTANCE.getSubrangeTypeReference();

		/**
		 * The meta object literal for the '<em><b>Subrange Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE = eINSTANCE.getSubrangeTypeReference_SubrangeType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeReferenceImpl <em>Enumerated Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeReferenceImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedTypeReference()
		 * @generated
		 */
		EClass ENUMERATED_TYPE_REFERENCE = eINSTANCE.getEnumeratedTypeReference();

		/**
		 * The meta object literal for the '<em><b>Enumerated Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE = eINSTANCE.getEnumeratedTypeReference_EnumeratedType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructurePointerImpl <em>Structure Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructurePointerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getStructurePointer()
		 * @generated
		 */
		EClass STRUCTURE_POINTER = eINSTANCE.getStructurePointer();

		/**
		 * The meta object literal for the '<em><b>Structure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_POINTER__STRUCTURE_TYPE = eINSTANCE.getStructurePointer_StructureType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValuePointerImpl <em>Enumerated Value Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedValuePointerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEnumeratedValuePointer()
		 * @generated
		 */
		EClass ENUMERATED_VALUE_POINTER = eINSTANCE.getEnumeratedValuePointer();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_VALUE_POINTER__ENUM_VALUE = eINSTANCE.getEnumeratedValuePointer_EnumValue();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.HardwareResourceTypeNameImpl <em>Hardware Resource Type Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.HardwareResourceTypeNameImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getHardwareResourceTypeName()
		 * @generated
		 */
		EClass HARDWARE_RESOURCE_TYPE_NAME = eINSTANCE.getHardwareResourceTypeName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType <em>EDate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EDateType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEDateType()
		 * @generated
		 */
		EEnum EDATE_TYPE = eINSTANCE.getEDateType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType <em>EElementary String Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EElementaryStringType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEElementaryStringType()
		 * @generated
		 */
		EEnum EELEMENTARY_STRING_TYPE = eINSTANCE.getEElementaryStringType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType <em>EBit String Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EBitStringType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEBitStringType()
		 * @generated
		 */
		EEnum EBIT_STRING_TYPE = eINSTANCE.getEBitStringType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType <em>ESigned Integer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ESignedIntegerType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getESignedIntegerType()
		 * @generated
		 */
		EEnum ESIGNED_INTEGER_TYPE = eINSTANCE.getESignedIntegerType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType <em>EUnsigned Integer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EUnsignedIntegerType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEUnsignedIntegerType()
		 * @generated
		 */
		EEnum EUNSIGNED_INTEGER_TYPE = eINSTANCE.getEUnsignedIntegerType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType <em>EReal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ERealType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getERealType()
		 * @generated
		 */
		EEnum EREAL_TYPE = eINSTANCE.getERealType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType <em>EGeneric Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.EGenericType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getEGenericType()
		 * @generated
		 */
		EEnum EGENERIC_TYPE = eINSTANCE.getEGenericType();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType <em>ETime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.ETimeType
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl#getETimeType()
		 * @generated
		 */
		EEnum ETIME_TYPE = eINSTANCE.getETimeType();

	}

} //TypesPackage
