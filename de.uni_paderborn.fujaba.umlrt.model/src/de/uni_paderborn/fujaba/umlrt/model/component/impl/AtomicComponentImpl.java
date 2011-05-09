/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.AtomicComponentImpl#getRealtimeStatechart <em>Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicComponentImpl extends ComponentImpl implements AtomicComponent {
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
	public AbstractRealtimeStatechart getRealtimeStatechart() {
		if (realtimeStatechart != null && realtimeStatechart.eIsProxy()) {
			InternalEObject oldRealtimeStatechart = (InternalEObject)realtimeStatechart;
			realtimeStatechart = (AbstractRealtimeStatechart)eResolveProxy(oldRealtimeStatechart);
			if (realtimeStatechart != oldRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART, oldRealtimeStatechart, realtimeStatechart));
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
	public NotificationChain basicSetRealtimeStatechart(AbstractRealtimeStatechart newRealtimeStatechart, NotificationChain msgs) {
		AbstractRealtimeStatechart oldRealtimeStatechart = realtimeStatechart;
		realtimeStatechart = newRealtimeStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART, oldRealtimeStatechart, newRealtimeStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtimeStatechart(AbstractRealtimeStatechart newRealtimeStatechart) {
		if (newRealtimeStatechart != realtimeStatechart) {
			NotificationChain msgs = null;
			if (realtimeStatechart != null)
				msgs = ((InternalEObject)realtimeStatechart).eInverseRemove(this, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, AbstractRealtimeStatechart.class, msgs);
			if (newRealtimeStatechart != null)
				msgs = ((InternalEObject)newRealtimeStatechart).eInverseAdd(this, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, AbstractRealtimeStatechart.class, msgs);
			msgs = basicSetRealtimeStatechart(newRealtimeStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART, newRealtimeStatechart, newRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART:
				if (realtimeStatechart != null)
					msgs = ((InternalEObject)realtimeStatechart).eInverseRemove(this, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, AbstractRealtimeStatechart.class, msgs);
				return basicSetRealtimeStatechart((AbstractRealtimeStatechart)otherEnd, msgs);
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
			case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART:
				return basicSetRealtimeStatechart(null, msgs);
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
			case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART:
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
			case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART:
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
			case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART:
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
			case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART:
				return realtimeStatechart != null;
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
				case ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART: return CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART;
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
				case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART: return ComponentPackage.ATOMIC_COMPONENT__REALTIME_STATECHART;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AtomicComponentImpl
