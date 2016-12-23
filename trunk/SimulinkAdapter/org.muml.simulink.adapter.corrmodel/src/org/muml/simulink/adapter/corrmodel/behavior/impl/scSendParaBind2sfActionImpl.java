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
import org.muml.simulink.adapter.corrmodel.behavior.scSendParaBind2sfAction;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Action;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Send Para Bind2sf Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl#getSfParaBAction <em>Sf Para BAction</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl#getScAnnotation <em>Sc Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scSendParaBind2sfActionImpl#getScDetails <em>Sc Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scSendParaBind2sfActionImpl extends AbstractContainerCorrespondenceNodeImpl implements scSendParaBind2sfAction {
	/**
	 * The cached value of the '{@link #getSfParaBAction() <em>Sf Para BAction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfParaBAction()
	 * @generated
	 * @ordered
	 */
	protected Action sfParaBAction;

	/**
	 * The cached value of the '{@link #getScAnnotation() <em>Sc Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EAnnotation scAnnotation;

	/**
	 * The cached value of the '{@link #getScDetails() <em>Sc Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScDetails()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> scDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scSendParaBind2sfActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_SEND_PARA_BIND2SF_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfParaBAction() {
		if (sfParaBAction != null && ((EObject)sfParaBAction).eIsProxy()) {
			InternalEObject oldSfParaBAction = (InternalEObject)sfParaBAction;
			sfParaBAction = (Action)eResolveProxy(oldSfParaBAction);
			if (sfParaBAction != oldSfParaBAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION, oldSfParaBAction, sfParaBAction));
			}
		}
		return sfParaBAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfParaBAction() {
		return sfParaBAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfParaBAction(Action newSfParaBAction) {
		Action oldSfParaBAction = sfParaBAction;
		sfParaBAction = newSfParaBAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION, oldSfParaBAction, sfParaBAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getScAnnotation() {
		if (scAnnotation != null && scAnnotation.eIsProxy()) {
			InternalEObject oldScAnnotation = (InternalEObject)scAnnotation;
			scAnnotation = (EAnnotation)eResolveProxy(oldScAnnotation);
			if (scAnnotation != oldScAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION, oldScAnnotation, scAnnotation));
			}
		}
		return scAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetScAnnotation() {
		return scAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAnnotation(EAnnotation newScAnnotation) {
		EAnnotation oldScAnnotation = scAnnotation;
		scAnnotation = newScAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION, oldScAnnotation, scAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getScDetails() {
		if (scDetails != null && ((EObject)scDetails).eIsProxy()) {
			InternalEObject oldScDetails = (InternalEObject)scDetails;
			scDetails = (Map.Entry<String, String>)eResolveProxy(oldScDetails);
			if (scDetails != oldScDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS, oldScDetails, scDetails));
			}
		}
		return scDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetScDetails() {
		return scDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScDetails(Map.Entry<String, String> newScDetails) {
		Map.Entry<String, String> oldScDetails = scDetails;
		scDetails = newScDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS, oldScDetails, scDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION:
				if (resolve) return getSfParaBAction();
				return basicGetSfParaBAction();
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION:
				if (resolve) return getScAnnotation();
				return basicGetScAnnotation();
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS:
				if (resolve) return getScDetails();
				return basicGetScDetails();
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
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION:
				setSfParaBAction((Action)newValue);
				return;
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION:
				setScAnnotation((EAnnotation)newValue);
				return;
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS:
				setScDetails((Map.Entry<String, String>)newValue);
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
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION:
				setSfParaBAction((Action)null);
				return;
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION:
				setScAnnotation((EAnnotation)null);
				return;
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS:
				setScDetails((Map.Entry<String, String>)null);
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
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SF_PARA_BACTION:
				return sfParaBAction != null;
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_ANNOTATION:
				return scAnnotation != null;
			case BehaviorPackage.SC_SEND_PARA_BIND2SF_ACTION__SC_DETAILS:
				return scDetails != null;
		}
		return super.eIsSet(featureID);
	}

} //scSendParaBind2sfActionImpl
