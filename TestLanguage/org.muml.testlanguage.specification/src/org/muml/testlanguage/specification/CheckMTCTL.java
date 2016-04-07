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
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Do we even have properties to verify?\r\n\t\tif (\"\".equals(this.getProperties())) {\r\n\t\t\tthrow new ExecutionException(\"No properties to verify.\");\r\n\t\t}\r\n\r\n\t\t// Copy the MUML model so we do not destroy it.\r\n\t\tCopier copier = new Copier();\r\n\t\tRootNode muml = (RootNode) copier.copy((RootNode) inputs.get(\"muml\"));\r\n\t\tcopier.copyReferences();\r\n\r\n\t\t// Get the CoordinationProtocol category.\r\n\t\tModelElementCategory category = null;\r\n\t\tfor (ModelElementCategory cur : muml.getCategories()) {\r\n\t\t\tif (cur.getKey().equals(\r\n\t\t\t\t\t\"de.uni_paderborn.fujaba.muml.protocol.category\")) {\r\n\t\t\t\tcategory = cur;\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (category == null) {\r\n\t\t\tthrow new ExecutionException(\r\n\t\t\t\t\t\"Model does not contain a CoordinationProtocol category.\");\r\n\t\t}\r\n\r\n\t\t// Look for a CoordinationProtocol that asks for a verification,\r\n\t\t// otherwise just choose any.\r\n\t\tCoordinationProtocol protocol = null;\r\n\t\tfor (ExtendableElement cur : category.getModelElements()) {\r\n\t\t\tprotocol = (CoordinationProtocol) cur;\r\n\r\n\t\t\tif (protocol\r\n\t\t\t\t\t.getExtension(org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE\r\n\t\t\t\t\t\t\t.getElementToVerifyExtension()) != null) {\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (protocol == null) {\r\n\t\t\tthrow new ExecutionException(\r\n\t\t\t\t\t\"Model does not contain a CoordinationProtocol.\");\r\n\t\t}\r\n\r\n\t\t// Parse the PropertyRepository we have in the context of the protocol.\r\n\t\tPropertyRepository propertyRepository = (PropertyRepository) new Object() {\r\n\r\n\t\t\t@Inject\r\n\t\t\tprivate XtextResourceSet resourceSet;\r\n\r\n\t\t\tpublic EObject parse(CoordinationProtocol protocol,\r\n\t\t\t\t\tString properties) throws Exception {\r\n\t\t\t\t// Source: http://davehofmann.de/blog/?p=101\r\n\t\t\t\tInjector injector = Guice\r\n\t\t\t\t\t\t.createInjector(new MtctlRuntimeModule());\r\n\t\t\t\tinjector.injectMembers(this);\r\n\t\t\t\tthis.resourceSet.addLoadOption(\r\n\t\t\t\t\t\tXtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);\r\n\r\n\t\t\t\t// Parse the given properties and return it.\r\n\t\t\t\tMtctlScopeProvider.getInstance().setScopeForEObject(protocol);\r\n\t\t\t\tResource resource = resourceSet.createResource(URI\r\n\t\t\t\t\t\t.createURI(\"dummy:/dummy.mtctl\"));\r\n\t\t\t\tresource.load(\r\n\t\t\t\t\t\tnew ByteArrayInputStream(properties\r\n\t\t\t\t\t\t\t\t.getBytes(StandardCharsets.UTF_8)), resourceSet\r\n\t\t\t\t\t\t\t\t.getLoadOptions());\r\n\t\t\t\treturn resource.getContents().get(0);\r\n\t\t\t}\r\n\t\t}.parse(protocol, this.getProperties());\r\n\r\n\t\t// Replace all existing PropertyRepositories by the one we just created.\r\n\t\tprotocol.getVerificationConstraintRepositories().clear();\r\n\t\tprotocol.getVerificationConstraintRepositories()\r\n\t\t\t\t.add(propertyRepository);\r\n\r\n\t\t// Verify for results (= apply the transformation by the MTCTL people).\r\n\t\tURI realURI = URI\r\n\t\t\t\t.createURI(\"platform:/plugin/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Results.qvto\");\r\n\t\tTransformationExecutor executor = new TransformationExecutor(realURI);\r\n\t\tExecutionContextImpl context;\r\n\t\tIStatus status;\r\n\t\tstatus = BasicDiagnostic.toIStatus(executor.loadTransformation());\r\n\t\tif (!status.isOK()) {\r\n\t\t\tthrow new ExecutionException(status.getMessage());\r\n\t\t}\r\n\t\tcontext = new ExecutionContextImpl();\r\n\r\n\t\t// Check if we have custom options or use the default ones.\r\n\t\tCoordinationProtocolOptions options;\r\n\t\tif (inputs.containsKey(\"options\") && inputs.get(\"options\") != null) {\r\n\t\t\toptions = (CoordinationProtocolOptions) inputs.get(\"options\");\r\n\t\t} else {\r\n\t\t\toptions = OptionsFactory.eINSTANCE\r\n\t\t\t\t\t.createCoordinationProtocolOptions();\r\n\t\t\toptions.setTraceOptions(TraceOptions.NONE);\r\n\t\t}\r\n\r\n\t\t// Create the extents.\r\n\t\tBasicModelExtent mumlExtent = new BasicModelExtent();\r\n\t\tmumlExtent.add(muml);\r\n\t\tBasicModelExtent optionsExtent = new BasicModelExtent();\r\n\t\toptionsExtent.add(options);\r\n\t\tBasicModelExtent resultExtent = new BasicModelExtent();\r\n\r\n\t\t// Execute the transformation.\r\n\t\tOutputStreamWriter outStream = new OutputStreamWriter(System.out);\r\n\t\tLog log = new WriterLog(outStream);\r\n\t\tcontext.setLog(log);\r\n\t\texecutor.execute(context, mumlExtent, optionsExtent, resultExtent);\r\n\r\n\t\t// Get the output.\r\n\t\toutputs.put(\"results\", resultExtent.getContents().get(0));'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;

} // CheckMTCTL
