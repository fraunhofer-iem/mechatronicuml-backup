/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.tctl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryFormula#getLeftSubformula <em>Left Subformula</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryFormula#getRightSubformula <em>Right Subformula</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.tctl.TctlPackage#getBinaryFormula()
 * @model abstract="true"
 * @generated
 */
public interface BinaryFormula extends FormulaDefinition {
	/**
	 * Returns the value of the '<em><b>Left Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Subformula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Subformula</em>' containment reference.
	 * @see #setLeftSubformula(FormulaDefinition)
	 * @see de.uni_paderborn.fujaba.muml.verification.tctl.TctlPackage#getBinaryFormula_LeftSubformula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormulaDefinition getLeftSubformula();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryFormula#getLeftSubformula <em>Left Subformula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Subformula</em>' containment reference.
	 * @see #getLeftSubformula()
	 * @generated
	 */
	void setLeftSubformula(FormulaDefinition value);

	/**
	 * Returns the value of the '<em><b>Right Subformula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Subformula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Subformula</em>' containment reference.
	 * @see #setRightSubformula(FormulaDefinition)
	 * @see de.uni_paderborn.fujaba.muml.verification.tctl.TctlPackage#getBinaryFormula_RightSubformula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormulaDefinition getRightSubformula();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.tctl.BinaryFormula#getRightSubformula <em>Right Subformula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Subformula</em>' containment reference.
	 * @see #getRightSubformula()
	 * @generated
	 */
	void setRightSubformula(FormulaDefinition value);

} // BinaryFormula
