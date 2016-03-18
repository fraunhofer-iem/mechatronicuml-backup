/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.StepGraph;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gt Step Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph#getObjectIdentifier <em>Object Identifier</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph#getClockInstances <em>Clock Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonPackage#getGtStepGraph()
 * @model
 * @generated
 */
public interface GtStepGraph extends StepGraph {
	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtAutomatonClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonPackage#getGtStepGraph_Invariant()
	 * @model containment="true"
	 * @generated
	 */
	EList<GtAutomatonClockConstraint> getInvariant();

	/**
	 * Returns the value of the '<em><b>Object Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Identifier</em>' containment reference.
	 * @see #setObjectIdentifier(ObjectIdentifier)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonPackage#getGtStepGraph_ObjectIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	ObjectIdentifier getObjectIdentifier();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtStepGraph#getObjectIdentifier <em>Object Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Identifier</em>' containment reference.
	 * @see #getObjectIdentifier()
	 * @generated
	 */
	void setObjectIdentifier(ObjectIdentifier value);

	/**
	 * Returns the value of the '<em><b>Clock Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.gtautomaton.GtautomatonPackage#getGtStepGraph_ClockInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockInstance> getClockInstances();

} // GtStepGraph
