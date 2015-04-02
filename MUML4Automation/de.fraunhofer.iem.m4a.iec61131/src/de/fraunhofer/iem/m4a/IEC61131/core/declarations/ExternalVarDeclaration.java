/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getExternalVarDeclaration()
 * @model
 * @generated
 */
public interface ExternalVarDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' containment reference.
	 * @see #setVariableName(GlobalVar)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getExternalVarDeclaration_VariableName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalVar getVariableName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getVariableName <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' containment reference.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(GlobalVar value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(ExternalVarSpec)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getExternalVarDeclaration_Spec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExternalVarSpec getSpec();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarDeclaration#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(ExternalVarSpec value);

} // ExternalVarDeclaration
