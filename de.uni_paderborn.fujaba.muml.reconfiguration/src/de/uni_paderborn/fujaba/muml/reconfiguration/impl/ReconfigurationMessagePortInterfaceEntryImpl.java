/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl#getExpectedResponseTime <em>Expected Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationMessagePortInterfaceEntryImpl extends ReconfigurationPortInterfaceEntryImpl implements ReconfigurationMessagePortInterfaceEntry {
	/**
	 * The default value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected static final ReconfigurationMessageKind MESSAGE_KIND_EDEFAULT = ReconfigurationMessageKind.INFO;

	/**
	 * The cached value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationMessageKind messageKind = MESSAGE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpectedResponseTime() <em>Expected Response Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResponseTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue expectedResponseTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationMessagePortInterfaceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessageKind getMessageKind() {
		return messageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageKind(ReconfigurationMessageKind newMessageKind) {
		ReconfigurationMessageKind oldMessageKind = messageKind;
		messageKind = newMessageKind == null ? MESSAGE_KIND_EDEFAULT : newMessageKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND, oldMessageKind, messageKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getExpectedResponseTime() {
		return expectedResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedResponseTime(TimeValue newExpectedResponseTime, NotificationChain msgs) {
		TimeValue oldExpectedResponseTime = expectedResponseTime;
		expectedResponseTime = newExpectedResponseTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME, oldExpectedResponseTime, newExpectedResponseTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedResponseTime(TimeValue newExpectedResponseTime) {
		if (newExpectedResponseTime != expectedResponseTime) {
			NotificationChain msgs = null;
			if (expectedResponseTime != null)
				msgs = ((InternalEObject)expectedResponseTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME, null, msgs);
			if (newExpectedResponseTime != null)
				msgs = ((InternalEObject)newExpectedResponseTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME, null, msgs);
			msgs = basicSetExpectedResponseTime(newExpectedResponseTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME, newExpectedResponseTime, newExpectedResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				return basicSetExpectedResponseTime(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND:
				return getMessageKind();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				return getExpectedResponseTime();
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND:
				setMessageKind((ReconfigurationMessageKind)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				setExpectedResponseTime((TimeValue)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND:
				setMessageKind(MESSAGE_KIND_EDEFAULT);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				setExpectedResponseTime((TimeValue)null);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__MESSAGE_KIND:
				return messageKind != MESSAGE_KIND_EDEFAULT;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				return expectedResponseTime != null;
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
		result.append(" (messageKind: ");
		result.append(messageKind);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationMessagePortInterfaceEntryImpl
