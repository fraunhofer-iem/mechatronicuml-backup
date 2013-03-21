/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Absolute Deadline</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsoluteDeadlineTest extends DeadlineTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbsoluteDeadlineTest.class);
	}

	/**
	 * Constructs a new Absolute Deadline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteDeadlineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Absolute Deadline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbsoluteDeadline getFixture() {
		return (AbsoluteDeadline)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline());
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

} //AbsoluteDeadlineTest
