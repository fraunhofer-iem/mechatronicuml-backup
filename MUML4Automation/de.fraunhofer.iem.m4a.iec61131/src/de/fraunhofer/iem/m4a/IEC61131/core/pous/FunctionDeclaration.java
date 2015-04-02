/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getReturnDomain <em>Return Domain</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends POU {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.FunctionVariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionDeclaration_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionVariableDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Return Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Domain</em>' reference.
	 * @see #setReturnDomain(FunctionReturnDomain)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionDeclaration_ReturnDomain()
	 * @model required="true"
	 * @generated
	 */
	FunctionReturnDomain getReturnDomain();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getReturnDomain <em>Return Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Domain</em>' reference.
	 * @see #getReturnDomain()
	 * @generated
	 */
	void setReturnDomain(FunctionReturnDomain value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(FunctionBody)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#getFunctionDeclaration_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionBody getBody();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(FunctionBody value);

} // FunctionDeclaration
