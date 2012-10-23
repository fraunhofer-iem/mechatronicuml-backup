/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance#getMultiRoleInstance <em>Multi Role Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getSingleRoleInstance()
 * @model
 * @generated
 */
public interface SingleRoleInstance extends RoleInstance {
	/**
	 * Returns the value of the '<em><b>Multi Role Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance#getSingleRoleInstances <em>Single Role Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Role Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Role Instance</em>' reference.
	 * @see #setMultiRoleInstance(MultiRoleInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getSingleRoleInstance_MultiRoleInstance()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance#getSingleRoleInstances
	 * @model opposite="singleRoleInstances"
	 * @generated
	 */
	MultiRoleInstance getMultiRoleInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance#getMultiRoleInstance <em>Multi Role Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Role Instance</em>' reference.
	 * @see #getMultiRoleInstance()
	 * @generated
	 */
	void setMultiRoleInstance(MultiRoleInstance value);

} // SingleRoleInstance
