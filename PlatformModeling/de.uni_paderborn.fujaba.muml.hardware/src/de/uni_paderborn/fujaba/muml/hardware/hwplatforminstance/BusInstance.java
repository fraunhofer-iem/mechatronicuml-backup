/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart;

import org.eclipse.emf.common.util.EList;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getBusPart <em>Bus Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance()
 * @model
 * @generated
 */
public interface BusInstance extends CommunicationMediaInstance, ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Connected HW Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connected BusPortInstances. 
	 *  They are derived from the reference connectedHWPortInstances of the super class CommunicationMedia.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected HW Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance_ConnectedHWPortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances->select(c|c.oclIsKindOf(BusConnectorInstance))->collect(connectedHWPortInstances)->asOrderedSet()'"
	 * @generated
	 */
	EList<HWPortInstance> getConnectedHWPortInstances();

	/**
	 * Returns the value of the '<em><b>Bus Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Part</em>' reference.
	 * @see #setBusPart(BusPart)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage#getBusInstance_BusPart()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.type.oclIsUndefined()) then\n\tnull\nelse \n\tself.type.oclAsType(hwplatform::BusPart)\nendif'"
	 * @generated
	 */
	BusPart getBusPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance#getBusPart <em>Bus Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Part</em>' reference.
	 * @see #getBusPart()
	 * @generated
	 */
	void setBusPart(BusPart value);

} // BusInstance
