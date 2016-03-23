/**
 */
package org.muml.cbs.dependencylanguage.tests;

import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.HybridClockCondition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hybrid Clock Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridClockConditionTest extends ClockConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HybridClockConditionTest.class);
	}

	/**
	 * Constructs a new Hybrid Clock Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridClockConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hybrid Clock Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HybridClockCondition getFixture() {
		return (HybridClockCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependencylanguageFactory.eINSTANCE.createHybridClockCondition());
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

} //HybridClockConditionTest
