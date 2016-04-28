/**
 */
package org.muml.psm.apiexpressions;

import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.instance.ContinuousPortInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Port Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an expression, that contains a continuous port instance. In that way an api-command of an actuator can access the new value of the actuator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.apiexpressions.ContinuousPortExpression#getContinuousPort <em>Continuous Port</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getContinuousPortExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyInPortsAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyInPortsAllowed='-- Only Inport are allowed\nlet result :  Boolean = (self.continuousPort.portType.oclAsType(component::DirectedTypedPort).kind = component::PortDirectionKind::IN) in\nif ( result.oclIsUndefined()) \nthen \ntrue\nelse\nfalse\n endif'"
 * @generated
 */
public interface ContinuousPortExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The continuous port instance that belongs to the expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuous Port</em>' reference.
	 * @see #setContinuousPort(ContinuousPortInstance)
	 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#getContinuousPortExpression_ContinuousPort()
	 * @model required="true"
	 * @generated
	 */
	ContinuousPortInstance getContinuousPort();

	/**
	 * Sets the value of the '{@link org.muml.psm.apiexpressions.ContinuousPortExpression#getContinuousPort <em>Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous Port</em>' reference.
	 * @see #getContinuousPort()
	 * @generated
	 */
	void setContinuousPort(ContinuousPortInstance value);

} // ContinuousPortExpression
