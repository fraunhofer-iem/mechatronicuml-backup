/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Spec Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedSpecInitImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedSpecInitImpl#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedSpecInitImpl extends MinimalEObjectImpl.Container implements EnumeratedSpecInit {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedSpecification specification;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedValue initialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedSpecInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_SPEC_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(EnumeratedSpecification newSpecification, NotificationChain msgs) {
		EnumeratedSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(EnumeratedSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue getInitialization() {
		if (initialization != null && initialization.eIsProxy()) {
			InternalEObject oldInitialization = (InternalEObject)initialization;
			initialization = (EnumeratedValue)eResolveProxy(oldInitialization);
			if (initialization != oldInitialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_SPEC_INIT__INITIALIZATION, oldInitialization, initialization));
			}
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue basicGetInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(EnumeratedValue newInitialization) {
		EnumeratedValue oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_SPEC_INIT__INITIALIZATION, oldInitialization, initialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION:
				return getSpecification();
			case TypesPackage.ENUMERATED_SPEC_INIT__INITIALIZATION:
				if (resolve) return getInitialization();
				return basicGetInitialization();
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
			case TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION:
				setSpecification((EnumeratedSpecification)newValue);
				return;
			case TypesPackage.ENUMERATED_SPEC_INIT__INITIALIZATION:
				setInitialization((EnumeratedValue)newValue);
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
			case TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION:
				setSpecification((EnumeratedSpecification)null);
				return;
			case TypesPackage.ENUMERATED_SPEC_INIT__INITIALIZATION:
				setInitialization((EnumeratedValue)null);
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
			case TypesPackage.ENUMERATED_SPEC_INIT__SPECIFICATION:
				return specification != null;
			case TypesPackage.ENUMERATED_SPEC_INIT__INITIALIZATION:
				return initialization != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedSpecInitImpl
