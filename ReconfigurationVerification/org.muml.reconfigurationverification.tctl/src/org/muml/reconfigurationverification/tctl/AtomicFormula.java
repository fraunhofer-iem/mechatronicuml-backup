/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.AtomicFormula#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getAtomicFormula()
 * @model abstract="true"
 * @generated
 */
public interface AtomicFormula extends FormulaDefinition {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see org.muml.reconfigurationverification.tctl.TctlPackage#getAtomicFormula_Term()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.tctl.AtomicFormula#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

} // AtomicFormula
