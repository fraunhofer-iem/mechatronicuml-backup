/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.mumlcore.impl.ExtendableElementImpl;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeConnectorInstance;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message On Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.impl.MessageOnConnectorImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.MessageOnConnectorImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.MessageOnConnectorImpl#getRuntimeConnectorInstance <em>Runtime Connector Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageOnConnectorImpl extends ExtendableElementImpl implements MessageOnConnector {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected RuntimeBehavioralElement receiver;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected RuntimeMessage message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOnConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.MESSAGE_ON_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (RuntimeBehavioralElement)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.MESSAGE_ON_CONNECTOR__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(RuntimeBehavioralElement newReceiver) {
		RuntimeBehavioralElement oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_CONNECTOR__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeMessage getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(RuntimeMessage newMessage, NotificationChain msgs) {
		RuntimeMessage oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(RuntimeMessage newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeConnectorInstance getRuntimeConnectorInstance() {
		if (eContainerFeatureID() != RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE) return null;
		return (RuntimeConnectorInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeConnectorInstance(RuntimeConnectorInstance newRuntimeConnectorInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRuntimeConnectorInstance, RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeConnectorInstance(RuntimeConnectorInstance newRuntimeConnectorInstance) {
		if (newRuntimeConnectorInstance != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE && newRuntimeConnectorInstance != null)) {
			if (EcoreUtil.isAncestor(this, newRuntimeConnectorInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRuntimeConnectorInstance != null)
				msgs = ((InternalEObject)newRuntimeConnectorInstance).eInverseAdd(this, RuntimePackage.RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES, RuntimeConnectorInstance.class, msgs);
			msgs = basicSetRuntimeConnectorInstance(newRuntimeConnectorInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE, newRuntimeConnectorInstance, newRuntimeConnectorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRuntimeConnectorInstance((RuntimeConnectorInstance)otherEnd, msgs);
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
			case RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE:
				return basicSetMessage(null, msgs);
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				return basicSetRuntimeConnectorInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES, RuntimeConnectorInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE:
				return getMessage();
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				return getRuntimeConnectorInstance();
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
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RECEIVER:
				setReceiver((RuntimeBehavioralElement)newValue);
				return;
			case RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE:
				setMessage((RuntimeMessage)newValue);
				return;
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				setRuntimeConnectorInstance((RuntimeConnectorInstance)newValue);
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
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RECEIVER:
				setReceiver((RuntimeBehavioralElement)null);
				return;
			case RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE:
				setMessage((RuntimeMessage)null);
				return;
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				setRuntimeConnectorInstance((RuntimeConnectorInstance)null);
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
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RECEIVER:
				return receiver != null;
			case RuntimePackage.MESSAGE_ON_CONNECTOR__MESSAGE:
				return message != null;
			case RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE:
				return getRuntimeConnectorInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageOnConnectorImpl
