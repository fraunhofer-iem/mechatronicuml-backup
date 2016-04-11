/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Check MTCTL</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.specification.CheckMTCTL#getProperties
 * <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getCheckMTCTL()
 * @model
 * @generated
 */
public interface CheckMTCTL extends NodeSpecification {

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(String)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getCheckMTCTL_Properties()
	 * @model
	 * @generated
	 */
	String getProperties();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.CheckMTCTL#getProperties
	 * <em>Properties</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Check MTCTL\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"muml\", false,\r\n\t\t\t\torg.muml.core.modelinstance.RootNode.class);\r\n\t\tthis.addPortSpecification(\r\n\t\t\t\tPortType.IN,\r\n\t\t\t\t\"options\",\r\n\t\t\t\ttrue,\r\n\t\t\t\torg.muml.uppaal.options.Options.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"results\", false);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Do we even have properties to verify?\nif (\"\".equals(this.getProperties())) {\n\tthrow new ExecutionException(\"No properties to verify.\");\n}\n\n// Copy the MUML model so we do not destroy it.\n// Copier copier = new Copier();\n\norg.muml.core.modelinstance.RootNode muml = null;\norg.muml.pim.protocol.CoordinationProtocol protocol = null;\n\norg.muml.core.Extension extension = null;\n\norg.muml.core.modelinstance.RootNode rootNode = null;\n// EObject rootNode = null;\n\nif (inputs.get(\"muml\") instanceof org.muml.core.modelinstance.RootNode) {\n\trootNode = (org.muml.core.modelinstance.RootNode) inputs.get(\"muml\");\n} else if (inputs.get(\"muml\") instanceof org.muml.pim.protocol.CoordinationProtocol) {\n\n\tprotocol = (org.muml.pim.protocol.CoordinationProtocol) inputs.get(\"muml\");\n\n\t// rootNode = (RootNode)((CoordinationProtocol)\n\t// inputs.get(\"muml\")).eContainer().eContainer();\n\n\tif ((org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(protocol) instanceof org.muml.core.modelinstance.RootNode)) {\n\t\trootNode = (org.muml.core.modelinstance.RootNode) org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(protocol);\n\t} else {\n\t\tthrow new ExecutionException(\"The coordination protocol doesn\'t have correct RootContainer\");\n\t}\n\n\textension = protocol.getExtension(\n\t\t\torg.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE\n\t\t\t\t\t.getElementToVerifyExtension());\n\tif (extension == null) {\n\t\textension = org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionFactory.eINSTANCE\n\t\t\t\t.createElementToVerifyExtension();\n\t\tprotocol.getExtensions().add(extension);\n\t}\n} else {\n\tthrow new ExecutionException(\"Coordination protocol is not specified.\");\n}\n\n// Copy the MUML model so we do not destroy it.\norg.eclipse.emf.ecore.util.EcoreUtil.Copier copier = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();\nmuml = (org.muml.core.modelinstance.RootNode) copier.copy(rootNode);\ncopier.copyReferences();\n\n// Get the CoordinationProtocol category.\norg.muml.core.modelinstance.ModelElementCategory category = null;\nfor (org.muml.core.modelinstance.ModelElementCategory cur : muml.getCategories()) {\n\tif (cur.getKey().equals(\"org.muml.pim.protocol.category\")) {\n\t\tcategory = cur;\n\t\tbreak;\n\t}\n}\n\nif (category == null) {\n\tthrow new ExecutionException(\"Model does not contain a CoordinationProtocol category.\");\n}\n\n// Look for a CoordinationProtocol that asks for a verification,\n// otherwise just choose any.\n\nfor (org.muml.core.ExtendableElement cur : category.getModelElements()) {\n\tprotocol = (org.muml.pim.protocol.CoordinationProtocol) cur;\n\n\tif (protocol.getExtension(\n\t\t\torg.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE\n\t\t\t\t\t.getElementToVerifyExtension()) != null) {\n\t\tbreak;\n\t}\n\t// In case there is no protocol with extension,\n\t// the last coordination protocol is used\n}\nif (protocol == null) {\n\tthrow new ExecutionException(\"Model does not contain a CoordinationProtocol.\");\n}\n\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\nresourceSet.getLoadOptions().put(org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);\norg.muml.uppaal.adapter.mtctl.xtext.scoping.MtctlScopeProvider.getInstance().setScopeForEObject(protocol);\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(\"dummy:/dummy.mtctl\"));\nresource.load(new java.io.ByteArrayInputStream(properties.getBytes(java.nio.charset.StandardCharsets.UTF_8)),\n\t\tresourceSet.getLoadOptions());\n\n// Parse the PropertyRepository we have in the context of the protocol.\norg.muml.uppaal.requirements.PropertyRepository propertyRepository = (org.muml.uppaal.requirements.PropertyRepository) resource.getContents().get(0);\n\n// Replace all existing PropertyRepositories by the one we just created.\nprotocol.getVerificationConstraintRepositories().clear();\nprotocol.getVerificationConstraintRepositories().add((org.muml.pim.constraint.VerificationConstraintRepository) propertyRepository);\n\n// Verify for results (= apply the transformation by the MTCTL people).\norg.eclipse.emf.common.util.URI realURI = org.eclipse.emf.common.util.URI.createURI(\n\t\t\"platform:/plugin/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Results.qvto\");\norg.eclipse.m2m.qvt.oml.TransformationExecutor executor = new org.eclipse.m2m.qvt.oml.TransformationExecutor(realURI);\norg.eclipse.m2m.qvt.oml.ExecutionContextImpl context;\norg.eclipse.core.runtime.IStatus status;\nstatus = org.eclipse.emf.common.util.BasicDiagnostic.toIStatus(executor.loadTransformation());\nif (!status.isOK()) {\n\tthrow new ExecutionException(status.getMessage());\n}\ncontext = new org.eclipse.m2m.qvt.oml.ExecutionContextImpl();\n\n// Check if we have custom options or use the default ones.\norg.muml.uppaal.options.CoordinationProtocolOptions options;\nif (inputs.containsKey(\"options\") && inputs.get(\"options\") != null) {\n\toptions = (org.muml.uppaal.options.CoordinationProtocolOptions) inputs.get(\"options\");\n} else {\n\toptions = org.muml.uppaal.options.OptionsFactory.eINSTANCE.createCoordinationProtocolOptions();\n\toptions.setTraceOptions(org.muml.uppaal.options.TraceOptions.NONE);\n}\n\n// Create the extents.\norg.eclipse.m2m.qvt.oml.BasicModelExtent mumlExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();\nmumlExtent.add(muml);\norg.eclipse.m2m.qvt.oml.BasicModelExtent optionsExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();\noptionsExtent.add(options);\norg.eclipse.m2m.qvt.oml.BasicModelExtent resultExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();\n\n// Execute the transformation.\njava.io.OutputStreamWriter outStream = new java.io.OutputStreamWriter(System.out);\norg.eclipse.m2m.qvt.oml.util.Log log = new org.eclipse.m2m.qvt.oml.util.WriterLog(outStream);\ncontext.setLog(log);\norg.eclipse.m2m.qvt.oml.ExecutionDiagnostic dia = executor.execute(context, mumlExtent, optionsExtent,\n\t\tresultExtent);\n\nif (extension != null) {\n\textension = null; // Is this enoguh or I should remove the extension\n\t\t\t\t\t\t// from the list of protocol\'s extensions?\n}\n\n// Check if we succeeded.\nif (dia.getSeverity() != org.eclipse.m2m.qvt.oml.ExecutionDiagnostic.OK) {\n\tthrow new ExecutionException(dia.getMessage());\n}\n\n// Get the output.\noutputs.put(\"results\", resultExtent.getContents().get(0));\n'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;

} // CheckMTCTL
