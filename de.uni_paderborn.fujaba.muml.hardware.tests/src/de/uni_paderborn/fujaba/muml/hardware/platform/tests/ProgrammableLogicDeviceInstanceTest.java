/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.ProgrammableLogicDeviceInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programmable Logic Device Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammableLogicDeviceInstanceTest extends ComputingResourceInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammableLogicDeviceInstanceTest.class);
	}

	/**
	 * Constructs a new Programmable Logic Device Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammableLogicDeviceInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Programmable Logic Device Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProgrammableLogicDeviceInstance getFixture() {
		return (ProgrammableLogicDeviceInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createProgrammableLogicDeviceInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProgrammableLogicDeviceInstanceTest
