/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.reachanalysis.reachabilitygraph.impl.ActionTransitionImpl;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDM Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl#getAppliedActivity <em>Applied Activity</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl#getMatching <em>Matching</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDMTransitionImpl extends ActionTransitionImpl implements SDMTransition {
	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EMap<EObject, EObject> index;

	/**
	 * The cached value of the '{@link #getAppliedActivity() <em>Applied Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity appliedActivity;

	/**
	 * The cached value of the '{@link #getMatching() <em>Matching</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatching()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EObject> matching;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDMTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmPackage.Literals.SDM_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EObject, EObject> getIndex() {
		if (index == null) {
			index = new EcoreEMap<EObject,EObject>(SdmPackage.Literals.INDEX_ENTRY, IndexEntryImpl.class, this, SdmPackage.SDM_TRANSITION__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getAppliedActivity() {
		if (appliedActivity != null && appliedActivity.eIsProxy()) {
			InternalEObject oldAppliedActivity = (InternalEObject)appliedActivity;
			appliedActivity = (Activity)eResolveProxy(oldAppliedActivity);
			if (appliedActivity != oldAppliedActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY, oldAppliedActivity, appliedActivity));
			}
		}
		return appliedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetAppliedActivity() {
		return appliedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedActivity(Activity newAppliedActivity) {
		Activity oldAppliedActivity = appliedActivity;
		appliedActivity = newAppliedActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY, oldAppliedActivity, appliedActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EObject> getMatching() {
		if (matching == null) {
			matching = new EcoreEMap<String,EObject>(SdmPackage.Literals.MATCHING_ENTRY, MatchingEntryImpl.class, this, SdmPackage.SDM_TRANSITION__MATCHING);
		}
		return matching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SdmPackage.SDM_TRANSITION__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case SdmPackage.SDM_TRANSITION__MATCHING:
				return ((InternalEList<?>)getMatching()).basicRemove(otherEnd, msgs);
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
			case SdmPackage.SDM_TRANSITION__INDEX:
				if (coreType) return getIndex();
				else return getIndex().map();
			case SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY:
				if (resolve) return getAppliedActivity();
				return basicGetAppliedActivity();
			case SdmPackage.SDM_TRANSITION__MATCHING:
				if (coreType) return getMatching();
				else return getMatching().map();
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
			case SdmPackage.SDM_TRANSITION__INDEX:
				((EStructuralFeature.Setting)getIndex()).set(newValue);
				return;
			case SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY:
				setAppliedActivity((Activity)newValue);
				return;
			case SdmPackage.SDM_TRANSITION__MATCHING:
				((EStructuralFeature.Setting)getMatching()).set(newValue);
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
			case SdmPackage.SDM_TRANSITION__INDEX:
				getIndex().clear();
				return;
			case SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY:
				setAppliedActivity((Activity)null);
				return;
			case SdmPackage.SDM_TRANSITION__MATCHING:
				getMatching().clear();
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
			case SdmPackage.SDM_TRANSITION__INDEX:
				return index != null && !index.isEmpty();
			case SdmPackage.SDM_TRANSITION__APPLIED_ACTIVITY:
				return appliedActivity != null;
			case SdmPackage.SDM_TRANSITION__MATCHING:
				return matching != null && !matching.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SDMTransitionImpl
