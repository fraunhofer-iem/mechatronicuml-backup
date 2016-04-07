/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Event</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.muml.simulink.SimulinkPackage#getTriggerEvent()
 * @model
 * @generated
 */
public enum TriggerEvent implements Enumerator {
	/**
	 * The '<em><b>Rising</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISING_VALUE
	 * @generated
	 * @ordered
	 */
	RISING(0, "Rising", "rising"),

	/**
	 * The '<em><b>Falling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALLING_VALUE
	 * @generated
	 * @ordered
	 */
	FALLING(1, "Falling", "falling"),

	/**
	 * The '<em><b>Either</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EITHER_VALUE
	 * @generated
	 * @ordered
	 */
	EITHER(2, "Either", "either");

	/**
	 * The '<em><b>Rising</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rising</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RISING
	 * @model name="Rising" literal="rising"
	 * @generated
	 * @ordered
	 */
	public static final int RISING_VALUE = 0;

	/**
	 * The '<em><b>Falling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Falling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FALLING
	 * @model name="Falling" literal="falling"
	 * @generated
	 * @ordered
	 */
	public static final int FALLING_VALUE = 1;

	/**
	 * The '<em><b>Either</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Either</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EITHER
	 * @model name="Either" literal="either"
	 * @generated
	 * @ordered
	 */
	public static final int EITHER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Trigger Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerEvent[] VALUES_ARRAY =
		new TriggerEvent[] {
			RISING,
			FALLING,
			EITHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerEvent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Event</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerEvent get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerEvent result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Event</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerEvent getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerEvent result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Event</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerEvent get(int value) {
		switch (value) {
			case RISING_VALUE: return RISING;
			case FALLING_VALUE: return FALLING;
			case EITHER_VALUE: return EITHER;
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
	private TriggerEvent(int value, String name, String literal) {
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
	
} //TriggerEvent
