/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbolic Access Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getFbRef <em>Fb Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getProgramRef <em>Program Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getSymbolicAccessPath()
 * @model
 * @generated
 */
public interface SymbolicAccessPath extends AccessDeclaration {
	/**
	 * Returns the value of the '<em><b>Fb Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fb Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fb Ref</em>' reference.
	 * @see #setFbRef(FBInstance)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getSymbolicAccessPath_FbRef()
	 * @model
	 * @generated
	 */
	FBInstance getFbRef();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getFbRef <em>Fb Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fb Ref</em>' reference.
	 * @see #getFbRef()
	 * @generated
	 */
	void setFbRef(FBInstance value);

	/**
	 * Returns the value of the '<em><b>Program Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Ref</em>' reference.
	 * @see #setProgramRef(ProgramConfiguration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getSymbolicAccessPath_ProgramRef()
	 * @model
	 * @generated
	 */
	ProgramConfiguration getProgramRef();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getProgramRef <em>Program Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Ref</em>' reference.
	 * @see #getProgramRef()
	 * @generated
	 */
	void setProgramRef(ProgramConfiguration value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getSymbolicAccessPath_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymbolicVariable getVariable();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(SymbolicVariable value);

} // SymbolicAccessPath
