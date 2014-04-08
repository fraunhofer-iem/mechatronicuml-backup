/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortInterfaceEntryImpl#getMessageType <em>Message Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationPortInterfaceEntryImpl extends ExtendableElementImpl implements ReconfigurationPortInterfaceEntry {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageType messageType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationPortInterfaceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_PORT_INTERFACE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getMessageType() {
		if (messageType != null && messageType.eIsProxy()) {
			InternalEObject oldMessageType = (InternalEObject)messageType;
			messageType = (MessageType)eResolveProxy(oldMessageType);
			if (messageType != oldMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE, oldMessageType, messageType));
			}
		}
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(MessageType newMessageType) {
		MessageType oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION:
				return getDescription();
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE:
				if (resolve) return getMessageType();
				return basicGetMessageType();
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
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE:
				setMessageType((MessageType)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE:
				setMessageType((MessageType)null);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReconfigurationPackage.RECONFIGURATION_PORT_INTERFACE_ENTRY__MESSAGE_TYPE:
				return messageType != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationPortInterfaceEntryImpl
