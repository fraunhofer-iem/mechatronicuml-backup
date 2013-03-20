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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Assert.isLegal(vertex != null);\r\n\r\nBreadthFirstSearchAlgorithm bfs = new BreadthFirstSearchAlgorithm();\r\nreturn bfs.search(vertex, new ISearchVisitor() {\r\n\r\n\t@Override\r\n\tpublic boolean visit(Object object) {\r\n\t\treturn !VertexImpl.this.equals(object);\r\n\t}\r\n\r\n\t@Override\r\n\tpublic List<?> getAdjacentNodes(Object object) {\r\n\r\n\t\tList<Object> parentStates = new ArrayList<Object>();\r\n\r\n\t\tState state = (State) object;\r\n\t\tRealtimeStatechart rtsc = state.getParentStatechart();\r\n\t\tif (rtsc != null) {\r\n\t\t\tRegion region = rtsc.getEmbeddingRegion();\r\n\t\t\tif (region != null) {\r\n\t\t\t\t// List<Region> regions = rtsc.getEmbeddingRegions();\r\n\t\t\t\t// for (Region region : regions) {\r\n\t\t\t\tState parentState = region.getParentState();\r\n\t\t\t\tif (state != null) {\r\n\t\t\t\t\tparentStates.add(parentState);\r\n\t\t\t\t}\r\n\t\t\t\t// }\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\treturn parentStates;\r\n\t}\r\n\r\n});'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (; hasOutgoingTransitionOfPriority(hint); hint++);\nreturn hint;'"
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
