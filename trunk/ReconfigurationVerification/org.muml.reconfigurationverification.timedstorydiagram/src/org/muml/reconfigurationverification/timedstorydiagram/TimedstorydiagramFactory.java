/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage
 * @generated
 */
public interface TimedstorydiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimedstorydiagramFactory eINSTANCE = org.muml.reconfigurationverification.timedstorydiagram.impl.TimedstorydiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Timed Graph Transformation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Graph Transformation System</em>'.
	 * @generated
	 */
	TimedGraphTransformationSystem createTimedGraphTransformationSystem();

	/**
	 * Returns a new object of class '<em>Timed Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Story Diagram</em>'.
	 * @generated
	 */
	TimedStoryDiagram createTimedStoryDiagram();

	/**
	 * Returns a new object of class '<em>Invariant Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant Story Diagram</em>'.
	 * @generated
	 */
	InvariantStoryDiagram createInvariantStoryDiagram();

	/**
	 * Returns a new object of class '<em>Clock Instance Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Instance Story Diagram</em>'.
	 * @generated
	 */
	ClockInstanceStoryDiagram createClockInstanceStoryDiagram();

	/**
	 * Returns a new object of class '<em>Clock Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Instance</em>'.
	 * @generated
	 */
	ClockInstance createClockInstance();

	/**
	 * Returns a new object of class '<em>Clock Instance Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Instance Constraint</em>'.
	 * @generated
	 */
	ClockInstanceConstraint createClockInstanceConstraint();

	/**
	 * Returns a new object of class '<em>Clock Instance Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Instance Variable</em>'.
	 * @generated
	 */
	ClockInstanceVariable createClockInstanceVariable();

	/**
	 * Returns a new object of class '<em>Timed Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Story Pattern</em>'.
	 * @generated
	 */
	TimedStoryPattern createTimedStoryPattern();

	/**
	 * Returns a new object of class '<em>Timed Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Activity Node</em>'.
	 * @generated
	 */
	TimedActivityNode createTimedActivityNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimedstorydiagramPackage getTimedstorydiagramPackage();

} //TimedstorydiagramFactory
