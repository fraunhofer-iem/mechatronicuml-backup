/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regions enables hierarchy and parallelism. Each state can have zero, one or more regions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechartDerived <em>Statechart Derived</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement, Prioritizable {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this region embeds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' reference.
	 * @see #setStatechart(RealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRegion_Statechart()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart#getEmbeddingRegion
	 * @model opposite="embeddingRegion" required="true"
	 * @generated
	 */
	RealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Parent State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state this region is embedded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent State</em>' container reference.
	 * @see #setParentState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRegion_ParentState()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getRegions
	 * @model opposite="regions" required="true" transient="false"
	 * @generated
	 */
	State getParentState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getParentState <em>Parent State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' container reference.
	 * @see #getParentState()
	 * @generated
	 */
	void setParentState(State value);

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived vertices (e.g. states) of the realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRegion_Vertices()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- we only derive the statechart, if it is no super statechart of our parentState\'s statechart\n-- this ensures that no endless recursion happens, when creating child-editparts for the states.\n\nif self.statechart.oclIsUndefined() or self.statechart.isSuperStatechartOf(self.parentState.statechart) then\r\n\tOrderedSet { }\r\nelse\r\n\tself.statechart.vertices\r\nendif'"
	 * @generated
	 */
	EList<Vertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived transitions of the realtime statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRegion_Transitions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- we only derive the statechart, if it is no super statechart of our parentState\'s statechart\n-- this ensures that no endless recursion happens, when creating child-editparts for the states.\n\nif self.statechart.oclIsUndefined() or self.statechart.isSuperStatechartOf(self.parentState.statechart) then\r\n\tOrderedSet { }\r\nelse\r\n\tself.statechart.transitions\r\nendif'"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Statechart Derived</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived realtime statecharts .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart Derived</em>' containment reference.
	 * @see #setStatechartDerived(RealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getRegion_StatechartDerived()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- we only derive the statechart, if it is no super statechart of our parentState\'s statechart\r\n-- this ensures that no endless recursion happens, when creating child-editparts for the states.\r\n\r\nif self.statechart.oclIsUndefined() or self.statechart.isSuperStatechartOf(self.parentState.statechart) then\r\r\n\tnull\r\r\nelse\r\r\n\tself.statechart\r\r\nendif'"
	 * @generated
	 */
	RealtimeStatechart getStatechartDerived();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region#getStatechartDerived <em>Statechart Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart Derived</em>' containment reference.
	 * @see #getStatechartDerived()
	 * @generated
	 */
	void setStatechartDerived(RealtimeStatechart value);

} // Region
