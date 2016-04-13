/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.realtimestatechart.one_to_n_schemata.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl#getMaxWorkingTime <em>Max Working Time</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.LoadBalancingImpl#getOnResponseAction <em>On Response Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBalancingImpl extends SendingOneToManyCommunicationSchemaImpl implements LoadBalancing {
	/**
	 * The cached value of the '{@link #getResponseMessage() <em>Response Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseMessage()
	 * @generated
	 * @ordered
	 */
	protected MessageType responseMessage;

	/**
	 * The cached value of the '{@link #getMaxWorkingTime() <em>Max Working Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWorkingTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue maxWorkingTime;

	/**
	 * The cached value of the '{@link #getOnResponseAction() <em>On Response Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnResponseAction()
	 * @generated
	 * @ordered
	 */
	protected Action onResponseAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return One_to_n_schemataPackage.Literals.LOAD_BALANCING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getResponseMessage() {
		if (responseMessage != null && responseMessage.eIsProxy()) {
			InternalEObject oldResponseMessage = (InternalEObject)responseMessage;
			responseMessage = (MessageType)eResolveProxy(oldResponseMessage);
			if (responseMessage != oldResponseMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, One_to_n_schemataPackage.LOAD_BALANCING__RESPONSE_MESSAGE, oldResponseMessage, responseMessage));
			}
		}
		return responseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetResponseMessage() {
		return responseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseMessage(MessageType newResponseMessage) {
		MessageType oldResponseMessage = responseMessage;
		responseMessage = newResponseMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.LOAD_BALANCING__RESPONSE_MESSAGE, oldResponseMessage, responseMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getMaxWorkingTime() {
		return maxWorkingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxWorkingTime(TimeValue newMaxWorkingTime, NotificationChain msgs) {
		TimeValue oldMaxWorkingTime = maxWorkingTime;
		maxWorkingTime = newMaxWorkingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME, oldMaxWorkingTime, newMaxWorkingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWorkingTime(TimeValue newMaxWorkingTime) {
		if (newMaxWorkingTime != maxWorkingTime) {
			NotificationChain msgs = null;
			if (maxWorkingTime != null)
				msgs = ((InternalEObject)maxWorkingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME, null, msgs);
			if (newMaxWorkingTime != null)
				msgs = ((InternalEObject)newMaxWorkingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME, null, msgs);
			msgs = basicSetMaxWorkingTime(newMaxWorkingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME, newMaxWorkingTime, newMaxWorkingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getOnResponseAction() {
		return onResponseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnResponseAction(Action newOnResponseAction, NotificationChain msgs) {
		Action oldOnResponseAction = onResponseAction;
		onResponseAction = newOnResponseAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION, oldOnResponseAction, newOnResponseAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnResponseAction(Action newOnResponseAction) {
		if (newOnResponseAction != onResponseAction) {
			NotificationChain msgs = null;
			if (onResponseAction != null)
				msgs = ((InternalEObject)onResponseAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION, null, msgs);
			if (newOnResponseAction != null)
				msgs = ((InternalEObject)newOnResponseAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION, null, msgs);
			msgs = basicSetOnResponseAction(newOnResponseAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION, newOnResponseAction, newOnResponseAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME:
				return basicSetMaxWorkingTime(null, msgs);
			case One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION:
				return basicSetOnResponseAction(null, msgs);
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
			case One_to_n_schemataPackage.LOAD_BALANCING__RESPONSE_MESSAGE:
				if (resolve) return getResponseMessage();
				return basicGetResponseMessage();
			case One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME:
				return getMaxWorkingTime();
			case One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION:
				return getOnResponseAction();
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
			case One_to_n_schemataPackage.LOAD_BALANCING__RESPONSE_MESSAGE:
				setResponseMessage((MessageType)newValue);
				return;
			case One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME:
				setMaxWorkingTime((TimeValue)newValue);
				return;
			case One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION:
				setOnResponseAction((Action)newValue);
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
			case One_to_n_schemataPackage.LOAD_BALANCING__RESPONSE_MESSAGE:
				setResponseMessage((MessageType)null);
				return;
			case One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME:
				setMaxWorkingTime((TimeValue)null);
				return;
			case One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION:
				setOnResponseAction((Action)null);
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
			case One_to_n_schemataPackage.LOAD_BALANCING__RESPONSE_MESSAGE:
				return responseMessage != null;
			case One_to_n_schemataPackage.LOAD_BALANCING__MAX_WORKING_TIME:
				return maxWorkingTime != null;
			case One_to_n_schemataPackage.LOAD_BALANCING__ON_RESPONSE_ACTION:
				return onResponseAction != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadBalancingImpl
