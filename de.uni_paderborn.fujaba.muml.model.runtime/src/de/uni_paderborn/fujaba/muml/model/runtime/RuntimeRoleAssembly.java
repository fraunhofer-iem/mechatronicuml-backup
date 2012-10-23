/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly#getRoleInstances <em>Role Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeRoleAssembly()
 * @model
 * @generated
 */
public interface RuntimeRoleAssembly extends RoleConnector, RuntimeAssemblyInstance {
	/**
	 * Returns the value of the '<em><b>Role Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeRoleAssembly_RoleInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance#getConnector
	 * @model opposite="connector" lower="2" upper="2"
	 * @generated
	 */
	EList<RoleInstance> getRoleInstances();

} // RuntimeRoleAssembly
