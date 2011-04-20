/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl;
import de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.impl.RealtimeStatechartImpl#getTmpContainer <em>Tmp Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealtimeStatechartImpl extends FujabaRealtimeStatechartImpl implements RealtimeStatechart {
	/**
	 * The cached value of the '{@link #getTmpContainer() <em>Tmp Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmpContainer()
	 * @generated
	 * @ordered
	 */
	protected EObject tmpContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimeStatechartPackage.Literals.REALTIME_STATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTmpContainer() {
		return tmpContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTmpContainer(EObject newTmpContainer, NotificationChain msgs) {
		EObject oldTmpContainer = tmpContainer;
		tmpContainer = newTmpContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER, oldTmpContainer, newTmpContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmpContainer(EObject newTmpContainer) {
		if (newTmpContainer != tmpContainer) {
			NotificationChain msgs = null;
			if (tmpContainer != null)
				msgs = ((InternalEObject)tmpContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER, null, msgs);
			if (newTmpContainer != null)
				msgs = ((InternalEObject)newTmpContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER, null, msgs);
			msgs = basicSetTmpContainer(newTmpContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER, newTmpContainer, newTmpContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER:
				return basicSetTmpContainer(null, msgs);
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
			case RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER:
				return getTmpContainer();
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
			case RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER:
				setTmpContainer((EObject)newValue);
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
			case RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER:
				setTmpContainer((EObject)null);
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
			case RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER:
				return tmpContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //RealtimeStatechartImpl
