/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getHash <em>Hash</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getHashToStateList()
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
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getHashToStateList_Hash()
	 * @model
	 * @generated
	 */
	long getHash();

	/**
	 * Sets the value of the '{@link org.muml.core.reachanalysis.reachabilitygraph.HashToStateList#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(long value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all states that share the hash value "hash".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#getHashToStateList_States()
	 * @model
	 * @generated
	 */
	EList<ReachabilityGraphState> getStates();

} // HashToStateList
