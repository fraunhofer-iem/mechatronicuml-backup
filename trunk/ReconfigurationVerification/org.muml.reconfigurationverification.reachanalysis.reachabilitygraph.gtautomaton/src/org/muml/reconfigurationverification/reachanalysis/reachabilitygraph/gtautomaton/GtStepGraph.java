/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton;

import org.eclipse.emf.common.util.EList;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gt Step Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getObjectIdentifier <em>Object Identifier</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getClockInstances <em>Clock Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtStepGraph()
 * @model
 * @generated
 */
public interface GtStepGraph extends StepGraph {
	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtStepGraph_Invariant()
	 * @model containment="true"
	 * @generated
	 */
	EList<GtAutomatonClockConstraint> getInvariant();

	/**
	 * Returns the value of the '<em><b>Object Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Identifier</em>' containment reference.
	 * @see #setObjectIdentifier(ObjectIdentifier)
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtStepGraph_ObjectIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	ObjectIdentifier getObjectIdentifier();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph#getObjectIdentifier <em>Object Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Identifier</em>' containment reference.
	 * @see #getObjectIdentifier()
	 * @generated
	 */
	void setObjectIdentifier(ObjectIdentifier value);

	/**
	 * Returns the value of the '<em><b>Clock Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instances</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#getGtStepGraph_ClockInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockInstance> getClockInstances();

} // GtStepGraph
