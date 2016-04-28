/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.behavior;

import org.muml.mumlcore.ExtendableElement;
import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter binding associates a parameter with a concrete value which is bound to this parameter by an invocation. As an example, an operation defines a set of parameters. A call of this operation needs to provide concrete values for the parameters which are defined by a parameter binding. The value is represented by an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.behavior.ParameterBinding#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.muml.pim.behavior.ParameterBinding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.behavior.BehaviorPackage#getParameterBinding()
 * @model
 * @generated
 */
public interface ParameterBinding extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mandatory parameter to which the value needs to be associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.muml.pim.behavior.BehaviorPackage#getParameterBinding_Parameter()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter filter='if(self.eContainer().oclIsTypeOf(realtimestatechart::Message)) then self.eContainer().oclAsType(realtimestatechart::Message).instanceOf.parameters else (\r\nif(self.eContainer().oclIsTypeOf(pattern::VerifiedConfiguration)) then self.eContainer().oclAsType(pattern::VerifiedConfiguration).coordinationPattern.patternParameters else behavior::Parameter.allInstances() endif)endif'"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.muml.pim.behavior.ParameterBinding#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mandatory value which is associated with the parameter. The value is defined by an expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.muml.pim.behavior.BehaviorPackage#getParameterBinding_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.muml.pim.behavior.ParameterBinding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // ParameterBinding
