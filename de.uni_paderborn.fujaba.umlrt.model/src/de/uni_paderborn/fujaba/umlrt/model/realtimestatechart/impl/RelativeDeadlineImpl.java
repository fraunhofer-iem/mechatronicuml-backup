/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Deadline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.RelativeDeadlineImpl#getUMLRealtimeTransition <em>UML Realtime Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeDeadlineImpl extends DeadlineImpl implements RelativeDeadline {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeDeadlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.RELATIVE_DEADLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getUMLRealtimeTransition() {
		if (eContainerFeatureID() != RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION) return null;
		return (Transition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeTransition(Transition newUMLRealtimeTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUMLRealtimeTransition, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeTransition(Transition newUMLRealtimeTransition) {
		if (newUMLRealtimeTransition != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION && newUMLRealtimeTransition != null)) {
			if (EcoreUtil.isAncestor(this, newUMLRealtimeTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUMLRealtimeTransition != null)
				msgs = ((InternalEObject)newUMLRealtimeTransition).eInverseAdd(this, RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, Transition.class, msgs);
			msgs = basicSetUMLRealtimeTransition(newUMLRealtimeTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, newUMLRealtimeTransition, newUMLRealtimeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUMLRealtimeTransition((Transition)otherEnd, msgs);
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
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				return basicSetUMLRealtimeTransition(null, msgs);
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
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, Transition.class, msgs);
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
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				return getUMLRealtimeTransition();
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
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				setUMLRealtimeTransition((Transition)newValue);
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
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				setUMLRealtimeTransition((Transition)null);
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
			case RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION:
				return getUMLRealtimeTransition() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelativeDeadlineImpl
