/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.impl;

import de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.BoundClockInstances;
import de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.TsdmhelperPackage;

import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Clock Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.impl.BoundClockInstancesImpl#getClockInstances <em>Clock Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundClockInstancesImpl extends EObjectImpl implements BoundClockInstances {
	/**
	 * The cached value of the '{@link #getClockInstances() <em>Clock Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstance> clockInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundClockInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsdmhelperPackage.Literals.BOUND_CLOCK_INSTANCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstance> getClockInstances() {
		if (clockInstances == null) {
			clockInstances = new EObjectResolvingEList<ClockInstance>(ClockInstance.class, this, TsdmhelperPackage.BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES);
		}
		return clockInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TsdmhelperPackage.BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES:
				return getClockInstances();
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
			case TsdmhelperPackage.BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES:
				getClockInstances().clear();
				getClockInstances().addAll((Collection<? extends ClockInstance>)newValue);
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
			case TsdmhelperPackage.BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES:
				getClockInstances().clear();
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
			case TsdmhelperPackage.BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES:
				return clockInstances != null && !clockInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoundClockInstancesImpl
