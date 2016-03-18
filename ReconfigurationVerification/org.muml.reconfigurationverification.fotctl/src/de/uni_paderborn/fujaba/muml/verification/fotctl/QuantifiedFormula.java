/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.fotctl;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.verification.tctl.UnaryFormula;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.QuantifiedFormula#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.QuantifiedFormula#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getQuantifiedFormula()
 * @model
 * @generated
 */
public interface QuantifiedFormula extends UnaryFormula, NamedElement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.fotctl.Variable}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.verification.fotctl.Variable#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getQuantifiedFormula_Variables()
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.Variable#getDeclaration
	 * @model opposite="declaration" required="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The default value is <code>"Quantifier.FORALL"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.verification.fotctl.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getQuantifiedFormula_Quantifier()
	 * @model default="Quantifier.FORALL"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.fotctl.QuantifiedFormula#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

} // QuantifiedFormula
