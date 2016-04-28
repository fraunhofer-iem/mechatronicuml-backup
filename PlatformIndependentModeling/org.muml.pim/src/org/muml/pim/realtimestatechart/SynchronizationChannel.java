/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.types.DataType;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.SynchronizationChannel#getState <em>State</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.SynchronizationChannel#getSelectorType <em>Selector Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidSelectorType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidSelectorType='-- The selector type must be of and Integer type or of type role iff this RTSC is a multi-role RTSC, or of type port iff this RTSC is a multi-port RTSC \r\nlet parentRtsc : realtimestatechart::RealtimeStatechart = self.state.parentStatechart in\r\n\r\nlet behavElement : behavior::BehavioralElement = if (parentRtsc->isEmpty()) then null else parentRtsc.behavioralElement endif in\r\n\r\nlet selectorTypeIsValidPrimitiveType : Boolean = if (not self.selectorType.oclIsUndefined()) then \r\nself.selectorType.oclIsKindOf(types::PrimitiveDataType) \r\nand (self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::BOOLEAN \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT8 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT16 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT32\r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::INT64\r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT8 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT16 \r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT32\r\n\tor self.selectorType.oclAsType(types::PrimitiveDataType).primitiveType=types::PrimitiveTypes::UINT64\r\n)\r\nelse true endif in \r\n\r\nif self.selectorType.oclIsUndefined() then\r\n\ttrue\r\nelse \r\n\tif behavElement.oclIsUndefined() then \r\n\t\tselectorTypeIsValidPrimitiveType\r\n\telse \r\n\tselectorTypeIsValidPrimitiveType \r\n\t\tor (if behavElement.oclIsKindOf(connector::DiscreteInteractionEndpoint) then behavElement.oclAsType(connector::DiscreteInteractionEndpoint).multi and self.selectorType.oclIsKindOf(connector::DiscreteInteractionEndpoint) else false endif)\r\n\tendif \r\nendif\n-- adann, xell, chris227'"
 * @generated
 */
public interface SynchronizationChannel extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state in which this synchronization channel is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_State()
	 * @see org.muml.pim.realtimestatechart.State#getChannels
	 * @model opposite="channels" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.SynchronizationChannel#getState <em>State</em>}' container reference.
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
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_SelectorType()
	 * @model
	 * @generated
	 */
	DataType getSelectorType();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.SynchronizationChannel#getSelectorType <em>Selector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Type</em>' reference.
	 * @see #getSelectorType()
	 * @generated
	 */
	void setSelectorType(DataType value);

} // SynchronizationChannel
