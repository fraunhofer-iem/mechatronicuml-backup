/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance#getSingleRoleInstances <em>Single Role Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMultiRoleInstance()
 * @model
 * @generated
 */
public interface MultiRoleInstance extends RoleInstance {
	/**
	 * Returns the value of the '<em><b>Single Role Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance#getMultiRoleInstance <em>Multi Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Role Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Role Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMultiRoleInstance_SingleRoleInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance#getMultiRoleInstance
	 * @model opposite="multiRoleInstance"
	 * @generated
	 */
	EList<SingleRoleInstance> getSingleRoleInstances();

} // MultiRoleInstance
