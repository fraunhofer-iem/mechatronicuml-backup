/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface.impl;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.calls.impl.CallableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageTypeImpl#getMessageInterface <em>Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTypeImpl extends CallableImpl implements MessageType {
	/**
	 * The cached value of the '{@link #getMessageInterface() <em>Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface messageInterface;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgifacePackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getMessageInterface() {
		if (messageInterface != null && messageInterface.eIsProxy()) {
			InternalEObject oldMessageInterface = (InternalEObject)messageInterface;
			messageInterface = (MessageInterface)eResolveProxy(oldMessageInterface);
			if (messageInterface != oldMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE, oldMessageInterface, messageInterface));
			}
		}
		return messageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetMessageInterface() {
		return messageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageInterface(MessageInterface newMessageInterface, NotificationChain msgs) {
		MessageInterface oldMessageInterface = messageInterface;
		messageInterface = newMessageInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE, oldMessageInterface, newMessageInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageInterface(MessageInterface newMessageInterface) {
		if (newMessageInterface != messageInterface) {
			NotificationChain msgs = null;
			if (messageInterface != null)
				msgs = ((InternalEObject)messageInterface).eInverseRemove(this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MessageInterface.class, msgs);
			if (newMessageInterface != null)
				msgs = ((InternalEObject)newMessageInterface).eInverseAdd(this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MessageInterface.class, msgs);
			msgs = basicSetMessageInterface(newMessageInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE, newMessageInterface, newMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				if (messageInterface != null)
					msgs = ((InternalEObject)messageInterface).eInverseRemove(this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MessageInterface.class, msgs);
				return basicSetMessageInterface((MessageInterface)otherEnd, msgs);
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
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return basicSetMessageInterface(null, msgs);
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
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				if (resolve) return getMessageInterface();
				return basicGetMessageInterface();
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				return getName();
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
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				setMessageInterface((MessageInterface)newValue);
				return;
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				setName((String)newValue);
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
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				setMessageInterface((MessageInterface)null);
				return;
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE:
				return messageInterface != null;
			case MsgifacePackage.MESSAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<EParameter> getInParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EParameter> getOutParameters() {
		// TODO Auto-generated method stub
		return null;
	}

} //MessageTypeImpl
