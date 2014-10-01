/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getTickerSystemTimer <em>Ticker System Timer</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getAlarmClockSystemTimer <em>Alarm Clock System Timer</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getAvgISRSwitch <em>Avg ISR Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getBestISRSwitch <em>Best ISR Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getMaxInterruptPriority <em>Max Interrupt Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getMinInterruptPriority <em>Min Interrupt Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularProcessor#getWorstISRSwitch <em>Worst ISR Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor()
 * @model extendedMetaData="name='Regular_Processor' kind='elementOnly'"
 * @generated
 */
public interface RegularProcessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticker System Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ticker System Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticker System Timer</em>' containment reference.
	 * @see #setTickerSystemTimer(TickerSystemTimer)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_TickerSystemTimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ticker_System_Timer' namespace='##targetNamespace'"
	 * @generated
	 */
	TickerSystemTimer getTickerSystemTimer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getTickerSystemTimer <em>Ticker System Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticker System Timer</em>' containment reference.
	 * @see #getTickerSystemTimer()
	 * @generated
	 */
	void setTickerSystemTimer(TickerSystemTimer value);

	/**
	 * Returns the value of the '<em><b>Alarm Clock System Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Clock System Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Clock System Timer</em>' containment reference.
	 * @see #setAlarmClockSystemTimer(AlarmClockSystemTimer)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_AlarmClockSystemTimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Alarm_Clock_System_Timer' namespace='##targetNamespace'"
	 * @generated
	 */
	AlarmClockSystemTimer getAlarmClockSystemTimer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getAlarmClockSystemTimer <em>Alarm Clock System Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Clock System Timer</em>' containment reference.
	 * @see #getAlarmClockSystemTimer()
	 * @generated
	 */
	void setAlarmClockSystemTimer(AlarmClockSystemTimer value);

	/**
	 * Returns the value of the '<em><b>Avg ISR Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg ISR Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg ISR Switch</em>' attribute.
	 * @see #isSetAvgISRSwitch()
	 * @see #unsetAvgISRSwitch()
	 * @see #setAvgISRSwitch(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_AvgISRSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Avg_ISR_Switch'"
	 * @generated
	 */
	float getAvgISRSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getAvgISRSwitch <em>Avg ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg ISR Switch</em>' attribute.
	 * @see #isSetAvgISRSwitch()
	 * @see #unsetAvgISRSwitch()
	 * @see #getAvgISRSwitch()
	 * @generated
	 */
	void setAvgISRSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getAvgISRSwitch <em>Avg ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgISRSwitch()
	 * @see #getAvgISRSwitch()
	 * @see #setAvgISRSwitch(float)
	 * @generated
	 */
	void unsetAvgISRSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getAvgISRSwitch <em>Avg ISR Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg ISR Switch</em>' attribute is set.
	 * @see #unsetAvgISRSwitch()
	 * @see #getAvgISRSwitch()
	 * @see #setAvgISRSwitch(float)
	 * @generated
	 */
	boolean isSetAvgISRSwitch();

	/**
	 * Returns the value of the '<em><b>Best ISR Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best ISR Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best ISR Switch</em>' attribute.
	 * @see #isSetBestISRSwitch()
	 * @see #unsetBestISRSwitch()
	 * @see #setBestISRSwitch(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_BestISRSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Best_ISR_Switch'"
	 * @generated
	 */
	float getBestISRSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getBestISRSwitch <em>Best ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best ISR Switch</em>' attribute.
	 * @see #isSetBestISRSwitch()
	 * @see #unsetBestISRSwitch()
	 * @see #getBestISRSwitch()
	 * @generated
	 */
	void setBestISRSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getBestISRSwitch <em>Best ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestISRSwitch()
	 * @see #getBestISRSwitch()
	 * @see #setBestISRSwitch(float)
	 * @generated
	 */
	void unsetBestISRSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getBestISRSwitch <em>Best ISR Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best ISR Switch</em>' attribute is set.
	 * @see #unsetBestISRSwitch()
	 * @see #getBestISRSwitch()
	 * @see #setBestISRSwitch(float)
	 * @generated
	 */
	boolean isSetBestISRSwitch();

	/**
	 * Returns the value of the '<em><b>Max Interrupt Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Interrupt Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interrupt Priority</em>' attribute.
	 * @see #setMaxInterruptPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_MaxInterruptPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.InterruptPriority"
	 *        extendedMetaData="kind='attribute' name='Max_Interrupt_Priority'"
	 * @generated
	 */
	BigInteger getMaxInterruptPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getMaxInterruptPriority <em>Max Interrupt Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interrupt Priority</em>' attribute.
	 * @see #getMaxInterruptPriority()
	 * @generated
	 */
	void setMaxInterruptPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Interrupt Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Interrupt Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interrupt Priority</em>' attribute.
	 * @see #setMinInterruptPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_MinInterruptPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.InterruptPriority"
	 *        extendedMetaData="kind='attribute' name='Min_Interrupt_Priority'"
	 * @generated
	 */
	BigInteger getMinInterruptPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getMinInterruptPriority <em>Min Interrupt Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interrupt Priority</em>' attribute.
	 * @see #getMinInterruptPriority()
	 * @generated
	 */
	void setMinInterruptPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #isSetSpeedFactor()
	 * @see #unsetSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_SpeedFactor()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Float"
	 *        extendedMetaData="kind='attribute' name='Speed_Factor'"
	 * @generated
	 */
	float getSpeedFactor();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #isSetSpeedFactor()
	 * @see #unsetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @generated
	 */
	void unsetSpeedFactor();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getSpeedFactor <em>Speed Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed Factor</em>' attribute is set.
	 * @see #unsetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @generated
	 */
	boolean isSetSpeedFactor();

	/**
	 * Returns the value of the '<em><b>Worst ISR Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst ISR Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst ISR Switch</em>' attribute.
	 * @see #isSetWorstISRSwitch()
	 * @see #unsetWorstISRSwitch()
	 * @see #setWorstISRSwitch(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularProcessor_WorstISRSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Worst_ISR_Switch'"
	 * @generated
	 */
	float getWorstISRSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getWorstISRSwitch <em>Worst ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst ISR Switch</em>' attribute.
	 * @see #isSetWorstISRSwitch()
	 * @see #unsetWorstISRSwitch()
	 * @see #getWorstISRSwitch()
	 * @generated
	 */
	void setWorstISRSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getWorstISRSwitch <em>Worst ISR Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstISRSwitch()
	 * @see #getWorstISRSwitch()
	 * @see #setWorstISRSwitch(float)
	 * @generated
	 */
	void unsetWorstISRSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.RegularProcessor#getWorstISRSwitch <em>Worst ISR Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst ISR Switch</em>' attribute is set.
	 * @see #unsetWorstISRSwitch()
	 * @see #getWorstISRSwitch()
	 * @see #setWorstISRSwitch(float)
	 * @generated
	 */
	boolean isSetWorstISRSwitch();

} // RegularProcessor
