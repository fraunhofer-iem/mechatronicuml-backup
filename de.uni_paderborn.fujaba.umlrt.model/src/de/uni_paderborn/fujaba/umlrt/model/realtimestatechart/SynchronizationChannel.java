/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.NamedElement;

import org.storydriven.modeling.calls.Callable;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getSynchroChannelExpr <em>Synchro Channel Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel()
 * @model
 * @generated
 */
public interface SynchronizationChannel extends NamedElement, Callable {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state in which this synchronization channel is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_State()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels
	 * @model opposite="channels" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Synchro Channel Expr</b></em>' attribute.
	 * The default value is <code>"synchroChannelExpr"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchro Channel Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchro Channel Expr</em>' attribute.
	 * @see #setSynchroChannelExpr(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronizationChannel_SynchroChannelExpr()
	 * @model default="synchroChannelExpr"
	 * @generated
	 */
	String getSynchroChannelExpr();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getSynchroChannelExpr <em>Synchro Channel Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchro Channel Expr</em>' attribute.
	 * @see #getSynchroChannelExpr()
	 * @generated
	 */
	void setSynchroChannelExpr(String value);

} // SynchronizationChannel
