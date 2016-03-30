/**
 */
package org.muml.pm.hardware.hwvaluetype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Rate Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The base unit is bit/s. The value of the literal is the conversion factor.
 * For example 2.5 Kbit/s (value=20) = 2.5*2^(value) bit/s.
 * <!-- end-model-doc -->
 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataRateUnit()
 * @model
 * @generated
 */
public enum DataRateUnit implements Enumerator {
	/**
	 * The '<em><b>Bs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BS_VALUE
	 * @generated
	 * @ordered
	 */
	BS(0, "bs", "b\\s"),

	/**
	 * The '<em><b>Kbs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBS_VALUE
	 * @generated
	 * @ordered
	 */
	KBS(10, "Kbs", "Kb\\s"),

	/**
	 * The '<em><b>Mbs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBS_VALUE
	 * @generated
	 * @ordered
	 */
	MBS(20, "Mbs", "Mb\\s");

	/**
	 * The '<em><b>Bs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BS
	 * @model name="bs" literal="b\\s"
	 * @generated
	 * @ordered
	 */
	public static final int BS_VALUE = 0;

	/**
	 * The '<em><b>Kbs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kbs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KBS
	 * @model name="Kbs" literal="Kb\\s"
	 * @generated
	 * @ordered
	 */
	public static final int KBS_VALUE = 10;

	/**
	 * The '<em><b>Mbs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mbs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MBS
	 * @model name="Mbs" literal="Mb\\s"
	 * @generated
	 * @ordered
	 */
	public static final int MBS_VALUE = 20;

	/**
	 * An array of all the '<em><b>Data Rate Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataRateUnit[] VALUES_ARRAY =
		new DataRateUnit[] {
			BS,
			KBS,
			MBS,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Rate Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataRateUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Rate Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRateUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataRateUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Rate Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRateUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataRateUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Rate Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRateUnit get(int value) {
		switch (value) {
			case BS_VALUE: return BS;
			case KBS_VALUE: return KBS;
			case MBS_VALUE: return MBS;
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
	private DataRateUnit(int value, String name, String literal) {
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
	
} //DataRateUnit
