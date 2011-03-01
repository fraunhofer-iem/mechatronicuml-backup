/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;

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
 * A representation of the model object '<em><b>UML Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStartState <em>UML Realtime Start State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeTransitions <em>UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStates <em>UML Realtime States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLInterfaceStatechart <em>UML Interface Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getProvidedMsgIFace <em>Provided Msg IFace</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getRequiredMsgIFace <em>Required Msg IFace</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#isIsEmbedded <em>Is Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLClocks <em>UML Clocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart()
 * @model
 * @generated
 */
public interface UMLRealtimeStatechart extends NamedElement, CommentableElement {
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_EventQueueSize()
	 * @model
	 * @generated
	 */
	int getEventQueueSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEventQueueSize <em>Event Queue Size</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_WcetDocument()
	 * @model
	 * @generated
	 */
	String getWcetDocument();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getWcetDocument <em>Wcet Document</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_SecurityLevel()
	 * @model default="0"
	 * @generated
	 */
	int getSecurityLevel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSecurityLevel <em>Security Level</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_SystemWcetMap()
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Map"
	 * @generated
	 */
	Map getSystemWcetMap();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getSystemWcetMap <em>System Wcet Map</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_Utilisation()
	 * @model
	 * @generated
	 */
	double getUtilisation();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUtilisation <em>Utilisation</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_ScheduleDocument()
	 * @model default="\\\"schedule.xml\\\""
	 * @generated
	 */
	String getScheduleDocument();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getScheduleDocument <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Document</em>' attribute.
	 * @see #getScheduleDocument()
	 * @generated
	 */
	void setScheduleDocument(String value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Start State</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getUMLRealtimeStartStateRev <em>UML Realtime Start State Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start state of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Start State</em>' containment reference.
	 * @see #setUMLRealtimeStartState(UMLRealtimeStartState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_UMLRealtimeStartState()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState#getUMLRealtimeStartStateRev
	 * @model opposite="uMLRealtimeStartStateRev" containment="true"
	 * @generated
	 */
	UMLRealtimeStartState getUMLRealtimeStartState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLRealtimeStartState <em>UML Realtime Start State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Start State</em>' containment reference.
	 * @see #getUMLRealtimeStartState()
	 * @generated
	 */
	void setUMLRealtimeStartState(UMLRealtimeStartState value);

	/**
	 * Returns the value of the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The complex state in which this realtime statechart is embedded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Complex Realtime State</em>' containment reference.
	 * @see #setUMLComplexRealtimeState(UMLRealtimeComplexState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_UMLComplexRealtimeState()
	 * @model containment="true"
	 * @generated
	 */
	UMLRealtimeComplexState getUMLComplexRealtimeState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Complex Realtime State</em>' containment reference.
	 * @see #getUMLComplexRealtimeState()
	 * @generated
	 */
	void setUMLComplexRealtimeState(UMLRealtimeComplexState value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transitions of the realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Transitions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_UMLRealtimeTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLRealtimeTransition> getUMLRealtimeTransitions();

	/**
	 * Returns the value of the '<em><b>UML Realtime States</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime States</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_UMLRealtimeStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<UMLRealtimeState> getUMLRealtimeStates();

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class belonging to this realtime statechart. Variables declared in the class might be manipulated by the statechart. Methods declared in the class might be executed by the statechart as side effects of the transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(EClass)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_EClass()
	 * @model containment="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>UML Interface Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Interface Statechart</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Interface Statechart</em>' containment reference.
	 * @see #setUMLInterfaceStatechart(UMLInterfaceStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_UMLInterfaceStatechart()
	 * @model containment="true"
	 * @generated
	 */
	UMLInterfaceStatechart getUMLInterfaceStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getUMLInterfaceStatechart <em>UML Interface Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Interface Statechart</em>' containment reference.
	 * @see #getUMLInterfaceStatechart()
	 * @generated
	 */
	void setUMLInterfaceStatechart(UMLInterfaceStatechart value);

	/**
	 * Returns the value of the '<em><b>Behavioral Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behovioral element this statechart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Element</em>' reference.
	 * @see #setBehavioralElement(BehavioralElement)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_BehavioralElement()
	 * @model
	 * @generated
	 */
	BehavioralElement getBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getBehavioralElement <em>Behavioral Element</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_ProvidedMsgIFace()
	 * @model mapType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.StringToEClass<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EClass>"
	 * @generated
	 */
	Map.Entry<String, EClass> getProvidedMsgIFace();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getProvidedMsgIFace <em>Provided Msg IFace</em>}' map.
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_RequiredMsgIFace()
	 * @model mapType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.StringToEClass<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EClass>"
	 * @generated
	 */
	Map.Entry<String, EClass> getRequiredMsgIFace();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#getRequiredMsgIFace <em>Required Msg IFace</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Msg IFace</em>' map.
	 * @see #getRequiredMsgIFace()
	 * @generated
	 */
	void setRequiredMsgIFace(Map.Entry<String, EClass> value);

	/**
	 * Returns the value of the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies whether this realtime statechart is embedded into a complex state or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Embedded</em>' attribute.
	 * @see #setIsEmbedded(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_IsEmbedded()
	 * @model derived="true"
	 * @generated
	 */
	boolean isIsEmbedded();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart#isIsEmbedded <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Embedded</em>' attribute.
	 * @see #isIsEmbedded()
	 * @generated
	 */
	void setIsEmbedded(boolean value);

	/**
	 * Returns the value of the '<em><b>UML Clocks</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clocks of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Clocks</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLRealtimeStatechart_UMLClocks()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getUMLRealtimeStatechart
	 * @model opposite="uMLRealtimeStatechart"
	 * @generated
	 */
	EList<UMLClock> getUMLClocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns realtime statechart which represents the root of the hierarchy tree.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	UMLRealtimeStatechart getHighestParentStatechart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper method for returning all realtime statecharts contained in any complex state.
	 * <!-- end-model-doc -->
	 * @model dataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Iterator"
	 * @generated
	 */
	Iterator iteratorOfAllSubRealtimeStatecharts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper method which adds all states contained by this statechart and all sub-statecharts to the set passed as an argument including or excluding the start states dependant on the second argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState>"
	 * @generated
	 */
	void addAllUMLRealtimeStates(Set<UMLRealtimeState> set, boolean inclusiveStartStates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds all complex states to the set given as an argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState>"
	 * @generated
	 */
	void addComplexUMLRealtimeStates(Set<UMLRealtimeComplexState> set);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Helper method which adds all transitions contained by this statechart and all sub-statecharts to the set passed as an argument including or excluding the init transition dependant on the second argument.
	 * <!-- end-model-doc -->
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition>"
	 * @generated
	 */
	void addAllUMLRealtimeTransitions(Set<UMLRealtimeTransition> set);

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
	 * @model setDataType="de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.Set<de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock>"
	 * @generated
	 */
	void addAllUMLClocks(Set<UMLClock> set, boolean excludeNoClock);

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

} // UMLRealtimeStatechart
