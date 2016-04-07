/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.SimulinkPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator {
	/**
	 * The '<em><b>INHERIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(0, "INHERIT", "Inherit: Same as Simulink"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(1, "DOUBLE", "double"),

	/**
	 * The '<em><b>SINGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(2, "SINGLE", "single"),

	/**
	 * The '<em><b>INT32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT32_VALUE
	 * @generated
	 * @ordered
	 */
	INT32(3, "INT32", "int32"),

	/**
	 * The '<em><b>INT16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT16_VALUE
	 * @generated
	 * @ordered
	 */
	INT16(4, "INT16", "int16"),

	/**
	 * The '<em><b>INT8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT8_VALUE
	 * @generated
	 * @ordered
	 */
	INT8(5, "INT8", "int8"),

	/**
	 * The '<em><b>UINT32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT32_VALUE
	 * @generated
	 * @ordered
	 */
	UINT32(6, "UINT32", "uint32"),

	/**
	 * The '<em><b>UINT16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT16_VALUE
	 * @generated
	 * @ordered
	 */
	UINT16(7, "UINT16", "uint16"),

	/**
	 * The '<em><b>UINT8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT8_VALUE
	 * @generated
	 * @ordered
	 */
	UINT8(8, "UINT8", "uint8"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(9, "BOOLEAN", "boolean"),

	/**
	 * The '<em><b>BUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(10, "BUS", "Bus");

	/**
	 * The '<em><b>INHERIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same as Simulink
	 * <!-- end-model-doc -->
	 * @see #INHERIT
	 * @model literal="Inherit: Same as Simulink"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model literal="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 1;

	/**
	 * The '<em><b>SINGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model literal="single"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 2;

	/**
	 * The '<em><b>INT32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT32
	 * @model literal="int32"
	 * @generated
	 * @ordered
	 */
	public static final int INT32_VALUE = 3;

	/**
	 * The '<em><b>INT16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT16
	 * @model literal="int16"
	 * @generated
	 * @ordered
	 */
	public static final int INT16_VALUE = 4;

	/**
	 * The '<em><b>INT8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT8
	 * @model literal="int8"
	 * @generated
	 * @ordered
	 */
	public static final int INT8_VALUE = 5;

	/**
	 * The '<em><b>UINT32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT32
	 * @model literal="uint32"
	 * @generated
	 * @ordered
	 */
	public static final int UINT32_VALUE = 6;

	/**
	 * The '<em><b>UINT16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT16
	 * @model literal="uint16"
	 * @generated
	 * @ordered
	 */
	public static final int UINT16_VALUE = 7;

	/**
	 * The '<em><b>UINT8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT8
	 * @model literal="uint8"
	 * @generated
	 * @ordered
	 */
	public static final int UINT8_VALUE = 8;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model literal="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 9;

	/**
	 * The '<em><b>BUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model literal="Bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 10;

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY =
		new DataType[] {
			INHERIT,
			DOUBLE,
			SINGLE,
			INT32,
			INT16,
			INT8,
			UINT32,
			UINT16,
			UINT8,
			BOOLEAN,
			BUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
			case INHERIT_VALUE: return INHERIT;
			case DOUBLE_VALUE: return DOUBLE;
			case SINGLE_VALUE: return SINGLE;
			case INT32_VALUE: return INT32;
			case INT16_VALUE: return INT16;
			case INT8_VALUE: return INT8;
			case UINT32_VALUE: return UINT32;
			case UINT16_VALUE: return UINT16;
			case UINT8_VALUE: return UINT8;
			case BOOLEAN_VALUE: return BOOLEAN;
			case BUS_VALUE: return BUS;
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
	private DataType(int value, String name, String literal) {
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
	
} //DataType
