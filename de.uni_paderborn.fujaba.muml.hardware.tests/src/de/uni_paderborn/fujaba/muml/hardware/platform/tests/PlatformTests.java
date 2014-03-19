/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>platform</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformTests extends TestSuite {

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
		TestSuite suite = new PlatformTests("platform Tests");
		suite.addTestSuite(HWPlatformConfigurationTest.class);
		suite.addTestSuite(StorageMemoryInstanceTest.class);
		suite.addTestSuite(ProcessingMemoryInstanceTest.class);
		suite.addTestSuite(CacheInstanceTest.class);
		suite.addTestSuite(ProgrammableLogicDeviceInstanceTest.class);
		suite.addTestSuite(ProcessorInstanceTest.class);
		suite.addTestSuite(StructuredResourceInstanceTest.class);
		suite.addTestSuite(BusTest.class);
		suite.addTestSuite(LinkTest.class);
		suite.addTestSuite(HWPlatformTest.class);
		suite.addTestSuite(HWPlatformPartTest.class);
		suite.addTestSuite(SensorInstanceTest.class);
		suite.addTestSuite(ActuatorInstanceTest.class);
		suite.addTestSuite(BridgeTest.class);
		suite.addTestSuite(BusPortInstanceTest.class);
		suite.addTestSuite(LinkPortInstanceTest.class);
		suite.addTestSuite(ResourceInstanceRepositoryTest.class);
		suite.addTestSuite(ResourceInstancePartTest.class);
		suite.addTestSuite(DelegationTest.class);
		suite.addTestSuite(HWPortPartTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformTests(String name) {
		super(name);
	}

} //PlatformTests
