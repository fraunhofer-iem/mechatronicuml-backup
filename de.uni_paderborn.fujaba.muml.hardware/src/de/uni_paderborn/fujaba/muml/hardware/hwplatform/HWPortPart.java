/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;

import de.uni_paderborn.fujaba.muml.valuetype.Cardinality;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware port of a PlatformPart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCommunicationResource <em>Communication Resource</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getConnectedMediaPart <em>Connected Media Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#isMultiHWPort <em>Multi HW Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPortKind <em>Port Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getQueuingTime <em>Queuing Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPayloadDataSize <em>Payload Data Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getParentPlatformPart <em>Parent Platform Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameProtocol LinkPort2Link'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameProtocol='if (self.connectedMediaPart->size()>0) then\n\tself.connectedMediaPart->first().protocol=self.protocol\nelse true\nendif' LinkPort2Link='if (self.portKind.oclIsUndefined() and  self.connectedMediaPart->size()<1) then\n\ttrue\nelse \n\tif (self.portKind = hwresource::HWPortKind::BUS) then\n\t\tself.connectedMediaPart->forAll(c|c.oclIsKindOf(hwplatform::BusPart)) or self.connectors->forAll(c|c.oclIsKindOf(hwplatform::BusConnector) or c.oclIsKindOf(hwplatform::Delegation))\n\telse  self.connectors->forAll(c|c.oclIsKindOf(hwplatform::BusConnector) or c.oclIsKindOf(hwplatform::Delegation))\nendif endif'"
 * @generated
 */
public interface HWPortPart extends ConnectorEndpoint {
	/**
	 * Returns the value of the '<em><b>Communication Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Resource</em>' reference.
	 * @see #setCommunicationResource(CommunicationResource)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_CommunicationResource()
	 * @model required="true"
	 * @generated
	 */
	CommunicationResource getCommunicationResource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCommunicationResource <em>Communication Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Resource</em>' reference.
	 * @see #getCommunicationResource()
	 * @generated
	 */
	void setCommunicationResource(CommunicationResource value);

	/**
	 * Returns the value of the '<em><b>Connected Media Part</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication media to which this HWPortPart is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Media Part</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_ConnectedMediaPart()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\tself.connectors.oclAsType(hwplatform::BusConnector).connectedBusPart.oclAsType(hwplatform::CommunicationMediaPart)->asOrderedSet()\nelse \n\tself.connectors.oclAsType(hwplatform::CommunicationMediaPart)->asOrderedSet()\nendif'"
	 * @generated
	 */
	EList<CommunicationMediaPart> getConnectedMediaPart();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used protocol of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_Protocol()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.communicationResource.oclIsUndefined()) then\n\tnull \nelse\n self.communicationResource.protocol\n endif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of this HWPort.
	 * It determines the number of allowed hardware port instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_Cardinality()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.communicationResource.oclIsUndefined()) then\n\t null\n\telse\n\t \tself.communicationResource.cardinality\n\t endif'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Multi HW Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute indicates whether this HWPort is a multi port or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi HW Port</em>' attribute.
	 * @see #setMultiHWPort(boolean)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_MultiHWPort()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationResource.oclIsUndefined()) then\n\tfalse\nelse \n   self.communicationResource.multiHWPort\n  endif'"
	 * @generated
	 */
	boolean isMultiHWPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#isMultiHWPort <em>Multi HW Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi HW Port</em>' attribute.
	 * @see #isMultiHWPort()
	 * @generated
	 */
	void setMultiHWPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Port Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPort is  a bus or a link port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind
	 * @see #setPortKind(HWPortKind)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPortPart_PortKind()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.communicationResource.oclIsUndefined()) then\n\tnull\nelse \n   self.communicationResource.portKind\n  endif'"
	 * @generated
	 */
	HWPortKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(HWPortKind value);

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

} // HWPortPart
