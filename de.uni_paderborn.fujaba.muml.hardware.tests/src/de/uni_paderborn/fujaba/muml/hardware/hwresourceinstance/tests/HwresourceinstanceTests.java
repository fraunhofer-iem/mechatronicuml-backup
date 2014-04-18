/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hwresourceinstance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwresourceinstanceTests extends TestSuite {

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
		TestSuite suite = new HwresourceinstanceTests("hwresourceinstance Tests");
		suite.addTestSuite(StorageMemoryInstanceTest.class);
		suite.addTestSuite(ProcessingMemoryInstanceTest.class);
		suite.addTestSuite(CacheInstanceTest.class);
		suite.addTestSuite(ProgrammableLogicDeviceInstanceTest.class);
		suite.addTestSuite(ProcessorInstanceTest.class);
		suite.addTestSuite(StructuredResourceInstanceTest.class);
		suite.addTestSuite(SensorInstanceTest.class);
		suite.addTestSuite(ActuatorInstanceTest.class);
		suite.addTestSuite(ResourceInstanceRepositoryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwresourceinstanceTests(String name) {
		super(name);
	}

} //HwresourceinstanceTests
