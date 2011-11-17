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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.model.deployment.CommunicationLink;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwareNode;
import de.uni_paderborn.fujaba.muml.model.deployment.HardwarePort;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getHardwareNode <em>Hardware Node</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getOutgoingCommunicationLink <em>Outgoing Communication Link</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getIncomingCommunicationLink <em>Incoming Communication Link</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.HardwarePortImpl#getDeployedPortInstance <em>Deployed Port Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwarePortImpl extends EObjectImpl implements HardwarePort {
	/**
	 * The cached value of the '{@link #getOutgoingCommunicationLink() <em>Outgoing Communication Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingCommunicationLink()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLink outgoingCommunicationLink;

	/**
	 * The cached value of the '{@link #getIncomingCommunicationLink() <em>Incoming Communication Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingCommunicationLink()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLink incomingCommunicationLink;

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
	public CommunicationLink getOutgoingCommunicationLink() {
		if (outgoingCommunicationLink != null && outgoingCommunicationLink.eIsProxy()) {
			InternalEObject oldOutgoingCommunicationLink = (InternalEObject)outgoingCommunicationLink;
			outgoingCommunicationLink = (CommunicationLink)eResolveProxy(oldOutgoingCommunicationLink);
			if (outgoingCommunicationLink != oldOutgoingCommunicationLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK, oldOutgoingCommunicationLink, outgoingCommunicationLink));
			}
		}
		return outgoingCommunicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink basicGetOutgoingCommunicationLink() {
		return outgoingCommunicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingCommunicationLink(CommunicationLink newOutgoingCommunicationLink, NotificationChain msgs) {
		CommunicationLink oldOutgoingCommunicationLink = outgoingCommunicationLink;
		outgoingCommunicationLink = newOutgoingCommunicationLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK, oldOutgoingCommunicationLink, newOutgoingCommunicationLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingCommunicationLink(CommunicationLink newOutgoingCommunicationLink) {
		if (newOutgoingCommunicationLink != outgoingCommunicationLink) {
			NotificationChain msgs = null;
			if (outgoingCommunicationLink != null)
				msgs = ((InternalEObject)outgoingCommunicationLink).eInverseRemove(this, DeploymentPackage.COMMUNICATION_LINK__SOURCE, CommunicationLink.class, msgs);
			if (newOutgoingCommunicationLink != null)
				msgs = ((InternalEObject)newOutgoingCommunicationLink).eInverseAdd(this, DeploymentPackage.COMMUNICATION_LINK__SOURCE, CommunicationLink.class, msgs);
			msgs = basicSetOutgoingCommunicationLink(newOutgoingCommunicationLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK, newOutgoingCommunicationLink, newOutgoingCommunicationLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink getIncomingCommunicationLink() {
		if (incomingCommunicationLink != null && incomingCommunicationLink.eIsProxy()) {
			InternalEObject oldIncomingCommunicationLink = (InternalEObject)incomingCommunicationLink;
			incomingCommunicationLink = (CommunicationLink)eResolveProxy(oldIncomingCommunicationLink);
			if (incomingCommunicationLink != oldIncomingCommunicationLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK, oldIncomingCommunicationLink, incomingCommunicationLink));
			}
		}
		return incomingCommunicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink basicGetIncomingCommunicationLink() {
		return incomingCommunicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingCommunicationLink(CommunicationLink newIncomingCommunicationLink, NotificationChain msgs) {
		CommunicationLink oldIncomingCommunicationLink = incomingCommunicationLink;
		incomingCommunicationLink = newIncomingCommunicationLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK, oldIncomingCommunicationLink, newIncomingCommunicationLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingCommunicationLink(CommunicationLink newIncomingCommunicationLink) {
		if (newIncomingCommunicationLink != incomingCommunicationLink) {
			NotificationChain msgs = null;
			if (incomingCommunicationLink != null)
				msgs = ((InternalEObject)incomingCommunicationLink).eInverseRemove(this, DeploymentPackage.COMMUNICATION_LINK__TARGET, CommunicationLink.class, msgs);
			if (newIncomingCommunicationLink != null)
				msgs = ((InternalEObject)newIncomingCommunicationLink).eInverseAdd(this, DeploymentPackage.COMMUNICATION_LINK__TARGET, CommunicationLink.class, msgs);
			msgs = basicSetIncomingCommunicationLink(newIncomingCommunicationLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK, newIncomingCommunicationLink, newIncomingCommunicationLink));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHardwareNode((HardwareNode)otherEnd, msgs);
			case DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK:
				if (outgoingCommunicationLink != null)
					msgs = ((InternalEObject)outgoingCommunicationLink).eInverseRemove(this, DeploymentPackage.COMMUNICATION_LINK__SOURCE, CommunicationLink.class, msgs);
				return basicSetOutgoingCommunicationLink((CommunicationLink)otherEnd, msgs);
			case DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK:
				if (incomingCommunicationLink != null)
					msgs = ((InternalEObject)incomingCommunicationLink).eInverseRemove(this, DeploymentPackage.COMMUNICATION_LINK__TARGET, CommunicationLink.class, msgs);
				return basicSetIncomingCommunicationLink((CommunicationLink)otherEnd, msgs);
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
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return basicSetHardwareNode(null, msgs);
			case DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK:
				return basicSetOutgoingCommunicationLink(null, msgs);
			case DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK:
				return basicSetIncomingCommunicationLink(null, msgs);
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
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return getHardwareNode();
			case DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK:
				if (resolve) return getOutgoingCommunicationLink();
				return basicGetOutgoingCommunicationLink();
			case DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK:
				if (resolve) return getIncomingCommunicationLink();
				return basicGetIncomingCommunicationLink();
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				return getDeployedPortInstance();
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
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				setHardwareNode((HardwareNode)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK:
				setOutgoingCommunicationLink((CommunicationLink)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK:
				setIncomingCommunicationLink((CommunicationLink)newValue);
				return;
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				getDeployedPortInstance().clear();
				getDeployedPortInstance().addAll((Collection<? extends PortInstance>)newValue);
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
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				setHardwareNode((HardwareNode)null);
				return;
			case DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK:
				setOutgoingCommunicationLink((CommunicationLink)null);
				return;
			case DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK:
				setIncomingCommunicationLink((CommunicationLink)null);
				return;
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				getDeployedPortInstance().clear();
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
			case DeploymentPackage.HARDWARE_PORT__HARDWARE_NODE:
				return getHardwareNode() != null;
			case DeploymentPackage.HARDWARE_PORT__OUTGOING_COMMUNICATION_LINK:
				return outgoingCommunicationLink != null;
			case DeploymentPackage.HARDWARE_PORT__INCOMING_COMMUNICATION_LINK:
				return incomingCommunicationLink != null;
			case DeploymentPackage.HARDWARE_PORT__DEPLOYED_PORT_INSTANCE:
				return deployedPortInstance != null && !deployedPortInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwarePortImpl
