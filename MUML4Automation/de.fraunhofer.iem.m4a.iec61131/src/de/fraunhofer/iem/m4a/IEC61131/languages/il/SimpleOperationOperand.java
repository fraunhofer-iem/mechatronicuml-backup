/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Operation Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getSimpleOperator <em>Simple Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getExprOperator <em>Expr Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationOperand()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasOnlyOneOperator'"
 * @generated
 */
public interface SimpleOperationOperand extends SimpleOperation {
	/**
	 * Returns the value of the '<em><b>Simple Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator
	 * @see #setSimpleOperator(SimpleOperator)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationOperand_SimpleOperator()
	 * @model
	 * @generated
	 */
	SimpleOperator getSimpleOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getSimpleOperator <em>Simple Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator
	 * @see #getSimpleOperator()
	 * @generated
	 */
	void setSimpleOperator(SimpleOperator value);

	/**
	 * Returns the value of the '<em><b>Expr Operator</b></em>' attribute.
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationOperand_ExprOperator()
	 * @model
	 * @generated
	 */
	ExprOperator getExprOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getExprOperator <em>Expr Operator</em>}' attribute.
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationOperand_Operand()
	 * @model containment="true"
	 * @generated
	 */
	Operand getOperand();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Operand value);

} // SimpleOperationOperand
