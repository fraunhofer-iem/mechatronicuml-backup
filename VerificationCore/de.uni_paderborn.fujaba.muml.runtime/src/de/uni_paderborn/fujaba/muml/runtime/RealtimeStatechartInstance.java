/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Statechart Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getActiveVertex <em>Active Vertex</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances <em>Sub Realtime Statechart Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getParentRealtimeStatechartInstance <em>Parent Realtime Statechart Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getVariableBindings <em>Variable Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getAllAvailableVariableBindings <em>All Available Variable Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getNearestRuntimeBehavioralElement <em>Nearest Runtime Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getActiveTransition <em>Active Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL StateAndTransitionActive='-- A Vertex and a Transition of one RTSC can not be active at the same time\r\nactiveVertex.oclIsUndefined() or activeTransition.oclIsUndefined()'"
 * @generated
 */
public interface RealtimeStatechartInstance extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Runtime Behavioral Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getStatechartInstance <em>Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Behavioral Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Behavioral Element</em>' reference.
	 * @see #setRuntimeBehavioralElement(RuntimeBehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_RuntimeBehavioralElement()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement#getStatechartInstance
	 * @model opposite="statechartInstance"
	 * @generated
	 */
	RuntimeBehavioralElement getRuntimeBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Behavioral Element</em>' reference.
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 */
	void setRuntimeBehavioralElement(RuntimeBehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(RealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_InstanceOf()
	 * @model
	 * @generated
	 */
	RealtimeStatechart getInstanceOf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Active Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Vertex</em>' reference.
	 * @see #setActiveVertex(Vertex)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_ActiveVertex()
	 * @model
	 * @generated
	 */
	Vertex getActiveVertex();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getActiveVertex <em>Active Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Vertex</em>' reference.
	 * @see #getActiveVertex()
	 * @generated
	 */
	void setActiveVertex(Vertex value);

	/**
	 * Returns the value of the '<em><b>Sub Realtime Statechart Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getParentRealtimeStatechartInstance <em>Parent Realtime Statechart Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Realtime Statechart Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Realtime Statechart Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_SubRealtimeStatechartInstances()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getParentRealtimeStatechartInstance
	 * @model opposite="parentRealtimeStatechartInstance" containment="true"
	 * @generated
	 */
	EList<RealtimeStatechartInstance> getSubRealtimeStatechartInstances();

	/**
	 * Returns the value of the '<em><b>Parent Realtime Statechart Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances <em>Sub Realtime Statechart Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Realtime Statechart Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Realtime Statechart Instance</em>' container reference.
	 * @see #setParentRealtimeStatechartInstance(RealtimeStatechartInstance)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_ParentRealtimeStatechartInstance()
	 * @see de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getSubRealtimeStatechartInstances
	 * @model opposite="subRealtimeStatechartInstances" transient="false"
	 * @generated
	 */
	RealtimeStatechartInstance getParentRealtimeStatechartInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getParentRealtimeStatechartInstance <em>Parent Realtime Statechart Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Realtime Statechart Instance</em>' container reference.
	 * @see #getParentRealtimeStatechartInstance()
	 * @generated
	 */
	void setParentRealtimeStatechartInstance(RealtimeStatechartInstance value);

	/**
	 * Returns the value of the '<em><b>Variable Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.VariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_VariableBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableBinding> getVariableBindings();

	/**
	 * Returns the value of the '<em><b>All Available Variable Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.runtime.VariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Available Variable Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Available Variable Bindings</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_AllAvailableVariableBindings()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if parentRealtimeStatechartInstance.oclIsUndefined() then self else parentRealtimeStatechartInstance endif).variableBindings->asOrderedSet()'"
	 * @generated
	 */
	EList<VariableBinding> getAllAvailableVariableBindings();

	/**
	 * Returns the value of the '<em><b>Nearest Runtime Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nearest Runtime Behavioral Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nearest Runtime Behavioral Element</em>' reference.
	 * @see #setNearestRuntimeBehavioralElement(RuntimeBehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_NearestRuntimeBehavioralElement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- traverse to parent if no runtime behavioral element itself\r\nif self.runtimeBehavioralElement.oclIsUndefined() then\r\n\t-- guard against NPE\r\n\tif (self.parentRealtimeStatechartInstance.oclIsUndefined()) then\t\r\n\t\tnull\r\n\telse\r\n\t\tself.parentRealtimeStatechartInstance.nearestRuntimeBehavioralElement\r\n\tendif\r\nelse\r\n\tself.runtimeBehavioralElement\r\nendif'"
	 * @generated
	 */
	RuntimeBehavioralElement getNearestRuntimeBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getNearestRuntimeBehavioralElement <em>Nearest Runtime Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nearest Runtime Behavioral Element</em>' reference.
	 * @see #getNearestRuntimeBehavioralElement()
	 * @generated
	 */
	void setNearestRuntimeBehavioralElement(RuntimeBehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Active Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Transition</em>' reference.
	 * @see #setActiveTransition(Transition)
	 * @see de.uni_paderborn.fujaba.muml.runtime.RuntimePackage#getRealtimeStatechartInstance_ActiveTransition()
	 * @model
	 * @generated
	 */
	Transition getActiveTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance#getActiveTransition <em>Active Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Transition</em>' reference.
	 * @see #getActiveTransition()
	 * @generated
	 */
	void setActiveTransition(Transition value);

} // RealtimeStatechartInstance
