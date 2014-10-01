/**
 */
package es.unican.mast.xmlmast.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.QueryServer#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.QueryServer#getOutputEventsList <em>Output Events List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.QueryServer#getRequestPolicy <em>Request Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getQueryServer()
 * @model extendedMetaData="name='Query_Server' kind='empty'"
 * @generated
 */
public interface QueryServer extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getQueryServer_InputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Input_Event'"
	 * @generated
	 */
	String getInputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.QueryServer#getInputEvent <em>Input Event</em>}' attribute.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getQueryServer_OutputEventsList()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRefList" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='Output_Events_List'"
	 * @generated
	 */
	List<String> getOutputEventsList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.QueryServer#getOutputEventsList <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Events List</em>' attribute.
	 * @see #getOutputEventsList()
	 * @generated
	 */
	void setOutputEventsList(List<String> value);

	/**
	 * Returns the value of the '<em><b>Request Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.model.RequestPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Policy</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.RequestPolicy
	 * @see #isSetRequestPolicy()
	 * @see #unsetRequestPolicy()
	 * @see #setRequestPolicy(RequestPolicy)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getQueryServer_RequestPolicy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Request_Policy'"
	 * @generated
	 */
	RequestPolicy getRequestPolicy();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.QueryServer#getRequestPolicy <em>Request Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Policy</em>' attribute.
	 * @see es.unican.mast.xmlmast.model.RequestPolicy
	 * @see #isSetRequestPolicy()
	 * @see #unsetRequestPolicy()
	 * @see #getRequestPolicy()
	 * @generated
	 */
	void setRequestPolicy(RequestPolicy value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.QueryServer#getRequestPolicy <em>Request Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestPolicy()
	 * @see #getRequestPolicy()
	 * @see #setRequestPolicy(RequestPolicy)
	 * @generated
	 */
	void unsetRequestPolicy();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.QueryServer#getRequestPolicy <em>Request Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Policy</em>' attribute is set.
	 * @see #unsetRequestPolicy()
	 * @see #getRequestPolicy()
	 * @see #setRequestPolicy(RequestPolicy)
	 * @generated
	 */
	boolean isSetRequestPolicy();

} // QueryServer
