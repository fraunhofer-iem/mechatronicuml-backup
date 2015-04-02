/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getFunctionBlock <em>Function Block</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getParamAssignmentList <em>Param Assignment List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getFBInvocation()
 * @model
 * @generated
 */
public interface FBInvocation extends SubprogramControlStatement {
	/**
	 * Returns the value of the '<em><b>Function Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block</em>' reference.
	 * @see #setFunctionBlock(FBInstance)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getFBInvocation_FunctionBlock()
	 * @model required="true"
	 * @generated
	 */
	FBInstance getFunctionBlock();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation#getFunctionBlock <em>Function Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Block</em>' reference.
	 * @see #getFunctionBlock()
	 * @generated
	 */
	void setFunctionBlock(FBInstance value);

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getFBInvocation_ParamAssignmentList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamAssignment> getParamAssignmentList();

} // FBInvocation
