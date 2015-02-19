/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package de.uni_paderborn.fujaba.muml.connector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Buffer Overflow Avoidance Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getBufferOverflowAvoidanceStrategy()
 * @model
 * @generated
 */
public enum BufferOverflowAvoidanceStrategy implements Enumerator {
	/**
	 * The '<em><b>DISCARD INCOMING MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARD_INCOMING_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCARD_INCOMING_MESSAGE(0, "DISCARD_INCOMING_MESSAGE", "discard incoming message"),

	/**
	 * The '<em><b>DISPLACE OLDEST MESSAGE IN BUFFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLACE_OLDEST_MESSAGE_IN_BUFFER_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLACE_OLDEST_MESSAGE_IN_BUFFER(1, "DISPLACE_OLDEST_MESSAGE_IN_BUFFER", "displace oldest message in buffer");

	/**
	 * The '<em><b>DISCARD INCOMING MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCARD INCOMING MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCARD_INCOMING_MESSAGE
	 * @model literal="discard incoming message"
	 * @generated
	 * @ordered
	 */
	public static final int DISCARD_INCOMING_MESSAGE_VALUE = 0;

	/**
	 * The '<em><b>DISPLACE OLDEST MESSAGE IN BUFFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISPLACE OLDEST MESSAGE IN BUFFER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPLACE_OLDEST_MESSAGE_IN_BUFFER
	 * @model literal="displace oldest message in buffer"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLACE_OLDEST_MESSAGE_IN_BUFFER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BufferOverflowAvoidanceStrategy[] VALUES_ARRAY =
		new BufferOverflowAvoidanceStrategy[] {
			DISCARD_INCOMING_MESSAGE,
			DISPLACE_OLDEST_MESSAGE_IN_BUFFER,
		};

	/**
	 * A public read-only list of all the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BufferOverflowAvoidanceStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BufferOverflowAvoidanceStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BufferOverflowAvoidanceStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BufferOverflowAvoidanceStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BufferOverflowAvoidanceStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BufferOverflowAvoidanceStrategy get(int value) {
		switch (value) {
			case DISCARD_INCOMING_MESSAGE_VALUE: return DISCARD_INCOMING_MESSAGE;
			case DISPLACE_OLDEST_MESSAGE_IN_BUFFER_VALUE: return DISPLACE_OLDEST_MESSAGE_IN_BUFFER;
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
	private BufferOverflowAvoidanceStrategy(int value, String name, String literal) {
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
	
} //BufferOverflowAvoidanceStrategy
