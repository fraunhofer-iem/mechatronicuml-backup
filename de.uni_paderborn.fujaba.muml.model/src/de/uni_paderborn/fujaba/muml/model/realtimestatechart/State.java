/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDoEvent <em>Do Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getExitEvent <em>Exit Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryEvent <em>Entry Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isFinal <em>Final</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getChannels <em>Channels</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEvents <em>Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getStateEntryPoints <em>State Entry Points</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isSimple <em>Simple</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getStateExitPoints <em>State Exit Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneInvariantPerClock OneInitialState NoOutgoingTransitionOfFinalState NoRegionsOfFinalState UniquePrioritiesOfOutgoingTransitions UniquePrioritiesOfRegions UniqueChannelNames UniqueRegionNames BoundOfInvariantGreaterOrEqualZero InvalidClockConstraintOperator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneInvariantPerClock='self.invariants->isUnique(clock)' NoOutgoingTransitionOfFinalState='self.final implies self.outgoingTransitions->isEmpty()' NoRegionsOfFinalState='self.final implies self.regions->isEmpty()' UniquePrioritiesOfOutgoingTransitions='self.outgoingTransitions->isUnique(priority) ' UniquePrioritiesOfRegions='self.regions->isUnique(priority)' UniqueChannelNames='self.channels->isUnique(name)' UniqueRegionNames='self.regions->isUnique(name)' BoundOfInvariantGreaterOrEqualZero='self.invariants->forAll(bound.value >= 0)' InvalidClockConstraintOperator='self.invariants->forAll(invariant | Set{core::expressions::common::ComparingOperator::LESS, core::expressions::common::ComparingOperator::LESS_OR_EQUAL }->includes(invariant.operator))'"
 * @generated
 */
public interface State extends Vertex {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regions of this state. Regions are used to model composite states.
	 * In case of one region, we have an xor superstate, in case of multiple regions, 
	 * we have an AND-superstate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Regions()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Do Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The do event. It is executed periodically while the corresponding state is active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Event</em>' containment reference.
	 * @see #setDoEvent(DoEvent)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_DoEvent()
	 * @model containment="true"
	 * @generated
	 */
	DoEvent getDoEvent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getDoEvent <em>Do Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Event</em>' containment reference.
	 * @see #getDoEvent()
	 * @generated
	 */
	void setDoEvent(DoEvent value);

	/**
	 * Returns the value of the '<em><b>Exit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exit action is exectuted once when the corresponding state is left.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Event</em>' containment reference.
	 * @see #setExitEvent(ExitEvent)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_ExitEvent()
	 * @model containment="true"
	 * @generated
	 */
	ExitEvent getExitEvent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getExitEvent <em>Exit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Event</em>' containment reference.
	 * @see #getExitEvent()
	 * @generated
	 */
	void setExitEvent(ExitEvent value);

	/**
	 * Returns the value of the '<em><b>Entry Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry action is exectuted once when the corresponding state is entered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Event</em>' containment reference.
	 * @see #setEntryEvent(EntryEvent)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_EntryEvent()
	 * @model containment="true"
	 * @generated
	 */
	EntryEvent getEntryEvent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryEvent <em>Entry Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Event</em>' containment reference.
	 * @see #getEntryEvent()
	 * @generated
	 */
	void setEntryEvent(EntryEvent value);

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The invariant belonging to this complex state. It describes how long it is allowed to reside in this complex state depending on the values of the clocks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockConstraint> getInvariants();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronization channels provided by this state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Channels()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<SynchronizationChannel> getChannels();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived reference returns all StateEvents of this state. The StateEvents of
	 * this state are all entry-, do- and exit-Events.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Events()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='Set{entryEvent,exitEvent,doEvent }->select(x | not x.oclIsUndefined())'"
	 * @generated
	 */
	EList<StateEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>State Entry Points</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state references its entry points. They can only exist, if a state embeds one or more statecharts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Entry Points</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_StateEntryPoints()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<StateEntryPoint> getStateEntryPoints();

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state is simple if it does not contain a region with an embedded substatechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple</em>' attribute.
	 * @see #isSetSimple()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Simple()
	 * @model default="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='regions -> isEmpty()'"
	 * @generated
	 */
	boolean isSimple();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isSimple <em>Simple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simple</em>' attribute is set.
	 * @see #isSimple()
	 * @generated
	 */
	boolean isSetSimple();

	/**
	 * Returns the value of the '<em><b>State Exit Points</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Exit Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state references its exit points. They can only exist, if a state embeds one or more statecharts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Exit Points</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_StateExitPoints()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<StateExitPoint> getStateExitPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the next free higher region priority that is closest to the value provided as hint.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (; hasRegionOfPriority(hint); hint++);\nreturn hint;'"
	 * @generated
	 */
	int getUniqueRegionPriority(int hint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the <code>true</code>, if this State contains a region of the given priority.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (Region region : getRegions()) {\n\tif (region.getPriority() == priority) {\n\t\treturn true;\n\t}\n}\nreturn false;'"
	 * @generated
	 */
	boolean hasRegionOfPriority(int priority);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An initial state is the first one to active if the statechart is activated. There is only one initial state allowed at the top hierarchy of a statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Initial()
	 * @model default="false"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a final state is not allowed to have outgoing transitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a state is active and urgent, no time is allowed to pass until the state is leaved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getState_Urgent()
	 * @model
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

} // State
