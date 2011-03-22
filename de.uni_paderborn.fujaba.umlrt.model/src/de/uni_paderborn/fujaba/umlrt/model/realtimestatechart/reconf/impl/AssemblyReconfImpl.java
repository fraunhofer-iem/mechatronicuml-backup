/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Reconf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl#getConnectorInstance <em>Connector Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl#getReqPortInstanceReconf <em>Req Port Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl#getProvPortInstanceReconf <em>Prov Port Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.AssemblyReconfImpl#getReconfDiagram <em>Reconf Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyReconfImpl extends EObjectImpl implements AssemblyReconf {
	/**
	 * The cached value of the '{@link #getConnectorInstance() <em>Connector Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorInstance()
	 * @generated
	 * @ordered
	 */
	protected ConnectorInstance connectorInstance;

	/**
	 * The cached value of the '{@link #getReqPortInstanceReconf() <em>Req Port Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqPortInstanceReconf()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceReconf reqPortInstanceReconf;

	/**
	 * The cached value of the '{@link #getProvPortInstanceReconf() <em>Prov Port Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvPortInstanceReconf()
	 * @generated
	 * @ordered
	 */
	protected PortInstanceReconf provPortInstanceReconf;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyReconfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfPackage.Literals.ASSEMBLY_RECONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorInstance getConnectorInstance() {
		if (connectorInstance != null && connectorInstance.eIsProxy()) {
			InternalEObject oldConnectorInstance = (InternalEObject)connectorInstance;
			connectorInstance = (ConnectorInstance)eResolveProxy(oldConnectorInstance);
			if (connectorInstance != oldConnectorInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.ASSEMBLY_RECONF__CONNECTOR_INSTANCE, oldConnectorInstance, connectorInstance));
			}
		}
		return connectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorInstance basicGetConnectorInstance() {
		return connectorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorInstance(ConnectorInstance newConnectorInstance) {
		ConnectorInstance oldConnectorInstance = connectorInstance;
		connectorInstance = newConnectorInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.ASSEMBLY_RECONF__CONNECTOR_INSTANCE, oldConnectorInstance, connectorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf getReqPortInstanceReconf() {
		if (reqPortInstanceReconf != null && reqPortInstanceReconf.eIsProxy()) {
			InternalEObject oldReqPortInstanceReconf = (InternalEObject)reqPortInstanceReconf;
			reqPortInstanceReconf = (PortInstanceReconf)eResolveProxy(oldReqPortInstanceReconf);
			if (reqPortInstanceReconf != oldReqPortInstanceReconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF, oldReqPortInstanceReconf, reqPortInstanceReconf));
			}
		}
		return reqPortInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf basicGetReqPortInstanceReconf() {
		return reqPortInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqPortInstanceReconf(PortInstanceReconf newReqPortInstanceReconf) {
		PortInstanceReconf oldReqPortInstanceReconf = reqPortInstanceReconf;
		reqPortInstanceReconf = newReqPortInstanceReconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF, oldReqPortInstanceReconf, reqPortInstanceReconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf getProvPortInstanceReconf() {
		if (provPortInstanceReconf != null && provPortInstanceReconf.eIsProxy()) {
			InternalEObject oldProvPortInstanceReconf = (InternalEObject)provPortInstanceReconf;
			provPortInstanceReconf = (PortInstanceReconf)eResolveProxy(oldProvPortInstanceReconf);
			if (provPortInstanceReconf != oldProvPortInstanceReconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF, oldProvPortInstanceReconf, provPortInstanceReconf));
			}
		}
		return provPortInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstanceReconf basicGetProvPortInstanceReconf() {
		return provPortInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvPortInstanceReconf(PortInstanceReconf newProvPortInstanceReconf) {
		PortInstanceReconf oldProvPortInstanceReconf = provPortInstanceReconf;
		provPortInstanceReconf = newProvPortInstanceReconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF, oldProvPortInstanceReconf, provPortInstanceReconf));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.ASSEMBLY_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.ASSEMBLY_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfPackage.ASSEMBLY_RECONF__CONNECTOR_INSTANCE:
				if (resolve) return getConnectorInstance();
				return basicGetConnectorInstance();
			case ReconfPackage.ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF:
				if (resolve) return getReqPortInstanceReconf();
				return basicGetReqPortInstanceReconf();
			case ReconfPackage.ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF:
				if (resolve) return getProvPortInstanceReconf();
				return basicGetProvPortInstanceReconf();
			case ReconfPackage.ASSEMBLY_RECONF__RECONF_DIAGRAM:
				if (resolve) return getReconfDiagram();
				return basicGetReconfDiagram();
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
			case ReconfPackage.ASSEMBLY_RECONF__CONNECTOR_INSTANCE:
				setConnectorInstance((ConnectorInstance)newValue);
				return;
			case ReconfPackage.ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF:
				setReqPortInstanceReconf((PortInstanceReconf)newValue);
				return;
			case ReconfPackage.ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF:
				setProvPortInstanceReconf((PortInstanceReconf)newValue);
				return;
			case ReconfPackage.ASSEMBLY_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)newValue);
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
			case ReconfPackage.ASSEMBLY_RECONF__CONNECTOR_INSTANCE:
				setConnectorInstance((ConnectorInstance)null);
				return;
			case ReconfPackage.ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF:
				setReqPortInstanceReconf((PortInstanceReconf)null);
				return;
			case ReconfPackage.ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF:
				setProvPortInstanceReconf((PortInstanceReconf)null);
				return;
			case ReconfPackage.ASSEMBLY_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)null);
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
			case ReconfPackage.ASSEMBLY_RECONF__CONNECTOR_INSTANCE:
				return connectorInstance != null;
			case ReconfPackage.ASSEMBLY_RECONF__REQ_PORT_INSTANCE_RECONF:
				return reqPortInstanceReconf != null;
			case ReconfPackage.ASSEMBLY_RECONF__PROV_PORT_INSTANCE_RECONF:
				return provPortInstanceReconf != null;
			case ReconfPackage.ASSEMBLY_RECONF__RECONF_DIAGRAM:
				return reconfDiagram != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyReconfImpl
