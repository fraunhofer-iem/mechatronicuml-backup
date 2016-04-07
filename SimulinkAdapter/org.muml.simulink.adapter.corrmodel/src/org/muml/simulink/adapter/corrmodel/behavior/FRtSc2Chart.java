/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FRt Sc2 Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getChart <em>Chart</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getFRtSc <em>FRt Sc</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getMt_par <em>Mt par</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartState <em>Sf Chart State</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartRegion <em>Sf Chart Region</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfQueueRegion <em>Sf Queue Region</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfSelfTrans <em>Sf Self Trans</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart()
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_Chart()
	 * @model
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getChart <em>Chart</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_FRtSc()
	 * @model
	 * @generated
	 */
	RealtimeStatechart getFRtSc();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getFRtSc <em>FRt Sc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRt Sc</em>' reference.
	 * @see #getFRtSc()
	 * @generated
	 */
	void setFRtSc(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Mt par</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mt par</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mt par</em>' reference list.
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_Mt_par()
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_SfChartState()
	 * @model
	 * @generated
	 */
	State getSfChartState();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartState <em>Sf Chart State</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_SfChartRegion()
	 * @model
	 * @generated
	 */
	State getSfChartRegion();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfChartRegion <em>Sf Chart Region</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_SfQueueRegion()
	 * @model
	 * @generated
	 */
	State getSfQueueRegion();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfQueueRegion <em>Sf Queue Region</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getFRtSc2Chart_SfSelfTrans()
	 * @model
	 * @generated
	 */
	Transition getSfSelfTrans();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart#getSfSelfTrans <em>Sf Self Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Self Trans</em>' reference.
	 * @see #getSfSelfTrans()
	 * @generated
	 */
	void setSfSelfTrans(Transition value);

} // FRtSc2Chart
