/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus#getConnectedBusPortInstances() <em>Connected Bus Port Instances</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BusTest extends CommunicationMediaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusTest.class);
	}

	/**
	 * Constructs a new Bus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Bus getFixture() {
		return (Bus)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createBus());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus#getConnectedBusPortInstances() <em>Connected Bus Port Instances</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Bus#getConnectedBusPortInstances()
	 * @generated
	 */
	public void testGetConnectedBusPortInstances() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BusTest
