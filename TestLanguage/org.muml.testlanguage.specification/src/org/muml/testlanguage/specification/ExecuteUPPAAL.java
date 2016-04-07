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
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Check UPPAAL\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"nta\", false,\r\n\t\t\t\tde.uni_paderborn.uppaal.NTA.class);\r\n\t\tthis.addPortSpecification(PortType.IN, \"property_repository\", false,\r\n\t\t\t\tde.uni_paderborn.uppaal.requirements.PropertyRepository.class);\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"options\",\r\n\t\t\t\ttrue,\r\n\t\t\t\tde.uni_paderborn.fujaba.muml.verification.uppaal.options.Options.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"trace_repository\", false);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Check if we have custom options or use the default ones.\r\n\t\tCoordinationProtocolOptions options;\r\n\t\tif (inputs.containsKey(\"options\") && inputs.get(\"options\") != null) {\r\n\t\t\toptions = (CoordinationProtocolOptions) inputs.get(\"options\");\r\n\t\t} else {\r\n\t\t\toptions = OptionsFactory.eINSTANCE\r\n\t\t\t\t\t.createCoordinationProtocolOptions();\r\n\t\t\toptions.setTraceOptions(TraceOptions.NONE);\r\n\t\t}\r\n\r\n\t\t// Start the job that serialized and then verifies the NTA.\r\n\t\tVerifyTAJob job = new VerifyTAJob((NTA) inputs.get(\"nta\"),\r\n\t\t\t\t(PropertyRepository) inputs.get(\"property_repository\"), options);\r\n\t\tIStatus status = job.execute(new NullProgressMonitor());\r\n\r\n\t\t// Throw an exception if something went wrong.\r\n\t\tif (!status.isOK()) {\r\n\t\t\tthrow new ExecutionException(status.getMessage());\r\n\t\t}\r\n\r\n\t\t// Put the traces on the output port and return.\r\n\t\toutputs.put(\"trace_repository\", job.getTraceRepository());\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception,
			de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;

} // ExecuteUPPAAL
