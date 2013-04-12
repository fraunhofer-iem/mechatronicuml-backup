/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.AssemblyConnectorImpl#getCoordinationProtocolOccurence <em>Coordination Protocol Occurence</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.AssemblyConnectorImpl#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends PortConnectorImpl implements AssemblyConnector {
	/**
	 * The cached setting delegate for the '{@link #getCoordinationProtocolOccurence() <em>Coordination Protocol Occurence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocolOccurence()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COORDINATION_PROTOCOL_OCCURENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_OCCURENCE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPortParts() <em>Port Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortParts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_PARTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.ASSEMBLY_CONNECTOR__PORT_PARTS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence getCoordinationProtocolOccurence() {
		return (CoordinationProtocolOccurrence)COORDINATION_PROTOCOL_OCCURENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolOccurrence basicGetCoordinationProtocolOccurence() {
		return (CoordinationProtocolOccurrence)COORDINATION_PROTOCOL_OCCURENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortPart> getPortParts() {
		return (EList<PortPart>)PORT_PARTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_OCCURENCE:
				if (resolve) return getCoordinationProtocolOccurence();
				return basicGetCoordinationProtocolOccurence();
			case ComponentPackage.ASSEMBLY_CONNECTOR__PORT_PARTS:
				return getPortParts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_OCCURENCE:
				return COORDINATION_PROTOCOL_OCCURENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.ASSEMBLY_CONNECTOR__PORT_PARTS:
				return PORT_PARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl
