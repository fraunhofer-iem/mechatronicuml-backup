/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Compare Models</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getCompareModels()
 * @model
 * @generated
 */
public interface CompareModels extends NodeSpecification {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Compare Models\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"model_1\", false, org.eclipse.emf.common.notify.Notifier.class);\r\n\t\tthis.addPortSpecification(PortType.IN, \"model_2\", false, org.eclipse.emf.common.notify.Notifier.class);\r\n\t\tthis.addPortSpecification(PortType.OUT, \"bool\", false);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Local variable to carry the result.\r\n\t\tboolean result = false;\r\n\r\n\t\t// Check if the given models are actually the same model.\r\n\t\tif (inputs.get(\"model_1\") == inputs.get(\"model_2\")) {\r\n\t\t\tresult = true;\r\n\t\t} else {\r\n\r\n\t\t\t// Setup the matching engine.\r\n\t\t\tIMatchEngine.Factory factory = new MatchEngineFactoryImpl(\r\n\t\t\t\t\tUseIdentifiers.NEVER);\r\n\t\t\tIMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();\r\n\t\t\tmatchEngineRegistry.add(factory);\r\n\t\t\tIComparisonScope scope = new DefaultComparisonScope(\r\n\t\t\t\t\t(Notifier) inputs.get(\"model_1\"), (Notifier) inputs.get(\"model_2\"), null);\r\n\r\n\t\t\t// Avoid order checking for unordered containments.\r\n\t\t\tIDiffProcessor diffProcessor = new DiffBuilder();\r\n\t\t\tIDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {\r\n\t\t\t\t@Override\r\n\t\t\t\tprotected FeatureFilter createFeatureFilter() {\r\n\t\t\t\t\treturn new FeatureFilter() {\r\n\t\t\t\t\t\t@Override\r\n\t\t\t\t\t\tpublic boolean checkForOrderingChanges(\r\n\t\t\t\t\t\t\t\tEStructuralFeature feature) {\r\n\t\t\t\t\t\t\treturn feature.isMany() && feature.isOrdered();\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t};\r\n\t\t\t\t}\r\n\t\t\t};\r\n\r\n\t\t\tComparison comparison = EMFCompare.builder()\r\n\t\t\t\t\t.setMatchEngineFactoryRegistry(matchEngineRegistry)\r\n\t\t\t\t\t.setDiffEngine(diffEngine).build().compare(scope);\r\n\r\n\t\t\tOutputStream stream = new OutputStream() {\r\n\r\n\t\t\t\tprivate StringBuilder builder = new StringBuilder();\r\n\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic void write(int b) throws IOException {\r\n\t\t\t\t\tbuilder.append((char) b);\r\n\t\t\t\t}\r\n\r\n\t\t\t\t@Override\r\n\t\t\t\tpublic String toString() {\r\n\t\t\t\t\treturn builder.toString();\r\n\t\t\t\t}\r\n\r\n\t\t\t};\r\n\r\n\t\t\tEMFComparePrettyPrinter.printDifferences(comparison,\r\n\t\t\t\t\tnew PrintStream(stream));\r\n\r\n\t\t\tif (comparison.getDifferences().isEmpty()) {\r\n\t\t\t\tresult = true;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Wrap the result up and put it on the output port.\r\n\t\toutputs.put(\"bool\", new Boolean(result));\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception,
			de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;

} // CompareModels
