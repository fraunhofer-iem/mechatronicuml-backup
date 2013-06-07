/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordination protocol specifies the coordination between a certain number of communication members. The communication members are represented by roles. To specify which roles communicate whith each other they are connected by channels. The communication protocol used by the roles is specified by realtime statecharts. Each role has its own realtime statechart describing the roles communication behavior. Furthermore channels own a realtime statechart which enables specifying properties of certain real communication channels e.g. propagation delay or buffering of messages. Furthermore constraints can be assigned to coordination protocols. Constraints specify certain properties the coordination specified by the protocol has to fullfill.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol#getGmfCoordinationProtocol <em>Gmf Coordination Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getCoordinationProtocol()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CoordinationProtocolNamesMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CoordinationProtocolNamesMustBeUnique='CoordinationProtocol.allInstances()->isUnique(name)'"
 * @generated
 */
public interface CoordinationProtocol extends AbstractCoordinationSpecification {
	/**
	 * Returns the value of the '<em><b>Gmf Coordination Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived reference only exists because GMF needs it to visualize the inner hexagon of a Real-Time Coordination Protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Coordination Protocol</em>' containment reference.
	 * @see de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage#getCoordinationProtocol_GmfCoordinationProtocol()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self'"
	 * @generated
	 */
	CoordinationProtocol getGmfCoordinationProtocol();

} // CoordinationProtocol
