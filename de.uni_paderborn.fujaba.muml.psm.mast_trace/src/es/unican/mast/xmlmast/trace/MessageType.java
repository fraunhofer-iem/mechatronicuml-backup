/**
 */
package es.unican.mast.xmlmast.trace;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.MessageType#getMid <em>Mid</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.MessageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessageType()
 * @model extendedMetaData="name='Message_Type' kind='empty'"
 * @generated
 */
public interface MessageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mid</em>' attribute.
	 * @see #setMid(BigInteger)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessageType_Mid()
	 * @model dataType="es.unican.mast.xmlmast.trace.MessageIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Mid'"
	 * @generated
	 */
	BigInteger getMid();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.MessageType#getMid <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mid</em>' attribute.
	 * @see #getMid()
	 * @generated
	 */
	void setMid(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getMessageType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.MessageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // MessageType
