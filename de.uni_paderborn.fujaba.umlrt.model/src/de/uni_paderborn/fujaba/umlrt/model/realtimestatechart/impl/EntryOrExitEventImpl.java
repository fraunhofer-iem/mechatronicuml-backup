/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Or Exit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getEventExpr <em>Event Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntryOrExitEventImpl extends EObjectImpl implements EntryOrExitEvent {
	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected Clock resets;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #getEventExpr() <em>Event Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EXPR_EDEFAULT = "entryExitExpr";

	/**
	 * The cached value of the '{@link #getEventExpr() <em>Event Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventExpr()
	 * @generated
	 * @ordered
	 */
	protected String eventExpr = EVENT_EXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryOrExitEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ENTRY_OR_EXIT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getResets() {
		if (resets != null && resets.eIsProxy()) {
			InternalEObject oldResets = (InternalEObject)resets;
			resets = (Clock)eResolveProxy(oldResets);
			if (resets != oldResets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS, oldResets, resets));
			}
		}
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetResets() {
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResets(Clock newResets) {
		Clock oldResets = resets;
		resets = newResets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS, oldResets, resets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventExpr() {
		return eventExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventExpr(String newEventExpr) {
		String oldEventExpr = eventExpr;
		eventExpr = newEventExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EVENT_EXPR, oldEventExpr, eventExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION:
				return basicSetAction(null, msgs);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				if (resolve) return getResets();
				return basicGetResets();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION:
				return getAction();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EVENT_EXPR:
				return getEventExpr();
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				setResets((Clock)newValue);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION:
				setAction((Action)newValue);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EVENT_EXPR:
				setEventExpr((String)newValue);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				setResets((Clock)null);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION:
				setAction((Action)null);
				return;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EVENT_EXPR:
				setEventExpr(EVENT_EXPR_EDEFAULT);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				return resets != null;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ACTION:
				return action != null;
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EVENT_EXPR:
				return EVENT_EXPR_EDEFAULT == null ? eventExpr != null : !EVENT_EXPR_EDEFAULT.equals(eventExpr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eventExpr: ");
		result.append(eventExpr);
		result.append(')');
		return result.toString();
	}

} //EntryOrExitEventImpl
