/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * contains literals of iec 61131, identifer is defined here
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory
 * @model kind="package"
 * @generated
 */
public interface LiteralsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "literals";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core/literals";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "literals";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralsPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.ConstantImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NumericLiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getNumericLiteral()
	 * @generated
	 */
	int NUMERIC_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL__VALUE = CONSTANT__VALUE;

	/**
	 * The number of structural features of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterLiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
	 * @generated
	 */
	int CHARACTER_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__VALUE = CONSTANT__VALUE;

	/**
	 * The number of structural features of the '<em>Character Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BitStringLiteralImpl <em>Bit String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BitStringLiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getBitStringLiteral()
	 * @generated
	 */
	int BIT_STRING_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_LITERAL__VALUE = CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_LITERAL__TYPE_NAME = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_LITERAL_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BooleanImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__TYPE_NAME = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.IntegerLiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = NUMERIC_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__TYPE_NAME = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = NUMERIC_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.RealLiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = NUMERIC_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__TYPE_NAME = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_OPERATION_COUNT = NUMERIC_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SignedIntegerImpl <em>Signed Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SignedIntegerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getSignedInteger()
	 * @generated
	 */
	int SIGNED_INTEGER = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER__VALUE = StPackage.CASE_LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER__TYPE_NAME = StPackage.CASE_LIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signed Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER_FEATURE_COUNT = StPackage.CASE_LIST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signed Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_INTEGER_OPERATION_COUNT = StPackage.CASE_LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BinaryIntegerImpl <em>Binary Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BinaryIntegerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getBinaryInteger()
	 * @generated
	 */
	int BINARY_INTEGER = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER__VALUE = INTEGER_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER__TYPE_NAME = INTEGER_LITERAL__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Binary Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binary Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.OctalIntegerImpl <em>Octal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.OctalIntegerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getOctalInteger()
	 * @generated
	 */
	int OCTAL_INTEGER = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTAL_INTEGER__VALUE = INTEGER_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTAL_INTEGER__TYPE_NAME = INTEGER_LITERAL__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Octal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTAL_INTEGER_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Octal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTAL_INTEGER_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.HexIntegerImpl <em>Hex Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.HexIntegerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getHexInteger()
	 * @generated
	 */
	int HEX_INTEGER = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_INTEGER__VALUE = INTEGER_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_INTEGER__TYPE_NAME = INTEGER_LITERAL__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Hex Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_INTEGER_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hex Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_INTEGER_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.UnsignedIntegerImpl <em>Unsigned Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.UnsignedIntegerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getUnsignedInteger()
	 * @generated
	 */
	int UNSIGNED_INTEGER = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER__VALUE = INTEGER_LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER__TYPE_NAME = INTEGER_LITERAL__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Unsigned Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsigned Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INTEGER_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterStringImpl <em>Character String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterStringImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getCharacterString()
	 * @generated
	 */
	int CHARACTER_STRING = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SingleByteCharacterStringImpl <em>Single Byte Character String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SingleByteCharacterStringImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getSingleByteCharacterString()
	 * @generated
	 */
	int SINGLE_BYTE_CHARACTER_STRING = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_CHARACTER_STRING__VALUE = CHARACTER_STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Single Byte Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_CHARACTER_STRING_FEATURE_COUNT = CHARACTER_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Byte Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_BYTE_CHARACTER_STRING_OPERATION_COUNT = CHARACTER_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DoubleByteCharacterStringImpl <em>Double Byte Character String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DoubleByteCharacterStringImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDoubleByteCharacterString()
	 * @generated
	 */
	int DOUBLE_BYTE_CHARACTER_STRING = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_CHARACTER_STRING__VALUE = CHARACTER_STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Double Byte Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_CHARACTER_STRING_FEATURE_COUNT = CHARACTER_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Byte Character String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BYTE_CHARACTER_STRING_OPERATION_COUNT = CHARACTER_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeLiteralImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getTimeLiteral()
	 * @generated
	 */
	int TIME_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DurationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = TIME_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = TIME_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeOfDayImpl <em>Time Of Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeOfDayImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getTimeOfDay()
	 * @generated
	 */
	int TIME_OF_DAY = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY__VALUE = TIME_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Time Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_OPERATION_COUNT = TIME_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE = TIME_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = TIME_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateAndTimeImpl <em>Date And Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateAndTimeImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDateAndTime()
	 * @generated
	 */
	int DATE_AND_TIME = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME__VALUE = TIME_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Date And Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME_FEATURE_COUNT = TIME_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date And Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_AND_TIME_OPERATION_COUNT = TIME_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CommentableElementImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getCommentableElement()
	 * @generated
	 */
	int COMMENTABLE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_ELEMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Commentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Commentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement#getIdentifier()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Identifier();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.NumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.NumericLiteral
	 * @generated
	 */
	EClass getNumericLiteral();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterLiteral <em>Character Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterLiteral
	 * @generated
	 */
	EClass getCharacterLiteral();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.BitStringLiteral <em>Bit String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit String Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.BitStringLiteral
	 * @generated
	 */
	EClass getBitStringLiteral();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.BitStringLiteral#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.BitStringLiteral#getTypeName()
	 * @see #getBitStringLiteral()
	 * @generated
	 */
	EReference getBitStringLiteral_TypeName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean#isTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Boolean#isTypeName()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_TypeName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral#getTypeName()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EReference getIntegerLiteral_TypeName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Name</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.RealLiteral#getTypeName()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EReference getRealLiteral_TypeName();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger <em>Signed Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Integer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger
	 * @generated
	 */
	EClass getSignedInteger();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.BinaryInteger <em>Binary Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.BinaryInteger
	 * @generated
	 */
	EClass getBinaryInteger();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.OctalInteger <em>Octal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octal Integer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.OctalInteger
	 * @generated
	 */
	EClass getOctalInteger();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.HexInteger <em>Hex Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hex Integer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.HexInteger
	 * @generated
	 */
	EClass getHexInteger();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.UnsignedInteger <em>Unsigned Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Integer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.UnsignedInteger
	 * @generated
	 */
	EClass getUnsignedInteger();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterString <em>Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character String</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.CharacterString
	 * @generated
	 */
	EClass getCharacterString();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.SingleByteCharacterString <em>Single Byte Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Byte Character String</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.SingleByteCharacterString
	 * @generated
	 */
	EClass getSingleByteCharacterString();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.DoubleByteCharacterString <em>Double Byte Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Byte Character String</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.DoubleByteCharacterString
	 * @generated
	 */
	EClass getDoubleByteCharacterString();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeLiteral <em>Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Literal</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeLiteral
	 * @generated
	 */
	EClass getTimeLiteral();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Of Day</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.TimeOfDay
	 * @generated
	 */
	EClass getTimeOfDay();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.DateAndTime <em>Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date And Time</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.DateAndTime
	 * @generated
	 */
	EClass getDateAndTime();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentable Element</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement
	 * @generated
	 */
	EClass getCommentableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement#getComment()
	 * @see #getCommentableElement()
	 * @generated
	 */
	EAttribute getCommentableElement_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LiteralsFactory getLiteralsFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__IDENTIFIER = eINSTANCE.getNamedElement_Identifier();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.ConstantImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NumericLiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getNumericLiteral()
		 * @generated
		 */
		EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterLiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
		 * @generated
		 */
		EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BitStringLiteralImpl <em>Bit String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BitStringLiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getBitStringLiteral()
		 * @generated
		 */
		EClass BIT_STRING_LITERAL = eINSTANCE.getBitStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_STRING_LITERAL__TYPE_NAME = eINSTANCE.getBitStringLiteral_TypeName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BooleanImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__TYPE_NAME = eINSTANCE.getBoolean_TypeName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.IntegerLiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_LITERAL__TYPE_NAME = eINSTANCE.getIntegerLiteral_TypeName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.RealLiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_LITERAL__TYPE_NAME = eINSTANCE.getRealLiteral_TypeName();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SignedIntegerImpl <em>Signed Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SignedIntegerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getSignedInteger()
		 * @generated
		 */
		EClass SIGNED_INTEGER = eINSTANCE.getSignedInteger();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BinaryIntegerImpl <em>Binary Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.BinaryIntegerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getBinaryInteger()
		 * @generated
		 */
		EClass BINARY_INTEGER = eINSTANCE.getBinaryInteger();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.OctalIntegerImpl <em>Octal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.OctalIntegerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getOctalInteger()
		 * @generated
		 */
		EClass OCTAL_INTEGER = eINSTANCE.getOctalInteger();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.HexIntegerImpl <em>Hex Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.HexIntegerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getHexInteger()
		 * @generated
		 */
		EClass HEX_INTEGER = eINSTANCE.getHexInteger();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.UnsignedIntegerImpl <em>Unsigned Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.UnsignedIntegerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getUnsignedInteger()
		 * @generated
		 */
		EClass UNSIGNED_INTEGER = eINSTANCE.getUnsignedInteger();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterStringImpl <em>Character String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CharacterStringImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getCharacterString()
		 * @generated
		 */
		EClass CHARACTER_STRING = eINSTANCE.getCharacterString();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SingleByteCharacterStringImpl <em>Single Byte Character String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SingleByteCharacterStringImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getSingleByteCharacterString()
		 * @generated
		 */
		EClass SINGLE_BYTE_CHARACTER_STRING = eINSTANCE.getSingleByteCharacterString();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DoubleByteCharacterStringImpl <em>Double Byte Character String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DoubleByteCharacterStringImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDoubleByteCharacterString()
		 * @generated
		 */
		EClass DOUBLE_BYTE_CHARACTER_STRING = eINSTANCE.getDoubleByteCharacterString();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeLiteralImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getTimeLiteral()
		 * @generated
		 */
		EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DurationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeOfDayImpl <em>Time Of Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.TimeOfDayImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getTimeOfDay()
		 * @generated
		 */
		EClass TIME_OF_DAY = eINSTANCE.getTimeOfDay();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateAndTimeImpl <em>Date And Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.DateAndTimeImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getDateAndTime()
		 * @generated
		 */
		EClass DATE_AND_TIME = eINSTANCE.getDateAndTime();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CommentableElementImpl <em>Commentable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.CommentableElementImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl#getCommentableElement()
		 * @generated
		 */
		EClass COMMENTABLE_ELEMENT = eINSTANCE.getCommentableElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTABLE_ELEMENT__COMMENT = eINSTANCE.getCommentableElement_Comment();

	}

} //LiteralsPackage
