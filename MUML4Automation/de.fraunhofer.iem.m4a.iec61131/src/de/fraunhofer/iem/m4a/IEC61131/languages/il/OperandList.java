/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getOperandList()
 * @model
 * @generated
 */
public interface OperandList extends FBCallParamPlaceHolder {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getOperandList_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operand> getOperands();

} // OperandList
