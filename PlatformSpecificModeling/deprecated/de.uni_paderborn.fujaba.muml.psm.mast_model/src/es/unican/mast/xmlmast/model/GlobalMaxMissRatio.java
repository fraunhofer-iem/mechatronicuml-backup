/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Max Miss Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getRatio <em>Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getGlobalMaxMissRatio()
 * @model extendedMetaData="name='Global_Max_Miss_Ratio' kind='empty'"
 * @generated
 */
public interface GlobalMaxMissRatio extends EObject {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getGlobalMaxMissRatio_Deadline()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Deadline'"
	 * @generated
	 */
	float getDeadline();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	boolean isSetDeadline();

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #isSetRatio()
	 * @see #unsetRatio()
	 * @see #setRatio(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getGlobalMaxMissRatio_Ratio()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Percentage"
	 *        extendedMetaData="kind='attribute' name='Ratio'"
	 * @generated
	 */
	float getRatio();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #isSetRatio()
	 * @see #unsetRatio()
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatio()
	 * @see #getRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	void unsetRatio();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getRatio <em>Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ratio</em>' attribute is set.
	 * @see #unsetRatio()
	 * @see #getRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	boolean isSetRatio();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getGlobalMaxMissRatio_ReferencedEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Referenced_Event'"
	 * @generated
	 */
	String getReferencedEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.GlobalMaxMissRatio#getReferencedEvent <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' attribute.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(String value);

} // GlobalMaxMissRatio
