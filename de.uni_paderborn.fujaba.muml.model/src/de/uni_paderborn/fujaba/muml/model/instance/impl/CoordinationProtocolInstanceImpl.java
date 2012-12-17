/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.model.instance.CoordinationProtocolInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.CoordinationProtocolInstanceImpl#getProtocolOccurrence <em>Protocol Occurrence</em>}</li>
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
	 * The cached value of the '{@link #getProtocolOccurrence() <em>Protocol Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolOccurrence()
	 * @generated
	 * @ordered
	 */
	protected CoordinationProtocolOccurrence protocolOccurrence;

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
	public CoordinationProtocolOccurrence getProtocolOccurrence() {
		if (protocolOccurrence != null && protocolOccurrence.eIsProxy()) {
			InternalEObject oldProtocolOccurrence = (InternalEObject)protocolOccurrence;
			protocolOccurrence = (CoordinationProtocolOccurrence)eResolveProxy(oldProtocolOccurrence);
			if (protocolOccurrence != oldProtocolOccurrence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PROTOCOL_OCCURRENCE, oldProtocolOccurrence, protocolOccurrence));
			}
		}
		return protocolOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence basicGetProtocolOccurrence() {
		return protocolOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolOccurrence(CoordinationProtocolOccurrence newProtocolOccurrence) {
		CoordinationProtocolOccurrence oldProtocolOccurrence = protocolOccurrence;
		protocolOccurrence = newProtocolOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PROTOCOL_OCCURRENCE, oldProtocolOccurrence, protocolOccurrence));
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PROTOCOL_OCCURRENCE:
				if (resolve) return getProtocolOccurrence();
				return basicGetProtocolOccurrence();
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PROTOCOL_OCCURRENCE:
				setProtocolOccurrence((CoordinationProtocolOccurrence)newValue);
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PROTOCOL_OCCURRENCE:
				setProtocolOccurrence((CoordinationProtocolOccurrence)null);
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
			case InstancePackage.COORDINATION_PROTOCOL_INSTANCE__PROTOCOL_OCCURRENCE:
				return protocolOccurrence != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationProtocolInstanceImpl
