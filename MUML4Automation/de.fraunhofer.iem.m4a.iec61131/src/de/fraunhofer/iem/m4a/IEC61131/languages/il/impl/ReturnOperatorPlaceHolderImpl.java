/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Operator Place Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ReturnOperatorPlaceHolderImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ReturnOperatorPlaceHolderImpl#getReturnOperator <em>Return Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnOperatorPlaceHolderImpl extends MinimalEObjectImpl.Container implements ReturnOperatorPlaceHolder {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected IlLabel label;

	/**
	 * The default value of the '{@link #getReturnOperator() <em>Return Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnOperator RETURN_OPERATOR_EDEFAULT = ReturnOperator.RET;

	/**
	 * The cached value of the '{@link #getReturnOperator() <em>Return Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnOperator()
	 * @generated
	 * @ordered
	 */
	protected ReturnOperator returnOperator = RETURN_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnOperatorPlaceHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.RETURN_OPERATOR_PLACE_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(IlLabel newLabel, NotificationChain msgs) {
		IlLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(IlLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnOperator getReturnOperator() {
		return returnOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnOperator(ReturnOperator newReturnOperator) {
		ReturnOperator oldReturnOperator = returnOperator;
		returnOperator = newReturnOperator == null ? RETURN_OPERATOR_EDEFAULT : newReturnOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR, oldReturnOperator, returnOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL:
				return basicSetLabel(null, msgs);
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
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL:
				return getLabel();
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR:
				return getReturnOperator();
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
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR:
				setReturnOperator((ReturnOperator)newValue);
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
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR:
				setReturnOperator(RETURN_OPERATOR_EDEFAULT);
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
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__LABEL:
				return label != null;
			case IlPackage.RETURN_OPERATOR_PLACE_HOLDER__RETURN_OPERATOR:
				return returnOperator != RETURN_OPERATOR_EDEFAULT;
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
		result.append(" (returnOperator: ");
		result.append(returnOperator);
		result.append(')');
		return result.toString();
	}

} //ReturnOperatorPlaceHolderImpl
