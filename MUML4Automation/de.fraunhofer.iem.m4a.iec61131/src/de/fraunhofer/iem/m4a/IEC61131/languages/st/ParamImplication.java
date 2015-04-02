/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#isNot <em>Not</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getParamImplication()
 * @model
 * @generated
 */
public interface ParamImplication extends ParamAssignment {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getParamImplication_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Left Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Side</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side</em>' reference.
	 * @see #setLeftSide(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getParamImplication_LeftSide()
	 * @model required="true"
	 * @generated
	 */
	SymbolicVariable getLeftSide();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getLeftSide <em>Left Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side</em>' reference.
	 * @see #getLeftSide()
	 * @generated
	 */
	void setLeftSide(SymbolicVariable value);

	/**
	 * Returns the value of the '<em><b>Right Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Side</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side</em>' reference.
	 * @see #setRightSide(Variable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getParamImplication_RightSide()
	 * @model required="true"
	 * @generated
	 */
	Variable getRightSide();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication#getRightSide <em>Right Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side</em>' reference.
	 * @see #getRightSide()
	 * @generated
	 */
	void setRightSide(Variable value);

} // ParamImplication
