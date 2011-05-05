/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getProvidedMsgIFace <em>Provided Msg IFace</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getRequiredMsgIFace <em>Required Msg IFace</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getClocks <em>Clocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRealtimeStatechart extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Event Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Queue Size</em>' attribute.
	 * @see #setEventQueueSize(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_EventQueueSize()
	 * @model
	 * @generated
	 */
	int getEventQueueSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Queue Size</em>' attribute.
	 * @see #getEventQueueSize()
	 * @generated
	 */
	void setEventQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Wcet Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wcet Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet Document</em>' attribute.
	 * @see #setWcetDocument(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_WcetDocument()
	 * @model
	 * @generated
	 */
	String getWcetDocument();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet Document</em>' attribute.
	 * @see #getWcetDocument()
	 * @generated
	 */
	void setWcetDocument(String value);

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #setSecurityLevel(int)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_SecurityLevel()
	 * @model default="0"
	 * @generated
	 */
	int getSecurityLevel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(int value);

	/**
	 * Returns the value of the '<em><b>System Wcet Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Wcet Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Wcet Map</em>' attribute.
	 * @see #setSystemWcetMap(Map)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_SystemWcetMap()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Map"
	 * @generated
	 */
	Map getSystemWcetMap();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Wcet Map</em>' attribute.
	 * @see #getSystemWcetMap()
	 * @generated
	 */
	void setSystemWcetMap(Map value);

	/**
	 * Returns the value of the '<em><b>Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisation</em>' attribute.
	 * @see #setUtilisation(double)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_Utilisation()
	 * @model
	 * @generated
	 */
	double getUtilisation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getUtilisation <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisation</em>' attribute.
	 * @see #getUtilisation()
	 * @generated
	 */
	void setUtilisation(double value);

	/**
	 * Returns the value of the '<em><b>Schedule Document</b></em>' attribute.
	 * The default value is <code>"\\\"schedule.xml\\\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Document</em>' attribute.
	 * @see #setScheduleDocument(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_ScheduleDocument()
	 * @model default="\\\"schedule.xml\\\""
	 * @generated
	 */
	String getScheduleDocument();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Document</em>' attribute.
	 * @see #getScheduleDocument()
	 * @generated
	 */
	void setScheduleDocument(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transitions of the realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_Transitions()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_Vertices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertices();

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class belonging to this realtime statechart. Variables declared in the class might be manipulated by the statechart. Methods declared in the class might be executed by the statechart as side effects of the transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(EClass)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_EClass()
	 * @model containment="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behovioral element this statechart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Element</em>' reference.
	 * @see #setBehavioralElement(BehavioralElement)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_BehavioralElement()
	 * @model
	 * @generated
	 */
	BehavioralElement getBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Element</em>' reference.
	 * @see #getBehavioralElement()
	 * @generated
	 */
	void setBehavioralElement(BehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Provided Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Msg IFace</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Msg IFace</em>' map.
	 * @see #setProvidedMsgIFace(Map.Entry)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_ProvidedMsgIFace()
	 * @model mapType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.StringToEClass<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EClass>"
	 * @generated
	 */
	Map.Entry<String, EClass> getProvidedMsgIFace();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getProvidedMsgIFace <em>Provided Msg IFace</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Msg IFace</em>' map.
	 * @see #getProvidedMsgIFace()
	 * @generated
	 */
	void setProvidedMsgIFace(Map.Entry<String, EClass> value);

	/**
	 * Returns the value of the '<em><b>Required Msg IFace</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Msg IFace</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Msg IFace</em>' map.
	 * @see #setRequiredMsgIFace(Map.Entry)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_RequiredMsgIFace()
	 * @model mapType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.StringToEClass<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EClass>"
	 * @generated
	 */
	Map.Entry<String, EClass> getRequiredMsgIFace();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#getRequiredMsgIFace <em>Required Msg IFace</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Msg IFace</em>' map.
	 * @see #getRequiredMsgIFace()
	 * @generated
	 */
	void setRequiredMsgIFace(Map.Entry<String, EClass> value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies whether this realtime statechart is embedded into a complex state or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see #setEmbedded(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_Embedded()
	 * @model derived="true"
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart#isEmbedded <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' attribute.
	 * @see #isEmbedded()
	 * @generated
	 */
	void setEmbedded(boolean value);

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clocks of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getAbstractRealtimeStatechart_Clocks()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<Clock> getClocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns realtime statechart which represents the root of the hierarchy tree.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AbstractRealtimeStatechart getHighestParentStatechart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper method which adds all states contained by this statechart and all sub-statecharts to the set passed as an argument including or excluding the start states dependant on the second argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex>"
	 * @generated
	 */
	void addAllUMLRealtimeStates(Set<Vertex> set, boolean inclusiveStartStates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds all complex states to the set given as an argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State>"
	 * @generated
	 */
	void addComplexUMLRealtimeStates(Set<State> set);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper method which adds all transitions contained by this statechart and all sub-statecharts to the set passed as an argument including or excluding the init transition dependant on the second argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition>"
	 * @generated
	 */
	void addAllUMLRealtimeTransitions(Set<Transition> set);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yields an iterator containing all clocks contained by this statechart or by a sub-statechart of this statechart including or excluding the clock "NO_CLOCK" depending on the second argument.
	 * <!-- end-model-doc -->
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Iterator"
	 * @generated
	 */
	Iterator iteratorOfAllUMLClocks(boolean excludeNoClock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper method which adds all clocks contained by this statechart and all sub-statecharts to the set passed as an argument including or excluding the clock "NO_CLOCK" dependant on the second argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock>"
	 * @generated
	 */
	void addAllUMLClocks(Set<Clock> set, boolean excludeNoClock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone();

} // AbstractRealtimeStatechart
