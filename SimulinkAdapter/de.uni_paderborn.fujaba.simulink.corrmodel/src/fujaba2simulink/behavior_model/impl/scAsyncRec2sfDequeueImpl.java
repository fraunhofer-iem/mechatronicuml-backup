/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scAsyncRec2sfDequeue;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Async Rec2sf Dequeue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAsyncRec2sfDequeueImpl#getScDetailsDequeue <em>Sc Details Dequeue</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAsyncRec2sfDequeueImpl#getScAction <em>Sc Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scAsyncRec2sfDequeueImpl extends AbstractContainerCorrespondenceNodeImpl implements scAsyncRec2sfDequeue {
	/**
	 * The cached value of the '{@link #getScDetailsDequeue() <em>Sc Details Dequeue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScDetailsDequeue()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> scDetailsDequeue;

	/**
	 * The cached value of the '{@link #getScAction() <em>Sc Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAction()
	 * @generated
	 * @ordered
	 */
	protected Action scAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scAsyncRec2sfDequeueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_ASYNC_REC2SF_DEQUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getScDetailsDequeue() {
		if (scDetailsDequeue != null && ((EObject)scDetailsDequeue).eIsProxy()) {
			InternalEObject oldScDetailsDequeue = (InternalEObject)scDetailsDequeue;
			scDetailsDequeue = (Map.Entry<String, String>)eResolveProxy(oldScDetailsDequeue);
			if (scDetailsDequeue != oldScDetailsDequeue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE, oldScDetailsDequeue, scDetailsDequeue));
			}
		}
		return scDetailsDequeue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetScDetailsDequeue() {
		return scDetailsDequeue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScDetailsDequeue(Map.Entry<String, String> newScDetailsDequeue) {
		Map.Entry<String, String> oldScDetailsDequeue = scDetailsDequeue;
		scDetailsDequeue = newScDetailsDequeue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE, oldScDetailsDequeue, scDetailsDequeue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getScAction() {
		if (scAction != null && ((EObject)scAction).eIsProxy()) {
			InternalEObject oldScAction = (InternalEObject)scAction;
			scAction = (Action)eResolveProxy(oldScAction);
			if (scAction != oldScAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION, oldScAction, scAction));
			}
		}
		return scAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetScAction() {
		return scAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAction(Action newScAction) {
		Action oldScAction = scAction;
		scAction = newScAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION, oldScAction, scAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE:
				if (resolve) return getScDetailsDequeue();
				return basicGetScDetailsDequeue();
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION:
				if (resolve) return getScAction();
				return basicGetScAction();
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
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE:
				setScDetailsDequeue((Map.Entry<String, String>)newValue);
				return;
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION:
				setScAction((Action)newValue);
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
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE:
				setScDetailsDequeue((Map.Entry<String, String>)null);
				return;
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION:
				setScAction((Action)null);
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
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_DETAILS_DEQUEUE:
				return scDetailsDequeue != null;
			case Behavior_modelPackage.SC_ASYNC_REC2SF_DEQUEUE__SC_ACTION:
				return scAction != null;
		}
		return super.eIsSet(featureID);
	}

} //scAsyncRec2sfDequeueImpl
