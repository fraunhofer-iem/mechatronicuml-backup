/**
 */
package es.unican.mast.xmlmast.model.util;

import es.unican.mast.xmlmast.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER: {
				AlarmClockSystemTimer alarmClockSystemTimer = (AlarmClockSystemTimer)theEObject;
				T result = caseAlarmClockSystemTimer(alarmClockSystemTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BARRIER: {
				Barrier barrier = (Barrier)theEObject;
				T result = caseBarrier(barrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BURSTY_EXTERNAL_EVENT: {
				BurstyExternalEvent burstyExternalEvent = (BurstyExternalEvent)theEObject;
				T result = caseBurstyExternalEvent(burstyExternalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHARACTER_PACKET_DRIVER: {
				CharacterPacketDriver characterPacketDriver = (CharacterPacketDriver)theEObject;
				T result = caseCharacterPacketDriver(characterPacketDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPOSITE_OPERATION: {
				CompositeOperation compositeOperation = (CompositeOperation)theEObject;
				T result = caseCompositeOperation(compositeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPOSITE_TIMING_REQUIREMENT: {
				CompositeTimingRequirement compositeTimingRequirement = (CompositeTimingRequirement)theEObject;
				T result = caseCompositeTimingRequirement(compositeTimingRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONCENTRATOR: {
				Concentrator concentrator = (Concentrator)theEObject;
				T result = caseConcentrator(concentrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DELIVERY_SERVER: {
				DeliveryServer deliveryServer = (DeliveryServer)theEObject;
				T result = caseDeliveryServer(deliveryServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EDF_POLICY: {
				EDFPolicy edfPolicy = (EDFPolicy)theEObject;
				T result = caseEDFPolicy(edfPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EDF_SCHEDULER: {
				EDFScheduler edfScheduler = (EDFScheduler)theEObject;
				T result = caseEDFScheduler(edfScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENCLOSING_OPERATION: {
				EnclosingOperation enclosingOperation = (EnclosingOperation)theEObject;
				T result = caseEnclosingOperation(enclosingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FIXED_PRIORITY_POLICY: {
				FixedPriorityPolicy fixedPriorityPolicy = (FixedPriorityPolicy)theEObject;
				T result = caseFixedPriorityPolicy(fixedPriorityPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FIXED_PRIORITY_SCHEDULER: {
				FixedPriorityScheduler fixedPriorityScheduler = (FixedPriorityScheduler)theEObject;
				T result = caseFixedPriorityScheduler(fixedPriorityScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FP_PACKET_BASED_SCHEDULER: {
				FPPacketBasedScheduler fpPacketBasedScheduler = (FPPacketBasedScheduler)theEObject;
				T result = caseFPPacketBasedScheduler(fpPacketBasedScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GLOBAL_MAX_MISS_RATIO: {
				GlobalMaxMissRatio globalMaxMissRatio = (GlobalMaxMissRatio)theEObject;
				T result = caseGlobalMaxMissRatio(globalMaxMissRatio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HARD_GLOBAL_DEADLINE: {
				HardGlobalDeadline hardGlobalDeadline = (HardGlobalDeadline)theEObject;
				T result = caseHardGlobalDeadline(hardGlobalDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HARD_LOCAL_DEADLINE: {
				HardLocalDeadline hardLocalDeadline = (HardLocalDeadline)theEObject;
				T result = caseHardLocalDeadline(hardLocalDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMMEDIATE_CEILING_RESOURCE: {
				ImmediateCeilingResource immediateCeilingResource = (ImmediateCeilingResource)theEObject;
				T result = caseImmediateCeilingResource(immediateCeilingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERRUPT_FP_POLICY: {
				InterruptFPPolicy interruptFPPolicy = (InterruptFPPolicy)theEObject;
				T result = caseInterruptFPPolicy(interruptFPPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LIST_OF_DRIVERS: {
				ListOfDrivers listOfDrivers = (ListOfDrivers)theEObject;
				T result = caseListOfDrivers(listOfDrivers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOCAL_MAX_MISS_RATIO: {
				LocalMaxMissRatio localMaxMissRatio = (LocalMaxMissRatio)theEObject;
				T result = caseLocalMaxMissRatio(localMaxMissRatio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MASTMODEL_TYPE: {
				MASTMODELType mastmodelType = (MASTMODELType)theEObject;
				T result = caseMASTMODELType(mastmodelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAX_OUTPUT_JITTER_REQ: {
				MaxOutputJitterReq maxOutputJitterReq = (MaxOutputJitterReq)theEObject;
				T result = caseMaxOutputJitterReq(maxOutputJitterReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MESSAGE_TRANSMISSION: {
				MessageTransmission messageTransmission = (MessageTransmission)theEObject;
				T result = caseMessageTransmission(messageTransmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MULTICAST: {
				Multicast multicast = (Multicast)theEObject;
				T result = caseMulticast(multicast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NON_PREEMPTIBLE_FP_POLICY: {
				NonPreemptibleFPPolicy nonPreemptibleFPPolicy = (NonPreemptibleFPPolicy)theEObject;
				T result = caseNonPreemptibleFPPolicy(nonPreemptibleFPPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OFFSET: {
				Offset offset = (Offset)theEObject;
				T result = caseOffset(offset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY: {
				OverriddenFixedPriority overriddenFixedPriority = (OverriddenFixedPriority)theEObject;
				T result = caseOverriddenFixedPriority(overriddenFixedPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OVERRIDDEN_PERMANENT_FP: {
				OverriddenPermanentFP overriddenPermanentFP = (OverriddenPermanentFP)theEObject;
				T result = caseOverriddenPermanentFP(overriddenPermanentFP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PACKET_BASED_NETWORK: {
				PacketBasedNetwork packetBasedNetwork = (PacketBasedNetwork)theEObject;
				T result = casePacketBasedNetwork(packetBasedNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PACKET_DRIVER: {
				PacketDriver packetDriver = (PacketDriver)theEObject;
				T result = casePacketDriver(packetDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PERIODIC_EXTERNAL_EVENT: {
				PeriodicExternalEvent periodicExternalEvent = (PeriodicExternalEvent)theEObject;
				T result = casePeriodicExternalEvent(periodicExternalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POLLING_POLICY: {
				PollingPolicy pollingPolicy = (PollingPolicy)theEObject;
				T result = casePollingPolicy(pollingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRIMARY_SCHEDULER: {
				PrimaryScheduler primaryScheduler = (PrimaryScheduler)theEObject;
				T result = casePrimaryScheduler(primaryScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRIORITY_INHERITANCE_RESOURCE: {
				PriorityInheritanceResource priorityInheritanceResource = (PriorityInheritanceResource)theEObject;
				T result = casePriorityInheritanceResource(priorityInheritanceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QUERY_SERVER: {
				QueryServer queryServer = (QueryServer)theEObject;
				T result = caseQueryServer(queryServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RATE_DIVISOR: {
				RateDivisor rateDivisor = (RateDivisor)theEObject;
				T result = caseRateDivisor(rateDivisor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REGULAR_EVENT: {
				RegularEvent regularEvent = (RegularEvent)theEObject;
				T result = caseRegularEvent(regularEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REGULAR_PROCESSOR: {
				RegularProcessor regularProcessor = (RegularProcessor)theEObject;
				T result = caseRegularProcessor(regularProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REGULAR_SCHEDULING_SERVER: {
				RegularSchedulingServer regularSchedulingServer = (RegularSchedulingServer)theEObject;
				T result = caseRegularSchedulingServer(regularSchedulingServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REGULAR_TRANSACTION: {
				RegularTransaction regularTransaction = (RegularTransaction)theEObject;
				T result = caseRegularTransaction(regularTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RTEP_PACKET_DRIVER: {
				RTEPPacketDriver rtepPacketDriver = (RTEPPacketDriver)theEObject;
				T result = caseRTEPPacketDriver(rtepPacketDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SECONDARY_SCHEDULER: {
				SecondaryScheduler secondaryScheduler = (SecondaryScheduler)theEObject;
				T result = caseSecondaryScheduler(secondaryScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIMPLE_OPERATION: {
				SimpleOperation simpleOperation = (SimpleOperation)theEObject;
				T result = caseSimpleOperation(simpleOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SINGULAR_EXTERNAL_EVENT: {
				SingularExternalEvent singularExternalEvent = (SingularExternalEvent)theEObject;
				T result = caseSingularExternalEvent(singularExternalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SOFT_GLOBAL_DEADLINE: {
				SoftGlobalDeadline softGlobalDeadline = (SoftGlobalDeadline)theEObject;
				T result = caseSoftGlobalDeadline(softGlobalDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SOFT_LOCAL_DEADLINE: {
				SoftLocalDeadline softLocalDeadline = (SoftLocalDeadline)theEObject;
				T result = caseSoftLocalDeadline(softLocalDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPORADIC_EXTERNAL_EVENT: {
				SporadicExternalEvent sporadicExternalEvent = (SporadicExternalEvent)theEObject;
				T result = caseSporadicExternalEvent(sporadicExternalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPORADIC_SERVER_POLICY: {
				SporadicServerPolicy sporadicServerPolicy = (SporadicServerPolicy)theEObject;
				T result = caseSporadicServerPolicy(sporadicServerPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SRP_PARAMETERS: {
				SRPParameters srpParameters = (SRPParameters)theEObject;
				T result = caseSRPParameters(srpParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SRP_RESOURCE: {
				SRPResource srpResource = (SRPResource)theEObject;
				T result = caseSRPResource(srpResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SYSTEM_TIMED_ACTIVITY: {
				SystemTimedActivity systemTimedActivity = (SystemTimedActivity)theEObject;
				T result = caseSystemTimedActivity(systemTimedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TICKER_SYSTEM_TIMER: {
				TickerSystemTimer tickerSystemTimer = (TickerSystemTimer)theEObject;
				T result = caseTickerSystemTimer(tickerSystemTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.UNBOUNDED_EXTERNAL_EVENT: {
				UnboundedExternalEvent unboundedExternalEvent = (UnboundedExternalEvent)theEObject;
				T result = caseUnboundedExternalEvent(unboundedExternalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Clock System Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Clock System Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmClockSystemTimer(AlarmClockSystemTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarrier(Barrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bursty External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bursty External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBurstyExternalEvent(BurstyExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Packet Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Packet Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterPacketDriver(CharacterPacketDriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeOperation(CompositeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Timing Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Timing Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTimingRequirement(CompositeTimingRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concentrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concentrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcentrator(Concentrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliveryServer(DeliveryServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDF Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDF Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDFPolicy(EDFPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDF Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDF Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDFScheduler(EDFScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enclosing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enclosing Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnclosingOperation(EnclosingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPriorityPolicy(FixedPriorityPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPriorityScheduler(FixedPriorityScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FP Packet Based Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FP Packet Based Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFPPacketBasedScheduler(FPPacketBasedScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Max Miss Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Max Miss Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalMaxMissRatio(GlobalMaxMissRatio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Global Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Global Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardGlobalDeadline(HardGlobalDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Local Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Local Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardLocalDeadline(HardLocalDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Ceiling Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Ceiling Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateCeilingResource(ImmediateCeilingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt FP Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt FP Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptFPPolicy(InterruptFPPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Drivers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Drivers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfDrivers(ListOfDrivers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Max Miss Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Max Miss Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalMaxMissRatio(LocalMaxMissRatio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MASTMODEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MASTMODEL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMASTMODELType(MASTMODELType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Output Jitter Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Output Jitter Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxOutputJitterReq(MaxOutputJitterReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Transmission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageTransmission(MessageTransmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multicast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multicast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulticast(Multicast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Preemptible FP Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Preemptible FP Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonPreemptibleFPPolicy(NonPreemptibleFPPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overridden Fixed Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overridden Fixed Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverriddenFixedPriority(OverriddenFixedPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overridden Permanent FP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overridden Permanent FP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverriddenPermanentFP(OverriddenPermanentFP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packet Based Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packet Based Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacketBasedNetwork(PacketBasedNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packet Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packet Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacketDriver(PacketDriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicExternalEvent(PeriodicExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollingPolicy(PollingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryScheduler(PrimaryScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Inheritance Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Inheritance Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityInheritanceResource(PriorityInheritanceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryServer(QueryServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Divisor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Divisor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateDivisor(RateDivisor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularEvent(RegularEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularProcessor(RegularProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Scheduling Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Scheduling Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularSchedulingServer(RegularSchedulingServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularTransaction(RegularTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTEP Packet Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTEP Packet Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTEPPacketDriver(RTEPPacketDriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryScheduler(SecondaryScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleOperation(SimpleOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singular External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singular External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingularExternalEvent(SingularExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Global Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Global Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftGlobalDeadline(SoftGlobalDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Local Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Local Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftLocalDeadline(SoftLocalDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicExternalEvent(SporadicExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Server Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Server Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicServerPolicy(SporadicServerPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRP Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRP Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRPParameters(SRPParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRP Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRP Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRPResource(SRPResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Timed Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Timed Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTimedActivity(SystemTimedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticker System Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticker System Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTickerSystemTimer(TickerSystemTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unbounded External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unbounded External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnboundedExternalEvent(UnboundedExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
