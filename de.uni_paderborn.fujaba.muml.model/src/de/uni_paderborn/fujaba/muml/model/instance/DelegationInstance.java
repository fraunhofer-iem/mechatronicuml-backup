/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.component.Delegation;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance#getDelegationType <em>Delegation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDelegationInstance()
 * @model
 * @generated
 */
public interface DelegationInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Delegation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegation type of this delegation instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getDelegationInstance_DelegationType()
	 * @model required="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='connectorType.oclAsType(component::Delegation)'"
	 * @generated
	 */
	Delegation getDelegationType();

} // DelegationInstance
