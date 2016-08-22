/**
 */
package org.muml.core.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.ExpressionText;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.core.expressions.grammar.IExpressionGrammar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.expressions.impl.ExpressionTextImpl#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link org.muml.core.expressions.impl.ExpressionTextImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.muml.core.expressions.impl.ExpressionTextImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionTextImpl extends MinimalEObjectImpl.Container implements ExpressionText {
	/**
	 * The default value of the '{@link #getGrammar() <em>Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAMMAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected String grammar = GRAMMAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSION_TEXT;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		
		NotificationChain msgs = null;
		if (eNotificationRequired()) {
			msgs = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_TEXT__TEXT, oldText, text);
		}

		// invalidate parsed expression
		msgs = basicSetExpression(null, msgs);
		if (msgs != null) {
			msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpression() {
		if (expression == null) {
			String expressionText  = getText();
			String expressionGrammarName = getGrammar();
			IExpressionGrammar expressionGrammar = org.muml.core.expressions.ExpressionGrammarRegistry.INSTANCE.getGrammar(expressionGrammarName);
			if (expressionGrammar != null) {
				expression = expressionGrammar.parse(expressionText);
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_TEXT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.EXPRESSION_TEXT__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case ExpressionsPackage.EXPRESSION_TEXT__GRAMMAR:
				return getGrammar();
			case ExpressionsPackage.EXPRESSION_TEXT__TEXT:
				return getText();
			case ExpressionsPackage.EXPRESSION_TEXT__EXPRESSION:
				return getExpression();
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
			case ExpressionsPackage.EXPRESSION_TEXT__GRAMMAR:
				setGrammar((String)newValue);
				return;
			case ExpressionsPackage.EXPRESSION_TEXT__TEXT:
				setText((String)newValue);
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
			case ExpressionsPackage.EXPRESSION_TEXT__GRAMMAR:
				setGrammar(GRAMMAR_EDEFAULT);
				return;
			case ExpressionsPackage.EXPRESSION_TEXT__TEXT:
				setText(TEXT_EDEFAULT);
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
			case ExpressionsPackage.EXPRESSION_TEXT__GRAMMAR:
				return GRAMMAR_EDEFAULT == null ? grammar != null : !GRAMMAR_EDEFAULT.equals(grammar);
			case ExpressionsPackage.EXPRESSION_TEXT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ExpressionsPackage.EXPRESSION_TEXT__EXPRESSION:
				return expression != null;
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
		result.append(" (grammar: ");
		result.append(grammar);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrammar() {
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrammar(String newGrammar) {
		String oldGrammar = grammar;
		grammar = newGrammar;
		NotificationChain msgs = null;
		if (eNotificationRequired()) {
			msgs = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_TEXT__GRAMMAR, oldGrammar, grammar);
		}

		// invalidate parsed expression
		msgs = basicSetExpression(null, msgs);
		if (msgs != null) {
			msgs.dispatch();
		}
	}

} //ExpressionTextImpl
