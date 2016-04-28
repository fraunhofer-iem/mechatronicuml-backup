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
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScExit2sfExit;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Exit2sf Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl#getScExitEvent <em>Sc Exit Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl#getScExitAction <em>Sc Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl#getScExitExpr <em>Sc Exit Expr</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl#getSfExitAction <em>Sf Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScExit2sfExitImpl#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScExit2sfExitImpl extends AbstractContainerCorrespondenceNodeImpl implements ScExit2sfExit {
	/**
	 * The cached value of the '{@link #getScExitEvent() <em>Sc Exit Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScExitEvent()
	 * @generated
	 * @ordered
	 */
	protected ExitEvent scExitEvent;

	/**
	 * The cached value of the '{@link #getScExitAction() <em>Sc Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScExitAction()
	 * @generated
	 * @ordered
	 */
	protected Action scExitAction;

	/**
	 * The cached value of the '{@link #getScExitExpr() <em>Sc Exit Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScExitExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression scExitExpr;

	/**
	 * The cached value of the '{@link #getSfExitAction() <em>Sf Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfExitAction()
	 * @generated
	 * @ordered
	 */
	protected org.muml.simulink.stateflow.Action sfExitAction;

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
	protected ScExit2sfExitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_EXIT2SF_EXIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEvent getScExitEvent() {
		if (scExitEvent != null && scExitEvent.eIsProxy()) {
			InternalEObject oldScExitEvent = (InternalEObject)scExitEvent;
			scExitEvent = (ExitEvent)eResolveProxy(oldScExitEvent);
			if (scExitEvent != oldScExitEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EVENT, oldScExitEvent, scExitEvent));
			}
		}
		return scExitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEvent basicGetScExitEvent() {
		return scExitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScExitEvent(ExitEvent newScExitEvent) {
		ExitEvent oldScExitEvent = scExitEvent;
		scExitEvent = newScExitEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EVENT, oldScExitEvent, scExitEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getScExitAction() {
		if (scExitAction != null && scExitAction.eIsProxy()) {
			InternalEObject oldScExitAction = (InternalEObject)scExitAction;
			scExitAction = (Action)eResolveProxy(oldScExitAction);
			if (scExitAction != oldScExitAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_ACTION, oldScExitAction, scExitAction));
			}
		}
		return scExitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetScExitAction() {
		return scExitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScExitAction(Action newScExitAction) {
		Action oldScExitAction = scExitAction;
		scExitAction = newScExitAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_ACTION, oldScExitAction, scExitAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getScExitExpr() {
		if (scExitExpr != null && scExitExpr.eIsProxy()) {
			InternalEObject oldScExitExpr = (InternalEObject)scExitExpr;
			scExitExpr = (Expression)eResolveProxy(oldScExitExpr);
			if (scExitExpr != oldScExitExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EXPR, oldScExitExpr, scExitExpr));
			}
		}
		return scExitExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetScExitExpr() {
		return scExitExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScExitExpr(Expression newScExitExpr) {
		Expression oldScExitExpr = scExitExpr;
		scExitExpr = newScExitExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EXPR, oldScExitExpr, scExitExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.simulink.stateflow.Action getSfExitAction() {
		if (sfExitAction != null && ((EObject)sfExitAction).eIsProxy()) {
			InternalEObject oldSfExitAction = (InternalEObject)sfExitAction;
			sfExitAction = (org.muml.simulink.stateflow.Action)eResolveProxy(oldSfExitAction);
			if (sfExitAction != oldSfExitAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_EXIT2SF_EXIT__SF_EXIT_ACTION, oldSfExitAction, sfExitAction));
			}
		}
		return sfExitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.simulink.stateflow.Action basicGetSfExitAction() {
		return sfExitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfExitAction(org.muml.simulink.stateflow.Action newSfExitAction) {
		org.muml.simulink.stateflow.Action oldSfExitAction = sfExitAction;
		sfExitAction = newSfExitAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_EXIT2SF_EXIT__SF_EXIT_ACTION, oldSfExitAction, sfExitAction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_EXIT2SF_EXIT__SC_CLOCK, oldScClock, scClock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_EXIT2SF_EXIT__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EVENT:
				if (resolve) return getScExitEvent();
				return basicGetScExitEvent();
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_ACTION:
				if (resolve) return getScExitAction();
				return basicGetScExitAction();
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EXPR:
				if (resolve) return getScExitExpr();
				return basicGetScExitExpr();
			case BehaviorPackage.SC_EXIT2SF_EXIT__SF_EXIT_ACTION:
				if (resolve) return getSfExitAction();
				return basicGetSfExitAction();
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_CLOCK:
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
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EVENT:
				setScExitEvent((ExitEvent)newValue);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_ACTION:
				setScExitAction((Action)newValue);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EXPR:
				setScExitExpr((Expression)newValue);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SF_EXIT_ACTION:
				setSfExitAction((org.muml.simulink.stateflow.Action)newValue);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_CLOCK:
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
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EVENT:
				setScExitEvent((ExitEvent)null);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_ACTION:
				setScExitAction((Action)null);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EXPR:
				setScExitExpr((Expression)null);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SF_EXIT_ACTION:
				setSfExitAction((org.muml.simulink.stateflow.Action)null);
				return;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_CLOCK:
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
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EVENT:
				return scExitEvent != null;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_ACTION:
				return scExitAction != null;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_EXIT_EXPR:
				return scExitExpr != null;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SF_EXIT_ACTION:
				return sfExitAction != null;
			case BehaviorPackage.SC_EXIT2SF_EXIT__SC_CLOCK:
				return scClock != null;
		}
		return super.eIsSet(featureID);
	}

} //ScExit2sfExitImpl
