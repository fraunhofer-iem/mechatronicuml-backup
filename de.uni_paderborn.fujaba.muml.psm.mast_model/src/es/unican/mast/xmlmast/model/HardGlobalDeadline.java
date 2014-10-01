/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hard Global Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getHardGlobalDeadline()
 * @model extendedMetaData="name='Hard_Global_Deadline' kind='empty'"
 * @generated
 */
public interface HardGlobalDeadline extends EObject {
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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getHardGlobalDeadline_Deadline()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.Time"
	 *        extendedMetaData="kind='attribute' name='Deadline'"
	 * @generated
	 */
	float getDeadline();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getDeadline <em>Deadline</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getDeadline <em>Deadline</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Referenced Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event</em>' attribute.
	 * @see #setReferencedEvent(String)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getHardGlobalDeadline_ReferencedEvent()
	 * @model dataType="es.unican.mast.xmlmast.model.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Referenced_Event'"
	 * @generated
	 */
	String getReferencedEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.HardGlobalDeadline#getReferencedEvent <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' attribute.
	 * @see #getReferencedEvent()
	 * @generated
	 */
	void setReferencedEvent(String value);

} // HardGlobalDeadline
