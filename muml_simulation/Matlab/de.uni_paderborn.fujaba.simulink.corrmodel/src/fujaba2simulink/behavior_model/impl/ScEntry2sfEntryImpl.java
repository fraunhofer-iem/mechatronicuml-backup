/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.ScEntry2sfEntry;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Entry2sf Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScEntry2sfEntryImpl#getScEntryEvent <em>Sc Entry Event</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScEntry2sfEntryImpl#getSfEntryAction <em>Sf Entry Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScEntry2sfEntryImpl#getScEntryAction <em>Sc Entry Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScEntry2sfEntryImpl#getScExpr <em>Sc Expr</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.ScEntry2sfEntryImpl#getScClock <em>Sc Clock</em>}</li>
 * </ul>
 * </p>
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
	protected de.uni_paderborn.fujaba.muml.realtimestatechart.Action scEntryAction;

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
		return Behavior_modelPackage.Literals.SC_ENTRY2SF_ENTRY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT, oldScEntryEvent, scEntryEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT, oldScEntryEvent, scEntryEvent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION, oldSfEntryAction, sfEntryAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION, oldSfEntryAction, sfEntryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.Action getScEntryAction() {
		if (scEntryAction != null && scEntryAction.eIsProxy()) {
			InternalEObject oldScEntryAction = (InternalEObject)scEntryAction;
			scEntryAction = (de.uni_paderborn.fujaba.muml.realtimestatechart.Action)eResolveProxy(oldScEntryAction);
			if (scEntryAction != oldScEntryAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION, oldScEntryAction, scEntryAction));
			}
		}
		return scEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.Action basicGetScEntryAction() {
		return scEntryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScEntryAction(de.uni_paderborn.fujaba.muml.realtimestatechart.Action newScEntryAction) {
		de.uni_paderborn.fujaba.muml.realtimestatechart.Action oldScEntryAction = scEntryAction;
		scEntryAction = newScEntryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION, oldScEntryAction, scEntryAction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_EXPR, oldScExpr, scExpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_EXPR, oldScExpr, scExpr));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK, oldScClock, scClock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				if (resolve) return getScEntryEvent();
				return basicGetScEntryEvent();
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				if (resolve) return getSfEntryAction();
				return basicGetSfEntryAction();
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				if (resolve) return getScEntryAction();
				return basicGetScEntryAction();
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				if (resolve) return getScExpr();
				return basicGetScExpr();
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
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
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				setScEntryEvent((EntryEvent)newValue);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				setSfEntryAction((Action)newValue);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				setScEntryAction((de.uni_paderborn.fujaba.muml.realtimestatechart.Action)newValue);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				setScExpr((Expression)newValue);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
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
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				setScEntryEvent((EntryEvent)null);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				setSfEntryAction((Action)null);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				setScEntryAction((de.uni_paderborn.fujaba.muml.realtimestatechart.Action)null);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				setScExpr((Expression)null);
				return;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
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
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_EVENT:
				return scEntryEvent != null;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SF_ENTRY_ACTION:
				return sfEntryAction != null;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_ENTRY_ACTION:
				return scEntryAction != null;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_EXPR:
				return scExpr != null;
			case Behavior_modelPackage.SC_ENTRY2SF_ENTRY__SC_CLOCK:
				return scClock != null;
		}
		return super.eIsSet(featureID);
	}

} //ScEntry2sfEntryImpl
