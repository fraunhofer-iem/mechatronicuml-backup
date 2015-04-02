/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getParamAssignmentList <em>Param Assignment List</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getFunctionInvocation()
 * @model
 * @generated
 */
public interface FunctionInvocation extends PrimaryExpressionValue {
	/**
	 * Returns the value of the '<em><b>Param Assignment List</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Assignment List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Assignment List</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getFunctionInvocation_ParamAssignmentList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParamAssignment> getParamAssignmentList();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getFunctionInvocation_Function()
	 * @model required="true"
	 * @generated
	 */
	FunctionDeclaration getFunction();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionDeclaration value);

} // FunctionInvocation
