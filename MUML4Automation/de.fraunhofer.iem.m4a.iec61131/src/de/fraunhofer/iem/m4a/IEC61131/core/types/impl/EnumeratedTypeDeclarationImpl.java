/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeDeclarationImpl#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedTypeDeclarationImpl extends SingleElementTypeDeclarationImpl implements EnumeratedTypeDeclaration {
	/**
	 * The cached value of the '{@link #getSpecInit() <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecInit()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedSpecInit specInit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedSpecInit getSpecInit() {
		return specInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecInit(EnumeratedSpecInit newSpecInit, NotificationChain msgs) {
		EnumeratedSpecInit oldSpecInit = specInit;
		specInit = newSpecInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT, oldSpecInit, newSpecInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecInit(EnumeratedSpecInit newSpecInit) {
		if (newSpecInit != specInit) {
			NotificationChain msgs = null;
			if (specInit != null)
				msgs = ((InternalEObject)specInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT, null, msgs);
			if (newSpecInit != null)
				msgs = ((InternalEObject)newSpecInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT, null, msgs);
			msgs = basicSetSpecInit(newSpecInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT, newSpecInit, newSpecInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT:
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
			case TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT:
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
			case TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT:
				setSpecInit((EnumeratedSpecInit)newValue);
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
			case TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT:
				setSpecInit((EnumeratedSpecInit)null);
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
			case TypesPackage.ENUMERATED_TYPE_DECLARATION__SPEC_INIT:
				return specInit != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedTypeDeclarationImpl
