/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getParamInstruction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ParamInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' reference.
	 * @see #setVariableName(NamedVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getParamInstruction_VariableName()
	 * @model required="true"
	 * @generated
	 */
	NamedVariable getVariableName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction#getVariableName <em>Variable Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' reference.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(NamedVariable value);

} // ParamInstruction
