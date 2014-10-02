/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDM Reachability Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SDMReachabilityGraph#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SDMReachabilityGraph#getContainedUnchangeableNodes <em>Contained Unchangeable Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SdmPackage#getSDMReachabilityGraph()
 * @model
 * @generated
 */
public interface SDMReachabilityGraph extends ReachabilityGraph {
	/**
	 * Returns the value of the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References all nodes that are used by the StepGraphs in this SDMReachabilityGraph that are never changed by the activities.
	 * These nodes will only be stored once and used by all StepGraphs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unchangeable Nodes</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SdmPackage#getSDMReachabilityGraph_UnchangeableNodes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EObject> getUnchangeableNodes();

	/**
	 * Returns the value of the '<em><b>Contained Unchangeable Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference can be used to contain graph objects referenced by the unchangeableNodes reference if they are not yet contained in any other object or resource. 
	 * By containing these nodes in the SDMReachabilityGraph, we enable to store the reachability graph in a resource and save it to a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Unchangeable Nodes</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SdmPackage#getSDMReachabilityGraph_ContainedUnchangeableNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getContainedUnchangeableNodes();

} // SDMReachabilityGraph
