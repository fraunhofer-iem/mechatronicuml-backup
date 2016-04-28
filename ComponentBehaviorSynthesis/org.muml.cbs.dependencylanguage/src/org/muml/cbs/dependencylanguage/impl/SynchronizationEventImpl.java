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
import org.muml.cbs.dependencylanguage.SynchronizationEvent;
import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sychronization Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationEventImpl#getSelectorExpression <em>Selector Expression</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynchronizationEventImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizationEventImpl extends EventImpl implements SynchronizationEvent {
	/**
	 * The cached value of the '{@link #getSelectorExpression() <em>Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression selectorExpression;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSelectorExpression() {
		return selectorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectorExpression(Expression newSelectorExpression, NotificationChain msgs) {
		Expression oldSelectorExpression = selectorExpression;
		selectorExpression = newSelectorExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION, oldSelectorExpression, newSelectorExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectorExpression(Expression newSelectorExpression) {
		if (newSelectorExpression != selectorExpression) {
			NotificationChain msgs = null;
			if (selectorExpression != null)
				msgs = ((InternalEObject)selectorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION, null, msgs);
			if (newSelectorExpression != null)
				msgs = ((InternalEObject)newSelectorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION, null, msgs);
			msgs = basicSetSelectorExpression(newSelectorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION, newSelectorExpression, newSelectorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION:
				return basicSetSelectorExpression(null, msgs);
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT:
				return basicSetEvent(null, msgs);
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
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION:
				return getSelectorExpression();
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT:
				return getEvent();
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
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION:
				setSelectorExpression((Expression)newValue);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT:
				setEvent((Event)newValue);
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
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION:
				setSelectorExpression((Expression)null);
				return;
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT:
				setEvent((Event)null);
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
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION:
				return selectorExpression != null;
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizationEventImpl
