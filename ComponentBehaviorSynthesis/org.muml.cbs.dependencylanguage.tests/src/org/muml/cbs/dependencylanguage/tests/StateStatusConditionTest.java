/**
 */
package org.muml.cbs.dependencylanguage.tests;

import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.StateStatusCondition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Status Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateStatusConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StateStatusConditionTest.class);
	}

	/**
	 * Constructs a new State Status Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateStatusConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this State Status Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StateStatusCondition getFixture() {
		return (StateStatusCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependencylanguageFactory.eINSTANCE.createStateStatusCondition());
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

} //StateStatusConditionTest
