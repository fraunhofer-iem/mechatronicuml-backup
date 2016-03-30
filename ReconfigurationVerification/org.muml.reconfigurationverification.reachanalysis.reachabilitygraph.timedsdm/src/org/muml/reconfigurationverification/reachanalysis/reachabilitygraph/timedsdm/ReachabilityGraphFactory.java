/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.ReachabilityGraphPackage
 * @generated
 */
public interface ReachabilityGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReachabilityGraphFactory eINSTANCE = org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.impl.ReachabilityGraphFactoryImpl.init();

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
