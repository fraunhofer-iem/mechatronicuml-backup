/**
 */
package de.uni_paderborn.fujaba.properties;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transformation Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.properties.PropertiesPackage#getTransformationPosition()
 * @model
 * @generated
 */
public enum TransformationPosition implements Enumerator {
	/**
	 * The '<em><b>PRE RECONCILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_RECONCILE_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_RECONCILE(1, "PRE_RECONCILE", "PRE_RECONCILE"),

	/**
	 * The '<em><b>POST RECONCILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_RECONCILE_VALUE
	 * @generated
	 * @ordered
	 */
	POST_RECONCILE(2, "POST_RECONCILE", "POST_RECONCILE");

	/**
	 * The '<em><b>PRE RECONCILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRE RECONCILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_RECONCILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE_RECONCILE_VALUE = 1;

	/**
	 * The '<em><b>POST RECONCILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POST RECONCILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_RECONCILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_RECONCILE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transformation Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransformationPosition[] VALUES_ARRAY =
		new TransformationPosition[] {
			PRE_RECONCILE,
			POST_RECONCILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Transformation Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransformationPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transformation Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformationPosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformationPosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformation Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformationPosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformationPosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformation Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransformationPosition get(int value) {
		switch (value) {
			case PRE_RECONCILE_VALUE: return PRE_RECONCILE;
			case POST_RECONCILE_VALUE: return POST_RECONCILE;
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
	private TransformationPosition(int value, String name, String literal) {
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
	
} //TransformationPosition
