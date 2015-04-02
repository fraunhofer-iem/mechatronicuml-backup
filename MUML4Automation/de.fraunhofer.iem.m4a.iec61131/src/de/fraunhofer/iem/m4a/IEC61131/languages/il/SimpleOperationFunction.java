/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Operation Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getOperandList <em>Operand List</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getFunctionName <em>Function Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationFunction()
 * @model
 * @generated
 */
public interface SimpleOperationFunction extends SimpleOperation {
	/**
	 * Returns the value of the '<em><b>Operand List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand List</em>' containment reference.
	 * @see #setOperandList(OperandList)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationFunction_OperandList()
	 * @model containment="true"
	 * @generated
	 */
	OperandList getOperandList();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getOperandList <em>Operand List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand List</em>' containment reference.
	 * @see #getOperandList()
	 * @generated
	 */
	void setOperandList(OperandList value);

	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' reference.
	 * @see #setFunctionName(FunctionDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getSimpleOperationFunction_FunctionName()
	 * @model required="true"
	 * @generated
	 */
	FunctionDeclaration getFunctionName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction#getFunctionName <em>Function Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' reference.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(FunctionDeclaration value);

} // SimpleOperationFunction
