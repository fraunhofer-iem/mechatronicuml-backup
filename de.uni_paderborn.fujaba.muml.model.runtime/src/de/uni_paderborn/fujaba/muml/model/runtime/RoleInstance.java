/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import de.uni_paderborn.fujaba.muml.model.connector.DiscreteInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.model.protocol.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRoleInstance()
 * @model abstract="true"
 * @generated
 */
public interface RoleInstance extends RuntimeBehavioralElement, DiscreteInteractionEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRoleInstance_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	Role getInstanceOf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(Role value);

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' reference.
	 * @see #setAssembly(RuntimeRoleConnectorInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRoleInstance_Assembly()
	 * @model
	 * @generated
	 */
	RuntimeRoleConnectorInstance getAssembly();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getAssembly <em>Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' reference.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(RuntimeRoleConnectorInstance value);

} // RoleInstance
