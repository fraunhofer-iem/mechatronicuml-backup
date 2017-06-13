/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.CoordinationProtocolPart;
import org.muml.pim.component.PortPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.impl.AssemblyConnectorImpl#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.AssemblyConnectorImpl#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends PortConnectorImpl implements AssemblyConnector {
	/**
	 * The cached setting delegate for the '{@link #getCoordinationProtocolPart() <em>Coordination Protocol Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocolPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COORDINATION_PROTOCOL_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_PART).getSettingDelegate();

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
	public CoordinationProtocolPart getCoordinationProtocolPart() {
		return (CoordinationProtocolPart)COORDINATION_PROTOCOL_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocolPart basicGetCoordinationProtocolPart() {
		return (CoordinationProtocolPart)COORDINATION_PROTOCOL_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_PART:
				if (resolve) return getCoordinationProtocolPart();
				return basicGetCoordinationProtocolPart();
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
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL_PART:
				return COORDINATION_PROTOCOL_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.ASSEMBLY_CONNECTOR__PORT_PARTS:
				return PORT_PARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl
