/**
 */
package org.muml.testlanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Test Case</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.TestCase#getNodes
 * <em>Nodes</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.TestLanguagePackage#getTestCase()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore documentation='Container class that represents a test case.'"
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.muml.testlanguage.Node}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.muml.testlanguage.TestLanguagePackage#getTestCase_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // TestCase
