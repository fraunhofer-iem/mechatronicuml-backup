/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.realtimestatechart.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forbidden State Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It forbids the combination of states. This dependency requires to add channels and an auxiliary region.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.ForbiddenStateCombination#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getForbiddenStateCombination()
 * @model
 * @generated
 */
public interface ForbiddenStateCombination extends Dependency {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Those states are not allowed to be entered in combination.
	 * If it contains more than two states, it does not forbid each possible combination, but only the one which is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getForbiddenStateCombination_States()
	 * @model lower="2"
	 * @generated
	 */
	EList<State> getStates();

} // ForbiddenStateCombination
