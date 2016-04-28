/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.mumlcore.modelinstance.ModelElementCategory;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.ModElCat2SimLib;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod El Cat2 Sim Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.ModElCat2SimLibImpl#getModElCat <em>Mod El Cat</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.ModElCat2SimLibImpl#getSimLib <em>Sim Lib</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModElCat2SimLibImpl extends AbstractContainerCorrespondenceNodeImpl implements ModElCat2SimLib {
	/**
	 * The cached value of the '{@link #getModElCat() <em>Mod El Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModElCat()
	 * @generated
	 * @ordered
	 */
	protected ModelElementCategory modElCat;

	/**
	 * The cached value of the '{@link #getSimLib() <em>Sim Lib</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimLib()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulinkLibrary> simLib;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModElCat2SimLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.MOD_EL_CAT2_SIM_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategory getModElCat() {
		if (modElCat != null && modElCat.eIsProxy()) {
			InternalEObject oldModElCat = (InternalEObject)modElCat;
			modElCat = (ModelElementCategory)eResolveProxy(oldModElCat);
			if (modElCat != oldModElCat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT, oldModElCat, modElCat));
			}
		}
		return modElCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategory basicGetModElCat() {
		return modElCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModElCat(ModelElementCategory newModElCat) {
		ModelElementCategory oldModElCat = modElCat;
		modElCat = newModElCat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT, oldModElCat, modElCat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulinkLibrary> getSimLib() {
		if (simLib == null) {
			simLib = new EObjectResolvingEList<SimulinkLibrary>(SimulinkLibrary.class, this, Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__SIM_LIB);
		}
		return simLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT:
				if (resolve) return getModElCat();
				return basicGetModElCat();
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__SIM_LIB:
				return getSimLib();
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
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT:
				setModElCat((ModelElementCategory)newValue);
				return;
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__SIM_LIB:
				getSimLib().clear();
				getSimLib().addAll((Collection<? extends SimulinkLibrary>)newValue);
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
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT:
				setModElCat((ModelElementCategory)null);
				return;
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__SIM_LIB:
				getSimLib().clear();
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
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__MOD_EL_CAT:
				return modElCat != null;
			case Fujaba2simulinkPackage.MOD_EL_CAT2_SIM_LIB__SIM_LIB:
				return simLib != null && !simLib.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModElCat2SimLibImpl
