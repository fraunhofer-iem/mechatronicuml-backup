/**
 */
package org.muml.pm.software.platform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An API-command can have a constraints that give restrictions on the usage of the API-command.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.pm.software.platform.Constraint#getApiCommand <em>Api Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.pm.software.platform.SwplatformPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Command</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.platform.APICommand#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The api-command to which this constraint belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Command</em>' container reference.
	 * @see #setApiCommand(APICommand)
	 * @see org.muml.pm.software.platform.SwplatformPackage#getConstraint_ApiCommand()
	 * @see org.muml.pm.software.platform.APICommand#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	APICommand getApiCommand();

	/**
	 * Sets the value of the '{@link org.muml.pm.software.platform.Constraint#getApiCommand <em>Api Command</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Command</em>' container reference.
	 * @see #getApiCommand()
	 * @generated
	 */
	void setApiCommand(APICommand value);

} // Constraint
