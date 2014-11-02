/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getPeriodicExternalEvent <em>Periodic External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getSporadicExternalEvent <em>Sporadic External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getUnboundedExternalEvent <em>Unbounded External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getBurstyExternalEvent <em>Bursty External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getSingularExternalEvent <em>Singular External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getRegularEvent <em>Regular Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getActivity <em>Activity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getSystemTimedActivity <em>System Timed Activity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getConcentrator <em>Concentrator</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getBarrier <em>Barrier</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getDeliveryServer <em>Delivery Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getQueryServer <em>Query Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getRateDivisor <em>Rate Divisor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getDelay <em>Delay</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.RegularTransaction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction()
 * @model extendedMetaData="name='Regular_Transaction' kind='elementOnly'"
 * @generated
 */
public interface RegularTransaction extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Periodic External Event</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.PeriodicExternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic External Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic External Event</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_PeriodicExternalEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Periodic_External_Event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PeriodicExternalEvent> getPeriodicExternalEvent();

	/**
	 * Returns the value of the '<em><b>Sporadic External Event</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SporadicExternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sporadic External Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sporadic External Event</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_SporadicExternalEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sporadic_External_Event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SporadicExternalEvent> getSporadicExternalEvent();

	/**
	 * Returns the value of the '<em><b>Unbounded External Event</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.UnboundedExternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbounded External Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbounded External Event</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_UnboundedExternalEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Unbounded_External_Event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UnboundedExternalEvent> getUnboundedExternalEvent();

	/**
	 * Returns the value of the '<em><b>Bursty External Event</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.BurstyExternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bursty External Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bursty External Event</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_BurstyExternalEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bursty_External_Event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BurstyExternalEvent> getBurstyExternalEvent();

	/**
	 * Returns the value of the '<em><b>Singular External Event</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SingularExternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singular External Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singular External Event</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_SingularExternalEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Singular_External_Event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SingularExternalEvent> getSingularExternalEvent();

	/**
	 * Returns the value of the '<em><b>Regular Event</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.RegularEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Event</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_RegularEvent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Regular_Event' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RegularEvent> getRegularEvent();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Activity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>System Timed Activity</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.SystemTimedActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Timed Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Timed Activity</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_SystemTimedActivity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='System_Timed_Activity' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SystemTimedActivity> getSystemTimedActivity();

	/**
	 * Returns the value of the '<em><b>Concentrator</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.Concentrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentrator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentrator</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Concentrator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Concentrator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Concentrator> getConcentrator();

	/**
	 * Returns the value of the '<em><b>Barrier</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.Barrier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barrier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barrier</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Barrier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Barrier' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Barrier> getBarrier();

	/**
	 * Returns the value of the '<em><b>Delivery Server</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.DeliveryServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Server</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_DeliveryServer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Delivery_Server' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DeliveryServer> getDeliveryServer();

	/**
	 * Returns the value of the '<em><b>Query Server</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.QueryServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Server</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_QueryServer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Query_Server' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<QueryServer> getQueryServer();

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.Multicast}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicast</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Multicast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Multicast' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Multicast> getMulticast();

	/**
	 * Returns the value of the '<em><b>Rate Divisor</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.RateDivisor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Divisor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Divisor</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_RateDivisor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rate_Divisor' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RateDivisor> getRateDivisor();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.Delay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Delay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Delay' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Delay> getDelay();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.model.Offset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Offset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Offset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Offset> getOffset();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getRegularTransaction_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.RegularTransaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RegularTransaction
