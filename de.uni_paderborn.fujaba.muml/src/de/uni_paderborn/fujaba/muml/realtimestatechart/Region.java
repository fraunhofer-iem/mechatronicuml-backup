/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.storydriven.core.NamedElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#isGmfHistory <em>Gmf History</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends NamedElement, PrioritizedElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this region embeds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' containment reference.
	 * @see #setStatechart(RealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRegion_Statechart()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart#getEmbeddingRegion
	 * @model opposite="embeddingRegion" containment="true" required="true"
	 * @generated
	 */
	RealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getStatechart <em>Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' containment reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Parent State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.State#getRegions <em>Regions</em>}'.
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
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRegion_ParentState()
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.State#getRegions
	 * @model opposite="regions" required="true" transient="false"
	 * @generated
	 */
	State getParentState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Region#getParentState <em>Parent State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' container reference.
	 * @see #getParentState()
	 * @generated
	 */
	void setParentState(State value);

	/**
	 * Returns the value of the '<em><b>Gmf History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gmf History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This feature exists for GMF. We use it to register a DerivedAttributeAdapter in RegionImpl to be able to get notifications in the CustomRegionEditPart, when the value of "RealtimeStatechart.history" changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf History</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getRegion_GmfHistory()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if statechart.oclIsUndefined() then\n\tfalse\nelse\n\tstatechart.history\nendif'"
	 * @generated
	 */
	boolean isGmfHistory();

} // Region
