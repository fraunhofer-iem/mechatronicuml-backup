/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.protocol.MessageBuffer;
import de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageBufferTest extends TestCase {

	/**
	 * The fixture for this Message Buffer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBuffer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageBufferTest.class);
	}

	/**
	 * Constructs a new Message Buffer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBufferTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Message Buffer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MessageBuffer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Message Buffer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageBuffer getFixture() {
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
		setFixture(ProtocolFactory.eINSTANCE.createMessageBuffer());
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

} //MessageBufferTest
