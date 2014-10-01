/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedBusInstance() <em>Connected Bus Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedHWPortInstances() <em>Connected HW Port Instances</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BusConnectorInstanceTest extends NetworkingHardwareInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusConnectorInstanceTest.class);
	}

	/**
	 * Constructs a new Bus Connector Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusConnectorInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Connector Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusConnectorInstance getFixture() {
		return (BusConnectorInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatforminstanceFactory.eINSTANCE.createBusConnectorInstance());
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

	/**
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedBusInstance() <em>Connected Bus Instance</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedBusInstance()
	 * @generated
	 */
	public void testGetConnectedBusInstance() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedHWPortInstances() <em>Connected HW Port Instances</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance#getConnectedHWPortInstances()
	 * @generated
	 */
	public void testGetConnectedHWPortInstances() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BusConnectorInstanceTest
