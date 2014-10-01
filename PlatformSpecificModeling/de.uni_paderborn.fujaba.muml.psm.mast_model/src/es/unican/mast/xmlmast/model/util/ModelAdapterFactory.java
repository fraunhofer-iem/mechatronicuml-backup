/**
 */
package es.unican.mast.xmlmast.model.util;

import es.unican.mast.xmlmast.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAlarmClockSystemTimer(AlarmClockSystemTimer object) {
				return createAlarmClockSystemTimerAdapter();
			}
			@Override
			public Adapter caseBarrier(Barrier object) {
				return createBarrierAdapter();
			}
			@Override
			public Adapter caseBurstyExternalEvent(BurstyExternalEvent object) {
				return createBurstyExternalEventAdapter();
			}
			@Override
			public Adapter caseCharacterPacketDriver(CharacterPacketDriver object) {
				return createCharacterPacketDriverAdapter();
			}
			@Override
			public Adapter caseCompositeOperation(CompositeOperation object) {
				return createCompositeOperationAdapter();
			}
			@Override
			public Adapter caseCompositeTimingRequirement(CompositeTimingRequirement object) {
				return createCompositeTimingRequirementAdapter();
			}
			@Override
			public Adapter caseConcentrator(Concentrator object) {
				return createConcentratorAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseDeliveryServer(DeliveryServer object) {
				return createDeliveryServerAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEDFPolicy(EDFPolicy object) {
				return createEDFPolicyAdapter();
			}
			@Override
			public Adapter caseEDFScheduler(EDFScheduler object) {
				return createEDFSchedulerAdapter();
			}
			@Override
			public Adapter caseEnclosingOperation(EnclosingOperation object) {
				return createEnclosingOperationAdapter();
			}
			@Override
			public Adapter caseFixedPriorityPolicy(FixedPriorityPolicy object) {
				return createFixedPriorityPolicyAdapter();
			}
			@Override
			public Adapter caseFixedPriorityScheduler(FixedPriorityScheduler object) {
				return createFixedPrioritySchedulerAdapter();
			}
			@Override
			public Adapter caseFPPacketBasedScheduler(FPPacketBasedScheduler object) {
				return createFPPacketBasedSchedulerAdapter();
			}
			@Override
			public Adapter caseGlobalMaxMissRatio(GlobalMaxMissRatio object) {
				return createGlobalMaxMissRatioAdapter();
			}
			@Override
			public Adapter caseHardGlobalDeadline(HardGlobalDeadline object) {
				return createHardGlobalDeadlineAdapter();
			}
			@Override
			public Adapter caseHardLocalDeadline(HardLocalDeadline object) {
				return createHardLocalDeadlineAdapter();
			}
			@Override
			public Adapter caseImmediateCeilingResource(ImmediateCeilingResource object) {
				return createImmediateCeilingResourceAdapter();
			}
			@Override
			public Adapter caseInterruptFPPolicy(InterruptFPPolicy object) {
				return createInterruptFPPolicyAdapter();
			}
			@Override
			public Adapter caseListOfDrivers(ListOfDrivers object) {
				return createListOfDriversAdapter();
			}
			@Override
			public Adapter caseLocalMaxMissRatio(LocalMaxMissRatio object) {
				return createLocalMaxMissRatioAdapter();
			}
			@Override
			public Adapter caseMASTMODELType(MASTMODELType object) {
				return createMASTMODELTypeAdapter();
			}
			@Override
			public Adapter caseMaxOutputJitterReq(MaxOutputJitterReq object) {
				return createMaxOutputJitterReqAdapter();
			}
			@Override
			public Adapter caseMessageTransmission(MessageTransmission object) {
				return createMessageTransmissionAdapter();
			}
			@Override
			public Adapter caseMulticast(Multicast object) {
				return createMulticastAdapter();
			}
			@Override
			public Adapter caseNonPreemptibleFPPolicy(NonPreemptibleFPPolicy object) {
				return createNonPreemptibleFPPolicyAdapter();
			}
			@Override
			public Adapter caseOffset(Offset object) {
				return createOffsetAdapter();
			}
			@Override
			public Adapter caseOverriddenFixedPriority(OverriddenFixedPriority object) {
				return createOverriddenFixedPriorityAdapter();
			}
			@Override
			public Adapter caseOverriddenPermanentFP(OverriddenPermanentFP object) {
				return createOverriddenPermanentFPAdapter();
			}
			@Override
			public Adapter casePacketBasedNetwork(PacketBasedNetwork object) {
				return createPacketBasedNetworkAdapter();
			}
			@Override
			public Adapter casePacketDriver(PacketDriver object) {
				return createPacketDriverAdapter();
			}
			@Override
			public Adapter casePeriodicExternalEvent(PeriodicExternalEvent object) {
				return createPeriodicExternalEventAdapter();
			}
			@Override
			public Adapter casePollingPolicy(PollingPolicy object) {
				return createPollingPolicyAdapter();
			}
			@Override
			public Adapter casePrimaryScheduler(PrimaryScheduler object) {
				return createPrimarySchedulerAdapter();
			}
			@Override
			public Adapter casePriorityInheritanceResource(PriorityInheritanceResource object) {
				return createPriorityInheritanceResourceAdapter();
			}
			@Override
			public Adapter caseQueryServer(QueryServer object) {
				return createQueryServerAdapter();
			}
			@Override
			public Adapter caseRateDivisor(RateDivisor object) {
				return createRateDivisorAdapter();
			}
			@Override
			public Adapter caseRegularEvent(RegularEvent object) {
				return createRegularEventAdapter();
			}
			@Override
			public Adapter caseRegularProcessor(RegularProcessor object) {
				return createRegularProcessorAdapter();
			}
			@Override
			public Adapter caseRegularSchedulingServer(RegularSchedulingServer object) {
				return createRegularSchedulingServerAdapter();
			}
			@Override
			public Adapter caseRegularTransaction(RegularTransaction object) {
				return createRegularTransactionAdapter();
			}
			@Override
			public Adapter caseRTEPPacketDriver(RTEPPacketDriver object) {
				return createRTEPPacketDriverAdapter();
			}
			@Override
			public Adapter caseSecondaryScheduler(SecondaryScheduler object) {
				return createSecondarySchedulerAdapter();
			}
			@Override
			public Adapter caseSimpleOperation(SimpleOperation object) {
				return createSimpleOperationAdapter();
			}
			@Override
			public Adapter caseSingularExternalEvent(SingularExternalEvent object) {
				return createSingularExternalEventAdapter();
			}
			@Override
			public Adapter caseSoftGlobalDeadline(SoftGlobalDeadline object) {
				return createSoftGlobalDeadlineAdapter();
			}
			@Override
			public Adapter caseSoftLocalDeadline(SoftLocalDeadline object) {
				return createSoftLocalDeadlineAdapter();
			}
			@Override
			public Adapter caseSporadicExternalEvent(SporadicExternalEvent object) {
				return createSporadicExternalEventAdapter();
			}
			@Override
			public Adapter caseSporadicServerPolicy(SporadicServerPolicy object) {
				return createSporadicServerPolicyAdapter();
			}
			@Override
			public Adapter caseSRPParameters(SRPParameters object) {
				return createSRPParametersAdapter();
			}
			@Override
			public Adapter caseSRPResource(SRPResource object) {
				return createSRPResourceAdapter();
			}
			@Override
			public Adapter caseSystemTimedActivity(SystemTimedActivity object) {
				return createSystemTimedActivityAdapter();
			}
			@Override
			public Adapter caseTickerSystemTimer(TickerSystemTimer object) {
				return createTickerSystemTimerAdapter();
			}
			@Override
			public Adapter caseUnboundedExternalEvent(UnboundedExternalEvent object) {
				return createUnboundedExternalEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer <em>Alarm Clock System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.AlarmClockSystemTimer
	 * @generated
	 */
	public Adapter createAlarmClockSystemTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.Barrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.Barrier
	 * @generated
	 */
	public Adapter createBarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.BurstyExternalEvent <em>Bursty External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.BurstyExternalEvent
	 * @generated
	 */
	public Adapter createBurstyExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.CharacterPacketDriver <em>Character Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.CharacterPacketDriver
	 * @generated
	 */
	public Adapter createCharacterPacketDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.CompositeOperation <em>Composite Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.CompositeOperation
	 * @generated
	 */
	public Adapter createCompositeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.CompositeTimingRequirement <em>Composite Timing Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.CompositeTimingRequirement
	 * @generated
	 */
	public Adapter createCompositeTimingRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.Concentrator <em>Concentrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.Concentrator
	 * @generated
	 */
	public Adapter createConcentratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.DeliveryServer <em>Delivery Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.DeliveryServer
	 * @generated
	 */
	public Adapter createDeliveryServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.EDFPolicy <em>EDF Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.EDFPolicy
	 * @generated
	 */
	public Adapter createEDFPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.EDFScheduler <em>EDF Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.EDFScheduler
	 * @generated
	 */
	public Adapter createEDFSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.EnclosingOperation <em>Enclosing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.EnclosingOperation
	 * @generated
	 */
	public Adapter createEnclosingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.FixedPriorityPolicy <em>Fixed Priority Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityPolicy
	 * @generated
	 */
	public Adapter createFixedPriorityPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler <em>Fixed Priority Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.FixedPriorityScheduler
	 * @generated
	 */
	public Adapter createFixedPrioritySchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.FPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.FPPacketBasedScheduler
	 * @generated
	 */
	public Adapter createFPPacketBasedSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio <em>Global Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.GlobalMaxMissRatio
	 * @generated
	 */
	public Adapter createGlobalMaxMissRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline <em>Hard Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.HardGlobalDeadline
	 * @generated
	 */
	public Adapter createHardGlobalDeadlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.HardLocalDeadline <em>Hard Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.HardLocalDeadline
	 * @generated
	 */
	public Adapter createHardLocalDeadlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.ImmediateCeilingResource <em>Immediate Ceiling Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.ImmediateCeilingResource
	 * @generated
	 */
	public Adapter createImmediateCeilingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.InterruptFPPolicy <em>Interrupt FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.InterruptFPPolicy
	 * @generated
	 */
	public Adapter createInterruptFPPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.ListOfDrivers <em>List Of Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.ListOfDrivers
	 * @generated
	 */
	public Adapter createListOfDriversAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.LocalMaxMissRatio <em>Local Max Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.LocalMaxMissRatio
	 * @generated
	 */
	public Adapter createLocalMaxMissRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.MASTMODELType <em>MASTMODEL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.MASTMODELType
	 * @generated
	 */
	public Adapter createMASTMODELTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq <em>Max Output Jitter Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.MaxOutputJitterReq
	 * @generated
	 */
	public Adapter createMaxOutputJitterReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.MessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.MessageTransmission
	 * @generated
	 */
	public Adapter createMessageTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.Multicast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.Multicast
	 * @generated
	 */
	public Adapter createMulticastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy
	 * @generated
	 */
	public Adapter createNonPreemptibleFPPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.Offset
	 * @generated
	 */
	public Adapter createOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.OverriddenFixedPriority <em>Overridden Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.OverriddenFixedPriority
	 * @generated
	 */
	public Adapter createOverriddenFixedPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.OverriddenPermanentFP <em>Overridden Permanent FP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.OverriddenPermanentFP
	 * @generated
	 */
	public Adapter createOverriddenPermanentFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.PacketBasedNetwork <em>Packet Based Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.PacketBasedNetwork
	 * @generated
	 */
	public Adapter createPacketBasedNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.PacketDriver <em>Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.PacketDriver
	 * @generated
	 */
	public Adapter createPacketDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.PeriodicExternalEvent <em>Periodic External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.PeriodicExternalEvent
	 * @generated
	 */
	public Adapter createPeriodicExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.PollingPolicy <em>Polling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.PollingPolicy
	 * @generated
	 */
	public Adapter createPollingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.PrimaryScheduler <em>Primary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.PrimaryScheduler
	 * @generated
	 */
	public Adapter createPrimarySchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.PriorityInheritanceResource <em>Priority Inheritance Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.PriorityInheritanceResource
	 * @generated
	 */
	public Adapter createPriorityInheritanceResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.QueryServer <em>Query Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.QueryServer
	 * @generated
	 */
	public Adapter createQueryServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.RateDivisor <em>Rate Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.RateDivisor
	 * @generated
	 */
	public Adapter createRateDivisorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.RegularEvent <em>Regular Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.RegularEvent
	 * @generated
	 */
	public Adapter createRegularEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.RegularProcessor <em>Regular Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.RegularProcessor
	 * @generated
	 */
	public Adapter createRegularProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.RegularSchedulingServer <em>Regular Scheduling Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.RegularSchedulingServer
	 * @generated
	 */
	public Adapter createRegularSchedulingServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.RegularTransaction <em>Regular Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.RegularTransaction
	 * @generated
	 */
	public Adapter createRegularTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.RTEPPacketDriver <em>RTEP Packet Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.RTEPPacketDriver
	 * @generated
	 */
	public Adapter createRTEPPacketDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SecondaryScheduler <em>Secondary Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SecondaryScheduler
	 * @generated
	 */
	public Adapter createSecondarySchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SimpleOperation
	 * @generated
	 */
	public Adapter createSimpleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SingularExternalEvent <em>Singular External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SingularExternalEvent
	 * @generated
	 */
	public Adapter createSingularExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SoftGlobalDeadline <em>Soft Global Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SoftGlobalDeadline
	 * @generated
	 */
	public Adapter createSoftGlobalDeadlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SoftLocalDeadline <em>Soft Local Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SoftLocalDeadline
	 * @generated
	 */
	public Adapter createSoftLocalDeadlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SporadicExternalEvent <em>Sporadic External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SporadicExternalEvent
	 * @generated
	 */
	public Adapter createSporadicExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SporadicServerPolicy <em>Sporadic Server Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SporadicServerPolicy
	 * @generated
	 */
	public Adapter createSporadicServerPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SRPParameters <em>SRP Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SRPParameters
	 * @generated
	 */
	public Adapter createSRPParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SRPResource <em>SRP Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SRPResource
	 * @generated
	 */
	public Adapter createSRPResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.SystemTimedActivity <em>System Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.SystemTimedActivity
	 * @generated
	 */
	public Adapter createSystemTimedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.TickerSystemTimer <em>Ticker System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.TickerSystemTimer
	 * @generated
	 */
	public Adapter createTickerSystemTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.model.UnboundedExternalEvent <em>Unbounded External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.model.UnboundedExternalEvent
	 * @generated
	 */
	public Adapter createUnboundedExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
