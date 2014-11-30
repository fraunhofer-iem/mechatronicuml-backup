/**
 */
package de.uni_paderborn.fujaba.muml.psm.apiexpressions;

import de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance;

import org.storydriven.core.expressions.Expression;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.apiexpressions.ContinuousPortExpression#getContinuousPort <em>Continuous Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.apiexpressions.ApiexpressionsPackage#getContinuousPortExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyInPortsAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyInPortsAllowed='self.continuousPort.portType.oclAsType(component::DirectedTypedPort).kind = component::PortDirectionKind::IN'"
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
	 * @see de.uni_paderborn.fujaba.muml.psm.apiexpressions.ApiexpressionsPackage#getContinuousPortExpression_ContinuousPort()
	 * @model required="true"
	 * @generated
	 */
	ContinuousPortInstance getContinuousPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.apiexpressions.ContinuousPortExpression#getContinuousPort <em>Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous Port</em>' reference.
	 * @see #getContinuousPort()
	 * @generated
	 */
	void setContinuousPort(ContinuousPortInstance value);

} // ContinuousPortExpression
