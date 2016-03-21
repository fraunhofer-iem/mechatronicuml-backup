/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>properties</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesTests extends TestSuite {

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
		TestSuite suite = new PropertiesTests("properties Tests");
		suite.addTestSuite(WCETTest.class);
		suite.addTestSuite(RequiredMemoryTest.class);
		suite.addTestSuite(SchedulingTest.class);
		suite.addTestSuite(MessageFrameTest.class);
		suite.addTestSuite(CANMessageFrameTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesTests(String name) {
		super(name);
	}

} //PropertiesTests
