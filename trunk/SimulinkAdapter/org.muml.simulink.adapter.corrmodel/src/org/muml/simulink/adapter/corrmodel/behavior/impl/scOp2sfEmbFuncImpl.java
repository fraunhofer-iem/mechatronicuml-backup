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
import org.muml.pim.behavior.Operation;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.scOp2sfEmbFunc;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.EmbeddedFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Op2sf Emb Func</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl#getScOperation <em>Sc Operation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl#getSfEmbFunc <em>Sf Emb Func</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl#getScAnnotation <em>Sc Annotation</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scOp2sfEmbFuncImpl#getScDetails <em>Sc Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scOp2sfEmbFuncImpl extends AbstractContainerCorrespondenceNodeImpl implements scOp2sfEmbFunc {
	/**
	 * The cached value of the '{@link #getScOperation() <em>Sc Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation scOperation;

	/**
	 * The cached value of the '{@link #getSfEmbFunc() <em>Sf Emb Func</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfEmbFunc()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedFunction sfEmbFunc;

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
	protected scOp2sfEmbFuncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_OP2SF_EMB_FUNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getScOperation() {
		if (scOperation != null && scOperation.eIsProxy()) {
			InternalEObject oldScOperation = (InternalEObject)scOperation;
			scOperation = (Operation)eResolveProxy(oldScOperation);
			if (scOperation != oldScOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_OPERATION, oldScOperation, scOperation));
			}
		}
		return scOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetScOperation() {
		return scOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScOperation(Operation newScOperation) {
		Operation oldScOperation = scOperation;
		scOperation = newScOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_OPERATION, oldScOperation, scOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedFunction getSfEmbFunc() {
		if (sfEmbFunc != null && ((EObject)sfEmbFunc).eIsProxy()) {
			InternalEObject oldSfEmbFunc = (InternalEObject)sfEmbFunc;
			sfEmbFunc = (EmbeddedFunction)eResolveProxy(oldSfEmbFunc);
			if (sfEmbFunc != oldSfEmbFunc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_OP2SF_EMB_FUNC__SF_EMB_FUNC, oldSfEmbFunc, sfEmbFunc));
			}
		}
		return sfEmbFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedFunction basicGetSfEmbFunc() {
		return sfEmbFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfEmbFunc(EmbeddedFunction newSfEmbFunc) {
		EmbeddedFunction oldSfEmbFunc = sfEmbFunc;
		sfEmbFunc = newSfEmbFunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_OP2SF_EMB_FUNC__SF_EMB_FUNC, oldSfEmbFunc, sfEmbFunc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_ANNOTATION, oldScAnnotation, scAnnotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_ANNOTATION, oldScAnnotation, scAnnotation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_DETAILS, oldScDetails, scDetails));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_DETAILS, oldScDetails, scDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_OPERATION:
				if (resolve) return getScOperation();
				return basicGetScOperation();
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SF_EMB_FUNC:
				if (resolve) return getSfEmbFunc();
				return basicGetSfEmbFunc();
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_ANNOTATION:
				if (resolve) return getScAnnotation();
				return basicGetScAnnotation();
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_DETAILS:
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
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_OPERATION:
				setScOperation((Operation)newValue);
				return;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SF_EMB_FUNC:
				setSfEmbFunc((EmbeddedFunction)newValue);
				return;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_ANNOTATION:
				setScAnnotation((EAnnotation)newValue);
				return;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_DETAILS:
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
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_OPERATION:
				setScOperation((Operation)null);
				return;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SF_EMB_FUNC:
				setSfEmbFunc((EmbeddedFunction)null);
				return;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_ANNOTATION:
				setScAnnotation((EAnnotation)null);
				return;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_DETAILS:
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
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_OPERATION:
				return scOperation != null;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SF_EMB_FUNC:
				return sfEmbFunc != null;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_ANNOTATION:
				return scAnnotation != null;
			case BehaviorPackage.SC_OP2SF_EMB_FUNC__SC_DETAILS:
				return scDetails != null;
		}
		return super.eIsSet(featureID);
	}

} //scOp2sfEmbFuncImpl
