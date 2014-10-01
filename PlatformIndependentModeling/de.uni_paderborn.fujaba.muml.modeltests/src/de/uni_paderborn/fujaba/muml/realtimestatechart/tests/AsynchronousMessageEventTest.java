/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asynchronous Message Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMessageEventTest extends TransitionEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsynchronousMessageEventTest.class);
	}

	/**
	 * Constructs a new Asynchronous Message Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asynchronous Message Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsynchronousMessageEvent getFixture() {
		return (AsynchronousMessageEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimestatechartFactory.eINSTANCE.createAsynchronousMessageEvent());
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

} //AsynchronousMessageEventTest
