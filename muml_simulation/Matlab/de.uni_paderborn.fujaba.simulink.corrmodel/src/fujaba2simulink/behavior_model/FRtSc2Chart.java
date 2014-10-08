/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Chart;
import de.uni_paderborn.fujaba.simulink.model.stateflow.State;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Transition;
import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FRt Sc2 Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getChart <em>Chart</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getFRtSc <em>FRt Sc</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getMt_par <em>Mt par</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfChartState <em>Sf Chart State</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfChartRegion <em>Sf Chart Region</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfQueueRegion <em>Sf Queue Region</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfSelfTrans <em>Sf Self Trans</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart()
 * @model
 * @generated
 */
public interface FRtSc2Chart extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' reference.
	 * @see #setChart(Chart)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_Chart()
	 * @model
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.FRtSc2Chart#getChart <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(Chart value);

	/**
	 * Returns the value of the '<em><b>FRt Sc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FRt Sc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FRt Sc</em>' reference.
	 * @see #setFRtSc(RealtimeStatechart)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_FRtSc()
	 * @model
	 * @generated
	 */
	RealtimeStatechart getFRtSc();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.FRtSc2Chart#getFRtSc <em>FRt Sc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRt Sc</em>' reference.
	 * @see #getFRtSc()
	 * @generated
	 */
	void setFRtSc(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Mt par</b></em>' reference list.
	 * The list contents are of type {@link fujaba2simulink.behavior_model.MT_Par2MTD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mt par</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mt par</em>' reference list.
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_Mt_par()
	 * @model
	 * @generated
	 */
	EList<MT_Par2MTD> getMt_par();

	/**
	 * Returns the value of the '<em><b>Sf Chart State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Chart State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Chart State</em>' reference.
	 * @see #setSfChartState(State)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_SfChartState()
	 * @model
	 * @generated
	 */
	State getSfChartState();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfChartState <em>Sf Chart State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Chart State</em>' reference.
	 * @see #getSfChartState()
	 * @generated
	 */
	void setSfChartState(State value);

	/**
	 * Returns the value of the '<em><b>Sf Chart Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Chart Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Chart Region</em>' reference.
	 * @see #setSfChartRegion(State)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_SfChartRegion()
	 * @model
	 * @generated
	 */
	State getSfChartRegion();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfChartRegion <em>Sf Chart Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Chart Region</em>' reference.
	 * @see #getSfChartRegion()
	 * @generated
	 */
	void setSfChartRegion(State value);

	/**
	 * Returns the value of the '<em><b>Sf Queue Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Queue Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Queue Region</em>' reference.
	 * @see #setSfQueueRegion(State)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_SfQueueRegion()
	 * @model
	 * @generated
	 */
	State getSfQueueRegion();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfQueueRegion <em>Sf Queue Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Queue Region</em>' reference.
	 * @see #getSfQueueRegion()
	 * @generated
	 */
	void setSfQueueRegion(State value);

	/**
	 * Returns the value of the '<em><b>Sf Self Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Self Trans</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Self Trans</em>' reference.
	 * @see #setSfSelfTrans(Transition)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getFRtSc2Chart_SfSelfTrans()
	 * @model
	 * @generated
	 */
	Transition getSfSelfTrans();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.FRtSc2Chart#getSfSelfTrans <em>Sf Self Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Self Trans</em>' reference.
	 * @see #getSfSelfTrans()
	 * @generated
	 */
	void setSfSelfTrans(Transition value);

} // FRtSc2Chart
