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

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ForLoopImpl#getInitalizeExpression <em>Initalize Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.impl.ForLoopImpl#getCountingExpression <em>Counting Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLoopImpl extends LoopImpl implements ForLoop {
	/**
	 * The cached value of the '{@link #getInitalizeExpression() <em>Initalize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitalizeExpression()
	 * @generated
	 * @ordered
	 */
	protected Assignment initalizeExpression;

	/**
	 * The cached value of the '{@link #getCountingExpression() <em>Counting Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountingExpression()
	 * @generated
	 * @ordered
	 */
	protected Assignment countingExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionLanguagePackage.Literals.FOR_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getInitalizeExpression() {
		return initalizeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitalizeExpression(Assignment newInitalizeExpression, NotificationChain msgs) {
		Assignment oldInitalizeExpression = initalizeExpression;
		initalizeExpression = newInitalizeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION, oldInitalizeExpression, newInitalizeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitalizeExpression(Assignment newInitalizeExpression) {
		if (newInitalizeExpression != initalizeExpression) {
			NotificationChain msgs = null;
			if (initalizeExpression != null)
				msgs = ((InternalEObject)initalizeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION, null, msgs);
			if (newInitalizeExpression != null)
				msgs = ((InternalEObject)newInitalizeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION, null, msgs);
			msgs = basicSetInitalizeExpression(newInitalizeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION, newInitalizeExpression, newInitalizeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getCountingExpression() {
		return countingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountingExpression(Assignment newCountingExpression, NotificationChain msgs) {
		Assignment oldCountingExpression = countingExpression;
		countingExpression = newCountingExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, oldCountingExpression, newCountingExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountingExpression(Assignment newCountingExpression) {
		if (newCountingExpression != countingExpression) {
			NotificationChain msgs = null;
			if (countingExpression != null)
				msgs = ((InternalEObject)countingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, null, msgs);
			if (newCountingExpression != null)
				msgs = ((InternalEObject)newCountingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, null, msgs);
			msgs = basicSetCountingExpression(newCountingExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, newCountingExpression, newCountingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION:
				return basicSetInitalizeExpression(null, msgs);
			case ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
				return basicSetCountingExpression(null, msgs);
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
			case ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION:
				return getInitalizeExpression();
			case ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
				return getCountingExpression();
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
			case ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION:
				setInitalizeExpression((Assignment)newValue);
				return;
			case ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
				setCountingExpression((Assignment)newValue);
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
			case ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION:
				setInitalizeExpression((Assignment)null);
				return;
			case ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
				setCountingExpression((Assignment)null);
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
			case ActionLanguagePackage.FOR_LOOP__INITALIZE_EXPRESSION:
				return initalizeExpression != null;
			case ActionLanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
				return countingExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ForLoopImpl
