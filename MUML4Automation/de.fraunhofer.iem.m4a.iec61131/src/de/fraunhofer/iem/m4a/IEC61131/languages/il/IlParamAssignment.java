/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlParamAssignment()
 * @model
 * @generated
 */
public interface IlParamAssignment extends ParamInstruction {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(ParamAssignmentOperand)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlParamAssignment_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParamAssignmentOperand getOperand();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamAssignment#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(ParamAssignmentOperand value);

} // IlParamAssignment
