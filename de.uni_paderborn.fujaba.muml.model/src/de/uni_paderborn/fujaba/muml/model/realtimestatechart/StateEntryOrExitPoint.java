/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Entry Or Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The entry and exit points that are assigned to a state. They are derived from the entry and exit points of the statecharts, the state embeds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint#getEntryOrExitPoint <em>Entry Or Exit Point</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateEntryOrExitPoint()
 * @model
 * @generated
 */
public interface StateEntryOrExitPoint extends Vertex {
	/**
	 * Returns the value of the '<em><b>Entry Or Exit Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Or Exit Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Or Exit Point</em>' reference.
	 * @see #setEntryOrExitPoint(EntryOrExitPoint)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateEntryOrExitPoint_EntryOrExitPoint()
	 * @model derived="true"
	 * @generated
	 */
	EntryOrExitPoint getEntryOrExitPoint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint#getEntryOrExitPoint <em>Entry Or Exit Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Or Exit Point</em>' reference.
	 * @see #getEntryOrExitPoint()
	 * @generated
	 */
	void setEntryOrExitPoint(EntryOrExitPoint value);

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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateEntryOrExitPoint_Kind()
	 * @model required="true"
	 * @generated
	 */
	EntryExitPointKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryExitPointKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EntryExitPointKind value);

} // StateEntryOrExitPoint
