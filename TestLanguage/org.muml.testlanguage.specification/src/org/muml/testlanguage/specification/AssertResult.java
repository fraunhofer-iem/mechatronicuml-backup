/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assert Result</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getAssertResult()
 * @model
 * @generated
 */
public interface AssertResult extends AssertBool {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Assert Result\");\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"property_result_repository\",\r\n\t\t\t\tfalse,\r\n\t\t\t\tde.uni_paderborn.fujaba.muml.verification.uppaal.results.PropertyResultRepository.class);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "de.uni_paderborn.fujaba.muml.testlanguage.specification.ExecutionException de.uni_paderborn.fujaba.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Get the repository of the results.\r\n\t\tPropertyResultRepository repo = (PropertyResultRepository) inputs\r\n\t\t\t\t.get(\"property_result_repository\");\r\n\r\n\t\t// Make sure we know if we want all the properties to verify or not.\r\n\t\tString alpha, beta;\r\n\t\tif (this.assertion) {\r\n\t\t\talpha = \"FULFILLED\";\r\n\t\t\tbeta = \"NOT FULFILLED\";\r\n\t\t} else {\r\n\t\t\talpha = \"NOT FULFILLED\";\r\n\t\t\tbeta = \"FULFILLED\";\r\n\t\t}\r\n\r\n\t\t// Check each property.\r\n\t\tString error = \"\";\r\n\t\tfor (PropertyResult result : repo.getResults()) {\r\n\t\t\tif (result.isFulfilled() != this.assertion) {\r\n\t\t\t\terror += \"[Comment \" + result.getProperty().getComment() + \"] \";\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Throw an exception if errors occurred.\r\n\t\tif (!error.equals(\"\")) {\r\n\t\t\tthrow new ExecutionException(\"Expected \" + alpha + \", but got \"\r\n\t\t\t\t\t+ beta + \" on \" + error);\r\n\t\t}'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs)
			throws ExecutionException, Exception;
} // AssertResult
