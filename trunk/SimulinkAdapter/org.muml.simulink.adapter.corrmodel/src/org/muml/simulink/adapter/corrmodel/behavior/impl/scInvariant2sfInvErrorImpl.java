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
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.valuetype.TimeValue;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.scInvariant2sfInvError;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Invariant2sf Inv Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl#getScInvariant <em>Sc Invariant</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl#getScBound <em>Sc Bound</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl#getSfInvTrans <em>Sf Inv Trans</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl#getSfInvGuard <em>Sf Inv Guard</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scInvariant2sfInvErrorImpl#getSfInvNode <em>Sf Inv Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scInvariant2sfInvErrorImpl extends AbstractContainerCorrespondenceNodeImpl implements scInvariant2sfInvError {
	/**
	 * The cached value of the '{@link #getScInvariant() <em>Sc Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScInvariant()
	 * @generated
	 * @ordered
	 */
	protected ClockConstraint scInvariant;

	/**
	 * The cached value of the '{@link #getScBound() <em>Sc Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScBound()
	 * @generated
	 * @ordered
	 */
	protected TimeValue scBound;

	/**
	 * The cached value of the '{@link #getScClock() <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScClock()
	 * @generated
	 * @ordered
	 */
	protected Clock scClock;

	/**
	 * The cached value of the '{@link #getSfInvTrans() <em>Sf Inv Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfInvTrans()
	 * @generated
	 * @ordered
	 */
	protected Transition sfInvTrans;

	/**
	 * The cached value of the '{@link #getSfInvGuard() <em>Sf Inv Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfInvGuard()
	 * @generated
	 * @ordered
	 */
	protected Action sfInvGuard;

	/**
	 * The cached value of the '{@link #getSfInvNode() <em>Sf Inv Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfInvNode()
	 * @generated
	 * @ordered
	 */
	protected State sfInvNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scInvariant2sfInvErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_INVARIANT2SF_INV_ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint getScInvariant() {
		if (scInvariant != null && scInvariant.eIsProxy()) {
			InternalEObject oldScInvariant = (InternalEObject)scInvariant;
			scInvariant = (ClockConstraint)eResolveProxy(oldScInvariant);
			if (scInvariant != oldScInvariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT, oldScInvariant, scInvariant));
			}
		}
		return scInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint basicGetScInvariant() {
		return scInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScInvariant(ClockConstraint newScInvariant) {
		ClockConstraint oldScInvariant = scInvariant;
		scInvariant = newScInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT, oldScInvariant, scInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getScBound() {
		if (scBound != null && scBound.eIsProxy()) {
			InternalEObject oldScBound = (InternalEObject)scBound;
			scBound = (TimeValue)eResolveProxy(oldScBound);
			if (scBound != oldScBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_BOUND, oldScBound, scBound));
			}
		}
		return scBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue basicGetScBound() {
		return scBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScBound(TimeValue newScBound) {
		TimeValue oldScBound = scBound;
		scBound = newScBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_BOUND, oldScBound, scBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getScClock() {
		if (scClock != null && scClock.eIsProxy()) {
			InternalEObject oldScClock = (InternalEObject)scClock;
			scClock = (Clock)eResolveProxy(oldScClock);
			if (scClock != oldScClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_CLOCK, oldScClock, scClock));
			}
		}
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetScClock() {
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScClock(Clock newScClock) {
		Clock oldScClock = scClock;
		scClock = newScClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSfInvTrans() {
		if (sfInvTrans != null && ((EObject)sfInvTrans).eIsProxy()) {
			InternalEObject oldSfInvTrans = (InternalEObject)sfInvTrans;
			sfInvTrans = (Transition)eResolveProxy(oldSfInvTrans);
			if (sfInvTrans != oldSfInvTrans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS, oldSfInvTrans, sfInvTrans));
			}
		}
		return sfInvTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSfInvTrans() {
		return sfInvTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfInvTrans(Transition newSfInvTrans) {
		Transition oldSfInvTrans = sfInvTrans;
		sfInvTrans = newSfInvTrans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS, oldSfInvTrans, sfInvTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfInvGuard() {
		if (sfInvGuard != null && ((EObject)sfInvGuard).eIsProxy()) {
			InternalEObject oldSfInvGuard = (InternalEObject)sfInvGuard;
			sfInvGuard = (Action)eResolveProxy(oldSfInvGuard);
			if (sfInvGuard != oldSfInvGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD, oldSfInvGuard, sfInvGuard));
			}
		}
		return sfInvGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfInvGuard() {
		return sfInvGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfInvGuard(Action newSfInvGuard) {
		Action oldSfInvGuard = sfInvGuard;
		sfInvGuard = newSfInvGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD, oldSfInvGuard, sfInvGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSfInvNode() {
		if (sfInvNode != null && ((EObject)sfInvNode).eIsProxy()) {
			InternalEObject oldSfInvNode = (InternalEObject)sfInvNode;
			sfInvNode = (State)eResolveProxy(oldSfInvNode);
			if (sfInvNode != oldSfInvNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE, oldSfInvNode, sfInvNode));
			}
		}
		return sfInvNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSfInvNode() {
		return sfInvNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfInvNode(State newSfInvNode) {
		State oldSfInvNode = sfInvNode;
		sfInvNode = newSfInvNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE, oldSfInvNode, sfInvNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT:
				if (resolve) return getScInvariant();
				return basicGetScInvariant();
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_BOUND:
				if (resolve) return getScBound();
				return basicGetScBound();
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_CLOCK:
				if (resolve) return getScClock();
				return basicGetScClock();
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS:
				if (resolve) return getSfInvTrans();
				return basicGetSfInvTrans();
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD:
				if (resolve) return getSfInvGuard();
				return basicGetSfInvGuard();
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE:
				if (resolve) return getSfInvNode();
				return basicGetSfInvNode();
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
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT:
				setScInvariant((ClockConstraint)newValue);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_BOUND:
				setScBound((TimeValue)newValue);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_CLOCK:
				setScClock((Clock)newValue);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS:
				setSfInvTrans((Transition)newValue);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD:
				setSfInvGuard((Action)newValue);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE:
				setSfInvNode((State)newValue);
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
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT:
				setScInvariant((ClockConstraint)null);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_BOUND:
				setScBound((TimeValue)null);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_CLOCK:
				setScClock((Clock)null);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS:
				setSfInvTrans((Transition)null);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD:
				setSfInvGuard((Action)null);
				return;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE:
				setSfInvNode((State)null);
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
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_INVARIANT:
				return scInvariant != null;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_BOUND:
				return scBound != null;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SC_CLOCK:
				return scClock != null;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_TRANS:
				return sfInvTrans != null;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_GUARD:
				return sfInvGuard != null;
			case BehaviorPackage.SC_INVARIANT2SF_INV_ERROR__SF_INV_NODE:
				return sfInvNode != null;
		}
		return super.eIsSet(featureID);
	}

} //scInvariant2sfInvErrorImpl
