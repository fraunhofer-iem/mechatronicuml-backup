/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a complex state of a realtime statechart. Complex states may again contain realtime statecharts hence enabling the creation of hierarchical statecharts. Further more complex states have do, entry and exit actions. Also complex states define which synchronization channels are allowed to be used by embedded statecharts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfacedStates <em>Interfaced States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfaceState <em>Interface State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#isCommitted <em>Committed</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getChannels <em>Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regions of this state. Regions are used to model composite states.
	 * In case of one region, we have an xor superstate, in case of multiple regions, 
	 * we have an AND-superstate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_Regions()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Do Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev <em>Do Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The do action. It is executed periodically while the corresponding complex state is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Action</em>' containment reference.
	 * @see #setDoAction(DoEvent)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_DoAction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev
	 * @model opposite="doActionRev" containment="true"
	 * @generated
	 */
	DoEvent getDoAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getDoAction <em>Do Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Action</em>' containment reference.
	 * @see #getDoAction()
	 * @generated
	 */
	void setDoAction(DoEvent value);

	/**
	 * Returns the value of the '<em><b>Exit Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev <em>Exit Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exit action. It is exectuted once when the corresponding complex state is left.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Action</em>' containment reference.
	 * @see #setExitAction(EntryOrExitEvent)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_ExitAction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev
	 * @model opposite="exitActionRev" containment="true"
	 * @generated
	 */
	EntryOrExitEvent getExitAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction <em>Exit Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Action</em>' containment reference.
	 * @see #getExitAction()
	 * @generated
	 */
	void setExitAction(EntryOrExitEvent value);

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev <em>Entry Action Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry action. It is exectuted once when the corresponding complex state is entered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Action</em>' containment reference.
	 * @see #setEntryAction(EntryOrExitEvent)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_EntryAction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev
	 * @model opposite="entryActionRev" containment="true"
	 * @generated
	 */
	EntryOrExitEvent getEntryAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction <em>Entry Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Action</em>' containment reference.
	 * @see #getEntryAction()
	 * @generated
	 */
	void setEntryAction(EntryOrExitEvent value);

	/**
	 * Returns the value of the '<em><b>Reconf Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reconfiguration diagram belonging to this complex state. This is mainly a component instance diagram describing a certain configuration of the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconf Diagram</em>' containment reference.
	 * @see #setReconfDiagram(ReconfDiagram)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_ReconfDiagram()
	 * @model containment="true"
	 * @generated
	 */
	ReconfDiagram getReconfDiagram();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getReconfDiagram <em>Reconf Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconf Diagram</em>' containment reference.
	 * @see #getReconfDiagram()
	 * @generated
	 */
	void setReconfDiagram(ReconfDiagram value);

	/**
	 * Returns the value of the '<em><b>Interfaced States</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: What's this good for?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interfaced States</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_InterfacedStates()
	 * @model
	 * @generated
	 */
	EList<State> getInterfacedStates();

	/**
	 * Returns the value of the '<em><b>Interface State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: What's this good for?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface State</em>' reference.
	 * @see #setInterfaceState(State)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_InterfaceState()
	 * @model
	 * @generated
	 */
	State getInterfaceState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getInterfaceState <em>Interface State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface State</em>' reference.
	 * @see #getInterfaceState()
	 * @generated
	 */
	void setInterfaceState(State value);

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The invariant belonging to this complex state. It describes how long it is allowed to reside in this complex state depending on the values of the clocks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockConstraint> getInvariants();

	/**
	 * Returns the value of the '<em><b>Committed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether this complex state is committed or not. The meaning of being committed is the same as it is with committed states in Uppaal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Committed</em>' attribute.
	 * @see #setCommitted(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_Committed()
	 * @model default="false"
	 * @generated
	 */
	boolean isCommitted();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#isCommitted <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed</em>' attribute.
	 * @see #isCommitted()
	 * @generated
	 */
	void setCommitted(boolean value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronization channels provided by this complex state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getState_Channels()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<SynchronizationChannel> getChannels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(AbstractStatechart rtsc, State newComplexState);

} // State
