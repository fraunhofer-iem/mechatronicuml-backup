/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IlpFactory;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ObjectiveFunctionExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Objective Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectiveFunctionExpressionTest extends TestCase {

	/**
	 * The fixture for this Objective Function Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveFunctionExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectiveFunctionExpressionTest.class);
	}

	/**
	 * Constructs a new Objective Function Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveFunctionExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Objective Function Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ObjectiveFunctionExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Objective Function Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveFunctionExpression getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IlpFactory.eINSTANCE.createObjectiveFunctionExpression());
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

} //ObjectiveFunctionExpressionTest
