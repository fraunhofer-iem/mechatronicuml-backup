/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getConnectorVariables <em>Connector Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getPortVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameBindingOperatorAsParent='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif' SameBindingSemanticsAsParent='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics=storydiagrams::patterns::BindingSemantics::OPTIONAL then\r\n\tself.bindingSemantics = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics\r\nelse\r\n\ttrue\r\nendif' ValidTypeOfPortVariable='if self.eContainer().oclIsKindOf(ComponentVariable) then\r\n\tif not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::component::Component).ports->includes(self.type.oclAsType(muml::component::Port))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.eContainer().oclIsKindOf(PartVariable) then\r\n\t\tif not self.eContainer().oclAsType(PartVariable).type.oclIsUndefined() then\r\n\t\t\tself.eContainer().oclAsType(PartVariable).type.oclAsType(muml::component::ComponentPart).componentType.oclAsType(muml::component::Component).ports->includes(self.type.oclAsType(muml::component::Port))\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameBindingOperatorAsParent SameBindingSemanticsAsParent ValidTypeOfPortVariable'"
 * @generated
 */
public interface PortVariable extends ComponentStoryPatternVariable, ConnectorEndpoint {
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getPortVariable_Type()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter choices='if self.eContainer().oclIsKindOf(PartVariable)\r\nthen self.eContainer().oclAsType(PartVariable).type.portParts.portType\r\nelse\r\n\tself.eContainer().oclAsType(ComponentVariable).type.ports\r\nendif'"
	 * @generated
	 */
	Port getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Port value);

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
