/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper;

import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Clock Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.BoundClockInstances#getClockInstances <em>Clock Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.TsdmhelperPackage#getBoundClockInstances()
 * @model
 * @generated
 */
public interface BoundClockInstances extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reachanalysis.tsdm.tsdmhelper.TsdmhelperPackage#getBoundClockInstances_ClockInstances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClockInstance> getClockInstances();

} // BoundClockInstances
