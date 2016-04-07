/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.realtimestatechart.Clock;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Clock2sf Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getSfClockVariable <em>Sf Clock Variable</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClock2sfData()
 * @model
 * @generated
 */
public interface scClock2sfData extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Clock</em>' reference.
	 * @see #setScClock(Clock)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClock2sfData_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getScClock <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Clock</em>' reference.
	 * @see #getScClock()
	 * @generated
	 */
	void setScClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Sf Clock Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Clock Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Clock Variable</em>' reference.
	 * @see #setSfClockVariable(Data)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getscClock2sfData_SfClockVariable()
	 * @model
	 * @generated
	 */
	Data getSfClockVariable();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.scClock2sfData#getSfClockVariable <em>Sf Clock Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Clock Variable</em>' reference.
	 * @see #getSfClockVariable()
	 * @generated
	 */
	void setSfClockVariable(Data value);

} // scClock2sfData
