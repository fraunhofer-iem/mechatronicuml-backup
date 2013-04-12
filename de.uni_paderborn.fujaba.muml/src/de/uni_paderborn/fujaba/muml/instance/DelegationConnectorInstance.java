/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import de.uni_paderborn.fujaba.muml.component.DelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation connector at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.DelegationConnectorInstance#getDelegationConnectorType <em>Delegation Connector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getDelegationConnectorInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneDelegationInstancePerPortInstance='-- FIXME\r\nnot self.source.oclIsUndefined() implies self.source.outgoingConnectorInstances->select(x | x.oclIsKindOf(DelegationInstance))->size() = 1'"
 * @generated
 */
public interface DelegationConnectorInstance extends PortConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Delegation Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegation type of this delegation instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Connector Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getDelegationConnectorInstance_DelegationConnectorType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.type.oclAsType(component::DelegationConnector)'"
	 * @generated
	 */
	DelegationConnector getDelegationConnectorType();

} // DelegationConnectorInstance
