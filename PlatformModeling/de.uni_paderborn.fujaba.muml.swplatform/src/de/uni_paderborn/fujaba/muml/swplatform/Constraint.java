/**
 */
package de.uni_paderborn.fujaba.muml.swplatform;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.Constraint#getApiCommand <em>Api Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Command</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.swplatform.APICommand#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The api-command to which this constraint belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Command</em>' container reference.
	 * @see #setApiCommand(APICommand)
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getConstraint_ApiCommand()
	 * @see de.uni_paderborn.fujaba.muml.swplatform.APICommand#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	APICommand getApiCommand();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.swplatform.Constraint#getApiCommand <em>Api Command</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Command</em>' container reference.
	 * @see #getApiCommand()
	 * @generated
	 */
	void setApiCommand(APICommand value);

} // Constraint
