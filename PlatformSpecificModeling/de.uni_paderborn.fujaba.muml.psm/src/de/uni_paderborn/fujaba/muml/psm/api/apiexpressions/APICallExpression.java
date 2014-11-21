/**
 */
package de.uni_paderborn.fujaba.muml.psm.api.apiexpressions;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.swplatform.APICommand;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.APICallExpression#getApiCommand <em>Api Command</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.APICallExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsPackage#getAPICallExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ParameterBindingForEveryParameter'"
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
	 * @see de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsPackage#getAPICallExpression_ApiCommand()
	 * @model required="true"
	 * @generated
	 */
	APICommand getApiCommand();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.APICallExpression#getApiCommand <em>Api Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Command</em>' reference.
	 * @see #getApiCommand()
	 * @generated
	 */
	void setApiCommand(APICommand value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mapping where an actual parameter will be bound to a formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsPackage#getAPICallExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // APICallExpression
