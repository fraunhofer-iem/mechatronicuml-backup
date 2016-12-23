/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.ForLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.impl.ForLoopImpl#getInitializeExpression <em>Initialize Expression</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.impl.ForLoopImpl#getCountingExpression <em>Counting Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopImpl extends LoopImpl implements ForLoop {
	/**
	 * The cached value of the '{@link #getInitializeExpression() <em>Initialize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeExpression()
	 * @generated
	 * @ordered
	 */
	protected Assignment initializeExpression;

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
		return ActionlanguagePackage.Literals.FOR_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getInitializeExpression() {
		return initializeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializeExpression(Assignment newInitializeExpression, NotificationChain msgs) {
		Assignment oldInitializeExpression = initializeExpression;
		initializeExpression = newInitializeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION, oldInitializeExpression, newInitializeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeExpression(Assignment newInitializeExpression) {
		if (newInitializeExpression != initializeExpression) {
			NotificationChain msgs = null;
			if (initializeExpression != null)
				msgs = ((InternalEObject)initializeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION, null, msgs);
			if (newInitializeExpression != null)
				msgs = ((InternalEObject)newInitializeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION, null, msgs);
			msgs = basicSetInitializeExpression(newInitializeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION, newInitializeExpression, newInitializeExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, oldCountingExpression, newCountingExpression);
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
				msgs = ((InternalEObject)countingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, null, msgs);
			if (newCountingExpression != null)
				msgs = ((InternalEObject)newCountingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, null, msgs);
			msgs = basicSetCountingExpression(newCountingExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION, newCountingExpression, newCountingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION:
				return basicSetInitializeExpression(null, msgs);
			case ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
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
			case ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION:
				return getInitializeExpression();
			case ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
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
			case ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION:
				setInitializeExpression((Assignment)newValue);
				return;
			case ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
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
			case ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION:
				setInitializeExpression((Assignment)null);
				return;
			case ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
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
			case ActionlanguagePackage.FOR_LOOP__INITIALIZE_EXPRESSION:
				return initializeExpression != null;
			case ActionlanguagePackage.FOR_LOOP__COUNTING_EXPRESSION:
				return countingExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ForLoopImpl
