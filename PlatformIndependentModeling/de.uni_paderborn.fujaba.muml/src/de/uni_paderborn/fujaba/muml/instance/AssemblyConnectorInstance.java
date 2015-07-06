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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssemblyConnectorInstanceNeedsTypeIfNotTopLevel'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AssemblyConnectorInstanceNeedsTypeIfNotTopLevel='-- Assembly Connector Instance needs type, if not top-level\r\nportInstances.componentInstance->exists(not parentCIC.parentStructuredComponentInstance.oclIsUndefined()) implies not assemblyConnectorType.oclIsUndefined()\r\n'"
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
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if  type.oclIsKindOf(component::AssemblyConnector) then\r\n\ttype.oclAsType(component::AssemblyConnector)\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	AssemblyConnector getAssemblyConnectorType();

} // AssemblyConnectorInstance
