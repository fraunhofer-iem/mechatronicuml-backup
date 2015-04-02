/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamImplication;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl#isNot <em>Not</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.ParamImplicationImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamImplicationImpl extends MinimalEObjectImpl.Container implements ParamImplication {
	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable leftSide;

	/**
	 * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected Variable rightSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.PARAM_IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.PARAM_IMPLICATION__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getLeftSide() {
		if (leftSide != null && leftSide.eIsProxy()) {
			InternalEObject oldLeftSide = (InternalEObject)leftSide;
			leftSide = (SymbolicVariable)eResolveProxy(oldLeftSide);
			if (leftSide != oldLeftSide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.PARAM_IMPLICATION__LEFT_SIDE, oldLeftSide, leftSide));
			}
		}
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable basicGetLeftSide() {
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSide(SymbolicVariable newLeftSide) {
		SymbolicVariable oldLeftSide = leftSide;
		leftSide = newLeftSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.PARAM_IMPLICATION__LEFT_SIDE, oldLeftSide, leftSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRightSide() {
		if (rightSide != null && rightSide.eIsProxy()) {
			InternalEObject oldRightSide = (InternalEObject)rightSide;
			rightSide = (Variable)eResolveProxy(oldRightSide);
			if (rightSide != oldRightSide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.PARAM_IMPLICATION__RIGHT_SIDE, oldRightSide, rightSide));
			}
		}
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRightSide() {
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSide(Variable newRightSide) {
		Variable oldRightSide = rightSide;
		rightSide = newRightSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.PARAM_IMPLICATION__RIGHT_SIDE, oldRightSide, rightSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StPackage.PARAM_IMPLICATION__NOT:
				return isNot();
			case StPackage.PARAM_IMPLICATION__LEFT_SIDE:
				if (resolve) return getLeftSide();
				return basicGetLeftSide();
			case StPackage.PARAM_IMPLICATION__RIGHT_SIDE:
				if (resolve) return getRightSide();
				return basicGetRightSide();
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
			case StPackage.PARAM_IMPLICATION__NOT:
				setNot((Boolean)newValue);
				return;
			case StPackage.PARAM_IMPLICATION__LEFT_SIDE:
				setLeftSide((SymbolicVariable)newValue);
				return;
			case StPackage.PARAM_IMPLICATION__RIGHT_SIDE:
				setRightSide((Variable)newValue);
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
			case StPackage.PARAM_IMPLICATION__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case StPackage.PARAM_IMPLICATION__LEFT_SIDE:
				setLeftSide((SymbolicVariable)null);
				return;
			case StPackage.PARAM_IMPLICATION__RIGHT_SIDE:
				setRightSide((Variable)null);
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
			case StPackage.PARAM_IMPLICATION__NOT:
				return not != NOT_EDEFAULT;
			case StPackage.PARAM_IMPLICATION__LEFT_SIDE:
				return leftSide != null;
			case StPackage.PARAM_IMPLICATION__RIGHT_SIDE:
				return rightSide != null;
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
		result.append(" (not: ");
		result.append(not);
		result.append(')');
		return result.toString();
	}

} //ParamImplicationImpl
