/**
 */
package es.unican.mast.xmlmast.result;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Timing Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgGlobalResponseTimes <em>Avg Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestGlobalResponseTimes <em>Best Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getJitters <em>Jitters</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getLocalMissRatios <em>Local Miss Ratios</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getGlobalMissRatios <em>Global Miss Ratios</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgBlockingTime <em>Avg Blocking Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgLocalResponseTime <em>Avg Local Response Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getEventName <em>Event Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getMaxPreemptionTime <em>Max Preemption Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfQueuedActivations <em>Num Of Queued Activations</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfSuspensions <em>Num Of Suspensions</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getSuspensionTime <em>Suspension Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult()
 * @model extendedMetaData="name='Simulation_Timing_Result' kind='elementOnly'"
 * @generated
 */
public interface SimulationTimingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Worst Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Global Response Times</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Global Response Times</em>' containment reference.
	 * @see #setWorstGlobalResponseTimes(GlobalResponseTimeList)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_WorstGlobalResponseTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Worst_Global_Response_Times' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getWorstGlobalResponseTimes();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Global Response Times</em>' containment reference.
	 * @see #getWorstGlobalResponseTimes()
	 * @generated
	 */
	void setWorstGlobalResponseTimes(GlobalResponseTimeList value);

	/**
	 * Returns the value of the '<em><b>Avg Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Global Response Times</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Global Response Times</em>' containment reference.
	 * @see #setAvgGlobalResponseTimes(GlobalResponseTimeList)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_AvgGlobalResponseTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Avg_Global_Response_Times' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getAvgGlobalResponseTimes();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgGlobalResponseTimes <em>Avg Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Global Response Times</em>' containment reference.
	 * @see #getAvgGlobalResponseTimes()
	 * @generated
	 */
	void setAvgGlobalResponseTimes(GlobalResponseTimeList value);

	/**
	 * Returns the value of the '<em><b>Best Global Response Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Global Response Times</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Global Response Times</em>' containment reference.
	 * @see #setBestGlobalResponseTimes(GlobalResponseTimeList)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_BestGlobalResponseTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Best_Global_Response_Times' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getBestGlobalResponseTimes();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestGlobalResponseTimes <em>Best Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Global Response Times</em>' containment reference.
	 * @see #getBestGlobalResponseTimes()
	 * @generated
	 */
	void setBestGlobalResponseTimes(GlobalResponseTimeList value);

	/**
	 * Returns the value of the '<em><b>Jitters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitters</em>' containment reference.
	 * @see #setJitters(GlobalResponseTimeList)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_Jitters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Jitters' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getJitters();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getJitters <em>Jitters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitters</em>' containment reference.
	 * @see #getJitters()
	 * @generated
	 */
	void setJitters(GlobalResponseTimeList value);

	/**
	 * Returns the value of the '<em><b>Local Miss Ratios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Miss Ratios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Miss Ratios</em>' containment reference.
	 * @see #setLocalMissRatios(MissRatioList)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_LocalMissRatios()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Local_Miss_Ratios' namespace='##targetNamespace'"
	 * @generated
	 */
	MissRatioList getLocalMissRatios();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getLocalMissRatios <em>Local Miss Ratios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Miss Ratios</em>' containment reference.
	 * @see #getLocalMissRatios()
	 * @generated
	 */
	void setLocalMissRatios(MissRatioList value);

	/**
	 * Returns the value of the '<em><b>Global Miss Ratios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Miss Ratios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Miss Ratios</em>' containment reference.
	 * @see #setGlobalMissRatios(GlobalMissRatioList)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_GlobalMissRatios()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Global_Miss_Ratios' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalMissRatioList getGlobalMissRatios();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getGlobalMissRatios <em>Global Miss Ratios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Miss Ratios</em>' containment reference.
	 * @see #getGlobalMissRatios()
	 * @generated
	 */
	void setGlobalMissRatios(GlobalMissRatioList value);

	/**
	 * Returns the value of the '<em><b>Avg Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Blocking Time</em>' attribute.
	 * @see #isSetAvgBlockingTime()
	 * @see #unsetAvgBlockingTime()
	 * @see #setAvgBlockingTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_AvgBlockingTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Avg_Blocking_Time'"
	 * @generated
	 */
	float getAvgBlockingTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgBlockingTime <em>Avg Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Blocking Time</em>' attribute.
	 * @see #isSetAvgBlockingTime()
	 * @see #unsetAvgBlockingTime()
	 * @see #getAvgBlockingTime()
	 * @generated
	 */
	void setAvgBlockingTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgBlockingTime <em>Avg Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgBlockingTime()
	 * @see #getAvgBlockingTime()
	 * @see #setAvgBlockingTime(float)
	 * @generated
	 */
	void unsetAvgBlockingTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgBlockingTime <em>Avg Blocking Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Blocking Time</em>' attribute is set.
	 * @see #unsetAvgBlockingTime()
	 * @see #getAvgBlockingTime()
	 * @see #setAvgBlockingTime(float)
	 * @generated
	 */
	boolean isSetAvgBlockingTime();

	/**
	 * Returns the value of the '<em><b>Avg Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Local Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Local Response Time</em>' attribute.
	 * @see #isSetAvgLocalResponseTime()
	 * @see #unsetAvgLocalResponseTime()
	 * @see #setAvgLocalResponseTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_AvgLocalResponseTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Avg_Local_Response_Time'"
	 * @generated
	 */
	float getAvgLocalResponseTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgLocalResponseTime <em>Avg Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Local Response Time</em>' attribute.
	 * @see #isSetAvgLocalResponseTime()
	 * @see #unsetAvgLocalResponseTime()
	 * @see #getAvgLocalResponseTime()
	 * @generated
	 */
	void setAvgLocalResponseTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgLocalResponseTime <em>Avg Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgLocalResponseTime()
	 * @see #getAvgLocalResponseTime()
	 * @see #setAvgLocalResponseTime(float)
	 * @generated
	 */
	void unsetAvgLocalResponseTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getAvgLocalResponseTime <em>Avg Local Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Local Response Time</em>' attribute is set.
	 * @see #unsetAvgLocalResponseTime()
	 * @see #getAvgLocalResponseTime()
	 * @see #setAvgLocalResponseTime(float)
	 * @generated
	 */
	boolean isSetAvgLocalResponseTime();

	/**
	 * Returns the value of the '<em><b>Best Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Local Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Local Response Time</em>' attribute.
	 * @see #isSetBestLocalResponseTime()
	 * @see #unsetBestLocalResponseTime()
	 * @see #setBestLocalResponseTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_BestLocalResponseTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Best_Local_Response_Time'"
	 * @generated
	 */
	float getBestLocalResponseTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Local Response Time</em>' attribute.
	 * @see #isSetBestLocalResponseTime()
	 * @see #unsetBestLocalResponseTime()
	 * @see #getBestLocalResponseTime()
	 * @generated
	 */
	void setBestLocalResponseTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestLocalResponseTime()
	 * @see #getBestLocalResponseTime()
	 * @see #setBestLocalResponseTime(float)
	 * @generated
	 */
	void unsetBestLocalResponseTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best Local Response Time</em>' attribute is set.
	 * @see #unsetBestLocalResponseTime()
	 * @see #getBestLocalResponseTime()
	 * @see #setBestLocalResponseTime(float)
	 * @generated
	 */
	boolean isSetBestLocalResponseTime();

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_EventName()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Event_Name'"
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>Max Preemption Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Preemption Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Preemption Time</em>' attribute.
	 * @see #isSetMaxPreemptionTime()
	 * @see #unsetMaxPreemptionTime()
	 * @see #setMaxPreemptionTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_MaxPreemptionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Max_Preemption_Time'"
	 * @generated
	 */
	float getMaxPreemptionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getMaxPreemptionTime <em>Max Preemption Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Preemption Time</em>' attribute.
	 * @see #isSetMaxPreemptionTime()
	 * @see #unsetMaxPreemptionTime()
	 * @see #getMaxPreemptionTime()
	 * @generated
	 */
	void setMaxPreemptionTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getMaxPreemptionTime <em>Max Preemption Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxPreemptionTime()
	 * @see #getMaxPreemptionTime()
	 * @see #setMaxPreemptionTime(float)
	 * @generated
	 */
	void unsetMaxPreemptionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getMaxPreemptionTime <em>Max Preemption Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Preemption Time</em>' attribute is set.
	 * @see #unsetMaxPreemptionTime()
	 * @see #getMaxPreemptionTime()
	 * @see #setMaxPreemptionTime(float)
	 * @generated
	 */
	boolean isSetMaxPreemptionTime();

	/**
	 * Returns the value of the '<em><b>Num Of Queued Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Queued Activations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Queued Activations</em>' attribute.
	 * @see #setNumOfQueuedActivations(BigInteger)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_NumOfQueuedActivations()
	 * @model dataType="es.unican.mast.xmlmast.result.Natural"
	 *        extendedMetaData="kind='attribute' name='Num_Of_Queued_Activations'"
	 * @generated
	 */
	BigInteger getNumOfQueuedActivations();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfQueuedActivations <em>Num Of Queued Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Queued Activations</em>' attribute.
	 * @see #getNumOfQueuedActivations()
	 * @generated
	 */
	void setNumOfQueuedActivations(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num Of Suspensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Suspensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Suspensions</em>' attribute.
	 * @see #setNumOfSuspensions(BigInteger)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_NumOfSuspensions()
	 * @model dataType="es.unican.mast.xmlmast.result.Natural"
	 *        extendedMetaData="kind='attribute' name='Num_Of_Suspensions'"
	 * @generated
	 */
	BigInteger getNumOfSuspensions();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getNumOfSuspensions <em>Num Of Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Suspensions</em>' attribute.
	 * @see #getNumOfSuspensions()
	 * @generated
	 */
	void setNumOfSuspensions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Suspension Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspension Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspension Time</em>' attribute.
	 * @see #isSetSuspensionTime()
	 * @see #unsetSuspensionTime()
	 * @see #setSuspensionTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_SuspensionTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Suspension_Time'"
	 * @generated
	 */
	float getSuspensionTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getSuspensionTime <em>Suspension Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspension Time</em>' attribute.
	 * @see #isSetSuspensionTime()
	 * @see #unsetSuspensionTime()
	 * @see #getSuspensionTime()
	 * @generated
	 */
	void setSuspensionTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getSuspensionTime <em>Suspension Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuspensionTime()
	 * @see #getSuspensionTime()
	 * @see #setSuspensionTime(float)
	 * @generated
	 */
	void unsetSuspensionTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getSuspensionTime <em>Suspension Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suspension Time</em>' attribute is set.
	 * @see #unsetSuspensionTime()
	 * @see #getSuspensionTime()
	 * @see #setSuspensionTime(float)
	 * @generated
	 */
	boolean isSetSuspensionTime();

	/**
	 * Returns the value of the '<em><b>Worst Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Blocking Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Blocking Time</em>' attribute.
	 * @see #isSetWorstBlockingTime()
	 * @see #unsetWorstBlockingTime()
	 * @see #setWorstBlockingTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_WorstBlockingTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Worst_Blocking_Time'"
	 * @generated
	 */
	float getWorstBlockingTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Blocking Time</em>' attribute.
	 * @see #isSetWorstBlockingTime()
	 * @see #unsetWorstBlockingTime()
	 * @see #getWorstBlockingTime()
	 * @generated
	 */
	void setWorstBlockingTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstBlockingTime()
	 * @see #getWorstBlockingTime()
	 * @see #setWorstBlockingTime(float)
	 * @generated
	 */
	void unsetWorstBlockingTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Blocking Time</em>' attribute is set.
	 * @see #unsetWorstBlockingTime()
	 * @see #getWorstBlockingTime()
	 * @see #setWorstBlockingTime(float)
	 * @generated
	 */
	boolean isSetWorstBlockingTime();

	/**
	 * Returns the value of the '<em><b>Worst Local Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Local Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Local Response Time</em>' attribute.
	 * @see #isSetWorstLocalResponseTime()
	 * @see #unsetWorstLocalResponseTime()
	 * @see #setWorstLocalResponseTime(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSimulationTimingResult_WorstLocalResponseTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Worst_Local_Response_Time'"
	 * @generated
	 */
	float getWorstLocalResponseTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Local Response Time</em>' attribute.
	 * @see #isSetWorstLocalResponseTime()
	 * @see #unsetWorstLocalResponseTime()
	 * @see #getWorstLocalResponseTime()
	 * @generated
	 */
	void setWorstLocalResponseTime(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstLocalResponseTime()
	 * @see #getWorstLocalResponseTime()
	 * @see #setWorstLocalResponseTime(float)
	 * @generated
	 */
	void unsetWorstLocalResponseTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.SimulationTimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Local Response Time</em>' attribute is set.
	 * @see #unsetWorstLocalResponseTime()
	 * @see #getWorstLocalResponseTime()
	 * @see #setWorstLocalResponseTime(float)
	 * @generated
	 */
	boolean isSetWorstLocalResponseTime();

} // SimulationTimingResult
