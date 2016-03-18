/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.realtimestatechart.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Combination Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be resolved either to a Set of Transitions or to a Set of EntryOrExitEvents.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateCombinationEvent#getStates <em>States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateCombinationEvent#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getStateCombinationEvent()
 * @model
 * @generated
 */
public interface StateCombinationEvent extends SimpleEvent {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getStateCombinationEvent_States()
	 * @model lower="2"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateEventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * see StateEventKind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.StateEventKind
	 * @see #setKind(StateEventKind)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getStateCombinationEvent_Kind()
	 * @model required="true"
	 * @generated
	 */
	StateEventKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.StateCombinationEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.StateEventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StateEventKind value);

} // StateCombinationEvent
