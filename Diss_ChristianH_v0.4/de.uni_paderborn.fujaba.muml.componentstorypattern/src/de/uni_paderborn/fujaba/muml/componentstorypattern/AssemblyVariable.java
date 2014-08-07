/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getAssemblyVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ExistingConnectorBetweenPortVariableTypes='if not self.type.oclIsUndefined() then\r\n\tlet selfPorts = self.portVariables.type.oclAsType(muml::component::Port), typePorts = self.type.connectorEndpoints.oclAsType(muml::component::PortPart).portType in \r\n\tselfPorts->intersection(typePorts)->size() = 2\t\t\r\nelse\r\n\t\tfalse\r\nendif\r\n'"
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getAssemblyVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	AssemblyConnector getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.AssemblyVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AssemblyConnector value);

} // AssemblyVariable
