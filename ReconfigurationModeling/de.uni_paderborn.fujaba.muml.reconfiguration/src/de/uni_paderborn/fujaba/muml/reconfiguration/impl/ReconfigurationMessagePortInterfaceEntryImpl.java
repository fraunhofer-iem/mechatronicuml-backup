/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl#getExpectedResponseTime <em>Expected Response Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationMessagePortInterfaceEntryImpl#getReconfigurationMessagePort <em>Reconfiguration Message Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationMessagePortInterfaceEntryImpl extends ReconfigurationPortInterfaceEntryImpl implements ReconfigurationMessagePortInterfaceEntry {
	/**
	 * The default value of the '{@link #getReconfigurationMessageType() <em>Reconfiguration Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final ReconfigurationMessageTypeEnum RECONFIGURATION_MESSAGE_TYPE_EDEFAULT = ReconfigurationMessageTypeEnum.INFO;

	/**
	 * The cached value of the '{@link #getReconfigurationMessageType() <em>Reconfiguration Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationMessageType()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationMessageTypeEnum reconfigurationMessageType = RECONFIGURATION_MESSAGE_TYPE_EDEFAULT;

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
	public ReconfigurationMessageTypeEnum getReconfigurationMessageType() {
		return reconfigurationMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationMessageType(ReconfigurationMessageTypeEnum newReconfigurationMessageType) {
		ReconfigurationMessageTypeEnum oldReconfigurationMessageType = reconfigurationMessageType;
		reconfigurationMessageType = newReconfigurationMessageType == null ? RECONFIGURATION_MESSAGE_TYPE_EDEFAULT : newReconfigurationMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE, oldReconfigurationMessageType, reconfigurationMessageType));
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
	public ReconfigurationMessagePort getReconfigurationMessagePort() {
		if (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT) return null;
		return (ReconfigurationMessagePort)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationMessagePort(ReconfigurationMessagePort newReconfigurationMessagePort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationMessagePort, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationMessagePort(ReconfigurationMessagePort newReconfigurationMessagePort) {
		if (newReconfigurationMessagePort != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT && newReconfigurationMessagePort != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationMessagePort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationMessagePort != null)
				msgs = ((InternalEObject)newReconfigurationMessagePort).eInverseAdd(this, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES, ReconfigurationMessagePort.class, msgs);
			msgs = basicSetReconfigurationMessagePort(newReconfigurationMessagePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT, newReconfigurationMessagePort, newReconfigurationMessagePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReconfigurationMessagePort((ReconfigurationMessagePort)otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				return basicSetExpectedResponseTime(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				return basicSetReconfigurationMessagePort(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES, ReconfigurationMessagePort.class, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				return getReconfigurationMessageType();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				return getExpectedResponseTime();
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				return getReconfigurationMessagePort();
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				setReconfigurationMessageType((ReconfigurationMessageTypeEnum)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				setExpectedResponseTime((TimeValue)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				setReconfigurationMessagePort((ReconfigurationMessagePort)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				setReconfigurationMessageType(RECONFIGURATION_MESSAGE_TYPE_EDEFAULT);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				setExpectedResponseTime((TimeValue)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				setReconfigurationMessagePort((ReconfigurationMessagePort)null);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				return reconfigurationMessageType != RECONFIGURATION_MESSAGE_TYPE_EDEFAULT;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__EXPECTED_RESPONSE_TIME:
				return expectedResponseTime != null;
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_INTERFACE_ENTRY__RECONFIGURATION_MESSAGE_PORT:
				return getReconfigurationMessagePort() != null;
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
		result.append(" (reconfigurationMessageType: ");
		result.append(reconfigurationMessageType);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationMessagePortInterfaceEntryImpl
