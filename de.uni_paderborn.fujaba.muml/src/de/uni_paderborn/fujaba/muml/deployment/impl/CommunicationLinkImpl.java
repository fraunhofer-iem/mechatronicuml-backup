/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.deployment.LinkQualityOfService;
import de.uni_paderborn.fujaba.muml.instance.AssemblyConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.deployment.impl.CommunicationLinkImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.deployment.impl.CommunicationLinkImpl#getConnectorEndpoints <em>Connector Endpoints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.deployment.impl.CommunicationLinkImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.deployment.impl.CommunicationLinkImpl#getQualityOfService <em>Quality Of Service</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.deployment.impl.CommunicationLinkImpl#getDeployedAssemblyInstances <em>Deployed Assembly Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.deployment.impl.CommunicationLinkImpl#getHardwarePorts <em>Hardware Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLinkImpl extends ExtendableElementImpl implements CommunicationLink {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectorEndpoints() <em>Connector Endpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEndpoint> connectorEndpoints;

	/**
	 * The cached value of the '{@link #getQualityOfService() <em>Quality Of Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityOfService()
	 * @generated
	 * @ordered
	 */
	protected LinkQualityOfService qualityOfService;

	/**
	 * The cached value of the '{@link #getDeployedAssemblyInstances() <em>Deployed Assembly Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedAssemblyInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnectorInstance> deployedAssemblyInstances;

	/**
	 * The cached setting delegate for the '{@link #getHardwarePorts() <em>Hardware Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePorts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HARDWARE_PORTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeploymentPackage.Literals.COMMUNICATION_LINK__HARDWARE_PORTS).getSettingDelegate();

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
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEndpoint> getConnectorEndpoints() {
		if (connectorEndpoints == null) {
			connectorEndpoints = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorEndpoint>(ConnectorEndpoint.class, this, DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS, ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS);
		}
		return connectorEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID() != DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT) return null;
		return (Deployment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeployment, DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer() || (eContainerFeatureID() != DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, newDeployment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS, Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkQualityOfService getQualityOfService() {
		if (qualityOfService != null && qualityOfService.eIsProxy()) {
			InternalEObject oldQualityOfService = (InternalEObject)qualityOfService;
			qualityOfService = (LinkQualityOfService)eResolveProxy(oldQualityOfService);
			if (qualityOfService != oldQualityOfService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE, oldQualityOfService, qualityOfService));
			}
		}
		return qualityOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkQualityOfService basicGetQualityOfService() {
		return qualityOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityOfService(LinkQualityOfService newQualityOfService) {
		LinkQualityOfService oldQualityOfService = qualityOfService;
		qualityOfService = newQualityOfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE, oldQualityOfService, qualityOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyConnectorInstance> getDeployedAssemblyInstances() {
		if (deployedAssemblyInstances == null) {
			deployedAssemblyInstances = new EObjectResolvingEList<AssemblyConnectorInstance>(AssemblyConnectorInstance.class, this, DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES);
		}
		return deployedAssemblyInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HardwarePort> getHardwarePorts() {
		return (EList<HardwarePort>)HARDWARE_PORTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorEndpoints()).basicAdd(otherEnd, msgs);
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployment((Deployment)otherEnd, msgs);
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
			case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS:
				return ((InternalEList<?>)getConnectorEndpoints()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return eInternalContainer().eInverseRemove(this, DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS, Deployment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.COMMUNICATION_LINK__COMMENT:
				return getComment();
			case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS:
				return getConnectorEndpoints();
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return getDeployment();
			case DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE:
				if (resolve) return getQualityOfService();
				return basicGetQualityOfService();
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES:
				return getDeployedAssemblyInstances();
			case DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORTS:
				return getHardwarePorts();
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
			case DeploymentPackage.COMMUNICATION_LINK__COMMENT:
				setComment((String)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS:
				getConnectorEndpoints().clear();
				getConnectorEndpoints().addAll((Collection<? extends ConnectorEndpoint>)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE:
				setQualityOfService((LinkQualityOfService)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES:
				getDeployedAssemblyInstances().clear();
				getDeployedAssemblyInstances().addAll((Collection<? extends AssemblyConnectorInstance>)newValue);
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
			case DeploymentPackage.COMMUNICATION_LINK__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS:
				getConnectorEndpoints().clear();
				return;
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE:
				setQualityOfService((LinkQualityOfService)null);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES:
				getDeployedAssemblyInstances().clear();
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
			case DeploymentPackage.COMMUNICATION_LINK__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS:
				return connectorEndpoints != null && !connectorEndpoints.isEmpty();
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return getDeployment() != null;
			case DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE:
				return qualityOfService != null;
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES:
				return deployedAssemblyInstances != null && !deployedAssemblyInstances.isEmpty();
			case DeploymentPackage.COMMUNICATION_LINK__HARDWARE_PORTS:
				return HARDWARE_PORTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.COMMUNICATION_LINK__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS: return ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return DeploymentPackage.COMMUNICATION_LINK__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS: return DeploymentPackage.COMMUNICATION_LINK__CONNECTOR_ENDPOINTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //CommunicationLinkImpl
