/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage
 * @generated
 */
public interface ReachabilityGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReachabilityGraphFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.ReachabilityGraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Timed Step Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Step Graph</em>'.
	 * @generated
	 */
	TimedStepGraph createTimedStepGraph();

	/**
	 * Returns a new object of class '<em>Timed GTS Delay Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed GTS Delay Transition</em>'.
	 * @generated
	 */
	TimedGTSDelayTransition createTimedGTSDelayTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReachabilityGraphPackage getReachabilityGraphPackage();

} //ReachabilityGraphFactory
