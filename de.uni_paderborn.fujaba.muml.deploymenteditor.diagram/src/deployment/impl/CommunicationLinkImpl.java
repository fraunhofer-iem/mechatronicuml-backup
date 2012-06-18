/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment.impl;

import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

import deployment.CommunicationLink;
import deployment.DeploymentPackage;
import deployment.HardwarePort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment.impl.CommunicationLinkImpl#getHardwarePort <em>Hardware Port</em>}</li>
 *   <li>{@link deployment.impl.CommunicationLinkImpl#getComponentInstancePort <em>Component Instance Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLinkImpl extends EObjectImpl implements CommunicationLink {
	/**
	 * The cached value of the '{@link #getHardwarePort() <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePort()
	 * @generated
	 * @ordered
	 */
	protected HardwarePort hardwarePort;

	/**
	 * The cached value of the '{@link #getComponentInstancePort() <em>Component Instance Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstancePort()
	 * @generated
	 * @ordered
	 */
	protected PortInstance componentInstancePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMMUNICATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort getHardwarePort() {
		if (hardwarePort != null && hardwarePort.eIsProxy()) {
			InternalEObject oldHardwarePort = (InternalEObject)hardwarePort;
			hardwarePort = (HardwarePort)eResolveProxy(oldHardwarePort);
			if (hardwarePort != oldHardwarePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORT, oldHardwarePort, hardwarePort));
			}
		}
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort basicGetHardwarePort() {
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwarePort(HardwarePort newHardwarePort) {
		HardwarePort oldHardwarePort = hardwarePort;
		hardwarePort = newHardwarePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORT, oldHardwarePort, hardwarePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getComponentInstancePort() {
		if (componentInstancePort != null && componentInstancePort.eIsProxy()) {
			InternalEObject oldComponentInstancePort = (InternalEObject)componentInstancePort;
			componentInstancePort = (PortInstance)eResolveProxy(oldComponentInstancePort);
			if (componentInstancePort != oldComponentInstancePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT, oldComponentInstancePort, componentInstancePort));
			}
		}
		return componentInstancePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetComponentInstancePort() {
		return componentInstancePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstancePort(PortInstance newComponentInstancePort) {
		PortInstance oldComponentInstancePort = componentInstancePort;
		componentInstancePort = newComponentInstancePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT, oldComponentInstancePort, componentInstancePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORT:
				if (resolve) return getHardwarePort();
				return basicGetHardwarePort();
			case DeploymentPackage.COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT:
				if (resolve) return getComponentInstancePort();
				return basicGetComponentInstancePort();
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
			case DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORT:
				setHardwarePort((HardwarePort)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT:
				setComponentInstancePort((PortInstance)newValue);
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
			case DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORT:
				setHardwarePort((HardwarePort)null);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT:
				setComponentInstancePort((PortInstance)null);
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
			case DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORT:
				return hardwarePort != null;
			case DeploymentPackage.COMMUNICATION_LINK__COMPONENT_INSTANCE_PORT:
				return componentInstancePort != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationLinkImpl
