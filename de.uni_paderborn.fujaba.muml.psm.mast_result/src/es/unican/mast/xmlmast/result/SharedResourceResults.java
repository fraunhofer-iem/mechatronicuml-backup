/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Resource Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.SharedResourceResults#getPriorityCeiling <em>Priority Ceiling</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SharedResourceResults#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SharedResourceResults#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SharedResourceResults#getPreemptionLevel <em>Preemption Level</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.SharedResourceResults#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getSharedResourceResults()
 * @model extendedMetaData="name='Shared_Resource_Results' kind='elementOnly'"
 * @generated
 */
public interface SharedResourceResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority Ceiling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Ceiling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Ceiling</em>' containment reference.
	 * @see #setPriorityCeiling(PriorityCeiling)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSharedResourceResults_PriorityCeiling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Priority_Ceiling' namespace='##targetNamespace'"
	 * @generated
	 */
	PriorityCeiling getPriorityCeiling();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getPriorityCeiling <em>Priority Ceiling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Ceiling</em>' containment reference.
	 * @see #getPriorityCeiling()
	 * @generated
	 */
	void setPriorityCeiling(PriorityCeiling value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' containment reference.
	 * @see #setUtilization(Utilization)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSharedResourceResults_Utilization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Utilization' namespace='##targetNamespace'"
	 * @generated
	 */
	Utilization getUtilization();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getUtilization <em>Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' containment reference.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(Utilization value);

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' containment reference.
	 * @see #setQueueSize(QueueSize)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSharedResourceResults_QueueSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Queue_Size' namespace='##targetNamespace'"
	 * @generated
	 */
	QueueSize getQueueSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getQueueSize <em>Queue Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' containment reference.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(QueueSize value);

	/**
	 * Returns the value of the '<em><b>Preemption Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption Level</em>' containment reference.
	 * @see #setPreemptionLevel(PreemptionLevel)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSharedResourceResults_PreemptionLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Preemption_Level' namespace='##targetNamespace'"
	 * @generated
	 */
	PreemptionLevel getPreemptionLevel();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getPreemptionLevel <em>Preemption Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption Level</em>' containment reference.
	 * @see #getPreemptionLevel()
	 * @generated
	 */
	void setPreemptionLevel(PreemptionLevel value);

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getSharedResourceResults_Name()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.SharedResourceResults#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SharedResourceResults
