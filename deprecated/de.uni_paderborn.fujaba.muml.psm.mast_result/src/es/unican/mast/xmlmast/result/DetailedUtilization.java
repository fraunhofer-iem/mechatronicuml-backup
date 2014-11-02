/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detailed Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.DetailedUtilization#getApplication <em>Application</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.DetailedUtilization#getContextSwitch <em>Context Switch</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.DetailedUtilization#getDriver <em>Driver</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTimer <em>Timer</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTotal <em>Total</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getDetailedUtilization()
 * @model extendedMetaData="name='Detailed_Utilization' kind='empty'"
 * @generated
 */
public interface DetailedUtilization extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #isSetApplication()
	 * @see #unsetApplication()
	 * @see #setApplication(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getDetailedUtilization_Application()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Percentage"
	 *        extendedMetaData="kind='attribute' name='Application'"
	 * @generated
	 */
	float getApplication();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #isSetApplication()
	 * @see #unsetApplication()
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplication()
	 * @see #getApplication()
	 * @see #setApplication(float)
	 * @generated
	 */
	void unsetApplication();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getApplication <em>Application</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application</em>' attribute is set.
	 * @see #unsetApplication()
	 * @see #getApplication()
	 * @see #setApplication(float)
	 * @generated
	 */
	boolean isSetApplication();

	/**
	 * Returns the value of the '<em><b>Context Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Switch</em>' attribute.
	 * @see #isSetContextSwitch()
	 * @see #unsetContextSwitch()
	 * @see #setContextSwitch(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getDetailedUtilization_ContextSwitch()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Percentage"
	 *        extendedMetaData="kind='attribute' name='Context_Switch'"
	 * @generated
	 */
	float getContextSwitch();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getContextSwitch <em>Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Switch</em>' attribute.
	 * @see #isSetContextSwitch()
	 * @see #unsetContextSwitch()
	 * @see #getContextSwitch()
	 * @generated
	 */
	void setContextSwitch(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getContextSwitch <em>Context Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextSwitch()
	 * @see #getContextSwitch()
	 * @see #setContextSwitch(float)
	 * @generated
	 */
	void unsetContextSwitch();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getContextSwitch <em>Context Switch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Switch</em>' attribute is set.
	 * @see #unsetContextSwitch()
	 * @see #getContextSwitch()
	 * @see #setContextSwitch(float)
	 * @generated
	 */
	boolean isSetContextSwitch();

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #isSetDriver()
	 * @see #unsetDriver()
	 * @see #setDriver(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getDetailedUtilization_Driver()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Percentage"
	 *        extendedMetaData="kind='attribute' name='Driver'"
	 * @generated
	 */
	float getDriver();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #isSetDriver()
	 * @see #unsetDriver()
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDriver()
	 * @see #getDriver()
	 * @see #setDriver(float)
	 * @generated
	 */
	void unsetDriver();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getDriver <em>Driver</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Driver</em>' attribute is set.
	 * @see #unsetDriver()
	 * @see #getDriver()
	 * @see #setDriver(float)
	 * @generated
	 */
	boolean isSetDriver();

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #isSetTimer()
	 * @see #unsetTimer()
	 * @see #setTimer(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getDetailedUtilization_Timer()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Percentage"
	 *        extendedMetaData="kind='attribute' name='Timer'"
	 * @generated
	 */
	float getTimer();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #isSetTimer()
	 * @see #unsetTimer()
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimer()
	 * @see #getTimer()
	 * @see #setTimer(float)
	 * @generated
	 */
	void unsetTimer();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTimer <em>Timer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timer</em>' attribute is set.
	 * @see #unsetTimer()
	 * @see #getTimer()
	 * @see #setTimer(float)
	 * @generated
	 */
	boolean isSetTimer();

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #isSetTotal()
	 * @see #unsetTotal()
	 * @see #setTotal(float)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getDetailedUtilization_Total()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Percentage"
	 *        extendedMetaData="kind='attribute' name='Total'"
	 * @generated
	 */
	float getTotal();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #isSetTotal()
	 * @see #unsetTotal()
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotal()
	 * @see #getTotal()
	 * @see #setTotal(float)
	 * @generated
	 */
	void unsetTotal();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.DetailedUtilization#getTotal <em>Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total</em>' attribute is set.
	 * @see #unsetTotal()
	 * @see #getTotal()
	 * @see #setTotal(float)
	 * @generated
	 */
	boolean isSetTotal();

} // DetailedUtilization
