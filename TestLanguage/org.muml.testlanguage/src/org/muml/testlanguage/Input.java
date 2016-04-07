/**
 */
package org.muml.testlanguage;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Input</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.Input#getSource <em>Source</em>}</li>
 * <li>{@link org.muml.testlanguage.Input#getNode <em>Node</em>}</li>
 * <li>{@link org.muml.testlanguage.Input#isOptional <em>Optional</em>}</li>
 * <li>{@link org.muml.testlanguage.Input#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.TestLanguagePackage#getInput()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL mandatoryInputMustBeConnected='-- Inputs that are mandatory (= not optional) must have a connection.\r\nself.source.oclIsUndefined() implies self.optional'"
 *        annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore constraints='mandatoryInputMustBeConnected' documentation='This class represents a specific type of port that is used as an input.'"
 * @generated
 */
public interface Input extends Port {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link org.muml.testlanguage.Output#getTargets <em>Targets</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Output)
	 * @see org.muml.testlanguage.TestLanguagePackage#getInput_Source()
	 * @see org.muml.testlanguage.Output#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	Output getSource();

	/**
	 * Sets the value of the ' {@link org.muml.testlanguage.Input#getSource
	 * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Output value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link org.muml.testlanguage.Node#getInputs <em>Inputs</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see org.muml.testlanguage.TestLanguagePackage#getInput_Node()
	 * @see org.muml.testlanguage.Node#getInputs
	 * @model opposite="inputs" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.muml.testlanguage.Input#getNode
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
	 * Returns the value of the '<em><b>Optional</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.muml.testlanguage.TestLanguagePackage#getInput_Optional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the ' {@link org.muml.testlanguage.Input#isOptional
	 * <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Class)
	 * @see org.muml.testlanguage.TestLanguagePackage#getInput_DataType()
	 * @model
	 * @generated
	 */
	Class<?> getDataType();

	/**
	 * Sets the value of the ' {@link org.muml.testlanguage.Input#getDataType
	 * <em>Data Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Class<?> value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the data that flows to this input port.
	 * 
	 * @return An object that is delivered by a connected output port or null,
	 *         if the input is not connected. <!-- end-model-doc -->
	 * @model kind="operation" required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='if (this.getSource() == null)\r\n{\r\n\treturn null;\r\n}\r\n\t\t\r\nreturn this.getSource().getData();'"
	 * @generated
	 */
	Object getData();

} // Input
