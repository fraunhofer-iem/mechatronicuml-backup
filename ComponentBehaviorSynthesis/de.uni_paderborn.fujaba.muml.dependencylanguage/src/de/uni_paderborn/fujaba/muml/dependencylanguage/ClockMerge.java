/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It merges multiple clocks into one global.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.ClockMerge#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.ClockMerge#getClockName <em>Clock Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getClockMerge()
 * @model
 * @generated
 */
public interface ClockMerge extends Dependency {
	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clocks from different regions which are merged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clocks</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getClockMerge_Clocks()
	 * @model lower="2"
	 * @generated
	 */
	EList<Clock> getClocks();

	/**
	 * Returns the value of the '<em><b>Clock Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not specified the name of the first clock will be used for the global clock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Name</em>' attribute.
	 * @see #setClockName(String)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getClockMerge_ClockName()
	 * @model
	 * @generated
	 */
	String getClockName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.ClockMerge#getClockName <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Name</em>' attribute.
	 * @see #getClockName()
	 * @generated
	 */
	void setClockName(String value);

} // ClockMerge
