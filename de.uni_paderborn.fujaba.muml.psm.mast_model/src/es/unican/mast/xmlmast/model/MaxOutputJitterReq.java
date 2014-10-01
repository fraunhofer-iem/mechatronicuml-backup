/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Output Jitter Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getMaxOutputJitter <em>Max Output Jitter</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getMaxOutputJitterReq()
 * @model extendedMetaData="name='Max_Output_Jitter_Req' kind='empty'"
 * @generated
 */
public interface MaxOutputJitterReq extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Output Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Output Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Output Jitter</em>' attribute.
	 * @see #isSetMaxOutputJitter()
	 * @see #unsetMaxOutputJitter()
	 * @see #setMaxOutputJitter(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMaxOutputJitterReq_MaxOutputJitter()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Max_Output_Jitter'"
	 * @generated
	 */
	float getMaxOutputJitter();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getMaxOutputJitter <em>Max Output Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Output Jitter</em>' attribute.
	 * @see #isSetMaxOutputJitter()
	 * @see #unsetMaxOutputJitter()
	 * @see #getMaxOutputJitter()
	 * @generated
	 */
	void setMaxOutputJitter(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getMaxOutputJitter <em>Max Output Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxOutputJitter()
	 * @see #getMaxOutputJitter()
	 * @see #setMaxOutputJitter(float)
	 * @generated
	 */
	void unsetMaxOutputJitter();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getMaxOutputJitter <em>Max Output Jitter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Output Jitter</em>' attribute is set.
	 * @see #unsetMaxOutputJitter()
	 * @see #getMaxOutputJitter()
	 * @see #setMaxOutputJitter(float)
	 * @generated
	 */
	boolean isSetMaxOutputJitter();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMaxOutputJitterReq_ReferencedEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Referenced_Event'"
	 * @generated
	 */
	String getReferencedEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MaxOutputJitterReq#getReferencedEvent <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' attribute.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(String value);

} // MaxOutputJitterReq
