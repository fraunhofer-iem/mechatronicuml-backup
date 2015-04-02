/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EBit String Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEBitStringType()
 * @model
 * @generated
 */
public enum EBitStringType implements Enumerator {
	/**
	 * The '<em><b>BOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL_VALUE
	 * @generated
	 * @ordered
	 */
	BOOL(0, "BOOL", "BOOL"),

	/**
	 * The '<em><b>DWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DWORD_VALUE
	 * @generated
	 * @ordered
	 */
	DWORD(1, "DWORD", "DWORD"),

	/**
	 * The '<em><b>LWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LWORD_VALUE
	 * @generated
	 * @ordered
	 */
	LWORD(2, "LWORD", "LWORD"),

	/**
	 * The '<em><b>WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_VALUE
	 * @generated
	 * @ordered
	 */
	WORD(3, "WORD", "WORD"),

	/**
	 * The '<em><b>BYTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(4, "BYTE", "BYTE");

	/**
	 * The '<em><b>BOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOL_VALUE = 0;

	/**
	 * The '<em><b>DWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DWORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DWORD_VALUE = 1;

	/**
	 * The '<em><b>LWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LWORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LWORD_VALUE = 2;

	/**
	 * The '<em><b>WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORD_VALUE = 3;

	/**
	 * The '<em><b>BYTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 4;

	/**
	 * An array of all the '<em><b>EBit String Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EBitStringType[] VALUES_ARRAY =
		new EBitStringType[] {
			BOOL,
			DWORD,
			LWORD,
			WORD,
			BYTE,
		};

	/**
	 * A public read-only list of all the '<em><b>EBit String Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EBitStringType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EBit String Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EBitStringType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EBitStringType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EBit String Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EBitStringType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EBitStringType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EBit String Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EBitStringType get(int value) {
		switch (value) {
			case BOOL_VALUE: return BOOL;
			case DWORD_VALUE: return DWORD;
			case LWORD_VALUE: return LWORD;
			case WORD_VALUE: return WORD;
			case BYTE_VALUE: return BYTE;
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
	private EBitStringType(int value, String name, String literal) {
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
	
} //EBitStringType
