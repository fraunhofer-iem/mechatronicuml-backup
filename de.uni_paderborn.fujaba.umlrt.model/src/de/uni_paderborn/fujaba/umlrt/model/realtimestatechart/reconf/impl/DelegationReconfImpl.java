/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Reconf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl#getPortReconf <em>Port Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl#getPortInstanceReconf <em>Port Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.DelegationReconfImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationReconfImpl extends EObjectImpl implements DelegationReconf {
	/**
	 * The cached value of the '{@link #getPortReconf() <em>Port Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortReconf()
	 * @generated
	 * @ordered
	 */
	protected PortReconf portReconf;

	/**
	 * The cached value of the '{@link #getPortInstanceReconf() <em>Port Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstanceReconf()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceReconf portInstanceReconf;

	/**
	 * The cached value of the '{@link #getReconfDiagram() <em>Reconf Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfDiagram()
	 * @generated
	 * @ordered
	 */
	protected ReconfDiagram reconfDiagram;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationReconfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfPackage.Literals.DELEGATION_RECONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortReconf getPortReconf() {
		if (portReconf != null && portReconf.eIsProxy()) {
			InternalEObject oldPortReconf = (InternalEObject)portReconf;
			portReconf = (PortReconf)eResolveProxy(oldPortReconf);
			if (portReconf != oldPortReconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.DELEGATION_RECONF__PORT_RECONF, oldPortReconf, portReconf));
			}
		}
		return portReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortReconf basicGetPortReconf() {
		return portReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortReconf(PortReconf newPortReconf) {
		PortReconf oldPortReconf = portReconf;
		portReconf = newPortReconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.DELEGATION_RECONF__PORT_RECONF, oldPortReconf, portReconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf getPortInstanceReconf() {
		if (portInstanceReconf != null && portInstanceReconf.eIsProxy()) {
			InternalEObject oldPortInstanceReconf = (InternalEObject)portInstanceReconf;
			portInstanceReconf = (PortInstanceReconf)eResolveProxy(oldPortInstanceReconf);
			if (portInstanceReconf != oldPortInstanceReconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.DELEGATION_RECONF__PORT_INSTANCE_RECONF, oldPortInstanceReconf, portInstanceReconf));
			}
		}
		return portInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf basicGetPortInstanceReconf() {
		return portInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInstanceReconf(PortInstanceReconf newPortInstanceReconf) {
		PortInstanceReconf oldPortInstanceReconf = portInstanceReconf;
		portInstanceReconf = newPortInstanceReconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.DELEGATION_RECONF__PORT_INSTANCE_RECONF, oldPortInstanceReconf, portInstanceReconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfDiagram getReconfDiagram() {
		if (reconfDiagram != null && reconfDiagram.eIsProxy()) {
			InternalEObject oldReconfDiagram = (InternalEObject)reconfDiagram;
			reconfDiagram = (ReconfDiagram)eResolveProxy(oldReconfDiagram);
			if (reconfDiagram != oldReconfDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.DELEGATION_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
			}
		}
		return reconfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfDiagram basicGetReconfDiagram() {
		return reconfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfDiagram(ReconfDiagram newReconfDiagram) {
		ReconfDiagram oldReconfDiagram = reconfDiagram;
		reconfDiagram = newReconfDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.DELEGATION_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.DELEGATION_RECONF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfPackage.DELEGATION_RECONF__PORT_RECONF:
				if (resolve) return getPortReconf();
				return basicGetPortReconf();
			case ReconfPackage.DELEGATION_RECONF__PORT_INSTANCE_RECONF:
				if (resolve) return getPortInstanceReconf();
				return basicGetPortInstanceReconf();
			case ReconfPackage.DELEGATION_RECONF__RECONF_DIAGRAM:
				if (resolve) return getReconfDiagram();
				return basicGetReconfDiagram();
			case ReconfPackage.DELEGATION_RECONF__NAME:
				return getName();
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
			case ReconfPackage.DELEGATION_RECONF__PORT_RECONF:
				setPortReconf((PortReconf)newValue);
				return;
			case ReconfPackage.DELEGATION_RECONF__PORT_INSTANCE_RECONF:
				setPortInstanceReconf((PortInstanceReconf)newValue);
				return;
			case ReconfPackage.DELEGATION_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)newValue);
				return;
			case ReconfPackage.DELEGATION_RECONF__NAME:
				setName((String)newValue);
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
			case ReconfPackage.DELEGATION_RECONF__PORT_RECONF:
				setPortReconf((PortReconf)null);
				return;
			case ReconfPackage.DELEGATION_RECONF__PORT_INSTANCE_RECONF:
				setPortInstanceReconf((PortInstanceReconf)null);
				return;
			case ReconfPackage.DELEGATION_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)null);
				return;
			case ReconfPackage.DELEGATION_RECONF__NAME:
				setName(NAME_EDEFAULT);
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
			case ReconfPackage.DELEGATION_RECONF__PORT_RECONF:
				return portReconf != null;
			case ReconfPackage.DELEGATION_RECONF__PORT_INSTANCE_RECONF:
				return portInstanceReconf != null;
			case ReconfPackage.DELEGATION_RECONF__RECONF_DIAGRAM:
				return reconfDiagram != null;
			case ReconfPackage.DELEGATION_RECONF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DelegationReconfImpl
