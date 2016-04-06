/**
 */
package org.muml.cbs.dependencylanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assignment Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * If a DataAssignmentEffect is specified for an Event and Variable of the same region and only reads from others, its called PULL.
 * Otherwise, it is called PUSH, because the Variable is modified outside of the original owner.
 * <!-- end-model-doc -->
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getAssignmentDirection()
 * @model
 * @generated
 */
public enum AssignmentDirection implements Enumerator {
	/**
	 * The '<em><b>PUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(0, "PUSH", "PUSH"),

	/**
	 * The '<em><b>PULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_VALUE
	 * @generated
	 * @ordered
	 */
	PULL(1, "PULL", "PULL");

	/**
	 * The '<em><b>PUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 0;

	/**
	 * The '<em><b>PULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PULL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Assignment Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssignmentDirection[] VALUES_ARRAY =
		new AssignmentDirection[] {
			PUSH,
			PULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Assignment Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssignmentDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assignment Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignmentDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignment Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignmentDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignment Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignmentDirection get(int value) {
		switch (value) {
			case PUSH_VALUE: return PUSH;
			case PULL_VALUE: return PULL;
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
	private AssignmentDirection(int value, String name, String literal) {
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
	
} //AssignmentDirection
