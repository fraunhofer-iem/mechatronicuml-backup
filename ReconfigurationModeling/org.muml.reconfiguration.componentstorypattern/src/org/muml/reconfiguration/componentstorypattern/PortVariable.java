/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.Port;
import org.muml.pim.connector.ConnectorEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.PortVariable#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.PortVariable#getConnectorVariables <em>Connector Variables</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getPortVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameBindingOperatorAsParent='if self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagram::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif' SameBindingSemanticsAsParent='if self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics=storydiagram::patterns::BindingSemantics::OPTIONAL then\r\n\tself.bindingSemantics = self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics\r\nelse\r\n\ttrue\r\nendif' ValidTypeOfPortVariable='if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(ComponentVariable) then\r\n\tif not self.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentVariable).type.oclAsType(pim::component::Component).ports->includes(self.dataType.oclAsType(pim::component::Port))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(PartVariable) then\r\n\t\tif not self.oclAsType(ecore::EObject).eContainer().oclAsType(PartVariable).dataType.oclIsUndefined() then\r\n\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(PartVariable).dataType.oclAsType(pim::component::ComponentPart).componentType.oclAsType(pim::component::Component).ports->includes(self.dataType.oclAsType(pim::component::Port))\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameBindingOperatorAsParent SameBindingSemanticsAsParent ValidTypeOfPortVariable'"
 *        annotation="http://www.muml.org/emf/OCLFilter choices='if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(PartVariable)\r\nthen self.oclAsType(ecore::EObject).eContainer().oclAsType(PartVariable).componentPartType.portParts.portType\r\nelse\r\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(ComponentVariable).type.ports\r\nendif' feature='dataType'"
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
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getPortVariable_PortType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.dataType.oclAsType(component::Port)'"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Returns the value of the '<em><b>Connector Variables</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.ConnectorVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Variables</em>' reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getPortVariable_ConnectorVariables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectors->select(c | c.oclIsKindOf(ConnectorVariable)).oclAsType(ConnectorVariable)->asOrderedSet()'"
	 * @generated
	 */
	EList<ConnectorVariable> getConnectorVariables();

} // PortVariable
