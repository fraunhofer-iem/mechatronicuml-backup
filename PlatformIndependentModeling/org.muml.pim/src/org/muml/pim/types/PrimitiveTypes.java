/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines all primitive types that may be used in MechatronicUML.
 * <!-- end-model-doc -->
 * @see org.muml.pim.types.TypesPackage#getPrimitiveTypes()
 * @model
 * @generated
 */
public enum PrimitiveTypes implements Enumerator {
	/**
	 * The '<em><b>VOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(0, "VOID", "VOID"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(1, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>INT8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT8_VALUE
	 * @generated
	 * @ordered
	 */
	INT8(2, "INT8", "INT8"), /**
	 * The '<em><b>INT16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT16_VALUE
	 * @generated
	 * @ordered
	 */
	INT16(3, "INT16", "INT16"), /**
	 * The '<em><b>INT32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT32_VALUE
	 * @generated
	 * @ordered
	 */
	INT32(4, "INT32", "INT32"), /**
	 * The '<em><b>INT64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT64_VALUE
	 * @generated
	 * @ordered
	 */
	INT64(5, "INT64", "INT64"), /**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(6, "DOUBLE", "DOUBLE"), /**
	 * The '<em><b>UINT8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT8_VALUE
	 * @generated
	 * @ordered
	 */
	UINT8(7, "UINT8", "UINT8"), /**
	 * The '<em><b>UINT16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT16_VALUE
	 * @generated
	 * @ordered
	 */
	UINT16(8, "UINT16", "UINT16"), /**
	 * The '<em><b>UINT32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT32_VALUE
	 * @generated
	 * @ordered
	 */
	UINT32(9, "UINT32", "UINT32"), /**
	 * The '<em><b>UINT64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT64_VALUE
	 * @generated
	 * @ordered
	 */
	UINT64(10, "UINT64", "UINT64");

	/**
	 * The '<em><b>VOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>INT8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT8_VALUE = 2;

	/**
	 * The '<em><b>INT16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT16
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT16_VALUE = 3;

	/**
	 * The '<em><b>INT32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT32_VALUE = 4;

	/**
	 * The '<em><b>INT64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT64
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT64_VALUE = 5;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 6;

	/**
	 * The '<em><b>UINT8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UINT8_VALUE = 7;

	/**
	 * The '<em><b>UINT16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT16
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UINT16_VALUE = 8;

	/**
	 * The '<em><b>UINT32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UINT32_VALUE = 9;

	/**
	 * The '<em><b>UINT64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT64
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UINT64_VALUE = 10;

	/**
	 * An array of all the '<em><b>Primitive Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveTypes[] VALUES_ARRAY =
		new PrimitiveTypes[] {
			VOID,
			BOOLEAN,
			INT8,
			INT16,
			INT32,
			INT64,
			DOUBLE,
			UINT8,
			UINT16,
			UINT32,
			UINT64,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypes get(int value) {
		switch (value) {
			case VOID_VALUE: return VOID;
			case BOOLEAN_VALUE: return BOOLEAN;
			case INT8_VALUE: return INT8;
			case INT16_VALUE: return INT16;
			case INT32_VALUE: return INT32;
			case INT64_VALUE: return INT64;
			case DOUBLE_VALUE: return DOUBLE;
			case UINT8_VALUE: return UINT8;
			case UINT16_VALUE: return UINT16;
			case UINT32_VALUE: return UINT32;
			case UINT64_VALUE: return UINT64;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrimitiveTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PrimitiveTypes
