/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.component.Component;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.SubSystem;
import org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.stateflow.Chart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom Comp2 Atom Sys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl#getClockSignal <em>Clock Signal</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AtomComp2AtomSysImpl#getSys <em>Sys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomComp2AtomSysImpl extends AbstractContainerCorrespondenceNodeImpl implements AtomComp2AtomSys {
	/**
	 * The cached value of the '{@link #getClockSignal() <em>Clock Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSignal()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock clockSignal;

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
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected Component comp;

	/**
	 * The cached value of the '{@link #getSys() <em>Sys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys()
	 * @generated
	 * @ordered
	 */
	protected SubSystem sys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomComp2AtomSysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.ATOM_COMP2_ATOM_SYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getClockSignal() {
		if (clockSignal != null && ((EObject)clockSignal).eIsProxy()) {
			InternalEObject oldClockSignal = (InternalEObject)clockSignal;
			clockSignal = (InPortBlock)eResolveProxy(oldClockSignal);
			if (clockSignal != oldClockSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL, oldClockSignal, clockSignal));
			}
		}
		return clockSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetClockSignal() {
		return clockSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockSignal(InPortBlock newClockSignal) {
		InPortBlock oldClockSignal = clockSignal;
		clockSignal = newClockSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL, oldClockSignal, clockSignal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CHART, oldChart, chart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CHART, oldChart, chart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComp() {
		if (comp != null && comp.eIsProxy()) {
			InternalEObject oldComp = (InternalEObject)comp;
			comp = (Component)eResolveProxy(oldComp);
			if (comp != oldComp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__COMP, oldComp, comp));
			}
		}
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComp() {
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp(Component newComp) {
		Component oldComp = comp;
		comp = newComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__COMP, oldComp, comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem getSys() {
		if (sys != null && ((EObject)sys).eIsProxy()) {
			InternalEObject oldSys = (InternalEObject)sys;
			sys = (SubSystem)eResolveProxy(oldSys);
			if (sys != oldSys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__SYS, oldSys, sys));
			}
		}
		return sys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem basicGetSys() {
		return sys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSys(SubSystem newSys) {
		SubSystem oldSys = sys;
		sys = newSys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__SYS, oldSys, sys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL:
				if (resolve) return getClockSignal();
				return basicGetClockSignal();
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CHART:
				if (resolve) return getChart();
				return basicGetChart();
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__COMP:
				if (resolve) return getComp();
				return basicGetComp();
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__SYS:
				if (resolve) return getSys();
				return basicGetSys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL:
				setClockSignal((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CHART:
				setChart((Chart)newValue);
				return;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__COMP:
				setComp((Component)newValue);
				return;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__SYS:
				setSys((SubSystem)newValue);
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
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL:
				setClockSignal((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CHART:
				setChart((Chart)null);
				return;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__COMP:
				setComp((Component)null);
				return;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__SYS:
				setSys((SubSystem)null);
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
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CLOCK_SIGNAL:
				return clockSignal != null;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__CHART:
				return chart != null;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__COMP:
				return comp != null;
			case Fujaba2simulinkPackage.ATOM_COMP2_ATOM_SYS__SYS:
				return sys != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomComp2AtomSysImpl
