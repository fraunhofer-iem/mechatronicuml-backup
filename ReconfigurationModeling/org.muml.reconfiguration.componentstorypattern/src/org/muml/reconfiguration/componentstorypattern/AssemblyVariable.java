/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.muml.pim.component.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.AssemblyVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getAssemblyVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ExistingAssemblyConnectorBetweenPortVariableTypes='if not self.type.oclIsUndefined() then\r\n\tlet selfPorts = self.portVariables.portType.oclAsType(pim::component::Port), typePorts = self.type.connectorEndpoints.oclAsType(pim::component::PortPart).portType in \r\n\tselfPorts->intersection(typePorts)->size() = 2\t\t\r\nelse\r\n\t\tfalse\r\nendif\r\n'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExistingConnectorBetweenPortVariableTypes'"
 * @generated
 */
public interface AssemblyVariable extends ConnectorVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AssemblyConnector)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getAssemblyVariable_Type()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter choices='let this : ComponentVariable = self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentVariable),\r\n\tassemblyConnectors : Collection(connector::Connector) = this.type.oclAsType(component::StructuredComponent).connectors->select(oclIsTypeOf(component::AssemblyConnector)),\r\n\tportVariableTypes: Collection(component::Port) = self.portVariables.portType->excluding(null)\r\nin\r\n\tassemblyConnectors->select(aC | portVariableTypes->forAll(p | aC.oclAsType(component::AssemblyConnector).portParts.portType->includes(p)))'"
	 * @generated
	 */
	AssemblyConnector getType();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.AssemblyVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AssemblyConnector value);

} // AssemblyVariable
