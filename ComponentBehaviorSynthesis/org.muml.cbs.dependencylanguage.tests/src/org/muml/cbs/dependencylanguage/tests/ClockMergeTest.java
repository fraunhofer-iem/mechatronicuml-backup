/**
 */
package org.muml.cbs.dependencylanguage.tests;

import org.muml.cbs.dependencylanguage.ClockMerge;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clock Merge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClockMergeTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClockMergeTest.class);
	}

	/**
	 * Constructs a new Clock Merge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockMergeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clock Merge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClockMerge getFixture() {
		return (ClockMerge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependencylanguageFactory.eINSTANCE.createClockMerge());
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

} //ClockMergeTest
