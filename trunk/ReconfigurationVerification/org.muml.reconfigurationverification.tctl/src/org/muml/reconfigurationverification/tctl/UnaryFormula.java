/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.UnaryFormula#getSubformula <em>Subformula</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getUnaryFormula()
 * @model abstract="true"
 * @generated
 */
public interface UnaryFormula extends FormulaDefinition {
	/**
	 * Returns the value of the '<em><b>Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subformula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subformula</em>' containment reference.
	 * @see #setSubformula(FormulaDefinition)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getUnaryFormula_Subformula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormulaDefinition getSubformula();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.UnaryFormula#getSubformula <em>Subformula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subformula</em>' containment reference.
	 * @see #getSubformula()
	 * @generated
	 */
	void setSubformula(FormulaDefinition value);

} // UnaryFormula
