/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProgrammableLogicDevice;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programmable Logic Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammableLogicDeviceTest extends ComputingResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammableLogicDeviceTest.class);
	}

	/**
	 * Constructs a new Programmable Logic Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammableLogicDeviceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Programmable Logic Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProgrammableLogicDevice getFixture() {
		return (ProgrammableLogicDevice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createProgrammableLogicDevice());
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

} //ProgrammableLogicDeviceTest
