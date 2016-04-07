/**
 */
package org.muml.simulink.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.simulink.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fading Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.reconfiguration.FadingComponent#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.reconfiguration.ReconfigurationPackage#getFadingComponent()
 * @model
 * @generated
 */
public interface FadingComponent extends Block {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute list.
	 * @see org.muml.simulink.reconfiguration.ReconfigurationPackage#getFadingComponent_Time()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getTime();

} // FadingComponent
