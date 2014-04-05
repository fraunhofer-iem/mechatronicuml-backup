/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Muml Elem Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.MumlElemExprImpl#getElem <em>Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MumlElemExprImpl extends MapExprImpl implements MumlElemExpr {
	/**
	 * The cached value of the '{@link #getElem() <em>Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElem()
	 * @generated
	 * @ordered
	 */
	protected EObject elem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MumlElemExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparablesPackage.Literals.MUML_ELEM_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getElem() {
		if (elem != null && elem.eIsProxy()) {
			InternalEObject oldElem = (InternalEObject)elem;
			elem = eResolveProxy(oldElem);
			if (elem != oldElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComparablesPackage.MUML_ELEM_EXPR__ELEM, oldElem, elem));
			}
		}
		return elem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElem() {
		return elem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElem(EObject newElem) {
		EObject oldElem = elem;
		elem = newElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparablesPackage.MUML_ELEM_EXPR__ELEM, oldElem, elem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComparablesPackage.MUML_ELEM_EXPR__ELEM:
				if (resolve) return getElem();
				return basicGetElem();
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
			case ComparablesPackage.MUML_ELEM_EXPR__ELEM:
				setElem((EObject)newValue);
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
			case ComparablesPackage.MUML_ELEM_EXPR__ELEM:
				setElem((EObject)null);
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
			case ComparablesPackage.MUML_ELEM_EXPR__ELEM:
				return elem != null;
		}
		return super.eIsSet(featureID);
	}

} //MumlElemExprImpl
