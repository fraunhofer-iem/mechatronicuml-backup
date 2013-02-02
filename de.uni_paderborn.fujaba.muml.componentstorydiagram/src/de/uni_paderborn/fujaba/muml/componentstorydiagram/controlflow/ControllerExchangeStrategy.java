/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Controller Exchange Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeStrategy()
 * @model
 * @generated
 */
public enum ControllerExchangeStrategy implements Enumerator {
	/**
	 * The '<em><b>ATOMIC SWITCHING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATOMIC_SWITCHING_VALUE
	 * @generated
	 * @ordered
	 */
	ATOMIC_SWITCHING(0, "ATOMIC_SWITCHING", "ATOMIC_SWITCHING"),

	/**
	 * The '<em><b>FADING FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADING_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FADING_FUNCTION(1, "FADING_FUNCTION", "FADING_FUNCTION"),

	/**
	 * The '<em><b>FLAT SWITCHING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_SWITCHING_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT_SWITCHING(2, "FLAT_SWITCHING", "FLAT_SWITCHING");

	/**
	 * The '<em><b>ATOMIC SWITCHING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATOMIC SWITCHING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATOMIC_SWITCHING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATOMIC_SWITCHING_VALUE = 0;

	/**
	 * The '<em><b>FADING FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FADING FUNCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FADING_FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FADING_FUNCTION_VALUE = 1;

	/**
	 * The '<em><b>FLAT SWITCHING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLAT SWITCHING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAT_SWITCHING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_SWITCHING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Controller Exchange Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControllerExchangeStrategy[] VALUES_ARRAY =
		new ControllerExchangeStrategy[] {
			ATOMIC_SWITCHING,
			FADING_FUNCTION,
			FLAT_SWITCHING,
		};

	/**
	 * A public read-only list of all the '<em><b>Controller Exchange Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControllerExchangeStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Controller Exchange Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControllerExchangeStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControllerExchangeStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Controller Exchange Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControllerExchangeStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControllerExchangeStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Controller Exchange Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControllerExchangeStrategy get(int value) {
		switch (value) {
			case ATOMIC_SWITCHING_VALUE: return ATOMIC_SWITCHING;
			case FADING_FUNCTION_VALUE: return FADING_FUNCTION;
			case FLAT_SWITCHING_VALUE: return FLAT_SWITCHING;
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
	private ControllerExchangeStrategy(int value, String name, String literal) {
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
	
} //ControllerExchangeStrategy
