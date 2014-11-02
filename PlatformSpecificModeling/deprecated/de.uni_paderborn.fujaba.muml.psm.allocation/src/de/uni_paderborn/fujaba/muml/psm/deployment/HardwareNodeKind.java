/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.psm.deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hardware Node Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Different kinds of HardwareNodes. 
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage#getHardwareNodeKind()
 * @model
 * @generated
 */
public enum HardwareNodeKind implements Enumerator {
	/**
	 * The '<em><b>COMPUTATIONAL RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTATIONAL_RESOURCE(0, "COMPUTATIONAL_RESOURCE", "COMPUTATIONAL_RESOURCE"),

	/**
	 * The '<em><b>SENSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SENSOR(2, "SENSOR", "SENSOR"),

	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(1, "ACTOR", "ACTOR"), /**
	 * The '<em><b>COMMUNICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(3, "COMMUNICATION", "COMMUNICATION");

	/**
	 * The '<em><b>COMPUTATIONAL RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computational Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTATIONAL_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTATIONAL_RESOURCE_VALUE = 0;

	/**
	 * The '<em><b>SENSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_VALUE = 2;

	/**
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Actor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 1;

	/**
	 * The '<em><b>COMMUNICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMUNICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hardware Node Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HardwareNodeKind[] VALUES_ARRAY =
		new HardwareNodeKind[] {
			COMPUTATIONAL_RESOURCE,
			SENSOR,
			ACTOR,
			COMMUNICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Hardware Node Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HardwareNodeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hardware Node Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwareNodeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardwareNodeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardware Node Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwareNodeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HardwareNodeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hardware Node Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwareNodeKind get(int value) {
		switch (value) {
			case COMPUTATIONAL_RESOURCE_VALUE: return COMPUTATIONAL_RESOURCE;
			case SENSOR_VALUE: return SENSOR;
			case ACTOR_VALUE: return ACTOR;
			case COMMUNICATION_VALUE: return COMMUNICATION;
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
	private HardwareNodeKind(int value, String name, String literal) {
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
	
} //HardwareNodeKind
