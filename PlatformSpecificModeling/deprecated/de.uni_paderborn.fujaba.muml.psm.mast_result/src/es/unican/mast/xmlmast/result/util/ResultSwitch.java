/**
 */
package es.unican.mast.xmlmast.result.util;

import es.unican.mast.xmlmast.result.*;

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
 * @see es.unican.mast.xmlmast.result.ResultPackage
 * @generated
 */
public class ResultSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSwitch() {
		if (modelPackage == null) {
			modelPackage = ResultPackage.eINSTANCE;
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
			case ResultPackage.DETAILED_UTILIZATION: {
				DetailedUtilization detailedUtilization = (DetailedUtilization)theEObject;
				T result = caseDetailedUtilization(detailedUtilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.EDF_POLICY: {
				EDFPolicy edfPolicy = (EDFPolicy)theEObject;
				T result = caseEDFPolicy(edfPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.FIXED_PRIORITY_POLICY: {
				FixedPriorityPolicy fixedPriorityPolicy = (FixedPriorityPolicy)theEObject;
				T result = caseFixedPriorityPolicy(fixedPriorityPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.GLOBAL_MISS_RATIO: {
				GlobalMissRatio globalMissRatio = (GlobalMissRatio)theEObject;
				T result = caseGlobalMissRatio(globalMissRatio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.GLOBAL_MISS_RATIO_LIST: {
				GlobalMissRatioList globalMissRatioList = (GlobalMissRatioList)theEObject;
				T result = caseGlobalMissRatioList(globalMissRatioList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.GLOBAL_RESPONSE_TIME: {
				GlobalResponseTime globalResponseTime = (GlobalResponseTime)theEObject;
				T result = caseGlobalResponseTime(globalResponseTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST: {
				GlobalResponseTimeList globalResponseTimeList = (GlobalResponseTimeList)theEObject;
				T result = caseGlobalResponseTimeList(globalResponseTimeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.INTERRUPT_FP_POLICY: {
				InterruptFPPolicy interruptFPPolicy = (InterruptFPPolicy)theEObject;
				T result = caseInterruptFPPolicy(interruptFPPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.MISS_RATIO: {
				MissRatio missRatio = (MissRatio)theEObject;
				T result = caseMissRatio(missRatio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.MISS_RATIO_LIST: {
				MissRatioList missRatioList = (MissRatioList)theEObject;
				T result = caseMissRatioList(missRatioList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.NON_PREEMPTIBLE_FP_POLICY: {
				NonPreemptibleFPPolicy nonPreemptibleFPPolicy = (NonPreemptibleFPPolicy)theEObject;
				T result = caseNonPreemptibleFPPolicy(nonPreemptibleFPPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.OPERATION_RESULTS: {
				OperationResults operationResults = (OperationResults)theEObject;
				T result = caseOperationResults(operationResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.POLLING_POLICY: {
				PollingPolicy pollingPolicy = (PollingPolicy)theEObject;
				T result = casePollingPolicy(pollingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.PREEMPTION_LEVEL: {
				PreemptionLevel preemptionLevel = (PreemptionLevel)theEObject;
				T result = casePreemptionLevel(preemptionLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.PRIORITY_CEILING: {
				PriorityCeiling priorityCeiling = (PriorityCeiling)theEObject;
				T result = casePriorityCeiling(priorityCeiling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.PROCESSING_RESOURCE_RESULTS: {
				ProcessingResourceResults processingResourceResults = (ProcessingResourceResults)theEObject;
				T result = caseProcessingResourceResults(processingResourceResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.QUEUE_SIZE: {
				QueueSize queueSize = (QueueSize)theEObject;
				T result = caseQueueSize(queueSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.READY_QUEUE_SIZE: {
				ReadyQueueSize readyQueueSize = (ReadyQueueSize)theEObject;
				T result = caseReadyQueueSize(readyQueueSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.REALTIMESITUATION_TYPE: {
				REALTIMESITUATIONType realtimesituationType = (REALTIMESITUATIONType)theEObject;
				T result = caseREALTIMESITUATIONType(realtimesituationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.SCHEDULING_SERVER_RESULTS: {
				SchedulingServerResults schedulingServerResults = (SchedulingServerResults)theEObject;
				T result = caseSchedulingServerResults(schedulingServerResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.SHARED_RESOURCE_RESULTS: {
				SharedResourceResults sharedResourceResults = (SharedResourceResults)theEObject;
				T result = caseSharedResourceResults(sharedResourceResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.SIMULATION_TIMING_RESULT: {
				SimulationTimingResult simulationTimingResult = (SimulationTimingResult)theEObject;
				T result = caseSimulationTimingResult(simulationTimingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.SLACK: {
				Slack slack = (Slack)theEObject;
				T result = caseSlack(slack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.SPORADIC_SERVER_POLICY: {
				SporadicServerPolicy sporadicServerPolicy = (SporadicServerPolicy)theEObject;
				T result = caseSporadicServerPolicy(sporadicServerPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.SRP_PARAMETERS: {
				SRPParameters srpParameters = (SRPParameters)theEObject;
				T result = caseSRPParameters(srpParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.TIMING_RESULT: {
				TimingResult timingResult = (TimingResult)theEObject;
				T result = caseTimingResult(timingResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.TRANSACTION_RESULTS: {
				TransactionResults transactionResults = (TransactionResults)theEObject;
				T result = caseTransactionResults(transactionResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultPackage.UTILIZATION: {
				Utilization utilization = (Utilization)theEObject;
				T result = caseUtilization(utilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detailed Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detailed Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailedUtilization(DetailedUtilization object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Global Miss Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Miss Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalMissRatio(GlobalMissRatio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Miss Ratio List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Miss Ratio List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalMissRatioList(GlobalMissRatioList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Response Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Response Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalResponseTime(GlobalResponseTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Response Time List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Response Time List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalResponseTimeList(GlobalResponseTimeList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Miss Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Miss Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissRatio(MissRatio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Miss Ratio List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Miss Ratio List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissRatioList(MissRatioList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationResults(OperationResults object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Preemption Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preemption Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreemptionLevel(PreemptionLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Ceiling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Ceiling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityCeiling(PriorityCeiling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResourceResults(ProcessingResourceResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueSize(QueueSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ready Queue Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ready Queue Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadyQueueSize(ReadyQueueSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALTIMESITUATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALTIMESITUATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALTIMESITUATIONType(REALTIMESITUATIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Server Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Server Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingServerResults(SchedulingServerResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Resource Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Resource Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedResourceResults(SharedResourceResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Timing Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Timing Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationTimingResult(SimulationTimingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlack(Slack object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Timing Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingResult(TimingResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionResults(TransactionResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilization(Utilization object) {
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

} //ResultSwitch
