/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryExitPointKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EventKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

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
			RealtimestatechartFactory theRealtimestatechartFactory = (RealtimestatechartFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/muml/model/realtimestatechart"); 
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
			case RealtimestatechartPackage.ACTION: return createAction();
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT: return createAsynchronousMessageEvent();
			case RealtimestatechartPackage.DO_EVENT: return createDoEvent();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT: return createEntryOrExitEvent();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL: return createSynchronizationChannel();
			case RealtimestatechartPackage.SYNCHRONIZATION: return createSynchronization();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART: return createFujabaRealtimeStatechart();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_POINT: return createEntryOrExitPoint();
			case RealtimestatechartPackage.MESSAGE: return createMessage();
			case RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT: return createStateEntryOrExitPoint();
			case RealtimestatechartPackage.ENTRY_EVENT: return createEntryEvent();
			case RealtimestatechartPackage.EXIT_EVENT: return createExitEvent();
			case RealtimestatechartPackage.ENTRY_POINT: return createEntryPoint();
			case RealtimestatechartPackage.EXIT_POINT: return createExitPoint();
			case RealtimestatechartPackage.STATE_ENTRY_POINT: return createStateEntryPoint();
			case RealtimestatechartPackage.STATE_EXIT_POINT: return createStateExitPoint();
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
			case RealtimestatechartPackage.SYNCHRONIZATION_KIND:
				return createSynchronizationKindFromString(eDataType, initialValue);
			case RealtimestatechartPackage.EVENT_KIND:
				return createEventKindFromString(eDataType, initialValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION_KIND:
				return convertSynchronizationKindToString(eDataType, instanceValue);
			case RealtimestatechartPackage.EVENT_KIND:
				return convertEventKindToString(eDataType, instanceValue);
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
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
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
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
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
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent createAsynchronousMessageEvent() {
		AsynchronousMessageEventImpl asynchronousMessageEvent = new AsynchronousMessageEventImpl();
		return asynchronousMessageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoEvent createDoEvent() {
		DoEventImpl doEvent = new DoEventImpl();
		return doEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOrExitEvent createEntryOrExitEvent() {
		EntryOrExitEventImpl entryOrExitEvent = new EntryOrExitEventImpl();
		return entryOrExitEvent;
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
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
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
	public EntryOrExitPoint createEntryOrExitPoint() {
		EntryOrExitPointImpl entryOrExitPoint = new EntryOrExitPointImpl();
		return entryOrExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryOrExitPoint createStateEntryOrExitPoint() {
		StateEntryOrExitPointImpl stateEntryOrExitPoint = new StateEntryOrExitPointImpl();
		return stateEntryOrExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryEvent createEntryEvent() {
		EntryEventImpl entryEvent = new EntryEventImpl();
		return entryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEvent createExitEvent() {
		ExitEventImpl exitEvent = new ExitEventImpl();
		return exitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint createExitPoint() {
		ExitPointImpl exitPoint = new ExitPointImpl();
		return exitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryPoint createStateEntryPoint() {
		StateEntryPointImpl stateEntryPoint = new StateEntryPointImpl();
		return stateEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExitPoint createStateExitPoint() {
		StateExitPointImpl stateExitPoint = new StateExitPointImpl();
		return stateExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind createSynchronizationKindFromString(EDataType eDataType, String initialValue) {
		SynchronizationKind result = SynchronizationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue) {
		EventKind result = EventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue) {
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
