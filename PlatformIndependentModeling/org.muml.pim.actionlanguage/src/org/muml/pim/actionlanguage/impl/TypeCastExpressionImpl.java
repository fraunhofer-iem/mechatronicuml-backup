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
package org.muml.pim.actionlanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.impl.ExpressionImpl;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.TypeCastExpression;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.impl.TypeCastExpressionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.TypeCastExpressionImpl#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeCastExpressionImpl extends ExpressionImpl implements TypeCastExpression {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The cached value of the '{@link #getEnclosedExpression() <em>Enclosed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression enclosedExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCastExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionlanguagePackage.Literals.TYPE_CAST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionlanguagePackage.TYPE_CAST_EXPRESSION__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.TYPE_CAST_EXPRESSION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEnclosedExpression() {
		return enclosedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosedExpression(Expression newEnclosedExpression, NotificationChain msgs) {
		Expression oldEnclosedExpression = enclosedExpression;
		enclosedExpression = newEnclosedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION, oldEnclosedExpression, newEnclosedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosedExpression(Expression newEnclosedExpression) {
		if (newEnclosedExpression != enclosedExpression) {
			NotificationChain msgs = null;
			if (enclosedExpression != null)
				msgs = ((InternalEObject)enclosedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			if (newEnclosedExpression != null)
				msgs = ((InternalEObject)newEnclosedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION, null, msgs);
			msgs = basicSetEnclosedExpression(newEnclosedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION, newEnclosedExpression, newEnclosedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION:
				return basicSetEnclosedExpression(null, msgs);
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
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION:
				return getEnclosedExpression();
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
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION:
				setEnclosedExpression((Expression)newValue);
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
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION:
				setEnclosedExpression((Expression)null);
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
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__DATA_TYPE:
				return dataType != null;
			case ActionlanguagePackage.TYPE_CAST_EXPRESSION__ENCLOSED_EXPRESSION:
				return enclosedExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeCastExpressionImpl
