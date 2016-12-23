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
	 *        "http://www.eclipse.org/emf/2002/GenModel body='// Cancel if no uri was set.\nif (this.getUri() == null || \"\".equals(this.getUri())) {\n\tthrow new ExecutionException(\"No model URI set!\");\n}\n\n// Setup the URI.\nURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\n\n// Load the model.\nResourceSet resSet = new ResourceSetImpl();\nResource resource = resSet.getResource(realURI.trimFragment(), true);\n\nEObject result = null;\n\nif (realURI.hasFragment()) {\n\tresult = resource.getEObject(realURI.fragment());\n} else {\n\tresult = resource.getContents().get(0);\n}\n\n// Put the loaded model onto the output.\noutputs.put(\"model\", result);\nSystem.out.println(outputs);\nreturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;

} // LoadModel
