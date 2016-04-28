/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;

import org.muml.mumlcore.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCTL Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.TCTLFormula#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTCTLFormula()
 * @model
 * @generated
 */
public interface TCTLFormula extends CommentableElement {

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(FormulaDefinition)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getTCTLFormula_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormulaDefinition getFormula();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.TCTLFormula#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(FormulaDefinition value);
} // TCTLFormula
