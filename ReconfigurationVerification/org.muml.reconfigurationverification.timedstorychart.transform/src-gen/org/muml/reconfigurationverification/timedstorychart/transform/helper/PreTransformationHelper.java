/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Transformation Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.PreTransformationHelper#getRtscs <em>Rtscs</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage#getPreTransformationHelper()
 * @model
 * @generated
 */
public interface PreTransformationHelper extends EObject {
	/**
	 * Returns the value of the '<em><b>Rtscs</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.realtimestatechart.RealtimeStatechart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtscs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtscs</em>' reference list.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage#getPreTransformationHelper_Rtscs()
	 * @model
	 * @generated
	 */
	EList<RealtimeStatechart> getRtscs();

} // PreTransformationHelper
