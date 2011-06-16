/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The entries of the enumeration represent different kinds of components. These
 * are discrete software components, continous components containing controller
 * code, hybrid components that is a discrete software component which may have 
 * continuous input signals, and hardware components representing physical entities in the system.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentKind()
 * @model
 * @generated
 */
public enum ComponentKind implements Enumerator {
	/**
	 * The '<em><b>SOFTWARE COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_COMPONENT(0, "SOFTWARE_COMPONENT", "software component"),

	/**
	 * The '<em><b>CONTINUOUS COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUOUS_COMPONENT(1, "CONTINUOUS_COMPONENT", "continuous component"),

	/**
	 * The '<em><b>HYBRID COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID_COMPONENT(2, "HYBRID_COMPONENT", "hybrid component"), /**
	 * The '<em><b>HARDWARE COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE_COMPONENT(3, "HARDWARE_COMPONENT", "hardware component");

	/**
	 * The '<em><b>SOFTWARE COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFTWARE COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_COMPONENT
	 * @model literal="software component"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>CONTINUOUS COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUOUS COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_COMPONENT
	 * @model literal="continuous component"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS_COMPONENT_VALUE = 1;

	/**
	 * The '<em><b>HYBRID COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HYBRID COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYBRID_COMPONENT
	 * @model literal="hybrid component"
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_COMPONENT_VALUE = 2;

	/**
	 * The '<em><b>HARDWARE COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HARDWARE COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_COMPONENT
	 * @model literal="hardware component"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_COMPONENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentKind[] VALUES_ARRAY =
		new ComponentKind[] {
			SOFTWARE_COMPONENT,
			CONTINUOUS_COMPONENT,
			HYBRID_COMPONENT,
			HARDWARE_COMPONENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentKind get(int value) {
		switch (value) {
			case SOFTWARE_COMPONENT_VALUE: return SOFTWARE_COMPONENT;
			case CONTINUOUS_COMPONENT_VALUE: return CONTINUOUS_COMPONENT;
			case HYBRID_COMPONENT_VALUE: return HYBRID_COMPONENT;
			case HARDWARE_COMPONENT_VALUE: return HARDWARE_COMPONENT;
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
	private ComponentKind(int value, String name, String literal) {
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
	
} //ComponentKind
