/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage
 * @generated
 */
public interface ProtocolinstantiationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtocolinstantiationFactory eINSTANCE = de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Broadcast Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Port</em>'.
	 * @generated
	 */
	BroadcastPort createBroadcastPort();

	/**
	 * Returns a new object of class '<em>Protocol Instantiation Port Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Instantiation Port Specification</em>'.
	 * @generated
	 */
	ProtocolInstantiationPortSpecification createProtocolInstantiationPortSpecification();

	/**
	 * Returns a new object of class '<em>Discovery Port Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery Port Specification</em>'.
	 * @generated
	 */
	DiscoveryPortSpecification createDiscoveryPortSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProtocolinstantiationPackage getProtocolinstantiationPackage();

} //ProtocolinstantiationFactory
