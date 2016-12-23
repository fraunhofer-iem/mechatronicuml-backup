/**
 */
package org.muml.psm.portapimapping;

import org.muml.core.CommentableElement;
import org.muml.core.expressions.Expression;
import org.muml.pim.instance.ContinuousPortInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Api Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the mapping of a muml-model. The continuous port from that model will be mapped to an expression, that should be executet, when the continuours ports send/recieve values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.portapimapping.PortApiMapping#getPort <em>Port</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.PortApiMapping#getExecCommand <em>Exec Command</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.PortApiMapping#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.PortApiMapping#getInitCommand <em>Init Command</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.portapimapping.PortapimappingPackage#getPortApiMapping()
 * @model
 * @generated
 */
public interface PortApiMapping extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The continuous port, that will be mapped to an expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ContinuousPortInstance)
	 * @see org.muml.psm.portapimapping.PortapimappingPackage#getPortApiMapping_Port()
	 * @model required="true"
	 * @generated
	 */
	ContinuousPortInstance getPort();

	/**
	 * Sets the value of the '{@link org.muml.psm.portapimapping.PortApiMapping#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ContinuousPortInstance value);

	/**
	 * Returns the value of the '<em><b>Exec Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The command to which a continuous port will be mapped. This command is executed each time, the continuous port is queried.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exec Command</em>' containment reference.
	 * @see #setExecCommand(Expression)
	 * @see org.muml.psm.portapimapping.PortapimappingPackage#getPortApiMapping_ExecCommand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExecCommand();

	/**
	 * Sets the value of the '{@link org.muml.psm.portapimapping.PortApiMapping#getExecCommand <em>Exec Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec Command</em>' containment reference.
	 * @see #getExecCommand()
	 * @generated
	 */
	void setExecCommand(Expression value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.portapimapping.MappingRepository#getPortApiMappings <em>Port Api Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repository to which the mapping belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(MappingRepository)
	 * @see org.muml.psm.portapimapping.PortapimappingPackage#getPortApiMapping_Repository()
	 * @see org.muml.psm.portapimapping.MappingRepository#getPortApiMappings
	 * @model opposite="portApiMappings" required="true" transient="false"
	 * @generated
	 */
	MappingRepository getRepository();

	/**
	 * Sets the value of the '{@link org.muml.psm.portapimapping.PortApiMapping#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(MappingRepository value);

	/**
	 * Returns the value of the '<em><b>Init Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A optional command which has to be executed before any other api-command can be executed. For example some sonsors and actuators require an initial api-command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Command</em>' containment reference.
	 * @see #setInitCommand(Expression)
	 * @see org.muml.psm.portapimapping.PortapimappingPackage#getPortApiMapping_InitCommand()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitCommand();

	/**
	 * Sets the value of the '{@link org.muml.psm.portapimapping.PortApiMapping#getInitCommand <em>Init Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Command</em>' containment reference.
	 * @see #getInitCommand()
	 * @generated
	 */
	void setInitCommand(Expression value);

} // PortApiMapping
