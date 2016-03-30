/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.fotctl.FotctlPackage
 * @generated
 */
public interface FotctlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FotctlFactory eINSTANCE = org.muml.reconfigurationverification.fotctl.impl.FotctlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fo TCTL Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fo TCTL Spec</em>'.
	 * @generated
	 */
	FoTCTLSpec createFoTCTLSpec();

	/**
	 * Returns a new object of class '<em>Fo TCTL Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fo TCTL Formula</em>'.
	 * @generated
	 */
	FoTCTLFormula createFoTCTLFormula();

	/**
	 * Returns a new object of class '<em>Node Label Predicate Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Label Predicate Decl</em>'.
	 * @generated
	 */
	NodeLabelPredicateDecl createNodeLabelPredicateDecl();

	/**
	 * Returns a new object of class '<em>Edge Label Predicate Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Label Predicate Decl</em>'.
	 * @generated
	 */
	EdgeLabelPredicateDecl createEdgeLabelPredicateDecl();

	/**
	 * Returns a new object of class '<em>Constant Symbol Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Symbol Decl</em>'.
	 * @generated
	 */
	ConstantSymbolDecl createConstantSymbolDecl();

	/**
	 * Returns a new object of class '<em>Quantified Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantified Formula</em>'.
	 * @generated
	 */
	QuantifiedFormula createQuantifiedFormula();

	/**
	 * Returns a new object of class '<em>Node Label Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Label Predicate</em>'.
	 * @generated
	 */
	NodeLabelPredicate createNodeLabelPredicate();

	/**
	 * Returns a new object of class '<em>Edge Label Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Label Predicate</em>'.
	 * @generated
	 */
	EdgeLabelPredicate createEdgeLabelPredicate();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FotctlPackage getFotctlPackage();

} //FotctlFactory
