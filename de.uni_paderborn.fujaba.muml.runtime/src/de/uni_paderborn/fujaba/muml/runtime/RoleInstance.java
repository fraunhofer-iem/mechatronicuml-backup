/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime;

import de.uni_paderborn.fujaba.muml.protocol.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RoleInstance#getRole <em>Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RoleInstance#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRoleInstance()
 * @model abstract="true"
 * @generated
 */
public interface RoleInstance extends RuntimeDiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRoleInstance_Role()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.type.oclAsType(muml::protocol::Role)'"
	 * @generated
	 */
	Role getRole();

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRoleInstance_Assembly()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.oclAsType(muml::connector::ConnectorEndpointInstance).connectorInstances->isEmpty() then\r\n\tself.oclAsType(muml::connector::ConnectorEndpointInstance).connectorInstances->first().oclAsType(RuntimeRoleConnectorInstance)\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	RuntimeRoleConnectorInstance getAssembly();

} // RoleInstance
