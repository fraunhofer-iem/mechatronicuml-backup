/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeMessageBuffer;
import de.uni_paderborn.fujaba.muml.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.RuntimeBehavioralElementImpl#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.RuntimeBehavioralElementImpl#getMessageBuffer <em>Message Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuntimeBehavioralElementImpl extends NamedElementImpl implements RuntimeBehavioralElement {
	/**
	 * The cached value of the '{@link #getStatechartInstance() <em>Statechart Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechartInstance()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechartInstance statechartInstance;

	/**
	 * The cached value of the '{@link #getMessageBuffer() <em>Message Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected RuntimeMessageBuffer messageBuffer;

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
		if (statechartInstance != null && statechartInstance.eIsProxy()) {
			InternalEObject oldStatechartInstance = (InternalEObject)statechartInstance;
			statechartInstance = (RealtimeStatechartInstance)eResolveProxy(oldStatechartInstance);
			if (statechartInstance != oldStatechartInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, oldStatechartInstance, statechartInstance));
			}
		}
		return statechartInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartInstance basicGetStatechartInstance() {
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
	public RuntimeMessageBuffer getMessageBuffer() {
		return messageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageBuffer(RuntimeMessageBuffer newMessageBuffer, NotificationChain msgs) {
		RuntimeMessageBuffer oldMessageBuffer = messageBuffer;
		messageBuffer = newMessageBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER, oldMessageBuffer, newMessageBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageBuffer(RuntimeMessageBuffer newMessageBuffer) {
		if (newMessageBuffer != messageBuffer) {
			NotificationChain msgs = null;
			if (messageBuffer != null)
				msgs = ((InternalEObject)messageBuffer).eInverseRemove(this, RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, RuntimeMessageBuffer.class, msgs);
			if (newMessageBuffer != null)
				msgs = ((InternalEObject)newMessageBuffer).eInverseAdd(this, RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, RuntimeMessageBuffer.class, msgs);
			msgs = basicSetMessageBuffer(newMessageBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER, newMessageBuffer, newMessageBuffer));
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
					msgs = ((InternalEObject)statechartInstance).eInverseRemove(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, RealtimeStatechartInstance.class, msgs);
				return basicSetStatechartInstance((RealtimeStatechartInstance)otherEnd, msgs);
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER:
				if (messageBuffer != null)
					msgs = ((InternalEObject)messageBuffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER, null, msgs);
				return basicSetMessageBuffer((RuntimeMessageBuffer)otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER:
				return basicSetMessageBuffer(null, msgs);
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
				if (resolve) return getStatechartInstance();
				return basicGetStatechartInstance();
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER:
				return getMessageBuffer();
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER:
				setMessageBuffer((RuntimeMessageBuffer)newValue);
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER:
				setMessageBuffer((RuntimeMessageBuffer)null);
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
			case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER:
				return messageBuffer != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeBehavioralElementImpl
