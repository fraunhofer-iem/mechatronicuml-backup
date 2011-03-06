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
			case RealtimestatechartPackage.UML_CLOCK: return createUMLClock();
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE: return createUMLRealtimeComplexState();
			case RealtimestatechartPackage.UML_INTERFACE_STATECHART: return createUMLInterfaceStatechart();
			case RealtimestatechartPackage.UML_REALTIME_ACTION: return createUMLRealtimeAction();
			case RealtimestatechartPackage.UML_REALTIME_EVENT: return createUMLRealtimeEvent();
			case RealtimestatechartPackage.UML_REALTIME_FADING_FUNCTION: return createUMLRealtimeFadingFunction();
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING: return createUMLRealtimeFlatSwitching();
			case RealtimestatechartPackage.UML_REALTIME_START_STATE: return createUMLRealtimeStartState();
			case RealtimestatechartPackage.UML_REALTIME_STATECHART: return createUMLRealtimeStatechart();
			case RealtimestatechartPackage.UML_REALTIME_STOP_STATE: return createUMLRealtimeStopState();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION: return createUMLRealtimeTransition();
			case RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL: return createSynchronizationChannel();
			case RealtimestatechartPackage.UML_TIME_CONSTRAINT: return createUMLTimeConstraint();
			case RealtimestatechartPackage.HISTORY_STATE: return createHistoryState();
			case RealtimestatechartPackage.DO_EVENT: return createDoEvent();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT: return createEntryOrExitEvent();
			case RealtimestatechartPackage.SYNCHRONIZATION: return createSynchronization();
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
	public UMLClock createUMLClock() {
		UMLClockImpl umlClock = new UMLClockImpl();
		return umlClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeComplexState createUMLRealtimeComplexState() {
		UMLRealtimeComplexStateImpl umlRealtimeComplexState = new UMLRealtimeComplexStateImpl();
		return umlRealtimeComplexState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLInterfaceStatechart createUMLInterfaceStatechart() {
		UMLInterfaceStatechartImpl umlInterfaceStatechart = new UMLInterfaceStatechartImpl();
		return umlInterfaceStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeAction createUMLRealtimeAction() {
		UMLRealtimeActionImpl umlRealtimeAction = new UMLRealtimeActionImpl();
		return umlRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeEvent createUMLRealtimeEvent() {
		UMLRealtimeEventImpl umlRealtimeEvent = new UMLRealtimeEventImpl();
		return umlRealtimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeFadingFunction createUMLRealtimeFadingFunction() {
		UMLRealtimeFadingFunctionImpl umlRealtimeFadingFunction = new UMLRealtimeFadingFunctionImpl();
		return umlRealtimeFadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeFlatSwitching createUMLRealtimeFlatSwitching() {
		UMLRealtimeFlatSwitchingImpl umlRealtimeFlatSwitching = new UMLRealtimeFlatSwitchingImpl();
		return umlRealtimeFlatSwitching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStartState createUMLRealtimeStartState() {
		UMLRealtimeStartStateImpl umlRealtimeStartState = new UMLRealtimeStartStateImpl();
		return umlRealtimeStartState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart createUMLRealtimeStatechart() {
		UMLRealtimeStatechartImpl umlRealtimeStatechart = new UMLRealtimeStatechartImpl();
		return umlRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStopState createUMLRealtimeStopState() {
		UMLRealtimeStopStateImpl umlRealtimeStopState = new UMLRealtimeStopStateImpl();
		return umlRealtimeStopState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeTransition createUMLRealtimeTransition() {
		UMLRealtimeTransitionImpl umlRealtimeTransition = new UMLRealtimeTransitionImpl();
		return umlRealtimeTransition;
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
	public UMLTimeConstraint createUMLTimeConstraint() {
		UMLTimeConstraintImpl umlTimeConstraint = new UMLTimeConstraintImpl();
		return umlTimeConstraint;
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
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
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
