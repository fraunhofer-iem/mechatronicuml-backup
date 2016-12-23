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
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.scSyncSend2sfSyncSend;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Sync Send2sf Sync Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl#getSfGuard <em>Sf Guard</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl#getSfAssignment <em>Sf Assignment</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl#getScTransAnnotation <em>Sc Trans Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSyncSend2sfSyncSendImpl#getScAnnDetails <em>Sc Ann Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scSyncSend2sfSyncSendImpl extends AbstractContainerCorrespondenceNodeImpl implements scSyncSend2sfSyncSend {
	/**
	 * The cached value of the '{@link #getSfGuard() <em>Sf Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfGuard()
	 * @generated
	 * @ordered
	 */
	protected Action sfGuard;

	/**
	 * The cached value of the '{@link #getSfAssignment() <em>Sf Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfAssignment()
	 * @generated
	 * @ordered
	 */
	protected Action sfAssignment;

	/**
	 * The cached value of the '{@link #getScTransAnnotation() <em>Sc Trans Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScTransAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EAnnotation scTransAnnotation;

	/**
	 * The cached value of the '{@link #getScAnnDetails() <em>Sc Ann Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAnnDetails()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> scAnnDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scSyncSend2sfSyncSendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_SYNC_SEND2SF_SYNC_SEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfGuard() {
		if (sfGuard != null && ((EObject)sfGuard).eIsProxy()) {
			InternalEObject oldSfGuard = (InternalEObject)sfGuard;
			sfGuard = (Action)eResolveProxy(oldSfGuard);
			if (sfGuard != oldSfGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD, oldSfGuard, sfGuard));
			}
		}
		return sfGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfGuard() {
		return sfGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfGuard(Action newSfGuard) {
		Action oldSfGuard = sfGuard;
		sfGuard = newSfGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD, oldSfGuard, sfGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfAssignment() {
		if (sfAssignment != null && ((EObject)sfAssignment).eIsProxy()) {
			InternalEObject oldSfAssignment = (InternalEObject)sfAssignment;
			sfAssignment = (Action)eResolveProxy(oldSfAssignment);
			if (sfAssignment != oldSfAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT, oldSfAssignment, sfAssignment));
			}
		}
		return sfAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfAssignment() {
		return sfAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfAssignment(Action newSfAssignment) {
		Action oldSfAssignment = sfAssignment;
		sfAssignment = newSfAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT, oldSfAssignment, sfAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getScTransAnnotation() {
		if (scTransAnnotation != null && scTransAnnotation.eIsProxy()) {
			InternalEObject oldScTransAnnotation = (InternalEObject)scTransAnnotation;
			scTransAnnotation = (EAnnotation)eResolveProxy(oldScTransAnnotation);
			if (scTransAnnotation != oldScTransAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION, oldScTransAnnotation, scTransAnnotation));
			}
		}
		return scTransAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetScTransAnnotation() {
		return scTransAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScTransAnnotation(EAnnotation newScTransAnnotation) {
		EAnnotation oldScTransAnnotation = scTransAnnotation;
		scTransAnnotation = newScTransAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION, oldScTransAnnotation, scTransAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getScAnnDetails() {
		if (scAnnDetails != null && ((EObject)scAnnDetails).eIsProxy()) {
			InternalEObject oldScAnnDetails = (InternalEObject)scAnnDetails;
			scAnnDetails = (Map.Entry<String, String>)eResolveProxy(oldScAnnDetails);
			if (scAnnDetails != oldScAnnDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS, oldScAnnDetails, scAnnDetails));
			}
		}
		return scAnnDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetScAnnDetails() {
		return scAnnDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAnnDetails(Map.Entry<String, String> newScAnnDetails) {
		Map.Entry<String, String> oldScAnnDetails = scAnnDetails;
		scAnnDetails = newScAnnDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS, oldScAnnDetails, scAnnDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD:
				if (resolve) return getSfGuard();
				return basicGetSfGuard();
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT:
				if (resolve) return getSfAssignment();
				return basicGetSfAssignment();
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION:
				if (resolve) return getScTransAnnotation();
				return basicGetScTransAnnotation();
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS:
				if (resolve) return getScAnnDetails();
				return basicGetScAnnDetails();
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
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD:
				setSfGuard((Action)newValue);
				return;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT:
				setSfAssignment((Action)newValue);
				return;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION:
				setScTransAnnotation((EAnnotation)newValue);
				return;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS:
				setScAnnDetails((Map.Entry<String, String>)newValue);
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
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD:
				setSfGuard((Action)null);
				return;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT:
				setSfAssignment((Action)null);
				return;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION:
				setScTransAnnotation((EAnnotation)null);
				return;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS:
				setScAnnDetails((Map.Entry<String, String>)null);
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
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_GUARD:
				return sfGuard != null;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SF_ASSIGNMENT:
				return sfAssignment != null;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_TRANS_ANNOTATION:
				return scTransAnnotation != null;
			case BehaviorPackage.SC_SYNC_SEND2SF_SYNC_SEND__SC_ANN_DETAILS:
				return scAnnDetails != null;
		}
		return super.eIsSet(featureID);
	}

} //scSyncSend2sfSyncSendImpl
