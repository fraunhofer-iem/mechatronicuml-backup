/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = es.unican.mast.xmlmast.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Alarm Clock System Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alarm Clock System Timer</em>'.
	 * @generated
	 */
	AlarmClockSystemTimer createAlarmClockSystemTimer();

	/**
	 * Returns a new object of class '<em>Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Barrier</em>'.
	 * @generated
	 */
	Barrier createBarrier();

	/**
	 * Returns a new object of class '<em>Bursty External Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bursty External Event</em>'.
	 * @generated
	 */
	BurstyExternalEvent createBurstyExternalEvent();

	/**
	 * Returns a new object of class '<em>Character Packet Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Packet Driver</em>'.
	 * @generated
	 */
	CharacterPacketDriver createCharacterPacketDriver();

	/**
	 * Returns a new object of class '<em>Composite Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Operation</em>'.
	 * @generated
	 */
	CompositeOperation createCompositeOperation();

	/**
	 * Returns a new object of class '<em>Composite Timing Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Timing Requirement</em>'.
	 * @generated
	 */
	CompositeTimingRequirement createCompositeTimingRequirement();

	/**
	 * Returns a new object of class '<em>Concentrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concentrator</em>'.
	 * @generated
	 */
	Concentrator createConcentrator();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Delivery Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Server</em>'.
	 * @generated
	 */
	DeliveryServer createDeliveryServer();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>EDF Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDF Policy</em>'.
	 * @generated
	 */
	EDFPolicy createEDFPolicy();

	/**
	 * Returns a new object of class '<em>EDF Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDF Scheduler</em>'.
	 * @generated
	 */
	EDFScheduler createEDFScheduler();

	/**
	 * Returns a new object of class '<em>Enclosing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enclosing Operation</em>'.
	 * @generated
	 */
	EnclosingOperation createEnclosingOperation();

	/**
	 * Returns a new object of class '<em>Fixed Priority Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Priority Policy</em>'.
	 * @generated
	 */
	FixedPriorityPolicy createFixedPriorityPolicy();

	/**
	 * Returns a new object of class '<em>Fixed Priority Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Priority Scheduler</em>'.
	 * @generated
	 */
	FixedPriorityScheduler createFixedPriorityScheduler();

	/**
	 * Returns a new object of class '<em>FP Packet Based Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FP Packet Based Scheduler</em>'.
	 * @generated
	 */
	FPPacketBasedScheduler createFPPacketBasedScheduler();

	/**
	 * Returns a new object of class '<em>Global Max Miss Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Max Miss Ratio</em>'.
	 * @generated
	 */
	GlobalMaxMissRatio createGlobalMaxMissRatio();

	/**
	 * Returns a new object of class '<em>Hard Global Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hard Global Deadline</em>'.
	 * @generated
	 */
	HardGlobalDeadline createHardGlobalDeadline();

	/**
	 * Returns a new object of class '<em>Hard Local Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hard Local Deadline</em>'.
	 * @generated
	 */
	HardLocalDeadline createHardLocalDeadline();

	/**
	 * Returns a new object of class '<em>Immediate Ceiling Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Ceiling Resource</em>'.
	 * @generated
	 */
	ImmediateCeilingResource createImmediateCeilingResource();

	/**
	 * Returns a new object of class '<em>Interrupt FP Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupt FP Policy</em>'.
	 * @generated
	 */
	InterruptFPPolicy createInterruptFPPolicy();

	/**
	 * Returns a new object of class '<em>List Of Drivers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Drivers</em>'.
	 * @generated
	 */
	ListOfDrivers createListOfDrivers();

	/**
	 * Returns a new object of class '<em>Local Max Miss Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Max Miss Ratio</em>'.
	 * @generated
	 */
	LocalMaxMissRatio createLocalMaxMissRatio();

	/**
	 * Returns a new object of class '<em>MASTMODEL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MASTMODEL Type</em>'.
	 * @generated
	 */
	MASTMODELType createMASTMODELType();

	/**
	 * Returns a new object of class '<em>Max Output Jitter Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Output Jitter Req</em>'.
	 * @generated
	 */
	MaxOutputJitterReq createMaxOutputJitterReq();

	/**
	 * Returns a new object of class '<em>Message Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Transmission</em>'.
	 * @generated
	 */
	MessageTransmission createMessageTransmission();

	/**
	 * Returns a new object of class '<em>Multicast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multicast</em>'.
	 * @generated
	 */
	Multicast createMulticast();

	/**
	 * Returns a new object of class '<em>Non Preemptible FP Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Preemptible FP Policy</em>'.
	 * @generated
	 */
	NonPreemptibleFPPolicy createNonPreemptibleFPPolicy();

	/**
	 * Returns a new object of class '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offset</em>'.
	 * @generated
	 */
	Offset createOffset();

	/**
	 * Returns a new object of class '<em>Overridden Fixed Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overridden Fixed Priority</em>'.
	 * @generated
	 */
	OverriddenFixedPriority createOverriddenFixedPriority();

	/**
	 * Returns a new object of class '<em>Overridden Permanent FP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overridden Permanent FP</em>'.
	 * @generated
	 */
	OverriddenPermanentFP createOverriddenPermanentFP();

	/**
	 * Returns a new object of class '<em>Packet Based Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Based Network</em>'.
	 * @generated
	 */
	PacketBasedNetwork createPacketBasedNetwork();

	/**
	 * Returns a new object of class '<em>Packet Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Driver</em>'.
	 * @generated
	 */
	PacketDriver createPacketDriver();

	/**
	 * Returns a new object of class '<em>Periodic External Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic External Event</em>'.
	 * @generated
	 */
	PeriodicExternalEvent createPeriodicExternalEvent();

	/**
	 * Returns a new object of class '<em>Polling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polling Policy</em>'.
	 * @generated
	 */
	PollingPolicy createPollingPolicy();

	/**
	 * Returns a new object of class '<em>Primary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Scheduler</em>'.
	 * @generated
	 */
	PrimaryScheduler createPrimaryScheduler();

	/**
	 * Returns a new object of class '<em>Priority Inheritance Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority Inheritance Resource</em>'.
	 * @generated
	 */
	PriorityInheritanceResource createPriorityInheritanceResource();

	/**
	 * Returns a new object of class '<em>Query Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Server</em>'.
	 * @generated
	 */
	QueryServer createQueryServer();

	/**
	 * Returns a new object of class '<em>Rate Divisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate Divisor</em>'.
	 * @generated
	 */
	RateDivisor createRateDivisor();

	/**
	 * Returns a new object of class '<em>Regular Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Event</em>'.
	 * @generated
	 */
	RegularEvent createRegularEvent();

	/**
	 * Returns a new object of class '<em>Regular Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Processor</em>'.
	 * @generated
	 */
	RegularProcessor createRegularProcessor();

	/**
	 * Returns a new object of class '<em>Regular Scheduling Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Scheduling Server</em>'.
	 * @generated
	 */
	RegularSchedulingServer createRegularSchedulingServer();

	/**
	 * Returns a new object of class '<em>Regular Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Transaction</em>'.
	 * @generated
	 */
	RegularTransaction createRegularTransaction();

	/**
	 * Returns a new object of class '<em>RTEP Packet Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTEP Packet Driver</em>'.
	 * @generated
	 */
	RTEPPacketDriver createRTEPPacketDriver();

	/**
	 * Returns a new object of class '<em>Secondary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secondary Scheduler</em>'.
	 * @generated
	 */
	SecondaryScheduler createSecondaryScheduler();

	/**
	 * Returns a new object of class '<em>Simple Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Operation</em>'.
	 * @generated
	 */
	SimpleOperation createSimpleOperation();

	/**
	 * Returns a new object of class '<em>Singular External Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singular External Event</em>'.
	 * @generated
	 */
	SingularExternalEvent createSingularExternalEvent();

	/**
	 * Returns a new object of class '<em>Soft Global Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soft Global Deadline</em>'.
	 * @generated
	 */
	SoftGlobalDeadline createSoftGlobalDeadline();

	/**
	 * Returns a new object of class '<em>Soft Local Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soft Local Deadline</em>'.
	 * @generated
	 */
	SoftLocalDeadline createSoftLocalDeadline();

	/**
	 * Returns a new object of class '<em>Sporadic External Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic External Event</em>'.
	 * @generated
	 */
	SporadicExternalEvent createSporadicExternalEvent();

	/**
	 * Returns a new object of class '<em>Sporadic Server Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Server Policy</em>'.
	 * @generated
	 */
	SporadicServerPolicy createSporadicServerPolicy();

	/**
	 * Returns a new object of class '<em>SRP Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRP Parameters</em>'.
	 * @generated
	 */
	SRPParameters createSRPParameters();

	/**
	 * Returns a new object of class '<em>SRP Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRP Resource</em>'.
	 * @generated
	 */
	SRPResource createSRPResource();

	/**
	 * Returns a new object of class '<em>System Timed Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Timed Activity</em>'.
	 * @generated
	 */
	SystemTimedActivity createSystemTimedActivity();

	/**
	 * Returns a new object of class '<em>Ticker System Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticker System Timer</em>'.
	 * @generated
	 */
	TickerSystemTimer createTickerSystemTimer();

	/**
	 * Returns a new object of class '<em>Unbounded External Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unbounded External Event</em>'.
	 * @generated
	 */
	UnboundedExternalEvent createUnboundedExternalEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
