/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.EntryPointImpl#getStateEntryPoint <em>State Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryPointImpl extends VertexImpl implements EntryPoint {
	/**
	 * The cached value of the '{@link #getStateEntryPoint() <em>State Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected StateEntryPoint stateEntryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryPoint getStateEntryPoint() {
		if (stateEntryPoint != null && stateEntryPoint.eIsProxy()) {
			InternalEObject oldStateEntryPoint = (InternalEObject)stateEntryPoint;
			stateEntryPoint = (StateEntryPoint)eResolveProxy(oldStateEntryPoint);
			if (stateEntryPoint != oldStateEntryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT, oldStateEntryPoint, stateEntryPoint));
			}
		}
		return stateEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryPoint basicGetStateEntryPoint() {
		return stateEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateEntryPoint(StateEntryPoint newStateEntryPoint, NotificationChain msgs) {
		StateEntryPoint oldStateEntryPoint = stateEntryPoint;
		stateEntryPoint = newStateEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT, oldStateEntryPoint, newStateEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateEntryPoint(StateEntryPoint newStateEntryPoint) {
		if (newStateEntryPoint != stateEntryPoint) {
			NotificationChain msgs = null;
			if (stateEntryPoint != null)
				msgs = ((InternalEObject)stateEntryPoint).eInverseRemove(this, RealtimestatechartPackage.STATE_ENTRY_POINT__ENTRY_POINTS, StateEntryPoint.class, msgs);
			if (newStateEntryPoint != null)
				msgs = ((InternalEObject)newStateEntryPoint).eInverseAdd(this, RealtimestatechartPackage.STATE_ENTRY_POINT__ENTRY_POINTS, StateEntryPoint.class, msgs);
			msgs = basicSetStateEntryPoint(newStateEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT, newStateEntryPoint, newStateEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT:
				if (stateEntryPoint != null)
					msgs = ((InternalEObject)stateEntryPoint).eInverseRemove(this, RealtimestatechartPackage.STATE_ENTRY_POINT__ENTRY_POINTS, StateEntryPoint.class, msgs);
				return basicSetStateEntryPoint((StateEntryPoint)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT:
				return basicSetStateEntryPoint(null, msgs);
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
			case RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT:
				if (resolve) return getStateEntryPoint();
				return basicGetStateEntryPoint();
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
			case RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT:
				setStateEntryPoint((StateEntryPoint)newValue);
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
			case RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT:
				setStateEntryPoint((StateEntryPoint)null);
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
			case RealtimestatechartPackage.ENTRY_POINT__STATE_ENTRY_POINT:
				return stateEntryPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointImpl
