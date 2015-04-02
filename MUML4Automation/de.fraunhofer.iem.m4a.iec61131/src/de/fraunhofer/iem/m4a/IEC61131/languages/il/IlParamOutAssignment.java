/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Out Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#isNOT <em>NOT</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlParamOutAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isLastElementInList'"
 * @generated
 */
public interface IlParamOutAssignment extends ParamInstruction {
	/**
	 * Returns the value of the '<em><b>NOT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NOT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOT</em>' attribute.
	 * @see #setNOT(boolean)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlParamOutAssignment_NOT()
	 * @model required="true"
	 * @generated
	 */
	boolean isNOT();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#isNOT <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOT</em>' attribute.
	 * @see #isNOT()
	 * @generated
	 */
	void setNOT(boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getIlParamOutAssignment_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // IlParamOutAssignment
