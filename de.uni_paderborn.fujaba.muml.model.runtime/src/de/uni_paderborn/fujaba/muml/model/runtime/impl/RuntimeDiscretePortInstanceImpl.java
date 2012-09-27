/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageQueue;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeDiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeDiscretePortInstanceImpl#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeDiscretePortInstanceImpl#getMessageQueue <em>Message Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeDiscretePortInstanceImpl extends DiscretePortInstanceImpl implements RuntimeDiscretePortInstance {
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
	protected MessageQueue messageQueue;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeDiscretePortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_DISCRETE_PORT_INSTANCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE, oldStatechartInstance, newStatechartInstance);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE, newStatechartInstance, newStatechartInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageQueue getMessageQueue() {
		return messageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageQueue(MessageQueue newMessageQueue, NotificationChain msgs) {
		MessageQueue oldMessageQueue = messageQueue;
		messageQueue = newMessageQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE, oldMessageQueue, newMessageQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageQueue(MessageQueue newMessageQueue) {
		if (newMessageQueue != messageQueue) {
			NotificationChain msgs = null;
			if (messageQueue != null)
				msgs = ((InternalEObject)messageQueue).eInverseRemove(this, RuntimePackage.MESSAGE_QUEUE__RUNTIME_BEHAVIORAL_ELEMENT, MessageQueue.class, msgs);
			if (newMessageQueue != null)
				msgs = ((InternalEObject)newMessageQueue).eInverseAdd(this, RuntimePackage.MESSAGE_QUEUE__RUNTIME_BEHAVIORAL_ELEMENT, MessageQueue.class, msgs);
			msgs = basicSetMessageQueue(newMessageQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE, newMessageQueue, newMessageQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				if (statechartInstance != null)
					msgs = ((InternalEObject)statechartInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE, null, msgs);
				return basicSetStatechartInstance((RealtimeStatechartInstance)otherEnd, msgs);
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE:
				if (messageQueue != null)
					msgs = ((InternalEObject)messageQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE, null, msgs);
				return basicSetMessageQueue((MessageQueue)otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				return basicSetStatechartInstance(null, msgs);
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE:
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				return getStatechartInstance();
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE:
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				setStatechartInstance((RealtimeStatechartInstance)newValue);
				return;
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE:
				setMessageQueue((MessageQueue)newValue);
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				setStatechartInstance((RealtimeStatechartInstance)null);
				return;
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE:
				setMessageQueue((MessageQueue)null);
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				return statechartInstance != null;
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE:
				return messageQueue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RuntimeBehavioralElement.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE: return RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE;
				case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE: return RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RuntimeBehavioralElement.class) {
			switch (baseFeatureID) {
				case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE: return RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE;
				case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_QUEUE: return RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_QUEUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RuntimeDiscretePortInstanceImpl
