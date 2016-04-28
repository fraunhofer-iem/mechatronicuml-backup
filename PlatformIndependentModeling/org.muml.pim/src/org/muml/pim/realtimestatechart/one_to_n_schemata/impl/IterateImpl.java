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
import org.muml.core.expressions.Expression;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl#getTerminationCondition <em>Termination Condition</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.one_to_n_schemata.impl.IterateImpl#isStartFromFirst <em>Start From First</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterateImpl extends SendingOneToManyCommunicationSchemaImpl implements Iterate {
	/**
	 * The cached value of the '{@link #getTerminationCondition() <em>Termination Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression terminationCondition;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected TimeValue delay;

	/**
	 * The default value of the '{@link #isStartFromFirst() <em>Start From First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartFromFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_FROM_FIRST_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStartFromFirst() <em>Start From First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartFromFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean startFromFirst = START_FROM_FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return One_to_n_schemataPackage.Literals.ITERATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTerminationCondition() {
		return terminationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminationCondition(Expression newTerminationCondition, NotificationChain msgs) {
		Expression oldTerminationCondition = terminationCondition;
		terminationCondition = newTerminationCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION, oldTerminationCondition, newTerminationCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationCondition(Expression newTerminationCondition) {
		if (newTerminationCondition != terminationCondition) {
			NotificationChain msgs = null;
			if (terminationCondition != null)
				msgs = ((InternalEObject)terminationCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION, null, msgs);
			if (newTerminationCondition != null)
				msgs = ((InternalEObject)newTerminationCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION, null, msgs);
			msgs = basicSetTerminationCondition(newTerminationCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION, newTerminationCondition, newTerminationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(TimeValue newDelay, NotificationChain msgs) {
		TimeValue oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ITERATE__DELAY, oldDelay, newDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(TimeValue newDelay) {
		if (newDelay != delay) {
			NotificationChain msgs = null;
			if (delay != null)
				msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ITERATE__DELAY, null, msgs);
			if (newDelay != null)
				msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - One_to_n_schemataPackage.ITERATE__DELAY, null, msgs);
			msgs = basicSetDelay(newDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ITERATE__DELAY, newDelay, newDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartFromFirst() {
		return startFromFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartFromFirst(boolean newStartFromFirst) {
		boolean oldStartFromFirst = startFromFirst;
		startFromFirst = newStartFromFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, One_to_n_schemataPackage.ITERATE__START_FROM_FIRST, oldStartFromFirst, startFromFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION:
				return basicSetTerminationCondition(null, msgs);
			case One_to_n_schemataPackage.ITERATE__DELAY:
				return basicSetDelay(null, msgs);
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
			case One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION:
				return getTerminationCondition();
			case One_to_n_schemataPackage.ITERATE__DELAY:
				return getDelay();
			case One_to_n_schemataPackage.ITERATE__START_FROM_FIRST:
				return isStartFromFirst();
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
			case One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION:
				setTerminationCondition((Expression)newValue);
				return;
			case One_to_n_schemataPackage.ITERATE__DELAY:
				setDelay((TimeValue)newValue);
				return;
			case One_to_n_schemataPackage.ITERATE__START_FROM_FIRST:
				setStartFromFirst((Boolean)newValue);
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
			case One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION:
				setTerminationCondition((Expression)null);
				return;
			case One_to_n_schemataPackage.ITERATE__DELAY:
				setDelay((TimeValue)null);
				return;
			case One_to_n_schemataPackage.ITERATE__START_FROM_FIRST:
				setStartFromFirst(START_FROM_FIRST_EDEFAULT);
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
			case One_to_n_schemataPackage.ITERATE__TERMINATION_CONDITION:
				return terminationCondition != null;
			case One_to_n_schemataPackage.ITERATE__DELAY:
				return delay != null;
			case One_to_n_schemataPackage.ITERATE__START_FROM_FIRST:
				return startFromFirst != START_FROM_FIRST_EDEFAULT;
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
		result.append(" (startFromFirst: ");
		result.append(startFromFirst);
		result.append(')');
		return result.toString();
	}

} //IterateImpl
