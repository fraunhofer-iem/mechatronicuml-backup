/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.muml.mumlcore.modelinstance.ModelElementCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inst Config2 Sim Mod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.InstConfig2SimMod#getModelElementCategory <em>Model Element Category</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getInstConfig2SimMod()
 * @model
 * @generated
 */
public interface InstConfig2SimMod extends AbstractContainerCorrespondenceNode, CompInstConfig2SubSys {
	/**
	 * Returns the value of the '<em><b>Model Element Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element Category</em>' reference.
	 * @see #setModelElementCategory(ModelElementCategory)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getInstConfig2SimMod_ModelElementCategory()
	 * @model
	 * @generated
	 */
	ModelElementCategory getModelElementCategory();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.InstConfig2SimMod#getModelElementCategory <em>Model Element Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Category</em>' reference.
	 * @see #getModelElementCategory()
	 * @generated
	 */
	void setModelElementCategory(ModelElementCategory value);

} // InstConfig2SimMod
