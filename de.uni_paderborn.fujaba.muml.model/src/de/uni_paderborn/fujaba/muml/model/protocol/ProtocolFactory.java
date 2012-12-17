/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.protocol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.protocol.ProtocolPackage
 * @generated
 */
public interface ProtocolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtocolFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.protocol.impl.ProtocolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connector</em>'.
	 * @generated
	 */
	RoleConnector createRoleConnector();

	/**
	 * Returns a new object of class '<em>Coordination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Protocol</em>'.
	 * @generated
	 */
	CoordinationProtocol createCoordinationProtocol();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Buffer</em>'.
	 * @generated
	 */
	MessageBuffer createMessageBuffer();

	/**
	 * Returns a new object of class '<em>Connector Quality Of Service Assumptions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Quality Of Service Assumptions</em>'.
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions createConnectorQualityOfServiceAssumptions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProtocolPackage getProtocolPackage();

} //ProtocolFactory
