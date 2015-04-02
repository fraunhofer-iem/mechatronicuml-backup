/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getOperandConstant()
 * @model
 * @generated
 */
public interface OperandConstant extends Operand {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(Constant)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getOperandConstant_Constant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constant getConstant();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandConstant#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Constant value);

} // OperandConstant
