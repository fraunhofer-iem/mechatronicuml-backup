/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getDetailedUtilization <em>Detailed Utilization</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getReadyQueueSize <em>Ready Queue Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getProcessingResourceResults()
 * @model extendedMetaData="name='Processing_Resource_Results' kind='elementOnly'"
 * @generated
 */
public interface ProcessingResourceResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack</em>' containment reference.
	 * @see #setSlack(Slack)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getProcessingResourceResults_Slack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Slack' namespace='##targetNamespace'"
	 * @generated
	 */
	Slack getSlack();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getSlack <em>Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slack</em>' containment reference.
	 * @see #getSlack()
	 * @generated
	 */
	void setSlack(Slack value);

	/**
	 * Returns the value of the '<em><b>Detailed Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detailed Utilization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Utilization</em>' containment reference.
	 * @see #setDetailedUtilization(DetailedUtilization)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getProcessingResourceResults_DetailedUtilization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Detailed_Utilization' namespace='##targetNamespace'"
	 * @generated
	 */
	DetailedUtilization getDetailedUtilization();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getDetailedUtilization <em>Detailed Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Utilization</em>' containment reference.
	 * @see #getDetailedUtilization()
	 * @generated
	 */
	void setDetailedUtilization(DetailedUtilization value);

	/**
	 * Returns the value of the '<em><b>Ready Queue Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ready Queue Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ready Queue Size</em>' containment reference.
	 * @see #setReadyQueueSize(ReadyQueueSize)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getProcessingResourceResults_ReadyQueueSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ready_Queue_Size' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadyQueueSize getReadyQueueSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getReadyQueueSize <em>Ready Queue Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready Queue Size</em>' containment reference.
	 * @see #getReadyQueueSize()
	 * @generated
	 */
	void setReadyQueueSize(ReadyQueueSize value);

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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getProcessingResourceResults_Name()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.ProcessingResourceResults#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ProcessingResourceResults
