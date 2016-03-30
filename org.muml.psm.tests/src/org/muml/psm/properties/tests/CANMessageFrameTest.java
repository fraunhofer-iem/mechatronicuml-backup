/**
 */
package org.muml.psm.properties.tests;

import org.muml.psm.properties.CANMessageFrame;
import org.muml.psm.properties.PropertiesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CAN Message Frame</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CANMessageFrameTest extends MessageFrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CANMessageFrameTest.class);
	}

	/**
	 * Constructs a new CAN Message Frame test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CANMessageFrameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CAN Message Frame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CANMessageFrame getFixture() {
		return (CANMessageFrame)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PropertiesFactory.eINSTANCE.createCANMessageFrame());
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

} //CANMessageFrameTest
