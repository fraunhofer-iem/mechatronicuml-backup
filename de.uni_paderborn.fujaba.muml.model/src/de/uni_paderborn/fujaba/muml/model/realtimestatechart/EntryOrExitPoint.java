/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Or Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Entry points are defined points on a state that can be used to reach inner states.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitPoint#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitPoint()
 * @model
 * @generated
 */
public interface EntryOrExitPoint extends Vertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryExitPointKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the kind: Is this an entry or an exit point?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryExitPointKind
	 * @see #setKind(EntryExitPointKind)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitPoint_Kind()
	 * @model required="true"
	 * @generated
	 */
	EntryExitPointKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitPoint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryExitPointKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EntryExitPointKind value);

} // EntryOrExitPoint
