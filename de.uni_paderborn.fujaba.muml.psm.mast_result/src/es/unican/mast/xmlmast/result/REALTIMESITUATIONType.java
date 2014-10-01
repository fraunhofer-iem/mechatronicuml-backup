/**
 */
package es.unican.mast.xmlmast.result;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REALTIMESITUATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getTrace <em>Trace</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getProcessingResource <em>Processing Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSchedulingServer <em>Scheduling Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getSharedResource <em>Shared Resource</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationDate <em>Generation Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationProfile <em>Generation Profile</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType()
 * @model extendedMetaData="name='REAL_TIME_SITUATION_._type' kind='elementOnly'"
 * @generated
 */
public interface REALTIMESITUATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Slack</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.Slack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_Slack()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slack' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Slack> getSlack();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_Trace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Trace' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Trace> getTrace();

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.TransactionResults}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_Transaction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transaction' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TransactionResults> getTransaction();

	/**
	 * Returns the value of the '<em><b>Processing Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.ProcessingResourceResults}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_ProcessingResource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Processing_Resource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProcessingResourceResults> getProcessingResource();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.OperationResults}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_Operation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OperationResults> getOperation();

	/**
	 * Returns the value of the '<em><b>Scheduling Server</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.SchedulingServerResults}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Server</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_SchedulingServer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Scheduling_Server' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SchedulingServerResults> getSchedulingServer();

	/**
	 * Returns the value of the '<em><b>Shared Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.result.SharedResourceResults}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Resource</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_SharedResource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Shared_Resource' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SharedResourceResults> getSharedResource();

	/**
	 * Returns the value of the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Date</em>' attribute.
	 * @see #setGenerationDate(XMLGregorianCalendar)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_GenerationDate()
	 * @model dataType="es.unican.mast.xmlmast.result.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='Generation_Date'"
	 * @generated
	 */
	XMLGregorianCalendar getGenerationDate();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationDate <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Date</em>' attribute.
	 * @see #getGenerationDate()
	 * @generated
	 */
	void setGenerationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Generation Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Profile</em>' attribute.
	 * @see #setGenerationProfile(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_GenerationProfile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Generation_Profile'"
	 * @generated
	 */
	String getGenerationProfile();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationProfile <em>Generation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Profile</em>' attribute.
	 * @see #getGenerationProfile()
	 * @generated
	 */
	void setGenerationProfile(String value);

	/**
	 * Returns the value of the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Tool</em>' attribute.
	 * @see #setGenerationTool(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_GenerationTool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Generation_Tool'"
	 * @generated
	 */
	String getGenerationTool();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getGenerationTool <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Tool</em>' attribute.
	 * @see #getGenerationTool()
	 * @generated
	 */
	void setGenerationTool(String value);

	/**
	 * Returns the value of the '<em><b>Model Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Date</em>' attribute.
	 * @see #setModelDate(XMLGregorianCalendar)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_ModelDate()
	 * @model dataType="es.unican.mast.xmlmast.result.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='Model_Date'"
	 * @generated
	 */
	XMLGregorianCalendar getModelDate();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelDate <em>Model Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Date</em>' attribute.
	 * @see #getModelDate()
	 * @generated
	 */
	void setModelDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getREALTIMESITUATIONType_ModelName()
	 * @model dataType="es.unican.mast.xmlmast.result.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Model_Name'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.REALTIMESITUATIONType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

} // REALTIMESITUATIONType
