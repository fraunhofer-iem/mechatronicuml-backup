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
import org.muml.core.expressions.Expression;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScEntry2sfEntry;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Entry2sf Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl#getScEntryEvent <em>Sc Entry Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl#getSfEntryAction <em>Sf Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl#getScEntryAction <em>Sc Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl#getScExpr <em>Sc Expr</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScEntry2sfEntryImpl#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScEntry2sfEntryImpl extends AbstractContainerCorrespondenceNodeImpl implements ScEntry2sfEntry {
	/**
	 * The cached value of the '{@link #getScEntryEvent() <em>Sc Entry Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScEntryEvent()
	 * @generated
	 * @ordered
	 */
	protected EntryEvent scEntryEvent;

	/**
	 * The cached value of the '{@link #getSfEntryAction() <em>Sf Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfEntryAction()
	 * @generated
	 * @ordered
	 */
	protected Action sfEntryAction;

	/**
	 * The cached value of the '{@link #getScEntryAction() <em>Sc Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScEntryAction()
	 * @generated
	 * @ordered
	 */
	protected org.muml.pim.realtimestatechart.Action scEntryAction;

	/**
	 * The cached value of the '{@link #getScExpr() <em>Sc Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression scExpr;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScEntry2sfEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_ENTRY2SF_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryEvent getScEntryEvent() {
		if (scEntryEvent != null && scEntryEvent.eIsProxy()) {
			InternalEObject oldScEntryEvent = (InternalEObject)scEntryEvent;
			scEntryEvent = (EntryEvent)eResolveProxy(oldScEntryEvent);
			if (scEntryEvent != oldScEntryEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT, oldScEntryEvent, scEntryEvent));
			}
		}
		return scEntryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryEvent basicGetScEntryEvent() {
		return scEntryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScEntryEvent(EntryEvent newScEntryEvent) {
		EntryEvent oldScEntryEvent = scEntryEvent;
		scEntryEvent = newScEntryEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT, oldScEntryEvent, scEntryEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfEntryAction() {
		if (sfEntryAction != null && ((EObject)sfEntryAction).eIsProxy()) {
			InternalEObject oldSfEntryAction = (InternalEObject)sfEntryAction;
			sfEntryAction = (Action)eResolveProxy(oldSfEntryAction);
			if (sfEntryAction != oldSfEntryAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION, oldSfEntryAction, sfEntryAction));
			}
		}
		return sfEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfEntryAction() {
		return sfEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfEntryAction(Action newSfEntryAction) {
		Action oldSfEntryAction = sfEntryAction;
		sfEntryAction = newSfEntryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION, oldSfEntryAction, sfEntryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.realtimestatechart.Action getScEntryAction() {
		if (scEntryAction != null && scEntryAction.eIsProxy()) {
			InternalEObject oldScEntryAction = (InternalEObject)scEntryAction;
			scEntryAction = (org.muml.pim.realtimestatechart.Action)eResolveProxy(oldScEntryAction);
			if (scEntryAction != oldScEntryAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION, oldScEntryAction, scEntryAction));
			}
		}
		return scEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.realtimestatechart.Action basicGetScEntryAction() {
		return scEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScEntryAction(org.muml.pim.realtimestatechart.Action newScEntryAction) {
		org.muml.pim.realtimestatechart.Action oldScEntryAction = scEntryAction;
		scEntryAction = newScEntryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION, oldScEntryAction, scEntryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getScExpr() {
		if (scExpr != null && scExpr.eIsProxy()) {
			InternalEObject oldScExpr = (InternalEObject)scExpr;
			scExpr = (Expression)eResolveProxy(oldScExpr);
			if (scExpr != oldScExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_EXPR, oldScExpr, scExpr));
			}
		}
		return scExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetScExpr() {
		return scExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScExpr(Expression newScExpr) {
		Expression oldScExpr = scExpr;
		scExpr = newScExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_EXPR, oldScExpr, scExpr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK, oldScClock, scClock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				if (resolve) return getScEntryEvent();
				return basicGetScEntryEvent();
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				if (resolve) return getSfEntryAction();
				return basicGetSfEntryAction();
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				if (resolve) return getScEntryAction();
				return basicGetScEntryAction();
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				if (resolve) return getScExpr();
				return basicGetScExpr();
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
				if (resolve) return getScClock();
				return basicGetScClock();
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
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				setScEntryEvent((EntryEvent)newValue);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				setSfEntryAction((Action)newValue);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				setScEntryAction((org.muml.pim.realtimestatechart.Action)newValue);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				setScExpr((Expression)newValue);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
				setScClock((Clock)newValue);
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
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				setScEntryEvent((EntryEvent)null);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				setSfEntryAction((Action)null);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				setScEntryAction((org.muml.pim.realtimestatechart.Action)null);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				setScExpr((Expression)null);
				return;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
				setScClock((Clock)null);
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
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				return scEntryEvent != null;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				return sfEntryAction != null;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				return scEntryAction != null;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				return scExpr != null;
			case BehaviorPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
				return scClock != null;
		}
		return super.eIsSet(featureID);
	}

} //ScEntry2sfEntryImpl
