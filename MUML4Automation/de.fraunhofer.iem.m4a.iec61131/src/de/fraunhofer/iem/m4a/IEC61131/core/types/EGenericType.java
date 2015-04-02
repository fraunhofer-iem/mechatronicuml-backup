/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EGeneric Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEGenericType()
 * @model
 * @generated
 */
public enum EGenericType implements Enumerator {
	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "ANY", "ANY"),

	/**
	 * The '<em><b>ANY DERIVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_DERIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_DERIVED(1, "ANY_DERIVED", "ANY_DERIVED"),

	/**
	 * The '<em><b>ANY ELEMENTARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_ELEMENTARY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_ELEMENTARY(2, "ANY_ELEMENTARY", "ANY_ELEMENTARY"),

	/**
	 * The '<em><b>ANY MAGNITUDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_MAGNITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_MAGNITUDE(3, "ANY_MAGNITUDE", "ANY_MAGNITUDE"),

	/**
	 * The '<em><b>ANY NUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_NUM_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_NUM(4, "ANY_NUM", "ANY_NUM"),

	/**
	 * The '<em><b>ANY REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_REAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_REAL(5, "ANY_REAL", "ANY_REAL"),

	/**
	 * The '<em><b>ANY INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_INT_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_INT(6, "ANY_INT", "ANY_INT"),

	/**
	 * The '<em><b>ANY BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_BIT_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_BIT(7, "ANY_BIT", "ANY_BIT"),

	/**
	 * The '<em><b>ANY STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_STRING(8, "ANY_STRING", "ANY_STRING"),

	/**
	 * The '<em><b>ANY DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_DATE(9, "ANY_DATE", "ANY_DATE");

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>ANY DERIVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY DERIVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_DERIVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_DERIVED_VALUE = 1;

	/**
	 * The '<em><b>ANY ELEMENTARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY ELEMENTARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_ELEMENTARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_ELEMENTARY_VALUE = 2;

	/**
	 * The '<em><b>ANY MAGNITUDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY MAGNITUDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_MAGNITUDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_MAGNITUDE_VALUE = 3;

	/**
	 * The '<em><b>ANY NUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY NUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_NUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_NUM_VALUE = 4;

	/**
	 * The '<em><b>ANY REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_REAL_VALUE = 5;

	/**
	 * The '<em><b>ANY INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_INT_VALUE = 6;

	/**
	 * The '<em><b>ANY BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_BIT_VALUE = 7;

	/**
	 * The '<em><b>ANY STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_STRING_VALUE = 8;

	/**
	 * The '<em><b>ANY DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_DATE_VALUE = 9;

	/**
	 * An array of all the '<em><b>EGeneric Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EGenericType[] VALUES_ARRAY =
		new EGenericType[] {
			ANY,
			ANY_DERIVED,
			ANY_ELEMENTARY,
			ANY_MAGNITUDE,
			ANY_NUM,
			ANY_REAL,
			ANY_INT,
			ANY_BIT,
			ANY_STRING,
			ANY_DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>EGeneric Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EGenericType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EGeneric Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EGenericType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EGenericType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EGeneric Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EGenericType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EGenericType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EGeneric Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EGenericType get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case ANY_DERIVED_VALUE: return ANY_DERIVED;
			case ANY_ELEMENTARY_VALUE: return ANY_ELEMENTARY;
			case ANY_MAGNITUDE_VALUE: return ANY_MAGNITUDE;
			case ANY_NUM_VALUE: return ANY_NUM;
			case ANY_REAL_VALUE: return ANY_REAL;
			case ANY_INT_VALUE: return ANY_INT;
			case ANY_BIT_VALUE: return ANY_BIT;
			case ANY_STRING_VALUE: return ANY_STRING;
			case ANY_DATE_VALUE: return ANY_DATE;
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
	private EGenericType(int value, String name, String literal) {
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
	
} //EGenericType
