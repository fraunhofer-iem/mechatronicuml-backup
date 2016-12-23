/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.RtScCat2SfM;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.StateflowMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rt Sc Cat2 Sf M</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.RtScCat2SfMImpl#getSfM <em>Sf M</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.RtScCat2SfMImpl#getRtScCat <em>Rt Sc Cat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtScCat2SfMImpl extends AbstractContainerCorrespondenceNodeImpl implements RtScCat2SfM {
	/**
	 * The cached value of the '{@link #getSfM() <em>Sf M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfM()
	 * @generated
	 * @ordered
	 */
	protected StateflowMachine sfM;

	/**
	 * The cached value of the '{@link #getRtScCat() <em>Rt Sc Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtScCat()
	 * @generated
	 * @ordered
	 */
	protected ModelElementCategory rtScCat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtScCat2SfMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.RT_SC_CAT2_SF_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowMachine getSfM() {
		if (sfM != null && ((EObject)sfM).eIsProxy()) {
			InternalEObject oldSfM = (InternalEObject)sfM;
			sfM = (StateflowMachine)eResolveProxy(oldSfM);
			if (sfM != oldSfM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.RT_SC_CAT2_SF_M__SF_M, oldSfM, sfM));
			}
		}
		return sfM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowMachine basicGetSfM() {
		return sfM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfM(StateflowMachine newSfM) {
		StateflowMachine oldSfM = sfM;
		sfM = newSfM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.RT_SC_CAT2_SF_M__SF_M, oldSfM, sfM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategory getRtScCat() {
		if (rtScCat != null && rtScCat.eIsProxy()) {
			InternalEObject oldRtScCat = (InternalEObject)rtScCat;
			rtScCat = (ModelElementCategory)eResolveProxy(oldRtScCat);
			if (rtScCat != oldRtScCat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.RT_SC_CAT2_SF_M__RT_SC_CAT, oldRtScCat, rtScCat));
			}
		}
		return rtScCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategory basicGetRtScCat() {
		return rtScCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtScCat(ModelElementCategory newRtScCat) {
		ModelElementCategory oldRtScCat = rtScCat;
		rtScCat = newRtScCat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.RT_SC_CAT2_SF_M__RT_SC_CAT, oldRtScCat, rtScCat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.RT_SC_CAT2_SF_M__SF_M:
				if (resolve) return getSfM();
				return basicGetSfM();
			case BehaviorPackage.RT_SC_CAT2_SF_M__RT_SC_CAT:
				if (resolve) return getRtScCat();
				return basicGetRtScCat();
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
			case BehaviorPackage.RT_SC_CAT2_SF_M__SF_M:
				setSfM((StateflowMachine)newValue);
				return;
			case BehaviorPackage.RT_SC_CAT2_SF_M__RT_SC_CAT:
				setRtScCat((ModelElementCategory)newValue);
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
			case BehaviorPackage.RT_SC_CAT2_SF_M__SF_M:
				setSfM((StateflowMachine)null);
				return;
			case BehaviorPackage.RT_SC_CAT2_SF_M__RT_SC_CAT:
				setRtScCat((ModelElementCategory)null);
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
			case BehaviorPackage.RT_SC_CAT2_SF_M__SF_M:
				return sfM != null;
			case BehaviorPackage.RT_SC_CAT2_SF_M__RT_SC_CAT:
				return rtScCat != null;
		}
		return super.eIsSet(featureID);
	}

} //RtScCat2SfMImpl
