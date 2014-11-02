/**
 */
package es.unican.mast.xmlmast.result;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getBestGlobalResponseTimes <em>Best Global Response Times</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getJitters <em>Jitters</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getEventName <em>Event Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getNumOfSuspensions <em>Num Of Suspensions</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.TimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult()
 * @model extendedMetaData="name='Timing_Result' kind='elementOnly'"
 * @generated
 */
public interface TimingResult extends EObject {
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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_WorstGlobalResponseTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Worst_Global_Response_Times' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getWorstGlobalResponseTimes();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstGlobalResponseTimes <em>Worst Global Response Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Global Response Times</em>' containment reference.
	 * @see #getWorstGlobalResponseTimes()
	 * @generated
	 */
	void setWorstGlobalResponseTimes(GlobalResponseTimeList value);

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_BestGlobalResponseTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Best_Global_Response_Times' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getBestGlobalResponseTimes();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getBestGlobalResponseTimes <em>Best Global Response Times</em>}' containment reference.
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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_Jitters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Jitters' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalResponseTimeList getJitters();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getJitters <em>Jitters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitters</em>' containment reference.
	 * @see #getJitters()
	 * @generated
	 */
	void setJitters(GlobalResponseTimeList value);

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_BestLocalResponseTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Best_Local_Response_Time'"
	 * @generated
	 */
	float getBestLocalResponseTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestLocalResponseTime()
	 * @see #getBestLocalResponseTime()
	 * @see #setBestLocalResponseTime(float)
	 * @generated
	 */
	void unsetBestLocalResponseTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getBestLocalResponseTime <em>Best Local Response Time</em>}' attribute is set.
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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_EventName()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Event_Name'"
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_NumOfSuspensions()
	 * @model dataType="es.unican.mast.xmlmast.result.Natural"
	 *        extendedMetaData="kind='attribute' name='Num_Of_Suspensions'"
	 * @generated
	 */
	BigInteger getNumOfSuspensions();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getNumOfSuspensions <em>Num Of Suspensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Suspensions</em>' attribute.
	 * @see #getNumOfSuspensions()
	 * @generated
	 */
	void setNumOfSuspensions(BigInteger value);

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_WorstBlockingTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Worst_Blocking_Time'"
	 * @generated
	 */
	float getWorstBlockingTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstBlockingTime()
	 * @see #getWorstBlockingTime()
	 * @see #setWorstBlockingTime(float)
	 * @generated
	 */
	void unsetWorstBlockingTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstBlockingTime <em>Worst Blocking Time</em>}' attribute is set.
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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getTimingResult_WorstLocalResponseTime()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Worst_Local_Response_Time'"
	 * @generated
	 */
	float getWorstLocalResponseTime();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstLocalResponseTime()
	 * @see #getWorstLocalResponseTime()
	 * @see #setWorstLocalResponseTime(float)
	 * @generated
	 */
	void unsetWorstLocalResponseTime();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.TimingResult#getWorstLocalResponseTime <em>Worst Local Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Local Response Time</em>' attribute is set.
	 * @see #unsetWorstLocalResponseTime()
	 * @see #getWorstLocalResponseTime()
	 * @see #setWorstLocalResponseTime(float)
	 * @generated
	 */
	boolean isSetWorstLocalResponseTime();

} // TimingResult
