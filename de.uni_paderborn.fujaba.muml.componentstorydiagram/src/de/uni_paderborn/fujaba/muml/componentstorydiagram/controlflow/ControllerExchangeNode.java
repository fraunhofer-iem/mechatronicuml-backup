/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow;

import org.storydriven.storydiagrams.activities.ActivityNode;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Exchange Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Controller Exchange Activity Nodes are used to exchange controllers modeled by continuous components. The controller exchange node either applies a fading function or a flat switching to the out-ports of the continuous component. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControllerExchangeNode#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControllerExchangeNode#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL HasOnlyOneCreateAndOneDestroyPartVariable='let partVariables : OrderedSet(componentstorypattern::PartVariable) = self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).partVariables->asOrderedSet() in\r\npartVariables->size() = 2 and\r\nif partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY else\r\nif partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE else\r\nfalse endif endif\r\n' CorrectNumberOfFadingFunctions='if self.controllerExchangeStrategy <> ControllerExchangeStrategy::FADING_FUNCTION then\r\nself.fadingFunctions->size()=0\r\nelse\r\n\tif self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).type.oclIsKindOf(muml::component::StructuredComponent) then\r\n\t\t--self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).type.oclAsType(muml::component::StructuredComponent).ports->select(i : muml::component::Port | i.oclIsKindOf(muml::component::ContinuousPort))->select(i : muml::component::ContinuousPort | i.outPort = true)->size() = self.fadingFunctions->size()\r\n\t\tself.fadingFunctions->size()>0\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif' NoDeadlineIfStrategyIsATOMIC_SWITCHING='if self.controllerExchangeStrategy = ControllerExchangeStrategy::ATOMIC_SWITCHING then\r\nself.deadline.oclIsUndefined()\r\nelse\r\nnot self.deadline.oclIsUndefined()\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HasOnlyOneCreateAndOneDestroyPartVariable CorrectNumberOfFadingFunctions NoDeadlineIfStrategyIsATOMIC_SWITCHING'"
 * @generated
 */
public interface ControllerExchangeNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative deadline denotes the minimum and maximum duration of the controller exchange. In case of a fading function, the deadline denotes the time interval in which both controllers are active and during which their out-ports are faded. In case of a flat switching, the deadline denotes the time interval in which the spline computing by the flat switching is used as a value of the out-port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deadline</em>' containment reference.
	 * @see #setDeadline(RelativeDeadline)
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode_Deadline()
	 * @model containment="true"
	 * @generated
	 */
	RelativeDeadline getDeadline();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControllerExchangeNode#getDeadline <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' containment reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(RelativeDeadline value);

	/**
	 * Returns the value of the '<em><b>Component Story Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Story Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #setComponentStoryPattern(ComponentStoryPattern)
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode_ComponentStoryPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentStoryPattern getComponentStoryPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControllerExchangeNode#getComponentStoryPattern <em>Component Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	void setComponentStoryPattern(ComponentStoryPattern value);

} // ControllerExchangeNode
