/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assert Bool</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.specification.AssertBool#isAssertion
 * <em>Assertion</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getAssertBool()
 * @model
 * @generated
 */
public interface AssertBool extends NodeSpecification {
	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' attribute. The
	 * default value is <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Assertion</em>' attribute.
	 * @see #setAssertion(boolean)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getAssertBool_Assertion()
	 * @model default="true"
	 * @generated
	 */
	boolean isAssertion();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.AssertBool#isAssertion
	 * <em>Assertion</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Assertion</em>' attribute.
	 * @see #isAssertion()
	 * @generated
	 */
	void setAssertion(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Assert Bool\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"bool\", false,\r\n\t\t\t\tjava.lang.Boolean.class);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Get the boolean value.\r\n\t\tboolean bool = ((Boolean) inputs.get(\"bool\")).booleanValue();\r\n\r\n\t\t// Throw an exception if it does not match the assertion.\r\n\t\tif (bool != this.assertion) {\r\n\t\t\tthrow new ExecutionException(\"Expected \"\r\n\t\t\t\t\t+ Boolean.toString(this.assertion) + \", but got \"\r\n\t\t\t\t\t+ Boolean.toString(bool));\r\n\t\t}'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception,
			de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;

} // AssertBool
