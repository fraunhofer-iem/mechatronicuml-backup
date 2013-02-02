/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assign Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignOperator()
 * @model
 * @generated
 */
public enum AssignOperator implements Enumerator {
	/**
	 * The '<em><b>UNSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET(0, "UNSET", "UNSET"), /**
	 * The '<em><b>ASSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGN_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGN(1, "ASSIGN", ":="), /**
	 * The '<em><b>PLUS EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_EQUAL(2, "PLUS_EQUAL", "+="),

	/**
	 * The '<em><b>EQUAL PLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_PLUS(3, "EQUAL_PLUS", "=+"),

	/**
	 * The '<em><b>MINUS EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_EQUAL(4, "MINUS_EQUAL", "-="),

	/**
	 * The '<em><b>EQUAL MINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_MINUS(5, "EQUAL_MINUS", "=-");

	/**
	 * The '<em><b>UNSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_VALUE = 0;

	/**
	 * The '<em><b>ASSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGN
	 * @model literal=":="
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGN_VALUE = 1;

	/**
	 * The '<em><b>PLUS EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUS EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_EQUAL
	 * @model literal="+="
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_EQUAL_VALUE = 2;

	/**
	 * The '<em><b>EQUAL PLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL PLUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL_PLUS
	 * @model literal="=+"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_PLUS_VALUE = 3;

	/**
	 * The '<em><b>MINUS EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUS EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_EQUAL
	 * @model literal="-="
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>EQUAL MINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL MINUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL_MINUS
	 * @model literal="=-"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_MINUS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Assign Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssignOperator[] VALUES_ARRAY =
		new AssignOperator[] {
			UNSET,
			ASSIGN,
			PLUS_EQUAL,
			EQUAL_PLUS,
			MINUS_EQUAL,
			EQUAL_MINUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Assign Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssignOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assign Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assign Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assign Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignOperator get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
			case ASSIGN_VALUE: return ASSIGN;
			case PLUS_EQUAL_VALUE: return PLUS_EQUAL;
			case EQUAL_PLUS_VALUE: return EQUAL_PLUS;
			case MINUS_EQUAL_VALUE: return MINUS_EQUAL;
			case EQUAL_MINUS_VALUE: return EQUAL_MINUS;
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
	private AssignOperator(int value, String name, String literal) {
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
	
} //AssignOperator
