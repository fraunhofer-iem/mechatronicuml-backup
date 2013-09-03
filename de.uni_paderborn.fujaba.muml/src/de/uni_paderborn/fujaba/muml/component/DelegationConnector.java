/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation connector. A delegation connector 
 * connects a port of a structured component type and a port part of 
 * component part the structured component contains.
 * The delegation has no behavior. In a running system, the port of the structured
 * component and the port of the component part will be the same object like 
 * interfaces of classes where interface and class are the same object at runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DelegationConnector#getPortPart <em>Port Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DelegationConnector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDelegationConnector()
 * @model
 * @generated
 */
public interface DelegationConnector extends PortConnector {
	/**
	 * Returns the value of the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Part</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDelegationConnector_PortPart()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart) -> any(true)'"
	 * @generated
	 */
	PortPart getPortPart();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDelegationConnector_Port()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(Port)).oclAsType(Port) -> any(true)'"
	 * @generated
	 */
	Port getPort();

} // DelegationConnector
