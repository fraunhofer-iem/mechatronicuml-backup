/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.ComponentPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.PartVariable#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.PartVariable#getComponentPartType <em>Component Part Type</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getPartVariable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameBindingOperatorAsComponentVariable='if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif' ValidTypeOfPartVariable='if not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\tif self.eContainer().oclAsType(ComponentVariable).type.oclIsKindOf(pim::component::StructuredComponent) then\r\n\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(pim::component::StructuredComponent).embeddedComponentParts->includes(self.dataType.oclAsType(pim::component::ComponentPart))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tfalse\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameBindingOperatorAsComponentVariable ValidTypeOfPartVariable'"
 * @generated
 */
public interface PartVariable extends ComponentStoryPatternVariable, TypedNamedElement {
	/**
	 * Returns the value of the '<em><b>Port Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.PortVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variables</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getPartVariable_PortVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortVariable> getPortVariables();

	/**
	 * Returns the value of the '<em><b>Component Part Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Part Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Part Type</em>' reference.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getPartVariable_ComponentPartType()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.dataType.oclAsType(component::ComponentPart)'"
	 * @generated
	 */
	ComponentPart getComponentPartType();

} // PartVariable
