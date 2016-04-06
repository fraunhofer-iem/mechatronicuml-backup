/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;
import org.muml.reconfigurationverification.tctl.UnaryFormula;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getQuantifiedFormula()
 * @model
 * @generated
 */
public interface QuantifiedFormula extends UnaryFormula, NamedElement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.fotctl.Variable}.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfigurationverification.fotctl.Variable#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getQuantifiedFormula_Variables()
	 * @see org.muml.reconfigurationverification.fotctl.Variable#getDeclaration
	 * @model opposite="declaration" required="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The default value is <code>"Quantifier.FORALL"</code>.
	 * The literals are from the enumeration {@link org.muml.reconfigurationverification.fotctl.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see org.muml.reconfigurationverification.fotctl.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getQuantifiedFormula_Quantifier()
	 * @model default="Quantifier.FORALL"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.fotctl.QuantifiedFormula#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see org.muml.reconfigurationverification.fotctl.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

} // QuantifiedFormula
