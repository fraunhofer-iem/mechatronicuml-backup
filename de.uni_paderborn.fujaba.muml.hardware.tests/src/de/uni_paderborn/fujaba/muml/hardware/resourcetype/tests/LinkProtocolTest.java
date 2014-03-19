/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Protocol</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkProtocolTest extends CommunicationProtocolTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkProtocolTest.class);
	}

	/**
	 * Constructs a new Link Protocol test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProtocolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Protocol test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkProtocol getFixture() {
		return (LinkProtocol)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createLinkProtocol());
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

} //LinkProtocolTest
