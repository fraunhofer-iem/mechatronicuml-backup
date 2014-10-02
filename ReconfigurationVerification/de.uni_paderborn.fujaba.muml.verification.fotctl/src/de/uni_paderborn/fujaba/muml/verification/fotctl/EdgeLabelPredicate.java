/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.fotctl;

import de.uni_paderborn.fujaba.muml.verification.tctl.AtomicFormula;
import de.uni_paderborn.fujaba.muml.verification.tctl.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Label Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicate#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicate#getSecondTerm <em>Second Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getEdgeLabelPredicate()
 * @model
 * @generated
 */
public interface EdgeLabelPredicate extends AtomicFormula {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(EdgeLabelPredicateDecl)
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getEdgeLabelPredicate_Declaration()
	 * @model required="true"
	 * @generated
	 */
	EdgeLabelPredicateDecl getDeclaration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicate#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(EdgeLabelPredicateDecl value);

	/**
	 * Returns the value of the '<em><b>Second Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Term</em>' containment reference.
	 * @see #setSecondTerm(Term)
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getEdgeLabelPredicate_SecondTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getSecondTerm();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicate#getSecondTerm <em>Second Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Term</em>' containment reference.
	 * @see #getSecondTerm()
	 * @generated
	 */
	void setSecondTerm(Term value);

} // EdgeLabelPredicate
