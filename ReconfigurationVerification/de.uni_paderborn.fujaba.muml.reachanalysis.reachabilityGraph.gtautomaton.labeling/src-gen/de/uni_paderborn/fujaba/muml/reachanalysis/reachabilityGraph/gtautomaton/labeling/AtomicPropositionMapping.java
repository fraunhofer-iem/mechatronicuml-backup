/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.Extension;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.StepGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Proposition Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.AtomicPropositionMapping#getPropositions <em>Propositions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.AtomicPropositionMapping#getStepGraph <em>Step Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.LabelingPackage#getAtomicPropositionMapping()
 * @model
 * @generated
 */
public interface AtomicPropositionMapping extends Extension {
	/**
	 * Returns the value of the '<em><b>Propositions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propositions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propositions</em>' attribute list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.LabelingPackage#getAtomicPropositionMapping_Propositions()
	 * @model
	 * @generated
	 */
	EList<String> getPropositions();

	/**
	 * Returns the value of the '<em><b>Step Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Graph</em>' reference.
	 * @see #setStepGraph(StepGraph)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.LabelingPackage#getAtomicPropositionMapping_StepGraph()
	 * @model required="true"
	 * @generated
	 */
	StepGraph getStepGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.labeling.AtomicPropositionMapping#getStepGraph <em>Step Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Graph</em>' reference.
	 * @see #getStepGraph()
	 * @generated
	 */
	void setStepGraph(StepGraph value);

} // AtomicPropositionMapping
