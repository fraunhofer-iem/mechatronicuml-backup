/**
 */
package org.muml.pm.hardware.hwresource;

import org.muml.core.NamedElement;
import org.muml.pm.hardware.hwvaluetype.DataRate;
import org.muml.pm.hardware.hwvaluetype.DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents the CommunicationProtocol used by the HWPorts and CommunicationMedia.
 * It is used to match Ports and CommunicationMedia.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsTimeTriggered <em>Is Time Triggered</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsEventTriggered <em>Is Event Triggered</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getFurtherInformation <em>Further Information</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsNetworkingProtocol <em>Is Networking Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getDataFrameSize <em>Data Frame Size</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsSerial <em>Is Serial</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationProtocol extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Time Triggered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if the protocol is time triggered. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Time Triggered</em>' attribute.
	 * @see #setIsTimeTriggered(boolean)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_IsTimeTriggered()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsTimeTriggered();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsTimeTriggered <em>Is Time Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Time Triggered</em>' attribute.
	 * @see #isIsTimeTriggered()
	 * @generated
	 */
	void setIsTimeTriggered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Event Triggered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this protocol is event triggered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Event Triggered</em>' attribute.
	 * @see #setIsEventTriggered(boolean)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_IsEventTriggered()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsEventTriggered();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsEventTriggered <em>Is Event Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Event Triggered</em>' attribute.
	 * @see #isIsEventTriggered()
	 * @generated
	 */
	void setIsEventTriggered(boolean value);

	/**
	 * Returns the value of the '<em><b>Further Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Further information for this protocol (i.e. Version, or another Protocol).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Further Information</em>' attribute.
	 * @see #setFurtherInformation(String)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_FurtherInformation()
	 * @model
	 * @generated
	 */
	String getFurtherInformation();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getFurtherInformation <em>Further Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Further Information</em>' attribute.
	 * @see #getFurtherInformation()
	 * @generated
	 */
	void setFurtherInformation(String value);

	/**
	 * Returns the value of the '<em><b>Is Networking Protocol</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used t inidicate wether this Protocol is used for Networking ECUs or for triggering Sensors or Actuators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Networking Protocol</em>' attribute.
	 * @see #setIsNetworkingProtocol(boolean)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_IsNetworkingProtocol()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsNetworkingProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsNetworkingProtocol <em>Is Networking Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Networking Protocol</em>' attribute.
	 * @see #isIsNetworkingProtocol()
	 * @generated
	 */
	void setIsNetworkingProtocol(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of a data frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Frame Size</em>' containment reference.
	 * @see #setDataFrameSize(DataSize)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_DataFrameSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getDataFrameSize();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getDataFrameSize <em>Data Frame Size</em>}' containment reference.
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
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_Bandwidth()
	 * @model containment="true"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

	/**
	 * Returns the value of the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this CommunicationMedia uses a serial communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Serial</em>' attribute.
	 * @see #setIsSerial(boolean)
	 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getCommunicationProtocol_IsSerial()
	 * @model
	 * @generated
	 */
	boolean isIsSerial();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresource.CommunicationProtocol#isIsSerial <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Serial</em>' attribute.
	 * @see #isIsSerial()
	 * @generated
	 */
	void setIsSerial(boolean value);

} // CommunicationProtocol
