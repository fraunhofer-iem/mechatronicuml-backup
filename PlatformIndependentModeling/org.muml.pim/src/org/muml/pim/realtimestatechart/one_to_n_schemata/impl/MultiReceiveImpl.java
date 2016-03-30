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
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Receive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.MultiReceiveImpl#getFailureAction <em>Failure Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiReceiveImpl extends ReceivingOneToManyCommunicationSchemaImpl implements MultiReceive {
	/**
	 * The cached value of the '{@link #getFailureAction() <em>Failure Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureAction()
	 * @generated
	 * @ordered
	 */
	protected Action failureAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return One_to_n_schemataPackage.Literals.MULTI_RECEIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getFailureAction() {
		return failureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureAction(Action newFailureAction, NotificationChain msgs) {
		Action oldFailureAction = failureAction;
		failureAction = newFailureAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION, oldFailureAction, newFailureAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureAction(Action newFailureAction) {
		if (newFailureAction != failureAction) {
			NotificationChain msgs = null;
			if (failureAction != null)
				msgs = ((InternalEObject)failureAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION, null, msgs);
			if (newFailureAction != null)
				msgs = ((InternalEObject)newFailureAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION, null, msgs);
			msgs = basicSetFailureAction(newFailureAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION, newFailureAction, newFailureAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION:
				return basicSetFailureAction(null, msgs);
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
			case One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION:
				return getFailureAction();
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
			case One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION:
				setFailureAction((Action)newValue);
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
			case One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION:
				setFailureAction((Action)null);
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
			case One_to_n_schemataPackage.MULTI_RECEIVE__FAILURE_ACTION:
				return failureAction != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiReceiveImpl
