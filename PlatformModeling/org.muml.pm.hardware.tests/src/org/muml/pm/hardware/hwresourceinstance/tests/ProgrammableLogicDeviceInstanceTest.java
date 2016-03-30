/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwresourceinstance.tests;

import org.muml.pm.hardware.hwresourceinstance.HwresourceinstanceFactory;
import org.muml.pm.hardware.hwresourceinstance.ProgrammableLogicDeviceInstance;

import junit.textui.TestRunner;

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
		setFixture(HwresourceinstanceFactory.eINSTANCE.createProgrammableLogicDeviceInstance());
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
