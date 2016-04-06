/**
 */
package org.muml.cbs.dependencylanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.realtimestatechart.Clock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Reset Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies which Clocks should be reset, when the Condition or Event happens.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.ClockResetEffect#getClocks <em>Clocks</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getClockResetEffect()
 * @model
 * @generated
 */
public interface ClockResetEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clocks that shall be reset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clocks</em>' reference list.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getClockResetEffect_Clocks()
	 * @model required="true"
	 * @generated
	 */
	EList<Clock> getClocks();

} // ClockResetEffect
