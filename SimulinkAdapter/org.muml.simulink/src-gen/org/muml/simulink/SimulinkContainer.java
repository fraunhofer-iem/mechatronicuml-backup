/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.SimulinkContainer#getModels <em>Models</em>}</li>
 *   <li>{@link org.muml.simulink.SimulinkContainer#getLibraries <em>Libraries</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getSimulinkContainer()
 * @model
 * @generated
 */
public interface SimulinkContainer extends Element {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.SimulinkModel}.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.SimulinkModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getSimulinkContainer_Models()
	 * @see org.muml.simulink.SimulinkModel#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<SimulinkModel> getModels();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.SimulinkLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getSimulinkContainer_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimulinkLibrary> getLibraries();

} // SimulinkContainer
