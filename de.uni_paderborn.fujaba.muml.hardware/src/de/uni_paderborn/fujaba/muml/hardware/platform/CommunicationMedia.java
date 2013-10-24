/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getDataFrameSize <em>Data Frame Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#isIsSerial <em>Is Serial</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedHWPortParts <em>Connected HW Port Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getConnectedBridges <em>Connected Bridges</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationMedia extends CommunicationResource {
	/**
	 * Returns the value of the '<em><b>Data Frame Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of a data frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Frame Size</em>' containment reference.
	 * @see #setDataFrameSize(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia_DataFrameSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getDataFrameSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getDataFrameSize <em>Data Frame Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Frame Size</em>' containment reference.
	 * @see #getDataFrameSize()
	 * @generated
	 */
	void setDataFrameSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Is Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this CommunicationMedia uses a serial communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Serial</em>' attribute.
	 * @see #setIsSerial(boolean)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia_IsSerial()
	 * @model
	 * @generated
	 */
	boolean isIsSerial();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#isIsSerial <em>Is Serial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Serial</em>' attribute.
	 * @see #isIsSerial()
	 * @generated
	 */
	void setIsSerial(boolean value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of this CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(DataRate)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia_Bandwidth()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getBandwidth <em>Bandwidth</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia_Protocol()
	 * @model required="true"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Connected HW Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getConnectedMedia <em>Connected Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected HWPortInstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia_ConnectedHWPortParts()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart#getConnectedMedia
	 * @model opposite="connectedMedia"
	 * @generated
	 */
	EList<HWPortPart> getConnectedHWPortParts();

	/**
	 * Returns the value of the '<em><b>Connected Bridges</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getConnectedCommunicationMedia <em>Connected Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Bridges this CommunicationMedia is connected to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Bridges</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getCommunicationMedia_ConnectedBridges()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bridge#getConnectedCommunicationMedia
	 * @model opposite="connectedCommunicationMedia"
	 * @generated
	 */
	EList<Bridge> getConnectedBridges();

} // CommunicationMedia
