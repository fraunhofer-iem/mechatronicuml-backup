/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sc Clock2sf Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.scClock2sfData#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.scClock2sfData#getSfClockVariable <em>Sf Clock Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClock2sfData()
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClock2sfData_ScClock()
	 * @model
	 * @generated
	 */
	Clock getScClock();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scClock2sfData#getScClock <em>Sc Clock</em>}' reference.
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
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getscClock2sfData_SfClockVariable()
	 * @model
	 * @generated
	 */
	Data getSfClockVariable();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.scClock2sfData#getSfClockVariable <em>Sf Clock Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Clock Variable</em>' reference.
	 * @see #getSfClockVariable()
	 * @generated
	 */
	void setSfClockVariable(Data value);

} // scClock2sfData
