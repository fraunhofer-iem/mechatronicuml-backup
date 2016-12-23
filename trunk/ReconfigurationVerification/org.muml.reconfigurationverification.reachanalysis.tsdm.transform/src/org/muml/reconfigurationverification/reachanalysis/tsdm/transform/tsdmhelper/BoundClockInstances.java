/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Clock Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances#getClockInstances <em>Clock Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage#getBoundClockInstances()
 * @model
 * @generated
 */
public interface BoundClockInstances extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Instances</em>' reference list.
	 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage#getBoundClockInstances_ClockInstances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClockInstance> getClockInstances();

} // BoundClockInstances
