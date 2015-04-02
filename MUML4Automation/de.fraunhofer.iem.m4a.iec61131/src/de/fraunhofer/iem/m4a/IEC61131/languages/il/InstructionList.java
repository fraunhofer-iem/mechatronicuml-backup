/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Entry point for instruction list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.InstructionList#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getInstructionList()
 * @model
 * @generated
 */
public interface InstructionList extends FunctionBody, FunctionBlockBody {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getInstructionList_Instruction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getInstruction();

} // InstructionList
