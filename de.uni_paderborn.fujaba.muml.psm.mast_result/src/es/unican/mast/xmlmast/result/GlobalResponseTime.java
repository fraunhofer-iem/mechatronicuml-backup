/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Response Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalResponseTime()
 * @model extendedMetaData="name='Global_Response_Time' kind='empty'"
 * @generated
 */
public interface GlobalResponseTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event</em>' attribute.
	 * @see #setReferencedEvent(String)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalResponseTime_ReferencedEvent()
	 * @model dataType="es.unican.mast.xmlmast.result.ExternalReference"
	 *        extendedMetaData="kind='attribute' name='Referenced_Event'"
	 * @generated
	 */
	String getReferencedEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getReferencedEvent <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' attribute.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(String value);

	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' attribute.
	 * @see #isSetTimeValue()
	 * @see #unsetTimeValue()
	 * @see #setTimeValue(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getGlobalResponseTime_TimeValue()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Time"
	 *        extendedMetaData="kind='attribute' name='Time_Value'"
	 * @generated
	 */
	float getTimeValue();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #isSetTimeValue()
	 * @see #unsetTimeValue()
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeValue()
	 * @see #getTimeValue()
	 * @see #setTimeValue(float)
	 * @generated
	 */
	void unsetTimeValue();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.GlobalResponseTime#getTimeValue <em>Time Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Value</em>' attribute is set.
	 * @see #unsetTimeValue()
	 * @see #getTimeValue()
	 * @see #setTimeValue(float)
	 * @generated
	 */
	boolean isSetTimeValue();

} // GlobalResponseTime
