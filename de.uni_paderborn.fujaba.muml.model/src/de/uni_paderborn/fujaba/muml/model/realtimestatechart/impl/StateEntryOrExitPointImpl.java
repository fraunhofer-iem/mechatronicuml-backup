/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryExitPointKind;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Entry Or Exit Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateEntryOrExitPointImpl#getEntryOrExitPoint <em>Entry Or Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateEntryOrExitPointImpl extends VertexImpl implements StateEntryOrExitPoint {
	/**
	 * The cached value of the '{@link #getEntryOrExitPoint() <em>Entry Or Exit Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryOrExitPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryOrExitPoint entryOrExitPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateEntryOrExitPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.STATE_ENTRY_OR_EXIT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOrExitPoint getEntryOrExitPoint() {
		if (entryOrExitPoint != null && entryOrExitPoint.eIsProxy()) {
			InternalEObject oldEntryOrExitPoint = (InternalEObject)entryOrExitPoint;
			entryOrExitPoint = (EntryOrExitPoint)eResolveProxy(oldEntryOrExitPoint);
			if (entryOrExitPoint != oldEntryOrExitPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT, oldEntryOrExitPoint, entryOrExitPoint));
			}
		}
		return entryOrExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOrExitPoint basicGetEntryOrExitPoint() {
		return entryOrExitPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryOrExitPoint(EntryOrExitPoint newEntryOrExitPoint) {
		EntryOrExitPoint oldEntryOrExitPoint = entryOrExitPoint;
		entryOrExitPoint = newEntryOrExitPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT, oldEntryOrExitPoint, entryOrExitPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT:
				if (resolve) return getEntryOrExitPoint();
				return basicGetEntryOrExitPoint();
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
			case RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT:
				setEntryOrExitPoint((EntryOrExitPoint)newValue);
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
			case RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT:
				setEntryOrExitPoint((EntryOrExitPoint)null);
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
			case RealtimestatechartPackage.STATE_ENTRY_OR_EXIT_POINT__ENTRY_OR_EXIT_POINT:
				return entryOrExitPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //StateEntryOrExitPointImpl
