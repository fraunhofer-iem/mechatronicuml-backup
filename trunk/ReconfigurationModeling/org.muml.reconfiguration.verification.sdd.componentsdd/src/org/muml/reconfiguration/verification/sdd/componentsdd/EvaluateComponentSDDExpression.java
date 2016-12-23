/**
 */
package org.muml.reconfiguration.verification.sdd.componentsdd;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.reconfiguration.componentstorypattern.TriggerEmbeddedComponentExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate Component SDD Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getComponentSDD <em>Component SDD</em>}</li>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage#getEvaluateComponentSDDExpression()
 * @model
 * @generated
 */
public interface EvaluateComponentSDDExpression extends TriggerEmbeddedComponentExpression {
	/**
	 * Returns the value of the '<em><b>Component SDD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component SDD</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component SDD</em>' reference.
	 * @see #setComponentSDD(ComponentStoryDecisionDiagram)
	 * @see org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage#getEvaluateComponentSDDExpression_ComponentSDD()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter choices='let\r\n\tcategory : modelinstance::ModelElementCategory =self.eContainer()->closure(eContainer())->select(oclIsTypeOf(modelinstance::ModelElementCategory))->any(true).oclAsType(modelinstance::ModelElementCategory),\r\n\tcsdds : Collection(core::ExtendableElement) = category.modelElements->select(oclIsTypeOf(componentsdd::ComponentStoryDecisionDiagram))\r\nin\r\n\tcsdds->select(csdd | csdd.oclAsType(componentsdd::ComponentStoryDecisionDiagram).reconfigurableComponent = self.eContainer().oclAsType(componentstorypattern::ComponentPartVariable).componentPartType.componentType)'"
	 * @generated
	 */
	ComponentStoryDecisionDiagram getComponentSDD();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getComponentSDD <em>Component SDD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component SDD</em>' reference.
	 * @see #getComponentSDD()
	 * @generated
	 */
	void setComponentSDD(ComponentStoryDecisionDiagram value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage#getEvaluateComponentSDDExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // EvaluateComponentSDDExpression
