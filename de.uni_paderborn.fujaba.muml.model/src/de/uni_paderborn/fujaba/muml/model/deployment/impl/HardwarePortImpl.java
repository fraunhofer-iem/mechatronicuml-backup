/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.impl;

import de.uni_paderborn.fujaba.muml.model.connector.Connector;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
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
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getHardwareNode <em>Hardware Node</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getDeployedPortInstance <em>Deployed Port Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getCommunicationLinks <em>Communication Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwarePortImpl extends NamedElementImpl implements HardwarePort {
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
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getDeployedPortInstance() <em>Deployed Port Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedPortInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> deployedPortInstance;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final HardwarePortDirectionKind KIND_EDEFAULT = HardwarePortDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected HardwarePortDirectionKind kind = KIND_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getCommunicationLinks() <em>Communication Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COMMUNICATION_LINKS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DeploymentPackage.Literals.HARDWARE_PORT__COMMUNICATION_LINKS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.HARDWARE_PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this, DeploymentPackage.HARDWARE_PORT__CONNECTORS, ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareNode getHardwareNode() {
		if (eContainerFeatureID() != DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE) return null;
		return (HardwareNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardwareNode(HardwareNode newHardwareNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHardwareNode, DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareNode(HardwareNode newHardwareNode) {
		if (newHardwareNode != eInternalContainer() || (eContainerFeatureID() != DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE && newHardwareNode != null)) {
			if (EcoreUtil.isAncestor(this, newHardwareNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHardwareNode != null)
				msgs = ((InternalEObject)newHardwareNode).eInverseAdd(this, DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS, HardwareNode.class, msgs);
			msgs = basicSetHardwareNode(newHardwareNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE, newHardwareNode, newHardwareNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getDeployedPortInstance() {
		if (deployedPortInstance == null) {
			deployedPortInstance = new EObjectResolvingEList<PortInstance>(PortInstance.class, this, DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE);
		}
		return deployedPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePortDirectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(HardwarePortDirectionKind newKind) {
		HardwarePortDirectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationLink> getCommunicationLinks() {
		return (EList<CommunicationLink>)COMMUNICATION_LINKS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case DeploymentPackage.HARDWARE_PORT__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHardwareNode((HardwareNode)otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_PORT__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return basicSetHardwareNode(null, msgs);
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
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return eInternalContainer().eInverseRemove(this, DeploymentPackage.HARDWARE_NODE__HARDWARE_PORTS, HardwareNode.class, msgs);
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
			case DeploymentPackage.HARDWARE_PORT__COMMENT:
				return getComment();
			case DeploymentPackage.HARDWARE_PORT__CONNECTORS:
				return getConnectors();
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return getHardwareNode();
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				return getDeployedPortInstance();
			case DeploymentPackage.HARDWARE_PORT__KIND:
				return getKind();
			case DeploymentPackage.HARDWARE_PORT__COMMUNICATION_LINKS:
				return getCommunicationLinks();
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
			case DeploymentPackage.HARDWARE_PORT__COMMENT:
				setComment((String)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				setHardwareNode((HardwareNode)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				getDeployedPortInstance().clear();
				getDeployedPortInstance().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__KIND:
				setKind((HardwarePortDirectionKind)newValue);
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
			case DeploymentPackage.HARDWARE_PORT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DeploymentPackage.HARDWARE_PORT__CONNECTORS:
				getConnectors().clear();
				return;
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				setHardwareNode((HardwareNode)null);
				return;
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				getDeployedPortInstance().clear();
				return;
			case DeploymentPackage.HARDWARE_PORT__KIND:
				setKind(KIND_EDEFAULT);
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
			case DeploymentPackage.HARDWARE_PORT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DeploymentPackage.HARDWARE_PORT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return getHardwareNode() != null;
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				return deployedPortInstance != null && !deployedPortInstance.isEmpty();
			case DeploymentPackage.HARDWARE_PORT__KIND:
				return kind != KIND_EDEFAULT;
			case DeploymentPackage.HARDWARE_PORT__COMMUNICATION_LINKS:
				return COMMUNICATION_LINKS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case DeploymentPackage.HARDWARE_PORT__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpoint.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.HARDWARE_PORT__CONNECTORS: return ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return DeploymentPackage.HARDWARE_PORT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpoint.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS: return DeploymentPackage.HARDWARE_PORT__CONNECTORS;
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
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //HardwarePortImpl
