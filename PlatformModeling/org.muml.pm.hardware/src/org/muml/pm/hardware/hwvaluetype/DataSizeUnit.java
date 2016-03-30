/**
 */
package org.muml.pm.hardware.hwvaluetype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Size Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The base unit is Byte. The value of the literal is the conversion factor.
 * For example 3 KByte (value=10) = 3*2^(value) Byte.
 * <!-- end-model-doc -->
 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataSizeUnit()
 * @model
 * @generated
 */
public enum DataSizeUnit implements Enumerator {
	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(0, "Byte", "Byte"),

	/**
	 * The '<em><b>KByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	KBYTE(10, "KByte", "KByte"),

	/**
	 * The '<em><b>MByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	MBYTE(20, "MByte", "MByte"),

	/**
	 * The '<em><b>GByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	GBYTE(30, "GByte", "GByte"),

	/**
	 * The '<em><b>Bit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT(-3, "Bit", "Bit");

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model name="Byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 0;

	/**
	 * The '<em><b>KByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KBYTE
	 * @model name="KByte"
	 * @generated
	 * @ordered
	 */
	public static final int KBYTE_VALUE = 10;

	/**
	 * The '<em><b>MByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MBYTE
	 * @model name="MByte"
	 * @generated
	 * @ordered
	 */
	public static final int MBYTE_VALUE = 20;

	/**
	 * The '<em><b>GByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GBYTE
	 * @model name="GByte"
	 * @generated
	 * @ordered
	 */
	public static final int GBYTE_VALUE = 30;

	/**
	 * The '<em><b>Bit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIT
	 * @model name="Bit"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VALUE = -3;

	/**
	 * An array of all the '<em><b>Data Size Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataSizeUnit[] VALUES_ARRAY =
		new DataSizeUnit[] {
			BYTE,
			KBYTE,
			MBYTE,
			GBYTE,
			BIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Size Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataSizeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Size Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataSizeUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataSizeUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Size Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataSizeUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataSizeUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Size Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataSizeUnit get(int value) {
		switch (value) {
			case BYTE_VALUE: return BYTE;
			case KBYTE_VALUE: return KBYTE;
			case MBYTE_VALUE: return MBYTE;
			case GBYTE_VALUE: return GBYTE;
			case BIT_VALUE: return BIT;
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
	private DataSizeUnit(int value, String name, String literal) {
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
	
} //DataSizeUnit
