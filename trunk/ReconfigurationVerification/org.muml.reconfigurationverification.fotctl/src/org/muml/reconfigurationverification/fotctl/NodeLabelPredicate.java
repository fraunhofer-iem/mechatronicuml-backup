/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl;

import org.muml.reconfigurationverification.tctl.AtomicFormula;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Label Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicate#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getNodeLabelPredicate()
 * @model
 * @generated
 */
public interface NodeLabelPredicate extends AtomicFormula {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(NodeLabelPredicateDecl)
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getNodeLabelPredicate_Declaration()
	 * @model required="true"
	 * @generated
	 */
	NodeLabelPredicateDecl getDeclaration();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicate#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(NodeLabelPredicateDecl value);

} // NodeLabelPredicate
