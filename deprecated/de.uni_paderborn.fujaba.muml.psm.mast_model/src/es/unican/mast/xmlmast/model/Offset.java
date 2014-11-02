/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.Offset#getDelayMaxInterval <em>Delay Max Interval</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.Offset#getDelayMinInterval <em>Delay Min Interval</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.Offset#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.Offset#getOutputEvent <em>Output Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.Offset#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getOffset()
 * @model extendedMetaData="name='Offset' kind='empty'"
 * @generated
 */
public interface Offset extends EObject {
	/**
	 * Returns the value of the '<em><b>Delay Max Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Max Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Max Interval</em>' attribute.
	 * @see #isSetDelayMaxInterval()
	 * @see #unsetDelayMaxInterval()
	 * @see #setDelayMaxInterval(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getOffset_DelayMaxInterval()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Delay_Max_Interval'"
	 * @generated
	 */
	float getDelayMaxInterval();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getDelayMaxInterval <em>Delay Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Max Interval</em>' attribute.
	 * @see #isSetDelayMaxInterval()
	 * @see #unsetDelayMaxInterval()
	 * @see #getDelayMaxInterval()
	 * @generated
	 */
	void setDelayMaxInterval(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getDelayMaxInterval <em>Delay Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelayMaxInterval()
	 * @see #getDelayMaxInterval()
	 * @see #setDelayMaxInterval(float)
	 * @generated
	 */
	void unsetDelayMaxInterval();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.Offset#getDelayMaxInterval <em>Delay Max Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay Max Interval</em>' attribute is set.
	 * @see #unsetDelayMaxInterval()
	 * @see #getDelayMaxInterval()
	 * @see #setDelayMaxInterval(float)
	 * @generated
	 */
	boolean isSetDelayMaxInterval();

	/**
	 * Returns the value of the '<em><b>Delay Min Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Min Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Min Interval</em>' attribute.
	 * @see #isSetDelayMinInterval()
	 * @see #unsetDelayMinInterval()
	 * @see #setDelayMinInterval(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getOffset_DelayMinInterval()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Delay_Min_Interval'"
	 * @generated
	 */
	float getDelayMinInterval();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getDelayMinInterval <em>Delay Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Min Interval</em>' attribute.
	 * @see #isSetDelayMinInterval()
	 * @see #unsetDelayMinInterval()
	 * @see #getDelayMinInterval()
	 * @generated
	 */
	void setDelayMinInterval(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getDelayMinInterval <em>Delay Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelayMinInterval()
	 * @see #getDelayMinInterval()
	 * @see #setDelayMinInterval(float)
	 * @generated
	 */
	void unsetDelayMinInterval();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.Offset#getDelayMinInterval <em>Delay Min Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay Min Interval</em>' attribute is set.
	 * @see #unsetDelayMinInterval()
	 * @see #getDelayMinInterval()
	 * @see #setDelayMinInterval(float)
	 * @generated
	 */
	boolean isSetDelayMinInterval();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getOffset_InputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Input_Event'"
	 * @generated
	 */
	String getInputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getInputEvent <em>Input Event</em>}' attribute.
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getOffset_OutputEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Output_Event'"
	 * @generated
	 */
	String getOutputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getOutputEvent <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' attribute.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(String value);

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getOffset_ReferencedEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Referenced_Event'"
	 * @generated
	 */
	String getReferencedEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.Offset#getReferencedEvent <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' attribute.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(String value);

} // Offset
