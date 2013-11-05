/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointImpl;
import de.uni_paderborn.fujaba.muml.protocol.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.PortPartImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.PortPartImpl#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.PortPartImpl#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.PortPartImpl#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.PortPartImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortPartImpl extends ConnectorEndpointImpl implements PortPart {
	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected Port portType;

	/**
	 * The cached value of the '{@link #getCoordinationProtocolOccurence() <em>Coordination Protocol Occurence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocolOccurence()
	 * @generated
	 * @ordered
	 */
	protected CoordinationProtocolOccurrence coordinationProtocolOccurence;

	/**
	 * The cached setting delegate for the '{@link #getRefinedRole() <em>Refined Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRole()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFINED_ROLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT_PART__REFINED_ROLE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT_PART__NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PortPartImpl() {
		super();

		// Install a notification adapter
		DerivedAttributeAdapter requiredDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.PORT_PART__NAME);
		requiredDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.PORT_PART__PORT_TYPE, CorePackage.Literals.NAMED_ELEMENT__NAME);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.PORT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (Port)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PORT_PART__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(Port newPortType) {
		Port oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT_PART__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart getComponentPart() {
		if (eContainerFeatureID() != ComponentPackage.PORT_PART__COMPONENT_PART) return null;
		return (ComponentPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentPart(ComponentPart newComponentPart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentPart, ComponentPackage.PORT_PART__COMPONENT_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPart(ComponentPart newComponentPart) {
		if (newComponentPart != eInternalContainer() || (eContainerFeatureID() != ComponentPackage.PORT_PART__COMPONENT_PART && newComponentPart != null)) {
			if (EcoreUtil.isAncestor(this, newComponentPart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentPart != null)
				msgs = ((InternalEObject)newComponentPart).eInverseAdd(this, ComponentPackage.COMPONENT_PART__PORT_PARTS, ComponentPart.class, msgs);
			msgs = basicSetComponentPart(newComponentPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT_PART__COMPONENT_PART, newComponentPart, newComponentPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence getCoordinationProtocolOccurence() {
		if (coordinationProtocolOccurence != null && coordinationProtocolOccurence.eIsProxy()) {
			InternalEObject oldCoordinationProtocolOccurence = (InternalEObject)coordinationProtocolOccurence;
			coordinationProtocolOccurence = (CoordinationProtocolOccurrence)eResolveProxy(oldCoordinationProtocolOccurence);
			if (coordinationProtocolOccurence != oldCoordinationProtocolOccurence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE, oldCoordinationProtocolOccurence, coordinationProtocolOccurence));
			}
		}
		return coordinationProtocolOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence basicGetCoordinationProtocolOccurence() {
		return coordinationProtocolOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationProtocolOccurence(CoordinationProtocolOccurrence newCoordinationProtocolOccurence, NotificationChain msgs) {
		CoordinationProtocolOccurrence oldCoordinationProtocolOccurence = coordinationProtocolOccurence;
		coordinationProtocolOccurence = newCoordinationProtocolOccurence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE, oldCoordinationProtocolOccurence, newCoordinationProtocolOccurence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocolOccurence(CoordinationProtocolOccurrence newCoordinationProtocolOccurence) {
		if (newCoordinationProtocolOccurence != coordinationProtocolOccurence) {
			NotificationChain msgs = null;
			if (coordinationProtocolOccurence != null)
				msgs = ((InternalEObject)coordinationProtocolOccurence).eInverseRemove(this, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS, CoordinationProtocolOccurrence.class, msgs);
			if (newCoordinationProtocolOccurence != null)
				msgs = ((InternalEObject)newCoordinationProtocolOccurence).eInverseAdd(this, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS, CoordinationProtocolOccurrence.class, msgs);
			msgs = basicSetCoordinationProtocolOccurence(newCoordinationProtocolOccurence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE, newCoordinationProtocolOccurence, newCoordinationProtocolOccurence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefinedRole() {
		return (Role)REFINED_ROLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefinedRole() {
		return (Role)REFINED_ROLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentPart((ComponentPart)otherEnd, msgs);
			case ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE:
				if (coordinationProtocolOccurence != null)
					msgs = ((InternalEObject)coordinationProtocolOccurence).eInverseRemove(this, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS, CoordinationProtocolOccurrence.class, msgs);
				return basicSetCoordinationProtocolOccurence((CoordinationProtocolOccurrence)otherEnd, msgs);
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
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				return basicSetComponentPart(null, msgs);
			case ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE:
				return basicSetCoordinationProtocolOccurence(null, msgs);
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
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				return eInternalContainer().eInverseRemove(this, ComponentPackage.COMPONENT_PART__PORT_PARTS, ComponentPart.class, msgs);
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
			case ComponentPackage.PORT_PART__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				return getComponentPart();
			case ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE:
				if (resolve) return getCoordinationProtocolOccurence();
				return basicGetCoordinationProtocolOccurence();
			case ComponentPackage.PORT_PART__REFINED_ROLE:
				if (resolve) return getRefinedRole();
				return basicGetRefinedRole();
			case ComponentPackage.PORT_PART__NAME:
				return getName();
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
			case ComponentPackage.PORT_PART__PORT_TYPE:
				setPortType((Port)newValue);
				return;
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				setComponentPart((ComponentPart)newValue);
				return;
			case ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE:
				setCoordinationProtocolOccurence((CoordinationProtocolOccurrence)newValue);
				return;
			case ComponentPackage.PORT_PART__NAME:
				setName((String)newValue);
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
			case ComponentPackage.PORT_PART__PORT_TYPE:
				setPortType((Port)null);
				return;
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				setComponentPart((ComponentPart)null);
				return;
			case ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE:
				setCoordinationProtocolOccurence((CoordinationProtocolOccurrence)null);
				return;
			case ComponentPackage.PORT_PART__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case ComponentPackage.PORT_PART__PORT_TYPE:
				return portType != null;
			case ComponentPackage.PORT_PART__COMPONENT_PART:
				return getComponentPart() != null;
			case ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE:
				return coordinationProtocolOccurence != null;
			case ComponentPackage.PORT_PART__REFINED_ROLE:
				return REFINED_ROLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.PORT_PART__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //PortPartImpl
