/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPartVariable()
 * @model
 * @generated
 */
public interface PartVariable extends ComponentStoryPatternVariable {
	/**
	 * Returns the value of the '<em><b>Port Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variables</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPartVariable_PortVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortVariable> getPortVariables();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPartVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	ComponentPart getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' reference.
	 * @see #setCall(Call)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getPartVariable_Call()
	 * @model
	 * @generated
	 */
	Call getCall();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable#getCall <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(Call value);

} // PartVariable
