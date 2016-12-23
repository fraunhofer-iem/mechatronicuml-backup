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
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.Bus#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.Bus#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL busNeedsName='not self.name.oclIsUndefined() and self.name.size() > 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='busNeedsName'"
 * @generated
 */
public interface Bus extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.muml.simulink.SimulinkPackage#getBus_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.simulink.Bus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.simulink.BusElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.muml.simulink.SimulinkPackage#getBus_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusElement> getElements();

} // Bus
