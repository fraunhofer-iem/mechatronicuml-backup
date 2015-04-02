/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList#getParamInstructions <em>Param Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getParamList()
 * @model
 * @generated
 */
public interface ParamList extends FBCallParamPlaceHolder {
	/**
	 * Returns the value of the '<em><b>Param Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Instructions</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getParamList_ParamInstructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParamInstruction> getParamInstructions();

} // ParamList
