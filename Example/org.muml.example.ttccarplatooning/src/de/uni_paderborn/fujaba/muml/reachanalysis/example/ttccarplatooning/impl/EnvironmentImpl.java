/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl;

import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Environment;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.EnvironmentImpl#getMaxNumOfCars <em>Max Num Of Cars</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.EnvironmentImpl#getCars <em>Cars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends EObjectImpl implements Environment {
	/**
	 * The default value of the '{@link #getMaxNumOfCars() <em>Max Num Of Cars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumOfCars()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUM_OF_CARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumOfCars() <em>Max Num Of Cars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumOfCars()
	 * @generated
	 * @ordered
	 */
	protected int maxNumOfCars = MAX_NUM_OF_CARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCars() <em>Cars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCars()
	 * @generated
	 * @ordered
	 */
	protected EList<Carprocess> cars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtccarplatooningPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumOfCars() {
		return maxNumOfCars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumOfCars(int newMaxNumOfCars) {
		int oldMaxNumOfCars = maxNumOfCars;
		maxNumOfCars = newMaxNumOfCars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.ENVIRONMENT__MAX_NUM_OF_CARS, oldMaxNumOfCars, maxNumOfCars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carprocess> getCars() {
		if (cars == null) {
			cars = new EObjectContainmentEList<Carprocess>(Carprocess.class, this, TtccarplatooningPackage.ENVIRONMENT__CARS);
		}
		return cars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtccarplatooningPackage.ENVIRONMENT__CARS:
				return ((InternalEList<?>)getCars()).basicRemove(otherEnd, msgs);
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
			case TtccarplatooningPackage.ENVIRONMENT__MAX_NUM_OF_CARS:
				return getMaxNumOfCars();
			case TtccarplatooningPackage.ENVIRONMENT__CARS:
				return getCars();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TtccarplatooningPackage.ENVIRONMENT__MAX_NUM_OF_CARS:
				setMaxNumOfCars((Integer)newValue);
				return;
			case TtccarplatooningPackage.ENVIRONMENT__CARS:
				getCars().clear();
				getCars().addAll((Collection<? extends Carprocess>)newValue);
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
			case TtccarplatooningPackage.ENVIRONMENT__MAX_NUM_OF_CARS:
				setMaxNumOfCars(MAX_NUM_OF_CARS_EDEFAULT);
				return;
			case TtccarplatooningPackage.ENVIRONMENT__CARS:
				getCars().clear();
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
			case TtccarplatooningPackage.ENVIRONMENT__MAX_NUM_OF_CARS:
				return maxNumOfCars != MAX_NUM_OF_CARS_EDEFAULT;
			case TtccarplatooningPackage.ENVIRONMENT__CARS:
				return cars != null && !cars.isEmpty();
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
		result.append(" (maxNumOfCars: ");
		result.append(maxNumOfCars);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
