/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scAsyncSend2sfAction;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Async Send2sf Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAsyncSend2sfActionImpl#getSfEnqAction <em>Sf Enq Action</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAsyncSend2sfActionImpl#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAsyncSend2sfActionImpl#getEAnnotation <em>EAnnotation</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAsyncSend2sfActionImpl#getEStringToStringMapEntry <em>EString To String Map Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scAsyncSend2sfActionImpl extends AbstractContainerCorrespondenceNodeImpl implements scAsyncSend2sfAction {
	/**
	 * The cached value of the '{@link #getSfEnqAction() <em>Sf Enq Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfEnqAction()
	 * @generated
	 * @ordered
	 */
	protected Action sfEnqAction;

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
	 * The cached value of the '{@link #getEAnnotation() <em>EAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EAnnotation eAnnotation;

	/**
	 * The cached value of the '{@link #getEStringToStringMapEntry() <em>EString To String Map Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> eStringToStringMapEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scAsyncSend2sfActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_ASYNC_SEND2SF_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfEnqAction() {
		if (sfEnqAction != null && ((EObject)sfEnqAction).eIsProxy()) {
			InternalEObject oldSfEnqAction = (InternalEObject)sfEnqAction;
			sfEnqAction = (Action)eResolveProxy(oldSfEnqAction);
			if (sfEnqAction != oldSfEnqAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION, oldSfEnqAction, sfEnqAction));
			}
		}
		return sfEnqAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfEnqAction() {
		return sfEnqAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfEnqAction(Action newSfEnqAction) {
		Action oldSfEnqAction = sfEnqAction;
		sfEnqAction = newSfEnqAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION, oldSfEnqAction, sfEnqAction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT, oldAsynchronousMessageEvent, asynchronousMessageEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT, oldAsynchronousMessageEvent, asynchronousMessageEvent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__EANNOTATION, oldEAnnotation, eAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__EANNOTATION, oldEAnnotation, eAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getEStringToStringMapEntry() {
		if (eStringToStringMapEntry != null && ((EObject)eStringToStringMapEntry).eIsProxy()) {
			InternalEObject oldEStringToStringMapEntry = (InternalEObject)eStringToStringMapEntry;
			eStringToStringMapEntry = (Map.Entry<String, String>)eResolveProxy(oldEStringToStringMapEntry);
			if (eStringToStringMapEntry != oldEStringToStringMapEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY, oldEStringToStringMapEntry, eStringToStringMapEntry));
			}
		}
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetEStringToStringMapEntry() {
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStringToStringMapEntry(Map.Entry<String, String> newEStringToStringMapEntry) {
		Map.Entry<String, String> oldEStringToStringMapEntry = eStringToStringMapEntry;
		eStringToStringMapEntry = newEStringToStringMapEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY, oldEStringToStringMapEntry, eStringToStringMapEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION:
				if (resolve) return getSfEnqAction();
				return basicGetSfEnqAction();
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				if (resolve) return getAsynchronousMessageEvent();
				return basicGetAsynchronousMessageEvent();
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__EANNOTATION:
				if (resolve) return getEAnnotation();
				return basicGetEAnnotation();
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY:
				if (resolve) return getEStringToStringMapEntry();
				return basicGetEStringToStringMapEntry();
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
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION:
				setSfEnqAction((Action)newValue);
				return;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)newValue);
				return;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__EANNOTATION:
				setEAnnotation((EAnnotation)newValue);
				return;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY:
				setEStringToStringMapEntry((Map.Entry<String, String>)newValue);
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
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION:
				setSfEnqAction((Action)null);
				return;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)null);
				return;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__EANNOTATION:
				setEAnnotation((EAnnotation)null);
				return;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY:
				setEStringToStringMapEntry((Map.Entry<String, String>)null);
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
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__SF_ENQ_ACTION:
				return sfEnqAction != null;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				return asynchronousMessageEvent != null;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__EANNOTATION:
				return eAnnotation != null;
			case Behavior_modelPackage.SC_ASYNC_SEND2SF_ACTION__ESTRING_TO_STRING_MAP_ENTRY:
				return eStringToStringMapEntry != null;
		}
		return super.eIsSet(featureID);
	}

} //scAsyncSend2sfActionImpl
