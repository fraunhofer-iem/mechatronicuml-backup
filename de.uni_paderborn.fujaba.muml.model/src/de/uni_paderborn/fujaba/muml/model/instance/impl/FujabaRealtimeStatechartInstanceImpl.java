/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fujaba Realtime Statechart Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.FujabaRealtimeStatechartInstanceImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.FujabaRealtimeStatechartInstanceImpl#getEmbeddedSubStatecharts <em>Embedded Sub Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.FujabaRealtimeStatechartInstanceImpl#getReferencedSubStatecharts <em>Referenced Sub Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.FujabaRealtimeStatechartInstanceImpl#getAllSubStatecharts <em>All Sub Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.FujabaRealtimeStatechartInstanceImpl#getParentStatechart <em>Parent Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FujabaRealtimeStatechartInstanceImpl extends BehaviorInstanceImpl implements FujabaRealtimeStatechartInstance {
	/**
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected FujabaRealtimeStatechart statechart;

	/**
	 * The cached value of the '{@link #getEmbeddedSubStatecharts() <em>Embedded Sub Statecharts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedSubStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<FujabaRealtimeStatechartInstance> embeddedSubStatecharts;

	/**
	 * The cached value of the '{@link #getReferencedSubStatecharts() <em>Referenced Sub Statecharts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedSubStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<FujabaRealtimeStatechartInstance> referencedSubStatecharts;

	/**
	 * The cached setting delegate for the '{@link #getAllSubStatecharts() <em>All Sub Statecharts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSubStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_SUB_STATECHARTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getParentStatechart() <em>Parent Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStatechart()
	 * @generated
	 * @ordered
	 */
	protected FujabaRealtimeStatechartInstance parentStatechart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FujabaRealtimeStatechartInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FujabaRealtimeStatechart getStatechart() {
		if (statechart != null && statechart.eIsProxy()) {
			InternalEObject oldStatechart = (InternalEObject)statechart;
			statechart = (FujabaRealtimeStatechart)eResolveProxy(oldStatechart);
			if (statechart != oldStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART, oldStatechart, statechart));
			}
		}
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FujabaRealtimeStatechart basicGetStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(FujabaRealtimeStatechart newStatechart) {
		FujabaRealtimeStatechart oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART, oldStatechart, statechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FujabaRealtimeStatechartInstance> getEmbeddedSubStatecharts() {
		if (embeddedSubStatecharts == null) {
			embeddedSubStatecharts = new EObjectWithInverseResolvingEList<FujabaRealtimeStatechartInstance>(FujabaRealtimeStatechartInstance.class, this, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART);
		}
		return embeddedSubStatecharts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FujabaRealtimeStatechartInstance> getReferencedSubStatecharts() {
		if (referencedSubStatecharts == null) {
			referencedSubStatecharts = new EObjectResolvingEList<FujabaRealtimeStatechartInstance>(FujabaRealtimeStatechartInstance.class, this, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS);
		}
		return referencedSubStatecharts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FujabaRealtimeStatechartInstance> getAllSubStatecharts() {
		return (EList<FujabaRealtimeStatechartInstance>)ALL_SUB_STATECHARTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FujabaRealtimeStatechartInstance getParentStatechart() {
		if (parentStatechart != null && parentStatechart.eIsProxy()) {
			InternalEObject oldParentStatechart = (InternalEObject)parentStatechart;
			parentStatechart = (FujabaRealtimeStatechartInstance)eResolveProxy(oldParentStatechart);
			if (parentStatechart != oldParentStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART, oldParentStatechart, parentStatechart));
			}
		}
		return parentStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FujabaRealtimeStatechartInstance basicGetParentStatechart() {
		return parentStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStatechart(FujabaRealtimeStatechartInstance newParentStatechart, NotificationChain msgs) {
		FujabaRealtimeStatechartInstance oldParentStatechart = parentStatechart;
		parentStatechart = newParentStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART, oldParentStatechart, newParentStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStatechart(FujabaRealtimeStatechartInstance newParentStatechart) {
		if (newParentStatechart != parentStatechart) {
			NotificationChain msgs = null;
			if (parentStatechart != null)
				msgs = ((InternalEObject)parentStatechart).eInverseRemove(this, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS, FujabaRealtimeStatechartInstance.class, msgs);
			if (newParentStatechart != null)
				msgs = ((InternalEObject)newParentStatechart).eInverseAdd(this, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS, FujabaRealtimeStatechartInstance.class, msgs);
			msgs = basicSetParentStatechart(newParentStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART, newParentStatechart, newParentStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedSubStatecharts()).basicAdd(otherEnd, msgs);
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART:
				if (parentStatechart != null)
					msgs = ((InternalEObject)parentStatechart).eInverseRemove(this, InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS, FujabaRealtimeStatechartInstance.class, msgs);
				return basicSetParentStatechart((FujabaRealtimeStatechartInstance)otherEnd, msgs);
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
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS:
				return ((InternalEList<?>)getEmbeddedSubStatecharts()).basicRemove(otherEnd, msgs);
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART:
				return basicSetParentStatechart(null, msgs);
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
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART:
				if (resolve) return getStatechart();
				return basicGetStatechart();
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS:
				return getEmbeddedSubStatecharts();
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS:
				return getReferencedSubStatecharts();
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS:
				return getAllSubStatecharts();
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART:
				if (resolve) return getParentStatechart();
				return basicGetParentStatechart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART:
				setStatechart((FujabaRealtimeStatechart)newValue);
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS:
				getEmbeddedSubStatecharts().clear();
				getEmbeddedSubStatecharts().addAll((Collection<? extends FujabaRealtimeStatechartInstance>)newValue);
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS:
				getReferencedSubStatecharts().clear();
				getReferencedSubStatecharts().addAll((Collection<? extends FujabaRealtimeStatechartInstance>)newValue);
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS:
				getAllSubStatecharts().clear();
				getAllSubStatecharts().addAll((Collection<? extends FujabaRealtimeStatechartInstance>)newValue);
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART:
				setParentStatechart((FujabaRealtimeStatechartInstance)newValue);
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
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART:
				setStatechart((FujabaRealtimeStatechart)null);
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS:
				getEmbeddedSubStatecharts().clear();
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS:
				getReferencedSubStatecharts().clear();
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS:
				getAllSubStatecharts().clear();
				return;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART:
				setParentStatechart((FujabaRealtimeStatechartInstance)null);
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
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART:
				return statechart != null;
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS:
				return embeddedSubStatecharts != null && !embeddedSubStatecharts.isEmpty();
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS:
				return referencedSubStatecharts != null && !referencedSubStatecharts.isEmpty();
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS:
				return ALL_SUB_STATECHARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART:
				return parentStatechart != null;
		}
		return super.eIsSet(featureID);
	}

} //FujabaRealtimeStatechartInstanceImpl
