/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.tests.HwvaluetypeTests;
import de.uni_paderborn.fujaba.muml.hardware.platform.tests.PlatformTests;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.tests.PlatforminstanceTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Hardware</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareAllTests extends TestSuite {

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
		TestSuite suite = new HardwareAllTests("Hardware Tests");
		suite.addTest(ResourcetypeTests.suite());
		suite.addTest(PlatformTests.suite());
		suite.addTest(HwvaluetypeTests.suite());
		suite.addTest(PlatforminstanceTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareAllTests(String name) {
		super(name);
	}

} //HardwareAllTests
