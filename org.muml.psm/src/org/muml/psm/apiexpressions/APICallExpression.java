/**
 */
package org.muml.psm.apiexpressions;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pm.software.APICommand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an api call. It has an actual parameter for each formal parameter of an api-command. Inside an actual parameter a concrete value will be mapped to the formal parameters of an api-command from the swplatform-package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.apiexpressions.APICallExpression#getApiCommand <em>Api Command</em>}</li>
 *   <li>{@link org.muml.psm.apiexpressions.APICallExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getAPICallExpression()
 * @model
 * @generated
 */
public interface APICallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Api Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The APICommand to which this expression belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Command</em>' reference.
	 * @see #setApiCommand(APICommand)
	 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getAPICallExpression_ApiCommand()
	 * @model required="true"
	 * @generated
	 */
	APICommand getApiCommand();

	/**
	 * Sets the value of the '{@link org.muml.psm.apiexpressions.APICallExpression#getApiCommand <em>Api Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Command</em>' reference.
	 * @see #getApiCommand()
	 * @generated
	 */
	void setApiCommand(APICommand value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mapping where an actual parameter will be bound to a formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getAPICallExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // APICallExpression
