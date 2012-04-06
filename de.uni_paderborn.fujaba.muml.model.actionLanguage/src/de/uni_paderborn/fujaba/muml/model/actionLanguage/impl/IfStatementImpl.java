/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl#getElseIfBlocks <em>Else If Blocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.IfStatementImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends ExpressionImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression ifCondition;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected Block ifBlock;

	/**
	 * The cached value of the '{@link #getElseIfConditions() <em>Else If Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> elseIfConditions;

	/**
	 * The cached value of the '{@link #getElseIfBlocks() <em>Else If Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> elseIfBlocks;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionLanguagePackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIfCondition() {
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfCondition(Expression newIfCondition, NotificationChain msgs) {
		Expression oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.IF_STATEMENT__IF_CONDITION, oldIfCondition, newIfCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfCondition(Expression newIfCondition) {
		if (newIfCondition != ifCondition) {
			NotificationChain msgs = null;
			if (ifCondition != null)
				msgs = ((InternalEObject)ifCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.IF_STATEMENT__IF_CONDITION, null, msgs);
			if (newIfCondition != null)
				msgs = ((InternalEObject)newIfCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.IF_STATEMENT__IF_CONDITION, null, msgs);
			msgs = basicSetIfCondition(newIfCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.IF_STATEMENT__IF_CONDITION, newIfCondition, newIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getIfBlock() {
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBlock(Block newIfBlock, NotificationChain msgs) {
		Block oldIfBlock = ifBlock;
		ifBlock = newIfBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.IF_STATEMENT__IF_BLOCK, oldIfBlock, newIfBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBlock(Block newIfBlock) {
		if (newIfBlock != ifBlock) {
			NotificationChain msgs = null;
			if (ifBlock != null)
				msgs = ((InternalEObject)ifBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.IF_STATEMENT__IF_BLOCK, null, msgs);
			if (newIfBlock != null)
				msgs = ((InternalEObject)newIfBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.IF_STATEMENT__IF_BLOCK, null, msgs);
			msgs = basicSetIfBlock(newIfBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.IF_STATEMENT__IF_BLOCK, newIfBlock, newIfBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getElseIfConditions() {
		if (elseIfConditions == null) {
			elseIfConditions = new EObjectContainmentEList<Expression>(Expression.class, this, ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS);
		}
		return elseIfConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getElseIfBlocks() {
		if (elseIfBlocks == null) {
			elseIfBlocks = new EObjectContainmentEList<Block>(Block.class, this, ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS);
		}
		return elseIfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBlock(Block newElseBlock, NotificationChain msgs) {
		Block oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK, oldElseBlock, newElseBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBlock(Block newElseBlock) {
		if (newElseBlock != elseBlock) {
			NotificationChain msgs = null;
			if (elseBlock != null)
				msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK, null, msgs);
			if (newElseBlock != null)
				msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK, null, msgs);
			msgs = basicSetElseBlock(newElseBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK, newElseBlock, newElseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.IF_STATEMENT__IF_CONDITION:
				return basicSetIfCondition(null, msgs);
			case ActionLanguagePackage.IF_STATEMENT__IF_BLOCK:
				return basicSetIfBlock(null, msgs);
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS:
				return ((InternalEList<?>)getElseIfConditions()).basicRemove(otherEnd, msgs);
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS:
				return ((InternalEList<?>)getElseIfBlocks()).basicRemove(otherEnd, msgs);
			case ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK:
				return basicSetElseBlock(null, msgs);
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
			case ActionLanguagePackage.IF_STATEMENT__IF_CONDITION:
				return getIfCondition();
			case ActionLanguagePackage.IF_STATEMENT__IF_BLOCK:
				return getIfBlock();
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS:
				return getElseIfConditions();
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS:
				return getElseIfBlocks();
			case ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK:
				return getElseBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionLanguagePackage.IF_STATEMENT__IF_CONDITION:
				setIfCondition((Expression)newValue);
				return;
			case ActionLanguagePackage.IF_STATEMENT__IF_BLOCK:
				setIfBlock((Block)newValue);
				return;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS:
				getElseIfConditions().clear();
				getElseIfConditions().addAll((Collection<? extends Expression>)newValue);
				return;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS:
				getElseIfBlocks().clear();
				getElseIfBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK:
				setElseBlock((Block)newValue);
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
			case ActionLanguagePackage.IF_STATEMENT__IF_CONDITION:
				setIfCondition((Expression)null);
				return;
			case ActionLanguagePackage.IF_STATEMENT__IF_BLOCK:
				setIfBlock((Block)null);
				return;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS:
				getElseIfConditions().clear();
				return;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS:
				getElseIfBlocks().clear();
				return;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK:
				setElseBlock((Block)null);
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
			case ActionLanguagePackage.IF_STATEMENT__IF_CONDITION:
				return ifCondition != null;
			case ActionLanguagePackage.IF_STATEMENT__IF_BLOCK:
				return ifBlock != null;
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_CONDITIONS:
				return elseIfConditions != null && !elseIfConditions.isEmpty();
			case ActionLanguagePackage.IF_STATEMENT__ELSE_IF_BLOCKS:
				return elseIfBlocks != null && !elseIfBlocks.isEmpty();
			case ActionLanguagePackage.IF_STATEMENT__ELSE_BLOCK:
				return elseBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
