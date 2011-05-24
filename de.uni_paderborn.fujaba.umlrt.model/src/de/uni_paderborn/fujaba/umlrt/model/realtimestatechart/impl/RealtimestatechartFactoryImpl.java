/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartFactoryImpl extends EFactoryImpl implements RealtimestatechartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RealtimestatechartFactory init() {
		try {
			RealtimestatechartFactory theRealtimestatechartFactory = (RealtimestatechartFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/model/realtimestatechart"); 
			if (theRealtimestatechartFactory != null) {
				return theRealtimestatechartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RealtimestatechartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RealtimestatechartPackage.ABSOLUTE_DEADLINE: return createAbsoluteDeadline();
			case RealtimestatechartPackage.RELATIVE_DEADLINE: return createRelativeDeadline();
			case RealtimestatechartPackage.CLOCK: return createClock();
			case RealtimestatechartPackage.REGION: return createRegion();
			case RealtimestatechartPackage.STATE: return createState();
			case RealtimestatechartPackage.TRANSITION: return createTransition();
			case RealtimestatechartPackage.CLOCK_CONSTRAINT: return createClockConstraint();
			case RealtimestatechartPackage.HISTORY_STATE: return createHistoryState();
			case RealtimestatechartPackage.ACTION: return createAction();
			case RealtimestatechartPackage.ASYNCHRONOUS_EVENT: return createAsynchronousEvent();
			case RealtimestatechartPackage.DO_ACTION: return createDoAction();
			case RealtimestatechartPackage.ENTRY_ACTION: return createEntryAction();
			case RealtimestatechartPackage.EXIT_ACTION: return createExitAction();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL: return createSynchronizationChannel();
			case RealtimestatechartPackage.SYNCHRONIZATION: return createSynchronization();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART: return createFujabaRealtimeStatechart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RealtimestatechartPackage.HISTORY_KIND:
				return createHistoryKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RealtimestatechartPackage.HISTORY_KIND:
				return convertHistoryKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteDeadline createAbsoluteDeadline() {
		AbsoluteDeadlineImpl absoluteDeadline = new AbsoluteDeadlineImpl();
		return absoluteDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDeadline createRelativeDeadline() {
		RelativeDeadlineImpl relativeDeadline = new RelativeDeadlineImpl();
		return relativeDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationChannel createSynchronizationChannel() {
		SynchronizationChannelImpl synchronizationChannel = new SynchronizationChannelImpl();
		return synchronizationChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint createClockConstraint() {
		ClockConstraintImpl clockConstraint = new ClockConstraintImpl();
		return clockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryState createHistoryState() {
		HistoryStateImpl historyState = new HistoryStateImpl();
		return historyState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousEvent createAsynchronousEvent() {
		AsynchronousEventImpl asynchronousEvent = new AsynchronousEventImpl();
		return asynchronousEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoAction createDoAction() {
		DoActionImpl doAction = new DoActionImpl();
		return doAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryAction createEntryAction() {
		EntryActionImpl entryAction = new EntryActionImpl();
		return entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitAction createExitAction() {
		ExitActionImpl exitAction = new ExitActionImpl();
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FujabaRealtimeStatechart createFujabaRealtimeStatechart() {
		FujabaRealtimeStatechartImpl fujabaRealtimeStatechart = new FujabaRealtimeStatechartImpl();
		return fujabaRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryKind createHistoryKindFromString(EDataType eDataType, String initialValue) {
		HistoryKind result = HistoryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHistoryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartPackage getRealtimestatechartPackage() {
		return (RealtimestatechartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RealtimestatechartPackage getPackage() {
		return RealtimestatechartPackage.eINSTANCE;
	}

} //RealtimestatechartFactoryImpl
