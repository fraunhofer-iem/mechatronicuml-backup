/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl;

import org.muml.reconfigurationverification.tctl.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.Variable#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Term {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(QuantifiedFormula)
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getVariable_Declaration()
	 * @see org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getVariables
	 * @model opposite="variables" resolveProxies="false" required="true"
	 * @generated
	 */
	QuantifiedFormula getDeclaration();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.fotctl.Variable#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(QuantifiedFormula value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getVariable_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if declaration.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tdeclaration.name\r\nendif'"
	 * @generated
	 */
	String getName();

} // Variable
