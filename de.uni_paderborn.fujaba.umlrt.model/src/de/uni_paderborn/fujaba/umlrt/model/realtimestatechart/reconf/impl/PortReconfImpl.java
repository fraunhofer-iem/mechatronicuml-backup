/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

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
 * An implementation of the model object '<em><b>Port Reconf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortReconfImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortReconfImpl extends EObjectImpl implements PortReconf {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

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
	protected PortReconfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfPackage.Literals.PORT_RECONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.PORT_RECONF__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_RECONF__PORT, oldPort, port));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.PORT_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_RECONF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfPackage.PORT_RECONF__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case ReconfPackage.PORT_RECONF__RECONF_DIAGRAM:
				if (resolve) return getReconfDiagram();
				return basicGetReconfDiagram();
			case ReconfPackage.PORT_RECONF__NAME:
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
			case ReconfPackage.PORT_RECONF__PORT:
				setPort((Port)newValue);
				return;
			case ReconfPackage.PORT_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)newValue);
				return;
			case ReconfPackage.PORT_RECONF__NAME:
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
			case ReconfPackage.PORT_RECONF__PORT:
				setPort((Port)null);
				return;
			case ReconfPackage.PORT_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)null);
				return;
			case ReconfPackage.PORT_RECONF__NAME:
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
			case ReconfPackage.PORT_RECONF__PORT:
				return port != null;
			case ReconfPackage.PORT_RECONF__RECONF_DIAGRAM:
				return reconfDiagram != null;
			case ReconfPackage.PORT_RECONF__NAME:
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

} //PortReconfImpl
