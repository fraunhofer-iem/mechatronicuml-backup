/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeBehavioralElementImpl#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeBehavioralElementImpl#getMessageQueue <em>Message Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuntimeBehavioralElementImpl extends NamedElementImpl implements RuntimeBehavioralElement {
	/**
	 * The cached value of the '{@link #getStatechartInstance() <em>Statechart Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechartInstance()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechartInstance statechartInstance;

	/**
	 * The cached value of the '{@link #getMessageQueue() <em>Message Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueue()
	 * @generated
	 * @ordered
	 */
	protected MessageBuffer messageQueue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeBehavioralElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_BEHAVIORAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartInstance getStatechartInstance() {
		return statechartInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechartInstance(RealtimeStatechartInstance newStatechartInstance, NotificationChain msgs) {
		RealtimeStatechartInstance oldStatechartInstance = statechartInstance;
		statechartInstance = newStatechartInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, oldStatechartInstance, newStatechartInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechartInstance(RealtimeStatechartInstance newStatechartInstance) {
		if (newStatechartInstance != statechartInstance) {
			NotificationChain msgs = null;
			if (statechartInstance != null)
				msgs = ((InternalEObject)statechartInstance).eInverseRemove(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, RealtimeStatechartInstance.class, msgs);
			if (newStatechartInstance != null)
				msgs = ((InternalEObject)newStatechartInstance).eInverseAdd(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, RealtimeStatechartInstance.class, msgs);
			msgs = basicSetStatechartInstance(newStatechartInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, newStatechartInstance, newStatechartInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer getMessageQueue() {
		return messageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageQueue(MessageBuffer newMessageQueue, NotificationChain msgs) {
		MessageBuffer oldMessageQueue = messageQueue;
		messageQueue = newMessageQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE, oldMessageQueue, newMessageQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageQueue(MessageBuffer newMessageQueue) {
		if (newMessageQueue != messageQueue) {
			NotificationChain msgs = null;
			if (messageQueue != null)
				msgs = ((InternalEObject)messageQueue).eInverseRemove(this, RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, MessageBuffer.class, msgs);
			if (newMessageQueue != null)
				msgs = ((InternalEObject)newMessageQueue).eInverseAdd(this, RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, MessageBuffer.class, msgs);
			msgs = basicSetMessageQueue(newMessageQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE, newMessageQueue, newMessageQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE:
				if (statechartInstance != null)
					msgs = ((InternalEObject)statechartInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, null, msgs);
				return basicSetStatechartInstance((RealtimeStatechartInstance)otherEnd, msgs);
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE:
				if (messageQueue != null)
					msgs = ((InternalEObject)messageQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE, null, msgs);
				return basicSetMessageQueue((MessageBuffer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE:
				return basicSetStatechartInstance(null, msgs);
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE:
				return basicSetMessageQueue(null, msgs);
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE:
				return getStatechartInstance();
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE:
				return getMessageQueue();
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE:
				setStatechartInstance((RealtimeStatechartInstance)newValue);
				return;
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE:
				setMessageQueue((MessageBuffer)newValue);
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE:
				setStatechartInstance((RealtimeStatechartInstance)null);
				return;
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE:
				setMessageQueue((MessageBuffer)null);
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE:
				return statechartInstance != null;
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE:
				return messageQueue != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeBehavioralElementImpl
