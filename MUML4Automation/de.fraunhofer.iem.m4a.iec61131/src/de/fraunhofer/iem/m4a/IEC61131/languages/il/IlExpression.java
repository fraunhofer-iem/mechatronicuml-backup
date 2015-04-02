/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getExprOperator <em>Expr Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getSimpleInstructionList <em>Simple Instruction List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlExpression()
 * @model
 * @generated
 */
public interface IlExpression extends Instruction, SimpleInstruction {
	/**
	 * Returns the value of the '<em><b>Expr Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator
	 * @see #setExprOperator(ExprOperator)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlExpression_ExprOperator()
	 * @model default="AND" required="true"
	 * @generated
	 */
	ExprOperator getExprOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getExprOperator <em>Expr Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator
	 * @see #getExprOperator()
	 * @generated
	 */
	void setExprOperator(ExprOperator value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Operand)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlExpression_Operand()
	 * @model containment="true"
	 * @generated
	 */
	Operand getOperand();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Operand value);

	/**
	 * Returns the value of the '<em><b>Simple Instruction List</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Instruction List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Instruction List</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlExpression_SimpleInstructionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleInstruction> getSimpleInstructionList();

} // IlExpression
