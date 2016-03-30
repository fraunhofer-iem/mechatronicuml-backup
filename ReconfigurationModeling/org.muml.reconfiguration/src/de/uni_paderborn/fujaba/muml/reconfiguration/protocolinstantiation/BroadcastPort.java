/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation;

import org.muml.pim.component.Port;
import org.muml.pim.connector.DiscreteInteractionEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A broadcast port is a discrete interaction endpoint that enables for the message
 * based communication with an unknown number of other systems. A message
 * send via a broadcast port is received by any other broadcast port that is "in reach".
 * Whether a broadcast port is "in reach" depends on the spatial distribution of
 * the systems and the communication medium. MechatronicUML allows 
 * broadcast communication only for two purposes: (1) executing a discovery protocol
 * that enables to identify systems that are in reach and (2) instantiating a 
 * real-time coordination protocol with another system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage#getBroadcastPort()
 * @model
 * @generated
 */
public interface BroadcastPort extends Port, DiscreteInteractionEndpoint {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of this broadcast port defines attributes that differ between 
	 * the different kinds of ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #isSetSpecification()
	 * @see #unsetSpecification()
	 * @see #setSpecification(BroadcastPortSpecification)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage#getBroadcastPort_Specification()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	BroadcastPortSpecification getSpecification();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #isSetSpecification()
	 * @see #unsetSpecification()
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BroadcastPortSpecification value);

	/**
	 * Unsets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecification()
	 * @see #getSpecification()
	 * @see #setSpecification(BroadcastPortSpecification)
	 * @generated
	 */
	void unsetSpecification();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getSpecification <em>Specification</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specification</em>' containment reference is set.
	 * @see #unsetSpecification()
	 * @see #getSpecification()
	 * @see #setSpecification(BroadcastPortSpecification)
	 * @generated
	 */
	boolean isSetSpecification();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"DISCOVERY"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the kind of broadcast port. The kind either denotes that this port executes
	 * a discovery protocol or that it is used for instantiating real-time coordination 
	 * protocols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind
	 * @see #setKind(BroadcastPortKind)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage#getBroadcastPort_Kind()
	 * @model default="DISCOVERY" required="true"
	 * @generated
	 */
	BroadcastPortKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.BroadcastPortKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BroadcastPortKind value);

} // BroadcastPort
