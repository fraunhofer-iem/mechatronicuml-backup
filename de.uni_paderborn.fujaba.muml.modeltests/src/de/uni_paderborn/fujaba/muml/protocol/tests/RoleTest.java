/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.tests;

import de.uni_paderborn.fujaba.muml.connector.tests.DiscreteInteractionEndpointTest;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory;
import de.uni_paderborn.fujaba.muml.protocol.Role;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector() <em>Role Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.protocol.Role#isMultiRole() <em>Multi Role</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RoleTest extends DiscreteInteractionEndpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleTest.class);
	}

	/**
	 * Constructs a new Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Role getFixture() {
		return (Role)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProtocolFactory.eINSTANCE.createRole());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector() <em>Role Connector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.protocol.Role#getRoleConnector()
	 * @generated
	 */
	public void testGetRoleConnector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.protocol.Role#isMultiRole() <em>Multi Role</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.protocol.Role#isMultiRole()
	 * @generated
	 */
	public void testIsMultiRole() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RoleTest
