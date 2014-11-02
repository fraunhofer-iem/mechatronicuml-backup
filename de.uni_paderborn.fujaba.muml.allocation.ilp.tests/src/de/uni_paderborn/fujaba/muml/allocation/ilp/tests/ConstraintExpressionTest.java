/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.allocation.ilp.ConstraintExpression;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IlpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintExpressionTest extends TestCase {

	/**
	 * The fixture for this Constraint Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstraintExpressionTest.class);
	}

	/**
	 * Constructs a new Constraint Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Constraint Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConstraintExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Constraint Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintExpression getFixture() {
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
		setFixture(IlpFactory.eINSTANCE.createConstraintExpression());
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

} //ConstraintExpressionTest
