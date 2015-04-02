/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Var2SpecInitDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var2 Spec Init Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.Var2SpecInitDeclImpl#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Var2SpecInitDeclImpl extends NamedVariableDeclarationImpl implements Var2SpecInitDecl {
	/**
	 * The cached value of the '{@link #getSpecInit() <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecInit()
	 * @generated
	 * @ordered
	 */
	protected Var2SpecInit specInit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Var2SpecInitDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.VAR2_SPEC_INIT_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var2SpecInit getSpecInit() {
		return specInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecInit(Var2SpecInit newSpecInit, NotificationChain msgs) {
		Var2SpecInit oldSpecInit = specInit;
		specInit = newSpecInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT, oldSpecInit, newSpecInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecInit(Var2SpecInit newSpecInit) {
		if (newSpecInit != specInit) {
			NotificationChain msgs = null;
			if (specInit != null)
				msgs = ((InternalEObject)specInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT, null, msgs);
			if (newSpecInit != null)
				msgs = ((InternalEObject)newSpecInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT, null, msgs);
			msgs = basicSetSpecInit(newSpecInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT, newSpecInit, newSpecInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT:
				return basicSetSpecInit(null, msgs);
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
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT:
				return getSpecInit();
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
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT:
				setSpecInit((Var2SpecInit)newValue);
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
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT:
				setSpecInit((Var2SpecInit)null);
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
			case DeclarationsPackage.VAR2_SPEC_INIT_DECL__SPEC_INIT:
				return specInit != null;
		}
		return super.eIsSet(featureID);
	}

} //Var2SpecInitDeclImpl
