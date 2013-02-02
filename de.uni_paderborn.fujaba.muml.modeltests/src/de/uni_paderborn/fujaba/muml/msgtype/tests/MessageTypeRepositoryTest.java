/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.msgtype.tests;

import de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository;
import de.uni_paderborn.fujaba.muml.msgtype.MsgtypeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageTypeRepositoryTest extends TestCase {

	/**
	 * The fixture for this Message Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageTypeRepositoryTest.class);
	}

	/**
	 * Constructs a new Message Type Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Message Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MessageTypeRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Message Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeRepository getFixture() {
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
		setFixture(MsgtypeFactory.eINSTANCE.createMessageTypeRepository());
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

} //MessageTypeRepositoryTest
