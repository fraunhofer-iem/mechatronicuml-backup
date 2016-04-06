/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarParameterImpl#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarParameterImpl extends EObjectImpl implements CarParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected Carprocess car;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtccarplatooningPackage.Literals.CAR_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CAR_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess getCar() {
		if (car != null && car.eIsProxy()) {
			InternalEObject oldCar = (InternalEObject)car;
			car = (Carprocess)eResolveProxy(oldCar);
			if (car != oldCar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtccarplatooningPackage.CAR_PARAMETER__CAR, oldCar, car));
			}
		}
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess basicGetCar() {
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCar(Carprocess newCar, NotificationChain msgs) {
		Carprocess oldCar = car;
		car = newCar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CAR_PARAMETER__CAR, oldCar, newCar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCar(Carprocess newCar) {
		if (newCar != car) {
			NotificationChain msgs = null;
			if (car != null)
				msgs = ((InternalEObject)car).eInverseRemove(this, TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER, Carprocess.class, msgs);
			if (newCar != null)
				msgs = ((InternalEObject)newCar).eInverseAdd(this, TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER, Carprocess.class, msgs);
			msgs = basicSetCar(newCar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CAR_PARAMETER__CAR, newCar, newCar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtccarplatooningPackage.CAR_PARAMETER__CAR:
				if (car != null)
					msgs = ((InternalEObject)car).eInverseRemove(this, TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER, Carprocess.class, msgs);
				return basicSetCar((Carprocess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtccarplatooningPackage.CAR_PARAMETER__CAR:
				return basicSetCar(null, msgs);
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
			case TtccarplatooningPackage.CAR_PARAMETER__NAME:
				return getName();
			case TtccarplatooningPackage.CAR_PARAMETER__CAR:
				if (resolve) return getCar();
				return basicGetCar();
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
			case TtccarplatooningPackage.CAR_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case TtccarplatooningPackage.CAR_PARAMETER__CAR:
				setCar((Carprocess)newValue);
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
			case TtccarplatooningPackage.CAR_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TtccarplatooningPackage.CAR_PARAMETER__CAR:
				setCar((Carprocess)null);
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
			case TtccarplatooningPackage.CAR_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TtccarplatooningPackage.CAR_PARAMETER__CAR:
				return car != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CarParameterImpl
