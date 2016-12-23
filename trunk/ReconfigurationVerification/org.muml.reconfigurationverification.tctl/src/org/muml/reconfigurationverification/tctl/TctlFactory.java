/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.tctl.TctlPackage
 * @generated
 */
public interface TctlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TctlFactory eINSTANCE = org.muml.reconfigurationverification.tctl.impl.TctlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Not Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Formula</em>'.
	 * @generated
	 */
	NotFormula createNotFormula();

	/**
	 * Returns a new object of class '<em>Unary Temporal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Temporal Formula</em>'.
	 * @generated
	 */
	UnaryTemporalFormula createUnaryTemporalFormula();

	/**
	 * Returns a new object of class '<em>Binary Logic Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Logic Formula</em>'.
	 * @generated
	 */
	BinaryLogicFormula createBinaryLogicFormula();

	/**
	 * Returns a new object of class '<em>Binary Temporal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Temporal Formula</em>'.
	 * @generated
	 */
	BinaryTemporalFormula createBinaryTemporalFormula();

	/**
	 * Returns a new object of class '<em>Atomic Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Proposition</em>'.
	 * @generated
	 */
	AtomicProposition createAtomicProposition();

	/**
	 * Returns a new object of class '<em>TCTL Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCTL Formula</em>'.
	 * @generated
	 */
	TCTLFormula createTCTLFormula();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TctlPackage getTctlPackage();

} //TctlFactory
