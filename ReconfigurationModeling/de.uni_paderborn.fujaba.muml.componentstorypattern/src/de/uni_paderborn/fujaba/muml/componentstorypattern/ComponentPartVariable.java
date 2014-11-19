/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Part Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable#getTriggerEmbeddedComponentExpressions <em>Trigger Embedded Component Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentPartVariable()
 * @model annotation="http://www.muml.org/emf/OCLFilter choices='let \r\n\tcomponent : component::StructuredComponent = self.eContainer().oclAsType(ComponentVariable).type.oclAsType(component::StructuredComponent)\r\nin\r\n\tcomponent.embeddedComponentParts->select(p | not p.componentType.oclIsTypeOf(reconfiguration::FadingComponent))' feature='dataType'"
 * @generated
 */
public interface ComponentPartVariable extends PartVariable {
	/**
	 * Returns the value of the '<em><b>Trigger Embedded Component Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Embedded Component Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Embedded Component Expressions</em>' containment reference.
	 * @see #setTriggerEmbeddedComponentExpressions(TriggerEmbeddedComponentExpression)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentPartVariable_TriggerEmbeddedComponentExpressions()
	 * @model containment="true"
	 * @generated
	 */
	TriggerEmbeddedComponentExpression getTriggerEmbeddedComponentExpressions();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentPartVariable#getTriggerEmbeddedComponentExpressions <em>Trigger Embedded Component Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Embedded Component Expressions</em>' containment reference.
	 * @see #getTriggerEmbeddedComponentExpressions()
	 * @generated
	 */
	void setTriggerEmbeddedComponentExpressions(TriggerEmbeddedComponentExpression value);

} // ComponentPartVariable
