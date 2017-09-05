/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SearchLocation;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Paths</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.SearchPathsImpl#getSearchLocation <em>Search Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchPathsImpl extends EObjectImpl implements SearchPaths {
	/**
	 * The cached value of the '{@link #getSearchLocation() <em>Search Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchLocation> searchLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchPathsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.SEARCH_PATHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchLocation> getSearchLocation() {
		if (searchLocation == null) {
			searchLocation = new EObjectContainmentEList<SearchLocation>(SearchLocation.class, this,
					GeneratorPackage.SEARCH_PATHS__SEARCH_LOCATION);
		}
		return searchLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.SEARCH_PATHS__SEARCH_LOCATION:
			return ((InternalEList<?>) getSearchLocation()).basicRemove(otherEnd, msgs);
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
		case GeneratorPackage.SEARCH_PATHS__SEARCH_LOCATION:
			return getSearchLocation();
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
		case GeneratorPackage.SEARCH_PATHS__SEARCH_LOCATION:
			getSearchLocation().clear();
			getSearchLocation().addAll((Collection<? extends SearchLocation>) newValue);
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
		case GeneratorPackage.SEARCH_PATHS__SEARCH_LOCATION:
			getSearchLocation().clear();
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
		case GeneratorPackage.SEARCH_PATHS__SEARCH_LOCATION:
			return searchLocation != null && !searchLocation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchPathsImpl
