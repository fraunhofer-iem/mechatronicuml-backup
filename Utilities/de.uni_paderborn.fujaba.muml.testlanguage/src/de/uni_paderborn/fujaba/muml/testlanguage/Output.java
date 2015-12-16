/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Output</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link de.uni_paderborn.fujaba.muml.testlanguage.Output#getTargets
 * <em>Targets</em>}</li>
 * <li>{@link de.uni_paderborn.fujaba.muml.testlanguage.Output#getNode
 * <em>Node</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage#getOutput()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore documentation='This class represents a specific type of port that is used as an output.'"
 * @generated
 */
public interface Output extends Port {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list. The
	 * list contents are of type
	 * {@link de.uni_paderborn.fujaba.muml.testlanguage.Input}. It is
	 * bidirectional and its opposite is '
	 * {@link de.uni_paderborn.fujaba.muml.testlanguage.Input#getSource
	 * <em>Source</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage#getOutput_Targets()
	 * @see de.uni_paderborn.fujaba.muml.testlanguage.Input#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Input> getTargets();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link de.uni_paderborn.fujaba.muml.testlanguage.Node#getOutputs
	 * <em>Outputs</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage#getOutput_Node()
	 * @see de.uni_paderborn.fujaba.muml.testlanguage.Node#getOutputs
	 * @model opposite="outputs" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '
	 * {@link de.uni_paderborn.fujaba.muml.testlanguage.Output#getNode
	 * <em>Node</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the object that this port gets from its node.
	 * 
	 * @return The object filed in the outputCache of the associated node with
	 *         the name of this port, or null if there is no data. <!--
	 *         end-model-doc -->
	 * @model kind="operation" required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='if (this.getNode().getOutputCache() == null)\r\n{\r\n\treturn null;\r\n}\r\n\t\t\r\nreturn this.getNode().getOutputCache().get(this.getName());'"
	 * @generated
	 */
	Object getData();

} // Output
