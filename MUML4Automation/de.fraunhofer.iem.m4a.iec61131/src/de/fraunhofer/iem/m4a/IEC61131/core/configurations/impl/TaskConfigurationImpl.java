/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.TaskConfigurationImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskConfigurationImpl extends NamedElementImpl implements TaskConfiguration {
	/**
	 * The cached value of the '{@link #getSingle() <em>Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected DataSource single;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected DataSource interval;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected IntegerLiteral priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.TASK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getSingle() {
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingle(DataSource newSingle, NotificationChain msgs) {
		DataSource oldSingle = single;
		single = newSingle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.TASK_CONFIGURATION__SINGLE, oldSingle, newSingle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(DataSource newSingle) {
		if (newSingle != single) {
			NotificationChain msgs = null;
			if (single != null)
				msgs = ((InternalEObject)single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.TASK_CONFIGURATION__SINGLE, null, msgs);
			if (newSingle != null)
				msgs = ((InternalEObject)newSingle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.TASK_CONFIGURATION__SINGLE, null, msgs);
			msgs = basicSetSingle(newSingle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.TASK_CONFIGURATION__SINGLE, newSingle, newSingle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(DataSource newInterval, NotificationChain msgs) {
		DataSource oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL, oldInterval, newInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(DataSource newInterval) {
		if (newInterval != interval) {
			NotificationChain msgs = null;
			if (interval != null)
				msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL, null, msgs);
			if (newInterval != null)
				msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL, null, msgs);
			msgs = basicSetInterval(newInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL, newInterval, newInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(IntegerLiteral newPriority, NotificationChain msgs) {
		IntegerLiteral oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(IntegerLiteral newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationsPackage.TASK_CONFIGURATION__SINGLE:
				return basicSetSingle(null, msgs);
			case ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL:
				return basicSetInterval(null, msgs);
			case ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY:
				return basicSetPriority(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationsPackage.TASK_CONFIGURATION__SINGLE:
				return getSingle();
			case ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL:
				return getInterval();
			case ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY:
				return getPriority();
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
			case ConfigurationsPackage.TASK_CONFIGURATION__SINGLE:
				setSingle((DataSource)newValue);
				return;
			case ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL:
				setInterval((DataSource)newValue);
				return;
			case ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY:
				setPriority((IntegerLiteral)newValue);
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
			case ConfigurationsPackage.TASK_CONFIGURATION__SINGLE:
				setSingle((DataSource)null);
				return;
			case ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL:
				setInterval((DataSource)null);
				return;
			case ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY:
				setPriority((IntegerLiteral)null);
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
			case ConfigurationsPackage.TASK_CONFIGURATION__SINGLE:
				return single != null;
			case ConfigurationsPackage.TASK_CONFIGURATION__INTERVAL:
				return interval != null;
			case ConfigurationsPackage.TASK_CONFIGURATION__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskConfigurationImpl
