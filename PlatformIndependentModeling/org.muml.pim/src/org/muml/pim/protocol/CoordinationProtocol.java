/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordination protocol specifies the coordination between a certain number of communication members. The communication members are represented by roles. To specify which roles communicate whith each other they are connected by channels. The communication protocol used by the roles is specified by realtime statecharts. Each role has its own realtime statechart describing the roles communication behavior. Furthermore channels own a realtime statechart which enables specifying properties of certain real communication channels e.g. propagation delay or buffering of messages. Furthermore constraints can be assigned to coordination protocols. Constraints specify certain properties the coordination specified by the protocol has to fullfill.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.protocol.ProtocolPackage#getCoordinationProtocol()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CoordinationProtocolNamesMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CoordinationProtocolNamesMustBeUnique='-- Coordination Protocols must have unique names\r\nCoordinationProtocol.allInstances()->isUnique(name)'"
 * @generated
 */
public interface CoordinationProtocol extends AbstractCoordinationSpecification {

} // CoordinationProtocol
