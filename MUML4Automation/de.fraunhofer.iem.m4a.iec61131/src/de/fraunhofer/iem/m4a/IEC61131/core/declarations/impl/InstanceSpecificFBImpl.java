/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificFB;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specific FB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificFBImpl#getInit <em>Init</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificFBImpl#getFbInstanceRef <em>Fb Instance Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceSpecificFBImpl extends InstanceSpecificVarInitImpl implements InstanceSpecificFB {
	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected StructureInit init;

	/**
	 * The cached value of the '{@link #getFbInstanceRef() <em>Fb Instance Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected FBInstance fbInstanceRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificFBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.INSTANCE_SPECIFIC_FB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInit getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(StructureInit newInit, NotificationChain msgs) {
		StructureInit oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(StructureInit newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance getFbInstanceRef() {
		if (fbInstanceRef != null && fbInstanceRef.eIsProxy()) {
			InternalEObject oldFbInstanceRef = (InternalEObject)fbInstanceRef;
			fbInstanceRef = (FBInstance)eResolveProxy(oldFbInstanceRef);
			if (fbInstanceRef != oldFbInstanceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF, oldFbInstanceRef, fbInstanceRef));
			}
		}
		return fbInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance basicGetFbInstanceRef() {
		return fbInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFbInstanceRef(FBInstance newFbInstanceRef) {
		FBInstance oldFbInstanceRef = fbInstanceRef;
		fbInstanceRef = newFbInstanceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF, oldFbInstanceRef, fbInstanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT:
				return basicSetInit(null, msgs);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT:
				return getInit();
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF:
				if (resolve) return getFbInstanceRef();
				return basicGetFbInstanceRef();
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT:
				setInit((StructureInit)newValue);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF:
				setFbInstanceRef((FBInstance)newValue);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT:
				setInit((StructureInit)null);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF:
				setFbInstanceRef((FBInstance)null);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__INIT:
				return init != null;
			case DeclarationsPackage.INSTANCE_SPECIFIC_FB__FB_INSTANCE_REF:
				return fbInstanceRef != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceSpecificFBImpl
