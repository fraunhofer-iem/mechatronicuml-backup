/**
 */
package es.unican.mast.xmlmast.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MessageTransmission#getAvgMessageSize <em>Avg Message Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MessageTransmission#getMaxMessageSize <em>Max Message Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MessageTransmission#getMinMessageSize <em>Min Message Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.MessageTransmission#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission()
 * @model extendedMetaData="name='Message_Transmission' kind='elementOnly'"
 * @generated
 */
public interface MessageTransmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Overridden Fixed Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden Fixed Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden Fixed Priority</em>' containment reference.
	 * @see #setOverriddenFixedPriority(OverriddenFixedPriority)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission_OverriddenFixedPriority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Fixed_Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenFixedPriority getOverriddenFixedPriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden Fixed Priority</em>' containment reference.
	 * @see #getOverriddenFixedPriority()
	 * @generated
	 */
	void setOverriddenFixedPriority(OverriddenFixedPriority value);

	/**
	 * Returns the value of the '<em><b>Overridden Permanent FP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden Permanent FP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden Permanent FP</em>' containment reference.
	 * @see #setOverriddenPermanentFP(OverriddenPermanentFP)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission_OverriddenPermanentFP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Overridden_Permanent_FP' namespace='##targetNamespace'"
	 * @generated
	 */
	OverriddenPermanentFP getOverriddenPermanentFP();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden Permanent FP</em>' containment reference.
	 * @see #getOverriddenPermanentFP()
	 * @generated
	 */
	void setOverriddenPermanentFP(OverriddenPermanentFP value);

	/**
	 * Returns the value of the '<em><b>Avg Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Message Size</em>' attribute.
	 * @see #isSetAvgMessageSize()
	 * @see #unsetAvgMessageSize()
	 * @see #setAvgMessageSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission_AvgMessageSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Avg_Message_Size'"
	 * @generated
	 */
	float getAvgMessageSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getAvgMessageSize <em>Avg Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Message Size</em>' attribute.
	 * @see #isSetAvgMessageSize()
	 * @see #unsetAvgMessageSize()
	 * @see #getAvgMessageSize()
	 * @generated
	 */
	void setAvgMessageSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getAvgMessageSize <em>Avg Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgMessageSize()
	 * @see #getAvgMessageSize()
	 * @see #setAvgMessageSize(float)
	 * @generated
	 */
	void unsetAvgMessageSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getAvgMessageSize <em>Avg Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Message Size</em>' attribute is set.
	 * @see #unsetAvgMessageSize()
	 * @see #getAvgMessageSize()
	 * @see #setAvgMessageSize(float)
	 * @generated
	 */
	boolean isSetAvgMessageSize();

	/**
	 * Returns the value of the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Message Size</em>' attribute.
	 * @see #isSetMaxMessageSize()
	 * @see #unsetMaxMessageSize()
	 * @see #setMaxMessageSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission_MaxMessageSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Max_Message_Size'"
	 * @generated
	 */
	float getMaxMessageSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMaxMessageSize <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Size</em>' attribute.
	 * @see #isSetMaxMessageSize()
	 * @see #unsetMaxMessageSize()
	 * @see #getMaxMessageSize()
	 * @generated
	 */
	void setMaxMessageSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMaxMessageSize <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxMessageSize()
	 * @see #getMaxMessageSize()
	 * @see #setMaxMessageSize(float)
	 * @generated
	 */
	void unsetMaxMessageSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMaxMessageSize <em>Max Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Message Size</em>' attribute is set.
	 * @see #unsetMaxMessageSize()
	 * @see #getMaxMessageSize()
	 * @see #setMaxMessageSize(float)
	 * @generated
	 */
	boolean isSetMaxMessageSize();

	/**
	 * Returns the value of the '<em><b>Min Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Message Size</em>' attribute.
	 * @see #isSetMinMessageSize()
	 * @see #unsetMinMessageSize()
	 * @see #setMinMessageSize(float)
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission_MinMessageSize()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.model.BitCount"
	 *        extendedMetaData="kind='attribute' name='Min_Message_Size'"
	 * @generated
	 */
	float getMinMessageSize();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMinMessageSize <em>Min Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Message Size</em>' attribute.
	 * @see #isSetMinMessageSize()
	 * @see #unsetMinMessageSize()
	 * @see #getMinMessageSize()
	 * @generated
	 */
	void setMinMessageSize(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMinMessageSize <em>Min Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinMessageSize()
	 * @see #getMinMessageSize()
	 * @see #setMinMessageSize(float)
	 * @generated
	 */
	void unsetMinMessageSize();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getMinMessageSize <em>Min Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Message Size</em>' attribute is set.
	 * @see #unsetMinMessageSize()
	 * @see #getMinMessageSize()
	 * @see #setMinMessageSize(float)
	 * @generated
	 */
	boolean isSetMinMessageSize();

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
	 * @see es.unican.mast.xmlmast.model.ModelPackage#getMessageTransmission_Name()
	 * @model dataType="es.unican.mast.xmlmast.model.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.model.MessageTransmission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MessageTransmission
