/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MustNotConnectCreateAndDestroyPorts='if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::CREATE then\r\n\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::DESTROY\r\nelse\r\n\tif self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::DESTROY then\r\n\t\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CREATE\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif' SameBindingOperatorAsPortVariable='if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\tif self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\t\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif' ExistingConnectorBetweenPortVariableTypes='if self.oclIsKindOf(AssemblyVariable) then\r\n\tif not self.oclAsType(AssemblyVariable).type.oclIsUndefined() then\r\n\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.oclIsKindOf(DelegationVariable) then\r\n\t\tif not self.oclAsType(DelegationVariable).type.oclIsUndefined() then\r\n\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\t\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustNotConnectCreateAndDestroyPorts SameBindingOperatorAsPortVariable ExistingConnectorBetweenPortVariableTypes'"
 * @generated
 */
public interface ConnectorVariable extends ComponentStoryPatternVariable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getOutgoingConnectorVariables <em>Outgoing Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PortVariable)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable_Source()
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getOutgoingConnectorVariables
	 * @model opposite="outgoingConnectorVariables" required="true"
	 * @generated
	 */
	PortVariable getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PortVariable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getIncomingConnectorVariables <em>Incoming Connector Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PortVariable)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable_Target()
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getIncomingConnectorVariables
	 * @model opposite="incomingConnectorVariables" required="true"
	 * @generated
	 */
	PortVariable getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PortVariable value);

} // ConnectorVariable
