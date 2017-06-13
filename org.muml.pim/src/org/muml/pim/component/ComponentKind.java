/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

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
 * code, and hybrid components that is a discrete software component which may have 
 * continuous input signals.
 * <!-- end-model-doc -->
 * @see org.muml.pim.component.ComponentPackage#getComponentKind()
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
	HYBRID_COMPONENT(2, "HYBRID_COMPONENT", "hybrid component");

	/**
	 * The '<em><b>SOFTWARE COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFTWARE COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component of this kind represent discrete software components. A discrete software component has a behavior specification which is given by means of a real-time statechart.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * A continuous component represents a continuous controller. Such components do not carry a behavior specification in MechatronicUML. Instead, we assume that the behavior of such components is modeled by using a control engineering tool like Matlab/Simulink, Dymola/Modelica or CamelView. In MechatronicUML, only the interface of these components is modeled. The interface is given by their ports.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * A hybrid component bridges the gap between discrete software components and continuous control components. A hybrid component may be considered as a discrete software component which has special ports for reading and writing continuous signals from and to continuous components, e.g., for setting a new reference value to a controller.
	 * <!-- end-model-doc -->
	 * @see #HYBRID_COMPONENT
	 * @model literal="hybrid component"
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_COMPONENT_VALUE = 2;

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
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
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
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
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
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentKind get(int value) {
		switch (value) {
			case SOFTWARE_COMPONENT_VALUE: return SOFTWARE_COMPONENT;
			case CONTINUOUS_COMPONENT_VALUE: return CONTINUOUS_COMPONENT;
			case HYBRID_COMPONENT_VALUE: return HYBRID_COMPONENT;
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
