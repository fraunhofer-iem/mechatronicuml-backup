/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.SimulinkContainer#getModels <em>Models</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.SimulinkContainer#getLibraries <em>Libraries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getSimulinkContainer()
 * @model
 * @generated
 */
public interface SimulinkContainer extends Element {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.SimulinkModel}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.SimulinkModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getSimulinkContainer_Models()
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkModel#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<SimulinkModel> getModels();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.SimulinkLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getSimulinkContainer_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimulinkLibrary> getLibraries();

} // SimulinkContainer
