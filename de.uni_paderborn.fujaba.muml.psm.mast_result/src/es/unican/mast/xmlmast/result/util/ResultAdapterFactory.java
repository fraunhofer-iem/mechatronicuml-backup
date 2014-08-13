/**
 */
package es.unican.mast.xmlmast.result.util;

import es.unican.mast.xmlmast.result.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.result.ResultPackage
 * @generated
 */
public class ResultAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResultPackage.eINSTANCE;
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
	protected ResultSwitch<Adapter> modelSwitch =
		new ResultSwitch<Adapter>() {
			@Override
			public Adapter caseDetailedUtilization(DetailedUtilization object) {
				return createDetailedUtilizationAdapter();
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
			public Adapter caseFixedPriorityPolicy(FixedPriorityPolicy object) {
				return createFixedPriorityPolicyAdapter();
			}
			@Override
			public Adapter caseGlobalMissRatio(GlobalMissRatio object) {
				return createGlobalMissRatioAdapter();
			}
			@Override
			public Adapter caseGlobalMissRatioList(GlobalMissRatioList object) {
				return createGlobalMissRatioListAdapter();
			}
			@Override
			public Adapter caseGlobalResponseTime(GlobalResponseTime object) {
				return createGlobalResponseTimeAdapter();
			}
			@Override
			public Adapter caseGlobalResponseTimeList(GlobalResponseTimeList object) {
				return createGlobalResponseTimeListAdapter();
			}
			@Override
			public Adapter caseInterruptFPPolicy(InterruptFPPolicy object) {
				return createInterruptFPPolicyAdapter();
			}
			@Override
			public Adapter caseMissRatio(MissRatio object) {
				return createMissRatioAdapter();
			}
			@Override
			public Adapter caseMissRatioList(MissRatioList object) {
				return createMissRatioListAdapter();
			}
			@Override
			public Adapter caseNonPreemptibleFPPolicy(NonPreemptibleFPPolicy object) {
				return createNonPreemptibleFPPolicyAdapter();
			}
			@Override
			public Adapter caseOperationResults(OperationResults object) {
				return createOperationResultsAdapter();
			}
			@Override
			public Adapter casePollingPolicy(PollingPolicy object) {
				return createPollingPolicyAdapter();
			}
			@Override
			public Adapter casePreemptionLevel(PreemptionLevel object) {
				return createPreemptionLevelAdapter();
			}
			@Override
			public Adapter casePriorityCeiling(PriorityCeiling object) {
				return createPriorityCeilingAdapter();
			}
			@Override
			public Adapter caseProcessingResourceResults(ProcessingResourceResults object) {
				return createProcessingResourceResultsAdapter();
			}
			@Override
			public Adapter caseQueueSize(QueueSize object) {
				return createQueueSizeAdapter();
			}
			@Override
			public Adapter caseReadyQueueSize(ReadyQueueSize object) {
				return createReadyQueueSizeAdapter();
			}
			@Override
			public Adapter caseREALTIMESITUATIONType(REALTIMESITUATIONType object) {
				return createREALTIMESITUATIONTypeAdapter();
			}
			@Override
			public Adapter caseSchedulingServerResults(SchedulingServerResults object) {
				return createSchedulingServerResultsAdapter();
			}
			@Override
			public Adapter caseSharedResourceResults(SharedResourceResults object) {
				return createSharedResourceResultsAdapter();
			}
			@Override
			public Adapter caseSimulationTimingResult(SimulationTimingResult object) {
				return createSimulationTimingResultAdapter();
			}
			@Override
			public Adapter caseSlack(Slack object) {
				return createSlackAdapter();
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
			public Adapter caseTimingResult(TimingResult object) {
				return createTimingResultAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseTransactionResults(TransactionResults object) {
				return createTransactionResultsAdapter();
			}
			@Override
			public Adapter caseUtilization(Utilization object) {
				return createUtilizationAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.DetailedUtilization <em>Detailed Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.DetailedUtilization
	 * @generated
	 */
	public Adapter createDetailedUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.EDFPolicy <em>EDF Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.EDFPolicy
	 * @generated
	 */
	public Adapter createEDFPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.FixedPriorityPolicy <em>Fixed Priority Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.FixedPriorityPolicy
	 * @generated
	 */
	public Adapter createFixedPriorityPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.GlobalMissRatio <em>Global Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatio
	 * @generated
	 */
	public Adapter createGlobalMissRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.GlobalMissRatioList <em>Global Miss Ratio List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.GlobalMissRatioList
	 * @generated
	 */
	public Adapter createGlobalMissRatioListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.GlobalResponseTime <em>Global Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTime
	 * @generated
	 */
	public Adapter createGlobalResponseTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.GlobalResponseTimeList <em>Global Response Time List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.GlobalResponseTimeList
	 * @generated
	 */
	public Adapter createGlobalResponseTimeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy <em>Interrupt FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.InterruptFPPolicy
	 * @generated
	 */
	public Adapter createInterruptFPPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.MissRatio <em>Miss Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.MissRatio
	 * @generated
	 */
	public Adapter createMissRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.MissRatioList <em>Miss Ratio List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.MissRatioList
	 * @generated
	 */
	public Adapter createMissRatioListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.NonPreemptibleFPPolicy
	 * @generated
	 */
	public Adapter createNonPreemptibleFPPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.OperationResults <em>Operation Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.OperationResults
	 * @generated
	 */
	public Adapter createOperationResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.PollingPolicy <em>Polling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.PollingPolicy
	 * @generated
	 */
	public Adapter createPollingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.PreemptionLevel <em>Preemption Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.PreemptionLevel
	 * @generated
	 */
	public Adapter createPreemptionLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.PriorityCeiling <em>Priority Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.PriorityCeiling
	 * @generated
	 */
	public Adapter createPriorityCeilingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults <em>Processing Resource Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.ProcessingResourceResults
	 * @generated
	 */
	public Adapter createProcessingResourceResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.QueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.QueueSize
	 * @generated
	 */
	public Adapter createQueueSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.ReadyQueueSize <em>Ready Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.ReadyQueueSize
	 * @generated
	 */
	public Adapter createReadyQueueSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType <em>REALTIMESITUATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.REALTIMESITUATIONType
	 * @generated
	 */
	public Adapter createREALTIMESITUATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.SchedulingServerResults <em>Scheduling Server Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.SchedulingServerResults
	 * @generated
	 */
	public Adapter createSchedulingServerResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.SharedResourceResults <em>Shared Resource Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.SharedResourceResults
	 * @generated
	 */
	public Adapter createSharedResourceResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.SimulationTimingResult <em>Simulation Timing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.SimulationTimingResult
	 * @generated
	 */
	public Adapter createSimulationTimingResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.Slack <em>Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.Slack
	 * @generated
	 */
	public Adapter createSlackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.SporadicServerPolicy <em>Sporadic Server Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.SporadicServerPolicy
	 * @generated
	 */
	public Adapter createSporadicServerPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.SRPParameters <em>SRP Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.SRPParameters
	 * @generated
	 */
	public Adapter createSRPParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.TimingResult <em>Timing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.TimingResult
	 * @generated
	 */
	public Adapter createTimingResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.TransactionResults <em>Transaction Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.TransactionResults
	 * @generated
	 */
	public Adapter createTransactionResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.mast.xmlmast.result.Utilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.mast.xmlmast.result.Utilization
	 * @generated
	 */
	public Adapter createUtilizationAdapter() {
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

} //ResultAdapterFactory
