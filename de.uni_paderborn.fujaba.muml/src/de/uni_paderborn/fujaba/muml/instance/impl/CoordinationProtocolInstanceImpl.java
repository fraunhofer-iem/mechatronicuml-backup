/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolPart;
import de.uni_paderborn.fujaba.muml.instance.CoordinationProtocolInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.impl.CoordinationProtocolInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.impl.CoordinationProtocolInstanceImpl#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationProtocolInstanceImpl extends NamedElementImpl implements CoordinationProtocolInstance {
	/**
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstances;

	/**
	 * The cached value of the '{@link #getCoordinationProtocolPart() <em>Coordination Protocol Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocolPart()
	 * @generated
	 * @ordered
	 */
	protected CoordinationProtocolPart coordinationProtocolPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationProtocolInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COORDINATION_PROTOCOL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getPortInstances() {
		if (portInstances == null) {
			portInstances = new EObjectResolvingEList<PortInstance>(PortInstance.class, this, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES);
		}
		return portInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolPart getCoordinationProtocolPart() {
		if (coordinationProtocolPart != null && coordinationProtocolPart.eIsProxy()) {
			InternalEObject oldCoordinationProtocolPart = (InternalEObject)coordinationProtocolPart;
			coordinationProtocolPart = (CoordinationProtocolPart)eResolveProxy(oldCoordinationProtocolPart);
			if (coordinationProtocolPart != oldCoordinationProtocolPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE, oldCoordinationProtocolPart, coordinationProtocolPart));
			}
		}
		return coordinationProtocolPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolPart basicGetCoordinationProtocolPart() {
		return coordinationProtocolPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocolPart(CoordinationProtocolPart newCoordinationProtocolPart) {
		CoordinationProtocolPart oldCoordinationProtocolPart = coordinationProtocolPart;
		coordinationProtocolPart = newCoordinationProtocolPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE, oldCoordinationProtocolPart, coordinationProtocolPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				if (resolve) return getCoordinationProtocolPart();
				return basicGetCoordinationProtocolPart();
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				getPortInstances().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				setCoordinationProtocolPart((CoordinationProtocolPart)newValue);
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				return;
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				setCoordinationProtocolPart((CoordinationProtocolPart)null);
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__COORDINATION_PROTOCOL_OCCURRENCE:
				return coordinationProtocolPart != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationProtocolInstanceImpl
