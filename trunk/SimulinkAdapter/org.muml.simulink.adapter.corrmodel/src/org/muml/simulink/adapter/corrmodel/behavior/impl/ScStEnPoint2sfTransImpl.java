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
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScStEnPoint2sfTrans;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc St En Point2sf Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl#getSfTrans <em>Sf Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl#getScInTrans <em>Sc In Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl#getScOutTrans <em>Sc Out Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScStEnPoint2sfTransImpl#getScStateEntryP <em>Sc State Entry P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScStEnPoint2sfTransImpl extends AbstractContainerCorrespondenceNodeImpl implements ScStEnPoint2sfTrans {
	/**
	 * The cached value of the '{@link #getSfTrans() <em>Sf Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfTrans()
	 * @generated
	 * @ordered
	 */
	protected Transition sfTrans;

	/**
	 * The cached value of the '{@link #getScInTrans() <em>Sc In Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScInTrans()
	 * @generated
	 * @ordered
	 */
	protected org.muml.pim.realtimestatechart.Transition scInTrans;

	/**
	 * The cached value of the '{@link #getScOutTrans() <em>Sc Out Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScOutTrans()
	 * @generated
	 * @ordered
	 */
	protected org.muml.pim.realtimestatechart.Transition scOutTrans;

	/**
	 * The cached value of the '{@link #getScStateEntryP() <em>Sc State Entry P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScStateEntryP()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint scStateEntryP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScStEnPoint2sfTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_ST_EN_POINT2SF_TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSfTrans() {
		if (sfTrans != null && ((EObject)sfTrans).eIsProxy()) {
			InternalEObject oldSfTrans = (InternalEObject)sfTrans;
			sfTrans = (Transition)eResolveProxy(oldSfTrans);
			if (sfTrans != oldSfTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SF_TRANS, oldSfTrans, sfTrans));
			}
		}
		return sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSfTrans() {
		return sfTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfTrans(Transition newSfTrans) {
		Transition oldSfTrans = sfTrans;
		sfTrans = newSfTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SF_TRANS, oldSfTrans, sfTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.realtimestatechart.Transition getScInTrans() {
		if (scInTrans != null && scInTrans.eIsProxy()) {
			InternalEObject oldScInTrans = (InternalEObject)scInTrans;
			scInTrans = (org.muml.pim.realtimestatechart.Transition)eResolveProxy(oldScInTrans);
			if (scInTrans != oldScInTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS, oldScInTrans, scInTrans));
			}
		}
		return scInTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.realtimestatechart.Transition basicGetScInTrans() {
		return scInTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScInTrans(org.muml.pim.realtimestatechart.Transition newScInTrans) {
		org.muml.pim.realtimestatechart.Transition oldScInTrans = scInTrans;
		scInTrans = newScInTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS, oldScInTrans, scInTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.realtimestatechart.Transition getScOutTrans() {
		if (scOutTrans != null && scOutTrans.eIsProxy()) {
			InternalEObject oldScOutTrans = (InternalEObject)scOutTrans;
			scOutTrans = (org.muml.pim.realtimestatechart.Transition)eResolveProxy(oldScOutTrans);
			if (scOutTrans != oldScOutTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS, oldScOutTrans, scOutTrans));
			}
		}
		return scOutTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.realtimestatechart.Transition basicGetScOutTrans() {
		return scOutTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScOutTrans(org.muml.pim.realtimestatechart.Transition newScOutTrans) {
		org.muml.pim.realtimestatechart.Transition oldScOutTrans = scOutTrans;
		scOutTrans = newScOutTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS, oldScOutTrans, scOutTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint getScStateEntryP() {
		if (scStateEntryP != null && scStateEntryP.eIsProxy()) {
			InternalEObject oldScStateEntryP = (InternalEObject)scStateEntryP;
			scStateEntryP = (EntryPoint)eResolveProxy(oldScStateEntryP);
			if (scStateEntryP != oldScStateEntryP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P, oldScStateEntryP, scStateEntryP));
			}
		}
		return scStateEntryP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint basicGetScStateEntryP() {
		return scStateEntryP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScStateEntryP(EntryPoint newScStateEntryP) {
		EntryPoint oldScStateEntryP = scStateEntryP;
		scStateEntryP = newScStateEntryP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P, oldScStateEntryP, scStateEntryP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SF_TRANS:
				if (resolve) return getSfTrans();
				return basicGetSfTrans();
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS:
				if (resolve) return getScInTrans();
				return basicGetScInTrans();
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS:
				if (resolve) return getScOutTrans();
				return basicGetScOutTrans();
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P:
				if (resolve) return getScStateEntryP();
				return basicGetScStateEntryP();
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
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SF_TRANS:
				setSfTrans((Transition)newValue);
				return;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS:
				setScInTrans((org.muml.pim.realtimestatechart.Transition)newValue);
				return;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS:
				setScOutTrans((org.muml.pim.realtimestatechart.Transition)newValue);
				return;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P:
				setScStateEntryP((EntryPoint)newValue);
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
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SF_TRANS:
				setSfTrans((Transition)null);
				return;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS:
				setScInTrans((org.muml.pim.realtimestatechart.Transition)null);
				return;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS:
				setScOutTrans((org.muml.pim.realtimestatechart.Transition)null);
				return;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P:
				setScStateEntryP((EntryPoint)null);
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
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SF_TRANS:
				return sfTrans != null;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_IN_TRANS:
				return scInTrans != null;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_OUT_TRANS:
				return scOutTrans != null;
			case BehaviorPackage.SC_ST_EN_POINT2SF_TRANS__SC_STATE_ENTRY_P:
				return scStateEntryP != null;
		}
		return super.eIsSet(featureID);
	}

} //ScStEnPoint2sfTransImpl
