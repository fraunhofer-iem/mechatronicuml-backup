/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EDate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEDateType()
 * @model
 * @generated
 */
public enum EDateType implements Enumerator {
	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(0, "DATE", "DATE"),

	/**
	 * The '<em><b>TIMEOFDAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOFDAY_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEOFDAY(1, "TIMEOFDAY", "TIMEOFDAY"),

	/**
	 * The '<em><b>TOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOD_VALUE
	 * @generated
	 * @ordered
	 */
	TOD(2, "TOD", "TOD"),

	/**
	 * The '<em><b>DATEANDTIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATEANDTIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATEANDTIME(3, "DATEANDTIME", "DATEANDTIME"),

	/**
	 * The '<em><b>DT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT_VALUE
	 * @generated
	 * @ordered
	 */
	DT(4, "DT", "DT");

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 0;

	/**
	 * The '<em><b>TIMEOFDAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEOFDAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEOFDAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEOFDAY_VALUE = 1;

	/**
	 * The '<em><b>TOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOD_VALUE = 2;

	/**
	 * The '<em><b>DATEANDTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATEANDTIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATEANDTIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATEANDTIME_VALUE = 3;

	/**
	 * The '<em><b>DT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DT_VALUE = 4;

	/**
	 * An array of all the '<em><b>EDate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EDateType[] VALUES_ARRAY =
		new EDateType[] {
			DATE,
			TIMEOFDAY,
			TOD,
			DATEANDTIME,
			DT,
		};

	/**
	 * A public read-only list of all the '<em><b>EDate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EDateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EDate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDateType get(int value) {
		switch (value) {
			case DATE_VALUE: return DATE;
			case TIMEOFDAY_VALUE: return TIMEOFDAY;
			case TOD_VALUE: return TOD;
			case DATEANDTIME_VALUE: return DATEANDTIME;
			case DT_VALUE: return DT;
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
	private EDateType(int value, String name, String literal) {
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
	
} //EDateType
