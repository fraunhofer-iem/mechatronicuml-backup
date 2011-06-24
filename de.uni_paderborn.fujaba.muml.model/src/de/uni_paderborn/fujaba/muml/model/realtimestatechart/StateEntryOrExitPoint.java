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
 * The entry and exit points that are assigned to a state. They are derived from the entry and exit points of the statechart, the state embeds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint#getEntryOrExitPoint <em>Entry Or Exit Point</em>}</li>
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

} // StateEntryOrExitPoint
