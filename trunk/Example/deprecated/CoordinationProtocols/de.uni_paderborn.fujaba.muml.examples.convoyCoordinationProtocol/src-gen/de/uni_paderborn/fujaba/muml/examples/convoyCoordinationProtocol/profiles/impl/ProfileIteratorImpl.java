/**
 */
package de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl;

import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.Profile;
import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.ProfileIterator;
import de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.ProfilesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl.ProfileIteratorImpl#getProfilesToDo <em>Profiles To Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileIteratorImpl extends EObjectImpl implements ProfileIterator {
	/**
	 * The cached value of the '{@link #getProfilesToDo() <em>Profiles To Do</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfilesToDo()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> profilesToDo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.PROFILE_ITERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getProfilesToDo() {
		if (profilesToDo == null) {
			profilesToDo = new EObjectResolvingEList<Profile>(Profile.class, this, ProfilesPackage.PROFILE_ITERATOR__PROFILES_TO_DO);
		}
		return profilesToDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilesPackage.PROFILE_ITERATOR__PROFILES_TO_DO:
				return getProfilesToDo();
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
			case ProfilesPackage.PROFILE_ITERATOR__PROFILES_TO_DO:
				getProfilesToDo().clear();
				getProfilesToDo().addAll((Collection<? extends Profile>)newValue);
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
			case ProfilesPackage.PROFILE_ITERATOR__PROFILES_TO_DO:
				getProfilesToDo().clear();
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
			case ProfilesPackage.PROFILE_ITERATOR__PROFILES_TO_DO:
				return profilesToDo != null && !profilesToDo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProfileIteratorImpl
