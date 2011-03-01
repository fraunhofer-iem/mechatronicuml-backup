/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance Reconf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl#getComponentInstanceReconf <em>Component Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl#getPortByComponentInstance <em>Port By Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.PortInstanceReconfImpl#getReconfDiagram <em>Reconf Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortInstanceReconfImpl extends EObjectImpl implements PortInstanceReconf {
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
	 * The cached value of the '{@link #getComponentInstanceReconf() <em>Component Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceReconf()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceReconf componentInstanceReconf;

	/**
	 * The cached value of the '{@link #getPortByComponentInstance() <em>Port By Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortByComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<ComponentInstance, Port> portByComponentInstance;

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
	protected PortInstanceReconfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfPackage.Literals.PORT_INSTANCE_RECONF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_INSTANCE_RECONF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceReconf getComponentInstanceReconf() {
		if (componentInstanceReconf != null && componentInstanceReconf.eIsProxy()) {
			InternalEObject oldComponentInstanceReconf = (InternalEObject)componentInstanceReconf;
			componentInstanceReconf = (ComponentInstanceReconf)eResolveProxy(oldComponentInstanceReconf);
			if (componentInstanceReconf != oldComponentInstanceReconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF, oldComponentInstanceReconf, componentInstanceReconf));
			}
		}
		return componentInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceReconf basicGetComponentInstanceReconf() {
		return componentInstanceReconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstanceReconf(ComponentInstanceReconf newComponentInstanceReconf) {
		ComponentInstanceReconf oldComponentInstanceReconf = componentInstanceReconf;
		componentInstanceReconf = newComponentInstanceReconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF, oldComponentInstanceReconf, componentInstanceReconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<ComponentInstance, Port> getPortByComponentInstance() {
		if (portByComponentInstance != null && ((EObject)portByComponentInstance).eIsProxy()) {
			InternalEObject oldPortByComponentInstance = (InternalEObject)portByComponentInstance;
			portByComponentInstance = (Map.Entry<ComponentInstance, Port>)eResolveProxy(oldPortByComponentInstance);
			if (portByComponentInstance != oldPortByComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE, oldPortByComponentInstance, portByComponentInstance));
			}
		}
		return portByComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ComponentInstance, Port> basicGetPortByComponentInstance() {
		return portByComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortByComponentInstance(Map.Entry<ComponentInstance, Port> newPortByComponentInstance) {
		Map.Entry<ComponentInstance, Port> oldPortByComponentInstance = portByComponentInstance;
		portByComponentInstance = newPortByComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE, oldPortByComponentInstance, portByComponentInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.PORT_INSTANCE_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.PORT_INSTANCE_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfPackage.PORT_INSTANCE_RECONF__NAME:
				return getName();
			case ReconfPackage.PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF:
				if (resolve) return getComponentInstanceReconf();
				return basicGetComponentInstanceReconf();
			case ReconfPackage.PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE:
				if (resolve) return getPortByComponentInstance();
				return basicGetPortByComponentInstance();
			case ReconfPackage.PORT_INSTANCE_RECONF__RECONF_DIAGRAM:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReconfPackage.PORT_INSTANCE_RECONF__NAME:
				setName((String)newValue);
				return;
			case ReconfPackage.PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF:
				setComponentInstanceReconf((ComponentInstanceReconf)newValue);
				return;
			case ReconfPackage.PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE:
				setPortByComponentInstance((Map.Entry<ComponentInstance, Port>)newValue);
				return;
			case ReconfPackage.PORT_INSTANCE_RECONF__RECONF_DIAGRAM:
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
			case ReconfPackage.PORT_INSTANCE_RECONF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReconfPackage.PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF:
				setComponentInstanceReconf((ComponentInstanceReconf)null);
				return;
			case ReconfPackage.PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE:
				setPortByComponentInstance((Map.Entry<ComponentInstance, Port>)null);
				return;
			case ReconfPackage.PORT_INSTANCE_RECONF__RECONF_DIAGRAM:
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
			case ReconfPackage.PORT_INSTANCE_RECONF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReconfPackage.PORT_INSTANCE_RECONF__COMPONENT_INSTANCE_RECONF:
				return componentInstanceReconf != null;
			case ReconfPackage.PORT_INSTANCE_RECONF__PORT_BY_COMPONENT_INSTANCE:
				return portByComponentInstance != null;
			case ReconfPackage.PORT_INSTANCE_RECONF__RECONF_DIAGRAM:
				return reconfDiagram != null;
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

} //PortInstanceReconfImpl
