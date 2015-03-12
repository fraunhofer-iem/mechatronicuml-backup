/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties.impl;

import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.muml.psm.properties.Scheduling;

import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.impl.ExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.SchedulingImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.SchedulingImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.SchedulingImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingImpl extends ExtensionImpl implements Scheduling {
	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected TimeValue deadline;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimeValue period;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.SCHEDULING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getDeadline() {
		if (deadline != null && deadline.eIsProxy()) {
			InternalEObject oldDeadline = (InternalEObject)deadline;
			deadline = (TimeValue)eResolveProxy(oldDeadline);
			if (deadline != oldDeadline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.SCHEDULING__DEADLINE, oldDeadline, deadline));
			}
		}
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue basicGetDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(TimeValue newDeadline) {
		TimeValue oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SCHEDULING__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (TimeValue)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.SCHEDULING__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimeValue newPeriod) {
		TimeValue oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SCHEDULING__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (NaturalNumber)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.SCHEDULING__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(NaturalNumber newPriority) {
		NaturalNumber oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SCHEDULING__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.SCHEDULING__DEADLINE:
				if (resolve) return getDeadline();
				return basicGetDeadline();
			case PropertiesPackage.SCHEDULING__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case PropertiesPackage.SCHEDULING__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
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
			case PropertiesPackage.SCHEDULING__DEADLINE:
				setDeadline((TimeValue)newValue);
				return;
			case PropertiesPackage.SCHEDULING__PERIOD:
				setPeriod((TimeValue)newValue);
				return;
			case PropertiesPackage.SCHEDULING__PRIORITY:
				setPriority((NaturalNumber)newValue);
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
			case PropertiesPackage.SCHEDULING__DEADLINE:
				setDeadline((TimeValue)null);
				return;
			case PropertiesPackage.SCHEDULING__PERIOD:
				setPeriod((TimeValue)null);
				return;
			case PropertiesPackage.SCHEDULING__PRIORITY:
				setPriority((NaturalNumber)null);
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
			case PropertiesPackage.SCHEDULING__DEADLINE:
				return deadline != null;
			case PropertiesPackage.SCHEDULING__PERIOD:
				return period != null;
			case PropertiesPackage.SCHEDULING__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulingImpl
