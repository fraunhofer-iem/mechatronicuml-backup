/**
 */
package org.muml.pm.software;

import org.eclipse.emf.common.util.EList;

import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

import org.muml.pim.behavior.Parameter;

import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an API-command of a concrete platform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.APICommand#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link org.muml.pm.software.APICommand#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.pm.software.APICommand#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.muml.pm.software.APICommand#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.software.SoftwarePackage#getAPICommand()
 * @model
 * @generated
 */
public interface APICommand extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Return Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the return value of an api-command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Data Type</em>' reference.
	 * @see #setReturnDataType(DataType)
	 * @see org.muml.pm.software.SoftwarePackage#getAPICommand_ReturnDataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturnDataType();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.APICommand#getReturnDataType <em>Return Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Data Type</em>' reference.
	 * @see #getReturnDataType()
	 * @generated
	 */
	void setReturnDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An api-command can have several prarameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.muml.pm.software.SoftwarePackage#getAPICommand_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.APIRepository#getApiCommands <em>Api Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repository to which this api-command belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(APIRepository)
	 * @see org.muml.pm.software.SoftwarePackage#getAPICommand_Repository()
	 * @see org.muml.pm.software.APIRepository#getApiCommands
	 * @model opposite="apiCommands" required="true" transient="false"
	 * @generated
	 */
	APIRepository getRepository();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.APICommand#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(APIRepository value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.software.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.Constraint#getApiCommand <em>Api Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The restraints that give restrictions on the usage of the API-command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.muml.pm.software.SoftwarePackage#getAPICommand_Constraints()
	 * @see org.muml.pm.software.Constraint#getApiCommand
	 * @model opposite="apiCommand" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // APICommand
