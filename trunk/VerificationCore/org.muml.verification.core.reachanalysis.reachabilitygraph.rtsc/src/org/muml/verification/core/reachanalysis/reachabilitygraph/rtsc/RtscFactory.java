/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage
 * @generated
 */
public interface RtscFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtscFactory eINSTANCE = org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.RtscFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zone Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Graph</em>'.
	 * @generated
	 */
	ZoneGraph createZoneGraph();

	/**
	 * Returns a new object of class '<em>Zone Graph State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Graph State</em>'.
	 * @generated
	 */
	ZoneGraphState createZoneGraphState();

	/**
	 * Returns a new object of class '<em>Zone Graph Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Graph Transition</em>'.
	 * @generated
	 */
	ZoneGraphTransition createZoneGraphTransition();

	/**
	 * Returns a new object of class '<em>Delay Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Transition</em>'.
	 * @generated
	 */
	DelayTransition createDelayTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RtscPackage getRtscPackage();

} //RtscFactory
