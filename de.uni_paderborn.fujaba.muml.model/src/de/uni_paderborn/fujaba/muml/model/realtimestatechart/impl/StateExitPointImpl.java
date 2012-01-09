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
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Exit Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateExitPointImpl#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateExitPointImpl#getExitPoint <em>Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateExitPointImpl extends VertexImpl implements StateExitPoint {
	/**
	 * The cached value of the '{@link #getExitPoint() <em>Exit Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitPoint()
	 * @generated
	 * @ordered
	 */
	protected ExitPoint exitPoint;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateExitPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.STATE_EXIT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint getExitPoint() {
		if (exitPoint != null && exitPoint.eIsProxy()) {
			InternalEObject oldExitPoint = (InternalEObject)exitPoint;
			exitPoint = (ExitPoint)eResolveProxy(oldExitPoint);
			if (exitPoint != oldExitPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINT, oldExitPoint, exitPoint));
			}
		}
		return exitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPoint basicGetExitPoint() {
		return exitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitPoint(ExitPoint newExitPoint) {
		ExitPoint oldExitPoint = exitPoint;
		exitPoint = newExitPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINT, oldExitPoint, exitPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != RealtimestatechartPackage.STATE_EXIT_POINT__STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, RealtimestatechartPackage.STATE_EXIT_POINT__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.STATE_EXIT_POINT__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, RealtimestatechartPackage.STATE__STATE_EXIT_POINTS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE_EXIT_POINT__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				return basicSetState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__STATE_EXIT_POINTS, State.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				return getState();
			case RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINT:
				if (resolve) return getExitPoint();
				return basicGetExitPoint();
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
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				setState((State)newValue);
				return;
			case RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINT:
				setExitPoint((ExitPoint)newValue);
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
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				setState((State)null);
				return;
			case RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINT:
				setExitPoint((ExitPoint)null);
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
			case RealtimestatechartPackage.STATE_EXIT_POINT__STATE:
				return getState() != null;
			case RealtimestatechartPackage.STATE_EXIT_POINT__EXIT_POINT:
				return exitPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //StateExitPointImpl
