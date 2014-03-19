/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>resourcetype</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcetypeTests extends TestSuite {

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
		TestSuite suite = new ResourcetypeTests("resourcetype Tests");
		suite.addTestSuite(MemoryResourceTest.class);
		suite.addTestSuite(DeviceTest.class);
		suite.addTestSuite(CacheTest.class);
		suite.addTestSuite(ProgrammableLogicDeviceTest.class);
		suite.addTestSuite(ProcessorTest.class);
		suite.addTestSuite(StructuredResourceTest.class);
		suite.addTestSuite(HWPortTest.class);
		suite.addTestSuite(ResourceTypeRepositoryTest.class);
		suite.addTestSuite(BusProtocolTest.class);
		suite.addTestSuite(LinkProtocolTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypeTests(String name) {
		super(name);
	}

} //ResourcetypeTests
