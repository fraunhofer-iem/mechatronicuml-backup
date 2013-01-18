/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.core.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PartDataType is used to type a parameter of a reconfiguration rule over a component part of a structured component. Then, only a component instance which is typed over the respective component part may be passed as a parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType#getComponentPart <em>Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getPartDataType()
 * @model
 * @generated
 */
public interface PartDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Part</em>' reference.
	 * @see #setComponentPart(ComponentPart)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getPartDataType_ComponentPart()
	 * @model required="true"
	 * @generated
	 */
	ComponentPart getComponentPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType#getComponentPart <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(ComponentPart value);

} // PartDataType
