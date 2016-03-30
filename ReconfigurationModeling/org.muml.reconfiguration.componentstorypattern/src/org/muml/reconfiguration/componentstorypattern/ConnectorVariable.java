/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.connector.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ConnectorVariable#getPortVariables <em>Port Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MustNotConnectCreateAndDestroyPorts='if self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::CREATE then\r\n\tself.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::DESTROY\r\nelse\r\n\tif self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::DESTROY then\r\n\t\tself.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CREATE\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif' SameBindingOperatorAsPortVariable='if self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.portVariables->asOrderedSet()->first().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\tif self.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\t\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.portVariables->asOrderedSet()->last().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustNotConnectCreateAndDestroyPorts SameBindingOperatorAsPortVariable'"
 * @generated
 */
public interface ConnectorVariable extends ComponentStoryPatternVariable, Connector {
	/**
	 * Returns the value of the '<em><b>Port Variables</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.PortVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variables</em>' reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getConnectorVariable_PortVariables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(i | i.oclIsKindOf(PortVariable)).oclAsType(PortVariable)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortVariable> getPortVariables();

} // ConnectorVariable
