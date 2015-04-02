/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Struct Var Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getArrayStructVarSpec()
 * @model abstract="true"
 * @generated
 */
public interface ArrayStructVarSpec extends TempVarDeclaration {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' containment reference.
	 * @see #setVariableName(NamedVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getArrayStructVarSpec_VariableName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedVariable getVariableName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ArrayStructVarSpec#getVariableName <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' containment reference.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(NamedVariable value);

} // ArrayStructVarSpec
