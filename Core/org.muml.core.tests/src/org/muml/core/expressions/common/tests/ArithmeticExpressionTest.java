/**
 */
package org.muml.core.expressions.common.tests;

import org.muml.core.expressions.common.ArithmeticExpression;
import org.muml.core.expressions.common.CommonExpressionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticExpressionTest extends BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArithmeticExpressionTest.class);
	}

	/**
	 * Constructs a new Arithmetic Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arithmetic Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArithmeticExpression getFixture() {
		return (ArithmeticExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CommonExpressionsFactory.eINSTANCE.createArithmeticExpression());
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

} //ArithmeticExpressionTest
