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

import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.Operation;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#isHistory <em>History</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#isFlat <em>Flat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getAvailableClocks <em>Available Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getAllAvailableAttributes <em>All Available Attributes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getAllAvailableOperations <em>All Available Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueNameOfStates='self.vertices->select(oclIsTypeOf(State)).oclAsType(State)->isUnique(name)' MinOneState='self.vertices->select(oclIsTypeOf(State)).oclAsType(State)->notEmpty()' NoCycles='-- If we are contained within a statechart...\n(not self.embeddingRegion.parentState.statechart.oclIsUndefined())\n\nimplies\n\n-- ... then we must not be a super statechart of it.\n(not self.isSuperStatechartOf(self.embeddingRegion.parentState.statechart))' OneInitialState='self.vertices->select(x | x.oclIsKindOf(State)).oclAsType(State)->select(s |  s.initial)->size() = 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueNameOfStates MinOneState NoCycles'"
 * @generated
 */
public interface RealtimeStatechart extends NamedElement, CommentableElement, Behavior {
	/**
	 * Returns the value of the '<em><b>Embedding Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}'.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_EmbeddingRegion()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechart
	 * @model opposite="statechart" transient="false"
	 * @generated
	 */
	Region getEmbeddingRegion();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Region</em>' container reference.
	 * @see #getEmbeddingRegion()
	 * @generated
	 */
	void setEmbeddingRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transitions of the realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Transitions()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Vertices()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Vertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clocks of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Clocks()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock#getStatechart
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_History()
	 * @model
	 * @generated
	 */
	boolean isHistory();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#isHistory <em>History</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_EventQueueSize()
	 * @model
	 * @generated
	 */
	int getEventQueueSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Flat()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not(vertices -> exists( v : Vertex | v.oclIsTypeOf(State) implies v.oclAsType(State).regions -> notEmpty()))'"
	 * @generated
	 */
	boolean isFlat();

	/**
	 * Returns the value of the '<em><b>Available Clocks</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Available clocks are all clocks that were defined in this statechart or in ancestor statecharts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Clocks</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_AvailableClocks()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_Embedded()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not self.embeddingRegion.oclIsUndefined()'"
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Returns the value of the '<em><b>All Available Attributes</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Available Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Available Attributes</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_AllAvailableAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if embeddingRegion.oclIsUndefined() then self else embeddingRegion.parentState.statechart endif).attributes->asOrderedSet()'"
	 * @generated
	 */
	EList<Attribute> getAllAvailableAttributes();

	/**
	 * Returns the value of the '<em><b>All Available Operations</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Available Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Available Operations</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRealtimeStatechart_AllAvailableOperations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if embeddingRegion.oclIsUndefined() then self else embeddingRegion.parentState.statechart endif).operations ->asOrderedSet()'"
	 * @generated
	 */
	EList<Operation> getAllAvailableOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" statechartRequired="true"
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
