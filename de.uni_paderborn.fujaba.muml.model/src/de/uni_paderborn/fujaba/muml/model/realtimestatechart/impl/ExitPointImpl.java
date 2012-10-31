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

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.ExitPointImpl#getStateExitPoint <em>State Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitPointImpl extends VertexImpl implements ExitPoint {
	/**
	 * The cached value of the '{@link #getStateExitPoint() <em>State Exit Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateExitPoint()
	 * @generated
	 * @ordered
	 */
	protected StateExitPoint stateExitPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.EXIT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExitPoint getStateExitPoint() {
		if (stateExitPoint != null && stateExitPoint.eIsProxy()) {
			InternalEObject oldStateExitPoint = (InternalEObject)stateExitPoint;
			stateExitPoint = (StateExitPoint)eResolveProxy(oldStateExitPoint);
			if (stateExitPoint != oldStateExitPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT, oldStateExitPoint, stateExitPoint));
			}
		}
		return stateExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExitPoint basicGetStateExitPoint() {
		return stateExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateExitPoint(StateExitPoint newStateExitPoint, NotificationChain msgs) {
		StateExitPoint oldStateExitPoint = stateExitPoint;
		stateExitPoint = newStateExitPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT, oldStateExitPoint, newStateExitPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateExitPoint(StateExitPoint newStateExitPoint) {
		if (newStateExitPoint != stateExitPoint) {
			NotificationChain msgs = null;
			if (stateExitPoint != null)
				msgs = ((InternalEObject)stateExitPoint).eInverseRemove(this, RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINTS, StateExitPoint.class, msgs);
			if (newStateExitPoint != null)
				msgs = ((InternalEObject)newStateExitPoint).eInverseAdd(this, RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINTS, StateExitPoint.class, msgs);
			msgs = basicSetStateExitPoint(newStateExitPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT, newStateExitPoint, newStateExitPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT:
				if (stateExitPoint != null)
					msgs = ((InternalEObject)stateExitPoint).eInverseRemove(this, RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINTS, StateExitPoint.class, msgs);
				return basicSetStateExitPoint((StateExitPoint)otherEnd, msgs);
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
			case RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT:
				return basicSetStateExitPoint(null, msgs);
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
			case RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT:
				if (resolve) return getStateExitPoint();
				return basicGetStateExitPoint();
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
			case RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT:
				setStateExitPoint((StateExitPoint)newValue);
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
			case RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT:
				setStateExitPoint((StateExitPoint)null);
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
			case RealtimestatechartPackage.EXIT_POINT__STATE_EXIT_POINT:
				return stateExitPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //ExitPointImpl
