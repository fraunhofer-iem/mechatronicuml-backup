/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.GlobalMissRatio;
import es.unican.mast.xmlmast.result.GlobalMissRatioList;
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
 * An implementation of the model object '<em><b>Global Miss Ratio List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.GlobalMissRatioListImpl#getGlobalMissRatio <em>Global Miss Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalMissRatioListImpl extends MinimalEObjectImpl.Container implements GlobalMissRatioList {
	/**
	 * The cached value of the '{@link #getGlobalMissRatio() <em>Global Miss Ratio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalMissRatio()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalMissRatio> globalMissRatio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalMissRatioListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.GLOBAL_MISS_RATIO_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalMissRatio> getGlobalMissRatio() {
		if (globalMissRatio == null) {
			globalMissRatio = new EObjectContainmentEList<GlobalMissRatio>(GlobalMissRatio.class, this, ResultPackage.GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO);
		}
		return globalMissRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO:
				return ((InternalEList<?>)getGlobalMissRatio()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO:
				return getGlobalMissRatio();
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
			case ResultPackage.GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO:
				getGlobalMissRatio().clear();
				getGlobalMissRatio().addAll((Collection<? extends GlobalMissRatio>)newValue);
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
			case ResultPackage.GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO:
				getGlobalMissRatio().clear();
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
			case ResultPackage.GLOBAL_MISS_RATIO_LIST__GLOBAL_MISS_RATIO:
				return globalMissRatio != null && !globalMissRatio.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalMissRatioListImpl
