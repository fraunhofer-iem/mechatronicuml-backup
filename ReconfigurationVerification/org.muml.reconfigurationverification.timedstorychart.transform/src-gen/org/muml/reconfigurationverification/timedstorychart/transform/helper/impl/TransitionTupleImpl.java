/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TransitionTupleImpl#getSending <em>Sending</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TransitionTupleImpl#getReceiving <em>Receiving</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionTupleImpl extends EObjectImpl implements TransitionTuple {
	/**
	 * The cached value of the '{@link #getSending() <em>Sending</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSending()
	 * @generated
	 * @ordered
	 */
	protected Transition sending;

	/**
	 * The cached value of the '{@link #getReceiving() <em>Receiving</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiving()
	 * @generated
	 * @ordered
	 */
	protected Transition receiving;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperPackage.Literals.TRANSITION_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSending() {
		if (sending != null && sending.eIsProxy()) {
			InternalEObject oldSending = (InternalEObject)sending;
			sending = (Transition)eResolveProxy(oldSending);
			if (sending != oldSending) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HelperPackage.TRANSITION_TUPLE__SENDING, oldSending, sending));
			}
		}
		return sending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSending() {
		return sending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSending(Transition newSending) {
		Transition oldSending = sending;
		sending = newSending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelperPackage.TRANSITION_TUPLE__SENDING, oldSending, sending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getReceiving() {
		if (receiving != null && receiving.eIsProxy()) {
			InternalEObject oldReceiving = (InternalEObject)receiving;
			receiving = (Transition)eResolveProxy(oldReceiving);
			if (receiving != oldReceiving) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HelperPackage.TRANSITION_TUPLE__RECEIVING, oldReceiving, receiving));
			}
		}
		return receiving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetReceiving() {
		return receiving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiving(Transition newReceiving) {
		Transition oldReceiving = receiving;
		receiving = newReceiving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelperPackage.TRANSITION_TUPLE__RECEIVING, oldReceiving, receiving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HelperPackage.TRANSITION_TUPLE__SENDING:
				if (resolve) return getSending();
				return basicGetSending();
			case HelperPackage.TRANSITION_TUPLE__RECEIVING:
				if (resolve) return getReceiving();
				return basicGetReceiving();
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
			case HelperPackage.TRANSITION_TUPLE__SENDING:
				setSending((Transition)newValue);
				return;
			case HelperPackage.TRANSITION_TUPLE__RECEIVING:
				setReceiving((Transition)newValue);
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
			case HelperPackage.TRANSITION_TUPLE__SENDING:
				setSending((Transition)null);
				return;
			case HelperPackage.TRANSITION_TUPLE__RECEIVING:
				setReceiving((Transition)null);
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
			case HelperPackage.TRANSITION_TUPLE__SENDING:
				return sending != null;
			case HelperPackage.TRANSITION_TUPLE__RECEIVING:
				return receiving != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionTupleImpl
