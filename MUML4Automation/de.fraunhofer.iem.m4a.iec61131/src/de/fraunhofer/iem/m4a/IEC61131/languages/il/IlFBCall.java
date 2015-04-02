/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getCallOperator <em>Call Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbName <em>Fb Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbCallParam <em>Fb Call Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFBCall()
 * @model
 * @generated
 */
public interface IlFBCall extends Instruction {
	/**
	 * Returns the value of the '<em><b>Call Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator
	 * @see #setCallOperator(CallOperator)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFBCall_CallOperator()
	 * @model required="true"
	 * @generated
	 */
	CallOperator getCallOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getCallOperator <em>Call Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator
	 * @see #getCallOperator()
	 * @generated
	 */
	void setCallOperator(CallOperator value);

	/**
	 * Returns the value of the '<em><b>Fb Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fb Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fb Name</em>' reference.
	 * @see #setFbName(FBInstance)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFBCall_FbName()
	 * @model required="true"
	 * @generated
	 */
	FBInstance getFbName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbName <em>Fb Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fb Name</em>' reference.
	 * @see #getFbName()
	 * @generated
	 */
	void setFbName(FBInstance value);

	/**
	 * Returns the value of the '<em><b>Fb Call Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fb Call Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fb Call Param</em>' containment reference.
	 * @see #setFbCallParam(FBCallParamPlaceHolder)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlFBCall_FbCallParam()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FBCallParamPlaceHolder getFbCallParam();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall#getFbCallParam <em>Fb Call Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fb Call Param</em>' containment reference.
	 * @see #getFbCallParam()
	 * @generated
	 */
	void setFbCallParam(FBCallParamPlaceHolder value);

} // IlFBCall
