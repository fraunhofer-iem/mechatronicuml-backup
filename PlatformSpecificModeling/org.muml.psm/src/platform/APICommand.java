/**
 */
package platform;

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
 *   <li>{@link platform.APICommand#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link platform.APICommand#getParameters <em>Parameters</em>}</li>
 *   <li>{@link platform.APICommand#getRepository <em>Repository</em>}</li>
 *   <li>{@link platform.APICommand#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see platform.PlatformPackage#getAPICommand()
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
	 * @see platform.PlatformPackage#getAPICommand_ReturnDataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturnDataType();

	/**
	 * Sets the value of the '{@link platform.APICommand#getReturnDataType <em>Return Data Type</em>}' reference.
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
	 * @see platform.PlatformPackage#getAPICommand_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link platform.APIRepository#getApiCommands <em>Api Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repository to which this api-command belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(APIRepository)
	 * @see platform.PlatformPackage#getAPICommand_Repository()
	 * @see platform.APIRepository#getApiCommands
	 * @model opposite="apiCommands" required="true" transient="false"
	 * @generated
	 */
	APIRepository getRepository();

	/**
	 * Sets the value of the '{@link platform.APICommand#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(APIRepository value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link platform.Constraint}.
	 * It is bidirectional and its opposite is '{@link platform.Constraint#getApiCommand <em>Api Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The restraints that give restrictions on the usage of the API-command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see platform.PlatformPackage#getAPICommand_Constraints()
	 * @see platform.Constraint#getApiCommand
	 * @model opposite="apiCommand" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // APICommand
