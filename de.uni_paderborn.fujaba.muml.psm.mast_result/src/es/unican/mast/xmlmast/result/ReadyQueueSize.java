/**
 */
package es.unican.mast.xmlmast.result;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ready Queue Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.ReadyQueueSize#getMaxNum <em>Max Num</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getReadyQueueSize()
 * @model extendedMetaData="name='Ready_Queue_Size' kind='empty'"
 * @generated
 */
public interface ReadyQueueSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Num</em>' attribute.
	 * @see #setMaxNum(BigInteger)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getReadyQueueSize_MaxNum()
	 * @model dataType="es.unican.mast.xmlmast.result.Natural"
	 *        extendedMetaData="kind='attribute' name='Max_Num'"
	 * @generated
	 */
	BigInteger getMaxNum();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.ReadyQueueSize#getMaxNum <em>Max Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Num</em>' attribute.
	 * @see #getMaxNum()
	 * @generated
	 */
	void setMaxNum(BigInteger value);

} // ReadyQueueSize
