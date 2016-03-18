/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;
import java.util.Map;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Save Model</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.SaveModel#getUri
 * <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage#getSaveModel()
 * @model
 * @generated
 */
public interface SaveModel extends NodeSpecification {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage#getSaveModel_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '
	 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.SaveModel#getUri
	 * <em>Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.setLabel(\"Save Model\");\r\n\t\tthis.addPortSpecification(PortType.IN, \"model\", false, org.eclipse.emf.ecore.EObject.class);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "de.uni_paderborn.fujaba.muml.testlanguage.specification.ExecutionException de.uni_paderborn.fujaba.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Create the URI.\r\n\t\tURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\r\n\r\n\t\t// Only write to resource links.\r\n\t\tif (!realURI.isPlatformResource()) {\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\t// Create a XMIResourceFactory for the extension.\r\n\t\tif (realURI.fileExtension() != null) {\r\n\t\t\tResource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;\r\n\t\t\tMap<String, Object> m = reg.getExtensionToFactoryMap();\r\n\t\t\tm.put(realURI.fileExtension(), new XMIResourceFactoryImpl());\r\n\t\t}\r\n\r\n\t\t// Create a resource set.\r\n\t\tResourceSet resSet = new ResourceSetImpl();\r\n\t\tResource resource = resSet.createResource(realURI.trimFragment());\r\n\t\tresource.getContents().add((EObject) inputs.get(\"model\"));\r\n\r\n\t\t// Save the model.\r\n\t\tresource.save(Collections.EMPTY_MAP);\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs)
			throws ExecutionException, Exception;

} // SaveModel
