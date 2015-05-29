/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware port of a PlatformPart and is derived from a HWPort.
 * The purpose of a HWPortPart is to enable the reuse of defined HWPorts in different HWPlatforms and in different Confiugrations.
 * For Instance, HWPortParts are derived from one HWPort but can be attached to different NetworkConnectors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getConnectedNetworkConnector <em>Connected Network Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getQueuingTime <em>Queuing Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPayloadDataSize <em>Payload Data Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentPlatformPart <em>Parent Platform Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getHwport <em>Hwport</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart()
 * @model
 * @generated
 */
public interface HWPortPart extends ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Connected Network Connector</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NetworkConnector which are connected to this HWPortPart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Network Connector</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_ConnectedNetworkConnector()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c|c.oclIsKindOf(hwplatform::NetworkConnector)).oclAsType(hwplatform::NetworkConnector)->asOrderedSet()'"
	 * @generated
	 */
	EList<NetworkConnector> getConnectedNetworkConnector();

	/**
	 * Returns the value of the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The queuing time of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queuing Time</em>' containment reference.
	 * @see #setQueuingTime(TimeInterval)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_QueuingTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeInterval getQueuingTime();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getQueuingTime <em>Queuing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queuing Time</em>' containment reference.
	 * @see #getQueuingTime()
	 * @generated
	 */
	void setQueuingTime(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average size of the payload data that is transmitted over this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Data Size</em>' containment reference.
	 * @see #setPayloadDataSize(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_PayloadDataSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getPayloadDataSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPayloadDataSize <em>Payload Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Data Size</em>' containment reference.
	 * @see #getPayloadDataSize()
	 * @generated
	 */
	void setPayloadDataSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Parent Platform Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getHwPortParts <em>Hw Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Platform Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PlatformPort to which is HWPortPart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Platform Part</em>' container reference.
	 * @see #setParentPlatformPart(PlatformPart)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_ParentPlatformPart()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getHwPortParts
	 * @model opposite="hwPortParts" required="true" transient="false"
	 * @generated
	 */
	PlatformPart getParentPlatformPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentPlatformPart <em>Parent Platform Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Platform Part</em>' container reference.
	 * @see #getParentPlatformPart()
	 * @generated
	 */
	void setParentPlatformPart(PlatformPart value);

	/**
	 * Returns the value of the '<em><b>Hwport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The original HWPort which is represented by this HWPortPart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwport</em>' reference.
	 * @see #setHwport(HWPort)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_Hwport()
	 * @model required="true"
	 * @generated
	 */
	HWPort getHwport();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getHwport <em>Hwport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwport</em>' reference.
	 * @see #getHwport()
	 * @generated
	 */
	void setHwport(HWPort value);

} // HWPortPart
