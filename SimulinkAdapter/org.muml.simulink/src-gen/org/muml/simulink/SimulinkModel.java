/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.SimulinkModel#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getSimulinkModel()
 * @model
 * @generated
 */
public interface SimulinkModel extends SimulinkFile {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.SimulinkContainer#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(SimulinkContainer)
	 * @see org.muml.simulink.SimulinkPackage#getSimulinkModel_Root()
	 * @see org.muml.simulink.SimulinkContainer#getModels
	 * @model opposite="models" transient="false"
	 * @generated
	 */
	SimulinkContainer getRoot();

	/**
	 * Sets the value of the '{@link org.muml.simulink.SimulinkModel#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(SimulinkContainer value);

} // SimulinkModel
