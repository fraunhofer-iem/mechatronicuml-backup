/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl#getRealtimeStatechart <em>Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioralElementImpl extends EObjectImpl implements BehavioralElement {
	/**
	 * The cached value of the '{@link #getRealtimeStatechart() <em>Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractRealtimeStatechart realtimeStatechart;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BEHAVIORAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getRealtimeStatechart() {
		if (realtimeStatechart != null && realtimeStatechart.eIsProxy()) {
			InternalEObject oldRealtimeStatechart = (InternalEObject)realtimeStatechart;
			realtimeStatechart = (AbstractRealtimeStatechart)eResolveProxy(oldRealtimeStatechart);
			if (realtimeStatechart != oldRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART, oldRealtimeStatechart, realtimeStatechart));
			}
		}
		return realtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart basicGetRealtimeStatechart() {
		return realtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtimeStatechart(AbstractRealtimeStatechart newRealtimeStatechart) {
		AbstractRealtimeStatechart oldRealtimeStatechart = realtimeStatechart;
		realtimeStatechart = newRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART, oldRealtimeStatechart, realtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART:
				if (resolve) return getRealtimeStatechart();
				return basicGetRealtimeStatechart();
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
			case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART:
				setRealtimeStatechart((AbstractRealtimeStatechart)newValue);
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
			case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART:
				setRealtimeStatechart((AbstractRealtimeStatechart)null);
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
			case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART:
				return realtimeStatechart != null;
		}
		return super.eIsSet(featureID);
	}

} //BehavioralElementImpl
