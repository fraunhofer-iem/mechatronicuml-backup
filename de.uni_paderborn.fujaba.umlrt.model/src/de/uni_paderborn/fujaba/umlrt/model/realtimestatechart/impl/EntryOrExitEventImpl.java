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
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Or Exit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getUMLRealtimeAction <em>UML Realtime Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.EntryOrExitEventImpl#getEventExpr <em>Event Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryOrExitEventImpl extends EObjectImpl implements EntryOrExitEvent {
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
	 * The cached value of the '{@link #getUMLRealtimeAction() <em>UML Realtime Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeAction()
	 * @generated
	 * @ordered
	 */
	protected Action uMLRealtimeAction;

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
	public Action getUMLRealtimeAction() {
		if (uMLRealtimeAction != null && uMLRealtimeAction.eIsProxy()) {
			InternalEObject oldUMLRealtimeAction = (InternalEObject)uMLRealtimeAction;
			uMLRealtimeAction = (Action)eResolveProxy(oldUMLRealtimeAction);
			if (uMLRealtimeAction != oldUMLRealtimeAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION, oldUMLRealtimeAction, uMLRealtimeAction));
			}
		}
		return uMLRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetUMLRealtimeAction() {
		return uMLRealtimeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeAction(Action newUMLRealtimeAction) {
		Action oldUMLRealtimeAction = uMLRealtimeAction;
		uMLRealtimeAction = newUMLRealtimeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION, oldUMLRealtimeAction, uMLRealtimeAction));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__RESETS:
				if (resolve) return getResets();
				return basicGetResets();
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				if (resolve) return getUMLRealtimeAction();
				return basicGetUMLRealtimeAction();
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				setUMLRealtimeAction((Action)newValue);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				setUMLRealtimeAction((Action)null);
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
			case RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__UML_REALTIME_ACTION:
				return uMLRealtimeAction != null;
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
