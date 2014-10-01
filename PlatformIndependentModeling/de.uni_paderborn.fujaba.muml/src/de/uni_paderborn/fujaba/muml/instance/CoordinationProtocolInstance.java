/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Protocol Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a coordination protocol. It may also reference a specific coordination protocol part. It specifies the behavior of discrete (single/multi) port instances that are connected with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getCoordinationProtocolInstance()
 * @model
 * @generated
 */
public interface CoordinationProtocolInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instances that use this coordination protocol instance.
	 * 
	 * \todosd{I suggest to change this reference so that it references a DiscretePortInstance.}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getCoordinationProtocolInstance_PortInstances()
	 * @model required="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional CoordinationProtocolPart of that instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol Part</em>' reference.
	 * @see #setCoordinationProtocolPart(CoordinationProtocolPart)
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getCoordinationProtocolInstance_CoordinationProtocolPart()
	 * @model
	 * @generated
	 */
	CoordinationProtocolPart getCoordinationProtocolPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol Part</em>' reference.
	 * @see #getCoordinationProtocolPart()
	 * @generated
	 */
	void setCoordinationProtocolPart(CoordinationProtocolPart value);

	/**
	 * Returns the value of the '<em><b>Coordination Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol</em>' reference.
	 * @see #setCoordinationProtocol(CoordinationProtocol)
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getCoordinationProtocolInstance_CoordinationProtocol()
	 * @model required="true"
	 * @generated
	 */
	CoordinationProtocol getCoordinationProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance#getCoordinationProtocol <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol</em>' reference.
	 * @see #getCoordinationProtocol()
	 * @generated
	 */
	void setCoordinationProtocol(CoordinationProtocol value);

} // CoordinationProtocolInstance
