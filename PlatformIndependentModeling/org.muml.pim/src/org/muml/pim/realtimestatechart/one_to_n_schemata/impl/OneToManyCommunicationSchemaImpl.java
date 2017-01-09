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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.expressions.Expression;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One To Many Communication Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.OneToManyCommunicationSchemaImpl#getRetryAfter <em>Retry After</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OneToManyCommunicationSchemaImpl extends EObjectImpl implements OneToManyCommunicationSchema {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getRetryAfter() <em>Retry After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryAfter()
	 * @generated
	 * @ordered
	 */
	protected TimeValue retryAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneToManyCommunicationSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return One_to_n_schemataPackage.Literals.ONE_TO_MANY_COMMUNICATION_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent getAsynchronousMessageEvent() {
		if (eContainerFeatureID() != One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT) return null;
		return (AsynchronousMessageEvent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsynchronousMessageEvent(AsynchronousMessageEvent newAsynchronousMessageEvent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAsynchronousMessageEvent, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsynchronousMessageEvent(AsynchronousMessageEvent newAsynchronousMessageEvent) {
		if (newAsynchronousMessageEvent != eInternalContainer() || (eContainerFeatureID() != One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT && newAsynchronousMessageEvent != null)) {
			if (EcoreUtil.isAncestor(this, newAsynchronousMessageEvent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAsynchronousMessageEvent != null)
				msgs = ((InternalEObject)newAsynchronousMessageEvent).eInverseAdd(this, RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA, AsynchronousMessageEvent.class, msgs);
			msgs = basicSetAsynchronousMessageEvent(newAsynchronousMessageEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT, newAsynchronousMessageEvent, newAsynchronousMessageEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getRetryAfter() {
		return retryAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryAfter(TimeValue newRetryAfter, NotificationChain msgs) {
		TimeValue oldRetryAfter = retryAfter;
		retryAfter = newRetryAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER, oldRetryAfter, newRetryAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryAfter(TimeValue newRetryAfter) {
		if (newRetryAfter != retryAfter) {
			NotificationChain msgs = null;
			if (retryAfter != null)
				msgs = ((InternalEObject)retryAfter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER, null, msgs);
			if (newRetryAfter != null)
				msgs = ((InternalEObject)newRetryAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER, null, msgs);
			msgs = basicSetRetryAfter(newRetryAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER, newRetryAfter, newRetryAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAsynchronousMessageEvent((AsynchronousMessageEvent)otherEnd, msgs);
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION:
				return basicSetCondition(null, msgs);
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				return basicSetAsynchronousMessageEvent(null, msgs);
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION:
				return basicSetAction(null, msgs);
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER:
				return basicSetRetryAfter(null, msgs);
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA, AsynchronousMessageEvent.class, msgs);
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION:
				return getCondition();
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				return getAsynchronousMessageEvent();
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION:
				return getAction();
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER:
				return getRetryAfter();
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION:
				setCondition((Expression)newValue);
				return;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)newValue);
				return;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION:
				setAction((Action)newValue);
				return;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER:
				setRetryAfter((TimeValue)newValue);
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION:
				setCondition((Expression)null);
				return;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)null);
				return;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION:
				setAction((Action)null);
				return;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER:
				setRetryAfter((TimeValue)null);
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__CONDITION:
				return condition != null;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT:
				return getAsynchronousMessageEvent() != null;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ACTION:
				return action != null;
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__RETRY_AFTER:
				return retryAfter != null;
		}
		return super.eIsSet(featureID);
	}

} //OneToManyCommunicationSchemaImpl
