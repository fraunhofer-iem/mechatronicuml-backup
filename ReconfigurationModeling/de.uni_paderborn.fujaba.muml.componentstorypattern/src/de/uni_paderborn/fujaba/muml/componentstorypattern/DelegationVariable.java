/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import de.uni_paderborn.fujaba.muml.component.DelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getDelegationVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ExistingConnectorBetweenPortVariableTypes='if not self.type.oclIsUndefined() then\r\n\tlet selfPorts = self.portVariables.type.oclAsType(muml::component::Port), typePorts = self.type.connectorEndpoints->collect( cE |\r\n\t  if cE.oclIsTypeOf(muml::component::PortPart)\t\r\n      then cE.oclAsType(muml::component::PortPart).portType\r\n\t  else \r\n\t  \tif cE.oclIsTypeOf(muml::component::Port)\r\n\t  \tthen cE.oclAsType(muml::component::Port)\r\n\t  \telse  null\r\n\t  \tendif\r\n\t  endif)\r\n\tin \r\n\tselfPorts->intersection(typePorts)->size() = 2\t\t\r\nelse\r\n\t\tfalse\r\nendif'"
 * @generated
 */
public interface DelegationVariable extends ConnectorVariable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DelegationConnector)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getDelegationVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	DelegationConnector getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.DelegationVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DelegationConnector value);

} // DelegationVariable
