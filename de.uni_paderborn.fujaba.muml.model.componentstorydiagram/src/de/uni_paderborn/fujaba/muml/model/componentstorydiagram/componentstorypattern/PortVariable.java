/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.component.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getIncomingConnectorVariables <em>Incoming Connector Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getOutgoingConnectorVariables <em>Outgoing Connector Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPortVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameBindingOperatorAsParent='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif' SameBindingSemanticsAsParent='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics=storydiagrams::patterns::BindingSemantics::OPTIONAL then\r\n\tself.bindingSemantics = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics\r\nelse\r\n\ttrue\r\nendif' ValidTypeOfPortVariable='if self.eContainer().oclIsKindOf(ComponentVariable) then\r\n\tif not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::model::component::Component).ports->includes(self.type.oclAsType(muml::model::component::Port))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.eContainer().oclIsKindOf(PartVariable) then\r\n\t\tif not self.eContainer().oclAsType(PartVariable).type.oclIsUndefined() then\r\n\t\t\tself.eContainer().oclAsType(PartVariable).type.oclAsType(muml::model::component::ComponentPart).componentType.oclAsType(muml::model::component::Component).ports->includes(self.type.oclAsType(muml::model::component::Port))\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameBindingOperatorAsParent SameBindingSemanticsAsParent ValidTypeOfPortVariable'"
 * @generated
 */
public interface PortVariable extends ComponentStoryPatternVariable {
	/**
	 * Returns the value of the '<em><b>Incoming Connector Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connector Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connector Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPortVariable_IncomingConnectorVariables()
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ConnectorVariable> getIncomingConnectorVariables();

	/**
	 * Returns the value of the '<em><b>Outgoing Connector Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connector Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connector Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPortVariable_OutgoingConnectorVariables()
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ConnectorVariable#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ConnectorVariable> getOutgoingConnectorVariables();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Port)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPortVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	Port getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Port value);

} // PortVariable
