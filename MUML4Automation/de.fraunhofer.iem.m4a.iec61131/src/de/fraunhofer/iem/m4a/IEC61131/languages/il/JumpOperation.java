/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperatorLabel <em>Jump Operator Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperator <em>Jump Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getJumpOperation()
 * @model
 * @generated
 */
public interface JumpOperation extends Instruction {
	/**
	 * Returns the value of the '<em><b>Jump Operator Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump Operator Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump Operator Label</em>' reference.
	 * @see #setJumpOperatorLabel(Instruction)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getJumpOperation_JumpOperatorLabel()
	 * @model required="true"
	 * @generated
	 */
	Instruction getJumpOperatorLabel();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperatorLabel <em>Jump Operator Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump Operator Label</em>' reference.
	 * @see #getJumpOperatorLabel()
	 * @generated
	 */
	void setJumpOperatorLabel(Instruction value);

	/**
	 * Returns the value of the '<em><b>Jump Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator
	 * @see #setJumpOperator(JumpOperator)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getJumpOperation_JumpOperator()
	 * @model required="true"
	 * @generated
	 */
	JumpOperator getJumpOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation#getJumpOperator <em>Jump Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator
	 * @see #getJumpOperator()
	 * @generated
	 */
	void setJumpOperator(JumpOperator value);

} // JumpOperation
