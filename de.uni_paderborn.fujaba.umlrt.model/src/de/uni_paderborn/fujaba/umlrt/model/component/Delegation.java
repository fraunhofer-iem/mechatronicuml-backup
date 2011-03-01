/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation connector. A delegation connector connects a port of a structured component type and a port part of component part the structured component contains.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.Delegation#getComponentPart <em>Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDelegation()
 * @model
 * @generated
 */
public interface Delegation extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Component Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component part of the port part which is connected by this delegation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Part</em>' reference.
	 * @see #setComponentPart(ComponentPart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getDelegation_ComponentPart()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getDelegation
	 * @model opposite="delegation" required="true"
	 * @generated
	 */
	ComponentPart getComponentPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.Delegation#getComponentPart <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(ComponentPart value);

} // Delegation
