/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.InitializedStructure;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initialized Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.InitializedStructureImpl#getDefinedStructure <em>Defined Structure</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.InitializedStructureImpl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitializedStructureImpl extends MinimalEObjectImpl.Container implements InitializedStructure {
	/**
	 * The cached value of the '{@link #getDefinedStructure() <em>Defined Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedStructure()
	 * @generated
	 * @ordered
	 */
	protected StructureTypeDeclaration definedStructure;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializedStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.INITIALIZED_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeDeclaration getDefinedStructure() {
		if (definedStructure != null && definedStructure.eIsProxy()) {
			InternalEObject oldDefinedStructure = (InternalEObject)definedStructure;
			definedStructure = (StructureTypeDeclaration)eResolveProxy(oldDefinedStructure);
			if (definedStructure != oldDefinedStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.INITIALIZED_STRUCTURE__DEFINED_STRUCTURE, oldDefinedStructure, definedStructure));
			}
		}
		return definedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeDeclaration basicGetDefinedStructure() {
		return definedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedStructure(StructureTypeDeclaration newDefinedStructure) {
		StructureTypeDeclaration oldDefinedStructure = definedStructure;
		definedStructure = newDefinedStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.INITIALIZED_STRUCTURE__DEFINED_STRUCTURE, oldDefinedStructure, definedStructure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.INITIALIZED_STRUCTURE__INIT, oldInit, newInit);
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
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.INITIALIZED_STRUCTURE__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.INITIALIZED_STRUCTURE__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.INITIALIZED_STRUCTURE__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.INITIALIZED_STRUCTURE__INIT:
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
			case TypesPackage.INITIALIZED_STRUCTURE__DEFINED_STRUCTURE:
				if (resolve) return getDefinedStructure();
				return basicGetDefinedStructure();
			case TypesPackage.INITIALIZED_STRUCTURE__INIT:
				return getInit();
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
			case TypesPackage.INITIALIZED_STRUCTURE__DEFINED_STRUCTURE:
				setDefinedStructure((StructureTypeDeclaration)newValue);
				return;
			case TypesPackage.INITIALIZED_STRUCTURE__INIT:
				setInit((StructureInit)newValue);
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
			case TypesPackage.INITIALIZED_STRUCTURE__DEFINED_STRUCTURE:
				setDefinedStructure((StructureTypeDeclaration)null);
				return;
			case TypesPackage.INITIALIZED_STRUCTURE__INIT:
				setInit((StructureInit)null);
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
			case TypesPackage.INITIALIZED_STRUCTURE__DEFINED_STRUCTURE:
				return definedStructure != null;
			case TypesPackage.INITIALIZED_STRUCTURE__INIT:
				return init != null;
		}
		return super.eIsSet(featureID);
	}

} //InitializedStructureImpl
