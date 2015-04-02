/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Var Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedVarDeclarationContainer()
 * @model
 * @generated
 */
public interface LocatedVarDeclarationContainer extends ProgramSpecificDeclaration {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
	 * @see #setType(VarDeclarationType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedVarDeclarationContainer_Type()
	 * @model
	 * @generated
	 */
	VarDeclarationType getType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclarationContainer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType
	 * @see #getType()
	 * @generated
	 */
	void setType(VarDeclarationType value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedVarDeclarationContainer_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LocatedVarDeclaration> getDeclarations();

} // LocatedVarDeclarationContainer
