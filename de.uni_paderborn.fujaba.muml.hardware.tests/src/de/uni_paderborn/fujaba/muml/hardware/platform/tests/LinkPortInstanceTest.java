/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance#getConnectedLink() <em>Connected Link</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LinkPortInstanceTest extends HWPortInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkPortInstanceTest.class);
	}

	/**
	 * Constructs a new Link Port Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPortInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Port Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkPortInstance getFixture() {
		return (LinkPortInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createLinkPortInstance());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance#getConnectedLink() <em>Connected Link</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.LinkPortInstance#getConnectedLink()
	 * @generated
	 */
	public void testGetConnectedLink() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //LinkPortInstanceTest
