/**
 */
package es.unican.mast.xmlmast.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.Source#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.Source#getSid <em>Sid</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.trace.Source#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.trace.TracePackage#getSource()
 * @model extendedMetaData="name='Source' kind='empty'"
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getSource_Name()
	 * @model dataType="es.unican.mast.xmlmast.trace.ExternalReference"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.Source#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #isSetSid()
	 * @see #unsetSid()
	 * @see #setSid(int)
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getSource_Sid()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.trace.SourceIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Sid'"
	 * @generated
	 */
	int getSid();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.Source#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #isSetSid()
	 * @see #unsetSid()
	 * @see #getSid()
	 * @generated
	 */
	void setSid(int value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.trace.Source#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSid()
	 * @see #getSid()
	 * @see #setSid(int)
	 * @generated
	 */
	void unsetSid();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.trace.Source#getSid <em>Sid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sid</em>' attribute is set.
	 * @see #unsetSid()
	 * @see #getSid()
	 * @see #setSid(int)
	 * @generated
	 */
	boolean isSetSid();

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
	 * @see es.unican.mast.xmlmast.trace.TracePackage#getSource_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.trace.Source#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Source
