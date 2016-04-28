/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.eclipse.emf.common.util.EList;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.simulink.SimulinkLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod El Cat2 Sim Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getModElCat <em>Mod El Cat</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getSimLib <em>Sim Lib</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getModElCat2SimLib()
 * @model
 * @generated
 */
public interface ModElCat2SimLib extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Mod El Cat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod El Cat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod El Cat</em>' reference.
	 * @see #setModElCat(ModelElementCategory)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getModElCat2SimLib_ModElCat()
	 * @model
	 * @generated
	 */
	ModelElementCategory getModElCat();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.ModElCat2SimLib#getModElCat <em>Mod El Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod El Cat</em>' reference.
	 * @see #getModElCat()
	 * @generated
	 */
	void setModElCat(ModelElementCategory value);

	/**
	 * Returns the value of the '<em><b>Sim Lib</b></em>' reference list.
	 * The list contents are of type {@link org.muml.simulink.SimulinkLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Lib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Lib</em>' reference list.
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getModElCat2SimLib_SimLib()
	 * @model
	 * @generated
	 */
	EList<SimulinkLibrary> getSimLib();

} // ModElCat2SimLib
