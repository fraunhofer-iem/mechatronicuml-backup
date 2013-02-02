/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.behavior.Behavior;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a concrete statechart implementation of a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getStates <em>States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isHistory <em>History</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isFlat <em>Flat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAvailableClocks <em>Available Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAllAvailableVariables <em>All Available Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getAllAvailableOperations <em>All Available Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueNameOfStates='self.states->isUnique(name)' NoCycles='-- If we are contained within a statechart...\n(not self.embeddingRegion.parentState.statechart.oclIsUndefined())\n\nimplies\n\n-- ... then we must not be a super statechart of it.\n(not self.isSuperStatechartOf(self.embeddingRegion.parentState.statechart))' OneInitialState='self.states->select(s |  s.initial)->size() = 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueNameOfStates NoCycles OneInitialState'"
 * @generated
 */
public interface RealtimeStatechart extends NamedElement, CommentableElement, Behavior {
	/**
	 * Returns the value of the '<em><b>Embedding Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the real-time statechart is embedded into a region of a composite state,
	 * than this reference returns the region of this state. If the real-time statechart
	 * is not embedded, this reference will be undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedding Region</em>' container reference.
	 * @see #setEmbeddingRegion(Region)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_EmbeddingRegion()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getStatechart
	 * @model opposite="statechart" transient="false"
	 * @generated
	 */
	Region getEmbeddingRegion();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Region</em>' container reference.
	 * @see #getEmbeddingRegion()
	 * @generated
	 */
	void setEmbeddingRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transitions of the realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Transitions()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Transition#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.State}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_States()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getStatechart
	 * @model opposite="statechart" containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clocks of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Clocks()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.Clock#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Clock> getClocks();

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this attribute is true, it acts as a shallow history on the top hierarchy of this statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History</em>' attribute.
	 * @see #setHistory(boolean)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_History()
	 * @model
	 * @generated
	 */
	boolean isHistory();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#isHistory <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' attribute.
	 * @see #isHistory()
	 * @generated
	 */
	void setHistory(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the event queue of this port. It defines the maximum number of events
	 * that may be temporarily buffered by the port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Queue Size</em>' attribute.
	 * @see #setEventQueueSize(int)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_EventQueueSize()
	 * @model
	 * @generated
	 */
	int getEventQueueSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Queue Size</em>' attribute.
	 * @see #getEventQueueSize()
	 * @generated
	 */
	void setEventQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Flat</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute allows to checks whether a statechart is flat or not. In a
	 * flat statechart, none of the contained states contains a regions with an embedded
	 * substatechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flat</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Flat()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- a statechart is flat if it exclusively contains simple states\nstates->forAll(simple)'"
	 * @generated
	 */
	boolean isFlat();

	/**
	 * Returns the value of the '<em><b>Available Clocks</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Available clocks are all clocks that were defined in this statechart or in ancestor statecharts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Clocks</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_AvailableClocks()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if embeddingRegion.oclIsUndefined() then self else embeddingRegion.parentState.statechart endif).clocks->asSet()'"
	 * @generated
	 */
	EList<Clock> getAvailableClocks();

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies whether this realtime statechart is embedded into a region or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Embedded()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not self.embeddingRegion.oclIsUndefined()'"
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Returns the value of the '<em><b>All Available Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Available Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Available Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_AllAvailableVariables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if embeddingRegion.oclIsUndefined() then self else embeddingRegion.parentState.statechart endif).variables->asOrderedSet()'"
	 * @generated
	 */
	EList<Variable> getAllAvailableVariables();

	/**
	 * Returns the value of the '<em><b>All Available Operations</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Available Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Available Operations</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_AllAvailableOperations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if embeddingRegion.oclIsUndefined() then self else embeddingRegion.parentState.statechart endif).operations ->asOrderedSet()'"
	 * @generated
	 */
	EList<Operation> getAllAvailableOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns realtime statechart which represents the root of the hierarchy tree.
	 * <!-- end-model-doc -->
	 * @model required="true" statechartRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// TODO: Replace by OCL\'s transitive closure?\n\t\t\nAssert.isLegal(statechart != null);\n\nBreadthFirstSearchAlgorithm bfs = new BreadthFirstSearchAlgorithm();\nreturn bfs.search(statechart, new ISearchVisitor() {\n\n\t@Override\n\tpublic boolean visit(Object object) {\n\t\treturn !RealtimeStatechartImpl.this.equals(object);\n\t}\n\n\t@Override\n\tpublic List<?> getAdjacentNodes(Object object) {\n\t\tRealtimeStatechart rtsc = (RealtimeStatechart) object;\n\n\t\tList<Object> parentStatecharts = new ArrayList<Object>();\n\n\t\tRegion region = rtsc.getEmbeddingRegion();\n\t\tif (region != null) {\n\t\t\t// List<Region> regions = rtsc.getEmbeddingRegions();\n\t\t\t// for (Region region : regions) {\n\t\t\tState state = region.getParentState();\n\t\t\tif (state != null && state.getStatechart() != null) {\n\t\t\t\tparentStatecharts.add(state.getStatechart());\n\t\t\t}\n\t\t\t// }\n\t\t}\n\n\t\treturn parentStatecharts;\n\t}\n\n});'"
	 * @generated
	 */
	boolean isSuperStatechartOf(RealtimeStatechart statechart);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns realtime statechart which represents the root of the hierarchy tree.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='RealtimeStatechart rtsc = this;\r\nwhile (rtsc.isEmbedded()==true)\r\n{rtsc = rtsc.getEmbeddingRegion().getParentState().getStatechart();} \r\nreturn rtsc;'"
	 * @generated
	 */
	RealtimeStatechart getHighestParentStatechart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns itself if a Port or a Role is referenced or the next ancestor that references a Port or a Role. If no Port or a Role is found, then itself is returned.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='// check if this rtsc has a behavioral element\r\nRealtimeStatechart rtsc = this;\r\nif (rtsc.getBehavioralElement()!=null && ((rtsc.getBehavioralElement() instanceof Port) || (rtsc.getBehavioralElement() instanceof Role))) return rtsc;\r\n\r\n// search for ancestor with behavioral element\r\nwhile (rtsc.isEmbedded()==true)\r\n{\r\nrtsc = rtsc.getEmbeddingRegion().getParentState().getStatechart();\r\nif (rtsc.getBehavioralElement()!=null && ((rtsc.getBehavioralElement() instanceof Port) || (rtsc.getBehavioralElement() instanceof Role))) return rtsc;\r\n} \r\n\r\n// no rtsc found with behavioral element\r\nreturn this;'"
	 * @generated
	 */
	RealtimeStatechart getPortOrRoleStatechart();

} // RealtimeStatechart
