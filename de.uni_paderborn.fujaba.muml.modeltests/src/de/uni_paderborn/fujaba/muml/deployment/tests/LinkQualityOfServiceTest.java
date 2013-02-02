/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.deployment.tests;

import de.uni_paderborn.fujaba.muml.deployment.DeploymentFactory;
import de.uni_paderborn.fujaba.muml.deployment.LinkQualityOfService;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Quality Of Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkQualityOfServiceTest extends TestCase {

	/**
	 * The fixture for this Link Quality Of Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkQualityOfService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkQualityOfServiceTest.class);
	}

	/**
	 * Constructs a new Link Quality Of Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkQualityOfServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Link Quality Of Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LinkQualityOfService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Link Quality Of Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkQualityOfService getFixture() {
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
		setFixture(DeploymentFactory.eINSTANCE.createLinkQualityOfService());
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

} //LinkQualityOfServiceTest
