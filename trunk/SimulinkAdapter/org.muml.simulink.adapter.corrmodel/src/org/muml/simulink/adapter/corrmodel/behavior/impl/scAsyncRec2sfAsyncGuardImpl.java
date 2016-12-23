/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.scAsyncRec2sfAsyncGuard;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Async Rec2sf Async Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl#getGuardAnnotation <em>Guard Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl#getEAnnotation <em>EAnnotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAsyncRec2sfAsyncGuardImpl#getAsyncRecGuard <em>Async Rec Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scAsyncRec2sfAsyncGuardImpl extends AbstractContainerCorrespondenceNodeImpl implements scAsyncRec2sfAsyncGuard {
	/**
	 * The cached value of the '{@link #getGuardAnnotation() <em>Guard Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> guardAnnotation;

	/**
	 * The cached value of the '{@link #getEAnnotation() <em>EAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EAnnotation eAnnotation;

	/**
	 * The cached value of the '{@link #getAsynchronousMessageEvent() <em>Asynchronous Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 * @ordered
	 */
	protected AsynchronousMessageEvent asynchronousMessageEvent;

	/**
	 * The cached value of the '{@link #getAsyncRecGuard() <em>Async Rec Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncRecGuard()
	 * @generated
	 * @ordered
	 */
	protected Action asyncRecGuard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scAsyncRec2sfAsyncGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_ASYNC_REC2SF_ASYNC_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getGuardAnnotation() {
		if (guardAnnotation != null && ((EObject)guardAnnotation).eIsProxy()) {
			InternalEObject oldGuardAnnotation = (InternalEObject)guardAnnotation;
			guardAnnotation = (Map.Entry<String, String>)eResolveProxy(oldGuardAnnotation);
			if (guardAnnotation != oldGuardAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION, oldGuardAnnotation, guardAnnotation));
			}
		}
		return guardAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetGuardAnnotation() {
		return guardAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardAnnotation(Map.Entry<String, String> newGuardAnnotation) {
		Map.Entry<String, String> oldGuardAnnotation = guardAnnotation;
		guardAnnotation = newGuardAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION, oldGuardAnnotation, guardAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEAnnotation() {
		if (eAnnotation != null && eAnnotation.eIsProxy()) {
			InternalEObject oldEAnnotation = (InternalEObject)eAnnotation;
			eAnnotation = (EAnnotation)eResolveProxy(oldEAnnotation);
			if (eAnnotation != oldEAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION, oldEAnnotation, eAnnotation));
			}
		}
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetEAnnotation() {
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAnnotation(EAnnotation newEAnnotation) {
		EAnnotation oldEAnnotation = eAnnotation;
		eAnnotation = newEAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION, oldEAnnotation, eAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent getAsynchronousMessageEvent() {
		if (asynchronousMessageEvent != null && asynchronousMessageEvent.eIsProxy()) {
			InternalEObject oldAsynchronousMessageEvent = (InternalEObject)asynchronousMessageEvent;
			asynchronousMessageEvent = (AsynchronousMessageEvent)eResolveProxy(oldAsynchronousMessageEvent);
			if (asynchronousMessageEvent != oldAsynchronousMessageEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT, oldAsynchronousMessageEvent, asynchronousMessageEvent));
			}
		}
		return asynchronousMessageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent basicGetAsynchronousMessageEvent() {
		return asynchronousMessageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsynchronousMessageEvent(AsynchronousMessageEvent newAsynchronousMessageEvent) {
		AsynchronousMessageEvent oldAsynchronousMessageEvent = asynchronousMessageEvent;
		asynchronousMessageEvent = newAsynchronousMessageEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT, oldAsynchronousMessageEvent, asynchronousMessageEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAsyncRecGuard() {
		if (asyncRecGuard != null && ((EObject)asyncRecGuard).eIsProxy()) {
			InternalEObject oldAsyncRecGuard = (InternalEObject)asyncRecGuard;
			asyncRecGuard = (Action)eResolveProxy(oldAsyncRecGuard);
			if (asyncRecGuard != oldAsyncRecGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD, oldAsyncRecGuard, asyncRecGuard));
			}
		}
		return asyncRecGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAsyncRecGuard() {
		return asyncRecGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsyncRecGuard(Action newAsyncRecGuard) {
		Action oldAsyncRecGuard = asyncRecGuard;
		asyncRecGuard = newAsyncRecGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD, oldAsyncRecGuard, asyncRecGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION:
				if (resolve) return getGuardAnnotation();
				return basicGetGuardAnnotation();
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION:
				if (resolve) return getEAnnotation();
				return basicGetEAnnotation();
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT:
				if (resolve) return getAsynchronousMessageEvent();
				return basicGetAsynchronousMessageEvent();
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD:
				if (resolve) return getAsyncRecGuard();
				return basicGetAsyncRecGuard();
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
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION:
				setGuardAnnotation((Map.Entry<String, String>)newValue);
				return;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION:
				setEAnnotation((EAnnotation)newValue);
				return;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)newValue);
				return;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD:
				setAsyncRecGuard((Action)newValue);
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
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION:
				setGuardAnnotation((Map.Entry<String, String>)null);
				return;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION:
				setEAnnotation((EAnnotation)null);
				return;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)null);
				return;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD:
				setAsyncRecGuard((Action)null);
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
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__GUARD_ANNOTATION:
				return guardAnnotation != null;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__EANNOTATION:
				return eAnnotation != null;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNCHRONOUS_MESSAGE_EVENT:
				return asynchronousMessageEvent != null;
			case BehaviorPackage.SC_ASYNC_REC2SF_ASYNC_GUARD__ASYNC_REC_GUARD:
				return asyncRecGuard != null;
		}
		return super.eIsSet(featureID);
	}

} //scAsyncRec2sfAsyncGuardImpl
