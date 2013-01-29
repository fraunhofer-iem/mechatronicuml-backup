/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow;

import org.eclipse.emf.common.util.EList;
import org.storydriven.storydiagrams.activities.ActivityNode;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getControllerExchangeStrategy <em>Controller Exchange Strategy</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getFadingFunctions <em>Fading Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL HasOnlyOneCreateAndOneDestroyPartVariable='let partVariables : OrderedSet(componentstorypattern::PartVariable) = self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).partVariables->asOrderedSet() in\r\npartVariables->size() = 2 and\r\nif partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY else\r\nif partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE else\r\nfalse endif endif\r\n'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HasOnlyOneCreateAndOneDestroyPartVariable'"
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
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode_Deadline()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelativeDeadline getDeadline();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getDeadline <em>Deadline</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode_ComponentStoryPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentStoryPattern getComponentStoryPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getComponentStoryPattern <em>Component Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	void setComponentStoryPattern(ComponentStoryPattern value);

	/**
	 * Returns the value of the '<em><b>Controller Exchange Strategy</b></em>' attribute.
	 * The default value is <code>"ControllerExchangeStrategy.ATOMIC_SWITCHING"</code>.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Exchange Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Exchange Strategy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy
	 * @see #setControllerExchangeStrategy(ControllerExchangeStrategy)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode_ControllerExchangeStrategy()
	 * @model default="ControllerExchangeStrategy.ATOMIC_SWITCHING" required="true"
	 * @generated
	 */
	ControllerExchangeStrategy getControllerExchangeStrategy();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode#getControllerExchangeStrategy <em>Controller Exchange Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Exchange Strategy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy
	 * @see #getControllerExchangeStrategy()
	 * @generated
	 */
	void setControllerExchangeStrategy(ControllerExchangeStrategy value);

	/**
	 * Returns the value of the '<em><b>Fading Functions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A fading function defines how the value of one out-port of a continuous component is faded to the value of another out-port of a continuous component. For each out-port of a continuous component to be deleted, one fading function is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fading Functions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getControllerExchangeNode_FadingFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FadingFunction> getFadingFunctions();

} // ControllerExchangeNode
