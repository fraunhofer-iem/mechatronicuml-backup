/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.TctlPackage;
import org.muml.reconfigurationverification.tctl.UnaryFormula;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.impl.UnaryFormulaImpl#getSubformula <em>Subformula</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnaryFormulaImpl extends FormulaDefinitionImpl implements UnaryFormula {
	/**
	 * The cached value of the '{@link #getSubformula() <em>Subformula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubformula()
	 * @generated
	 * @ordered
	 */
	protected FormulaDefinition subformula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TctlPackage.Literals.UNARY_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaDefinition getSubformula() {
		return subformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubformula(FormulaDefinition newSubformula, NotificationChain msgs) {
		FormulaDefinition oldSubformula = subformula;
		subformula = newSubformula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TctlPackage.UNARY_FORMULA__SUBFORMULA, oldSubformula, newSubformula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubformula(FormulaDefinition newSubformula) {
		if (newSubformula != subformula) {
			NotificationChain msgs = null;
			if (subformula != null)
				msgs = ((InternalEObject)subformula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TctlPackage.UNARY_FORMULA__SUBFORMULA, null, msgs);
			if (newSubformula != null)
				msgs = ((InternalEObject)newSubformula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TctlPackage.UNARY_FORMULA__SUBFORMULA, null, msgs);
			msgs = basicSetSubformula(newSubformula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TctlPackage.UNARY_FORMULA__SUBFORMULA, newSubformula, newSubformula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TctlPackage.UNARY_FORMULA__SUBFORMULA:
				return basicSetSubformula(null, msgs);
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
			case TctlPackage.UNARY_FORMULA__SUBFORMULA:
				return getSubformula();
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
			case TctlPackage.UNARY_FORMULA__SUBFORMULA:
				setSubformula((FormulaDefinition)newValue);
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
			case TctlPackage.UNARY_FORMULA__SUBFORMULA:
				setSubformula((FormulaDefinition)null);
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
			case TctlPackage.UNARY_FORMULA__SUBFORMULA:
				return subformula != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryFormulaImpl
