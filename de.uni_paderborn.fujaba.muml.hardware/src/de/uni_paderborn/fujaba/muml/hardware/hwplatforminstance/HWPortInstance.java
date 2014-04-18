/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getHwPortType <em>Hw Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getConnectedMediaInstances <em>Connected Media Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getPortKind <em>Port Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance()
 * @model
 * @generated
 */
public interface HWPortInstance extends HWPort, ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Hw Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstance from which this HWPortPart is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Port Type</em>' reference.
	 * @see #setHwPortType(CommunicationResource)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_HwPortType()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.type.oclIsKindOf(hwresource::CommunicationResource))\nthen\nself.type.oclAsType(hwresource::CommunicationResource)\nelse\nnull\nendif'"
	 * @generated
	 */
	CommunicationResource getHwPortType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getHwPortType <em>Hw Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Port Type</em>' reference.
	 * @see #getHwPortType()
	 * @generated
	 */
	void setHwPortType(CommunicationResource value);

	/**
	 * Returns the value of the '<em><b>Connected Media Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication media to which this HWPortPart is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Media Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_ConnectedMediaInstances()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\tself.connectorInstances.oclAsType(BusConnectorInstance).connectedBusInstance.oclAsType(CommunicationMediaInstance)->asOrderedSet()\nelse \n\tself.connectorInstances.oclAsType(CommunicationMediaInstance)->asOrderedSet()\nendif'"
	 * @generated
	 */
	EList<CommunicationMediaInstance> getConnectedMediaInstances();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used protocol of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_Protocol()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.hwPortType.oclIsUndefined()) then\n\tnull \nelse\n self.hwPortType.protocol\n endif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getHWPortInstance_PortKind()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.protocol.oclIsUndefined()) then\n\tnull\nelse if (self.protocol.oclIsKindOf(hwresource::BusProtocol)) then\n\t\thwresource::HWPortKind::BUS\nelse\n\t\thwresource::HWPortKind::LINK\nendif endif'"
	 * @generated
	 */
	HWPortKind getPortKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance#getPortKind <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind
	 * @see #getPortKind()
	 * @generated
	 */
	void setPortKind(HWPortKind value);

} // HWPortInstance
