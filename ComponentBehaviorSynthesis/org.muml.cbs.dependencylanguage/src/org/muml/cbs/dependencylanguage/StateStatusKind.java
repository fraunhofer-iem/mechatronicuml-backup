/**
 */
package org.muml.cbs.dependencylanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Status Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * It is used to specify that a state (combination) is active or inactive.
 * <!-- end-model-doc -->
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getStateStatusKind()
 * @model
 * @generated
 */
public enum StateStatusKind implements Enumerator {
	/**
	 * The '<em><b>UNDEFIEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFIEND_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFIEND(0, "UNDEFIEND", "UNDEFIEND"),

	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(1, "ACTIVE", "ACTIVE"),

	/**
	 * The '<em><b>INACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(2, "INACTIVE", "INACTIVE");

	/**
	 * The '<em><b>UNDEFIEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFIEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFIEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFIEND_VALUE = 0;

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 1;

	/**
	 * The '<em><b>INACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INACTIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>State Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateStatusKind[] VALUES_ARRAY =
		new StateStatusKind[] {
			UNDEFIEND,
			ACTIVE,
			INACTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>State Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateStatusKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Status Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateStatusKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateStatusKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Status Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateStatusKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateStatusKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Status Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateStatusKind get(int value) {
		switch (value) {
			case UNDEFIEND_VALUE: return UNDEFIEND;
			case ACTIVE_VALUE: return ACTIVE;
			case INACTIVE_VALUE: return INACTIVE;
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
	private StateStatusKind(int value, String name, String literal) {
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
	
} //StateStatusKind
