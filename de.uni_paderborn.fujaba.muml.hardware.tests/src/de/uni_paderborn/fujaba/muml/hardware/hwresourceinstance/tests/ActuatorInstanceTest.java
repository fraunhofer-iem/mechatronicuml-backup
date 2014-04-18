/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ActuatorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstanceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actuator Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActuatorInstanceTest extends DeviceInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActuatorInstanceTest.class);
	}

	/**
	 * Constructs a new Actuator Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actuator Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActuatorInstance getFixture() {
		return (ActuatorInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwresourceinstanceFactory.eINSTANCE.createActuatorInstance());
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

} //ActuatorInstanceTest
