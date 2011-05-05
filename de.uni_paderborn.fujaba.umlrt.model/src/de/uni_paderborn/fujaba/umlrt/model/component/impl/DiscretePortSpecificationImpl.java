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

import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.DiscretePortSpecification;
import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscretePortSpecificationImpl extends PortSpecificationImpl implements DiscretePortSpecification {
	/**
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractRealtimeStatechart statechart;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Role refines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getStatechart() {
		if (statechart != null && statechart.eIsProxy()) {
			InternalEObject oldStatechart = (InternalEObject)statechart;
			statechart = (AbstractRealtimeStatechart)eResolveProxy(oldStatechart);
			if (statechart != oldStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART, oldStatechart, statechart));
			}
		}
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart basicGetStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(AbstractRealtimeStatechart newStatechart) {
		AbstractRealtimeStatechart oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART, oldStatechart, statechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Role)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(Role newRefines, NotificationChain msgs) {
		Role oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES, oldRefines, newRefines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Role newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject)newRefines).eInverseAdd(this, PatternPackage.ROLE__PORT, Role.class, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES, newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (refines != null)
					msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
				return basicSetRefines((Role)otherEnd, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return basicSetRefines(null, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART:
				if (resolve) return getStatechart();
				return basicGetStatechart();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART:
				setStatechart((AbstractRealtimeStatechart)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				setRefines((Role)newValue);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART:
				setStatechart((AbstractRealtimeStatechart)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				setRefines((Role)null);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART:
				return statechart != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return refines != null;
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
				case ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART: return CorePackage.BEHAVIORAL_ELEMENT__STATECHART;
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
				case CorePackage.BEHAVIORAL_ELEMENT__STATECHART: return ComponentPackage.DISCRETE_PORT_SPECIFICATION__STATECHART;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscretePortSpecificationImpl
