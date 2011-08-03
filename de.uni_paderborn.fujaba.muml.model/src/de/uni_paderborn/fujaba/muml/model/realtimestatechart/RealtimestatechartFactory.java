/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage
 * @generated
 */
public interface RealtimestatechartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimestatechartFactoryImpl.init();

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
	 * Returns a new object of class '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock</em>'.
	 * @generated
	 */
	Clock createClock();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Constraint</em>'.
	 * @generated
	 */
	ClockConstraint createClockConstraint();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Asynchronous Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynchronous Message Event</em>'.
	 * @generated
	 */
	AsynchronousMessageEvent createAsynchronousMessageEvent();

	/**
	 * Returns a new object of class '<em>Do Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Event</em>'.
	 * @generated
	 */
	DoEvent createDoEvent();

	/**
	 * Returns a new object of class '<em>Synchronization Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Channel</em>'.
	 * @generated
	 */
	SynchronizationChannel createSynchronizationChannel();

	/**
	 * Returns a new object of class '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * Returns a new object of class '<em>Fujaba Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fujaba Realtime Statechart</em>'.
	 * @generated
	 */
	FujabaRealtimeStatechart createFujabaRealtimeStatechart();

	/**
	 * Returns a new object of class '<em>Entry Or Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Or Exit Point</em>'.
	 * @generated
	 */
	EntryOrExitPoint createEntryOrExitPoint();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>State Entry Or Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Entry Or Exit Point</em>'.
	 * @generated
	 */
	StateEntryOrExitPoint createStateEntryOrExitPoint();

	/**
	 * Returns a new object of class '<em>Entry Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Event</em>'.
	 * @generated
	 */
	EntryEvent createEntryEvent();

	/**
	 * Returns a new object of class '<em>Exit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Event</em>'.
	 * @generated
	 */
	ExitEvent createExitEvent();

	/**
	 * Returns a new object of class '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point</em>'.
	 * @generated
	 */
	EntryPoint createEntryPoint();

	/**
	 * Returns a new object of class '<em>Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Point</em>'.
	 * @generated
	 */
	ExitPoint createExitPoint();

	/**
	 * Returns a new object of class '<em>State Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Entry Point</em>'.
	 * @generated
	 */
	StateEntryPoint createStateEntryPoint();

	/**
	 * Returns a new object of class '<em>State Exit Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Exit Point</em>'.
	 * @generated
	 */
	StateExitPoint createStateExitPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RealtimestatechartPackage getRealtimestatechartPackage();

} //RealtimestatechartFactory
