/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.AtomicComponentImpl#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicComponentImpl extends ComponentImpl implements AtomicComponent {
	/**
	 * The cached value of the '{@link #getUMLRealtimeStatechart() <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected Statechart uMLRealtimeStatechart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.ATOMIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart getUMLRealtimeStatechart() {
		if (uMLRealtimeStatechart != null && uMLRealtimeStatechart.eIsProxy()) {
			InternalEObject oldUMLRealtimeStatechart = (InternalEObject)uMLRealtimeStatechart;
			uMLRealtimeStatechart = (Statechart)eResolveProxy(oldUMLRealtimeStatechart);
			if (uMLRealtimeStatechart != oldUMLRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
			}
		}
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart basicGetUMLRealtimeStatechart() {
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStatechart(Statechart newUMLRealtimeStatechart) {
		Statechart oldUMLRealtimeStatechart = uMLRealtimeStatechart;
		uMLRealtimeStatechart = newUMLRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART:
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
			case ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((Statechart)newValue);
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
			case ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((Statechart)null);
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
			case ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART:
				return uMLRealtimeStatechart != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioralElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART: return CorePackage.BEHAVIORAL_ELEMENT__UML_REALTIME_STATECHART;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioralElement.class) {
			switch (baseFeatureID) {
				case CorePackage.BEHAVIORAL_ELEMENT__UML_REALTIME_STATECHART: return ComponentPackage.ATOMIC_COMPONENT__UML_REALTIME_STATECHART;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AtomicComponentImpl
