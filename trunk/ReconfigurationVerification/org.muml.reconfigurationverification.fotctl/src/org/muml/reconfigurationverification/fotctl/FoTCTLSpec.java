/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl;

import org.eclipse.emf.common.util.EList;
import org.muml.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fo TCTL Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getNodeLabelPredicates <em>Node Label Predicates</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getEdgeLabelPredicates <em>Edge Label Predicates</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.FoTCTLSpec#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getFoTCTLSpec()
 * @model
 * @generated
 */
public interface FoTCTLSpec extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.fotctl.FoTCTLFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getFoTCTLSpec_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FoTCTLFormula> getFormulas();

	/**
	 * Returns the value of the '<em><b>Node Label Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.fotctl.NodeLabelPredicateDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Label Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Label Predicates</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getFoTCTLSpec_NodeLabelPredicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeLabelPredicateDecl> getNodeLabelPredicates();

	/**
	 * Returns the value of the '<em><b>Edge Label Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Label Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Label Predicates</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getFoTCTLSpec_EdgeLabelPredicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeLabelPredicateDecl> getEdgeLabelPredicates();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.fotctl.ConstantSymbolDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage#getFoTCTLSpec_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstantSymbolDecl> getConstants();

} // FoTCTLSpec
