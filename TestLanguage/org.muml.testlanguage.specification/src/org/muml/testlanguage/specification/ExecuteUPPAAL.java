/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Execute UPPAAL</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getExecuteUPPAAL()
 * @model
 * @generated
 */
public interface ExecuteUPPAAL extends NodeSpecification {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Check UPPAAL\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"nta\", false,\r\n\t\t\t\torg.muml.uppaal.NTA.class);\r\n\t\tthis.addPortSpecification(PortType.IN, \"property_repository\", false,\r\n\t\t\t\torg.muml.uppaal.requirements.PropertyRepository.class);\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"options\",\r\n\t\t\t\ttrue,\r\n\t\t\t\torg.muml.uppaal.adapter.options.Options.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"trace_repository\", false);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Check if we have custom options or use the default ones.\nCoordinationProtocolOptions options;\nif (inputs.containsKey(\"options\") && inputs.get(\"options\") != null) {\n\toptions = (CoordinationProtocolOptions) inputs.get(\"options\");\n} else {\n\toptions = OptionsFactory.eINSTANCE\n\t\t\t.createCoordinationProtocolOptions();\n\toptions.setTraceOptions(TraceOptions.NONE);\n}\n\n// Start the job that serialized and then verifies the NTA.\norg.muml.uppaal.job.VerifyTAOperation operation = new org.muml.uppaal.job.VerifyTAOperation((NTA) inputs.get(\"nta\"),\n\t\t(PropertyRepository) inputs.get(\"property_repository\"), options);\noperation.run(new NullProgressMonitor());\n\n// Put the traces on the output port and return.\noutputs.put(\"trace_repository\", operation.getTraceRepository());'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;

} // ExecuteUPPAAL
