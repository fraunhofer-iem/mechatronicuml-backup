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
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.umlrt.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getRealtimeStatechart <em>Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getAdaptationRealtimeStatechart <em>Adaptation Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.DiscretePortSpecificationImpl#getProvided <em>Provided</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscretePortSpecificationImpl extends PortSpecificationImpl implements DiscretePortSpecification {
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
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Role refines;

	/**
	 * The cached value of the '{@link #getAdaptationRealtimeStatechart() <em>Adaptation Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractRealtimeStatechart adaptationRealtimeStatechart;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface required;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface provided;

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
	public AbstractRealtimeStatechart getRealtimeStatechart() {
		if (realtimeStatechart != null && realtimeStatechart.eIsProxy()) {
			InternalEObject oldRealtimeStatechart = (InternalEObject)realtimeStatechart;
			realtimeStatechart = (AbstractRealtimeStatechart)eResolveProxy(oldRealtimeStatechart);
			if (realtimeStatechart != oldRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART, oldRealtimeStatechart, realtimeStatechart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART, oldRealtimeStatechart, realtimeStatechart));
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
	public AbstractRealtimeStatechart getAdaptationRealtimeStatechart() {
		if (adaptationRealtimeStatechart != null && adaptationRealtimeStatechart.eIsProxy()) {
			InternalEObject oldAdaptationRealtimeStatechart = (InternalEObject)adaptationRealtimeStatechart;
			adaptationRealtimeStatechart = (AbstractRealtimeStatechart)eResolveProxy(oldAdaptationRealtimeStatechart);
			if (adaptationRealtimeStatechart != oldAdaptationRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART, oldAdaptationRealtimeStatechart, adaptationRealtimeStatechart));
			}
		}
		return adaptationRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart basicGetAdaptationRealtimeStatechart() {
		return adaptationRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationRealtimeStatechart(AbstractRealtimeStatechart newAdaptationRealtimeStatechart) {
		AbstractRealtimeStatechart oldAdaptationRealtimeStatechart = adaptationRealtimeStatechart;
		adaptationRealtimeStatechart = newAdaptationRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART, oldAdaptationRealtimeStatechart, adaptationRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (MessageInterface)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(MessageInterface newRequired) {
		MessageInterface oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getProvided() {
		if (provided != null && provided.eIsProxy()) {
			InternalEObject oldProvided = (InternalEObject)provided;
			provided = (MessageInterface)eResolveProxy(oldProvided);
			if (provided != oldProvided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__PROVIDED, oldProvided, provided));
			}
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(MessageInterface newProvided) {
		MessageInterface oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__PROVIDED, oldProvided, provided));
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				if (resolve) return getRealtimeStatechart();
				return basicGetRealtimeStatechart();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART:
				if (resolve) return getAdaptationRealtimeStatechart();
				return basicGetAdaptationRealtimeStatechart();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__PROVIDED:
				if (resolve) return getProvided();
				return basicGetProvided();
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				setRealtimeStatechart((AbstractRealtimeStatechart)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				setRefines((Role)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART:
				setAdaptationRealtimeStatechart((AbstractRealtimeStatechart)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REQUIRED:
				setRequired((MessageInterface)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__PROVIDED:
				setProvided((MessageInterface)newValue);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				setRealtimeStatechart((AbstractRealtimeStatechart)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				setRefines((Role)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART:
				setAdaptationRealtimeStatechart((AbstractRealtimeStatechart)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REQUIRED:
				setRequired((MessageInterface)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__PROVIDED:
				setProvided((MessageInterface)null);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				return realtimeStatechart != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return refines != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_REALTIME_STATECHART:
				return adaptationRealtimeStatechart != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REQUIRED:
				return required != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__PROVIDED:
				return provided != null;
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
				case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART: return CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART;
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
				case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART: return ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscretePortSpecificationImpl
