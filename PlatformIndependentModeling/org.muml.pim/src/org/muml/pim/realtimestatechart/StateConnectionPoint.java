/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Connection Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectionPoint is a pseudostate which makes it possible to chain transitions between different hierarchy levels. The ConnectionPoint is assigned to a state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.StateConnectionPoint#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getStateConnectionPoint()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectionPointsOnlyAtCompositeStates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ConnectionPointsOnlyAtCompositeStates='-- State connection points are only allowed at composite (non-simple) states\nnot self.state.oclIsUndefined() implies not self.state.simple'"
 * @generated
 */
public interface StateConnectionPoint extends Vertex {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.State#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateEntryPoint is assigned to a state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getStateConnectionPoint_State()
	 * @see org.muml.pim.realtimestatechart.State#getConnectionPoints
	 * @model opposite="connectionPoints" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.StateConnectionPoint#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // StateConnectionPoint
