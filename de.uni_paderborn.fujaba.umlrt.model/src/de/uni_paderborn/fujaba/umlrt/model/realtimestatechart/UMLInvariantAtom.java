/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Invariant Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the invariant belonging to a complex state.
 * TODO: Wondering why there is not any relation to 'UMLClock'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLInvariantAtom()
 * @model
 * @generated
 */
public interface UMLInvariantAtom extends EObject {
	/**
	 * Returns the value of the '<em><b>UML Complex Realtime State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The complex state this invariant belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Complex Realtime State</em>' containment reference.
	 * @see #setUMLComplexRealtimeState(UMLRealtimeComplexState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getUMLInvariantAtom_UMLComplexRealtimeState()
	 * @model containment="true"
	 * @generated
	 */
	UMLRealtimeComplexState getUMLComplexRealtimeState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Complex Realtime State</em>' containment reference.
	 * @see #getUMLComplexRealtimeState()
	 * @generated
	 */
	void setUMLComplexRealtimeState(UMLRealtimeComplexState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(UMLRealtimeStatechart rtsc, UMLInvariantAtom newAtom);

} // UMLInvariantAtom
