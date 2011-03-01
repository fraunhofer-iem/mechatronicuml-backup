/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Realtime Complex State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a complex state of a realtime statechart. Complex states may again contain realtime statecharts hence enabling the creation of hierarchical statecharts. Further more complex states have do, entry and exit actions. Also complex states define which synchronization channels are allowed to be used by embedded statecharts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getUMLRealtimeStatecharts <em>UML Realtime Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfacedStates <em>Interfaced States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfaceState <em>Interface State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#isCommitted <em>Committed</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getChannels <em>Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState()
 * @model
 * @generated
 */
public interface UMLRealtimeComplexState extends UMLRealtimeState {
	/**
	 * Returns the value of the '<em><b>UML Realtime Statecharts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this complex state belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Statecharts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_UMLRealtimeStatecharts()
	 * @model
	 * @generated
	 */
	EList<UMLRealtimeStatechart> getUMLRealtimeStatecharts();

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_DoAction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent#getDoActionRev
	 * @model opposite="doActionRev" containment="true"
	 * @generated
	 */
	DoEvent getDoAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getDoAction <em>Do Action</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_ExitAction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev
	 * @model opposite="exitActionRev" containment="true"
	 * @generated
	 */
	EntryOrExitEvent getExitAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getExitAction <em>Exit Action</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_EntryAction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev
	 * @model opposite="entryActionRev" containment="true"
	 * @generated
	 */
	EntryOrExitEvent getEntryAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getEntryAction <em>Entry Action</em>}' containment reference.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_ReconfDiagram()
	 * @model containment="true"
	 * @generated
	 */
	ReconfDiagram getReconfDiagram();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getReconfDiagram <em>Reconf Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconf Diagram</em>' containment reference.
	 * @see #getReconfDiagram()
	 * @generated
	 */
	void setReconfDiagram(ReconfDiagram value);

	/**
	 * Returns the value of the '<em><b>Interfaced States</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: What's this good for?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interfaced States</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_InterfacedStates()
	 * @model
	 * @generated
	 */
	EList<UMLRealtimeComplexState> getInterfacedStates();

	/**
	 * Returns the value of the '<em><b>Interface State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: What's this good for?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface State</em>' reference.
	 * @see #setInterfaceState(UMLRealtimeComplexState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_InterfaceState()
	 * @model
	 * @generated
	 */
	UMLRealtimeComplexState getInterfaceState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#getInterfaceState <em>Interface State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface State</em>' reference.
	 * @see #getInterfaceState()
	 * @generated
	 */
	void setInterfaceState(UMLRealtimeComplexState value);

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The invariant belonging to this complex state. It describes how long it is allowed to reside in this complex state depending on the values of the clocks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLInvariantAtom> getInvariants();

	/**
	 * Returns the value of the '<em><b>Committed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether this complex state is committed or not. The meaning of being committed is the same as it is with committed states in Uppaal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Committed</em>' attribute.
	 * @see #setCommitted(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_Committed()
	 * @model
	 * @generated
	 */
	boolean isCommitted();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState#isCommitted <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed</em>' attribute.
	 * @see #isCommitted()
	 * @generated
	 */
	void setCommitted(boolean value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getUMLRealtimeComplexState <em>UML Realtime Complex State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronization channels provided by this complex state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeComplexState_Channels()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel#getUMLRealtimeComplexState
	 * @model opposite="uMLRealtimeComplexState"
	 * @generated
	 */
	EList<SynchronizationChannel> getChannels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeComplexState newComplexState);

} // UMLRealtimeComplexState
