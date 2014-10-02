/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd;

import de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate Component SDD Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getComponentSDD <em>Component SDD</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#getEvaluateComponentSDDExpression()
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
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#getEvaluateComponentSDDExpression_ComponentSDD()
	 * @model required="true"
	 * @generated
	 */
	ComponentStoryDecisionDiagram getComponentSDD();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression#getComponentSDD <em>Component SDD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component SDD</em>' reference.
	 * @see #getComponentSDD()
	 * @generated
	 */
	void setComponentSDD(ComponentStoryDecisionDiagram value);

} // EvaluateComponentSDDExpression
