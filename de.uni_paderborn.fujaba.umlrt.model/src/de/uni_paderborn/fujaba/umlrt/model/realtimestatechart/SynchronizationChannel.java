/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.NamedElement;

import org.storydriven.modeling.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getUMLRealtimeComplexState <em>UML Realtime Complex State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel()
 * @model
 * @generated
 */
public interface SynchronizationChannel extends NamedElement, Callable {
	/**
	 * Returns the value of the '<em><b>UML Realtime Complex State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Complex State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Complex State</em>' reference.
	 * @see #setUMLRealtimeComplexState(UMLRealtimeComplexState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_UMLRealtimeComplexState()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getChannels
	 * @model opposite="channels"
	 * @generated
	 */
	UMLRealtimeComplexState getUMLRealtimeComplexState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getUMLRealtimeComplexState <em>UML Realtime Complex State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Complex State</em>' reference.
	 * @see #getUMLRealtimeComplexState()
	 * @generated
	 */
	void setUMLRealtimeComplexState(UMLRealtimeComplexState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, SynchronizationChannel newChannel);

} // SynchronizationChannel
