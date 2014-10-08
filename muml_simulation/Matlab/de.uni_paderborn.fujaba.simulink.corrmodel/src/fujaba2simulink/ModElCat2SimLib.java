/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;

import de.uni_paderborn.fujaba.simulink.model.SimulinkLibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod El Cat2 Sim Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.ModElCat2SimLib#getModElCat <em>Mod El Cat</em>}</li>
 *   <li>{@link fujaba2simulink.ModElCat2SimLib#getSimLib <em>Sim Lib</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getModElCat2SimLib()
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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getModElCat2SimLib_ModElCat()
	 * @model
	 * @generated
	 */
	ModelElementCategory getModElCat();

	/**
	 * Sets the value of the '{@link fujaba2simulink.ModElCat2SimLib#getModElCat <em>Mod El Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod El Cat</em>' reference.
	 * @see #getModElCat()
	 * @generated
	 */
	void setModElCat(ModelElementCategory value);

	/**
	 * Returns the value of the '<em><b>Sim Lib</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.SimulinkLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Lib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Lib</em>' reference list.
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getModElCat2SimLib_SimLib()
	 * @model
	 * @generated
	 */
	EList<SimulinkLibrary> getSimLib();

} // ModElCat2SimLib
