/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment.impl;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

import deployment.DeploymentPackage;
import deployment.HardwareNode;
import deployment.HardwarePort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment.impl.HardwareNodeImpl#getHardwarePorts <em>Hardware Ports</em>}</li>
 *   <li>{@link deployment.impl.HardwareNodeImpl#getComponentInstanceOfNode <em>Component Instance Of Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareNodeImpl extends EObjectImpl implements HardwareNode {
	/**
	 * The cached value of the '{@link #getHardwarePorts() <em>Hardware Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> hardwarePorts;

	/**
	 * The cached value of the '{@link #getComponentInstanceOfNode() <em>Component Instance Of Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceOfNode()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstanceOfNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HARDWARE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePort> getHardwarePorts() {
		if (hardwarePorts == null) {
			hardwarePorts = new EObjectContainmentEList<HardwarePort>(HardwarePort.class, this, DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS);
		}
		return hardwarePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstanceOfNode() {
		if (componentInstanceOfNode != null && componentInstanceOfNode.eIsProxy()) {
			InternalEObject oldComponentInstanceOfNode = (InternalEObject)componentInstanceOfNode;
			componentInstanceOfNode = (ComponentInstance)eResolveProxy(oldComponentInstanceOfNode);
			if (componentInstanceOfNode != oldComponentInstanceOfNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE, oldComponentInstanceOfNode, componentInstanceOfNode));
			}
		}
		return componentInstanceOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstanceOfNode() {
		return componentInstanceOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstanceOfNode(ComponentInstance newComponentInstanceOfNode) {
		ComponentInstance oldComponentInstanceOfNode = componentInstanceOfNode;
		componentInstanceOfNode = newComponentInstanceOfNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE, oldComponentInstanceOfNode, componentInstanceOfNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return ((InternalEList<?>)getHardwarePorts()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return getHardwarePorts();
			case DeploymentPackage.HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE:
				if (resolve) return getComponentInstanceOfNode();
				return basicGetComponentInstanceOfNode();
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
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				getHardwarePorts().clear();
				getHardwarePorts().addAll((Collection<? extends HardwarePort>)newValue);
				return;
			case DeploymentPackage.HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE:
				setComponentInstanceOfNode((ComponentInstance)newValue);
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
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				getHardwarePorts().clear();
				return;
			case DeploymentPackage.HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE:
				setComponentInstanceOfNode((ComponentInstance)null);
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
			case DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS:
				return hardwarePorts != null && !hardwarePorts.isEmpty();
			case DeploymentPackage.HARDWARE_NODE__COMPONENT_INSTANCE_OF_NODE:
				return componentInstanceOfNode != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareNodeImpl
