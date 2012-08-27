/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.Parameter;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel()
 * @model
 * @generated
 */
public interface SynchronizationChannel extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state in which this synchronization channel is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_State()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getChannels
	 * @model opposite="channels" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters of a SynchronizationChannel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // SynchronizationChannel
