/**
 */
package es.unican.mast.xmlmast.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transmission Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.model.ModelPackage#getTransmissionType()
 * @model extendedMetaData="name='Transmission_Type'"
 * @generated
 */
public enum TransmissionType implements Enumerator {
	/**
	 * The '<em><b>SIMPLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLEX(0, "SIMPLEX", "SIMPLEX"),

	/**
	 * The '<em><b>HALFDUPLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFDUPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	HALFDUPLEX(1, "HALFDUPLEX", "HALF_DUPLEX"),

	/**
	 * The '<em><b>FULLDUPLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLDUPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	FULLDUPLEX(2, "FULLDUPLEX", "FULL_DUPLEX");

	/**
	 * The '<em><b>SIMPLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMPLEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLEX_VALUE = 0;

	/**
	 * The '<em><b>HALFDUPLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALFDUPLEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALFDUPLEX
	 * @model literal="HALF_DUPLEX"
	 * @generated
	 * @ordered
	 */
	public static final int HALFDUPLEX_VALUE = 1;

	/**
	 * The '<em><b>FULLDUPLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FULLDUPLEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULLDUPLEX
	 * @model literal="FULL_DUPLEX"
	 * @generated
	 * @ordered
	 */
	public static final int FULLDUPLEX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transmission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransmissionType[] VALUES_ARRAY =
		new TransmissionType[] {
			SIMPLEX,
			HALFDUPLEX,
			FULLDUPLEX,
		};

	/**
	 * A public read-only list of all the '<em><b>Transmission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransmissionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transmission Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransmissionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transmission Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransmissionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transmission Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionType get(int value) {
		switch (value) {
			case SIMPLEX_VALUE: return SIMPLEX;
			case HALFDUPLEX_VALUE: return HALFDUPLEX;
			case FULLDUPLEX_VALUE: return FULLDUPLEX;
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
	private TransmissionType(int value, String name, String literal) {
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
	
} //TransmissionType
