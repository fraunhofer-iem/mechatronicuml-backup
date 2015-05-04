/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocolRepository;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourceFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Protocol Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationProtocolRepositoryTest extends TestCase {

	/**
	 * The fixture for this Communication Protocol Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationProtocolRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationProtocolRepositoryTest.class);
	}

	/**
	 * Constructs a new Communication Protocol Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocolRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Communication Protocol Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CommunicationProtocolRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Communication Protocol Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationProtocolRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwresourceFactory.eINSTANCE.createCommunicationProtocolRepository());
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

} //CommunicationProtocolRepositoryTest
