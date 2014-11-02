/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDF Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.EDFScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EDFScheduler#getBestContextSwitch <em>Best Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.EDFScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getEDFScheduler()
 * @model extendedMetaData="name='EDF_Scheduler' kind='empty'"
 * @generated
 */
public interface EDFScheduler extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEDFScheduler_AvgContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Avg_Context_Switch'"
	 * @generated
	 */
	float getAvgContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgContextSwitch()
	 * @see #getAvgContextSwitch()
	 * @see #setAvgContextSwitch(float)
	 * @generated
	 */
	void unsetAvgContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getAvgContextSwitch <em>Avg Context Switch</em>}' attribute is set.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEDFScheduler_BestContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Best_Context_Switch'"
	 * @generated
	 */
	float getBestContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getBestContextSwitch <em>Best Context Switch</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getBestContextSwitch <em>Best Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestContextSwitch()
	 * @see #getBestContextSwitch()
	 * @see #setBestContextSwitch(float)
	 * @generated
	 */
	void unsetBestContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getBestContextSwitch <em>Best Context Switch</em>}' attribute is set.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getEDFScheduler_WorstContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.NormalizedExecutionTime"
	 *        extendedMetaData="kind='attribute' name='Worst_Context_Switch'"
	 * @generated
	 */
	float getWorstContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorstContextSwitch()
	 * @see #getWorstContextSwitch()
	 * @see #setWorstContextSwitch(float)
	 * @generated
	 */
	void unsetWorstContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.EDFScheduler#getWorstContextSwitch <em>Worst Context Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst Context Switch</em>' attribute is set.
	 * @see #unsetWorstContextSwitch()
	 * @see #getWorstContextSwitch()
	 * @see #setWorstContextSwitch(float)
	 * @generated
	 */
	boolean isSetWorstContextSwitch();

} // EDFScheduler
