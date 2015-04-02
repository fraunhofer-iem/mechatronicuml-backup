/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Funct Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getParamList <em>Param List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFormalFunctCall()
 * @model
 * @generated
 */
public interface IlFormalFunctCall extends Instruction, SimpleInstruction {
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFormalFunctCall_FunctionName()
	 * @model required="true"
	 * @generated
	 */
	FunctionDeclaration getFunctionName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getFunctionName <em>Function Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' reference.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(FunctionDeclaration value);

	/**
	 * Returns the value of the '<em><b>Param List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param List</em>' containment reference.
	 * @see #setParamList(ParamList)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFormalFunctCall_ParamList()
	 * @model containment="true"
	 * @generated
	 */
	ParamList getParamList();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall#getParamList <em>Param List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param List</em>' containment reference.
	 * @see #getParamList()
	 * @generated
	 */
	void setParamList(ParamList value);

} // IlFormalFunctCall
