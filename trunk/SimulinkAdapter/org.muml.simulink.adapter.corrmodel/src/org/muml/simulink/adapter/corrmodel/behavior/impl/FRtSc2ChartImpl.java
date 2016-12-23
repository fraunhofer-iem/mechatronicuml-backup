/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.FRtSc2Chart;
import org.muml.simulink.adapter.corrmodel.behavior.MT_Par2MTD;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRt Sc2 Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getFRtSc <em>FRt Sc</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getMt_par <em>Mt par</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getSfChartState <em>Sf Chart State</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getSfChartRegion <em>Sf Chart Region</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getSfQueueRegion <em>Sf Queue Region</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.FRtSc2ChartImpl#getSfSelfTrans <em>Sf Self Trans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FRtSc2ChartImpl extends AbstractContainerCorrespondenceNodeImpl implements FRtSc2Chart {
	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected Chart chart;

	/**
	 * The cached value of the '{@link #getFRtSc() <em>FRt Sc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRtSc()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechart fRtSc;

	/**
	 * The cached value of the '{@link #getMt_par() <em>Mt par</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMt_par()
	 * @generated
	 * @ordered
	 */
	protected EList<MT_Par2MTD> mt_par;

	/**
	 * The cached value of the '{@link #getSfChartState() <em>Sf Chart State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfChartState()
	 * @generated
	 * @ordered
	 */
	protected State sfChartState;

	/**
	 * The cached value of the '{@link #getSfChartRegion() <em>Sf Chart Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfChartRegion()
	 * @generated
	 * @ordered
	 */
	protected State sfChartRegion;

	/**
	 * The cached value of the '{@link #getSfQueueRegion() <em>Sf Queue Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfQueueRegion()
	 * @generated
	 * @ordered
	 */
	protected State sfQueueRegion;

	/**
	 * The cached value of the '{@link #getSfSelfTrans() <em>Sf Self Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfSelfTrans()
	 * @generated
	 * @ordered
	 */
	protected Transition sfSelfTrans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FRtSc2ChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.FRT_SC2_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart getChart() {
		if (chart != null && ((EObject)chart).eIsProxy()) {
			InternalEObject oldChart = (InternalEObject)chart;
			chart = (Chart)eResolveProxy(oldChart);
			if (chart != oldChart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FRT_SC2_CHART__CHART, oldChart, chart));
			}
		}
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart basicGetChart() {
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(Chart newChart) {
		Chart oldChart = chart;
		chart = newChart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FRT_SC2_CHART__CHART, oldChart, chart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getFRtSc() {
		if (fRtSc != null && fRtSc.eIsProxy()) {
			InternalEObject oldFRtSc = (InternalEObject)fRtSc;
			fRtSc = (RealtimeStatechart)eResolveProxy(oldFRtSc);
			if (fRtSc != oldFRtSc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FRT_SC2_CHART__FRT_SC, oldFRtSc, fRtSc));
			}
		}
		return fRtSc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart basicGetFRtSc() {
		return fRtSc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFRtSc(RealtimeStatechart newFRtSc) {
		RealtimeStatechart oldFRtSc = fRtSc;
		fRtSc = newFRtSc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FRT_SC2_CHART__FRT_SC, oldFRtSc, fRtSc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MT_Par2MTD> getMt_par() {
		if (mt_par == null) {
			mt_par = new EObjectResolvingEList<MT_Par2MTD>(MT_Par2MTD.class, this, BehaviorPackage.FRT_SC2_CHART__MT_PAR);
		}
		return mt_par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSfChartState() {
		if (sfChartState != null && ((EObject)sfChartState).eIsProxy()) {
			InternalEObject oldSfChartState = (InternalEObject)sfChartState;
			sfChartState = (State)eResolveProxy(oldSfChartState);
			if (sfChartState != oldSfChartState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FRT_SC2_CHART__SF_CHART_STATE, oldSfChartState, sfChartState));
			}
		}
		return sfChartState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSfChartState() {
		return sfChartState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfChartState(State newSfChartState) {
		State oldSfChartState = sfChartState;
		sfChartState = newSfChartState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FRT_SC2_CHART__SF_CHART_STATE, oldSfChartState, sfChartState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSfChartRegion() {
		if (sfChartRegion != null && ((EObject)sfChartRegion).eIsProxy()) {
			InternalEObject oldSfChartRegion = (InternalEObject)sfChartRegion;
			sfChartRegion = (State)eResolveProxy(oldSfChartRegion);
			if (sfChartRegion != oldSfChartRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FRT_SC2_CHART__SF_CHART_REGION, oldSfChartRegion, sfChartRegion));
			}
		}
		return sfChartRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSfChartRegion() {
		return sfChartRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfChartRegion(State newSfChartRegion) {
		State oldSfChartRegion = sfChartRegion;
		sfChartRegion = newSfChartRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FRT_SC2_CHART__SF_CHART_REGION, oldSfChartRegion, sfChartRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSfQueueRegion() {
		if (sfQueueRegion != null && ((EObject)sfQueueRegion).eIsProxy()) {
			InternalEObject oldSfQueueRegion = (InternalEObject)sfQueueRegion;
			sfQueueRegion = (State)eResolveProxy(oldSfQueueRegion);
			if (sfQueueRegion != oldSfQueueRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FRT_SC2_CHART__SF_QUEUE_REGION, oldSfQueueRegion, sfQueueRegion));
			}
		}
		return sfQueueRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSfQueueRegion() {
		return sfQueueRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfQueueRegion(State newSfQueueRegion) {
		State oldSfQueueRegion = sfQueueRegion;
		sfQueueRegion = newSfQueueRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FRT_SC2_CHART__SF_QUEUE_REGION, oldSfQueueRegion, sfQueueRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSfSelfTrans() {
		if (sfSelfTrans != null && ((EObject)sfSelfTrans).eIsProxy()) {
			InternalEObject oldSfSelfTrans = (InternalEObject)sfSelfTrans;
			sfSelfTrans = (Transition)eResolveProxy(oldSfSelfTrans);
			if (sfSelfTrans != oldSfSelfTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FRT_SC2_CHART__SF_SELF_TRANS, oldSfSelfTrans, sfSelfTrans));
			}
		}
		return sfSelfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSfSelfTrans() {
		return sfSelfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfSelfTrans(Transition newSfSelfTrans) {
		Transition oldSfSelfTrans = sfSelfTrans;
		sfSelfTrans = newSfSelfTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FRT_SC2_CHART__SF_SELF_TRANS, oldSfSelfTrans, sfSelfTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.FRT_SC2_CHART__CHART:
				if (resolve) return getChart();
				return basicGetChart();
			case BehaviorPackage.FRT_SC2_CHART__FRT_SC:
				if (resolve) return getFRtSc();
				return basicGetFRtSc();
			case BehaviorPackage.FRT_SC2_CHART__MT_PAR:
				return getMt_par();
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_STATE:
				if (resolve) return getSfChartState();
				return basicGetSfChartState();
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_REGION:
				if (resolve) return getSfChartRegion();
				return basicGetSfChartRegion();
			case BehaviorPackage.FRT_SC2_CHART__SF_QUEUE_REGION:
				if (resolve) return getSfQueueRegion();
				return basicGetSfQueueRegion();
			case BehaviorPackage.FRT_SC2_CHART__SF_SELF_TRANS:
				if (resolve) return getSfSelfTrans();
				return basicGetSfSelfTrans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.FRT_SC2_CHART__CHART:
				setChart((Chart)newValue);
				return;
			case BehaviorPackage.FRT_SC2_CHART__FRT_SC:
				setFRtSc((RealtimeStatechart)newValue);
				return;
			case BehaviorPackage.FRT_SC2_CHART__MT_PAR:
				getMt_par().clear();
				getMt_par().addAll((Collection<? extends MT_Par2MTD>)newValue);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_STATE:
				setSfChartState((State)newValue);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_REGION:
				setSfChartRegion((State)newValue);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_QUEUE_REGION:
				setSfQueueRegion((State)newValue);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_SELF_TRANS:
				setSfSelfTrans((Transition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.FRT_SC2_CHART__CHART:
				setChart((Chart)null);
				return;
			case BehaviorPackage.FRT_SC2_CHART__FRT_SC:
				setFRtSc((RealtimeStatechart)null);
				return;
			case BehaviorPackage.FRT_SC2_CHART__MT_PAR:
				getMt_par().clear();
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_STATE:
				setSfChartState((State)null);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_REGION:
				setSfChartRegion((State)null);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_QUEUE_REGION:
				setSfQueueRegion((State)null);
				return;
			case BehaviorPackage.FRT_SC2_CHART__SF_SELF_TRANS:
				setSfSelfTrans((Transition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.FRT_SC2_CHART__CHART:
				return chart != null;
			case BehaviorPackage.FRT_SC2_CHART__FRT_SC:
				return fRtSc != null;
			case BehaviorPackage.FRT_SC2_CHART__MT_PAR:
				return mt_par != null && !mt_par.isEmpty();
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_STATE:
				return sfChartState != null;
			case BehaviorPackage.FRT_SC2_CHART__SF_CHART_REGION:
				return sfChartRegion != null;
			case BehaviorPackage.FRT_SC2_CHART__SF_QUEUE_REGION:
				return sfQueueRegion != null;
			case BehaviorPackage.FRT_SC2_CHART__SF_SELF_TRANS:
				return sfSelfTrans != null;
		}
		return super.eIsSet(featureID);
	}

} //FRtSc2ChartImpl
