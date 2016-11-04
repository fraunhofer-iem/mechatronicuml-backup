/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.core.expressions.impl.ExpressionImpl;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.LocalVariableDeclarationStatement;
import org.muml.pim.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.impl.LocalVariableDeclarationStatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.LocalVariableDeclarationStatementImpl#getAllSurroundingBlocks <em>All Surrounding Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVariableDeclarationStatementImpl extends ExpressionImpl implements LocalVariableDeclarationStatement {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached setting delegate for the '{@link #getAllSurroundingBlocks() <em>All Surrounding Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSurroundingBlocks()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_SURROUNDING_BLOCKS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ActionlanguagePackage.Literals.LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalVariableDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionlanguagePackage.Literals.LOCAL_VARIABLE_DECLARATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Block> getAllSurroundingBlocks() {
		return (EList<Block>)ALL_SURROUNDING_BLOCKS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				return basicSetVariable(null, msgs);
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
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				return getVariable();
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS:
				return getAllSurroundingBlocks();
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
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				setVariable((Variable)newValue);
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
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				setVariable((Variable)null);
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
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				return variable != null;
			case ActionlanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__ALL_SURROUNDING_BLOCKS:
				return ALL_SURROUNDING_BLOCKS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //LocalVariableDeclarationStatementImpl
