/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temp Var Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclarationContainer#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getTempVarDeclarationContainer()
 * @model
 * @generated
 */
public interface TempVarDeclarationContainer extends FBProgramVarDeclaration {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.TempVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getTempVarDeclarationContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TempVarDeclaration> getDeclarations();

} // TempVarDeclarationContainer
