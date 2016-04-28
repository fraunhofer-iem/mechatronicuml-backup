/**
 */
package org.muml.verification.core.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.pim.connector.MessageBuffer;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeMessage;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RuntimeMessageBufferImpl#getMessageBuffer <em>Message Buffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeMessageBufferImpl extends ExtendableElementImpl implements RuntimeMessageBuffer {
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeMessage> messages;

	/**
	 * The cached value of the '{@link #getMessageBuffer() <em>Message Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected MessageBuffer messageBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeMessageBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_MESSAGE_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeMessage> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<RuntimeMessage>(RuntimeMessage.class, this, RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement getRuntimeBehavioralElement() {
		if (eContainerFeatureID() != RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT) return null;
		return (RuntimeBehavioralElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRuntimeBehavioralElement, RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement) {
		if (newRuntimeBehavioralElement != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT && newRuntimeBehavioralElement != null)) {
			if (EcoreUtil.isAncestor(this, newRuntimeBehavioralElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRuntimeBehavioralElement != null)
				msgs = ((InternalEObject)newRuntimeBehavioralElement).eInverseAdd(this, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER, RuntimeBehavioralElement.class, msgs);
			msgs = basicSetRuntimeBehavioralElement(newRuntimeBehavioralElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, newRuntimeBehavioralElement, newRuntimeBehavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer getMessageBuffer() {
		if (messageBuffer != null && messageBuffer.eIsProxy()) {
			InternalEObject oldMessageBuffer = (InternalEObject)messageBuffer;
			messageBuffer = (MessageBuffer)eResolveProxy(oldMessageBuffer);
			if (messageBuffer != oldMessageBuffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER, oldMessageBuffer, messageBuffer));
			}
		}
		return messageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer basicGetMessageBuffer() {
		return messageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageBuffer(MessageBuffer newMessageBuffer) {
		MessageBuffer oldMessageBuffer = messageBuffer;
		messageBuffer = newMessageBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER, oldMessageBuffer, messageBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRuntimeBehavioralElement((RuntimeBehavioralElement)otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				return basicSetRuntimeBehavioralElement(null, msgs);
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
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER, RuntimeBehavioralElement.class, msgs);
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
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGES:
				return getMessages();
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				return getRuntimeBehavioralElement();
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER:
				if (resolve) return getMessageBuffer();
				return basicGetMessageBuffer();
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
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends RuntimeMessage>)newValue);
				return;
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				setRuntimeBehavioralElement((RuntimeBehavioralElement)newValue);
				return;
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER:
				setMessageBuffer((MessageBuffer)newValue);
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
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGES:
				getMessages().clear();
				return;
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				setRuntimeBehavioralElement((RuntimeBehavioralElement)null);
				return;
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER:
				setMessageBuffer((MessageBuffer)null);
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
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGES:
				return messages != null && !messages.isEmpty();
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				return getRuntimeBehavioralElement() != null;
			case RuntimePackage.RUNTIME_MESSAGE_BUFFER__MESSAGE_BUFFER:
				return messageBuffer != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeMessageBufferImpl
