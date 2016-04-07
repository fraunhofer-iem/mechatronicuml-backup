/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.BusCreator#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getBusCreator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneOutPort'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneOutPort='self.outPorts->size() = 1'"
 * @generated
 */
public interface BusCreator extends Block {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see org.muml.simulink.SimulinkPackage#getBusCreator_Bus()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.outgoingLines->first().bus'"
	 * @generated
	 */
	Bus getBus();

} // BusCreator
