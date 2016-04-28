/**
 */
package org.muml.pm.hardware.hwresource;

import org.muml.mumlcore.CommentableElement;
import org.muml.pm.hardware.hwvaluetype.DataRate;
import org.muml.pm.hardware.hwvaluetype.DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents CommuniationMedia.
 * CommunicationMedia are used to connect HWPortInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationMedia#getDataFrameSize <em>Data Frame Size</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationMedia#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationMedia#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationMedia#isIsSerial <em>Is Serial</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationMedia()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationMedia extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of a data frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Frame Size</em>' containment reference.
	 * @see #setDataFrameSize(DataSize)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationMedia_DataFrameSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getDataFrameSize();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationMedia#getDataFrameSize <em>Data Frame Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Frame Size</em>' containment reference.
	 * @see #getDataFrameSize()
	 * @generated
	 */
	void setDataFrameSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of this CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(DataRate)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationMedia_Bandwidth()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationMedia#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationMedia_Protocol()
	 * @model required="true"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationMedia#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this CommunicationMedia uses a serial communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Serial</em>' attribute.
	 * @see #setIsSerial(boolean)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationMedia_IsSerial()
	 * @model
	 * @generated
	 */
	boolean isIsSerial();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationMedia#isIsSerial <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Serial</em>' attribute.
	 * @see #isIsSerial()
	 * @generated
	 */
	void setIsSerial(boolean value);

} // CommunicationMedia
