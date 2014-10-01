/**
 */
package es.unican.mast.xmlmast.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Priority Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getBestContextSwitch <em>Best Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMaxPriority <em>Max Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMinPriority <em>Min Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getFixedPriorityScheduler()
 * @model extendedMetaData="name='Fixed_Priority_Scheduler' kind='empty'"
 * @generated
 */
public interface FixedPriorityScheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Avg Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Context Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Context Switch</em>' attribute.
	 * @see #isSetAvgContextSwitch()
	 * @see #unsetAvgContextSwitch()
	 * @see #setAvgContextSwitch(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFixedPriorityScheduler_AvgContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Avg_Context_Switch'"
	 * @generated
	 */
	float getAvgContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Context Switch</em>' attribute.
	 * @see #isSetAvgContextSwitch()
	 * @see #unsetAvgContextSwitch()
	 * @see #getAvgContextSwitch()
	 * @generated
	 */
	void setAvgContextSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgContextSwitch()
	 * @see #getAvgContextSwitch()
	 * @see #setAvgContextSwitch(float)
	 * @generated
	 */
	void unsetAvgContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Context Switch</em>' attribute is set.
	 * @see #unsetAvgContextSwitch()
	 * @see #getAvgContextSwitch()
	 * @see #setAvgContextSwitch(float)
	 * @generated
	 */
	boolean isSetAvgContextSwitch();

	/**
	 * Returns the value of the '<em><b>Best Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Context Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Context Switch</em>' attribute.
	 * @see #isSetBestContextSwitch()
	 * @see #unsetBestContextSwitch()
	 * @see #setBestContextSwitch(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFixedPriorityScheduler_BestContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Best_Context_Switch'"
	 * @generated
	 */
	float getBestContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getBestContextSwitch <em>Best Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Context Switch</em>' attribute.
	 * @see #isSetBestContextSwitch()
	 * @see #unsetBestContextSwitch()
	 * @see #getBestContextSwitch()
	 * @generated
	 */
	void setBestContextSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getBestContextSwitch <em>Best Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestContextSwitch()
	 * @see #getBestContextSwitch()
	 * @see #setBestContextSwitch(float)
	 * @generated
	 */
	void unsetBestContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getBestContextSwitch <em>Best Context Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best Context Switch</em>' attribute is set.
	 * @see #unsetBestContextSwitch()
	 * @see #getBestContextSwitch()
	 * @see #setBestContextSwitch(float)
	 * @generated
	 */
	boolean isSetBestContextSwitch();

	/**
	 * Returns the value of the '<em><b>Max Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Priority</em>' attribute.
	 * @see #setMaxPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFixedPriorityScheduler_MaxPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Max_Priority'"
	 * @generated
	 */
	BigInteger getMaxPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMaxPriority <em>Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Priority</em>' attribute.
	 * @see #getMaxPriority()
	 * @generated
	 */
	void setMaxPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Priority</em>' attribute.
	 * @see #setMinPriority(BigInteger)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFixedPriorityScheduler_MinPriority()
	 * @model dataType="es.unican.mast.xmlmast.model.Priority"
	 *        extendedMetaData="kind='attribute' name='Min_Priority'"
	 * @generated
	 */
	BigInteger getMinPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getMinPriority <em>Min Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Priority</em>' attribute.
	 * @see #getMinPriority()
	 * @generated
	 */
	void setMinPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Worst Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst Context Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst Context Switch</em>' attribute.
	 * @see #isSetWorstContextSwitch()
	 * @see #unsetWorstContextSwitch()
	 * @see #setWorstContextSwitch(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getFixedPriorityScheduler_WorstContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Worst_Context_Switch'"
	 * @generated
	 */
	float getWorstContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst Context Switch</em>' attribute.
	 * @see #isSetWorstContextSwitch()
	 * @see #unsetWorstContextSwitch()
	 * @see #getWorstContextSwitch()
	 * @generated
	 */
	void setWorstContextSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstContextSwitch()
	 * @see #getWorstContextSwitch()
	 * @see #setWorstContextSwitch(float)
	 * @generated
	 */
	void unsetWorstContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.FixedPriorityScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Context Switch</em>' attribute is set.
	 * @see #unsetWorstContextSwitch()
	 * @see #getWorstContextSwitch()
	 * @see #setWorstContextSwitch(float)
	 * @generated
	 */
	boolean isSetWorstContextSwitch();

} // FixedPriorityScheduler
