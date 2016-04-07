/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Load Model</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.specification.LoadModel#getUri <em>Uri</em>}
 * </li>
 * </ul>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getLoadModel()
 * @model
 * @generated
 */
public interface LoadModel extends NodeSpecification {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute. The default
	 * value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getLoadModel_Uri()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.LoadModel#getUri <em>Uri</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 *        "http://www.eclipse.org/emf/2002/GenModel body='this.setLabel(\"Load Model\"); \r\nthis.addPortSpecification(PortType.OUT, \"model\", true);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Setup the URI.\r\n\t\tURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\r\n\r\n\t\t// Load the model.\r\n\t\tResourceSet resSet = new ResourceSetImpl();\r\n\t\tResource resource = resSet.getResource(realURI.trimFragment(), true);\r\n\t\tEObject result = null;\r\n\r\n\t\tif (realURI.hasFragment()) {\r\n\t\t\tresult = resource.getEObject(realURI.fragment());\r\n\t\t} else {\r\n\t\t\tresult = resource.getContents().get(0);\r\n\t\t}\r\n\r\n\t\t// Put the loaded model onto the output.\r\n\t\toutputs.put(\"model\", result);\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception,
			de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.ExecutionException;

} // LoadModel
