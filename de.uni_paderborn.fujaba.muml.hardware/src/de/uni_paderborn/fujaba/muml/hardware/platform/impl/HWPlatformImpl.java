/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl#getEmbeddedCommunicationResources <em>Embedded Communication Resources</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.HWPlatformImpl#getDelegations <em>Delegations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPlatformImpl extends NamedElementImpl implements HWPlatform {
	/**
	 * The cached value of the '{@link #getEmbeddedPlatformParts() <em>Embedded Platform Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedPlatformParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformPart> embeddedPlatformParts;

	/**
	 * The cached value of the '{@link #getEmbeddedCommunicationResources() <em>Embedded Communication Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedCommunicationResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationResource> embeddedCommunicationResources;

	/**
	 * The cached value of the '{@link #getDelegationPorts() <em>Delegation Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPortInstance> delegationPorts;

	/**
	 * The cached value of the '{@link #getDelegations() <em>Delegations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegations()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.HW_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformPart> getEmbeddedPlatformParts() {
		if (embeddedPlatformParts == null) {
			embeddedPlatformParts = new EObjectContainmentWithInverseEList<PlatformPart>(PlatformPart.class, this, PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS, PlatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM);
		}
		return embeddedPlatformParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationResource> getEmbeddedCommunicationResources() {
		if (embeddedCommunicationResources == null) {
			embeddedCommunicationResources = new EObjectContainmentEList<CommunicationResource>(CommunicationResource.class, this, PlatformPackage.HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES);
		}
		return embeddedCommunicationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPortInstance> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentEList<HWPortInstance>(HWPortInstance.class, this, PlatformPackage.HW_PLATFORM__DELEGATION_PORTS);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegations() {
		if (delegations == null) {
			delegations = new EObjectContainmentEList<Delegation>(Delegation.class, this, PlatformPackage.HW_PLATFORM__DELEGATIONS);
		}
		return delegations;
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
			case PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedPlatformParts()).basicAdd(otherEnd, msgs);
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
			case PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return ((InternalEList<?>)getEmbeddedPlatformParts()).basicRemove(otherEnd, msgs);
			case PlatformPackage.HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES:
				return ((InternalEList<?>)getEmbeddedCommunicationResources()).basicRemove(otherEnd, msgs);
			case PlatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return ((InternalEList<?>)getDelegationPorts()).basicRemove(otherEnd, msgs);
			case PlatformPackage.HW_PLATFORM__DELEGATIONS:
				return ((InternalEList<?>)getDelegations()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return getEmbeddedPlatformParts();
			case PlatformPackage.HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES:
				return getEmbeddedCommunicationResources();
			case PlatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return getDelegationPorts();
			case PlatformPackage.HW_PLATFORM__DELEGATIONS:
				return getDelegations();
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
			case PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				getEmbeddedPlatformParts().clear();
				getEmbeddedPlatformParts().addAll((Collection<? extends PlatformPart>)newValue);
				return;
			case PlatformPackage.HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES:
				getEmbeddedCommunicationResources().clear();
				getEmbeddedCommunicationResources().addAll((Collection<? extends CommunicationResource>)newValue);
				return;
			case PlatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends HWPortInstance>)newValue);
				return;
			case PlatformPackage.HW_PLATFORM__DELEGATIONS:
				getDelegations().clear();
				getDelegations().addAll((Collection<? extends Delegation>)newValue);
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
			case PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				getEmbeddedPlatformParts().clear();
				return;
			case PlatformPackage.HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES:
				getEmbeddedCommunicationResources().clear();
				return;
			case PlatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				getDelegationPorts().clear();
				return;
			case PlatformPackage.HW_PLATFORM__DELEGATIONS:
				getDelegations().clear();
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
			case PlatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
				return embeddedPlatformParts != null && !embeddedPlatformParts.isEmpty();
			case PlatformPackage.HW_PLATFORM__EMBEDDED_COMMUNICATION_RESOURCES:
				return embeddedCommunicationResources != null && !embeddedCommunicationResources.isEmpty();
			case PlatformPackage.HW_PLATFORM__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
			case PlatformPackage.HW_PLATFORM__DELEGATIONS:
				return delegations != null && !delegations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformImpl
