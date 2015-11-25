/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash To State List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Helper data structure that allows accessing all states with a given hash value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList#getHash <em>Hash</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getHashToStateList()
 * @model
 * @generated
 */
public interface HashToStateList extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(long)
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getHashToStateList_Hash()
	 * @model
	 * @generated
	 */
	long getHash();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.HashToStateList#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(long value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all states that share the hash value "hash".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage#getHashToStateList_States()
	 * @model
	 * @generated
	 */
	EList<ReachabilityGraphState> getStates();

} // HashToStateList
