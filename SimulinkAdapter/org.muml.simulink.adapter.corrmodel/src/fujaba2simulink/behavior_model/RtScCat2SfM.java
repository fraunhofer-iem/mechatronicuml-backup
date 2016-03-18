/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rt Sc Cat2 Sf M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.RtScCat2SfM#getSfM <em>Sf M</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.RtScCat2SfM#getRtScCat <em>Rt Sc Cat</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getRtScCat2SfM()
 * @model
 * @generated
 */
public interface RtScCat2SfM extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sf M</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf M</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf M</em>' reference.
	 * @see #setSfM(StateflowMachine)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getRtScCat2SfM_SfM()
	 * @model
	 * @generated
	 */
	StateflowMachine getSfM();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.RtScCat2SfM#getSfM <em>Sf M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf M</em>' reference.
	 * @see #getSfM()
	 * @generated
	 */
	void setSfM(StateflowMachine value);

	/**
	 * Returns the value of the '<em><b>Rt Sc Cat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rt Sc Cat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rt Sc Cat</em>' reference.
	 * @see #setRtScCat(ModelElementCategory)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getRtScCat2SfM_RtScCat()
	 * @model
	 * @generated
	 */
	ModelElementCategory getRtScCat();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.RtScCat2SfM#getRtScCat <em>Rt Sc Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt Sc Cat</em>' reference.
	 * @see #getRtScCat()
	 * @generated
	 */
	void setRtScCat(ModelElementCategory value);

} // RtScCat2SfM
