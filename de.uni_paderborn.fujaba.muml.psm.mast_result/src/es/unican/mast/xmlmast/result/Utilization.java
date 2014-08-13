/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.Utilization#getTotal <em>Total</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getUtilization()
 * @model extendedMetaData="name='Utilization' kind='empty'"
 * @generated
 */
public interface Utilization extends EObject {
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
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getUtilization_Total()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Percentage"
	 *        extendedMetaData="kind='attribute' name='Total'"
	 * @generated
	 */
	float getTotal();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.Utilization#getTotal <em>Total</em>}' attribute.
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
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.Utilization#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotal()
	 * @see #getTotal()
	 * @see #setTotal(float)
	 * @generated
	 */
	void unsetTotal();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.Utilization#getTotal <em>Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total</em>' attribute is set.
	 * @see #unsetTotal()
	 * @see #getTotal()
	 * @see #setTotal(float)
	 * @generated
	 */
	boolean isSetTotal();

} // Utilization
