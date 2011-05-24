/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.Delegation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation connector at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance#getDelegationType <em>Delegation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getDelegationInstance()
 * @model
 * @generated
 */
public interface DelegationInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Delegation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Type</em>' reference.
	 * @see #setDelegationType(Delegation)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getDelegationInstance_DelegationType()
	 * @model required="true"
	 * @generated
	 */
	Delegation getDelegationType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance#getDelegationType <em>Delegation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Type</em>' reference.
	 * @see #getDelegationType()
	 * @generated
	 */
	void setDelegationType(Delegation value);

} // DelegationInstance
