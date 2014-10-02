/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage
 * @generated
 */
public interface ReachabilityGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReachabilityGraphFactory eINSTANCE = de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.impl.ReachabilityGraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hash To State List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash To State List</em>'.
	 * @generated
	 */
	HashToStateList createHashToStateList();

	/**
	 * Returns a new object of class '<em>Reachability Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reachability Graph</em>'.
	 * @generated
	 */
	ReachabilityGraph createReachabilityGraph();

	/**
	 * Returns a new object of class '<em>Action Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Transition</em>'.
	 * @generated
	 */
	ActionTransition createActionTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReachabilityGraphPackage getReachabilityGraphPackage();

} //ReachabilityGraphFactory
