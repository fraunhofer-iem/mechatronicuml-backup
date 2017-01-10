/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.ProtocolFactory;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.protocol.Role;
import org.muml.pim.protocol.RoleConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolFactoryImpl extends EFactoryImpl implements ProtocolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtocolFactory init() {
		try {
			ProtocolFactory theProtocolFactory = (ProtocolFactory)EPackage.Registry.INSTANCE.getEFactory(ProtocolPackage.eNS_URI);
			if (theProtocolFactory != null) {
				return theProtocolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProtocolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProtocolPackage.COORDINATION_PROTOCOL: return createCoordinationProtocol();
			case ProtocolPackage.ROLE: return createRole();
			case ProtocolPackage.ROLE_CONNECTOR: return createRoleConnector();
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS: return createConnectorQualityOfServiceAssumptions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector createRoleConnector() {
		RoleConnectorImpl roleConnector = new RoleConnectorImpl();
		return roleConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol createCoordinationProtocol() {
		CoordinationProtocolImpl coordinationProtocol = new CoordinationProtocolImpl();
		return coordinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptions createConnectorQualityOfServiceAssumptions() {
		ConnectorQualityOfServiceAssumptionsImpl connectorQualityOfServiceAssumptions = new ConnectorQualityOfServiceAssumptionsImpl();
		return connectorQualityOfServiceAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolPackage getProtocolPackage() {
		return (ProtocolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProtocolPackage getPackage() {
		return ProtocolPackage.eINSTANCE;
	}

} //ProtocolFactoryImpl
