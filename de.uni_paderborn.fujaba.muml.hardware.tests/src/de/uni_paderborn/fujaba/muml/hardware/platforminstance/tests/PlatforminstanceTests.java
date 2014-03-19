/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>platforminstance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatforminstanceTests extends TestSuite {

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
		TestSuite suite = new PlatforminstanceTests("platforminstance Tests");
		suite.addTestSuite(HWPlatformInstanceTest.class);
		suite.addTestSuite(HWPlatformInstanceConfigurationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatforminstanceTests(String name) {
		super(name);
	}

} //PlatforminstanceTests
