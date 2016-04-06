/**
 */
package org.muml.cbs.dependencylanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.cbs.dependencylanguage.ClockMerge;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.pim.realtimestatechart.Clock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.ClockMergeImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.ClockMergeImpl#getClockName <em>Clock Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockMergeImpl extends DependencyImpl implements ClockMerge {
	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

	/**
	 * The default value of the '{@link #getClockName() <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockName() <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockName()
	 * @generated
	 * @ordered
	 */
	protected String clockName = CLOCK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.CLOCK_MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectResolvingEList<Clock>(Clock.class, this, DependencylanguagePackage.CLOCK_MERGE__CLOCKS);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockName() {
		return clockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockName(String newClockName) {
		String oldClockName = clockName;
		clockName = newClockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.CLOCK_MERGE__CLOCK_NAME, oldClockName, clockName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependencylanguagePackage.CLOCK_MERGE__CLOCKS:
				return getClocks();
			case DependencylanguagePackage.CLOCK_MERGE__CLOCK_NAME:
				return getClockName();
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
			case DependencylanguagePackage.CLOCK_MERGE__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case DependencylanguagePackage.CLOCK_MERGE__CLOCK_NAME:
				setClockName((String)newValue);
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
			case DependencylanguagePackage.CLOCK_MERGE__CLOCKS:
				getClocks().clear();
				return;
			case DependencylanguagePackage.CLOCK_MERGE__CLOCK_NAME:
				setClockName(CLOCK_NAME_EDEFAULT);
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
			case DependencylanguagePackage.CLOCK_MERGE__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case DependencylanguagePackage.CLOCK_MERGE__CLOCK_NAME:
				return CLOCK_NAME_EDEFAULT == null ? clockName != null : !CLOCK_NAME_EDEFAULT.equals(clockName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clockName: ");
		result.append(clockName);
		result.append(')');
		return result.toString();
	}

} //ClockMergeImpl
