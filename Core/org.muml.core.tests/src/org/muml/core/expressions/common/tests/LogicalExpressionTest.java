/**
 */
package org.muml.core.expressions.common.tests;

import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.mumlcore.expressions.common.LogicalExpression;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalExpressionTest extends BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalExpressionTest.class);
	}

	/**
	 * Constructs a new Logical Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalExpression getFixture() {
		return (LogicalExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonExpressionsFactory.eINSTANCE.createLogicalExpression());
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

} //LogicalExpressionTest
