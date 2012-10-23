/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRoleInstance()
 * @model abstract="true"
 * @generated
 */
public interface RoleInstance extends RuntimeBehavioralElement {
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
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getRoleInstances <em>Role Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(RuntimeRoleAssembly)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRoleInstance_Connector()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getRoleInstances
	 * @model opposite="roleInstances"
	 * @generated
	 */
	RuntimeRoleAssembly getConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(RuntimeRoleAssembly value);

} // RoleInstance
