/**
 */
package org.muml.cbs.dependencylanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.Effect;
import org.muml.cbs.dependencylanguage.MessageEvent;
import org.muml.cbs.dependencylanguage.TriggerMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.TriggerMessageImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.TriggerMessageImpl#getMessageEvent <em>Message Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerMessageImpl extends DependencyImpl implements TriggerMessage {
	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> effects;

	/**
	 * The cached value of the '{@link #getMessageEvent() <em>Message Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageEvent messageEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.TRIGGER_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<Effect>(Effect.class, this, DependencylanguagePackage.TRIGGER_MESSAGE__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent getMessageEvent() {
		return messageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageEvent(MessageEvent newMessageEvent, NotificationChain msgs) {
		MessageEvent oldMessageEvent = messageEvent;
		messageEvent = newMessageEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT, oldMessageEvent, newMessageEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageEvent(MessageEvent newMessageEvent) {
		if (newMessageEvent != messageEvent) {
			NotificationChain msgs = null;
			if (messageEvent != null)
				msgs = ((InternalEObject)messageEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT, null, msgs);
			if (newMessageEvent != null)
				msgs = ((InternalEObject)newMessageEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT, null, msgs);
			msgs = basicSetMessageEvent(newMessageEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT, newMessageEvent, newMessageEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.TRIGGER_MESSAGE__EFFECTS:
				return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
			case DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT:
				return basicSetMessageEvent(null, msgs);
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
			case DependencylanguagePackage.TRIGGER_MESSAGE__EFFECTS:
				return getEffects();
			case DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT:
				return getMessageEvent();
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
			case DependencylanguagePackage.TRIGGER_MESSAGE__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends Effect>)newValue);
				return;
			case DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT:
				setMessageEvent((MessageEvent)newValue);
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
			case DependencylanguagePackage.TRIGGER_MESSAGE__EFFECTS:
				getEffects().clear();
				return;
			case DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT:
				setMessageEvent((MessageEvent)null);
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
			case DependencylanguagePackage.TRIGGER_MESSAGE__EFFECTS:
				return effects != null && !effects.isEmpty();
			case DependencylanguagePackage.TRIGGER_MESSAGE__MESSAGE_EVENT:
				return messageEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerMessageImpl
