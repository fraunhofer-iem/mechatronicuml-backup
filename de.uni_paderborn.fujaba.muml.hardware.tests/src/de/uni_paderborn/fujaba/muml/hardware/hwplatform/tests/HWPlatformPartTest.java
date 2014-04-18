/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HW Platform Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges() <em>Embedded Bridges</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class HWPlatformPartTest extends PlatformPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HWPlatformPartTest.class);
	}

	/**
	 * Constructs a new HW Platform Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this HW Platform Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HWPlatformPart getFixture() {
		return (HWPlatformPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatformFactory.eINSTANCE.createHWPlatformPart());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges() <em>Embedded Bridges</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart#getEmbeddedBridges()
	 * @generated
	 */
	public void testGetEmbeddedBridges() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //HWPlatformPartTest
