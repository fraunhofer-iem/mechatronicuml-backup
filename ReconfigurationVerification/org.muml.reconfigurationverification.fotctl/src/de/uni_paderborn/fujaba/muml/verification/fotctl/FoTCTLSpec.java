/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.fotctl;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fo TCTL Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec#getNodeLabelPredicates <em>Node Label Predicates</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec#getEdgeLabelPredicates <em>Edge Label Predicates</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLSpec#getConstants <em>Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getFoTCTLSpec()
 * @model
 * @generated
 */
public interface FoTCTLSpec extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.fotctl.FoTCTLFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getFoTCTLSpec_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FoTCTLFormula> getFormulas();

	/**
	 * Returns the value of the '<em><b>Node Label Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.fotctl.NodeLabelPredicateDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Label Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Label Predicates</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getFoTCTLSpec_NodeLabelPredicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeLabelPredicateDecl> getNodeLabelPredicates();

	/**
	 * Returns the value of the '<em><b>Edge Label Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.fotctl.EdgeLabelPredicateDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Label Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Label Predicates</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getFoTCTLSpec_EdgeLabelPredicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeLabelPredicateDecl> getEdgeLabelPredicates();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.fotctl.ConstantSymbolDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.fotctl.FotctlPackage#getFoTCTLSpec_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstantSymbolDecl> getConstants();

} // FoTCTLSpec
