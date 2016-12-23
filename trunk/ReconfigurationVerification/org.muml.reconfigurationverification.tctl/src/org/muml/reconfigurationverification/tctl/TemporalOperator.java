/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temporal Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTemporalOperator()
 * @model
 * @generated
 */
public enum TemporalOperator implements Enumerator {
	/**
	 * The '<em><b>AF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AF_VALUE
	 * @generated
	 * @ordered
	 */
	AF(0, "AF", "AF"),

	/**
	 * The '<em><b>AG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AG_VALUE
	 * @generated
	 * @ordered
	 */
	AG(1, "AG", "AG"),

	/**
	 * The '<em><b>AU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AU_VALUE
	 * @generated
	 * @ordered
	 */
	AU(2, "AU", "AU"),

	/**
	 * The '<em><b>EF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EF_VALUE
	 * @generated
	 * @ordered
	 */
	EF(3, "EF", "EF"),

	/**
	 * The '<em><b>EG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EG_VALUE
	 * @generated
	 * @ordered
	 */
	EG(4, "EG", "EG"),

	/**
	 * The '<em><b>EU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EU_VALUE
	 * @generated
	 * @ordered
	 */
	EU(5, "EU", "EU");

	/**
	 * The '<em><b>AF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AF_VALUE = 0;

	/**
	 * The '<em><b>AG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AG_VALUE = 1;

	/**
	 * The '<em><b>AU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AU_VALUE = 2;

	/**
	 * The '<em><b>EF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EF_VALUE = 3;

	/**
	 * The '<em><b>EG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EG_VALUE = 4;

	/**
	 * The '<em><b>EU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EU_VALUE = 5;

	/**
	 * An array of all the '<em><b>Temporal Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TemporalOperator[] VALUES_ARRAY =
		new TemporalOperator[] {
			AF,
			AG,
			AU,
			EF,
			EG,
			EU,
		};

	/**
	 * A public read-only list of all the '<em><b>Temporal Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TemporalOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temporal Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TemporalOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TemporalOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TemporalOperator get(int value) {
		switch (value) {
			case AF_VALUE: return AF;
			case AG_VALUE: return AG;
			case AU_VALUE: return AU;
			case EF_VALUE: return EF;
			case EG_VALUE: return EG;
			case EU_VALUE: return EU;
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
	private TemporalOperator(int value, String name, String literal) {
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
	
} //TemporalOperator
