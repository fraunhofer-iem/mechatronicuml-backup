/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Clock System Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getAvgOverhead <em>Avg Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getBestOverhead <em>Best Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getWorstOverhead <em>Worst Overhead</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getAlarmClockSystemTimer()
 * @model extendedMetaData="name='Alarm_Clock_System_Timer' kind='empty'"
 * @generated
 */
public interface AlarmClockSystemTimer extends EObject {
	/**
	 * Returns the value of the '<em><b>Avg Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Overhead</em>' attribute.
	 * @see #isSetAvgOverhead()
	 * @see #unsetAvgOverhead()
	 * @see #setAvgOverhead(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getAlarmClockSystemTimer_AvgOverhead()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Avg_Overhead'"
	 * @generated
	 */
	float getAvgOverhead();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getAvgOverhead <em>Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Overhead</em>' attribute.
	 * @see #isSetAvgOverhead()
	 * @see #unsetAvgOverhead()
	 * @see #getAvgOverhead()
	 * @generated
	 */
	void setAvgOverhead(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getAvgOverhead <em>Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgOverhead()
	 * @see #getAvgOverhead()
	 * @see #setAvgOverhead(float)
	 * @generated
	 */
	void unsetAvgOverhead();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getAvgOverhead <em>Avg Overhead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Overhead</em>' attribute is set.
	 * @see #unsetAvgOverhead()
	 * @see #getAvgOverhead()
	 * @see #setAvgOverhead(float)
	 * @generated
	 */
	boolean isSetAvgOverhead();

	/**
	 * Returns the value of the '<em><b>Best Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Overhead</em>' attribute.
	 * @see #isSetBestOverhead()
	 * @see #unsetBestOverhead()
	 * @see #setBestOverhead(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getAlarmClockSystemTimer_BestOverhead()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Best_Overhead'"
	 * @generated
	 */
	float getBestOverhead();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getBestOverhead <em>Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Overhead</em>' attribute.
	 * @see #isSetBestOverhead()
	 * @see #unsetBestOverhead()
	 * @see #getBestOverhead()
	 * @generated
	 */
	void setBestOverhead(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getBestOverhead <em>Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestOverhead()
	 * @see #getBestOverhead()
	 * @see #setBestOverhead(float)
	 * @generated
	 */
	void unsetBestOverhead();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getBestOverhead <em>Best Overhead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best Overhead</em>' attribute is set.
	 * @see #unsetBestOverhead()
	 * @see #getBestOverhead()
	 * @see #setBestOverhead(float)
	 * @generated
	 */
	boolean isSetBestOverhead();

	/**
	 * Returns the value of the '<em><b>Worst Overhead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Overhead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Overhead</em>' attribute.
	 * @see #isSetWorstOverhead()
	 * @see #unsetWorstOverhead()
	 * @see #setWorstOverhead(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getAlarmClockSystemTimer_WorstOverhead()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Worst_Overhead'"
	 * @generated
	 */
	float getWorstOverhead();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getWorstOverhead <em>Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Overhead</em>' attribute.
	 * @see #isSetWorstOverhead()
	 * @see #unsetWorstOverhead()
	 * @see #getWorstOverhead()
	 * @generated
	 */
	void setWorstOverhead(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getWorstOverhead <em>Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstOverhead()
	 * @see #getWorstOverhead()
	 * @see #setWorstOverhead(float)
	 * @generated
	 */
	void unsetWorstOverhead();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.AlarmClockSystemTimer#getWorstOverhead <em>Worst Overhead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Overhead</em>' attribute is set.
	 * @see #unsetWorstOverhead()
	 * @see #getWorstOverhead()
	 * @see #setWorstOverhead(float)
	 * @generated
	 */
	boolean isSetWorstOverhead();

} // AlarmClockSystemTimer
