/**
 */
package es.unican.mast.xmlmast.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.DeliveryServer#getDeliveryPolicy <em>Delivery Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.DeliveryServer#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.DeliveryServer#getOutputEventsList <em>Output Events List</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getDeliveryServer()
 * @model extendedMetaData="name='Delivery_Server' kind='empty'"
 * @generated
 */
public interface DeliveryServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Delivery Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.DeliveryPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Policy</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
	 * @see #isSetDeliveryPolicy()
	 * @see #unsetDeliveryPolicy()
	 * @see #setDeliveryPolicy(DeliveryPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getDeliveryServer_DeliveryPolicy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Delivery_Policy'"
	 * @generated
	 */
	DeliveryPolicy getDeliveryPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.DeliveryServer#getDeliveryPolicy <em>Delivery Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Policy</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.DeliveryPolicy
	 * @see #isSetDeliveryPolicy()
	 * @see #unsetDeliveryPolicy()
	 * @see #getDeliveryPolicy()
	 * @generated
	 */
	void setDeliveryPolicy(DeliveryPolicy value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.DeliveryServer#getDeliveryPolicy <em>Delivery Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeliveryPolicy()
	 * @see #getDeliveryPolicy()
	 * @see #setDeliveryPolicy(DeliveryPolicy)
	 * @generated
	 */
	void unsetDeliveryPolicy();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.DeliveryServer#getDeliveryPolicy <em>Delivery Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delivery Policy</em>' attribute is set.
	 * @see #unsetDeliveryPolicy()
	 * @see #getDeliveryPolicy()
	 * @see #setDeliveryPolicy(DeliveryPolicy)
	 * @generated
	 */
	boolean isSetDeliveryPolicy();

	/**
	 * Returns the value of the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event</em>' attribute.
	 * @see #setInputEvent(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getDeliveryServer_InputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Input_Event'"
	 * @generated
	 */
	String getInputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.DeliveryServer#getInputEvent <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' attribute.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(String value);

	/**
	 * Returns the value of the '<em><b>Output Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Events List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Events List</em>' attribute.
	 * @see #setOutputEventsList(List)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getDeliveryServer_OutputEventsList()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='Output_Events_List'"
	 * @generated
	 */
	List<String> getOutputEventsList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.DeliveryServer#getOutputEventsList <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Events List</em>' attribute.
	 * @see #getOutputEventsList()
	 * @generated
	 */
	void setOutputEventsList(List<String> value);

} // DeliveryServer
