/**
 */
package org.muml.reconfiguration.protocolinstantiation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Broadcast Port Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration defines all possible kinds of broadcast ports that we allow for
 * MechatronicUML. Currently, we only allow for two kinds of broadcast ports.
 * These are (1) broadcast ports that run a discovery protocol and (2) broadcast 
 * ports that are used to instantiate a real-time coordination protocol.
 * <!-- end-model-doc -->
 * @see org.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage#getBroadcastPortKind()
 * @model
 * @generated
 */
public enum BroadcastPortKind implements Enumerator {
	/**
	 * The '<em><b>DISCOVERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	DISCOVERY(0, "DISCOVERY", "DISCOVERY"),

	/**
	 * The '<em><b>PROTOCOL INSTANTIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_INSTANTIATION_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_INSTANTIATION(1, "PROTOCOL_INSTANTIATION", "PROTOCOL_INSTANTIATION");

	/**
	 * The '<em><b>DISCOVERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCOVERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCOVERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCOVERY_VALUE = 0;

	/**
	 * The '<em><b>PROTOCOL INSTANTIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOCOL INSTANTIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_INSTANTIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_INSTANTIATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Broadcast Port Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BroadcastPortKind[] VALUES_ARRAY =
		new BroadcastPortKind[] {
			DISCOVERY,
			PROTOCOL_INSTANTIATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Broadcast Port Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BroadcastPortKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Broadcast Port Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BroadcastPortKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BroadcastPortKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Broadcast Port Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BroadcastPortKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BroadcastPortKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Broadcast Port Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BroadcastPortKind get(int value) {
		switch (value) {
			case DISCOVERY_VALUE: return DISCOVERY;
			case PROTOCOL_INSTANTIATION_VALUE: return PROTOCOL_INSTANTIATION;
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
	private BroadcastPortKind(int value, String name, String literal) {
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
	
} //BroadcastPortKind
