/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package railcab.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.NamedElementImpl;

import railcab.RailCab;
import railcab.RailcabPackage;
import railcab.SectionControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railcab.impl.SectionControlImpl#getRailcabs <em>Railcabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionControlImpl extends NamedElementImpl implements SectionControl {
	/**
	 * The cached value of the '{@link #getRailcabs() <em>Railcabs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailcabs()
	 * @generated
	 * @ordered
	 */
	protected EList<RailCab> railcabs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailcabPackage.Literals.SECTION_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RailCab> getRailcabs() {
		if (railcabs == null) {
			railcabs = new EObjectWithInverseResolvingEList<RailCab>(RailCab.class, this, RailcabPackage.SECTION_CONTROL__RAILCABS, RailcabPackage.RAIL_CAB__SECTION_CONTROL);
		}
		return railcabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailcabPackage.SECTION_CONTROL__RAILCABS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRailcabs()).basicAdd(otherEnd, msgs);
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
			case RailcabPackage.SECTION_CONTROL__RAILCABS:
				return ((InternalEList<?>)getRailcabs()).basicRemove(otherEnd, msgs);
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
			case RailcabPackage.SECTION_CONTROL__RAILCABS:
				return getRailcabs();
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
			case RailcabPackage.SECTION_CONTROL__RAILCABS:
				getRailcabs().clear();
				getRailcabs().addAll((Collection<? extends RailCab>)newValue);
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
			case RailcabPackage.SECTION_CONTROL__RAILCABS:
				getRailcabs().clear();
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
			case RailcabPackage.SECTION_CONTROL__RAILCABS:
				return railcabs != null && !railcabs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionControlImpl
