/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.MissRatio;
import es.unican.mast.xmlmast.result.MissRatioList;
import es.unican.mast.xmlmast.result.ResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Miss Ratio List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.MissRatioListImpl#getMissRatio <em>Miss Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MissRatioListImpl extends MinimalEObjectImpl.Container implements MissRatioList {
	/**
	 * The cached value of the '{@link #getMissRatio() <em>Miss Ratio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissRatio()
	 * @generated
	 * @ordered
	 */
	protected EList<MissRatio> missRatio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissRatioListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.MISS_RATIO_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MissRatio> getMissRatio() {
		if (missRatio == null) {
			missRatio = new EObjectContainmentEList<MissRatio>(MissRatio.class, this, ResultPackage.MISS_RATIO_LIST__MISS_RATIO);
		}
		return missRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.MISS_RATIO_LIST__MISS_RATIO:
				return ((InternalEList<?>)getMissRatio()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.MISS_RATIO_LIST__MISS_RATIO:
				return getMissRatio();
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
			case ResultPackage.MISS_RATIO_LIST__MISS_RATIO:
				getMissRatio().clear();
				getMissRatio().addAll((Collection<? extends MissRatio>)newValue);
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
			case ResultPackage.MISS_RATIO_LIST__MISS_RATIO:
				getMissRatio().clear();
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
			case ResultPackage.MISS_RATIO_LIST__MISS_RATIO:
				return missRatio != null && !missRatio.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissRatioListImpl
