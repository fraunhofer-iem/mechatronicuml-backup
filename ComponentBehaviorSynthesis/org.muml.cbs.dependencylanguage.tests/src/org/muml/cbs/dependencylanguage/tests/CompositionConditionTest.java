/**
 */
package org.muml.cbs.dependencylanguage.tests;

import org.muml.cbs.dependencylanguage.CompositionCondition;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composition Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositionConditionTest.class);
	}

	/**
	 * Constructs a new Composition Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composition Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositionCondition getFixture() {
		return (CompositionCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependencylanguageFactory.eINSTANCE.createCompositionCondition());
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

} //CompositionConditionTest
