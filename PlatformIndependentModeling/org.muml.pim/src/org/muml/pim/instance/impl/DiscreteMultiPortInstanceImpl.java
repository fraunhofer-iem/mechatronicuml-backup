/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.common.adapter.DerivedAttributeAdapter;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Multi Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl#getLast <em>Last</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.DiscreteMultiPortInstanceImpl#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteMultiPortInstanceImpl extends DiscretePortInstanceImpl implements DiscreteMultiPortInstance {
	/**
	 * The cached value of the '{@link #getSubInteractionEndpointInstances() <em>Sub Interaction Endpoint Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInteractionEndpointInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteSingleInteractionEndpointInstance> subInteractionEndpointInstances;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected DiscreteSingleInteractionEndpointInstance first;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected DiscreteSingleInteractionEndpointInstance last;

	/**
	 * The cached setting delegate for the '{@link #getGmfSubPortInstances() <em>Gmf Sub Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfSubPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_SUB_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DiscreteMultiPortInstanceImpl() {
		super();
		DerivedAttributeAdapter adapter = new DerivedAttributeAdapter(this, InstancePackage.Literals.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES);
		adapter.addLocalDependency(ConnectorPackage.Literals.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DISCRETE_MULTI_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteSingleInteractionEndpointInstance> getSubInteractionEndpointInstances() {
		if (subInteractionEndpointInstances == null) {
			subInteractionEndpointInstances = new EObjectWithInverseResolvingEList<DiscreteSingleInteractionEndpointInstance>(DiscreteSingleInteractionEndpointInstance.class, this, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE);
		}
		return subInteractionEndpointInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (DiscreteSingleInteractionEndpointInstance)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(DiscreteSingleInteractionEndpointInstance newFirst) {
		DiscreteSingleInteractionEndpointInstance oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance getLast() {
		if (last != null && last.eIsProxy()) {
			InternalEObject oldLast = (InternalEObject)last;
			last = (DiscreteSingleInteractionEndpointInstance)eResolveProxy(oldLast);
			if (last != oldLast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST, oldLast, last));
			}
		}
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance basicGetLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast(DiscreteSingleInteractionEndpointInstance newLast) {
		DiscreteSingleInteractionEndpointInstance oldLast = last;
		last = newLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DiscreteSingleInteractionEndpointInstance> getGmfSubPortInstances() {
		// Make sure, adding and removing elements works.
		return getSubInteractionEndpointInstances();
		//return (EList<DiscreteSinglePortInstance>)GMF_SUB_PORT_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubInteractionEndpointInstances()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return ((InternalEList<?>)getSubInteractionEndpointInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				return ((InternalEList<?>)getGmfSubPortInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return getSubInteractionEndpointInstances();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST:
				if (resolve) return getLast();
				return basicGetLast();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				return getGmfSubPortInstances();
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				getSubInteractionEndpointInstances().clear();
				getSubInteractionEndpointInstances().addAll((Collection<? extends DiscreteSingleInteractionEndpointInstance>)newValue);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST:
				setFirst((DiscreteSingleInteractionEndpointInstance)newValue);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST:
				setLast((DiscreteSingleInteractionEndpointInstance)newValue);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				getGmfSubPortInstances().clear();
				getGmfSubPortInstances().addAll((Collection<? extends DiscreteSingleInteractionEndpointInstance>)newValue);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				getSubInteractionEndpointInstances().clear();
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST:
				setFirst((DiscreteSingleInteractionEndpointInstance)null);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST:
				setLast((DiscreteSingleInteractionEndpointInstance)null);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				getGmfSubPortInstances().clear();
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return subInteractionEndpointInstances != null && !subInteractionEndpointInstances.isEmpty();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST:
				return first != null;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST:
				return last != null;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				return GMF_SUB_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == DiscreteMultiInteractionEndpointInstance.class) {
			switch (derivedFeatureID) {
				case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES: return ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES;
				case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST: return ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__FIRST;
				case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST: return ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__LAST;
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
		if (baseClass == DiscreteMultiInteractionEndpointInstance.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES: return InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES;
				case ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__FIRST: return InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__FIRST;
				case ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__LAST: return InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__LAST;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscreteMultiPortInstanceImpl
