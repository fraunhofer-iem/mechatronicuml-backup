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
import org.muml.pim.realtimestatechart.State;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScState2SfState;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc State2 Sf State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScState2SfStateImpl#getScState <em>Sc State</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScState2SfStateImpl#getSfState <em>Sf State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScState2SfStateImpl extends AbstractContainerCorrespondenceNodeImpl implements ScState2SfState {
	/**
	 * The cached value of the '{@link #getScState() <em>Sc State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScState()
	 * @generated
	 * @ordered
	 */
	protected State scState;

	/**
	 * The cached value of the '{@link #getSfState() <em>Sf State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfState()
	 * @generated
	 * @ordered
	 */
	protected org.muml.simulink.stateflow.State sfState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScState2SfStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_STATE2_SF_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getScState() {
		if (scState != null && scState.eIsProxy()) {
			InternalEObject oldScState = (InternalEObject)scState;
			scState = (State)eResolveProxy(oldScState);
			if (scState != oldScState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_STATE2_SF_STATE__SC_STATE, oldScState, scState));
			}
		}
		return scState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetScState() {
		return scState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScState(State newScState) {
		State oldScState = scState;
		scState = newScState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_STATE2_SF_STATE__SC_STATE, oldScState, scState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.simulink.stateflow.State getSfState() {
		if (sfState != null && ((EObject)sfState).eIsProxy()) {
			InternalEObject oldSfState = (InternalEObject)sfState;
			sfState = (org.muml.simulink.stateflow.State)eResolveProxy(oldSfState);
			if (sfState != oldSfState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_STATE2_SF_STATE__SF_STATE, oldSfState, sfState));
			}
		}
		return sfState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.simulink.stateflow.State basicGetSfState() {
		return sfState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfState(org.muml.simulink.stateflow.State newSfState) {
		org.muml.simulink.stateflow.State oldSfState = sfState;
		sfState = newSfState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_STATE2_SF_STATE__SF_STATE, oldSfState, sfState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_STATE2_SF_STATE__SC_STATE:
				if (resolve) return getScState();
				return basicGetScState();
			case BehaviorPackage.SC_STATE2_SF_STATE__SF_STATE:
				if (resolve) return getSfState();
				return basicGetSfState();
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
			case BehaviorPackage.SC_STATE2_SF_STATE__SC_STATE:
				setScState((State)newValue);
				return;
			case BehaviorPackage.SC_STATE2_SF_STATE__SF_STATE:
				setSfState((org.muml.simulink.stateflow.State)newValue);
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
			case BehaviorPackage.SC_STATE2_SF_STATE__SC_STATE:
				setScState((State)null);
				return;
			case BehaviorPackage.SC_STATE2_SF_STATE__SF_STATE:
				setSfState((org.muml.simulink.stateflow.State)null);
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
			case BehaviorPackage.SC_STATE2_SF_STATE__SC_STATE:
				return scState != null;
			case BehaviorPackage.SC_STATE2_SF_STATE__SF_STATE:
				return sfState != null;
		}
		return super.eIsSet(featureID);
	}

} //ScState2SfStateImpl
