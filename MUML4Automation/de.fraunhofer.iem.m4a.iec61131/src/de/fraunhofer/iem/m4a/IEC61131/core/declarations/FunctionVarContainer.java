/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Var Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#isCONSTANT <em>CONSTANT</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFunctionVarContainer()
 * @model
 * @generated
 */
public interface FunctionVarContainer extends FunctionVariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFunctionVarContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Var2SpecInitDecl> getDeclarations();

	/**
	 * Returns the value of the '<em><b>CONSTANT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CONSTANT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONSTANT</em>' attribute.
	 * @see #setCONSTANT(boolean)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getFunctionVarContainer_CONSTANT()
	 * @model
	 * @generated
	 */
	boolean isCONSTANT();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVarContainer#isCONSTANT <em>CONSTANT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONSTANT</em>' attribute.
	 * @see #isCONSTANT()
	 * @generated
	 */
	void setCONSTANT(boolean value);

} // FunctionVarContainer
