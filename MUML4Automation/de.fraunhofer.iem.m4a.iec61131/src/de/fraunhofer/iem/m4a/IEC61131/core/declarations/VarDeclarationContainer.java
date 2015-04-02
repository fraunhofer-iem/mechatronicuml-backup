/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVarDeclarationContainer()
 * @model
 * @generated
 */
public interface VarDeclarationContainer extends FBProgramVarDeclaration {
	/**
	 * Returns the value of the '<em><b>Declaration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Type</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
	 * @see #setDeclarationType(VarDeclarationType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVarDeclarationContainer_DeclarationType()
	 * @model
	 * @generated
	 */
	VarDeclarationType getDeclarationType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer#getDeclarationType <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Type</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
	 * @see #getDeclarationType()
	 * @generated
	 */
	void setDeclarationType(VarDeclarationType value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getVarDeclarationContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VarInitDeclaration> getDeclarations();

} // VarDeclarationContainer
