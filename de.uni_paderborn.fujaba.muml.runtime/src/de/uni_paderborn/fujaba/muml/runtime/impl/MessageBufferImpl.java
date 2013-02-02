/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime.impl;

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
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.runtime.MessageBuffer;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.MessageBufferImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.MessageBufferImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.MessageBufferImpl#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageBufferImpl extends ExtendableElementImpl implements MessageBuffer {
	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.MESSAGE_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		int oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_BUFFER__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeMessage> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<RuntimeMessage>(RuntimeMessage.class, this, RuntimePackage.MESSAGE_BUFFER__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement getRuntimeBehavioralElement() {
		if (eContainerFeatureID() != RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT) return null;
		return (RuntimeBehavioralElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRuntimeBehavioralElement, RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement) {
		if (newRuntimeBehavioralElement != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT && newRuntimeBehavioralElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT, newRuntimeBehavioralElement, newRuntimeBehavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
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
			case RuntimePackage.MESSAGE_BUFFER__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
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
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
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
			case RuntimePackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return getBufferSize();
			case RuntimePackage.MESSAGE_BUFFER__MESSAGES:
				return getMessages();
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				return getRuntimeBehavioralElement();
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
			case RuntimePackage.MESSAGE_BUFFER__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case RuntimePackage.MESSAGE_BUFFER__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends RuntimeMessage>)newValue);
				return;
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				setRuntimeBehavioralElement((RuntimeBehavioralElement)newValue);
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
			case RuntimePackage.MESSAGE_BUFFER__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case RuntimePackage.MESSAGE_BUFFER__MESSAGES:
				getMessages().clear();
				return;
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				setRuntimeBehavioralElement((RuntimeBehavioralElement)null);
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
			case RuntimePackage.MESSAGE_BUFFER__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case RuntimePackage.MESSAGE_BUFFER__MESSAGES:
				return messages != null && !messages.isEmpty();
			case RuntimePackage.MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT:
				return getRuntimeBehavioralElement() != null;
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
		result.append(" (bufferSize: ");
		result.append(bufferSize);
		result.append(')');
		return result.toString();
	}

} //MessageBufferImpl
