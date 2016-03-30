/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an absolute deadline. It is always associated with a transition of the statechart. The deadline depends on the value of a certain clock.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline()
 * @model
 * @generated
 */
public interface AbsoluteDeadline extends Deadline {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the references clock of the absolute deadline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

} // AbsoluteDeadline
