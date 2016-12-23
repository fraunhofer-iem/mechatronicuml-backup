/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assert Diagnostic Trace</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getAssertDiagnosticTrace()
 * @model
 * @generated
 */
public interface AssertDiagnosticTrace extends AssertBool {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Assert DiagnosticTrace\");\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"trace_repository\",\r\n\t\t\t\tfalse,\r\n\t\t\t\torg.muml.uppaal.trace.diagnostictrace.TraceRepository.class);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Get the repository.\r\n\t\tTraceRepository repo = (TraceRepository) inputs.get(\"trace_repository\");\r\n\r\n\t\t// Make sure we know if we want all the properties to verify or not.\r\n\t\tResult expected;\r\n\t\tString alpha, beta;\r\n\t\tif (this.assertion) {\r\n\t\t\texpected = Result.SUCCESS;\r\n\t\t\talpha = \"SUCCESS\";\r\n\t\t\tbeta = \"FAILURE\";\r\n\t\t} else {\r\n\t\t\texpected = Result.FAILURE;\r\n\t\t\talpha = \"FAILURE\";\r\n\t\t\tbeta = \"SUCCESS\";\r\n\t\t}\r\n\r\n\t\t// Check each property.\r\n\t\tString error = \"\";\r\n\t\tfor (Trace item : repo.getTraces()) {\r\n\t\t\tif (!item.getResult().equals(expected)) {\r\n\t\t\t\terror += \"[Property \" + item.getProperty() + \" at line \"\r\n\t\t\t\t\t\t+ item.getLine() + \"] \";\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Throw an exception if errors occurred.\r\n\t\tif (!error.equals(\"\")) {\r\n\t\t\tthrow new ExecutionException(\"Expected \" + alpha + \", but got \"\r\n\t\t\t\t\t+ beta + \" on \" + error);\r\n\t\t}'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;
} // AssertDiagnosticTrace
