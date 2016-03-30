/**
 */
package org.muml.pm.hardware.hwresource;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage
 * @generated
 */
public interface HwresourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwresourceFactory eINSTANCE = org.muml.pm.hardware.hwresource.impl.HwresourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Resource</em>'.
	 * @generated
	 */
	MemoryResource createMemoryResource();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache</em>'.
	 * @generated
	 */
	Cache createCache();

	/**
	 * Returns a new object of class '<em>Programmable Logic Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programmable Logic Device</em>'.
	 * @generated
	 */
	ProgrammableLogicDevice createProgrammableLogicDevice();

	/**
	 * Returns a new object of class '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Structured Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Resource</em>'.
	 * @generated
	 */
	StructuredResource createStructuredResource();

	/**
	 * Returns a new object of class '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Repository</em>'.
	 * @generated
	 */
	ResourceRepository createResourceRepository();

	/**
	 * Returns a new object of class '<em>Communication Protocol Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Protocol Repository</em>'.
	 * @generated
	 */
	CommunicationProtocolRepository createCommunicationProtocolRepository();

	/**
	 * Returns a new object of class '<em>Bus Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Protocol</em>'.
	 * @generated
	 */
	BusProtocol createBusProtocol();

	/**
	 * Returns a new object of class '<em>Link Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Protocol</em>'.
	 * @generated
	 */
	LinkProtocol createLinkProtocol();

	/**
	 * Returns a new object of class '<em>Communication Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Resource</em>'.
	 * @generated
	 */
	CommunicationResource createCommunicationResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwresourcePackage getHwresourcePackage();

} //HwresourceFactory
