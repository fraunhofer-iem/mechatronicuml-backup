/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage
 * @generated
 */
public interface RealtimestatechartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartFactory eINSTANCE = de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RealtimestatechartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Absolute Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Deadline</em>'.
	 * @generated
	 */
	AbsoluteDeadline createAbsoluteDeadline();

	/**
	 * Returns a new object of class '<em>Relative Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Deadline</em>'.
	 * @generated
	 */
	RelativeDeadline createRelativeDeadline();

	/**
	 * Returns a new object of class '<em>UML Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Clock</em>'.
	 * @generated
	 */
	UMLClock createUMLClock();

	/**
	 * Returns a new object of class '<em>UML Realtime Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Composite State</em>'.
	 * @generated
	 */
	UMLRealtimeCompositeState createUMLRealtimeCompositeState();

	/**
	 * Returns a new object of class '<em>UML Interface Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Interface Statechart</em>'.
	 * @generated
	 */
	UMLInterfaceStatechart createUMLInterfaceStatechart();

	/**
	 * Returns a new object of class '<em>UML Realtime Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Action</em>'.
	 * @generated
	 */
	UMLRealtimeAction createUMLRealtimeAction();

	/**
	 * Returns a new object of class '<em>UML Realtime Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Event</em>'.
	 * @generated
	 */
	UMLRealtimeEvent createUMLRealtimeEvent();

	/**
	 * Returns a new object of class '<em>UML Realtime Fading Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Fading Function</em>'.
	 * @generated
	 */
	UMLRealtimeFadingFunction createUMLRealtimeFadingFunction();

	/**
	 * Returns a new object of class '<em>UML Realtime Flat Switching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Flat Switching</em>'.
	 * @generated
	 */
	UMLRealtimeFlatSwitching createUMLRealtimeFlatSwitching();

	/**
	 * Returns a new object of class '<em>UML Realtime Start State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Start State</em>'.
	 * @generated
	 */
	UMLRealtimeStartState createUMLRealtimeStartState();

	/**
	 * Returns a new object of class '<em>UML Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Statechart</em>'.
	 * @generated
	 */
	UMLRealtimeStatechart createUMLRealtimeStatechart();

	/**
	 * Returns a new object of class '<em>UML Realtime Stop State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Stop State</em>'.
	 * @generated
	 */
	UMLRealtimeStopState createUMLRealtimeStopState();

	/**
	 * Returns a new object of class '<em>UML Realtime Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Realtime Transition</em>'.
	 * @generated
	 */
	UMLRealtimeTransition createUMLRealtimeTransition();

	/**
	 * Returns a new object of class '<em>Synchronization Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Channel</em>'.
	 * @generated
	 */
	SynchronizationChannel createSynchronizationChannel();

	/**
	 * Returns a new object of class '<em>UML Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Time Constraint</em>'.
	 * @generated
	 */
	UMLTimeConstraint createUMLTimeConstraint();

	/**
	 * Returns a new object of class '<em>History State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History State</em>'.
	 * @generated
	 */
	HistoryState createHistoryState();

	/**
	 * Returns a new object of class '<em>Do Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Event</em>'.
	 * @generated
	 */
	DoEvent createDoEvent();

	/**
	 * Returns a new object of class '<em>Entry Or Exit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Or Exit Event</em>'.
	 * @generated
	 */
	EntryOrExitEvent createEntryOrExitEvent();

	/**
	 * Returns a new object of class '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * Returns a new object of class '<em>Prioritizable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritizable</em>'.
	 * @generated
	 */
	Prioritizable createPrioritizable();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RealtimestatechartPackage getRealtimestatechartPackage();

} //RealtimestatechartFactory
