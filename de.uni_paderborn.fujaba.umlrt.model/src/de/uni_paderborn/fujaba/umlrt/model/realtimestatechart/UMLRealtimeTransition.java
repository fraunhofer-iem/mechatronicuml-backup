/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import java.util.Vector;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Realtime Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeTransitionMappingVector <em>UML Realtime Transition Mapping Vector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSendSynchronization <em>Send Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getReceiveSynchronization <em>Receive Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTargetUMLRealtimeState <em>Target UML Realtime State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSourceUMLRealtimeState <em>Source UML Realtime State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTimeguard <em>Timeguard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition()
 * @model
 * @generated
 */
public interface UMLRealtimeTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>UML Realtime Transition Mapping Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Transition Mapping Vector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Transition Mapping Vector</em>' attribute.
	 * @see #setUMLRealtimeTransitionMappingVector(Vector)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_UMLRealtimeTransitionMappingVector()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Vector"
	 * @generated
	 */
	Vector getUMLRealtimeTransitionMappingVector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeTransitionMappingVector <em>UML Realtime Transition Mapping Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Transition Mapping Vector</em>' attribute.
	 * @see #getUMLRealtimeTransitionMappingVector()
	 * @generated
	 */
	void setUMLRealtimeTransitionMappingVector(Vector value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Send Synchronization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is sent upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Synchronization</em>' reference.
	 * @see #setSendSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_SendSynchronization()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev
	 * @model opposite="sendSyncRev"
	 * @generated
	 */
	Synchronization getSendSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSendSynchronization <em>Send Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Synchronization</em>' reference.
	 * @see #getSendSynchronization()
	 * @generated
	 */
	void setSendSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Receive Synchronization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronisation which is to be received upon activation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Synchronization</em>' reference.
	 * @see #setReceiveSynchronization(Synchronization)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_ReceiveSynchronization()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev
	 * @model opposite="receiveSyncRev"
	 * @generated
	 */
	Synchronization getReceiveSynchronization();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getReceiveSynchronization <em>Receive Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Synchronization</em>' reference.
	 * @see #getReceiveSynchronization()
	 * @generated
	 */
	void setReceiveSynchronization(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Side Effect</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The side effect of this transition. A side effect might be a variable assignment as well as a method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Side Effect</em>' containment reference.
	 * @see #setSideEffect(UMLRealtimeAction)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_SideEffect()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction#getUMLRealtimeTransition
	 * @model opposite="uMLRealtimeTransition" containment="true"
	 * @generated
	 */
	UMLRealtimeAction getSideEffect();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSideEffect <em>Side Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effect</em>' containment reference.
	 * @see #getSideEffect()
	 * @generated
	 */
	void setSideEffect(UMLRealtimeAction value);

	/**
	 * Returns the value of the '<em><b>Target UML Realtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the target of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target UML Realtime State</em>' reference.
	 * @see #setTargetUMLRealtimeState(UMLRealtimeState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_TargetUMLRealtimeState()
	 * @model
	 * @generated
	 */
	UMLRealtimeState getTargetUMLRealtimeState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getTargetUMLRealtimeState <em>Target UML Realtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target UML Realtime State</em>' reference.
	 * @see #getTargetUMLRealtimeState()
	 * @generated
	 */
	void setTargetUMLRealtimeState(UMLRealtimeState value);

	/**
	 * Returns the value of the '<em><b>Source UML Realtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state which is the source of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source UML Realtime State</em>' reference.
	 * @see #setSourceUMLRealtimeState(UMLRealtimeState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_SourceUMLRealtimeState()
	 * @model
	 * @generated
	 */
	UMLRealtimeState getSourceUMLRealtimeState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSourceUMLRealtimeState <em>Source UML Realtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source UML Realtime State</em>' reference.
	 * @see #getSourceUMLRealtimeState()
	 * @generated
	 */
	void setSourceUMLRealtimeState(UMLRealtimeState value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this transition belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #setUMLRealtimeStatechart(UMLRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_UMLRealtimeStatechart()
	 * @model
	 * @generated
	 */
	UMLRealtimeStatechart getUMLRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	void setUMLRealtimeStatechart(UMLRealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Resets</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clock resets of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resets</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_Resets()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLClock> getResets();

	/**
	 * Returns the value of the '<em><b>UML Realtime Flat Switching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Flat Switching</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Flat Switching</em>' containment reference.
	 * @see #setUMLRealtimeFlatSwitching(UMLRealtimeFlatSwitching)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_UMLRealtimeFlatSwitching()
	 * @model containment="true"
	 * @generated
	 */
	UMLRealtimeFlatSwitching getUMLRealtimeFlatSwitching();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Flat Switching</em>' containment reference.
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 */
	void setUMLRealtimeFlatSwitching(UMLRealtimeFlatSwitching value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Fading Function</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Fading Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Fading Function</em>' containment reference.
	 * @see #setUMLRealtimeFadingFunction(UMLRealtimeFadingFunction)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_UMLRealtimeFadingFunction()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction#getUMLRealtimeTransitions
	 * @model opposite="uMLRealtimeTransitions" containment="true"
	 * @generated
	 */
	UMLRealtimeFadingFunction getUMLRealtimeFadingFunction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Fading Function</em>' containment reference.
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 */
	void setUMLRealtimeFadingFunction(UMLRealtimeFadingFunction value);

	/**
	 * Returns the value of the '<em><b>Trigger Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger events of this transition. They are required for this transition to be activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Events</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_TriggerEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLRealtimeEvent> getTriggerEvents();

	/**
	 * Returns the value of the '<em><b>Raised Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The events which are raised upon activiation of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Events</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_RaisedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLRealtimeEvent> getRaisedEvents();

	/**
	 * Returns the value of the '<em><b>Timeguard</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time guard of this transition. It restricts when the transition can be activeted in dependency of the values of the clock. For time guard x<=2 the transition would only be allowed to be activated if x has a value less or equal to 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeguard</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_Timeguard()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLTimeguardAtom> getTimeguard();

	/**
	 * Returns the value of the '<em><b>Absolute Deadlines</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Deadlines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Deadlines</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_AbsoluteDeadlines()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLRealtimeTransition
	 * @model opposite="uMLRealtimeTransition" containment="true"
	 * @generated
	 */
	EList<AbsoluteDeadline> getAbsoluteDeadlines();

	/**
	 * Returns the value of the '<em><b>Relative Deadline</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Deadline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Deadline</em>' reference.
	 * @see #setRelativeDeadline(RelativeDeadline)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_RelativeDeadline()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition
	 * @model opposite="uMLRealtimeTransition"
	 * @generated
	 */
	RelativeDeadline getRelativeDeadline();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getRelativeDeadline <em>Relative Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Deadline</em>' reference.
	 * @see #getRelativeDeadline()
	 * @generated
	 */
	void setRelativeDeadline(RelativeDeadline value);

	/**
	 * Returns the value of the '<em><b>Urgent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgent</em>' attribute.
	 * @see #setUrgent(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_Urgent()
	 * @model
	 * @generated
	 */
	boolean isUrgent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#isUrgent <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgent</em>' attribute.
	 * @see #isUrgent()
	 * @generated
	 */
	void setUrgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Expression)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeTransition_Guard()
	 * @model
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasClockInUMLClockResetAtom(UMLClock clock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NaturalNumber calculateWorstCaseDeadlineAsNaturalNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDefaultName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean resetsClock(UMLClock clock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeTransition newTransition);

} // UMLRealtimeTransition
