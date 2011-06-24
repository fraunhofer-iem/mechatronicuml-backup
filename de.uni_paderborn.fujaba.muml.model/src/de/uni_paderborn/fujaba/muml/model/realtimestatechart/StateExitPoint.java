/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getExitPoint <em>Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateExitPoint()
 * @model
 * @generated
 */
public interface StateExitPoint extends StateEntryOrExitPoint {
	/**
	 * Returns the value of the '<em><b>Exit Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Point</em>' reference.
	 * @see #setExitPoint(ExitPoint)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateExitPoint_ExitPoint()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='entryOrExitPoint.oclAsType(realtimestatechart::ExitPoint)'"
	 * @generated
	 */
	ExitPoint getExitPoint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getExitPoint <em>Exit Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Point</em>' reference.
	 * @see #getExitPoint()
	 * @generated
	 */
	void setExitPoint(ExitPoint value);

} // StateExitPoint
