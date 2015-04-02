/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationImpl#getVarSpec <em>Var Spec</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationImpl#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GlobalVarDeclarationImpl extends MinimalEObjectImpl.Container implements GlobalVarDeclaration {
	/**
	 * The cached value of the '{@link #getVarSpec() <em>Var Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarSpec()
	 * @generated
	 * @ordered
	 */
	protected GlobalVarSpec varSpec;

	/**
	 * The cached value of the '{@link #getSpecInit() <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecInit()
	 * @generated
	 * @ordered
	 */
	protected GlobalVarSpecInit specInit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVarDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.GLOBAL_VAR_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarSpec getVarSpec() {
		return varSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarSpec(GlobalVarSpec newVarSpec, NotificationChain msgs) {
		GlobalVarSpec oldVarSpec = varSpec;
		varSpec = newVarSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC, oldVarSpec, newVarSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarSpec(GlobalVarSpec newVarSpec) {
		if (newVarSpec != varSpec) {
			NotificationChain msgs = null;
			if (varSpec != null)
				msgs = ((InternalEObject)varSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC, null, msgs);
			if (newVarSpec != null)
				msgs = ((InternalEObject)newVarSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC, null, msgs);
			msgs = basicSetVarSpec(newVarSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC, newVarSpec, newVarSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarSpecInit getSpecInit() {
		return specInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecInit(GlobalVarSpecInit newSpecInit, NotificationChain msgs) {
		GlobalVarSpecInit oldSpecInit = specInit;
		specInit = newSpecInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT, oldSpecInit, newSpecInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecInit(GlobalVarSpecInit newSpecInit) {
		if (newSpecInit != specInit) {
			NotificationChain msgs = null;
			if (specInit != null)
				msgs = ((InternalEObject)specInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT, null, msgs);
			if (newSpecInit != null)
				msgs = ((InternalEObject)newSpecInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT, null, msgs);
			msgs = basicSetSpecInit(newSpecInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT, newSpecInit, newSpecInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC:
				return basicSetVarSpec(null, msgs);
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT:
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC:
				return getVarSpec();
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT:
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC:
				setVarSpec((GlobalVarSpec)newValue);
				return;
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT:
				setSpecInit((GlobalVarSpecInit)newValue);
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC:
				setVarSpec((GlobalVarSpec)null);
				return;
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT:
				setSpecInit((GlobalVarSpecInit)null);
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__VAR_SPEC:
				return varSpec != null;
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION__SPEC_INIT:
				return specInit != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalVarDeclarationImpl
