/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.deployment.impl;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.muml.model.deployment.Deployment;
import de.uni_paderborn.fujaba.muml.model.deployment.DeploymentPackage;
import de.uni_paderborn.fujaba.muml.model.deployment.QualityOfLinkService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.core.CorePackage;
import org.storydriven.core.NamedElement;

import org.storydriven.core.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Of Link Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.QualityOfLinkServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.QualityOfLinkServiceImpl#getPacketDelayVariation <em>Packet Delay Variation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.QualityOfLinkServiceImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.deployment.impl.QualityOfLinkServiceImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityOfLinkServiceImpl extends CommentableElementImpl implements QualityOfLinkService {
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
	 * The cached value of the '{@link #getPacketDelayVariation() <em>Packet Delay Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketDelayVariation()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber packetDelayVariation;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber latency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityOfLinkServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.QUALITY_OF_LINK_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getPacketDelayVariation() {
		return packetDelayVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacketDelayVariation(NaturalNumber newPacketDelayVariation, NotificationChain msgs) {
		NaturalNumber oldPacketDelayVariation = packetDelayVariation;
		packetDelayVariation = newPacketDelayVariation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION, oldPacketDelayVariation, newPacketDelayVariation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketDelayVariation(NaturalNumber newPacketDelayVariation) {
		if (newPacketDelayVariation != packetDelayVariation) {
			NotificationChain msgs = null;
			if (packetDelayVariation != null)
				msgs = ((InternalEObject)packetDelayVariation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION, null, msgs);
			if (newPacketDelayVariation != null)
				msgs = ((InternalEObject)newPacketDelayVariation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION, null, msgs);
			msgs = basicSetPacketDelayVariation(newPacketDelayVariation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION, newPacketDelayVariation, newPacketDelayVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(NaturalNumber newLatency, NotificationChain msgs) {
		NaturalNumber oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY, oldLatency, newLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(NaturalNumber newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject)latency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject)newLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY, newLatency, newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID() != DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT) return null;
		return (Deployment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeployment, DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer() || (eContainerFeatureID() != DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, newDeployment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES, Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
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
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION:
				return basicSetPacketDelayVariation(null, msgs);
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY:
				return basicSetLatency(null, msgs);
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
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
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
				return eInternalContainer().eInverseRemove(this, DeploymentPackage.DEPLOYMENT__QUALITY_OF_LINK_SERVICES, Deployment.class, msgs);
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
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME:
				return getName();
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION:
				return getPacketDelayVariation();
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY:
				return getLatency();
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
				return getDeployment();
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
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME:
				setName((String)newValue);
				return;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION:
				setPacketDelayVariation((NaturalNumber)newValue);
				return;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY:
				setLatency((NaturalNumber)newValue);
				return;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
				setDeployment((Deployment)newValue);
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
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION:
				setPacketDelayVariation((NaturalNumber)null);
				return;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY:
				setLatency((NaturalNumber)null);
				return;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
				setDeployment((Deployment)null);
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
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__PACKET_DELAY_VARIATION:
				return packetDelayVariation != null;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__LATENCY:
				return latency != null;
			case DeploymentPackage.QUALITY_OF_LINK_SERVICE__DEPLOYMENT:
				return getDeployment() != null;
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME: return CorePackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return DeploymentPackage.QUALITY_OF_LINK_SERVICE__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QualityOfLinkServiceImpl
