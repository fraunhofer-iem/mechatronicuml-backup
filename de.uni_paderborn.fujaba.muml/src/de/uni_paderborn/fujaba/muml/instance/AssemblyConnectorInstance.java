/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector at instance level.
 * 
 * \todosd{Why does the AssemblyInstance has a lower and upper bound for the propagation delay and the Assembly not?}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance#getAssemblyConnectorType <em>Assembly Connector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getAssemblyConnectorInstance()
 * @model
 * @generated
 */
public interface AssemblyConnectorInstance extends PortConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Assembly Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assembly that this assembly instance is built from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Connector Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getAssemblyConnectorInstance_AssemblyConnectorType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.type.oclAsType(component::AssemblyConnector)'"
	 * @generated
	 */
	AssemblyConnector getAssemblyConnectorType();

} // AssemblyConnectorInstance
