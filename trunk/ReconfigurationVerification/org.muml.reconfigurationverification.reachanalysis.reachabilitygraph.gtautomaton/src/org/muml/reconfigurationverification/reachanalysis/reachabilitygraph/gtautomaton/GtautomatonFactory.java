/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage
 * @generated
 */
public interface GtautomatonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GtautomatonFactory eINSTANCE = org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtautomatonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gt Step Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt Step Graph</em>'.
	 * @generated
	 */
	GtStepGraph createGtStepGraph();

	/**
	 * Returns a new object of class '<em>Object Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Identifier</em>'.
	 * @generated
	 */
	ObjectIdentifier createObjectIdentifier();

	/**
	 * Returns a new object of class '<em>Gt Automaton Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt Automaton Transition</em>'.
	 * @generated
	 */
	GtAutomatonTransition createGtAutomatonTransition();

	/**
	 * Returns a new object of class '<em>Gt Automaton Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt Automaton Clock Constraint</em>'.
	 * @generated
	 */
	GtAutomatonClockConstraint createGtAutomatonClockConstraint();

	/**
	 * Returns a new object of class '<em>Gt Automaton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gt Automaton</em>'.
	 * @generated
	 */
	GtAutomaton createGtAutomaton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GtautomatonPackage getGtautomatonPackage();

} //GtautomatonFactory
