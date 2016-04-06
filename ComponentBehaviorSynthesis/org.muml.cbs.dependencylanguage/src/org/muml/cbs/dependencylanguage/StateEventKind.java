/**
 */
package org.muml.cbs.dependencylanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Event Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This is used to reference the EntryEvent and ExitEvent of a state.
 * Even it is was not instantiate yet.
 * <!-- end-model-doc -->
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getStateEventKind()
 * @model
 * @generated
 */
public enum StateEventKind implements Enumerator {
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
	 * The '<em><b>ENTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY(1, "ENTRY", "ENTRY"),

	/**
	 * The '<em><b>EXIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT(2, "EXIT", "EXIT");

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
	 * The '<em><b>ENTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_VALUE = 1;

	/**
	 * The '<em><b>EXIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_VALUE = 2;

	/**
	 * An array of all the '<em><b>State Event Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateEventKind[] VALUES_ARRAY =
		new StateEventKind[] {
			UNDEFIEND,
			ENTRY,
			EXIT,
		};

	/**
	 * A public read-only list of all the '<em><b>State Event Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateEventKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Event Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateEventKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateEventKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Event Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateEventKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateEventKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Event Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateEventKind get(int value) {
		switch (value) {
			case UNDEFIEND_VALUE: return UNDEFIEND;
			case ENTRY_VALUE: return ENTRY;
			case EXIT_VALUE: return EXIT;
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
	private StateEventKind(int value, String name, String literal) {
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
	
} //StateEventKind
