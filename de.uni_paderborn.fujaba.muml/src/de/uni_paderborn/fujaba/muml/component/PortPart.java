/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

import de.uni_paderborn.fujaba.muml.protocol.Role;

import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortPart#getRefinedRole <em>Refined Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart()
 * @model
 * @generated
 */
public interface PortPart extends ConnectorEndpoint, DataType {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(Port)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_PortType()
	 * @model required="true"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(Port value);

	/**
	 * Returns the value of the '<em><b>Component Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.ComponentPart#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Part</em>' container reference.
	 * @see #setComponentPart(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_ComponentPart()
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPart#getPortParts
	 * @model opposite="portParts" required="true" transient="false"
	 * @generated
	 */
	ComponentPart getComponentPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getComponentPart <em>Component Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' container reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Coordination Protocol Occurence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence#getPortParts <em>Port Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Protocol Occurence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Protocol Occurence</em>' reference.
	 * @see #setCoordinationProtocolOccurence(CoordinationProtocolOccurrence)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_CoordinationProtocolOccurence()
	 * @see de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence#getPortParts
	 * @model opposite="portParts"
	 * @generated
	 */
	CoordinationProtocolOccurrence getCoordinationProtocolOccurence();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortPart#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Protocol Occurence</em>' reference.
	 * @see #getCoordinationProtocolOccurence()
	 * @generated
	 */
	void setCoordinationProtocolOccurence(CoordinationProtocolOccurrence value);

	/**
	 * Returns the value of the '<em><b>Refined Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role of a coordination protocol that this partial instance of a port refines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined Role</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortPart_RefinedRole()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.portType.oclIsKindOf(DiscretePort)) then\r\nself.portType.oclAsType(DiscretePort).refinedRole\r\nelse\r\nnull\r\nendif'"
	 * @generated
	 */
	Role getRefinedRole();

} // PortPart
