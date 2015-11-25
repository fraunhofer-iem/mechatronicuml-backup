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
package de.uni_paderborn.fujaba.muml.actionlanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.TimeValueExpression;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Value Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.impl.TimeValueExpressionImpl#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeValueExpressionImpl extends ExpressionImpl implements TimeValueExpression {
	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeValueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionlanguagePackage.Literals.TIME_VALUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeValue() {
		if (timeValue != null && timeValue.eIsProxy()) {
			InternalEObject oldTimeValue = (InternalEObject)timeValue;
			timeValue = (TimeValue)eResolveProxy(oldTimeValue);
			if (timeValue != oldTimeValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionlanguagePackage.TIME_VALUE_EXPRESSION__TIME_VALUE, oldTimeValue, timeValue));
			}
		}
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue basicGetTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(TimeValue newTimeValue) {
		TimeValue oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.TIME_VALUE_EXPRESSION__TIME_VALUE, oldTimeValue, timeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionlanguagePackage.TIME_VALUE_EXPRESSION__TIME_VALUE:
				if (resolve) return getTimeValue();
				return basicGetTimeValue();
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
			case ActionlanguagePackage.TIME_VALUE_EXPRESSION__TIME_VALUE:
				setTimeValue((TimeValue)newValue);
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
			case ActionlanguagePackage.TIME_VALUE_EXPRESSION__TIME_VALUE:
				setTimeValue((TimeValue)null);
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
			case ActionlanguagePackage.TIME_VALUE_EXPRESSION__TIME_VALUE:
				return timeValue != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeValueExpressionImpl
