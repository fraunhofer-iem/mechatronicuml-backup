/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a node in a realtime statechart that is connected with other nodes via transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex#getAllSuperVertices <em>All Super Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outgoing transitions of this vertex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getVertex_OutgoingTransitions()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incoming transitions of this vertex
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getVertex_IncomingTransitions()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>All Super Vertices</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All super vertices of this vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Super Vertices</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getVertex_AllSuperVertices()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(State)\r\nthen self.oclAsType(State)->closure(s | if s.parentStatechart.embedded then s.parentStatechart.parentRegion.parentState else null endif)->asOrderedSet()\r\nelse\r\n   if self.oclIsKindOf(StateConnectionPoint)\r\n   then let state : State = self.oclAsType(StateConnectionPoint).state in state->union(state->closure(s | if s.parentStatechart.embedded then s.parentStatechart.parentRegion.parentState else null endif))->asOrderedSet()\r\n   else OrderedSet{ }\r\n   endif\r\nendif'"
	 * @generated
	 */
	EList<Vertex> getAllSuperVertices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * return if this vertex is a super vertex of another vertex
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='vertex.allSuperVertices->includes(self)'"
	 * @generated
	 */
	boolean isSuperVertexOf(Vertex vertex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the next free higher transition priority that is closest to the value provided as hint.
	 * \todosd{Rename hint to an understandable name.}
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int nextHighestTransitionPriority = hint;\r\nfor (; hasOutgoingTransitionOfPriority(nextHighestTransitionPriority); nextHighestTransitionPriority++);\r\nreturn nextHighestTransitionPriority;'"
	 * @generated
	 */
	int getUniqueTransitionPriority(int hint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns <code>true</code>, if this Vertex contains an outgoing transition of the given priority.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (Transition transition : getOutgoingTransitions()) {\r\n\tif (transition.getPriority() == priority) {\r\n\t\treturn true;\r\n\t}\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean hasOutgoingTransitionOfPriority(int priority);

} // Vertex
