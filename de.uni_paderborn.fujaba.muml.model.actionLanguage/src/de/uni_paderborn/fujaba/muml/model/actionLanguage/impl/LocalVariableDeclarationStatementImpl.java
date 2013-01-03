/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.model.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LocalVariableDeclarationStatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.LocalVariableDeclarationStatementImpl#getInitializeExpression <em>Initialize Expression</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getInitializeExpression() <em>Initialize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression initializeExpression;

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
		return ActionLanguagePackage.Literals.LOCAL_VARIABLE_DECLARATION_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, oldVariable, newVariable);
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
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializeExpression() {
		return initializeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializeExpression(Expression newInitializeExpression, NotificationChain msgs) {
		Expression oldInitializeExpression = initializeExpression;
		initializeExpression = newInitializeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION, oldInitializeExpression, newInitializeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeExpression(Expression newInitializeExpression) {
		if (newInitializeExpression != initializeExpression) {
			NotificationChain msgs = null;
			if (initializeExpression != null)
				msgs = ((InternalEObject)initializeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION, null, msgs);
			if (newInitializeExpression != null)
				msgs = ((InternalEObject)newInitializeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION, null, msgs);
			msgs = basicSetInitializeExpression(newInitializeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION, newInitializeExpression, newInitializeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				return basicSetVariable(null, msgs);
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION:
				return basicSetInitializeExpression(null, msgs);
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
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				return getVariable();
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION:
				return getInitializeExpression();
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
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION:
				setInitializeExpression((Expression)newValue);
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
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				setVariable((Variable)null);
				return;
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION:
				setInitializeExpression((Expression)null);
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
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__VARIABLE:
				return variable != null;
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT__INITIALIZE_EXPRESSION:
				return initializeExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalVariableDeclarationStatementImpl
