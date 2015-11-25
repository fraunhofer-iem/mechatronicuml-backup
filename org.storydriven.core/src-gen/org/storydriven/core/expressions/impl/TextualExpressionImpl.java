/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.core.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.ExpressionsPackage;
import org.storydriven.core.expressions.IExpressionLanguageGrammar;
import org.storydriven.core.expressions.TextualExpression;
import org.storydriven.core.expressions.util.ExpressionUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.storydriven.core.expressions.impl.TextualExpressionImpl#getExpressionText <em>Expression Text</em>}</li>
 *   <li>{@link org.storydriven.core.expressions.impl.TextualExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.storydriven.core.expressions.impl.TextualExpressionImpl#getLanguageVersion <em>Language Version</em>}</li>
 *   <li>{@link org.storydriven.core.expressions.impl.TextualExpressionImpl#getAst <em>Ast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextualExpressionImpl extends ExpressionImpl implements
		TextualExpression {
	/**
	 * The default value of the '{@link #getExpressionText() <em>Expression Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionText()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionText() <em>Expression Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionText()
	 * @generated
	 * @ordered
	 */
	protected String expressionText = EXPRESSION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageVersion() <em>Language Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageVersion() <em>Language Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageVersion()
	 * @generated
	 * @ordered
	 */
	protected String languageVersion = LANGUAGE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAst() <em>Ast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAst()
	 * @generated
	 * @ordered
	 */
	protected EObject ast;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.TEXTUAL_EXPRESSION;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageVersion() {
		return languageVersion;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAst(EObject newAst, NotificationChain msgs) {
		EObject oldAst = ast;
		ast = newAst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__AST, oldAst, newAst);
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
			case ExpressionsPackage.TEXTUAL_EXPRESSION__AST:
				return basicSetAst(null, msgs);
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
			case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
				return getExpressionText();
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
				return getLanguage();
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
				return getLanguageVersion();
			case ExpressionsPackage.TEXTUAL_EXPRESSION__AST:
				return getAst();
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
			case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
				setExpressionText((String)newValue);
				return;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
				setLanguageVersion((String)newValue);
				return;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__AST:
				setAst((EObject)newValue);
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
			case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
				setExpressionText(EXPRESSION_TEXT_EDEFAULT);
				return;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
				setLanguageVersion(LANGUAGE_VERSION_EDEFAULT);
				return;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__AST:
				setAst((EObject)null);
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
			case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
				return EXPRESSION_TEXT_EDEFAULT == null ? expressionText != null : !EXPRESSION_TEXT_EDEFAULT.equals(expressionText);
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
				return LANGUAGE_VERSION_EDEFAULT == null ? languageVersion != null : !LANGUAGE_VERSION_EDEFAULT.equals(languageVersion);
			case ExpressionsPackage.TEXTUAL_EXPRESSION__AST:
				return ast != null;
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
		result.append(" (expressionText: ");
		result.append(expressionText);
		result.append(", language: ");
		result.append(language);
		result.append(", languageVersion: ");
		result.append(languageVersion);
		result.append(')');
		return result.toString();
	}
	
	


	private enum Action { NONE, SET_AST, SET_TEXT };
	private Action action = Action.NONE;

	private void textChanged() {
		if (action == Action.NONE){
			action = Action.SET_TEXT;
			try {
				setAst(null); // invalidate ast
			} finally {
				action = Action.NONE;
			}
		}
	}

	private void astChanged() {
		if (action == Action.NONE){
			action = Action.SET_AST;
			try {
				setExpressionText(null); // invalidate text
			} finally {
				action = Action.NONE;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExpressionText(String newExpressionText) {
		String oldExpressionText = expressionText;
		expressionText = newExpressionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT, oldExpressionText, expressionText));
		
		textChanged(); // added
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE, oldLanguage, language));
		
		textChanged(); // added
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLanguageVersion(String newLanguageVersion) {
		String oldLanguageVersion = languageVersion;
		languageVersion = newLanguageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION, oldLanguageVersion, languageVersion));

		textChanged(); // added
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAst(EObject newAst) {
		if (newAst != ast) {
			NotificationChain msgs = null;
			if (ast != null)
				msgs = ((InternalEObject)ast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEXTUAL_EXPRESSION__AST, null, msgs);
			if (newAst != null)
				msgs = ((InternalEObject)newAst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.TEXTUAL_EXPRESSION__AST, null, msgs);
			msgs = basicSetAst(newAst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.TEXTUAL_EXPRESSION__AST, newAst, newAst));
		
		astChanged();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getAst() {
		if (ast == null) {
			EObject newAst = parse();
			if (newAst != null) {
				setAst(newAst);
			}
		}
		return ast;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getExpressionText() {
		if (expressionText == null) {
			String newExpressionText = serialize();
			if (newExpressionText != null) {
				setExpressionText(newExpressionText);
			}
		}
		return expressionText;
	}
	
	private EObject parse() {
		if (expressionText != null && language != null && languageVersion != null) {
			IExpressionLanguageGrammar grammar = ExpressionUtils.getGrammar(language, languageVersion);
			if (grammar != null) {
				return grammar.parse(expressionText);
			}
		}
		return null;
	}
	
	private String serialize() {
		if (ast != null && language != null && languageVersion != null) {
			IExpressionLanguageGrammar grammar = ExpressionUtils.getGrammar(language, languageVersion);
			if (grammar != null) {
				return grammar.serialize(ast);
			}
		}
		return null;
	}


} //TextualExpressionImpl
