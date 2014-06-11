/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a type of a synchronization channel that can be used to synchronize
 * between statecharts contained as substatecharts in the same state.
 * Serves as a type for Synchronizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getSelectorType <em>Selector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidSelectorType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidSelectorType='-- The selector type must be of type BOOLEAN, INT, SHORT, or of type role iff this StateChart is a multi-role StateChart, or of type port iff this StateChart is a multi-port StateChart \r\nlet stateCharts : OrderedSet(realtimestatechart::RealtimeStatechart) = if(self.state.embeddedRegions->isEmpty()) then OrderedSet{} else self.state.embeddedRegions.embeddedStatechart->select(stateChart| (not stateChart.behavioralElement.oclIsUndefined()) and stateChart.behavioralElement.oclIsKindOf(connector::DiscreteInteractionEndpoint) and stateChart.behavioralElement.oclAsType(connector::DiscreteInteractionEndpoint).multi)->asOrderedSet() endif in\n let behavElement : behavior::BehavioralElement = if (stateCharts->isEmpty()) then null else stateCharts->first().behavioralElement endif in\nlet selectorTypeIsValidPrimitiveType : Boolean = if (not self.selectorType.oclIsUndefined()) then self.selectorType.oclIsKindOf(types::PrimitiveDataType) and (self.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::BOOLEAN or self.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::BYTE or self.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT or self.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::SHORT)\nelse true endif in \nif self.selectorType.oclIsUndefined() then\n\ttrue\nelse \n\tif behavElement.oclIsUndefined() then \n\t\tselectorTypeIsValidPrimitiveType\n\telse \n\tselectorTypeIsValidPrimitiveType \nor (if behavElement.oclIsKindOf(protocol::Role) then behavElement.oclAsType(protocol::Role).multiRole and self.selectorType.oclIsKindOf(protocol::Role) else false endif)\nor (if behavElement.oclIsKindOf(component::DiscretePort) then behavElement.oclAsType(component::DiscretePort).multiPort and self.selectorType.oclIsKindOf(component::Port) else false endif)\nendif endif\n-- adann'"
 * @generated
 */
public interface SynchronizationChannel extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state in which this synchronization channel is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_State()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getChannels
	 * @model opposite="channels" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Selector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data type that provides possible values for the selection of a particular counterpart when synchronizing over this channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector Type</em>' reference.
	 * @see #setSelectorType(DataType)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_SelectorType()
	 * @model
	 * @generated
	 */
	DataType getSelectorType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel#getSelectorType <em>Selector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Type</em>' reference.
	 * @see #getSelectorType()
	 * @generated
	 */
	void setSelectorType(DataType value);

} // SynchronizationChannel
