/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.constraint.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintFactory;
import de.uni_paderborn.fujaba.muml.constraint.TextualConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textual Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualConstraintTest extends VerifiableConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextualConstraintTest.class);
	}

	/**
	 * Constructs a new Textual Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Textual Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextualConstraint getFixture() {
		return (TextualConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConstraintFactory.eINSTANCE.createTextualConstraint());
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

} //TextualConstraintTest
