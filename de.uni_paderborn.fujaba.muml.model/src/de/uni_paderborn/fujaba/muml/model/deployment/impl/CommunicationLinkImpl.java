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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.LinkQualityOfService;
import de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl#getQualityOfService <em>Quality Of Service</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.CommunicationLinkImpl#getDeployedAssemblyInstances <em>Deployed Assembly Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLinkImpl extends ExtendableElementImpl implements CommunicationLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected HardwarePort source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected HardwarePort target;

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
	public HardwarePort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (HardwarePort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.COMMUNICATION_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(HardwarePort newSource, NotificationChain msgs) {
		HardwarePort oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(HardwarePort newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK, HardwarePort.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK, HardwarePort.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (HardwarePort)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.COMMUNICATION_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(HardwarePort newTarget, NotificationChain msgs) {
		HardwarePort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(HardwarePort newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK, HardwarePort.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK, HardwarePort.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMMUNICATION_LINK__TARGET, newTarget, newTarget));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployment((Deployment)otherEnd, msgs);
			case DeploymentPackage.COMMUNICATION_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK, HardwarePort.class, msgs);
				return basicSetSource((HardwarePort)otherEnd, msgs);
			case DeploymentPackage.COMMUNICATION_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK, HardwarePort.class, msgs);
				return basicSetTarget((HardwarePort)otherEnd, msgs);
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
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
			case DeploymentPackage.COMMUNICATION_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case DeploymentPackage.COMMUNICATION_LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return getDeployment();
			case DeploymentPackage.COMMUNICATION_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DeploymentPackage.COMMUNICATION_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE:
				if (resolve) return getQualityOfService();
				return basicGetQualityOfService();
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES:
				return getDeployedAssemblyInstances();
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
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__SOURCE:
				setSource((HardwarePort)newValue);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__TARGET:
				setTarget((HardwarePort)newValue);
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
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__SOURCE:
				setSource((HardwarePort)null);
				return;
			case DeploymentPackage.COMMUNICATION_LINK__TARGET:
				setTarget((HardwarePort)null);
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
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYMENT:
				return getDeployment() != null;
			case DeploymentPackage.COMMUNICATION_LINK__SOURCE:
				return source != null;
			case DeploymentPackage.COMMUNICATION_LINK__TARGET:
				return target != null;
			case DeploymentPackage.COMMUNICATION_LINK__QUALITY_OF_SERVICE:
				return qualityOfService != null;
			case DeploymentPackage.COMMUNICATION_LINK__DEPLOYED_ASSEMBLY_INSTANCES:
				return deployedAssemblyInstances != null && !deployedAssemblyInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationLinkImpl
