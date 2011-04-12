/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Interface Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInterfaceStatechartImpl#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLInterfaceStatechartImpl extends AbstractStatechartImpl implements UMLInterfaceStatechart {
	/**
	 * The cached value of the '{@link #getUMLRealtimeStatechart() <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractStatechart uMLRealtimeStatechart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLInterfaceStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_INTERFACE_STATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatechart getUMLRealtimeStatechart() {
		if (uMLRealtimeStatechart != null && uMLRealtimeStatechart.eIsProxy()) {
			InternalEObject oldUMLRealtimeStatechart = (InternalEObject)uMLRealtimeStatechart;
			uMLRealtimeStatechart = (AbstractStatechart)eResolveProxy(oldUMLRealtimeStatechart);
			if (uMLRealtimeStatechart != oldUMLRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
			}
		}
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatechart basicGetUMLRealtimeStatechart() {
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStatechart(AbstractStatechart newUMLRealtimeStatechart) {
		AbstractStatechart oldUMLRealtimeStatechart = uMLRealtimeStatechart;
		uMLRealtimeStatechart = newUMLRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART:
				if (resolve) return getUMLRealtimeStatechart();
				return basicGetUMLRealtimeStatechart();
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
			case RealtimestatechartPackage.UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((AbstractStatechart)newValue);
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
			case RealtimestatechartPackage.UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((AbstractStatechart)null);
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
			case RealtimestatechartPackage.UML_INTERFACE_STATECHART__UML_REALTIME_STATECHART:
				return uMLRealtimeStatechart != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLInterfaceStatechartImpl
