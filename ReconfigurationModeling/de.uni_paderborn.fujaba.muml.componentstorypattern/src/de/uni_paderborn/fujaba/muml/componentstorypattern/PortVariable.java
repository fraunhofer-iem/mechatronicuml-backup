/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;
import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getConnectorVariables <em>Connector Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getPortVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameBindingOperatorAsParent='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif' SameBindingSemanticsAsParent='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics=storydiagrams::patterns::BindingSemantics::OPTIONAL then\r\n\tself.bindingSemantics = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics\r\nelse\r\n\ttrue\r\nendif' ValidTypeOfPortVariable='if self.eContainer().oclIsKindOf(ComponentVariable) then\r\n\tif not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::component::Component).ports->includes(self.dataType.oclAsType(muml::component::Port))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.eContainer().oclIsKindOf(PartVariable) then\r\n\t\tif not self.eContainer().oclAsType(PartVariable).dataType.oclIsUndefined() then\r\n\t\t\tself.eContainer().oclAsType(PartVariable).dataType.oclAsType(muml::component::ComponentPart).componentType.oclAsType(muml::component::Component).ports->includes(self.dataType.oclAsType(muml::component::Port))\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameBindingOperatorAsParent SameBindingSemanticsAsParent ValidTypeOfPortVariable'"
 *        annotation="http://www.muml.org/emf/OCLFilter choices='if self.eContainer().oclIsKindOf(PartVariable)\r\nthen self.eContainer().oclAsType(PartVariable).dataType.oclAsType(muml::component::ComponentPart).portParts.portType\r\nelse\r\n\tself.eContainer().oclAsType(ComponentVariable).type.ports\r\nendif' feature='dataType'"
 * @generated
 */
public interface PortVariable extends ComponentStoryPatternVariable, ConnectorEndpoint, TypedNamedElement {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getPortVariable_PortType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.dataType.oclAsType(muml::component::Port)'"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Returns the value of the '<em><b>Connector Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getPortVariable_ConnectorVariables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c | c.oclIsKindOf(ConnectorVariable)).oclAsType(ConnectorVariable)->asOrderedSet()'"
	 * @generated
	 */
	EList<ConnectorVariable> getConnectorVariables();

} // PortVariable
