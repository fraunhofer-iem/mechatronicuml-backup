/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.BusCreator#getBus <em>Bus</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBusCreator()
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
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBusCreator_Bus()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.outgoingLines->first().bus'"
	 * @generated
	 */
	Bus getBus();

} // BusCreator
