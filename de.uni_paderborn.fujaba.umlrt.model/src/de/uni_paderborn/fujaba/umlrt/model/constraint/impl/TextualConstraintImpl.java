/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.constraint.impl;

import de.uni_paderborn.fujaba.umlrt.model.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.modeling.expressions.TextualExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.constraint.impl.TextualConstraintImpl#getTextualExpression <em>Textual Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualConstraintImpl extends VerifiableConstraintImpl implements TextualConstraint {
	/**
	 * The cached value of the '{@link #getTextualExpression() <em>Textual Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextualExpression()
	 * @generated
	 * @ordered
	 */
	protected TextualExpression textualExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.TEXTUAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualExpression getTextualExpression() {
		if (textualExpression != null && textualExpression.eIsProxy()) {
			InternalEObject oldTextualExpression = (InternalEObject)textualExpression;
			textualExpression = (TextualExpression)eResolveProxy(oldTextualExpression);
			if (textualExpression != oldTextualExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION, oldTextualExpression, textualExpression));
			}
		}
		return textualExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualExpression basicGetTextualExpression() {
		return textualExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextualExpression(TextualExpression newTextualExpression) {
		TextualExpression oldTextualExpression = textualExpression;
		textualExpression = newTextualExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION, oldTextualExpression, textualExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION:
				if (resolve) return getTextualExpression();
				return basicGetTextualExpression();
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
			case ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION:
				setTextualExpression((TextualExpression)newValue);
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
			case ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION:
				setTextualExpression((TextualExpression)null);
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
			case ConstraintPackage.TEXTUAL_CONSTRAINT__TEXTUAL_EXPRESSION:
				return textualExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //TextualConstraintImpl
