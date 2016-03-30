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
import org.muml.core.expressions.Expression;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.ElseIfStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Else If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.impl.ElseIfStatementImpl#getElseIfCondition <em>Else If Condition</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.ElseIfStatementImpl#getElseIfBlock <em>Else If Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElseIfStatementImpl extends CommentableElementImpl implements ElseIfStatement {
	/**
	 * The cached value of the '{@link #getElseIfCondition() <em>Else If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression elseIfCondition;

	/**
	 * The cached value of the '{@link #getElseIfBlock() <em>Else If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseIfBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseIfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionlanguagePackage.Literals.ELSE_IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseIfCondition() {
		return elseIfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseIfCondition(Expression newElseIfCondition, NotificationChain msgs) {
		Expression oldElseIfCondition = elseIfCondition;
		elseIfCondition = newElseIfCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION, oldElseIfCondition, newElseIfCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseIfCondition(Expression newElseIfCondition) {
		if (newElseIfCondition != elseIfCondition) {
			NotificationChain msgs = null;
			if (elseIfCondition != null)
				msgs = ((InternalEObject)elseIfCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION, null, msgs);
			if (newElseIfCondition != null)
				msgs = ((InternalEObject)newElseIfCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION, null, msgs);
			msgs = basicSetElseIfCondition(newElseIfCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION, newElseIfCondition, newElseIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getElseIfBlock() {
		return elseIfBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseIfBlock(Block newElseIfBlock, NotificationChain msgs) {
		Block oldElseIfBlock = elseIfBlock;
		elseIfBlock = newElseIfBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK, oldElseIfBlock, newElseIfBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseIfBlock(Block newElseIfBlock) {
		if (newElseIfBlock != elseIfBlock) {
			NotificationChain msgs = null;
			if (elseIfBlock != null)
				msgs = ((InternalEObject)elseIfBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK, null, msgs);
			if (newElseIfBlock != null)
				msgs = ((InternalEObject)newElseIfBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK, null, msgs);
			msgs = basicSetElseIfBlock(newElseIfBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK, newElseIfBlock, newElseIfBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION:
				return basicSetElseIfCondition(null, msgs);
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK:
				return basicSetElseIfBlock(null, msgs);
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
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION:
				return getElseIfCondition();
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK:
				return getElseIfBlock();
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
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION:
				setElseIfCondition((Expression)newValue);
				return;
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK:
				setElseIfBlock((Block)newValue);
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
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION:
				setElseIfCondition((Expression)null);
				return;
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK:
				setElseIfBlock((Block)null);
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
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_CONDITION:
				return elseIfCondition != null;
			case ActionlanguagePackage.ELSE_IF_STATEMENT__ELSE_IF_BLOCK:
				return elseIfBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //ElseIfStatementImpl
