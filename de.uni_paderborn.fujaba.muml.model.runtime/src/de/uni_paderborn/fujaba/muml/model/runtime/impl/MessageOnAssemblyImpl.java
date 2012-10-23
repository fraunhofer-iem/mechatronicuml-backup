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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeMessage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message On Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MessageOnAssemblyImpl#getRuntimeAssembly <em>Runtime Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageOnAssemblyImpl extends EObjectImpl implements MessageOnAssembly {
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
	protected MessageOnAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.MESSAGE_ON_ASSEMBLY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.MESSAGE_ON_ASSEMBLY__RECEIVER, oldReceiver, receiver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_ASSEMBLY__RECEIVER, oldReceiver, receiver));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE, oldMessage, newMessage);
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
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAssemblyInstance getRuntimeAssembly() {
		if (eContainerFeatureID() != RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY) return null;
		return (RuntimeAssemblyInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeAssembly(RuntimeAssemblyInstance newRuntimeAssembly, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRuntimeAssembly, RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeAssembly(RuntimeAssemblyInstance newRuntimeAssembly) {
		if (newRuntimeAssembly != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY && newRuntimeAssembly != null)) {
			if (EcoreUtil.isAncestor(this, newRuntimeAssembly))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRuntimeAssembly != null)
				msgs = ((InternalEObject)newRuntimeAssembly).eInverseAdd(this, RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__TRANSIENT_MESSAGES, RuntimeAssemblyInstance.class, msgs);
			msgs = basicSetRuntimeAssembly(newRuntimeAssembly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY, newRuntimeAssembly, newRuntimeAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRuntimeAssembly((RuntimeAssemblyInstance)otherEnd, msgs);
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
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE:
				return basicSetMessage(null, msgs);
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				return basicSetRuntimeAssembly(null, msgs);
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
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__TRANSIENT_MESSAGES, RuntimeAssemblyInstance.class, msgs);
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
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE:
				return getMessage();
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				return getRuntimeAssembly();
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
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RECEIVER:
				setReceiver((RuntimeBehavioralElement)newValue);
				return;
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE:
				setMessage((RuntimeMessage)newValue);
				return;
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				setRuntimeAssembly((RuntimeAssemblyInstance)newValue);
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
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RECEIVER:
				setReceiver((RuntimeBehavioralElement)null);
				return;
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE:
				setMessage((RuntimeMessage)null);
				return;
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				setRuntimeAssembly((RuntimeAssemblyInstance)null);
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
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RECEIVER:
				return receiver != null;
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__MESSAGE:
				return message != null;
			case RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY:
				return getRuntimeAssembly() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageOnAssemblyImpl
