/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pm.hardware.hwplatform.Bus;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bus. A bus is used to connect several BusPortInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance()
 * @model
 * @generated
 */
public interface BusInstance extends ConnectorEndpointInstance, NetworkingHardwareInstance {
	/**
	 * Returns the value of the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatforminstance.HWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected BusPortInstances. 
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Instances</em>' reference list.
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance_ConnectedHWPortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances->select(c|c.oclIsKindOf(hwplatforminstance::NetworkConnectorInstance))->collect(connectedHWPortInstances)->asOrderedSet()'"
	 * @generated
	 */
	EList<HWPortInstance> getConnectedHWPortInstances();

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Bus type of this BusInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Type</em>' reference.
	 * @see #setBusType(Bus)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance_BusType()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if  self.type.oclIsKindOf(hwplatform::Bus) then\r\n\tself.type.oclAsType(hwplatform::Bus)\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	Bus getBusType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getBusType <em>Bus Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' reference.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(Bus value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(CommunicationProtocol)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance_Protocol()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.busType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.busType.protocol\r\nendif\r\n'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bandwidth of this CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(DataRate)
	 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance_Bandwidth()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.busType.oclIsUndefined()) then\r\n\tnull\r\nelse \r\n\tself.busType.bandwidth\r\nendif'"
	 * @generated
	 */
	DataRate getBandwidth();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatforminstance.BusInstance#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(DataRate value);

} // BusInstance
