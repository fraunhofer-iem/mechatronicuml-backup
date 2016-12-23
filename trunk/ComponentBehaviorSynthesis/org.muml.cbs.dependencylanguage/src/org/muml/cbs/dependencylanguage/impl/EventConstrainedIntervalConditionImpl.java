/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.Event;
import org.muml.cbs.dependencylanguage.EventConstrainedIntervalCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Constrained Interval Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl#getFromEvent <em>From Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl#getUntilEvent <em>Until Event</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.EventConstrainedIntervalConditionImpl#isEnabledInfite <em>Enabled Infite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventConstrainedIntervalConditionImpl extends ConditionImpl implements EventConstrainedIntervalCondition {
	/**
	 * The cached value of the '{@link #getFromEvent() <em>From Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromEvent()
	 * @generated
	 * @ordered
	 */
	protected Event fromEvent;

	/**
	 * The default value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEnabled = INITIAL_ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUntilEvent() <em>Until Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilEvent()
	 * @generated
	 * @ordered
	 */
	protected Event untilEvent;

	/**
	 * The default value of the '{@link #isEnabledInfite() <em>Enabled Infite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabledInfite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_INFITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabledInfite() <em>Enabled Infite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabledInfite()
	 * @generated
	 * @ordered
	 */
	protected boolean enabledInfite = ENABLED_INFITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventConstrainedIntervalConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.EVENT_CONSTRAINED_INTERVAL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getFromEvent() {
		return fromEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromEvent(Event newFromEvent, NotificationChain msgs) {
		Event oldFromEvent = fromEvent;
		fromEvent = newFromEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT, oldFromEvent, newFromEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromEvent(Event newFromEvent) {
		if (newFromEvent != fromEvent) {
			NotificationChain msgs = null;
			if (fromEvent != null)
				msgs = ((InternalEObject)fromEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT, null, msgs);
			if (newFromEvent != null)
				msgs = ((InternalEObject)newFromEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT, null, msgs);
			msgs = basicSetFromEvent(newFromEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT, newFromEvent, newFromEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEnabled() {
		return initialEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEnabled(boolean newInitialEnabled) {
		boolean oldInitialEnabled = initialEnabled;
		initialEnabled = newInitialEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED, oldInitialEnabled, initialEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getUntilEvent() {
		return untilEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntilEvent(Event newUntilEvent, NotificationChain msgs) {
		Event oldUntilEvent = untilEvent;
		untilEvent = newUntilEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT, oldUntilEvent, newUntilEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilEvent(Event newUntilEvent) {
		if (newUntilEvent != untilEvent) {
			NotificationChain msgs = null;
			if (untilEvent != null)
				msgs = ((InternalEObject)untilEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT, null, msgs);
			if (newUntilEvent != null)
				msgs = ((InternalEObject)newUntilEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT, null, msgs);
			msgs = basicSetUntilEvent(newUntilEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT, newUntilEvent, newUntilEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabledInfite() {
		return enabledInfite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledInfite(boolean newEnabledInfite) {
		boolean oldEnabledInfite = enabledInfite;
		enabledInfite = newEnabledInfite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE, oldEnabledInfite, enabledInfite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT:
				return basicSetFromEvent(null, msgs);
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT:
				return basicSetUntilEvent(null, msgs);
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
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT:
				return getFromEvent();
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED:
				return isInitialEnabled();
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT:
				return getUntilEvent();
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE:
				return isEnabledInfite();
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
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT:
				setFromEvent((Event)newValue);
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED:
				setInitialEnabled((Boolean)newValue);
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT:
				setUntilEvent((Event)newValue);
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE:
				setEnabledInfite((Boolean)newValue);
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
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT:
				setFromEvent((Event)null);
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED:
				setInitialEnabled(INITIAL_ENABLED_EDEFAULT);
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT:
				setUntilEvent((Event)null);
				return;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE:
				setEnabledInfite(ENABLED_INFITE_EDEFAULT);
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
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__FROM_EVENT:
				return fromEvent != null;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__INITIAL_ENABLED:
				return initialEnabled != INITIAL_ENABLED_EDEFAULT;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__UNTIL_EVENT:
				return untilEvent != null;
			case DependencylanguagePackage.EVENT_CONSTRAINED_INTERVAL_CONDITION__ENABLED_INFITE:
				return enabledInfite != ENABLED_INFITE_EDEFAULT;
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
		result.append(" (initialEnabled: ");
		result.append(initialEnabled);
		result.append(", enabledInfite: ");
		result.append(enabledInfite);
		result.append(')');
		return result.toString();
	}

} //EventConstrainedIntervalConditionImpl
