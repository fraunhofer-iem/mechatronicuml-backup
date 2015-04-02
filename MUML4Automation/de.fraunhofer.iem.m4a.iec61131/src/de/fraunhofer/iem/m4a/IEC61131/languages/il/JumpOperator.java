/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Jump Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getJumpOperator()
 * @model
 * @generated
 */
public enum JumpOperator implements Enumerator {
	/**
	 * The '<em><b>JMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMP_VALUE
	 * @generated
	 * @ordered
	 */
	JMP(0, "JMP", "JMP"),

	/**
	 * The '<em><b>JMPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMPC_VALUE
	 * @generated
	 * @ordered
	 */
	JMPC(1, "JMPC", "JMPC"),

	/**
	 * The '<em><b>JMPCN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMPCN_VALUE
	 * @generated
	 * @ordered
	 */
	JMPCN(2, "JMPCN", "JMPCN");

	/**
	 * The '<em><b>JMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JMP_VALUE = 0;

	/**
	 * The '<em><b>JMPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JMPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JMPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JMPC_VALUE = 1;

	/**
	 * The '<em><b>JMPCN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JMPCN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JMPCN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JMPCN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Jump Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JumpOperator[] VALUES_ARRAY =
		new JumpOperator[] {
			JMP,
			JMPC,
			JMPCN,
		};

	/**
	 * A public read-only list of all the '<em><b>Jump Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JumpOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Jump Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Jump Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JumpOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Jump Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JumpOperator get(int value) {
		switch (value) {
			case JMP_VALUE: return JMP;
			case JMPC_VALUE: return JMPC;
			case JMPCN_VALUE: return JMPCN;
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
	private JumpOperator(int value, String name, String literal) {
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
	
} //JumpOperator
