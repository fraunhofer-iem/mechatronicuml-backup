/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EUnsigned Integer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEUnsignedIntegerType()
 * @model
 * @generated
 */
public enum EUnsignedIntegerType implements Enumerator {
	/**
	 * The '<em><b>USINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USINT_VALUE
	 * @generated
	 * @ordered
	 */
	USINT(0, "USINT", "USINT"),

	/**
	 * The '<em><b>UINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT_VALUE
	 * @generated
	 * @ordered
	 */
	UINT(1, "UINT", "UINT"),

	/**
	 * The '<em><b>UDINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDINT_VALUE
	 * @generated
	 * @ordered
	 */
	UDINT(2, "UDINT", "UDINT"),

	/**
	 * The '<em><b>ULINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULINT_VALUE
	 * @generated
	 * @ordered
	 */
	ULINT(3, "ULINT", "ULINT");

	/**
	 * The '<em><b>USINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USINT_VALUE = 0;

	/**
	 * The '<em><b>UINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UINT_VALUE = 1;

	/**
	 * The '<em><b>UDINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UDINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UDINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UDINT_VALUE = 2;

	/**
	 * The '<em><b>ULINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ULINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ULINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ULINT_VALUE = 3;

	/**
	 * An array of all the '<em><b>EUnsigned Integer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EUnsignedIntegerType[] VALUES_ARRAY =
		new EUnsignedIntegerType[] {
			USINT,
			UINT,
			UDINT,
			ULINT,
		};

	/**
	 * A public read-only list of all the '<em><b>EUnsigned Integer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EUnsignedIntegerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EUnsigned Integer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EUnsignedIntegerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EUnsignedIntegerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EUnsigned Integer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EUnsignedIntegerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EUnsignedIntegerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EUnsigned Integer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EUnsignedIntegerType get(int value) {
		switch (value) {
			case USINT_VALUE: return USINT;
			case UINT_VALUE: return UINT;
			case UDINT_VALUE: return UDINT;
			case ULINT_VALUE: return ULINT;
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
	private EUnsignedIntegerType(int value, String name, String literal) {
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
	
} //EUnsignedIntegerType
