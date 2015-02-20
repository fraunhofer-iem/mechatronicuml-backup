/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.BusSelector#getBus <em>Bus</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBusSelector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneInPort='self.inPorts->size() = 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneInPort'"
 * @generated
 */
public interface BusSelector extends Block {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getBusSelector_Bus()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.incomingLines->first().bus'"
	 * @generated
	 */
	Bus getBus();

} // BusSelector
