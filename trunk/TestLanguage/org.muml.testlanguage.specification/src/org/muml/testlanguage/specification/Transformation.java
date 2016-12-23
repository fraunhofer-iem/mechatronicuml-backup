/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Transformation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.specification.Transformation#getUri
 * <em>Uri</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.Transformation#getParameterOrder
 * <em>Parameter Order</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.specification.Transformation#getConfigProperties
 * <em>Config Properties</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends NodeSpecification {

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
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getTransformation_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.Transformation#getUri
	 * <em>Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Order</b></em>' reference
	 * list. The list contents are of type
	 * {@link org.muml.testlanguage.specification.PortSpecification}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Order</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameter Order</em>' reference list.
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getTransformation_ParameterOrder()
	 * @model
	 * @generated
	 */
	EList<PortSpecification> getParameterOrder();

	/**
	 * Returns the value of the '<em><b>Config Properties</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Properties</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Config Properties</em>' attribute list.
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getTransformation_ConfigProperties()
	 * @model
	 * @generated
	 */
	EList<String> getConfigProperties();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='this.setLabel(\"Transformation\");'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\tURI realURI = URIConversion.convert(URI.createURI(this.getUri()));\r\n\t\tTransformationExecutor executor = new TransformationExecutor(realURI);\r\n\r\n\t\tExecutionContextImpl context;\r\n\t\tIStatus status;\r\n\r\n\t\tstatus = BasicDiagnostic.toIStatus(executor.loadTransformation());\r\n\r\n\t\tif (!status.isOK()) {\r\n\t\t\tthrow new ExecutionException(status.getMessage());\r\n\t\t}\r\n\r\n\t\tcontext = new ExecutionContextImpl();\r\n\r\n\t\t// Set extents, i.e. the model parameters.\r\n\t\tBasicModelExtent[] extents = new BasicModelExtent[this\r\n\t\t\t\t.getParameterOrder().size()];\r\n\t\tint i = 0;\r\n\t\tfor (PortSpecification port : this.getParameterOrder()) {\r\n\t\t\tBasicModelExtent extent = new BasicModelExtent();\r\n\r\n\t\t\tif (port.getType() == PortType.IN) {\r\n\t\t\t\textent.add((EObject) inputs.get(port.getName()));\r\n\t\t\t} else if (port.getType() == PortType.INOUT) {\r\n\t\t\t\t// Copy the EObject to avoid side effects.\r\n\t\t\t\tCopier copier = new Copier();\r\n\t\t\t\tEObject result = copier.copy((EObject) inputs.get(port.getName()));\r\n\t\t\t\tcopier.copyReferences();\r\n\t\t\t\textent.add(result);\r\n\t\t\t}\r\n\r\n\t\t\textents[i] = extent;\r\n\r\n\t\t\ti++;\r\n\t\t}\r\n\r\n\t\t// Set configuration properties. They arrive in an EObject wrapper\r\n\t\t// as a string, they are parsed by QVTo.\r\n\t\tfor (String property : this.getConfigProperties()) {\r\n\t\t\tif (inputs.containsKey(property)) {\r\n\t\t\t\tcontext.setConfigProperty(property,\r\n\t\t\t\t\t\t(String) inputs.get(property));\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Execute the transformation.\r\n\t\tOutputStreamWriter outStream = new OutputStreamWriter(System.out);\r\n\t\tLog log = new WriterLog(outStream);\r\n\t\tcontext.setLog(log);\r\n\t\tExecutionDiagnostic diagnostic = executor.execute(context, extents);\r\n\r\n\t\t// Check if everything went fine.\r\n\t\tif (diagnostic.getSeverity() == Diagnostic.ERROR) {\r\n\t\t\tthrow new ExecutionException(\"Transformation failed: \"\r\n\t\t\t\t\t+ diagnostic.getMessage());\r\n\t\t}\r\n\r\n\t\t// Get the output.\r\n\t\ti = 0;\r\n\t\tfor (PortSpecification port : this.getParameterOrder()) {\r\n\t\t\t// System.out.println(i + \" \" + port.getName() + \" (\"\r\n\t\t\t// + port.getType() + \"): \"\r\n\t\t\t// + extents[i].getContents().get(0));\r\n\t\t\tif (port.getType() == PortType.OUT\r\n\t\t\t\t\t|| port.getType() == PortType.INOUT) {\r\n\t\t\t\toutputs.put(port.getName(), extents[i].getContents().get(0));\r\n\t\t\t}\r\n\r\n\t\t\ti++;\r\n\t\t}\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\ttry {\r\n\t\t\tNotification n = (Notification) notification;\r\n\t\t\tEAttribute attr = (EAttribute) n.getFeature();\r\n\r\n\t\t\tif (n.getEventType() == Notification.SET && attr.getName() == \"uri\") {\r\n\t\t\t\tthis.getPortSpecifications().clear();\r\n\t\t\t\tthis.getParameterOrder().clear();\r\n\t\t\t\tthis.getConfigProperties().clear();\r\n\r\n\t\t\t\t// Load transformation Ecore in order to get the port count\r\n\t\t\t\t// required. (http://www.eclipse.org/forums/index.php/t/478345/)\r\n\t\t\t\tURI realURI = URI.createURI(this.uri);\r\n\t\t\t\tResourceSet resSet = new ResourceSetImpl();\r\n\t\t\t\tResource resource = resSet.getResource(realURI.trimFragment(),\r\n\t\t\t\t\t\ttrue);\r\n\t\t\t\tEObject result = null;\r\n\r\n\t\t\t\tif (realURI.hasFragment()) {\r\n\t\t\t\t\tresult = resource.getEObject(realURI.fragment());\r\n\t\t\t\t}\r\n\r\n\t\t\t\tOperationalTransformation trans = (OperationalTransformation) (result != null ? result\r\n\t\t\t\t\t\t: resource.getContents().get(0));\r\n\r\n\t\t\t\tEList<ModelParameter> params = trans.getModelParameter();\r\n\r\n\t\t\t\tfor (ModelParameter param : params) {\r\n\t\t\t\t\tPortType type = PortType.IN;\r\n\t\t\t\t\tif (param.getKind() == DirectionKind.OUT) {\r\n\t\t\t\t\t\ttype = PortType.OUT;\r\n\t\t\t\t\t} else if (param.getKind() == DirectionKind.INOUT) {\r\n\t\t\t\t\t\ttype = PortType.INOUT;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tPortSpecification spec = this.addPortSpecification(type,\r\n\t\t\t\t\t\t\tparam.getName(), false, org.eclipse.emf.ecore.EObject.class);\r\n\t\t\t\t\tthis.getParameterOrder().add(spec);\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// Add configuration properties.\r\n\t\t\t\tthis.getConfigProperties().clear();\r\n\t\t\t\tEList<EStructuralFeature> props = trans.getConfigProperty();\r\n\t\t\t\tfor (EStructuralFeature feature : props) {\r\n\t\t\t\t\tthis.addPortSpecification(PortType.IN, feature.getName(),\r\n\t\t\t\t\t\t\ttrue, java.lang.String.class);\r\n\t\t\t\t\tthis.getConfigProperties().add(feature.getName());\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// Return true to signal that the ports changed and need to\r\n\t\t\t\t// be rebuilt.\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t} catch (Exception e) {\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean notifyChanged(Object notification);

} // Transformation
