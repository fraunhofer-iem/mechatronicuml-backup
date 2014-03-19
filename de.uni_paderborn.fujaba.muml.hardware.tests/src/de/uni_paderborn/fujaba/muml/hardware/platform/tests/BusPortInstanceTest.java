/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance#getConnectedBus() <em>Connected Bus</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BusPortInstanceTest extends HWPortInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusPortInstanceTest.class);
	}

	/**
	 * Constructs a new Bus Port Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusPortInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Port Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusPortInstance getFixture() {
		return (BusPortInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createBusPortInstance());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance#getConnectedBus() <em>Connected Bus</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance#getConnectedBus()
	 * @generated
	 */
	public void testGetConnectedBus() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BusPortInstanceTest
