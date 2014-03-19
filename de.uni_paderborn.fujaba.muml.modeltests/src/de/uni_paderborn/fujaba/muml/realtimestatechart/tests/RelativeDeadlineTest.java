/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relative Deadline</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelativeDeadlineTest extends DeadlineTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelativeDeadlineTest.class);
	}

	/**
	 * Constructs a new Relative Deadline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDeadlineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relative Deadline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelativeDeadline getFixture() {
		return (RelativeDeadline)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimestatechartFactory.eINSTANCE.createRelativeDeadline());
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

} //RelativeDeadlineTest
