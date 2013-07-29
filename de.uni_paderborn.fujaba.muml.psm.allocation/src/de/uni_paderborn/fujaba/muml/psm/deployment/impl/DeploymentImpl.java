/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.psm.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.psm.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.psm.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.psm.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.psm.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.psm.deployment.LinkQualityOfService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.impl.DeploymentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.impl.DeploymentImpl#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.impl.DeploymentImpl#getHardwareNodes <em>Hardware Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.impl.DeploymentImpl#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.deployment.impl.DeploymentImpl#getQualityOfLinkServices <em>Quality Of Link Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends NamedElementImpl implements Deployment {
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
	 * The cached value of the '{@link #getQualityOfLinkServices() <em>Quality Of Link Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityOfLinkServices()
	 * @generated
	 * @ordered
	 */
	protected LinkQualityOfService qualityOfLinkServices;

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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__COMMENT, oldComment, comment));
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
	public LinkQualityOfService getQualityOfLinkServices() {
		return qualityOfLinkServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityOfLinkServices(LinkQualityOfService newQualityOfLinkServices, NotificationChain msgs) {
		LinkQualityOfService oldQualityOfLinkServices = qualityOfLinkServices;
		qualityOfLinkServices = newQualityOfLinkServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES, oldQualityOfLinkServices, newQualityOfLinkServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityOfLinkServices(LinkQualityOfService newQualityOfLinkServices) {
		if (newQualityOfLinkServices != qualityOfLinkServices) {
			NotificationChain msgs = null;
			if (qualityOfLinkServices != null)
				msgs = ((InternalEObject)qualityOfLinkServices).eInverseRemove(this, DeploymentPackage.LINK_QUALITY_OF_SERVICE__DEPLOYMENT, LinkQualityOfService.class, msgs);
			if (newQualityOfLinkServices != null)
				msgs = ((InternalEObject)newQualityOfLinkServices).eInverseAdd(this, DeploymentPackage.LINK_QUALITY_OF_SERVICE__DEPLOYMENT, LinkQualityOfService.class, msgs);
			msgs = basicSetQualityOfLinkServices(newQualityOfLinkServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES, newQualityOfLinkServices, newQualityOfLinkServices));
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
			case DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES:
				if (qualityOfLinkServices != null)
					msgs = ((InternalEObject)qualityOfLinkServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES, null, msgs);
				return basicSetQualityOfLinkServices((LinkQualityOfService)otherEnd, msgs);
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
			case DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES:
				return basicSetQualityOfLinkServices(null, msgs);
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
			case DeploymentPackage.DEPLOYMENT__COMMENT:
				return getComment();
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return getCommunicationLinks();
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return getHardwareNodes();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				if (resolve) return getComponentInstanceConfiguration();
				return basicGetComponentInstanceConfiguration();
			case DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES:
				return getQualityOfLinkServices();
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
			case DeploymentPackage.DEPLOYMENT__COMMENT:
				setComment((String)newValue);
				return;
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
			case DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES:
				setQualityOfLinkServices((LinkQualityOfService)newValue);
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
			case DeploymentPackage.DEPLOYMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				return;
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				getHardwareNodes().clear();
				return;
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)null);
				return;
			case DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES:
				setQualityOfLinkServices((LinkQualityOfService)null);
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
			case DeploymentPackage.DEPLOYMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DeploymentPackage.DEPLOYMENT__COMMUNICATION_LINKS:
				return communicationLinks != null && !communicationLinks.isEmpty();
			case DeploymentPackage.DEPLOYMENT__HARDWARE_NODES:
				return hardwareNodes != null && !hardwareNodes.isEmpty();
			case DeploymentPackage.DEPLOYMENT__COMPONENT_INSTANCE_CONFIGURATION:
				return componentInstanceConfiguration != null;
			case DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES:
				return qualityOfLinkServices != null;
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
				case DeploymentPackage.DEPLOYMENT__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return DeploymentPackage.DEPLOYMENT__COMMENT;
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

} //DeploymentImpl
