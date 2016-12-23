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
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.TctlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.impl.BinaryFormulaImpl#getLeftSubformula <em>Left Subformula</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.tctl.impl.BinaryFormulaImpl#getRightSubformula <em>Right Subformula</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryFormulaImpl extends FormulaDefinitionImpl implements BinaryFormula {
	/**
	 * The cached value of the '{@link #getLeftSubformula() <em>Left Subformula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSubformula()
	 * @generated
	 * @ordered
	 */
	protected FormulaDefinition leftSubformula;

	/**
	 * The cached value of the '{@link #getRightSubformula() <em>Right Subformula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSubformula()
	 * @generated
	 * @ordered
	 */
	protected FormulaDefinition rightSubformula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TctlPackage.Literals.BINARY_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaDefinition getLeftSubformula() {
		return leftSubformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSubformula(FormulaDefinition newLeftSubformula, NotificationChain msgs) {
		FormulaDefinition oldLeftSubformula = leftSubformula;
		leftSubformula = newLeftSubformula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA, oldLeftSubformula, newLeftSubformula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSubformula(FormulaDefinition newLeftSubformula) {
		if (newLeftSubformula != leftSubformula) {
			NotificationChain msgs = null;
			if (leftSubformula != null)
				msgs = ((InternalEObject)leftSubformula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA, null, msgs);
			if (newLeftSubformula != null)
				msgs = ((InternalEObject)newLeftSubformula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA, null, msgs);
			msgs = basicSetLeftSubformula(newLeftSubformula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA, newLeftSubformula, newLeftSubformula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaDefinition getRightSubformula() {
		return rightSubformula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSubformula(FormulaDefinition newRightSubformula, NotificationChain msgs) {
		FormulaDefinition oldRightSubformula = rightSubformula;
		rightSubformula = newRightSubformula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA, oldRightSubformula, newRightSubformula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSubformula(FormulaDefinition newRightSubformula) {
		if (newRightSubformula != rightSubformula) {
			NotificationChain msgs = null;
			if (rightSubformula != null)
				msgs = ((InternalEObject)rightSubformula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA, null, msgs);
			if (newRightSubformula != null)
				msgs = ((InternalEObject)newRightSubformula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA, null, msgs);
			msgs = basicSetRightSubformula(newRightSubformula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA, newRightSubformula, newRightSubformula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA:
				return basicSetLeftSubformula(null, msgs);
			case TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA:
				return basicSetRightSubformula(null, msgs);
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
			case TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA:
				return getLeftSubformula();
			case TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA:
				return getRightSubformula();
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
			case TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA:
				setLeftSubformula((FormulaDefinition)newValue);
				return;
			case TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA:
				setRightSubformula((FormulaDefinition)newValue);
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
			case TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA:
				setLeftSubformula((FormulaDefinition)null);
				return;
			case TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA:
				setRightSubformula((FormulaDefinition)null);
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
			case TctlPackage.BINARY_FORMULA__LEFT_SUBFORMULA:
				return leftSubformula != null;
			case TctlPackage.BINARY_FORMULA__RIGHT_SUBFORMULA:
				return rightSubformula != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryFormulaImpl
