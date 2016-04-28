/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.muml.mumlcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents clocks of a realtime statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.Clock#getStatechart <em>Statechart</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this clock belongs to.
	 * \todoib{Should be 1..1, but GMF needs 0..1 here!}
	 * \todosd{is this info necessary?}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(RealtimeStatechart)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getClock_Statechart()
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getClocks
	 * @model opposite="clocks" transient="false"
	 * @generated
	 */
	RealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Clock#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(RealtimeStatechart value);

} // Clock
