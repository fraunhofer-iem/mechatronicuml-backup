/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.connector.Connector;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ConnectorVariable#getPortVariables <em>Port Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MustNotConnectCreateAndDestroyPorts='if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::CREATE then\r\n\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::DESTROY\r\nelse\r\n\tif self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::DESTROY then\r\n\t\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CREATE\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif' SameBindingOperatorAsPortVariable='if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\tif self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\t\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif' ExistingConnectorBetweenPortVariableTypes='if self.oclIsKindOf(AssemblyVariable) then\r\n\tif not self.oclAsType(AssemblyVariable).type.oclIsUndefined() then\r\n\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.oclIsKindOf(DelegationVariable) then\r\n\t\tif not self.oclAsType(DelegationVariable).type.oclIsUndefined() then\r\n\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml:::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\t\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustNotConnectCreateAndDestroyPorts SameBindingOperatorAsPortVariable ExistingConnectorBetweenPortVariableTypes'"
 * @generated
 */
public interface ConnectorVariable extends ComponentStoryPatternVariable, Connector {
	/**
	 * Returns the value of the '<em><b>Port Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable_PortVariables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(i | i.oclIsKindOf(PortVariable)).oclAsType(PortVariable)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortVariable> getPortVariables();

} // ConnectorVariable
