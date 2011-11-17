/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl#getHardwareNodes <em>Hardware Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.DeploymentImpl#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends EObjectImpl implements Deployment {
	/**
	 * The cached value of the '{@link #getCommunicationLinks() <em>Communication Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> communicationLinks;

	/**
	 * The cached value of the '{@link #getHardwareNodes() <em>Hardware Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareNode> hardwareNodes;

	/**
	 * The cached value of the '{@link #getComponentInstanceConfiguration() <em>Component Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration componentInstanceConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getCommunicationLinks() {
		if (communicationLinks == null) {
			communicationLinks = new EObjectContainmentWithInverseEList<CommunicationLink>(CommunicationLink.class, this, DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS, DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT);
		}
		return communicationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareNode> getHardwareNodes() {
		if (hardwareNodes == null) {
			hardwareNodes = new EObjectContainmentWithInverseEList<HardwareNode>(HardwareNode.class, this, DeploymentPackage.DEPLOYMENT__HARDWARE_NODES, DeploymentPackage.HARDWARE_NODE__DEPLOYMENT);
		}
		return hardwareNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getComponentInstanceConfiguration() {
		if (componentInstanceConfiguration != null && componentInstanceConfiguration.eIsProxy()) {
			InternalEObject oldComponentInstanceConfiguration = (InternalEObject)componentInstanceConfiguration;
			componentInstanceConfiguration = (ComponentInstanceConfiguration)eResolveProxy(oldComponentInstanceConfiguration);
			if (componentInstanceConfiguration != oldComponentInstanceConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION, oldComponentInstanceConfiguration, componentInstanceConfiguration));
			}
		}
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration basicGetComponentInstanceConfiguration() {
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstanceConfiguration(ComponentInstanceConfiguration newComponentInstanceConfiguration) {
		ComponentInstanceConfiguration oldComponentInstanceConfiguration = componentInstanceConfiguration;
		componentInstanceConfiguration = newComponentInstanceConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION, oldComponentInstanceConfiguration, componentInstanceConfiguration));
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
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationLinks()).basicAdd(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHardwareNodes()).basicAdd(otherEnd, msgs);
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
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return ((InternalEList<?>)getCommunicationLinks()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return ((InternalEList<?>)getHardwareNodes()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return getCommunicationLinks();
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return getHardwareNodes();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				if (resolve) return getComponentInstanceConfiguration();
				return basicGetComponentInstanceConfiguration();
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
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				getCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				getHardwareNodes().clear();
				getHardwareNodes().addAll((Collection<? extends HardwareNode>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)newValue);
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
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				return;
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				getHardwareNodes().clear();
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)null);
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
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return communicationLinks != null && !communicationLinks.isEmpty();
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return hardwareNodes != null && !hardwareNodes.isEmpty();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				return componentInstanceConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl
