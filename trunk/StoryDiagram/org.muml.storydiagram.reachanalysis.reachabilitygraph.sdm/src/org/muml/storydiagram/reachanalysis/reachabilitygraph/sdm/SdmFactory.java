/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage
 * @generated
 */
public interface SdmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdmFactory eINSTANCE = org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SdmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Step Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Graph</em>'.
	 * @generated
	 */
	StepGraph createStepGraph();

	/**
	 * Returns a new object of class '<em>SDM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDM Transition</em>'.
	 * @generated
	 */
	SDMTransition createSDMTransition();

	/**
	 * Returns a new object of class '<em>Successor Step Graphs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Successor Step Graphs</em>'.
	 * @generated
	 */
	SuccessorStepGraphs createSuccessorStepGraphs();

	/**
	 * Returns a new object of class '<em>Graph Transformation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Transformation System</em>'.
	 * @generated
	 */
	GraphTransformationSystem createGraphTransformationSystem();

	/**
	 * Returns a new object of class '<em>SDM Reachability Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDM Reachability Graph</em>'.
	 * @generated
	 */
	SDMReachabilityGraph createSDMReachabilityGraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SdmPackage getSdmPackage();

} //SdmFactory
