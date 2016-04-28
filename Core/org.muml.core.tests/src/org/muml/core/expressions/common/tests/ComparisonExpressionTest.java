/**
 */
package org.muml.core.expressions.common.tests;

import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.ComparisonExpression;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonExpressionTest extends BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComparisonExpressionTest.class);
	}

	/**
	 * Constructs a new Comparison Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comparison Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComparisonExpression getFixture() {
		return (ComparisonExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonExpressionsFactory.eINSTANCE.createComparisonExpression());
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

} //ComparisonExpressionTest
