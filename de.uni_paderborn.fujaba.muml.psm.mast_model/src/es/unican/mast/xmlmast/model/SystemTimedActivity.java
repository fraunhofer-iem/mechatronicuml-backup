/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Timed Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityOperation <em>Activity Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityServer <em>Activity Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getSystemTimedActivity()
 * @model extendedMetaData="name='System_Timed_Activity' kind='empty'"
 * @generated
 */
public interface SystemTimedActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Operation</em>' attribute.
	 * @see #setActivityOperation(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSystemTimedActivity_ActivityOperation()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Activity_Operation'"
	 * @generated
	 */
	String getActivityOperation();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityOperation <em>Activity Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Operation</em>' attribute.
	 * @see #getActivityOperation()
	 * @generated
	 */
	void setActivityOperation(String value);

	/**
	 * Returns the value of the '<em><b>Activity Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Server</em>' attribute.
	 * @see #setActivityServer(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSystemTimedActivity_ActivityServer()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Activity_Server'"
	 * @generated
	 */
	String getActivityServer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getActivityServer <em>Activity Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Server</em>' attribute.
	 * @see #getActivityServer()
	 * @generated
	 */
	void setActivityServer(String value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSystemTimedActivity_InputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Input_Event'"
	 * @generated
	 */
	String getInputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getInputEvent <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' attribute.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(String value);

	/**
	 * Returns the value of the '<em><b>Output Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Event</em>' attribute.
	 * @see #setOutputEvent(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getSystemTimedActivity_OutputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Output_Event'"
	 * @generated
	 */
	String getOutputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.SystemTimedActivity#getOutputEvent <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' attribute.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(String value);

} // SystemTimedActivity
