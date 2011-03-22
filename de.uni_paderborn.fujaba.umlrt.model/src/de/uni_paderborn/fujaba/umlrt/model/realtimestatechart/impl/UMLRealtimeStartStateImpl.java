/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStartState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Realtime Start State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStartStateImpl#getUMLRealtimeStartStateRev <em>UML Realtime Start State Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLRealtimeStartStateImpl extends UMLRealtimeStateImpl implements UMLRealtimeStartState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeStartStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_REALTIME_START_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStartStateRev() {
		if (eContainerFeatureID() != RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV) return null;
		return (UMLRealtimeStatechart)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeStartStateRev(UMLRealtimeStatechart newUMLRealtimeStartStateRev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUMLRealtimeStartStateRev, RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStartStateRev(UMLRealtimeStatechart newUMLRealtimeStartStateRev) {
		if (newUMLRealtimeStartStateRev != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV && newUMLRealtimeStartStateRev != null)) {
			if (EcoreUtil.isAncestor(this, newUMLRealtimeStartStateRev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUMLRealtimeStartStateRev != null)
				msgs = ((InternalEObject)newUMLRealtimeStartStateRev).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE, UMLRealtimeStatechart.class, msgs);
			msgs = basicSetUMLRealtimeStartStateRev(newUMLRealtimeStartStateRev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV, newUMLRealtimeStartStateRev, newUMLRealtimeStartStateRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeState getNextState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeStartState newStartState) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUMLRealtimeStartStateRev((UMLRealtimeStatechart)otherEnd, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				return basicSetUMLRealtimeStartStateRev(null, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE, UMLRealtimeStatechart.class, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				return getUMLRealtimeStartStateRev();
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
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				setUMLRealtimeStartStateRev((UMLRealtimeStatechart)newValue);
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
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				setUMLRealtimeStartStateRev((UMLRealtimeStatechart)null);
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
			case RealtimestatechartPackage.UML_REALTIME_START_STATE__UML_REALTIME_START_STATE_REV:
				return getUMLRealtimeStartStateRev() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.UML_REALTIME_START_STATE___GET_NEXT_STATE:
				return getNextState();
			case RealtimestatechartPackage.UML_REALTIME_START_STATE___CLONE__UMLREALTIMESTATECHART_UMLREALTIMESTARTSTATE:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLRealtimeStartState)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UMLRealtimeStartStateImpl
