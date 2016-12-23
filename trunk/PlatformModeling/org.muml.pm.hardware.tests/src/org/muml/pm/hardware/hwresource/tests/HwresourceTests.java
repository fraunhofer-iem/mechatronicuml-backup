/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwresource.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hwresource</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwresourceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new HwresourceTests("hwresource Tests");
		suite.addTestSuite(MemoryResourceTest.class);
		suite.addTestSuite(DeviceTest.class);
		suite.addTestSuite(CacheTest.class);
		suite.addTestSuite(ProgrammableLogicDeviceTest.class);
		suite.addTestSuite(ProcessorTest.class);
		suite.addTestSuite(StructuredResourceTest.class);
		suite.addTestSuite(ResourceRepositoryTest.class);
		suite.addTestSuite(CommunicationProtocolRepositoryTest.class);
		suite.addTestSuite(BusProtocolTest.class);
		suite.addTestSuite(LinkProtocolTest.class);
		suite.addTestSuite(CommunicationResourceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceTests(String name) {
		super(name);
	}

} //HwresourceTests
