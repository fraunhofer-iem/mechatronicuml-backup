/**
 */
package org.muml.testlanguage;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.Node#getInputs
 * <em>Inputs</em>}</li>
 * <li>{@link org.muml.testlanguage.Node#getOutputs
 * <em>Outputs</em>}</li>
 * <li>{@link org.muml.testlanguage.Node#getLabel
 * <em>Label</em>}</li>
 * <li>{@link org.muml.testlanguage.Node#getSpecification
 * <em>Specification</em>}</li>
 * <li>
 * {@link org.muml.testlanguage.Node#getSpecificationClassName
 * <em>Specification Class Name</em>}</li>
 * <li>{@link org.muml.testlanguage.Node#getInputCache
 * <em>Input Cache</em>}</li>
 * <li>{@link org.muml.testlanguage.Node#getOutputCache
 * <em>Output Cache</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.TestLanguagePackage#getNode()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore constraints='noCyclesAllowed'"
 *        annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL noCyclesAllowed='-- Nodes may not be part of a cycle or be dependent on a node that is part of a cycle.\r\nself.outputs.targets.node->asSet()->closure(outputs.targets.node)->excludes(self)'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.muml.testlanguage.Input}. It is
	 * bidirectional and its opposite is '
	 * {@link org.muml.testlanguage.Input#getNode
	 * <em>Node</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_Inputs()
	 * @see org.muml.testlanguage.Input#getNode
	 * @model opposite="node" containment="true" keys="name"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.muml.testlanguage.Output}. It is
	 * bidirectional and its opposite is '
	 * {@link org.muml.testlanguage.Output#getNode
	 * <em>Node</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_Outputs()
	 * @see org.muml.testlanguage.Output#getNode
	 * @model opposite="node" containment="true" keys="name"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. The default
	 * value is <code>"node"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_Label()
	 * @model default="node" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.Node#getLabel
	 * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(NodeSpecification)
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_Specification()
	 * @model containment="true"
	 * @generated
	 */
	NodeSpecification getSpecification();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.Node#getSpecification
	 * <em>Specification</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Specification</em>' containment
	 *            reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(NodeSpecification value);

	/**
	 * Returns the value of the '<em><b>Specification Class Name</b></em>'
	 * attribute. The default value is <code>"Default"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Class Name</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Specification Class Name</em>' attribute.
	 * @see #setSpecificationClassName(String)
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_SpecificationClassName()
	 * @model default="Default" required="true"
	 * @generated
	 */
	String getSpecificationClassName();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.Node#getSpecificationClassName
	 * <em>Specification Class Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Specification Class Name</em>'
	 *            attribute.
	 * @see #getSpecificationClassName()
	 * @generated
	 */
	void setSpecificationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Input Cache</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Cache</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Cache</em>' attribute.
	 * @see #setInputCache(Map)
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_InputCache()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, Object> getInputCache();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.Node#getInputCache
	 * <em>Input Cache</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Input Cache</em>' attribute.
	 * @see #getInputCache()
	 * @generated
	 */
	void setInputCache(Map<String, Object> value);

	/**
	 * Returns the value of the '<em><b>Output Cache</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Cache</em>' attribute.
	 * @see #setOutputCache(Map)
	 * @see org.muml.testlanguage.TestLanguagePackage#getNode_OutputCache()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, Object> getOutputCache();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.Node#getOutputCache
	 * <em>Output Cache</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Output Cache</em>' attribute.
	 * @see #getOutputCache()
	 * @generated
	 */
	void setOutputCache(Map<String, Object> value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Performs a setup routine for the specific node, i.e. it sets the label
	 * and ports according to the NodeSpecification. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Set the label according to the specification.\r\n\t\tthis.setLabel(this.specification.getLabel());\r\n\r\n\t\t// Remember old in- and outputs for later reuse.\r\n\t\tList<Input> oldInputs = new LinkedList<Input>();\r\n\t\tfor (Input input : this.getInputs()) {\r\n\t\t\toldInputs.add(input);\r\n\t\t}\r\n\t\tList<Output> oldOutputs = new LinkedList<Output>();\r\n\t\tfor (Output output : this.getOutputs()) {\r\n\t\t\toldOutputs.add(output);\r\n\t\t}\r\n\r\n\t\t// Clear old ports.\r\n\t\tthis.getInputs().clear();\r\n\t\tthis.getOutputs().clear();\r\n\r\n\t\t// Setup new ports and reuse old ones if possible.\r\n\t\tfor (EObject specObj : this.specification.getPortSpecifications()) {\r\n\t\t\tPortSpecification spec = (PortSpecification) specObj;\r\n\r\n\t\t\tif (spec.getType() == PortType.IN\r\n\t\t\t\t\t|| spec.getType() == PortType.INOUT) {\r\n\r\n\t\t\t\t// Can we reuse an old input port?\r\n\t\t\t\tboolean reuse = false;\r\n\t\t\t\tIterator<Input> iter = oldInputs.iterator();\r\n\t\t\t\twhile (iter.hasNext()) {\r\n\t\t\t\t\tInput input = iter.next();\r\n\t\t\t\t\tif (input.getName().equals(spec.getName())\r\n\t\t\t\t\t\t\t&& input.isOptional() == spec.isOptional()\r\n\t\t\t\t\t\t\t&& input.getDataType() == spec.getDataType()) {\r\n\t\t\t\t\t\tthis.getInputs().add(input);\r\n\t\t\t\t\t\titer.remove();\r\n\t\t\t\t\t\treuse = true;\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// If not, create a new input port.\r\n\t\t\t\tif (!reuse) {\r\n\t\t\t\t\tInput input = TestLanguageFactory.eINSTANCE.createInput();\r\n\t\t\t\t\tinput.setName(spec.getName());\r\n\t\t\t\t\tinput.setOptional(spec.isOptional());\r\n\t\t\t\t\tinput.setDataType(spec.getDataType());\r\n\t\t\t\t\tthis.getInputs().add(input);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t\tif (spec.getType() == PortType.OUT\r\n\t\t\t\t\t|| spec.getType() == PortType.INOUT) {\r\n\r\n\t\t\t\t// Can we reuse an old output port?\r\n\t\t\t\tboolean reuse = false;\r\n\t\t\t\tIterator<Output> iter = oldOutputs.iterator();\r\n\t\t\t\twhile (iter.hasNext()) {\r\n\t\t\t\t\tOutput output = iter.next();\r\n\t\t\t\t\tif (output.getName().equals(spec.getName())) {\r\n\t\t\t\t\t\tthis.getOutputs().add(output);\r\n\t\t\t\t\t\titer.remove();\r\n\t\t\t\t\t\treuse = true;\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\r\n\t\t\t\t// If not, create a new output port.\r\n\t\t\t\tif (!reuse) {\r\n\t\t\t\t\tOutput output = TestLanguageFactory.eINSTANCE\r\n\t\t\t\t\t\t\t.createOutput();\r\n\t\t\t\t\toutput.setName(spec.getName());\r\n\t\t\t\t\tthis.getOutputs().add(output);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t}\r\n\r\n\t\t// Disconnect old ports that are not used anymore.\r\n\t\tfor (Input input : oldInputs) {\r\n\t\t\tinput.setSource(null);\r\n\t\t}\r\n\t\tfor (Output output : oldOutputs) {\r\n\t\t\tfor (Input input : output.getTargets()) {\r\n\t\t\t\tinput.setSource(null);\r\n\t\t\t}\r\n\t\t}'"
	 * @generated
	 */
	void setupFromSpecification();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Executes the node. It basically just delegates to the execute()-method of
	 * the NodeSpecification, but also does some maintenance.
	 * 
	 * @throws ExecutionException
	 *             if an error occurs during execution, containing an error
	 *             message. <!-- end-model-doc -->
	 * @model exceptions=
	 *        "de.uni_paderborn.fujaba.muml.testlanguage.specification.ExecutionException"
	 *        annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// FIXME Hack to disable notifications so that the transactional editing\r\n\t\t// domain won\'t complain about me modifying the domain element.\r\n\t\tthis.eSetDeliver(false);\r\n\r\n\t\t// Initialize caches if needed.\r\n\t\tif (this.getInputCache() == null) {\r\n\t\t\tthis.setInputCache(new HashMap<String, Object>());\r\n\t\t}\r\n\t\tif (this.getOutputCache() == null) {\r\n\t\t\tthis.setOutputCache(new HashMap<String, Object>());\r\n\t\t}\r\n\r\n\t\t// Refresh the input cache.\r\n\t\tfor (Input input : this.getInputs()) {\r\n\t\t\tif (input.getSource() == null) {\r\n\t\t\t\tthis.getInputCache().remove(input.getName());\r\n\t\t\t} else {\r\n\t\t\t\tthis.getInputCache().put(input.getName(), input.getData());\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\t// Clear the output cache.\r\n\t\tthis.getOutputCache().clear();\r\n\r\n\t\t// NOTE A check whether all non-optional ports actually get data is not\r\n\t\t// necessary, as previous constraints already took care of this.\r\n\r\n\t\ttry {\r\n\t\t\t// Execute the behavior that is written in the specification.\r\n\t\t\tthis.specification.execute(this.getInputCache(),\r\n\t\t\t\t\tthis.getOutputCache());\r\n\r\n\t\t\treturn;\r\n\t\t} catch (Exception e) {\r\n\r\n\t\t\t// Clear the output cache.\r\n\t\t\tthis.getOutputCache().clear();\r\n\r\n\t\t\tthrow new ExecutionException(e);\r\n\t\t} finally {\r\n\t\t\tthis.eSetDeliver(true);\r\n\t\t}'"
	 * @generated
	 */
	void execute() throws ExecutionException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Reflectively creates the underlying NodeSpecification by looking into the
	 * field specificationClassName and searching a class of that name. <!--
	 * end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='try {\r\n\tSpecificationFactory fac = de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationFactory.eINSTANCE;\r\n\tjava.lang.reflect.Method creator = fac.getClass().getMethod(\"create\"+this.specificationClassName);\r\n\t\r\n\tthis.setSpecification((NodeSpecification) creator.invoke(fac));\r\n\tthis.specification.initialize();\r\n} catch (NoSuchMethodException e) {\r\n\t// The desired NodeSpecification does not exist.\r\n\te.printStackTrace();\r\n} catch (InvocationTargetException e) {\r\n\te.printStackTrace();\r\n} catch (IllegalAccessException e) {\r\n\te.printStackTrace();\r\n} catch (Exception e) {\r\n\te.printStackTrace();\r\n}'"
	 * @generated
	 */
	void createSpecification();

} // Node
