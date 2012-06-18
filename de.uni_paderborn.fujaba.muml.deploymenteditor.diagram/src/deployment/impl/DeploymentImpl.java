/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package deployment.impl;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;

import deployment.CommunicationLink;
import deployment.Deployment;
import deployment.DeploymentPackage;
import deployment.HardwareNode;

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
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment.impl.DeploymentImpl#getHardwareNodes <em>Hardware Nodes</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getComponentInstance <em>Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends EObjectImpl implements Deployment {
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
	 * The cached value of the '{@link #getComponentInstanceConfiguration() <em>Component Instance Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration componentInstanceConfiguration;

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
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

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
	public EList<HardwareNode> getHardwareNodes() {
		if (hardwareNodes == null) {
			hardwareNodes = new EObjectContainmentEList<HardwareNode>(HardwareNode.class, this, DeploymentPackage.DEPLOYMENT__HARDWARE_NODES);
		}
		return hardwareNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getComponentInstanceConfiguration() {
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstanceConfiguration(ComponentInstanceConfiguration newComponentInstanceConfiguration, NotificationChain msgs) {
		ComponentInstanceConfiguration oldComponentInstanceConfiguration = componentInstanceConfiguration;
		componentInstanceConfiguration = newComponentInstanceConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION, oldComponentInstanceConfiguration, newComponentInstanceConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstanceConfiguration(ComponentInstanceConfiguration newComponentInstanceConfiguration) {
		if (newComponentInstanceConfiguration != componentInstanceConfiguration) {
			NotificationChain msgs = null;
			if (componentInstanceConfiguration != null)
				msgs = ((InternalEObject)componentInstanceConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION, null, msgs);
			if (newComponentInstanceConfiguration != null)
				msgs = ((InternalEObject)newComponentInstanceConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION, null, msgs);
			msgs = basicSetComponentInstanceConfiguration(newComponentInstanceConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION, newComponentInstanceConfiguration, newComponentInstanceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getCommunicationLinks() {
		if (communicationLinks == null) {
			communicationLinks = new EObjectContainmentEList<CommunicationLink>(CommunicationLink.class, this, DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS);
		}
		return communicationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstance(ComponentInstance newComponentInstance, NotificationChain msgs) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE, oldComponentInstance, newComponentInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		if (newComponentInstance != componentInstance) {
			NotificationChain msgs = null;
			if (componentInstance != null)
				msgs = ((InternalEObject)componentInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE, null, msgs);
			if (newComponentInstance != null)
				msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE, null, msgs);
			msgs = basicSetComponentInstance(newComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return ((InternalEList<?>)getHardwareNodes()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				return basicSetComponentInstanceConfiguration(null, msgs);
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return ((InternalEList<?>)getCommunicationLinks()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
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
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return getHardwareNodes();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				return getComponentInstanceConfiguration();
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return getCommunicationLinks();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE:
				return getComponentInstance();
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
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				getHardwareNodes().clear();
				getHardwareNodes().addAll((Collection<? extends HardwareNode>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				getCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
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
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				getHardwareNodes().clear();
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)null);
				return;
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
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
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return hardwareNodes != null && !hardwareNodes.isEmpty();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				return componentInstanceConfiguration != null;
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return communicationLinks != null && !communicationLinks.isEmpty();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE:
				return componentInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl
